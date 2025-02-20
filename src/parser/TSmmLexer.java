// Generated from /Users/juanfernandezlopez21/Desktop/3Curso/2S/DLP/lab/compilador/src/parser/TSmm.g4 by ANTLR 4.13.2
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
		INT_CONSTANT=1, WHITESPACE=2, COMMENT=3, MULTIPLELINES_COMMENT=4, ID=5, 
		INT_LITERAL=6, REAL_CONSTANT=7, CHAR_CONSTANT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CHAR", "INT_CONSTANT", "WHITESPACE", "COMMENT", "MULTIPLELINES_COMMENT", 
			"ID", "INT_LITERAL", "REAL_CONSTANT", "CHAR_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'CHAR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "WHITESPACE", "COMMENT", "MULTIPLELINES_COMMENT", 
			"ID", "INT_LITERAL", "REAL_CONSTANT", "CHAR_CONSTANT"
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
		"\u0004\u0000\b]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001\u0001"+
		"\u0003\u0001\u001e\b\u0001\u0001\u0002\u0004\u0002!\b\u0002\u000b\u0002"+
		"\f\u0002\"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005A\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006H\b\u0006"+
		"\u000b\u0006\f\u0006I\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007"+
		"P\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007T\b\u0007\n\u0007\f\u0007"+
		"W\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0002,9\u0000\t\u0001"+
		"\u0000\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006"+
		"\u000f\u0007\u0011\b\u0001\u0000\u0005\u0002\u0000AZaz\u0001\u000019\u0001"+
		"\u000009\u0001\u0000  \u0004\u0000\n\nEFoo||d\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000"+
		"\u0003\u001d\u0001\u0000\u0000\u0000\u0005 \u0001\u0000\u0000\u0000\u0007"+
		"&\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fN\u0001\u0000\u0000\u0000"+
		"\u0011X\u0001\u0000\u0000\u0000\u0013\u0014\u0007\u0000\u0000\u0000\u0014"+
		"\u0002\u0001\u0000\u0000\u0000\u0015\u0019\u0007\u0001\u0000\u0000\u0016"+
		"\u0018\u0007\u0002\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001e\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u00050\u0000\u0000\u001d\u0015"+
		"\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0004"+
		"\u0001\u0000\u0000\u0000\u001f!\u0007\u0003\u0000\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#"+
		"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0002\u0000"+
		"\u0000%\u0006\u0001\u0000\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005/"+
		"\u0000\u0000(,\u0001\u0000\u0000\u0000)+\t\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0007\u0004\u0000\u000001\u0001\u0000\u0000\u000012\u0006\u0003\u0000"+
		"\u00002\b\u0001\u0000\u0000\u000034\u0005/\u0000\u000045\u0005*\u0000"+
		"\u000059\u0001\u0000\u0000\u000068\t\u0000\u0000\u000076\u0001\u0000\u0000"+
		"\u00008;\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:<\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0005"+
		"*\u0000\u0000=>\u0005/\u0000\u0000>\n\u0001\u0000\u0000\u0000?A\u0005"+
		"_\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0007\u0000\u0000\u0000CD\u0007\u0002\u0000\u0000"+
		"DE\u0005_\u0000\u0000E\f\u0001\u0000\u0000\u0000FH\u0007\u0002\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\u000e\u0001\u0000\u0000\u0000KM\u0007"+
		"\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000QU\u0005.\u0000\u0000RT\u0007\u0002\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0010\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005C\u0000\u0000YZ\u0005H\u0000\u0000Z"+
		"[\u0005A\u0000\u0000[\\\u0005R\u0000\u0000\\\u0012\u0001\u0000\u0000\u0000"+
		"\n\u0000\u0019\u001d\",9@INU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}