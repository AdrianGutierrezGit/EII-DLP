// Generated from C:/Users/Adria/Desktop/DLP/practica/proyecto_DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import ast.expressions.*;
import ast.expressions.binaryOperations.*;
import ast.types.*;
import ast.definitions.*;
import ast.types.*;
import ast.statements.*;
import ast.*;

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
		public Program ast;
		public List<Definition> defs = new ArrayList<>();
		public DefinitionContext definition;
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
			setState(25);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					((ProgramContext)_localctx).definition = definition();
					_localctx.defs.addAll(((ProgramContext)_localctx).definition.ast);
					}
					} 
				}
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(28);
			main();
			setState(29);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(_localctx.defs);
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
		public Expression ast;
		public List<Expression> functionInvocationExps = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext expression;
		public SimpleTypeContext simpleType;
		public Token ID;
		public ExpressionContext e2;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(33);
				match(T__0);
				setState(34);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(35);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 2:
				{
				setState(38);
				match(T__2);
				setState(39);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(40);
				match(T__3);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(43);
				match(T__5);
				setState(44);
				((ExpressionContext)_localctx).expression = expression(13);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).expression.ast.getLine(),((ExpressionContext)_localctx).expression.ast.getColumn(), ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 4:
				{
				setState(47);
				match(T__6);
				setState(48);
				((ExpressionContext)_localctx).expression = expression(12);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).expression.ast.getLine(), ((ExpressionContext)_localctx).expression.ast.getColumn(),((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 5:
				{
				setState(51);
				match(T__0);
				setState(52);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(53);
				match(T__7);
				setState(54);
				((ExpressionContext)_localctx).simpleType = simpleType();
				setState(55);
				match(T__1);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).expression.ast.getLine(),((ExpressionContext)_localctx).expression.ast.getColumn(),((ExpressionContext)_localctx).simpleType.ast,((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 6:
				{
				setState(58);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(59);
				match(T__0);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(60);
							((ExpressionContext)_localctx).e1 = ((ExpressionContext)_localctx).expression = expression(0);
							setState(61);
							match(T__20);
							_localctx.functionInvocationExps.add(((ExpressionContext)_localctx).e1.ast);
							}
							} 
						}
						setState(68);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					}
					setState(69);
					((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
					_localctx.functionInvocationExps.add(((ExpressionContext)_localctx).e2.ast);
					}
				}

				setState(74);
				match(T__1);
				((ExpressionContext)_localctx).ast =  new Invocation(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)),_localctx.functionInvocationExps);
				}
				break;
			case 7:
				{
				setState(76);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 8:
				{
				setState(78);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(80);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new NumberLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 10:
				{
				setState(82);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(87);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(11);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(92);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__11) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(97);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(9);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(102);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);
						((ExpressionContext)_localctx).ast =  new Logic(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null),((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(107);
						match(T__4);
						setState(108);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						match(T__2);
						setState(112);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(113);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast.getLine(),((ExpressionContext)_localctx).e1.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					}
					} 
				}
				setState(120);
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
		public List<Statement> ast = new ArrayList<>();
		public List<Statement> else_ = new ArrayList<>();
		public List<Expression> functionInvocationExps = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext expression;
		public BodyContext body;
		public BodyContext b1;
		public BodyContext b2;
		public Token ID;
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((StatementContext)_localctx).e1 = expression(0);
				setState(122);
				match(T__21);
				setState(123);
				((StatementContext)_localctx).e2 = expression(0);
				setState(124);
				match(T__22);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn(),((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).e2.ast));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__23);
				setState(128);
				match(T__0);
				setState(129);
				((StatementContext)_localctx).expression = expression(0);
				setState(130);
				match(T__1);
				setState(131);
				((StatementContext)_localctx).body = body();
				_localctx.ast.add(new While(((StatementContext)_localctx).expression.ast.getLine(),((StatementContext)_localctx).expression.ast.getColumn(),((StatementContext)_localctx).expression.ast,((StatementContext)_localctx).body.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__24);
				setState(135);
				match(T__0);
				setState(136);
				((StatementContext)_localctx).expression = expression(0);
				setState(137);
				match(T__1);
				setState(138);
				((StatementContext)_localctx).b1 = body();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(139);
					match(T__25);
					setState(140);
					((StatementContext)_localctx).b2 = body();
					((StatementContext)_localctx).else_ =  ((StatementContext)_localctx).b2.ast;
					}
					break;
				}
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).expression.ast.getLine(),((StatementContext)_localctx).expression.ast.getColumn(),((StatementContext)_localctx).expression.ast,((StatementContext)_localctx).b1.ast,_localctx.else_));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__26);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(148);
							((StatementContext)_localctx).e1 = expression(0);
							setState(149);
							match(T__20);
							_localctx.ast.add(new Input(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast));
							}
							} 
						}
						setState(156);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(157);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Input(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn(),((StatementContext)_localctx).e2.ast));
					}
				}

				setState(162);
				match(T__22);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__27);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(164);
							((StatementContext)_localctx).e1 = expression(0);
							setState(165);
							match(T__20);
							_localctx.ast.add(new Log(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn(),((StatementContext)_localctx).e1.ast));
							}
							} 
						}
						setState(172);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(173);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Log(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn(),((StatementContext)_localctx).e2.ast));
					}
				}

				setState(178);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(179);
				match(T__28);
				setState(180);
				((StatementContext)_localctx).expression = expression(0);
				setState(181);
				match(T__22);
				_localctx.ast.add(new Return(((StatementContext)_localctx).expression.ast.getLine(),((StatementContext)_localctx).expression.ast.getColumn(),((StatementContext)_localctx).expression.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				((StatementContext)_localctx).ID = match(ID);
				setState(185);
				match(T__0);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941395333322L) != 0)) {
					{
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(186);
							((StatementContext)_localctx).e1 = expression(0);
							setState(187);
							match(T__20);
							_localctx.functionInvocationExps.add(((StatementContext)_localctx).e1.ast);
							}
							} 
						}
						setState(194);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(195);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.functionInvocationExps.add(((StatementContext)_localctx).e2.ast);
					}
				}

				setState(200);
				match(T__1);
				setState(201);
				match(T__22);
				_localctx.ast.add(new Invocation(((StatementContext)_localctx).ID.getLine(),((StatementContext)_localctx).ID.getCharPositionInLine()+1,new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)),_localctx.functionInvocationExps));
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
		public List<Definition> ast = new ArrayList<>();
		public VarDefinitionContext varDefinition;
		public FunctionDefinitionContext functionDefinition;
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((DefinitionContext)_localctx).varDefinition = varDefinition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).varDefinition.ast);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((DefinitionContext)_localctx).functionDefinition = functionDefinition();
				_localctx.ast.add(((DefinitionContext)_localctx).functionDefinition.ast);
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
		public List<VarDefinition> ast = new ArrayList<>();
		public List<Token> ids = new ArrayList<>();
		public Token ID1;
		public Token ID2;
		public TypeContext type;
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
			setState(213);
			match(T__29);
			{
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					((VarDefinitionContext)_localctx).ID1 = match(ID);
					_localctx.ids.add(((VarDefinitionContext)_localctx).ID1);
					setState(216);
					match(T__20);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(222);
			((VarDefinitionContext)_localctx).ID2 = match(ID);
			_localctx.ids.add(((VarDefinitionContext)_localctx).ID2);
			}
			setState(225);
			match(T__30);
			setState(226);
			((VarDefinitionContext)_localctx).type = type();
			setState(227);
			match(T__22);
			for(Token id: _localctx.ids){_localctx.ast.add(new VarDefinition(id.getLine(),id.getCharPositionInLine()+1,id.getText(),((VarDefinitionContext)_localctx).type.ast));}
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
		public FunctionDefinition ast;
		public List<Statement> functionBody = new ArrayList<>();
		public List<VarDefinition> parameters = new ArrayList<>();
		public Token ID1;
		public Token ID2;
		public TypeContext t1;
		public Token ID3;
		public TypeContext t2;
		public TypeContext t3;
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
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
			setState(230);
			match(T__31);
			setState(231);
			((FunctionDefinitionContext)_localctx).ID1 = match(ID);
			setState(232);
			match(T__0);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						{
						setState(233);
						((FunctionDefinitionContext)_localctx).ID2 = match(ID);
						setState(234);
						match(T__30);
						setState(235);
						((FunctionDefinitionContext)_localctx).t1 = type();
						}
						setState(237);
						match(T__20);
						_localctx.parameters.add(new VarDefinition(((FunctionDefinitionContext)_localctx).ID2.getLine(),((FunctionDefinitionContext)_localctx).ID2.getCharPositionInLine()+1,(((FunctionDefinitionContext)_localctx).ID2!=null?((FunctionDefinitionContext)_localctx).ID2.getText():null),((FunctionDefinitionContext)_localctx).t1.ast));
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				{
				{
				setState(245);
				((FunctionDefinitionContext)_localctx).ID3 = match(ID);
				setState(246);
				match(T__30);
				setState(247);
				((FunctionDefinitionContext)_localctx).t2 = type();
				}
				_localctx.parameters.add(new VarDefinition(((FunctionDefinitionContext)_localctx).ID3.getLine(),((FunctionDefinitionContext)_localctx).ID3.getCharPositionInLine()+1,(((FunctionDefinitionContext)_localctx).ID3!=null?((FunctionDefinitionContext)_localctx).ID3.getText():null),((FunctionDefinitionContext)_localctx).t2.ast));
				}
				}
			}

			setState(253);
			match(T__1);
			setState(254);
			match(T__30);
			setState(255);
			((FunctionDefinitionContext)_localctx).t3 = type();
			setState(256);
			match(T__32);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(257);
				((FunctionDefinitionContext)_localctx).varDefinition = varDefinition();
				_localctx.functionBody.addAll(((FunctionDefinitionContext)_localctx).varDefinition.ast);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
				{
				{
				setState(265);
				((FunctionDefinitionContext)_localctx).statement = statement();
				_localctx.functionBody.addAll(((FunctionDefinitionContext)_localctx).statement.ast);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			match(T__33);
			((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition(((FunctionDefinitionContext)_localctx).ID1.getLine(),((FunctionDefinitionContext)_localctx).ID1.getCharPositionInLine()+1,(((FunctionDefinitionContext)_localctx).ID1!=null?((FunctionDefinitionContext)_localctx).ID1.getText():null), new FunctionType(_localctx.parameters,((FunctionDefinitionContext)_localctx).t3.ast),_localctx.functionBody);
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
		public FunctionDefinition ast;
		public List<Statement> mainBody = new ArrayList<>();
		public VarDefinitionContext varDefinition;
		public StatementContext statement;
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
			setState(276);
			match(T__31);
			setState(277);
			match(T__34);
			setState(278);
			match(T__0);
			setState(279);
			match(T__1);
			setState(280);
			match(T__30);
			setState(281);
			match(T__35);
			setState(282);
			match(T__32);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(283);
				((MainContext)_localctx).varDefinition = varDefinition();
				_localctx.mainBody.addAll(((MainContext)_localctx).varDefinition.ast);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
				{
				{
				setState(291);
				((MainContext)_localctx).statement = statement();
				_localctx.mainBody.addAll(((MainContext)_localctx).statement.ast);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(T__33);
			((MainContext)_localctx).ast =  new FunctionDefinition(_localctx.start.getLine(),_localctx.start.getCharPositionInLine()+1,"main",VoidType.getInstance(),_localctx.mainBody);
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
		public List<Statement> ast = new ArrayList<>();
		public StatementContext statement;
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
			setState(315);
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
				setState(302);
				((BodyContext)_localctx).statement = statement();
				_localctx.ast.addAll(((BodyContext)_localctx).statement.ast);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__32);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131942385189066L) != 0)) {
					{
					{
					setState(306);
					((BodyContext)_localctx).statement = statement();
					_localctx.ast.addAll(((BodyContext)_localctx).statement.ast);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
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
		public Type ast;
		public List<VarDefinition> tempFields = new ArrayList<>();
		public List<RecordField> finalFields = new ArrayList<>();
		public SimpleTypeContext simpleType;
		public Token INT_CONSTANT;
		public TypeContext type;
		public VarDefinitionContext varDefinition;
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((TypeContext)_localctx).simpleType = simpleType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simpleType.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(T__2);
				setState(321);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(322);
				match(T__3);
				setState(323);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).type.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(T__2);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(327);
					((TypeContext)_localctx).varDefinition = varDefinition();
					_localctx.tempFields.addAll(((TypeContext)_localctx).varDefinition.ast);
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(T__3);

				        for(VarDefinition field: _localctx.tempFields){
				            _localctx.finalFields.add(new RecordField(field.getName(),field.getType()));
				        }
				        ((TypeContext)_localctx).ast =  new RecordType(_localctx.finalFields);
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(T__35);
				((TypeContext)_localctx).ast =  VoidType.getInstance();
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
		public Type ast;
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleType);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__36);
				((SimpleTypeContext)_localctx).ast =  IntType.getInstance();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(T__37);
				((SimpleTypeContext)_localctx).ast =  CharType.getInstance();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__38);
				((SimpleTypeContext)_localctx).ast =  DoubleType.getInstance();
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
		"\u0004\u0001.\u015e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001A\b\u0001\n\u0001"+
		"\f\u0001D\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001U\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001u\b\u0001\n\u0001\f\u0001x\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0090\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u0099\b\u0002\n\u0002\f\u0002\u009c\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00a1\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00a9\b\u0002\n\u0002\f\u0002"+
		"\u00ac\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b1\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00bf\b\u0002\n\u0002\f\u0002\u00c2\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00c7\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00cc\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d4\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00da\b\u0004\n\u0004"+
		"\f\u0004\u00dd\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00f1\b\u0005\n\u0005\f\u0005\u00f4"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00fc\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0105\b\u0005\n"+
		"\u0005\f\u0005\u0108\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u010d\b\u0005\n\u0005\f\u0005\u0110\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u011f\b\u0006\n\u0006\f\u0006\u0122\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0127\b\u0006\n\u0006\f\u0006\u012a\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0136\b\u0007\n\u0007"+
		"\f\u0007\u0139\t\u0007\u0001\u0007\u0003\u0007\u013c\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u014b\b\b\n\b\f\b\u014e\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u0154\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u015c\b\t\u0001\t\u0000\u0001\u0002\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0004\u0001\u0000\t\u000b\u0002\u0000"+
		"\u0006\u0006\f\f\u0001\u0000\r\u0012\u0001\u0000\u0013\u0014\u0182\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0002T\u0001\u0000\u0000\u0000\u0004\u00cb"+
		"\u0001\u0000\u0000\u0000\u0006\u00d3\u0001\u0000\u0000\u0000\b\u00d5\u0001"+
		"\u0000\u0000\u0000\n\u00e6\u0001\u0000\u0000\u0000\f\u0114\u0001\u0000"+
		"\u0000\u0000\u000e\u013b\u0001\u0000\u0000\u0000\u0010\u0153\u0001\u0000"+
		"\u0000\u0000\u0012\u015b\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0006"+
		"\u0003\u0000\u0015\u0016\u0006\u0000\uffff\uffff\u0000\u0016\u0018\u0001"+
		"\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001c\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\f\u0006\u0000\u001d\u001e\u0005\u0000"+
		"\u0000\u0001\u001e\u001f\u0006\u0000\uffff\uffff\u0000\u001f\u0001\u0001"+
		"\u0000\u0000\u0000 !\u0006\u0001\uffff\uffff\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0002\u0000\u0000$%\u0006\u0001"+
		"\uffff\uffff\u0000%U\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000\u0000"+
		"\'(\u0003\u0002\u0001\u0000()\u0005\u0004\u0000\u0000)*\u0006\u0001\uffff"+
		"\uffff\u0000*U\u0001\u0000\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0003"+
		"\u0002\u0001\r-.\u0006\u0001\uffff\uffff\u0000.U\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0007\u0000\u000001\u0003\u0002\u0001\f12\u0006\u0001\uffff\uffff"+
		"\u00002U\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0003\u0002"+
		"\u0001\u000056\u0005\b\u0000\u000067\u0003\u0012\t\u000078\u0005\u0002"+
		"\u0000\u000089\u0006\u0001\uffff\uffff\u00009U\u0001\u0000\u0000\u0000"+
		":;\u0005.\u0000\u0000;H\u0005\u0001\u0000\u0000<=\u0003\u0002\u0001\u0000"+
		"=>\u0005\u0015\u0000\u0000>?\u0006\u0001\uffff\uffff\u0000?A\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EF\u0003\u0002\u0001\u0000FG\u0006\u0001\uffff"+
		"\uffff\u0000GI\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000"+
		"KU\u0006\u0001\uffff\uffff\u0000LM\u0005.\u0000\u0000MU\u0006\u0001\uffff"+
		"\uffff\u0000NO\u0005+\u0000\u0000OU\u0006\u0001\uffff\uffff\u0000PQ\u0005"+
		",\u0000\u0000QU\u0006\u0001\uffff\uffff\u0000RS\u0005-\u0000\u0000SU\u0006"+
		"\u0001\uffff\uffff\u0000T \u0001\u0000\u0000\u0000T&\u0001\u0000\u0000"+
		"\u0000T+\u0001\u0000\u0000\u0000T/\u0001\u0000\u0000\u0000T3\u0001\u0000"+
		"\u0000\u0000T:\u0001\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TN\u0001"+
		"\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"Uv\u0001\u0000\u0000\u0000VW\n\n\u0000\u0000WX\u0007\u0000\u0000\u0000"+
		"XY\u0003\u0002\u0001\u000bYZ\u0006\u0001\uffff\uffff\u0000Zu\u0001\u0000"+
		"\u0000\u0000[\\\n\t\u0000\u0000\\]\u0007\u0001\u0000\u0000]^\u0003\u0002"+
		"\u0001\n^_\u0006\u0001\uffff\uffff\u0000_u\u0001\u0000\u0000\u0000`a\n"+
		"\b\u0000\u0000ab\u0007\u0002\u0000\u0000bc\u0003\u0002\u0001\tcd\u0006"+
		"\u0001\uffff\uffff\u0000du\u0001\u0000\u0000\u0000ef\n\u0007\u0000\u0000"+
		"fg\u0007\u0003\u0000\u0000gh\u0003\u0002\u0001\bhi\u0006\u0001\uffff\uffff"+
		"\u0000iu\u0001\u0000\u0000\u0000jk\n\u000e\u0000\u0000kl\u0005\u0005\u0000"+
		"\u0000lm\u0005.\u0000\u0000mu\u0006\u0001\uffff\uffff\u0000no\n\u0006"+
		"\u0000\u0000op\u0005\u0003\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0005"+
		"\u0004\u0000\u0000rs\u0006\u0001\uffff\uffff\u0000su\u0001\u0000\u0000"+
		"\u0000tV\u0001\u0000\u0000\u0000t[\u0001\u0000\u0000\u0000t`\u0001\u0000"+
		"\u0000\u0000te\u0001\u0000\u0000\u0000tj\u0001\u0000\u0000\u0000tn\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000w\u0003\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000yz\u0003\u0002\u0001\u0000z{\u0005\u0016\u0000\u0000{|\u0003"+
		"\u0002\u0001\u0000|}\u0005\u0017\u0000\u0000}~\u0006\u0002\uffff\uffff"+
		"\u0000~\u00cc\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0018\u0000\u0000"+
		"\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000"+
		"\u0082\u0083\u0005\u0002\u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000"+
		"\u0084\u0085\u0006\u0002\uffff\uffff\u0000\u0085\u00cc\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0088\u0005\u0001\u0000"+
		"\u0000\u0088\u0089\u0003\u0002\u0001\u0000\u0089\u008a\u0005\u0002\u0000"+
		"\u0000\u008a\u008f\u0003\u000e\u0007\u0000\u008b\u008c\u0005\u001a\u0000"+
		"\u0000\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u008e\u0006\u0002\uffff"+
		"\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0006\u0002\uffff\uffff\u0000\u0092\u00cc\u0001"+
		"\u0000\u0000\u0000\u0093\u00a0\u0005\u001b\u0000\u0000\u0094\u0095\u0003"+
		"\u0002\u0001\u0000\u0095\u0096\u0005\u0015\u0000\u0000\u0096\u0097\u0006"+
		"\u0002\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0094"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0003\u0002\u0001\u0000\u009e\u009f\u0006\u0002\uffff\uffff\u0000\u009f"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a0\u009a\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\u00cc\u0005\u0017\u0000\u0000\u00a3\u00b0\u0005\u001c\u0000\u0000\u00a4"+
		"\u00a5\u0003\u0002\u0001\u0000\u00a5\u00a6\u0005\u0015\u0000\u0000\u00a6"+
		"\u00a7\u0006\u0002\uffff\uffff\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0003\u0002\u0001\u0000\u00ae\u00af\u0006\u0002\uffff\uffff"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00cc\u0005\u0017\u0000\u0000\u00b3\u00b4\u0005\u001d\u0000"+
		"\u0000\u00b4\u00b5\u0003\u0002\u0001\u0000\u00b5\u00b6\u0005\u0017\u0000"+
		"\u0000\u00b6\u00b7\u0006\u0002\uffff\uffff\u0000\u00b7\u00cc\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005.\u0000\u0000\u00b9\u00c6\u0005\u0001\u0000"+
		"\u0000\u00ba\u00bb\u0003\u0002\u0001\u0000\u00bb\u00bc\u0005\u0015\u0000"+
		"\u0000\u00bc\u00bd\u0006\u0002\uffff\uffff\u0000\u00bd\u00bf\u0001\u0000"+
		"\u0000\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003\u0002\u0001\u0000\u00c4\u00c5\u0006\u0002"+
		"\uffff\uffff\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00ca\u0005"+
		"\u0017\u0000\u0000\u00ca\u00cc\u0006\u0002\uffff\uffff\u0000\u00cby\u0001"+
		"\u0000\u0000\u0000\u00cb\u007f\u0001\u0000\u0000\u0000\u00cb\u0086\u0001"+
		"\u0000\u0000\u0000\u00cb\u0093\u0001\u0000\u0000\u0000\u00cb\u00a3\u0001"+
		"\u0000\u0000\u0000\u00cb\u00b3\u0001\u0000\u0000\u0000\u00cb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00cc\u0005\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003"+
		"\b\u0004\u0000\u00ce\u00cf\u0006\u0003\uffff\uffff\u0000\u00cf\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0003\n\u0005\u0000\u00d1\u00d2\u0006\u0003"+
		"\uffff\uffff\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\u0007\u0001"+
		"\u0000\u0000\u0000\u00d5\u00db\u0005\u001e\u0000\u0000\u00d6\u00d7\u0005"+
		".\u0000\u0000\u00d7\u00d8\u0006\u0004\uffff\uffff\u0000\u00d8\u00da\u0005"+
		"\u0015\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da\u00dd\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0005.\u0000\u0000\u00df\u00e0\u0006\u0004"+
		"\uffff\uffff\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u001f\u0000\u0000\u00e2\u00e3\u0003\u0010\b\u0000\u00e3\u00e4\u0005\u0017"+
		"\u0000\u0000\u00e4\u00e5\u0006\u0004\uffff\uffff\u0000\u00e5\t\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005 \u0000\u0000\u00e7\u00e8\u0005.\u0000\u0000"+
		"\u00e8\u00fb\u0005\u0001\u0000\u0000\u00e9\u00ea\u0005.\u0000\u0000\u00ea"+
		"\u00eb\u0005\u001f\u0000\u0000\u00eb\u00ec\u0003\u0010\b\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0015\u0000\u0000\u00ee\u00ef"+
		"\u0006\u0005\uffff\uffff\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005.\u0000\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000\u00f7\u00f8"+
		"\u0003\u0010\b\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0006"+
		"\u0005\uffff\uffff\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f2"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0002\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001f\u0000\u0000\u00ff\u0100\u0003\u0010\b\u0000\u0100\u0106\u0005"+
		"!\u0000\u0000\u0101\u0102\u0003\b\u0004\u0000\u0102\u0103\u0006\u0005"+
		"\uffff\uffff\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010e\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0003"+
		"\u0004\u0002\u0000\u010a\u010b\u0006\u0005\uffff\uffff\u0000\u010b\u010d"+
		"\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d\u0110"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0005\"\u0000\u0000\u0112\u0113\u0006"+
		"\u0005\uffff\uffff\u0000\u0113\u000b\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005 \u0000\u0000\u0115\u0116\u0005#\u0000\u0000\u0116\u0117\u0005\u0001"+
		"\u0000\u0000\u0117\u0118\u0005\u0002\u0000\u0000\u0118\u0119\u0005\u001f"+
		"\u0000\u0000\u0119\u011a\u0005$\u0000\u0000\u011a\u0120\u0005!\u0000\u0000"+
		"\u011b\u011c\u0003\b\u0004\u0000\u011c\u011d\u0006\u0006\uffff\uffff\u0000"+
		"\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000"+
		"\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0128\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0003\u0004\u0002\u0000"+
		"\u0124\u0125\u0006\u0006\uffff\uffff\u0000\u0125\u0127\u0001\u0000\u0000"+
		"\u0000\u0126\u0123\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0005\"\u0000\u0000\u012c\u012d\u0006\u0006\uffff\uffff"+
		"\u0000\u012d\r\u0001\u0000\u0000\u0000\u012e\u012f\u0003\u0004\u0002\u0000"+
		"\u012f\u0130\u0006\u0007\uffff\uffff\u0000\u0130\u013c\u0001\u0000\u0000"+
		"\u0000\u0131\u0137\u0005!\u0000\u0000\u0132\u0133\u0003\u0004\u0002\u0000"+
		"\u0133\u0134\u0006\u0007\uffff\uffff\u0000\u0134\u0136\u0001\u0000\u0000"+
		"\u0000\u0135\u0132\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000"+
		"\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u013a\u013c\u0005\"\u0000\u0000\u013b\u012e\u0001\u0000\u0000\u0000"+
		"\u013b\u0131\u0001\u0000\u0000\u0000\u013c\u000f\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0003\u0012\t\u0000\u013e\u013f\u0006\b\uffff\uffff\u0000"+
		"\u013f\u0154\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000"+
		"\u0141\u0142\u0005+\u0000\u0000\u0142\u0143\u0005\u0004\u0000\u0000\u0143"+
		"\u0144\u0003\u0010\b\u0000\u0144\u0145\u0006\b\uffff\uffff\u0000\u0145"+
		"\u0154\u0001\u0000\u0000\u0000\u0146\u014c\u0005\u0003\u0000\u0000\u0147"+
		"\u0148\u0003\b\u0004\u0000\u0148\u0149\u0006\b\uffff\uffff\u0000\u0149"+
		"\u014b\u0001\u0000\u0000\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b"+
		"\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e"+
		"\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u0004\u0000\u0000\u0150"+
		"\u0154\u0006\b\uffff\uffff\u0000\u0151\u0152\u0005$\u0000\u0000\u0152"+
		"\u0154\u0006\b\uffff\uffff\u0000\u0153\u013d\u0001\u0000\u0000\u0000\u0153"+
		"\u0140\u0001\u0000\u0000\u0000\u0153\u0146\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0011\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0005%\u0000\u0000\u0156\u015c\u0006\t\uffff\uffff\u0000\u0157"+
		"\u0158\u0005&\u0000\u0000\u0158\u015c\u0006\t\uffff\uffff\u0000\u0159"+
		"\u015a\u0005\'\u0000\u0000\u015a\u015c\u0006\t\uffff\uffff\u0000\u015b"+
		"\u0155\u0001\u0000\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015b"+
		"\u0159\u0001\u0000\u0000\u0000\u015c\u0013\u0001\u0000\u0000\u0000\u001b"+
		"\u0019BHTtv\u008f\u009a\u00a0\u00aa\u00b0\u00c0\u00c6\u00cb\u00d3\u00db"+
		"\u00f2\u00fb\u0106\u010e\u0120\u0128\u0137\u013b\u014c\u0153\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}