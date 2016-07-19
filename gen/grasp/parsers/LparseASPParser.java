// Generated from /home/giovanni/dev/grasp/antlr4/LparseASP.g4 by ANTLR 4.5.3
package grasp.parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LparseASPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, ENTAILS=4, DOT=5, COMMA=6, LPAR=7, RPAR=8, LACC=9, 
		RACC=10, EQ=11, NEQ=12, GT=13, LT=14, GE=15, LE=16, NOT=17, PLUS=18, MINUS=19, 
		DOMAIN=20, RANGE=21, INTEGER=22, IDENTIFIER=23, VARIABLE=24, SINGLE_LINE_COMMENT=25, 
		MULTILINE_COMMENT=26;
	public static final int
		RULE_program = 0, RULE_directive = 1, RULE_asprule = 2, RULE_aspfact = 3, 
		RULE_range = 4, RULE_normrule = 5, RULE_constraint = 6, RULE_choice = 7, 
		RULE_head = 8, RULE_body = 9, RULE_list_literals = 10, RULE_list_ext_literals_expressions = 11, 
		RULE_expression = 12, RULE_num_expression = 13, RULE_ext_literal = 14, 
		RULE_literal = 15, RULE_pos_literal = 16, RULE_list_parameters = 17, RULE_predicate = 18, 
		RULE_identifier = 19, RULE_constant = 20, RULE_variable = 21;
	public static final String[] ruleNames = {
		"program", "directive", "asprule", "aspfact", "range", "normrule", "constraint", 
		"choice", "head", "body", "list_literals", "list_ext_literals_expressions", 
		"expression", "num_expression", "ext_literal", "literal", "pos_literal", 
		"list_parameters", "atom", "identifier", "constant", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hide'", "'show'", null, "':-'", "'.'", "','", "'('", "')'", "'{'", 
		"'}'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='", "'naf'", "'+'", "'-'",
		"'#domain'", "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WS", "ENTAILS", "DOT", "COMMA", "LPAR", "RPAR", "LACC", 
		"RACC", "EQ", "NEQ", "GT", "LT", "GE", "LE", "NAF", "PLUS", "MINUS", "DOMAIN",
		"RANGE", "INTEGER", "IDENTIFIER", "VARIABLE", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "LparseASP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LparseASPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LparseASPParser.EOF, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<AspfactContext> aspfact() {
			return getRuleContexts(AspfactContext.class);
		}
		public AspfactContext aspfact(int i) {
			return getRuleContext(AspfactContext.class,i);
		}
		public List<AspruleContext> asprule() {
			return getRuleContexts(AspruleContext.class);
		}
		public AspruleContext asprule(int i) {
			return getRuleContext(AspruleContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << ENTAILS) | (1L << LACC) | (1L << MINUS) | (1L << DOMAIN) | (1L << INTEGER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					directive();
					}
					break;
				case 2:
					{
					setState(45);
					aspfact();
					}
					break;
				case 3:
					{
					setState(46);
					asprule();
					}
					break;
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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

	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode DOMAIN() { return getToken(LparseASPParser.DOMAIN, 0); }
		public List_literalsContext list_literals() {
			return getRuleContext(List_literalsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LparseASPParser.DOT, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		int _la;
		try {
			setState(63);
			switch (_input.LA(1)) {
			case DOMAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(DOMAIN);
				setState(55);
				list_literals();
				setState(56);
				match(DOT);
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(60);
				_la = _input.LA(1);
				if (_la==MINUS || _la==IDENTIFIER) {
					{
					setState(59);
					list_literals();
					}
				}

				setState(62);
				match(DOT);
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

	public static class AspruleContext extends ParserRuleContext {
		public NormruleContext normrule() {
			return getRuleContext(NormruleContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public AspruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asprule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterAsprule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitAsprule(this);
		}
	}

	public final AspruleContext asprule() throws RecognitionException {
		AspruleContext _localctx = new AspruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asprule);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case LACC:
			case MINUS:
			case INTEGER:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				normrule();
				}
				break;
			case ENTAILS:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				constraint();
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

	public static class AspfactContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(LparseASPParser.DOT, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public AspfactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspfact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterAspfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitAspfact(this);
		}
	}

	public final AspfactContext aspfact() throws RecognitionException {
		AspfactContext _localctx = new AspfactContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aspfact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(69);
				head();
				}
				break;
			case 2:
				{
				setState(70);
				range();
				}
				break;
			}
			setState(73);
			match(DOT);
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

	public static class RangeContext extends ParserRuleContext {
		public Token min;
		public Token max;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(LparseASPParser.LPAR, 0); }
		public TerminalNode RANGE() { return getToken(LparseASPParser.RANGE, 0); }
		public TerminalNode RPAR() { return getToken(LparseASPParser.RPAR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(LparseASPParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LparseASPParser.INTEGER, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			identifier();
			setState(76);
			match(LPAR);
			setState(77);
			((RangeContext)_localctx).min = match(INTEGER);
			setState(78);
			match(RANGE);
			setState(79);
			((RangeContext)_localctx).max = match(INTEGER);
			setState(80);
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

	public static class NormruleContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode ENTAILS() { return getToken(LparseASPParser.ENTAILS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LparseASPParser.DOT, 0); }
		public NormruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterNormrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitNormrule(this);
		}
	}

	public final NormruleContext normrule() throws RecognitionException {
		NormruleContext _localctx = new NormruleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_normrule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			head();
			setState(83);
			match(ENTAILS);
			setState(84);
			body();
			setState(85);
			match(DOT);
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode ENTAILS() { return getToken(LparseASPParser.ENTAILS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LparseASPParser.DOT, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ENTAILS);
			setState(88);
			body();
			setState(89);
			match(DOT);
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

	public static class ChoiceContext extends ParserRuleContext {
		public Token min;
		public Token max;
		public TerminalNode LACC() { return getToken(LparseASPParser.LACC, 0); }
		public List_literalsContext list_literals() {
			return getRuleContext(List_literalsContext.class,0);
		}
		public TerminalNode RACC() { return getToken(LparseASPParser.RACC, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(LparseASPParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LparseASPParser.INTEGER, i);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitChoice(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(91);
				((ChoiceContext)_localctx).min = match(INTEGER);
				}
			}

			setState(94);
			match(LACC);
			setState(95);
			list_literals();
			setState(96);
			match(RACC);
			setState(98);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(97);
				((ChoiceContext)_localctx).max = match(INTEGER);
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

	public static class HeadContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_head);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case MINUS:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				literal();
				}
				break;
			case LACC:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				choice();
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

	public static class BodyContext extends ParserRuleContext {
		public List_ext_literals_expressionsContext list_ext_literals_expressions() {
			return getRuleContext(List_ext_literals_expressionsContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				list_ext_literals_expressions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				choice();
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

	public static class List_literalsContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LparseASPParser.COMMA, 0); }
		public List_literalsContext list_literals() {
			return getRuleContext(List_literalsContext.class,0);
		}
		public List_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterList_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitList_literals(this);
		}
	}

	public final List_literalsContext list_literals() throws RecognitionException {
		List_literalsContext _localctx = new List_literalsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			literal();
			setState(111);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(109);
				match(COMMA);
				setState(110);
				list_literals();
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

	public static class List_ext_literals_expressionsContext extends ParserRuleContext {
		public Ext_literalContext ext_literal() {
			return getRuleContext(Ext_literalContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LparseASPParser.COMMA, 0); }
		public List_ext_literals_expressionsContext list_ext_literals_expressions() {
			return getRuleContext(List_ext_literals_expressionsContext.class,0);
		}
		public List_ext_literals_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ext_literals_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterList_ext_literals_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitList_ext_literals_expressions(this);
		}
	}

	public final List_ext_literals_expressionsContext list_ext_literals_expressions() throws RecognitionException {
		List_ext_literals_expressionsContext _localctx = new List_ext_literals_expressionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_ext_literals_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(113);
				ext_literal();
				}
				break;
			case 2:
				{
				setState(114);
				expression();
				}
				break;
			}
			setState(119);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(117);
				match(COMMA);
				setState(118);
				list_ext_literals_expressions();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LparseASPParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LparseASPParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(LparseASPParser.LT, 0); }
		public TerminalNode LE() { return getToken(LparseASPParser.LE, 0); }
		public TerminalNode GT() { return getToken(LparseASPParser.GT, 0); }
		public TerminalNode GE() { return getToken(LparseASPParser.GE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> INTEGER() { return getTokens(LparseASPParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LparseASPParser.INTEGER, i);
		}
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(LparseASPParser.IDENTIFIER, 0); }
		public TerminalNode VARIABLE() { return getToken(LparseASPParser.VARIABLE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(121);
				identifier();
				}
				break;
			case 2:
				{
				setState(122);
				variable();
				}
				break;
			case 3:
				{
				setState(123);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(124);
				num_expression();
				}
				break;
			}
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(129);
				match(VARIABLE);
				}
				break;
			case 3:
				{
				setState(130);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(131);
				num_expression();
				}
				break;
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

	public static class Num_expressionContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LparseASPParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LparseASPParser.MINUS, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(LparseASPParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LparseASPParser.INTEGER, i);
		}
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitNum_expression(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_num_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(134);
				variable();
				}
				break;
			case INTEGER:
				{
				setState(135);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(141);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(139);
				variable();
				}
				break;
			case INTEGER:
				{
				setState(140);
				match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ext_literalContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LparseASPParser.NOT, 0); }
		public Ext_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ext_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterExt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitExt_literal(this);
		}
	}

	public final Ext_literalContext ext_literal() throws RecognitionException {
		Ext_literalContext _localctx = new Ext_literalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ext_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(143);
				match(NOT);
				}
			}

			setState(146);
			literal();
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
		public TerminalNode MINUS() { return getToken(LparseASPParser.MINUS, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(148);
				match(MINUS);
				}
			}

			setState(151);
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
		public TerminalNode LPAR() { return getToken(LparseASPParser.LPAR, 0); }
		public List_parametersContext list_parameters() {
			return getRuleContext(List_parametersContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(LparseASPParser.RPAR, 0); }
		public Pos_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterPos_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitPos_literal(this);
		}
	}

	public final Pos_literalContext pos_literal() throws RecognitionException {
		Pos_literalContext _localctx = new Pos_literalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pos_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			predicate();
			setState(158);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(154);
				match(LPAR);
				setState(155);
				list_parameters();
				setState(156);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LparseASPParser.COMMA, 0); }
		public List_parametersContext list_parameters() {
			return getRuleContext(List_parametersContext.class,0);
		}
		public List_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterList_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitList_parameters(this);
		}
	}

	public final List_parametersContext list_parameters() throws RecognitionException {
		List_parametersContext _localctx = new List_parametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(160);
				identifier();
				}
				break;
			case 2:
				{
				setState(161);
				variable();
				}
				break;
			case 3:
				{
				setState(162);
				constant();
				}
				break;
			case 4:
				{
				setState(163);
				num_expression();
				}
				break;
			}
			setState(168);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(166);
				match(COMMA);
				setState(167);
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
		public TerminalNode IDENTIFIER() { return getToken(LparseASPParser.IDENTIFIER, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
		public TerminalNode IDENTIFIER() { return getToken(LparseASPParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		public TerminalNode INTEGER() { return getToken(LparseASPParser.INTEGER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(LparseASPParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LparseASPListener ) ((LparseASPListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(VARIABLE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\3\5\3"+
		"B\n\3\3\4\3\4\5\4F\n\4\3\5\3\5\5\5J\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\5\t_\n\t\3\t\3\t\3\t\3"+
		"\t\5\te\n\t\3\n\3\n\5\ni\n\n\3\13\3\13\5\13m\n\13\3\f\3\f\3\f\5\fr\n\f"+
		"\3\r\3\r\5\rv\n\r\3\r\3\r\5\rz\n\r\3\16\3\16\3\16\3\16\5\16\u0080\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0087\n\16\3\17\3\17\5\17\u008b\n\17\3"+
		"\17\3\17\3\17\5\17\u0090\n\17\3\20\5\20\u0093\n\20\3\20\3\20\3\21\5\21"+
		"\u0098\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a1\n\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00a7\n\23\3\23\3\23\5\23\u00ab\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\5\3\2\3\4\3\2\r\22\3\2\24\25\u00bb\2\63\3\2\2\2\4A\3"+
		"\2\2\2\6E\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fT\3\2\2\2\16Y\3\2\2\2\20^\3\2"+
		"\2\2\22h\3\2\2\2\24l\3\2\2\2\26n\3\2\2\2\30u\3\2\2\2\32\177\3\2\2\2\34"+
		"\u008a\3\2\2\2\36\u0092\3\2\2\2 \u0097\3\2\2\2\"\u009b\3\2\2\2$\u00a6"+
		"\3\2\2\2&\u00ac\3\2\2\2(\u00ae\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2."+
		"\62\5\4\3\2/\62\5\b\5\2\60\62\5\6\4\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3"+
		"\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3"+
		"\2\2\2\66\67\7\2\2\3\67\3\3\2\2\289\7\26\2\29:\5\26\f\2:;\7\7\2\2;B\3"+
		"\2\2\2<>\t\2\2\2=?\5\26\f\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\7\7\2\2A8"+
		"\3\2\2\2A<\3\2\2\2B\5\3\2\2\2CF\5\f\7\2DF\5\16\b\2EC\3\2\2\2ED\3\2\2\2"+
		"F\7\3\2\2\2GJ\5\22\n\2HJ\5\n\6\2IG\3\2\2\2IH\3\2\2\2JK\3\2\2\2KL\7\7\2"+
		"\2L\t\3\2\2\2MN\5(\25\2NO\7\t\2\2OP\7\30\2\2PQ\7\27\2\2QR\7\30\2\2RS\7"+
		"\n\2\2S\13\3\2\2\2TU\5\22\n\2UV\7\6\2\2VW\5\24\13\2WX\7\7\2\2X\r\3\2\2"+
		"\2YZ\7\6\2\2Z[\5\24\13\2[\\\7\7\2\2\\\17\3\2\2\2]_\7\30\2\2^]\3\2\2\2"+
		"^_\3\2\2\2_`\3\2\2\2`a\7\13\2\2ab\5\26\f\2bd\7\f\2\2ce\7\30\2\2dc\3\2"+
		"\2\2de\3\2\2\2e\21\3\2\2\2fi\5 \21\2gi\5\20\t\2hf\3\2\2\2hg\3\2\2\2i\23"+
		"\3\2\2\2jm\5\30\r\2km\5\20\t\2lj\3\2\2\2lk\3\2\2\2m\25\3\2\2\2nq\5 \21"+
		"\2op\7\b\2\2pr\5\26\f\2qo\3\2\2\2qr\3\2\2\2r\27\3\2\2\2sv\5\36\20\2tv"+
		"\5\32\16\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wx\7\b\2\2xz\5\30\r\2yw\3\2\2"+
		"\2yz\3\2\2\2z\31\3\2\2\2{\u0080\5(\25\2|\u0080\5,\27\2}\u0080\7\30\2\2"+
		"~\u0080\5\34\17\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0086\t\3\2\2\u0082\u0087\7\31\2\2\u0083\u0087"+
		"\7\32\2\2\u0084\u0087\7\30\2\2\u0085\u0087\5\34\17\2\u0086\u0082\3\2\2"+
		"\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\33"+
		"\3\2\2\2\u0088\u008b\5,\27\2\u0089\u008b\7\30\2\2\u008a\u0088\3\2\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\t\4\2\2\u008d\u0090"+
		"\5,\27\2\u008e\u0090\7\30\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\35\3\2\2\2\u0091\u0093\7\23\2\2\u0092\u0091\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5 \21\2\u0095\37\3\2\2\2\u0096"+
		"\u0098\7\25\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\5\"\22\2\u009a!\3\2\2\2\u009b\u00a0\5&\24\2\u009c\u009d"+
		"\7\t\2\2\u009d\u009e\5$\23\2\u009e\u009f\7\n\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00a7\5(\25\2"+
		"\u00a3\u00a7\5,\27\2\u00a4\u00a7\5*\26\2\u00a5\u00a7\5\34\17\2\u00a6\u00a2"+
		"\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00ab\5$\23\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad\'\3"+
		"\2\2\2\u00ae\u00af\7\31\2\2\u00af)\3\2\2\2\u00b0\u00b1\7\30\2\2\u00b1"+
		"+\3\2\2\2\u00b2\u00b3\7\32\2\2\u00b3-\3\2\2\2\30\61\63>AEI^dhlquy\177"+
		"\u0086\u008a\u008f\u0092\u0097\u00a0\u00a6\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}