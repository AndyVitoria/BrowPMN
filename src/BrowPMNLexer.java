// Generated from BrowPMN.g4 by ANTLR 4.5.1

import struct.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrowPMNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTAG=1, COMMA=2, TAGINICIO=3, TAGFIM=4, LPAR=5, RPAR=6, PROXIMO=7, 
		LCOL=8, RCOL=9, STRING=10, ID=11, NEWLINE=12, ATRIBUICAO=13, WHILE=14, 
		IF=15, ELIF=16, ELSE=17, DO=18, AND=19, IGNORE=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTAG", "COMMA", "TAGINICIO", "TAGFIM", "LPAR", "RPAR", "PROXIMO", 
		"LCOL", "RCOL", "WS", "CHAR", "STRTAG", "STRING", "ID", "NEWLINE", "ATRIBUICAO", 
		"WHILE", "IF", "ELIF", "ELSE", "DO", "AND", "IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "','", "'!'", "'#'", "'('", "')'", "'->'", "'{'", "'}'", 
		null, null, null, "'='", "'while'", "'if'", "'elif'", "'else'", "'do'", 
		"'and'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTAG", "COMMA", "TAGINICIO", "TAGFIM", "LPAR", "RPAR", "PROXIMO", 
		"LCOL", "RCOL", "STRING", "ID", "NEWLINE", "ATRIBUICAO", "WHILE", "IF", 
		"ELIF", "ELSE", "DO", "AND", "IGNORE"
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


	public BrowPMNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BrowPMN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16P\n\16\f\16\16"+
		"\16S\13\16\3\16\3\16\3\17\3\17\7\17Y\n\17\f\17\16\17\\\13\17\3\20\5\20"+
		"_\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\6\30\u0080\n\30\r\30\16\30\u0081\3\30\3\30\2\2\31"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\f\35\r\37"+
		"\16!\17#\20%\21\'\22)\23+\24-\25/\26\3\2\6\5\2\62;C\\c|\5\2C\\aac|\6\2"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3"+
		"\61\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2"+
		"\2\17?\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31J\3\2"+
		"\2\2\33L\3\2\2\2\35V\3\2\2\2\37^\3\2\2\2!b\3\2\2\2#d\3\2\2\2%j\3\2\2\2"+
		"\'m\3\2\2\2)r\3\2\2\2+w\3\2\2\2-z\3\2\2\2/\177\3\2\2\2\61\62\7f\2\2\62"+
		"\63\7g\2\2\63\64\7h\2\2\64\4\3\2\2\2\65\66\7.\2\2\66\6\3\2\2\2\678\7#"+
		"\2\28\b\3\2\2\29:\7%\2\2:\n\3\2\2\2;<\7*\2\2<\f\3\2\2\2=>\7+\2\2>\16\3"+
		"\2\2\2?@\7/\2\2@A\7@\2\2A\20\3\2\2\2BC\7}\2\2C\22\3\2\2\2DE\7\177\2\2"+
		"E\24\3\2\2\2FG\7\"\2\2G\26\3\2\2\2HI\t\2\2\2I\30\3\2\2\2JK\7$\2\2K\32"+
		"\3\2\2\2LQ\5\31\r\2MP\5\27\f\2NP\5\25\13\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\31\r\2U\34\3\2\2\2VZ\t"+
		"\3\2\2WY\t\4\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\36\3\2\2\2"+
		"\\Z\3\2\2\2]_\7\17\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\f\2\2a \3\2\2"+
		"\2bc\7?\2\2c\"\3\2\2\2de\7y\2\2ef\7j\2\2fg\7k\2\2gh\7n\2\2hi\7g\2\2i$"+
		"\3\2\2\2jk\7k\2\2kl\7h\2\2l&\3\2\2\2mn\7g\2\2no\7n\2\2op\7k\2\2pq\7h\2"+
		"\2q(\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v*\3\2\2\2wx\7f\2\2xy"+
		"\7q\2\2y,\3\2\2\2z{\7c\2\2{|\7p\2\2|}\7f\2\2}.\3\2\2\2~\u0080\t\5\2\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\b\30\2\2\u0084\60\3\2\2\2\b\2OQZ^\u0081"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}