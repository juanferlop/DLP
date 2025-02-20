// Generated from C:/Users/uo296143/IdeaProjects/DLP/src/parser/TSmm.g4 by ANTLR 4.13.2
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
		WHITESPACE=1, COMMENT=2, MULTIPLELINES_COMMENT=3, ID=4, REAL_LITERAL=5, 
		REAL_LITERAL_WITHEXPONENT=6, CHAR_CONSTANT=7, CHAR_ASCII_LITERAL=8, SPECIAL_CHARACTERS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "WHITESPACE", "COMMENT", "MULTIPLELINES_COMMENT", "ID", 
			"REAL_LITERAL", "REAL_LITERAL_WITHEXPONENT", "CHAR_CONSTANT", "CHAR_ASCII_LITERAL", 
			"SPECIAL_CHARACTERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'\\[0-9]+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COMMENT", "MULTIPLELINES_COMMENT", "ID", "REAL_LITERAL", 
			"REAL_LITERAL_WITHEXPONENT", "CHAR_CONSTANT", "CHAR_ASCII_LITERAL", "SPECIAL_CHARACTERS"
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
		"\u0004\u0000\t\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0003\u0000"+
		"\u001e\b\u0000\u0001\u0001\u0004\u0001!\b\u0001\u000b\u0001\f\u0001\""+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003<\b\u0003"+
		"\n\u0003\f\u0003?\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005S\b\u0005\n\u0005\f\u0005V\t\u0005\u0001\u0006"+
		"\u0005\u0006Y\b\u0006\n\u0006\f\u0006\\\t\u0006\u0001\u0006\u0003\u0006"+
		"_\b\u0006\u0001\u0006\u0005\u0006b\b\u0006\n\u0006\f\u0006e\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0006\u0004\u0006l\b\u0006"+
		"\u000b\u0006\f\u0006m\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t~\b\t\u0001\t\u0001\t\u0002,=\u0000\n\u0001\u0000\u0003\u0001"+
		"\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011"+
		"\b\u0013\t\u0001\u0000\u0007\u0001\u000019\u0001\u000009\u0001\u0000 "+
		" \u0002\u0000AZaz\u0002\u0000EEee\u0002\u0000++--\u0001\u0000..\u008d"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003 \u0001"+
		"\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000"+
		"\u0000\tD\u0001\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rZ\u0001"+
		"\u0000\u0000\u0000\u000fo\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000"+
		"\u0000\u0013}\u0001\u0000\u0000\u0000\u0015\u0019\u0007\u0000\u0000\u0000"+
		"\u0016\u0018\u0007\u0001\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001e\u0001\u0000\u0000\u0000"+
		"\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u00050\u0000\u0000\u001d"+
		"\u0015\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u0002\u0001\u0000\u0000\u0000\u001f!\u0007\u0002\u0000\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0006\u0001\u0000"+
		"\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005/"+
		"\u0000\u0000(,\u0001\u0000\u0000\u0000)+\t\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\\\u0000\u000001\u0005r\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0005\\\u0000\u000034\u0005n\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0006\u0002\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005/\u0000"+
		"\u000089\u0005*\u0000\u00009=\u0001\u0000\u0000\u0000:<\t\u0000\u0000"+
		"\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@A\u0005*\u0000\u0000AB\u0005/\u0000\u0000B\b\u0001"+
		"\u0000\u0000\u0000CE\u0005_\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0007\u0003\u0000\u0000"+
		"GH\u0007\u0001\u0000\u0000HI\u0005_\u0000\u0000I\n\u0001\u0000\u0000\u0000"+
		"JL\u0007\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PT\u0005.\u0000\u0000QS\u0007\u0001"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\f\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0005"+
		".\u0000\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_c\u0001"+
		"\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0007\u0004"+
		"\u0000\u0000gi\u0007\u0005\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jl\u0007\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000n\u000e\u0001\u0000\u0000\u0000op\u0007"+
		"\u0006\u0000\u0000p\u0010\u0001\u0000\u0000\u0000qr\u0005\\\u0000\u0000"+
		"rs\u0005[\u0000\u0000st\u00050\u0000\u0000tu\u0005-\u0000\u0000uv\u0005"+
		"9\u0000\u0000vw\u0005]\u0000\u0000wx\u0005+\u0000\u0000x\u0012\u0001\u0000"+
		"\u0000\u0000yz\u0005\\\u0000\u0000z~\u0005n\u0000\u0000{|\u0005\\\u0000"+
		"\u0000|~\u0005t\u0000\u0000}y\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0006\t\u0000\u0000"+
		"\u0080\u0014\u0001\u0000\u0000\u0000\u000f\u0000\u0019\u001d\",=DMTZ^"+
		"chm}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}