// Generated from /home/giovanni/dev/grasp/antlr4/SmodelsOutput.g4 by ANTLR 4.5.3
package grasp.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmodelsOutputLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SMODELSHEADER", "ANSWERHEADER", "STABELMODELHEADER", 
		"FALSE", "DURATION", "CHOICEPOINTS", "WRONGCHOICES", "ATOMS", "RULES", 
		"PICKEDATOMS", "FORCEDATOMS", "TRUTHASSIGNMENTS", "SIZESEARCHSPACE", "MINUS", 
		"COMMA", "LPAR", "RPAR", "INTEGER", "FLOAT", "IDENTIFIER", "SPACES"
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


	public SmodelsOutputLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SmodelsOutput.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0160\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u0143\n\25\f\25\16\25\u0146\13\25\5\25\u0148\n\25\5\25\u014a"+
		"\n\25\3\26\3\26\3\26\7\26\u014f\n\26\f\26\16\26\u0152\13\26\5\26\u0154"+
		"\n\26\3\27\3\27\7\27\u0158\n\27\f\27\16\27\u015b\13\27\3\30\3\30\3\30"+
		"\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2\63;\3\2"+
		"\62;\3\2c|\6\2\62;C\\aac|\5\2\13\r\17\17\"\"\u0165\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\64\3"+
		"\2\2\2\7\67\3\2\2\2\t\\\3\2\2\2\13c\3\2\2\2\rp\3\2\2\2\17v\3\2\2\2\21"+
		"\177\3\2\2\2\23\u0097\3\2\2\2\25\u00af\3\2\2\2\27\u00bf\3\2\2\2\31\u00cf"+
		"\3\2\2\2\33\u00e6\3\2\2\2\35\u00fd\3\2\2\2\37\u0119\3\2\2\2!\u0137\3\2"+
		"\2\2#\u0139\3\2\2\2%\u013b\3\2\2\2\'\u013d\3\2\2\2)\u0149\3\2\2\2+\u014b"+
		"\3\2\2\2-\u0155\3\2\2\2/\u015c\3\2\2\2\61\62\7<\2\2\62\63\7\"\2\2\63\4"+
		"\3\2\2\2\64\65\7\"\2\2\65\66\7*\2\2\66\6\3\2\2\2\678\7u\2\289\7o\2\29"+
		":\7q\2\2:;\7f\2\2;<\7g\2\2<=\7n\2\2=>\7u\2\2>?\7\"\2\2?@\7x\2\2@A\7g\2"+
		"\2AB\7t\2\2BC\7u\2\2CD\7k\2\2DE\7q\2\2EF\7p\2\2FG\7\"\2\2GH\7\64\2\2H"+
		"I\7\60\2\2IJ\7\65\2\2JK\7\66\2\2KL\7\60\2\2LM\7\"\2\2MN\7T\2\2NO\7g\2"+
		"\2OP\7c\2\2PQ\7f\2\2QR\7k\2\2RS\7p\2\2ST\7i\2\2TU\7\60\2\2UV\7\60\2\2"+
		"VW\7\60\2\2WX\7f\2\2XY\7q\2\2YZ\7p\2\2Z[\7g\2\2[\b\3\2\2\2\\]\7C\2\2]"+
		"^\7p\2\2^_\7u\2\2_`\7y\2\2`a\7g\2\2ab\7t\2\2b\n\3\2\2\2cd\7U\2\2de\7v"+
		"\2\2ef\7c\2\2fg\7d\2\2gh\7n\2\2hi\7g\2\2ij\7\"\2\2jk\7O\2\2kl\7q\2\2l"+
		"m\7f\2\2mn\7g\2\2no\7n\2\2o\f\3\2\2\2pq\7H\2\2qr\7c\2\2rs\7n\2\2st\7u"+
		"\2\2tu\7g\2\2u\16\3\2\2\2vw\7F\2\2wx\7w\2\2xy\7t\2\2yz\7c\2\2z{\7v\2\2"+
		"{|\7k\2\2|}\7q\2\2}~\7p\2\2~\20\3\2\2\2\177\u0080\7P\2\2\u0080\u0081\7"+
		"w\2\2\u0081\u0082\7o\2\2\u0082\u0083\7d\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7\"\2\2\u0086\u0087\7q\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7\"\2\2\u0089\u008a\7e\2\2\u008a\u008b\7j\2\2\u008b\u008c\7q\2"+
		"\2\u008c\u008d\7k\2\2\u008d\u008e\7e\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7\"\2\2\u0090\u0091\7r\2\2\u0091\u0092\7q\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095\u0096\7u\2\2\u0096\22\3\2\2\2\u0097"+
		"\u0098\7P\2\2\u0098\u0099\7w\2\2\u0099\u009a\7o\2\2\u009a\u009b\7d\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2\u009d\u009e\7\"\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7\"\2\2\u00a1\u00a2\7y\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7i\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa"+
		"\7q\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7o\2\2\u00b2\u00b3\7d\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9"+
		"\7\"\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7o\2\2\u00bd\u00be\7u\2\2\u00be\26\3\2\2\2\u00bf\u00c0\7P\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\u00c5\7t\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8"+
		"\7h\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7u\2\2\u00ce\30\3\2\2\2\u00cf"+
		"\u00d0\7P\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7o\2\2\u00d2\u00d3\7d\2\2"+
		"\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7"+
		"\7q\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7r\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7m\2\2\u00dd\u00de\7g\2\2"+
		"\u00de\u00df\7f\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7v\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7u\2\2\u00e5"+
		"\32\3\2\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7o\2\2\u00e9"+
		"\u00ea\7d\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7\"\2"+
		"\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7\"\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7e\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7f\2\2\u00f6\u00f7\7\"\2\2\u00f7\u00f8\7c\2"+
		"\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7o\2\2\u00fb\u00fc"+
		"\7u\2\2\u00fc\34\3\2\2\2\u00fd\u00fe\7P\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\7o\2\2\u0100\u0101\7d\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103"+
		"\u0104\7\"\2\2\u0104\u0105\7q\2\2\u0105\u0106\7h\2\2\u0106\u0107\7\"\2"+
		"\2\u0107\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7\"\2\2\u010d\u010e\7c\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u0110\7u\2\2\u0110\u0111\7k\2\2\u0111\u0112\7i\2\2"+
		"\u0112\u0113\7p\2\2\u0113\u0114\7o\2\2\u0114\u0115\7g\2\2\u0115\u0116"+
		"\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118\7u\2\2\u0118\36\3\2\2\2\u0119\u011a"+
		"\7U\2\2\u011a\u011b\7k\2\2\u011b\u011c\7|\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7\"\2\2\u011e\u011f\7q\2\2\u011f\u0120\7h\2\2\u0120\u0121\7\"\2"+
		"\2\u0121\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123\u0124\7c\2\2\u0124\u0125"+
		"\7t\2\2\u0125\u0126\7e\2\2\u0126\u0127\7j\2\2\u0127\u0128\7u\2\2\u0128"+
		"\u0129\7r\2\2\u0129\u012a\7c\2\2\u012a\u012b\7e\2\2\u012b\u012c\7g\2\2"+
		"\u012c\u012d\7\"\2\2\u012d\u012e\7*\2\2\u012e\u012f\7t\2\2\u012f\u0130"+
		"\7g\2\2\u0130\u0131\7o\2\2\u0131\u0132\7q\2\2\u0132\u0133\7x\2\2\u0133"+
		"\u0134\7g\2\2\u0134\u0135\7f\2\2\u0135\u0136\7+\2\2\u0136 \3\2\2\2\u0137"+
		"\u0138\7/\2\2\u0138\"\3\2\2\2\u0139\u013a\7.\2\2\u013a$\3\2\2\2\u013b"+
		"\u013c\7*\2\2\u013c&\3\2\2\2\u013d\u013e\7+\2\2\u013e(\3\2\2\2\u013f\u014a"+
		"\7\62\2\2\u0140\u0147\t\2\2\2\u0141\u0143\t\3\2\2\u0142\u0141\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u013f\3\2\2\2\u0149\u0140\3\2\2\2\u014a*\3\2\2\2"+
		"\u014b\u0153\t\3\2\2\u014c\u0150\7\60\2\2\u014d\u014f\t\3\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u014c\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154,\3\2\2\2\u0155\u0159\t\4\2\2\u0156\u0158\t\5\2\2\u0157\u0156"+
		"\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		".\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\t\6\2\2\u015d\u015e\3\2\2\2"+
		"\u015e\u015f\b\30\2\2\u015f\60\3\2\2\2\t\2\u0144\u0147\u0149\u0150\u0153"+
		"\u0159\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}