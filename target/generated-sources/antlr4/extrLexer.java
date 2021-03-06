// Generated from extr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class extrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, JOURNAL=22, NUMERO=23, IDENTIFICADOR=24, 
		ACENTOS=25, NEWLINE=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", 
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "JOURNAL", "NUMERO", "IDENTIFICADOR", 
		"ACENTOS", "NEWLINE", "WS"
	};


	public extrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "extr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\6\30\u0082\n\30\r\30\16\30\u0083\3\31\6\31\u0087\n\31"+
		"\r\31\16\31\u0088\3\32\6\32\u008c\n\32\r\32\16\32\u008d\3\33\3\33\3\33"+
		"\3\34\6\34\u0094\n\34\r\34\16\34\u0095\3\34\3\34\2\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\5\3\2\62;\4\2C\\"+
		"c|\4\2\13\13\"\"\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\39\3\2\2\2\5;\3\2\2\2\7>\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2"+
		"\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31X\3"+
		"\2\2\2\33Z\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2"+
		"\2\2\'n\3\2\2\2)p\3\2\2\2+r\3\2\2\2-t\3\2\2\2/\u0081\3\2\2\2\61\u0086"+
		"\3\2\2\2\63\u008b\3\2\2\2\65\u008f\3\2\2\2\67\u0093\3\2\2\29:\7\61\2\2"+
		":\4\3\2\2\2;<\7^\2\2<=\7\'\2\2=\6\3\2\2\2>?\7U\2\2?@\7w\2\2@A\7d\2\2A"+
		"B\7l\2\2BC\7g\2\2CD\7e\2\2DE\7v\2\2EF\7u\2\2F\b\3\2\2\2GH\7<\2\2H\n\3"+
		"\2\2\2IJ\7^\2\2J\f\3\2\2\2KL\7]\2\2L\16\3\2\2\2MN\7=\2\2N\20\3\2\2\2O"+
		"P\7$\2\2PQ\7$\2\2Q\22\3\2\2\2RS\7_\2\2S\24\3\2\2\2TU\7A\2\2U\26\3\2\2"+
		"\2VW\7a\2\2W\30\3\2\2\2XY\7$\2\2Y\32\3\2\2\2Z[\7$\2\2[\34\3\2\2\2\\]\7"+
		"\'\2\2]\36\3\2\2\2^_\7E\2\2_`\7q\2\2`a\7o\2\2ab\7o\2\2bc\7g\2\2cd\7p\2"+
		"\2de\7v\2\2ef\7u\2\2fg\7<\2\2g \3\2\2\2hi\7(\2\2i\"\3\2\2\2jk\7*\2\2k"+
		"$\3\2\2\2lm\7+\2\2m&\3\2\2\2no\7.\2\2o(\3\2\2\2pq\7/\2\2q*\3\2\2\2rs\7"+
		"\60\2\2s,\3\2\2\2tu\7L\2\2uv\7q\2\2vw\7w\2\2wx\7t\2\2xy\7p\2\2yz\7c\2"+
		"\2z{\7n\2\2{|\7/\2\2|}\7t\2\2}~\7g\2\2~\177\7h\2\2\177.\3\2\2\2\u0080"+
		"\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\60\3\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\62\3\2\2\2\u008a\u008c\4\u00c2\u0101\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\64\3\2\2\2\u008f"+
		"\u0090\7\17\2\2\u0090\u0091\7\f\2\2\u0091\66\3\2\2\2\u0092\u0094\t\4\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\34\2\2\u00988\3\2\2\2\7\2\u0083"+
		"\u0088\u008d\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}