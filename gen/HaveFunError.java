package gen;

public class HaveFunError {
    private HaveFunError(){}

    public static void ParamAlreadyDeclared(HaveFunParser.FunContext ctx, String p){
        System.err.println("Parameter name " + p + " clashes with previous parameters");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
    }

    public static void FunAlreadyExist(HaveFunParser.FunContext ctx, String f){
        System.err.println("Fun " + f + " already defined");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
    }

    public static void NatMismatch(HaveFunParser.ExpContext ctx){
        System.err.println("Type mismatch exception!");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.err.println(ctx.getText());
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.err.println("> Natural expression expected.");
        System.exit(1);
    }

    public static void BoolMismatch(HaveFunParser.ExpContext ctx) {
        System.err.println("Type mismatch exception!");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.err.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        System.err.println(ctx.getText());
        System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.err.println("> Boolean expression expected.");
        System.exit(1);
    }

    public static void VarUndeclared(HaveFunParser.IdContext ctx, String v){
        System.err.println("Variable " + v + " used but never instantiated");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
    }

    public static void FunUndeclared(HaveFunParser.FunctionContext ctx, String f){
        System.err.println("Function " + f + " used but never declared");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
    }

    public static void WrongNumArg(HaveFunParser.FunctionContext ctx, String f) {
        System.err.println("Function " + f + " called with the wrong number of arguments");
        System.err.println("@" + ctx.start.getLine() + ":" + ctx.start.getCharPositionInLine());
        System.exit(1);
    }
}
