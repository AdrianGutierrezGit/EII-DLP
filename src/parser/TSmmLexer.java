// Generated from C:/Users/Adria/Desktop/DLP/practica/proyecto_DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITES=1, LINE_COMMENT=2, BLOCK_COMMENT=3, INT_CONSTANT=4, REAL_CONSTANT=5, 
		CHAR_CONSTANT=6, ID=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHITES", "LINE_COMMENT", "BLOCK_COMMENT", "INT_CONSTANT", "MANTISSA", 
			"EXP", "REAL_CONSTANT", "CHAR_CONSTANT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITES", "LINE_COMMENT", "BLOCK_COMMENT", "INT_CONSTANT", "REAL_CONSTANT", 
			"CHAR_CONSTANT", "ID"
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


	public TSmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002"+
		"\n\u0002\f\u00021\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003"+
		"\n\u0003\f\u0003>\t\u0003\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004"+
		"\u0003\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0004\u0004H\b\u0004\u000b"+
		"\u0004\f\u0004I\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0003\u0004"+
		"P\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005T\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007o\b\u0007\u0001\b\u0001\b\u0005\bs\b\b\n\b\f\bv\t\b\u0002 /\u0000"+
		"\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000"+
		"\r\u0005\u000f\u0006\u0011\u0007\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0001"+
		"\u0001\n\n\u0001\u000019\u0001\u000009\u0002\u0000EEee\u0002\u0000++-"+
		"-\u0003\u0000AZ__az\u0004\u000009AZ__az\u0083\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0003\u001a\u0001\u0000\u0000"+
		"\u0000\u0005(\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\t"+
		"O\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rW\u0001\u0000"+
		"\u0000\u0000\u000fn\u0001\u0000\u0000\u0000\u0011p\u0001\u0000\u0000\u0000"+
		"\u0013\u0015\u0007\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0006\u0000\u0000\u0000\u0019\u0002\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0005/\u0000\u0000\u001b\u001c\u0005/\u0000\u0000\u001c "+
		"\u0001\u0000\u0000\u0000\u001d\u001f\t\u0000\u0000\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000#%\u0007\u0001\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&\'\u0006\u0001\u0000\u0000\'\u0004\u0001\u0000"+
		"\u0000\u0000()\u0005/\u0000\u0000)*\u0005*\u0000\u0000*+\u0005 \u0000"+
		"\u0000+/\u0001\u0000\u0000\u0000,.\t\u0000\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		" \u0000\u000034\u0005*\u0000\u000045\u0005/\u0000\u000056\u0001\u0000"+
		"\u0000\u000067\u0006\u0002\u0000\u00007\u0006\u0001\u0000\u0000\u0000"+
		"8<\u0007\u0002\u0000\u00009;\u0007\u0003\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=A\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0005"+
		"0\u0000\u0000@8\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000A\b\u0001"+
		"\u0000\u0000\u0000BD\u0003\u0007\u0003\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0005.\u0000\u0000"+
		"FH\u0007\u0003\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JP\u0001\u0000"+
		"\u0000\u0000KM\u0003\u0007\u0003\u0000LN\u0005.\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OC\u0001"+
		"\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000P\n\u0001\u0000\u0000\u0000"+
		"QS\u0007\u0004\u0000\u0000RT\u0007\u0005\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0003\u0007"+
		"\u0003\u0000V\f\u0001\u0000\u0000\u0000WY\u0003\t\u0004\u0000XZ\u0003"+
		"\u000b\u0005\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u000e\u0001\u0000\u0000\u0000[\\\u0005\'\u0000\u0000\\]\t\u0000\u0000"+
		"\u0000]o\u0005\'\u0000\u0000^_\u0005\'\u0000\u0000_`\u0005\\\u0000\u0000"+
		"`a\u0005t\u0000\u0000ab\u0001\u0000\u0000\u0000bo\u0005\'\u0000\u0000"+
		"cd\u0005\'\u0000\u0000de\u0005\\\u0000\u0000ef\u0005n\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000go\u0005\'\u0000\u0000hi\u0005\'\u0000\u0000ij\u0005"+
		"\\\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0003\u0007\u0003\u0000lm\u0005"+
		"\'\u0000\u0000mo\u0001\u0000\u0000\u0000n[\u0001\u0000\u0000\u0000n^\u0001"+
		"\u0000\u0000\u0000nc\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000"+
		"o\u0010\u0001\u0000\u0000\u0000pt\u0007\u0006\u0000\u0000qs\u0007\u0007"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0012\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000\u000f\u0000\u0016 $/<@CIMOSYnt\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}