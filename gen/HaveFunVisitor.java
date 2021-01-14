package gen;// Generated from C:/Users/Anna Dalla Vecchia/OneDrive - Universit� degli Studi di Verona/LINGUAGGI/LAB/PROGETTO/have_fun/src\HaveFun.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaveFunParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaveFunVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaveFunParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HaveFunParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaveFunParser#fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun(HaveFunParser.FunContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(HaveFunParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(HaveFunParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(HaveFunParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seq}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(HaveFunParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HaveFunParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code out}
	 * labeled alternative in {@link HaveFunParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(HaveFunParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nat}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNat(HaveFunParser.NatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divMulMod}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivMulMod(HaveFunParser.DivMulModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(HaveFunParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(HaveFunParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(HaveFunParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(HaveFunParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpExp(HaveFunParser.CmpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExp(HaveFunParser.LogicExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExp}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(HaveFunParser.ParExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(HaveFunParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(HaveFunParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link HaveFunParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(HaveFunParser.IdContext ctx);
}