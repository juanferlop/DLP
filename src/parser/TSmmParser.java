// Generated from /Users/juanfernandezlopez21/IdeaProjects/compilador/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, COMMENT=17, 
		BLOCK_COMMENT=18, INT_CONSTANT=19, WHITESPACE=20, ID=21, REAL_CONSTANT=22, 
		CHAR_CONSTANT=23, SIMPLE_TYPE=24, RETURN_TYPE=25, TYPE=26, INT_LITERAL=27;
	public static final int
		RULE_program = 0, RULE_variable_definition = 1, RULE_identifier_list = 2, 
		RULE_function_definition = 3, RULE_array_definition = 4, RULE_record = 5, 
		RULE_statement = 6, RULE_expression = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variable_definition", "identifier_list", "function_definition", 
			"array_definition", "record", "statement", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "':'", "';'", "','", "'function'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'];'", "'log'", "'*'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "COMMENT", "BLOCK_COMMENT", "INT_CONSTANT", 
			"WHITESPACE", "ID", "REAL_CONSTANT", "CHAR_CONSTANT", "SIMPLE_TYPE", 
			"RETURN_TYPE", "TYPE", "INT_LITERAL"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			expression(0);
			setState(17);
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
	public static class Variable_definitionContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode SIMPLE_TYPE() { return getToken(TSmmParser.SIMPLE_TYPE, 0); }
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			identifier_list();
			setState(21);
			match(T__1);
			setState(22);
			match(SIMPLE_TYPE);
			setState(23);
			match(T__2);
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
	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier_list);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(ID);
				setState(27);
				match(T__3);
				setState(28);
				identifier_list();
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
	public static class Function_definitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public TerminalNode TYPE() { return getToken(TSmmParser.TYPE, 0); }
		public TerminalNode RETURN_TYPE() { return getToken(TSmmParser.RETURN_TYPE, 0); }
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__4);
				setState(32);
				match(ID);
				setState(33);
				match(T__5);
				setState(34);
				match(ID);
				setState(35);
				match(T__1);
				setState(36);
				match(TYPE);
				setState(37);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(ID);
				setState(39);
				match(T__1);
				setState(40);
				match(TYPE);
				setState(41);
				match(T__6);
				setState(42);
				match(T__1);
				setState(43);
				match(RETURN_TYPE);
				setState(44);
				match(T__7);
				setState(45);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				variable_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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
	public static class Array_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TerminalNode INT_LITERAL() { return getToken(TSmmParser.INT_LITERAL, 0); }
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(TSmmParser.TYPE, 0); }
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_definition);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__0);
				setState(52);
				match(ID);
				setState(53);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__9);
				setState(55);
				match(INT_LITERAL);
				setState(56);
				match(T__10);
				setState(57);
				array_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(T__9);
				setState(59);
				match(INT_LITERAL);
				setState(60);
				match(T__10);
				setState(61);
				match(TYPE);
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
	public static class RecordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(TSmmParser.TYPE, 0); }
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_record);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__0);
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(67);
				match(T__9);
				setState(68);
				record();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(ID);
				setState(71);
				match(T__1);
				setState(72);
				match(TYPE);
				setState(73);
				match(T__2);
				setState(74);
				record();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__0);
				setState(76);
				match(ID);
				setState(77);
				match(T__1);
				setState(78);
				match(TYPE);
				setState(79);
				match(T__2);
				setState(80);
				match(T__11);
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
	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__12);
				setState(84);
				expression(0);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__3);
				setState(86);
				expression(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				{
				setState(91);
				match(INT_CONSTANT);
				}
				break;
			case ID:
				{
				setState(92);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(96);
						match(T__13);
						setState(97);
						expression(3);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(99);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001bk\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u001e\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004?\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005R\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006Y\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007^\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007f\b\u0007\n\u0007\f\u0007i\t\u0007\u0001\u0007\u0000\u0001"+
		"\u000e\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\u000f"+
		"\u0010p\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\u001d\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000"+
		"\b>\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u000e\u0007"+
		"\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0003\u0004\u0002"+
		"\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0018\u0000"+
		"\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0003\u0001\u0000\u0000"+
		"\u0000\u0019\u001e\u0005\u0015\u0000\u0000\u001a\u001b\u0005\u0015\u0000"+
		"\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c\u001e\u0003\u0004\u0002"+
		"\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000"+
		"\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f \u0005\u0005\u0000\u0000"+
		" !\u0005\u0015\u0000\u0000!\"\u0005\u0006\u0000\u0000\"#\u0005\u0015\u0000"+
		"\u0000#$\u0005\u0002\u0000\u0000$%\u0005\u001a\u0000\u0000%2\u0005\u0004"+
		"\u0000\u0000&\'\u0005\u0015\u0000\u0000\'(\u0005\u0002\u0000\u0000()\u0005"+
		"\u001a\u0000\u0000)*\u0005\u0007\u0000\u0000*+\u0005\u0002\u0000\u0000"+
		"+,\u0005\u0019\u0000\u0000,-\u0005\b\u0000\u0000-2\u0005\t\u0000\u0000"+
		".2\u0003\u0002\u0001\u0000/2\u0003\f\u0006\u000002\u0001\u0000\u0000\u0000"+
		"1\u001f\u0001\u0000\u0000\u00001&\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0007"+
		"\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u000045\u0005\u0015\u0000"+
		"\u00005?\u0005\u0002\u0000\u000067\u0005\n\u0000\u000078\u0005\u001b\u0000"+
		"\u000089\u0005\u000b\u0000\u00009?\u0003\b\u0004\u0000:;\u0005\n\u0000"+
		"\u0000;<\u0005\u001b\u0000\u0000<=\u0005\u000b\u0000\u0000=?\u0005\u001a"+
		"\u0000\u0000>3\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>:\u0001"+
		"\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0005\u0015\u0000\u0000BC\u0005\u0002\u0000\u0000CD\u0005\n\u0000\u0000"+
		"DR\u0003\n\u0005\u0000EF\u0005\u0001\u0000\u0000FG\u0005\u0015\u0000\u0000"+
		"GH\u0005\u0002\u0000\u0000HI\u0005\u001a\u0000\u0000IJ\u0005\u0003\u0000"+
		"\u0000JR\u0003\n\u0005\u0000KL\u0005\u0001\u0000\u0000LM\u0005\u0015\u0000"+
		"\u0000MN\u0005\u0002\u0000\u0000NO\u0005\u001a\u0000\u0000OP\u0005\u0003"+
		"\u0000\u0000PR\u0005\f\u0000\u0000Q@\u0001\u0000\u0000\u0000QE\u0001\u0000"+
		"\u0000\u0000QK\u0001\u0000\u0000\u0000R\u000b\u0001\u0000\u0000\u0000"+
		"ST\u0005\r\u0000\u0000TY\u0003\u000e\u0007\u0000UV\u0005\u0004\u0000\u0000"+
		"VY\u0003\u000e\u0007\u0000WY\u0001\u0000\u0000\u0000XS\u0001\u0000\u0000"+
		"\u0000XU\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000Y\r\u0001\u0000"+
		"\u0000\u0000Z[\u0006\u0007\uffff\uffff\u0000[^\u0005\u0013\u0000\u0000"+
		"\\^\u0005\u0015\u0000\u0000]Z\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^g\u0001\u0000\u0000\u0000_`\n\u0002\u0000\u0000`a\u0005\u000e\u0000"+
		"\u0000af\u0003\u000e\u0007\u0003bc\n\u0001\u0000\u0000cd\u0007\u0000\u0000"+
		"\u0000df\u0003\u000e\u0007\u0002e_\u0001\u0000\u0000\u0000eb\u0001\u0000"+
		"\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000h\u000f\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000\b\u001d1>QX]eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}