// Generated from BrowPMN.g4 by ANTLR 4.5

import struct.*;
import static struct.Node.*;

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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TAGINICIO=8, TAGFIM=9, 
		LPAR=10, RPAR=11, OPEN=12, CLOSE=13, PROXIMO=14, STRING=15, ID=16, NEWLINE=17, 
		ATRIBUICAO=18, IGNORE=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TAGINICIO", "TAGFIM", 
		"LPAR", "RPAR", "OPEN", "CLOSE", "PROXIMO", "WS", "CHAR", "STRTAG", "STRING", 
		"ID", "NEWLINE", "ATRIBUICAO", "IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'+'", "'@'", "'if'", "','", "'do'", "'while'", "'!'", "'#'", 
		"'('", "')'", "'{'", "'}'", "'->'", null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "TAGINICIO", "TAGFIM", 
		"LPAR", "RPAR", "OPEN", "CLOSE", "PROXIMO", "STRING", "ID", "NEWLINE", 
		"ATRIBUICAO", "IGNORE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23\\\n\23\f\23\16\23_\13\23\3\23\3"+
		"\23\3\24\3\24\7\24e\n\24\f\24\16\24h\13\24\3\25\5\25k\n\25\3\25\3\25\3"+
		"\26\3\26\3\27\6\27r\n\27\r\27\16\27s\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\21\'"+
		"\22)\23+\24-\25\3\2\6\5\2\62;C\\c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2"+
		"\t\65\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17=\3\2\2\2\21C\3\2\2\2\23E\3\2\2"+
		"\2\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37R\3\2"+
		"\2\2!T\3\2\2\2#V\3\2\2\2%X\3\2\2\2\'b\3\2\2\2)j\3\2\2\2+n\3\2\2\2-q\3"+
		"\2\2\2/\60\7,\2\2\60\4\3\2\2\2\61\62\7-\2\2\62\6\3\2\2\2\63\64\7B\2\2"+
		"\64\b\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\n\3\2\2\289\7.\2\29\f\3\2\2"+
		"\2:;\7f\2\2;<\7q\2\2<\16\3\2\2\2=>\7y\2\2>?\7j\2\2?@\7k\2\2@A\7n\2\2A"+
		"B\7g\2\2B\20\3\2\2\2CD\7#\2\2D\22\3\2\2\2EF\7%\2\2F\24\3\2\2\2GH\7*\2"+
		"\2H\26\3\2\2\2IJ\7+\2\2J\30\3\2\2\2KL\7}\2\2L\32\3\2\2\2MN\7\177\2\2N"+
		"\34\3\2\2\2OP\7/\2\2PQ\7@\2\2Q\36\3\2\2\2RS\7\"\2\2S \3\2\2\2TU\t\2\2"+
		"\2U\"\3\2\2\2VW\7$\2\2W$\3\2\2\2X]\5#\22\2Y\\\5!\21\2Z\\\5\37\20\2[Y\3"+
		"\2\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a"+
		"\5#\22\2a&\3\2\2\2bf\t\3\2\2ce\t\4\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2f"+
		"g\3\2\2\2g(\3\2\2\2hf\3\2\2\2ik\7\17\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2"+
		"lm\7\f\2\2m*\3\2\2\2no\7?\2\2o,\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\27\2\2v.\3\2\2\2\b\2[]fjs\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}