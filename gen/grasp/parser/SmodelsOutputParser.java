// Generated from /home/giovanni/dev/grasp/antlr4/SmodelsOutput.g4 by ANTLR 4.5.3
package grasp.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmodelsOutputParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SMODELSHEADER=3, ANSWERHEADER=4, STABELMODELHEADER=5, 
		FALSE=6, DURATION=7, CHOICEPOINTS=8, WRONGCHOICES=9, ATOMS=10, RULES=11, 
		PICKEDATOMS=12, FORCEDATOMS=13, TRUTHASSIGNMENTS=14, SIZESEARCHSPACE=15, 
		MINUS=16, COMMA=17, LPAR=18, RPAR=19, INTEGER=20, FLOAT=21, IDENTIFIER=22, 
		SPACES=23;
	public static final int
		RULE_program = 0, RULE_statement_list = 1, RULE_statement = 2, RULE_answerset_list = 3, 
		RULE_answerset = 4, RULE_fact_list = 5, RULE_literal = 6, RULE_pos_literal = 7, 
		RULE_list_parameters = 8, RULE_predicate = 9, RULE_identifier = 10, RULE_constant = 11;
	public static final String[] ruleNames = {
		"program", "statement_list", "statement", "answerset_list", "answerset", 
		"fact_list", "literal", "pos_literal", "list_parameters", "predicate", 
		"identifier", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "': '", "' ('", "'smodels version 2.34. Reading...done'", "'Answer'", 
		"'Stable Model'", "'False'", "'Duration'", "'Number of choice points'", 
		"'Number of wrong choices'", "'Number of atoms'", "'Number of rules'", 
		"'Number of picked atoms'", "'Number of forced atoms'", "'Number of truth assignments'", 
		"'Size of searchspace (removed)'", "'-'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SMODELSHEADER", "ANSWERHEADER", "STABELMODELHEADER", 
		"FALSE", "DURATION", "CHOICEPOINTS", "WRONGCHOICES", "ATOMS", "RULES", 
		"PICKEDATOMS", "FORCEDATOMS", "TRUTHASSIGNMENTS", "SIZESEARCHSPACE", "MINUS", 
		"COMMA", "LPAR", "RPAR", "INTEGER", "FLOAT", "IDENTIFIER", "SPACES"
	};
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
	public String getGrammarFileName() { return "SmodelsOutput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmodelsOutputParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SmodelsOutputParser.EOF, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if (_la==SMODELSHEADER) {
				{
				setState(24);
				statement_list();
				}
			}

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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			statement();
			setState(31);
			_la = _input.LA(1);
			if (_la==SMODELSHEADER) {
				{
				setState(30);
				statement_list();
				}
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SMODELSHEADER() { return getToken(SmodelsOutputParser.SMODELSHEADER, 0); }
		public Answerset_listContext answerset_list() {
			return getRuleContext(Answerset_listContext.class,0);
		}
		public TerminalNode FALSE() { return getToken(SmodelsOutputParser.FALSE, 0); }
		public TerminalNode DURATION() { return getToken(SmodelsOutputParser.DURATION, 0); }
		public TerminalNode FLOAT() { return getToken(SmodelsOutputParser.FLOAT, 0); }
		public TerminalNode CHOICEPOINTS() { return getToken(SmodelsOutputParser.CHOICEPOINTS, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(SmodelsOutputParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(SmodelsOutputParser.INTEGER, i);
		}
		public TerminalNode WRONGCHOICES() { return getToken(SmodelsOutputParser.WRONGCHOICES, 0); }
		public TerminalNode ATOMS() { return getToken(SmodelsOutputParser.ATOMS, 0); }
		public TerminalNode RULES() { return getToken(SmodelsOutputParser.RULES, 0); }
		public TerminalNode PICKEDATOMS() { return getToken(SmodelsOutputParser.PICKEDATOMS, 0); }
		public TerminalNode FORCEDATOMS() { return getToken(SmodelsOutputParser.FORCEDATOMS, 0); }
		public TerminalNode TRUTHASSIGNMENTS() { return getToken(SmodelsOutputParser.TRUTHASSIGNMENTS, 0); }
		public TerminalNode SIZESEARCHSPACE() { return getToken(SmodelsOutputParser.SIZESEARCHSPACE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(SMODELSHEADER);
			setState(34);
			answerset_list();
			setState(35);
			match(FALSE);
			setState(36);
			match(DURATION);
			setState(37);
			match(T__0);
			setState(38);
			match(FLOAT);
			setState(39);
			match(CHOICEPOINTS);
			setState(40);
			match(T__0);
			setState(41);
			match(INTEGER);
			setState(42);
			match(WRONGCHOICES);
			setState(43);
			match(T__0);
			setState(44);
			match(INTEGER);
			setState(45);
			match(ATOMS);
			setState(46);
			match(T__0);
			setState(47);
			match(INTEGER);
			setState(48);
			match(RULES);
			setState(49);
			match(T__0);
			setState(50);
			match(INTEGER);
			setState(51);
			match(PICKEDATOMS);
			setState(52);
			match(T__0);
			setState(53);
			match(INTEGER);
			setState(54);
			match(FORCEDATOMS);
			setState(55);
			match(T__0);
			setState(56);
			match(INTEGER);
			setState(57);
			match(TRUTHASSIGNMENTS);
			setState(58);
			match(T__0);
			setState(59);
			match(INTEGER);
			setState(60);
			match(SIZESEARCHSPACE);
			setState(61);
			match(T__0);
			setState(62);
			match(INTEGER);
			setState(63);
			match(T__1);
			setState(64);
			match(INTEGER);
			setState(65);
			match(RPAR);
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

	public static class Answerset_listContext extends ParserRuleContext {
		public List<AnswersetContext> answerset() {
			return getRuleContexts(AnswersetContext.class);
		}
		public AnswersetContext answerset(int i) {
			return getRuleContext(AnswersetContext.class,i);
		}
		public Answerset_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerset_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterAnswerset_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitAnswerset_list(this);
		}
	}

	public final Answerset_listContext answerset_list() throws RecognitionException {
		Answerset_listContext _localctx = new Answerset_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_answerset_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				answerset();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANSWERHEADER );
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

	public static class AnswersetContext extends ParserRuleContext {
		public TerminalNode ANSWERHEADER() { return getToken(SmodelsOutputParser.ANSWERHEADER, 0); }
		public TerminalNode INTEGER() { return getToken(SmodelsOutputParser.INTEGER, 0); }
		public TerminalNode STABELMODELHEADER() { return getToken(SmodelsOutputParser.STABELMODELHEADER, 0); }
		public Fact_listContext fact_list() {
			return getRuleContext(Fact_listContext.class,0);
		}
		public AnswersetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterAnswerset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitAnswerset(this);
		}
	}

	public final AnswersetContext answerset() throws RecognitionException {
		AnswersetContext _localctx = new AnswersetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_answerset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(ANSWERHEADER);
			setState(73);
			match(T__0);
			setState(74);
			match(INTEGER);
			setState(75);
			match(STABELMODELHEADER);
			setState(76);
			match(T__0);
			setState(77);
			fact_list();
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

	public static class Fact_listContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Fact_listContext fact_list() {
			return getRuleContext(Fact_listContext.class,0);
		}
		public Fact_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterFact_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitFact_list(this);
		}
	}

	public final Fact_listContext fact_list() throws RecognitionException {
		Fact_listContext _localctx = new Fact_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			literal();
			setState(81);
			_la = _input.LA(1);
			if (_la==MINUS || _la==IDENTIFIER) {
				{
				setState(80);
				fact_list();
				}
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

	public static class LiteralContext extends ParserRuleContext {
		public Pos_literalContext pos_literal() {
			return getRuleContext(Pos_literalContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SmodelsOutputParser.MINUS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(83);
				match(MINUS);
				}
			}

			setState(86);
			pos_literal();
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

	public static class Pos_literalContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SmodelsOutputParser.LPAR, 0); }
		public List_parametersContext list_parameters() {
			return getRuleContext(List_parametersContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SmodelsOutputParser.RPAR, 0); }
		public Pos_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterPos_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitPos_literal(this);
		}
	}

	public final Pos_literalContext pos_literal() throws RecognitionException {
		Pos_literalContext _localctx = new Pos_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pos_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			predicate();
			setState(93);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(89);
				match(LPAR);
				setState(90);
				list_parameters();
				setState(91);
				match(RPAR);
				}
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

	public static class List_parametersContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Pos_literalContext pos_literal() {
			return getRuleContext(Pos_literalContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SmodelsOutputParser.COMMA, 0); }
		public List_parametersContext list_parameters() {
			return getRuleContext(List_parametersContext.class,0);
		}
		public List_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterList_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitList_parameters(this);
		}
	}

	public final List_parametersContext list_parameters() throws RecognitionException {
		List_parametersContext _localctx = new List_parametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(95);
				identifier();
				}
				break;
			case 2:
				{
				setState(96);
				constant();
				}
				break;
			case 3:
				{
				setState(97);
				pos_literal();
				}
				break;
			}
			setState(102);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(100);
				match(COMMA);
				setState(101);
				list_parameters();
				}
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmodelsOutputParser.IDENTIFIER, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmodelsOutputParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SmodelsOutputParser.INTEGER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmodelsOutputListener ) ((SmodelsOutputListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(INTEGER);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\5\2\34\n\2\3\2\3\2\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5G\n\5\r\5"+
		"\16\5H\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7T\n\7\3\b\5\bW\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\5\ne\n\n\3\n\3\n\5\ni\n\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2"+
		"\2m\2\33\3\2\2\2\4\37\3\2\2\2\6#\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fQ\3\2"+
		"\2\2\16V\3\2\2\2\20Z\3\2\2\2\22d\3\2\2\2\24j\3\2\2\2\26l\3\2\2\2\30n\3"+
		"\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7"+
		"\2\2\3\36\3\3\2\2\2\37!\5\6\4\2 \"\5\4\3\2! \3\2\2\2!\"\3\2\2\2\"\5\3"+
		"\2\2\2#$\7\5\2\2$%\5\b\5\2%&\7\b\2\2&\'\7\t\2\2\'(\7\3\2\2()\7\27\2\2"+
		")*\7\n\2\2*+\7\3\2\2+,\7\26\2\2,-\7\13\2\2-.\7\3\2\2./\7\26\2\2/\60\7"+
		"\f\2\2\60\61\7\3\2\2\61\62\7\26\2\2\62\63\7\r\2\2\63\64\7\3\2\2\64\65"+
		"\7\26\2\2\65\66\7\16\2\2\66\67\7\3\2\2\678\7\26\2\289\7\17\2\29:\7\3\2"+
		"\2:;\7\26\2\2;<\7\20\2\2<=\7\3\2\2=>\7\26\2\2>?\7\21\2\2?@\7\3\2\2@A\7"+
		"\26\2\2AB\7\4\2\2BC\7\26\2\2CD\7\25\2\2D\7\3\2\2\2EG\5\n\6\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JK\7\6\2\2KL\7\3\2\2LM\7\26\2"+
		"\2MN\7\7\2\2NO\7\3\2\2OP\5\f\7\2P\13\3\2\2\2QS\5\16\b\2RT\5\f\7\2SR\3"+
		"\2\2\2ST\3\2\2\2T\r\3\2\2\2UW\7\22\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2X"+
		"Y\5\20\t\2Y\17\3\2\2\2Z_\5\24\13\2[\\\7\24\2\2\\]\5\22\n\2]^\7\25\2\2"+
		"^`\3\2\2\2_[\3\2\2\2_`\3\2\2\2`\21\3\2\2\2ae\5\26\f\2be\5\30\r\2ce\5\20"+
		"\t\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fg\7\23\2\2gi\5\22\n\2hf\3"+
		"\2\2\2hi\3\2\2\2i\23\3\2\2\2jk\7\30\2\2k\25\3\2\2\2lm\7\30\2\2m\27\3\2"+
		"\2\2no\7\26\2\2o\31\3\2\2\2\n\33!HSV_dh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}