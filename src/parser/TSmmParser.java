// Generated from C:/Users/Adria/Desktop/DLP/practica/proyecto_DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, WHITES=40, LINE_COMMENT=41, BLOCK_COMMENT=42, INT_CONSTANT=43, 
		REAL_CONSTANT=44, CHAR_CONSTANT=45, ID=46;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_definition = 3, 
		RULE_varDefinition = 4, RULE_functionDefinition = 5, RULE_main = 6, RULE_body = 7, 
		RULE_type = 8, RULE_simpleType = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "definition", "varDefinition", 
			"functionDefinition", "main", "body", "type", "simpleType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'as'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'&&'", 
			"'||'", "','", "'='", "';'", "'while'", "'if'", "'else'", "'input'", 
			"'log'", "'return'", "'let'", "':'", "'function'", "'{'", "'}'", "'main'", 
			"'void'", "'int'", "'char'", "'number'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "WHITES", "LINE_COMMENT", "BLOCK_COMMENT", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "ID"
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
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					definition();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			main();
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(30);
				match(T__0);
				setState(31);
				expression(0);
				setState(32);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(34);
				match(T__2);
				setState(35);
				expression(0);
				setState(36);
				match(T__3);
				}
				break;
			case 3:
				{
				setState(38);
				match(T__5);
				setState(39);
				expression(13);
				}
				break;
			case 4:
				{
				setState(40);
				match(T__6);
				setState(41);
				expression(12);
				}
				break;
			case 5:
				{
				setState(42);
				match(T__0);
				setState(43);
				expression(0);
				setState(44);
				match(T__7);
				setState(45);
				simpleType();
				setState(46);
				match(T__1);
				}
				break;
			case 6:
				{
				setState(48);
				match(ID);
				setState(49);
				match(T__0);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(55);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(50);
							expression(0);
							setState(51);
							match(T__20);
							}
							} 
						}
						setState(57);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(58);
					expression(0);
					}
				}

				setState(61);
				match(T__1);
				}
				break;
			case 7:
				{
				setState(62);
				match(ID);
				}
				break;
			case 8:
				{
				setState(63);
				match(INT_CONSTANT);
				}
				break;
			case 9:
				{
				setState(64);
				match(REAL_CONSTANT);
				}
				break;
			case 10:
				{
				setState(65);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(69);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(72);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__11) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(75);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(81);
						match(T__4);
						setState(82);
						match(ID);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(84);
						match(T__2);
						setState(85);
						expression(0);
						setState(86);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(92);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				expression(0);
				setState(94);
				match(T__21);
				setState(95);
				expression(0);
				setState(96);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__23);
				setState(99);
				match(T__0);
				setState(100);
				expression(0);
				setState(101);
				match(T__1);
				setState(102);
				body();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__24);
				setState(105);
				match(T__0);
				setState(106);
				expression(0);
				setState(107);
				match(T__1);
				setState(108);
				body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(T__24);
				setState(111);
				match(T__0);
				setState(112);
				expression(0);
				setState(113);
				match(T__1);
				setState(114);
				body();
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(115);
					match(T__25);
					setState(116);
					body();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(120);
							expression(0);
							setState(121);
							match(T__20);
							}
							} 
						}
						setState(127);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(128);
					expression(0);
					}
				}

				setState(131);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				match(T__28);
				setState(133);
				expression(0);
				setState(134);
				match(T__22);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				match(ID);
				setState(137);
				match(T__0);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(138);
							expression(0);
							setState(139);
							match(T__20);
							}
							} 
						}
						setState(145);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(146);
					expression(0);
					}
				}

				setState(149);
				match(T__1);
				setState(150);
				match(T__22);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				varDefinition();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__29);
			{
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(ID);
					setState(159);
					match(T__20);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(165);
			match(ID);
			}
			setState(167);
			match(T__30);
			setState(168);
			type();
			setState(169);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__31);
			setState(172);
			match(ID);
			setState(173);
			match(T__0);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(174);
						match(ID);
						setState(175);
						match(T__30);
						setState(176);
						type();
						}
						setState(178);
						match(T__20);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				{
				setState(185);
				match(ID);
				setState(186);
				match(T__30);
				setState(187);
				type();
				}
				}
			}

			setState(190);
			match(T__1);
			setState(191);
			match(T__30);
			setState(192);
			type();
			setState(193);
			match(T__32);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(194);
				varDefinition();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__31);
			setState(209);
			match(T__34);
			setState(210);
			match(T__0);
			setState(211);
			match(T__1);
			setState(212);
			match(T__30);
			setState(213);
			match(T__35);
			setState(214);
			match(T__32);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(215);
				varDefinition();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__5:
			case T__6:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				statement();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__32);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
					{
					{
					setState(231);
					statement();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__33);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__2);
				setState(242);
				match(INT_CONSTANT);
				setState(243);
				match(T__3);
				setState(244);
				type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				match(T__2);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(246);
					varDefinition();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(T__35);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0103\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"6\b\u0001\n\u0001\f\u00019\t\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\"+
		"\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002v\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002|\b\u0002\n\u0002\f\u0002\u007f\t\u0002\u0001\u0002"+
		"\u0003\u0002\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u008e\b\u0002\n\u0002\f\u0002\u0091\t\u0002\u0001\u0002\u0003"+
		"\u0002\u0094\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0098\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u009c\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a1\b\u0004\n\u0004\f\u0004\u00a4\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b5\b\u0005\n\u0005\f\u0005"+
		"\u00b8\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bd\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00c4\b\u0005\n\u0005\f\u0005\u00c7\t\u0005\u0001\u0005\u0005\u0005"+
		"\u00ca\b\u0005\n\u0005\f\u0005\u00cd\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00d9\b\u0006\n\u0006\f\u0006\u00dc\t\u0006"+
		"\u0001\u0006\u0005\u0006\u00df\b\u0006\n\u0006\f\u0006\u00e2\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e9"+
		"\b\u0007\n\u0007\f\u0007\u00ec\t\u0007\u0001\u0007\u0003\u0007\u00ef\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\b\u0001\b\u0003\b\u00ff\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0000\u0001\u0002\n\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0000\u0006\u0001\u0000\t\u000b\u0002\u0000\u0006\u0006\f"+
		"\f\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014\u0001\u0000\u001b\u001c"+
		"\u0001\u0000%\'\u0123\u0000\u0017\u0001\u0000\u0000\u0000\u0002B\u0001"+
		"\u0000\u0000\u0000\u0004\u0097\u0001\u0000\u0000\u0000\u0006\u009b\u0001"+
		"\u0000\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00ab\u0001\u0000"+
		"\u0000\u0000\f\u00d0\u0001\u0000\u0000\u0000\u000e\u00ee\u0001\u0000\u0000"+
		"\u0000\u0010\u00fe\u0001\u0000\u0000\u0000\u0012\u0100\u0001\u0000\u0000"+
		"\u0000\u0014\u0016\u0003\u0006\u0003\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001b\u0003\f\u0006\u0000"+
		"\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0006\u0001\uffff\uffff\u0000\u001e\u001f\u0005\u0001\u0000"+
		"\u0000\u001f \u0003\u0002\u0001\u0000 !\u0005\u0002\u0000\u0000!C\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\u0002\u0001\u0000"+
		"$%\u0005\u0004\u0000\u0000%C\u0001\u0000\u0000\u0000&\'\u0005\u0006\u0000"+
		"\u0000\'C\u0003\u0002\u0001\r()\u0005\u0007\u0000\u0000)C\u0003\u0002"+
		"\u0001\f*+\u0005\u0001\u0000\u0000+,\u0003\u0002\u0001\u0000,-\u0005\b"+
		"\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0002\u0000\u0000/C\u0001\u0000"+
		"\u0000\u000001\u0005.\u0000\u00001;\u0005\u0001\u0000\u000023\u0003\u0002"+
		"\u0001\u000034\u0005\u0015\u0000\u000046\u0001\u0000\u0000\u000052\u0001"+
		"\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u0000:<\u0003\u0002\u0001\u0000;7\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=C\u0005\u0002\u0000\u0000>C\u0005"+
		".\u0000\u0000?C\u0005+\u0000\u0000@C\u0005,\u0000\u0000AC\u0005-\u0000"+
		"\u0000B\u001d\u0001\u0000\u0000\u0000B\"\u0001\u0000\u0000\u0000B&\u0001"+
		"\u0000\u0000\u0000B(\u0001\u0000\u0000\u0000B*\u0001\u0000\u0000\u0000"+
		"B0\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CZ\u0001\u0000"+
		"\u0000\u0000DE\n\n\u0000\u0000EF\u0007\u0000\u0000\u0000FY\u0003\u0002"+
		"\u0001\u000bGH\n\t\u0000\u0000HI\u0007\u0001\u0000\u0000IY\u0003\u0002"+
		"\u0001\nJK\n\b\u0000\u0000KL\u0007\u0002\u0000\u0000LY\u0003\u0002\u0001"+
		"\tMN\n\u0007\u0000\u0000NO\u0007\u0003\u0000\u0000OY\u0003\u0002\u0001"+
		"\bPQ\n\u000e\u0000\u0000QR\u0005\u0005\u0000\u0000RY\u0005.\u0000\u0000"+
		"ST\n\u0006\u0000\u0000TU\u0005\u0003\u0000\u0000UV\u0003\u0002\u0001\u0000"+
		"VW\u0005\u0004\u0000\u0000WY\u0001\u0000\u0000\u0000XD\u0001\u0000\u0000"+
		"\u0000XG\u0001\u0000\u0000\u0000XJ\u0001\u0000\u0000\u0000XM\u0001\u0000"+
		"\u0000\u0000XP\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u0003\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003\u0002"+
		"\u0001\u0000^_\u0005\u0016\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005"+
		"\u0017\u0000\u0000a\u0098\u0001\u0000\u0000\u0000bc\u0005\u0018\u0000"+
		"\u0000cd\u0005\u0001\u0000\u0000de\u0003\u0002\u0001\u0000ef\u0005\u0002"+
		"\u0000\u0000fg\u0003\u000e\u0007\u0000g\u0098\u0001\u0000\u0000\u0000"+
		"hi\u0005\u0019\u0000\u0000ij\u0005\u0001\u0000\u0000jk\u0003\u0002\u0001"+
		"\u0000kl\u0005\u0002\u0000\u0000lm\u0003\u000e\u0007\u0000m\u0098\u0001"+
		"\u0000\u0000\u0000no\u0005\u0019\u0000\u0000op\u0005\u0001\u0000\u0000"+
		"pq\u0003\u0002\u0001\u0000qr\u0005\u0002\u0000\u0000ru\u0003\u000e\u0007"+
		"\u0000st\u0005\u001a\u0000\u0000tv\u0003\u000e\u0007\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000v\u0098\u0001\u0000\u0000\u0000"+
		"w\u0081\u0007\u0004\u0000\u0000xy\u0003\u0002\u0001\u0000yz\u0005\u0015"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0003\u0002\u0001\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0098"+
		"\u0005\u0017\u0000\u0000\u0084\u0085\u0005\u001d\u0000\u0000\u0085\u0086"+
		"\u0003\u0002\u0001\u0000\u0086\u0087\u0005\u0017\u0000\u0000\u0087\u0098"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005.\u0000\u0000\u0089\u0093\u0005"+
		"\u0001\u0000\u0000\u008a\u008b\u0003\u0002\u0001\u0000\u008b\u008c\u0005"+
		"\u0015\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0003"+
		"\u0002\u0001\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u0002\u0000\u0000\u0096\u0098\u0005\u0017\u0000\u0000\u0097]\u0001\u0000"+
		"\u0000\u0000\u0097b\u0001\u0000\u0000\u0000\u0097h\u0001\u0000\u0000\u0000"+
		"\u0097n\u0001\u0000\u0000\u0000\u0097w\u0001\u0000\u0000\u0000\u0097\u0084"+
		"\u0001\u0000\u0000\u0000\u0097\u0088\u0001\u0000\u0000\u0000\u0098\u0005"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0003\b\u0004\u0000\u009a\u009c\u0003"+
		"\n\u0005\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u0007\u0001\u0000\u0000\u0000\u009d\u00a2\u0005\u001e"+
		"\u0000\u0000\u009e\u009f\u0005.\u0000\u0000\u009f\u00a1\u0005\u0015\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005.\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9"+
		"\u00aa\u0005\u0017\u0000\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005 \u0000\u0000\u00ac\u00ad\u0005.\u0000\u0000\u00ad\u00bc\u0005\u0001"+
		"\u0000\u0000\u00ae\u00af\u0005.\u0000\u0000\u00af\u00b0\u0005\u001f\u0000"+
		"\u0000\u00b0\u00b1\u0003\u0010\b\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005.\u0000\u0000\u00ba\u00bb\u0005\u001f\u0000\u0000\u00bb"+
		"\u00bd\u0003\u0010\b\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005\u0002\u0000\u0000\u00bf\u00c0\u0005\u001f\u0000\u0000\u00c0\u00c1"+
		"\u0003\u0010\b\u0000\u00c1\u00c5\u0005!\u0000\u0000\u00c2\u00c4\u0003"+
		"\b\u0004\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0003\u0004\u0002\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\"\u0000"+
		"\u0000\u00cf\u000b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005 \u0000\u0000"+
		"\u00d1\u00d2\u0005#\u0000\u0000\u00d2\u00d3\u0005\u0001\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0002\u0000\u0000\u00d4\u00d5\u0005\u001f\u0000\u0000\u00d5"+
		"\u00d6\u0005$\u0000\u0000\u00d6\u00da\u0005!\u0000\u0000\u00d7\u00d9\u0003"+
		"\b\u0004\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00e0\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00df\u0003\u0004\u0002\u0000\u00de\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\"\u0000"+
		"\u0000\u00e4\r\u0001\u0000\u0000\u0000\u00e5\u00ef\u0003\u0004\u0002\u0000"+
		"\u00e6\u00ea\u0005!\u0000\u0000\u00e7\u00e9\u0003\u0004\u0002\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ef\u0005\"\u0000\u0000\u00ee\u00e5\u0001\u0000\u0000\u0000\u00ee\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ef\u000f\u0001\u0000\u0000\u0000\u00f0\u00ff"+
		"\u0003\u0012\t\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005"+
		"+\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00ff\u0003\u0010"+
		"\b\u0000\u00f5\u00f9\u0005\u0003\u0000\u0000\u00f6\u00f8\u0003\b\u0004"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00ff\u0005\u0004\u0000\u0000\u00fd\u00ff\u0005$\u0000\u0000"+
		"\u00fe\u00f0\u0001\u0000\u0000\u0000\u00fe\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fe\u00f5\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0011\u0001\u0000\u0000\u0000\u0100\u0101\u0007\u0005\u0000\u0000"+
		"\u0101\u0013\u0001\u0000\u0000\u0000\u0018\u00177;BXZu}\u0081\u008f\u0093"+
		"\u0097\u009b\u00a2\u00b6\u00bc\u00c5\u00cb\u00da\u00e0\u00ea\u00ee\u00f9"+
		"\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}