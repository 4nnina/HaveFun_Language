package gen;

import org.antlr.v4.runtime.tree.TerminalNode;
import value.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IntHaveFun extends HaveFunBaseVisitor<Value> {

    private final LinkedList<Conf> var;                             //variables
    private final Set<FunValue> function = new HashSet<>();         //all function declared and valid

    public IntHaveFun() {
        var = new LinkedList<>();
        var.add(new Conf());
    }

    @Override
    public ComValue visitProg(HaveFunParser.ProgContext ctx) {
        for(HaveFunParser.FunContext f : ctx.fun())
            visit(f);
        return visitCom(ctx.com());
    }

    @Override
    public ComValue visitFun(HaveFunParser.FunContext ctx) {
        List<TerminalNode> variable = ctx.ID();
        String id = variable.get(0).getText();          //save function name
        variable.remove(0);                       //remove function name from list

        Set<String> parameters = new HashSet<>();

        if(!variable.isEmpty()){
            for (TerminalNode p:variable) {
                //fails if the parameter p is already declared
                if (!parameters.add(p.getText())) {
                    HaveFunError.ParamAlreadyDeclared(ctx,p.toString());
                }
            }
        }

        FunValue newFun = new FunValue(id, parameters, ctx.com(), ctx.exp());
        //fails if there is a function with the same name
        if(!function.add(newFun)) {
            HaveFunError.FunAlreadyExist(ctx,id);
        }

        return ComValue.INSTANCE;
    }

    private ComValue visitCom(HaveFunParser.ComContext ctx) {
        return (ComValue) visit(ctx);
    }


    private ExpValue<?> visitExp(HaveFunParser.ExpContext ctx) {
        return (ExpValue<?>) visit(ctx);
    }

    private int visitNatExp(HaveFunParser.ExpContext ctx) {
        try {
            return ((NatValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {
            HaveFunError.NatMismatch(ctx);
        }

        return 0; // unreachable code
    }

    private boolean visitBoolExp(HaveFunParser.ExpContext ctx) {
        try {
            return ((BoolValue) visitExp(ctx)).toJavaValue();
        } catch (ClassCastException e) {

            HaveFunError.BoolMismatch(ctx);
        }

        return false; // unreachable code
    }

    @Override
    public ComValue visitIf(HaveFunParser.IfContext ctx) {
        return visitBoolExp(ctx.exp())
                ? visitCom(ctx.com(0))
                : visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitAssign(HaveFunParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        ExpValue<?> v = visitExp(ctx.exp());

        var.getLast().update(id, v);
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSkip(HaveFunParser.SkipContext ctx) {
        return ComValue.INSTANCE;
    }

    @Override
    public ComValue visitSeq(HaveFunParser.SeqContext ctx) {
        visitCom(ctx.com(0));
        return visitCom(ctx.com(1));
    }

    @Override
    public ComValue visitWhile(HaveFunParser.WhileContext ctx) {
        if (!visitBoolExp(ctx.exp()))
            return ComValue.INSTANCE;

        visitCom(ctx.com());

        return visitWhile(ctx);
    }

    @Override
    public ComValue visitOut(HaveFunParser.OutContext ctx) {
        System.out.println(visitExp(ctx.exp()));
        return ComValue.INSTANCE;
    }

    @Override
    public NatValue visitNat(HaveFunParser.NatContext ctx) {
        return new NatValue(Integer.parseInt(ctx.NAT().getText()));
    }

    @Override
    public BoolValue visitBool(HaveFunParser.BoolContext ctx) {
        return new BoolValue(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public ExpValue<?> visitParExp(HaveFunParser.ParExpContext ctx) {
        return visitExp(ctx.exp());
    }

    @Override
    public NatValue visitPow(HaveFunParser.PowContext ctx) {
        int base = visitNatExp(ctx.exp(0));
        int exp = visitNatExp(ctx.exp(1));

        return new NatValue((int) Math.pow(base, exp));
    }

    @Override
    public BoolValue visitNot(HaveFunParser.NotContext ctx) {
        return new BoolValue(!visitBoolExp(ctx.exp()));
    }

    @Override
    public NatValue visitDivMulMod(HaveFunParser.DivMulModContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.DIV -> new NatValue(left / right);
            case HaveFunParser.MUL -> new NatValue(left * right);
            case HaveFunParser.MOD -> new NatValue(left % right);
            default -> null;
        };
    }

    @Override
    public NatValue visitPlusMinus(HaveFunParser.PlusMinusContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.PLUS -> new NatValue(left + right);
            case HaveFunParser.MINUS -> new NatValue(Math.max(left - right, 0));
            default -> null;
        };
    }

    @Override
    public BoolValue visitEqExp(HaveFunParser.EqExpContext ctx) {
        ExpValue<?> left = visitExp(ctx.exp(0));
        ExpValue<?> right = visitExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.EQQ -> new BoolValue(left.equals(right));
            case HaveFunParser.NEQ -> new BoolValue(!left.equals(right));
            default -> null; // unreachable code
        };
    }

    @Override
    public ExpValue<?> visitId(HaveFunParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (!var.getLast().contains(id)) {
            HaveFunError.VarUndeclared(ctx,id);
        }

        return var.getLast().get(id);
    }

    @Override
    public BoolValue visitCmpExp(HaveFunParser.CmpExpContext ctx) {
        int left = visitNatExp(ctx.exp(0));
        int right = visitNatExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.GEQ -> new BoolValue(left >= right);
            case HaveFunParser.LEQ -> new BoolValue(left <= right);
            case HaveFunParser.LT  -> new BoolValue(left < right);
            case HaveFunParser.GT  -> new BoolValue(left > right);
            default -> null;
        };
    }

    @Override
    public BoolValue visitLogicExp(HaveFunParser.LogicExpContext ctx) {
        boolean left = visitBoolExp(ctx.exp(0));
        boolean right = visitBoolExp(ctx.exp(1));

        return switch (ctx.op.getType()) {
            case HaveFunParser.AND -> new BoolValue(left && right);
            case HaveFunParser.OR -> new BoolValue(left || right);
            default -> null;
        };
    }

    @Override
    public ExpValue<?> visitFunction(HaveFunParser.FunctionContext ctx) {
        String fun = ctx.ID().getText();        //function id

        List<HaveFunParser.ExpContext> par = ctx.exp();     //actual parameters

        for (FunValue f:function) {
            //search function in the set
            if(f.getName().equals(fun)){
                if(par.size() != f.getNumParam()){
                    HaveFunError.WrongNumArg(ctx,fun);
                }

                Conf memFunction = new Conf();      //function memory
                int i=0;
                for (String id:f.getParameters()) {
                    memFunction.update(id, visitExp(par.get(i)));       //match actual and formal parameters
                    i++;
                }

                var.add(memFunction);
                HaveFunParser.ComContext com = f.getCom();
                if(com != null)
                    visitCom(com);
                ExpValue<?> returnVal = visitExp(f.getRet());
                var.removeLast();               //delete memFunction

                return returnVal;
            }
        }

        //function fun never declared
        HaveFunError.FunUndeclared(ctx,fun);

        return null;        //unreachable code
    }
}
