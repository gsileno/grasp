// Generated from /home/giovanni/dev/grasp/antlr4/LparseASP.g4 by ANTLR 4.5.3
package grasp.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LparseASPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, ENTAILS=4, DOT=5, COMMA=6, LPAR=7, RPAR=8, LACC=9, 
		RACC=10, EQ=11, NEQ=12, GT=13, LT=14, GE=15, LE=16, NOT=17, PLUS=18, MINUS=19, 
		DOMAIN=20, RANGE=21, INTEGER=22, IDENTIFIER=23, VARIABLE=24, SINGLE_LINE_COMMENT=25, 
		MULTILINE_COMMENT=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "WS", "ENTAILS", "DOT", "COMMA", "LPAR", "RPAR", "LACC", 
		"RACC", "EQ", "NEQ", "GT", "LT", "GE", "LE", "NAF", "PLUS", "MINUS", "DOMAIN",
		"RANGE", "INTEGER", "IDENTIFIER", "VARIABLE", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT"
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


	public LparseASPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LparseASP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\6\4C\n\4\r\4\16\4D\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27}\n\27"+
		"\f\27\16\27\u0080\13\27\5\27\u0082\n\27\3\30\3\30\7\30\u0086\n\30\f\30"+
		"\16\30\u0089\13\30\3\31\3\31\7\31\u008d\n\31\f\31\16\31\u0090\13\31\3"+
		"\32\3\32\3\32\5\32\u0095\n\32\3\32\7\32\u0098\n\32\f\32\16\32\u009b\13"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00a3\n\33\f\33\16\33\u00a6\13"+
		"\33\3\33\3\33\3\33\5\33\u00ab\n\33\3\33\3\33\3\u00a4\2\34\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\t\5\2\13\f\16\17\"\"\3"+
		"\2\63;\3\2\62;\3\2c|\6\2\62;C\\aac|\4\2C\\aa\4\2\f\f\17\17\u00b6\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5<\3\2\2\2\7B\3\2\2\2"+
		"\tH\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2"+
		"\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37`\3\2"+
		"\2\2!c\3\2\2\2#f\3\2\2\2%j\3\2\2\2\'l\3\2\2\2)n\3\2\2\2+v\3\2\2\2-\u0081"+
		"\3\2\2\2/\u0083\3\2\2\2\61\u008a\3\2\2\2\63\u0094\3\2\2\2\65\u009e\3\2"+
		"\2\2\678\7j\2\289\7k\2\29:\7f\2\2:;\7g\2\2;\4\3\2\2\2<=\7u\2\2=>\7j\2"+
		"\2>?\7q\2\2?@\7y\2\2@\6\3\2\2\2AC\t\2\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\b\4\2\2G\b\3\2\2\2HI\7<\2\2IJ\7/\2\2J\n\3\2\2"+
		"\2KL\7\60\2\2L\f\3\2\2\2MN\7.\2\2N\16\3\2\2\2OP\7*\2\2P\20\3\2\2\2QR\7"+
		"+\2\2R\22\3\2\2\2ST\7}\2\2T\24\3\2\2\2UV\7\177\2\2V\26\3\2\2\2WX\7?\2"+
		"\2X\30\3\2\2\2YZ\7#\2\2Z[\7?\2\2[\32\3\2\2\2\\]\7@\2\2]\34\3\2\2\2^_\7"+
		">\2\2_\36\3\2\2\2`a\7@\2\2ab\7?\2\2b \3\2\2\2cd\7>\2\2de\7?\2\2e\"\3\2"+
		"\2\2fg\7p\2\2gh\7q\2\2hi\7v\2\2i$\3\2\2\2jk\7-\2\2k&\3\2\2\2lm\7/\2\2"+
		"m(\3\2\2\2no\7%\2\2op\7f\2\2pq\7q\2\2qr\7o\2\2rs\7c\2\2st\7k\2\2tu\7p"+
		"\2\2u*\3\2\2\2vw\7\60\2\2wx\7\60\2\2x,\3\2\2\2y\u0082\7\62\2\2z~\t\3\2"+
		"\2{}\t\4\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081y\3\2\2\2\u0081z\3\2\2\2\u0082.\3\2\2\2\u0083"+
		"\u0087\t\5\2\2\u0084\u0086\t\6\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\60\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008e\t\7\2\2\u008b\u008d\t\6\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\62\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0095\7\'\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0095\7\61\2\2\u0094\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\3"+
		"\2\2\2\u0096\u0098\n\b\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\b\32\3\2\u009d\64\3\2\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a0\7,\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00aa\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\u00ab\7\61"+
		"\2\2\u00a9\u00ab\7\2\2\3\u00aa\u00a7\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\b\33\3\2\u00ad\66\3\2\2\2\f\2D~\u0081\u0087"+
		"\u008e\u0094\u0099\u00a4\u00aa\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}