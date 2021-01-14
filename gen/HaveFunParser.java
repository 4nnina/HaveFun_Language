package gen;// Generated from C:/Users/Anna Dalla Vecchia/OneDrive - Universit� degli Studi di Verona/LINGUAGGI/LAB/PROGETTO/have_fun/src\HaveFun.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaveFunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POW=8, AND=9, OR=10, 
		EQQ=11, NEQ=12, LEQ=13, GEQ=14, LT=15, GT=16, NOT=17, IF=18, THEN=19, 
		ELSE=20, WHILE=21, SKIPP=22, ASSIGN=23, OUT=24, FUN=25, RET=26, LPAR=27, 
		RPAR=28, LBRACE=29, RBRACE=30, SEMICOLON=31, COMMA=32, ID=33, COMMENT=34, 
		LINE_COMMENT=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_fun = 1, RULE_com = 2, RULE_exp = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "fun", "com", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "'out'", "'fun'", "'return'", "'('", 
			"')'", "'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "OUT", "FUN", "RET", "LPAR", "RPAR", "LBRACE", 
			"RBRACE", "SEMICOLON", "COMMA", "ID", "COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HaveFun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaveFunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HaveFunParser.EOF, 0); }
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(8);
				fun();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
			com(0);
			setState(15);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(HaveFunParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(HaveFunParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HaveFunParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunParser.LBRACE, 0); }
		public TerminalNode RET() { return getToken(HaveFunParser.RET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunParser.RBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HaveFunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaveFunParser.COMMA, i);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(FUN);
			setState(18);
			match(ID);
			setState(19);
			match(LPAR);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(20);
				match(ID);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(21);
					match(COMMA);
					setState(22);
					match(ID);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(RPAR);
			setState(34);
			match(LBRACE);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SKIPP) | (1L << OUT) | (1L << ID))) != 0)) {
				{
				setState(35);
				com(0);
				setState(36);
				match(SEMICOLON);
				}
			}

			setState(40);
			match(RET);
			setState(41);
			exp(0);
			setState(42);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SkipContext extends ComContext {
		public TerminalNode SKIPP() { return getToken(HaveFunParser.SKIPP, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ComContext {
		public TerminalNode WHILE() { return getToken(HaveFunParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(HaveFunParser.LBRACE, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(HaveFunParser.RBRACE, 0); }
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(HaveFunParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public TerminalNode THEN() { return getToken(HaveFunParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(HaveFunParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HaveFunParser.LBRACE, i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HaveFunParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HaveFunParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(HaveFunParser.ELSE, 0); }
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqContext extends ComContext {
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(HaveFunParser.SEMICOLON, 0); }
		public SeqContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ComContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HaveFunParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutContext extends ComContext {
		public TerminalNode OUT() { return getToken(HaveFunParser.OUT, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public OutContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		return com(0);
	}

	private ComContext com(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComContext _localctx = new ComContext(_ctx, _parentState);
		ComContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_com, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45);
				match(IF);
				setState(46);
				match(LPAR);
				setState(47);
				exp(0);
				setState(48);
				match(RPAR);
				setState(49);
				match(THEN);
				setState(50);
				match(LBRACE);
				setState(51);
				com(0);
				setState(52);
				match(RBRACE);
				setState(53);
				match(ELSE);
				setState(54);
				match(LBRACE);
				setState(55);
				com(0);
				setState(56);
				match(RBRACE);
				}
				break;
			case ID:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				exp(0);
				}
				break;
			case SKIPP:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(SKIPP);
				}
				break;
			case WHILE:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(WHILE);
				setState(63);
				match(LPAR);
				setState(64);
				exp(0);
				setState(65);
				match(RPAR);
				setState(66);
				match(LBRACE);
				setState(67);
				com(0);
				setState(68);
				match(RBRACE);
				}
				break;
			case OUT:
				{
				_localctx = new OutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(OUT);
				setState(71);
				match(LPAR);
				setState(72);
				exp(0);
				setState(73);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SeqContext(new ComContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_com);
					setState(77);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(78);
					match(SEMICOLON);
					setState(79);
					com(4);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NatContext extends ExpContext {
		public TerminalNode NAT() { return getToken(HaveFunParser.NAT, 0); }
		public NatContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitNat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivMulModContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HaveFunParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(HaveFunParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(HaveFunParser.MOD, 0); }
		public DivMulModContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitDivMulMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(HaveFunParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(HaveFunParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HaveFunParser.MINUS, 0); }
		public PlusMinusContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQQ() { return getToken(HaveFunParser.EQQ, 0); }
		public TerminalNode NEQ() { return getToken(HaveFunParser.NEQ, 0); }
		public EqExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpContext {
		public TerminalNode BOOL() { return getToken(HaveFunParser.BOOL, 0); }
		public BoolContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LT() { return getToken(HaveFunParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(HaveFunParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(HaveFunParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(HaveFunParser.GT, 0); }
		public CmpExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitCmpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicExpContext extends ExpContext {
		public Token op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(HaveFunParser.AND, 0); }
		public TerminalNode OR() { return getToken(HaveFunParser.OR, 0); }
		public LogicExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitLogicExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpContext extends ExpContext {
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(HaveFunParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(HaveFunParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HaveFunParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HaveFunParser.COMMA, i);
		}
		public FunctionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(HaveFunParser.POW, 0); }
		public PowContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(HaveFunParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaveFunVisitor ) return ((HaveFunVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(NAT);
				}
				break;
			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(BOOL);
				}
				break;
			case 3:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(LPAR);
				setState(89);
				exp(0);
				setState(90);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(NOT);
				setState(93);
				exp(8);
				}
				break;
			case 5:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				match(ID);
				setState(95);
				match(LPAR);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAT) | (1L << BOOL) | (1L << NOT) | (1L << LPAR) | (1L << ID))) != 0)) {
					{
					setState(96);
					exp(0);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(97);
						match(COMMA);
						setState(98);
						exp(0);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(106);
				match(RPAR);
				}
				break;
			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(110);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(111);
						match(POW);
						setState(112);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new DivMulModContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(113);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(114);
						((DivMulModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((DivMulModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						exp(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(116);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(117);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						exp(7);
						}
						break;
					case 4:
						{
						_localctx = new CmpExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						((CmpExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << GEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((CmpExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						exp(6);
						}
						break;
					case 5:
						{
						_localctx = new EqExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						((EqExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQQ || _la==NEQ) ) {
							((EqExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						exp(5);
						}
						break;
					case 6:
						{
						_localctx = new LogicExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						((LogicExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogicExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						exp(4);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return com_sempred((ComContext)_localctx, predIndex);
		case 3:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean com_sempred(ComContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\7\3\37\n\3\f\3\16\3\""+
		"\13\3\3\3\3\3\3\3\3\3\3\3\5\3)\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4\3\4\7\4S\n\4\f\4\16"+
		"\4V\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5f"+
		"\n\5\f\5\16\5i\13\5\5\5k\n\5\3\5\3\5\5\5o\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0083\n\5\f\5\16"+
		"\5\u0086\13\5\3\5\2\4\6\b\6\2\4\6\b\2\7\3\2\7\t\3\2\5\6\3\2\17\22\3\2"+
		"\r\16\3\2\13\f\2\u0099\2\r\3\2\2\2\4\23\3\2\2\2\6M\3\2\2\2\bn\3\2\2\2"+
		"\n\f\5\4\3\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\20"+
		"\3\2\2\2\17\r\3\2\2\2\20\21\5\6\4\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7"+
		"\33\2\2\24\25\7#\2\2\25 \7\35\2\2\26\33\7#\2\2\27\30\7\"\2\2\30\32\7#"+
		"\2\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\37\3\2"+
		"\2\2\35\33\3\2\2\2\36\26\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#"+
		"\3\2\2\2\" \3\2\2\2#$\7\36\2\2$(\7\37\2\2%&\5\6\4\2&\'\7!\2\2\')\3\2\2"+
		"\2(%\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\34\2\2+,\5\b\5\2,-\7 \2\2-\5\3\2"+
		"\2\2./\b\4\1\2/\60\7\24\2\2\60\61\7\35\2\2\61\62\5\b\5\2\62\63\7\36\2"+
		"\2\63\64\7\25\2\2\64\65\7\37\2\2\65\66\5\6\4\2\66\67\7 \2\2\678\7\26\2"+
		"\289\7\37\2\29:\5\6\4\2:;\7 \2\2;N\3\2\2\2<=\7#\2\2=>\7\31\2\2>N\5\b\5"+
		"\2?N\7\30\2\2@A\7\27\2\2AB\7\35\2\2BC\5\b\5\2CD\7\36\2\2DE\7\37\2\2EF"+
		"\5\6\4\2FG\7 \2\2GN\3\2\2\2HI\7\32\2\2IJ\7\35\2\2JK\5\b\5\2KL\7\36\2\2"+
		"LN\3\2\2\2M.\3\2\2\2M<\3\2\2\2M?\3\2\2\2M@\3\2\2\2MH\3\2\2\2NT\3\2\2\2"+
		"OP\f\5\2\2PQ\7!\2\2QS\5\6\4\6RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2"+
		"U\7\3\2\2\2VT\3\2\2\2WX\b\5\1\2Xo\7\3\2\2Yo\7\4\2\2Z[\7\35\2\2[\\\5\b"+
		"\5\2\\]\7\36\2\2]o\3\2\2\2^_\7\23\2\2_o\5\b\5\n`a\7#\2\2aj\7\35\2\2bg"+
		"\5\b\5\2cd\7\"\2\2df\5\b\5\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h"+
		"k\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2kl\3\2\2\2lo\7\36\2\2mo\7#\2\2"+
		"nW\3\2\2\2nY\3\2\2\2nZ\3\2\2\2n^\3\2\2\2n`\3\2\2\2nm\3\2\2\2o\u0084\3"+
		"\2\2\2pq\f\13\2\2qr\7\n\2\2r\u0083\5\b\5\13st\f\t\2\2tu\t\2\2\2u\u0083"+
		"\5\b\5\nvw\f\b\2\2wx\t\3\2\2x\u0083\5\b\5\tyz\f\7\2\2z{\t\4\2\2{\u0083"+
		"\5\b\5\b|}\f\6\2\2}~\t\5\2\2~\u0083\5\b\5\7\177\u0080\f\5\2\2\u0080\u0081"+
		"\t\6\2\2\u0081\u0083\5\b\5\6\u0082p\3\2\2\2\u0082s\3\2\2\2\u0082v\3\2"+
		"\2\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\t\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\r\r\33 (MTgjn\u0082\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}