// Generated from BrowPMN.g4 by ANTLR 4.5.1

import ast.Expr;
import static ast.Expr.*;
import ast.Op;

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
		STRING=1, ID=2, NEWLINE=3, GETS=4, IGNORE=5;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "CHAR", "STRTAG", "STRING", "ID", "NEWLINE", "GETS", "IGNORE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "ID", "NEWLINE", "GETS", "IGNORE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\78\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\7\5\35\n\5\f\5\16\5 \13\5\3\5\3\5\3\6\3\6\7\6&\n"+
		"\6\f\6\16\6)\13\6\3\7\5\7,\n\7\3\7\3\7\3\b\3\b\3\t\6\t\63\n\t\r\t\16\t"+
		"\64\3\t\3\t\2\2\n\3\2\5\2\7\2\t\3\13\4\r\5\17\6\21\7\3\2\6\5\2\62;C\\"+
		"c|\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"9\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7"+
		"\27\3\2\2\2\t\31\3\2\2\2\13#\3\2\2\2\r+\3\2\2\2\17/\3\2\2\2\21\62\3\2"+
		"\2\2\23\24\7\"\2\2\24\4\3\2\2\2\25\26\t\2\2\2\26\6\3\2\2\2\27\30\7$\2"+
		"\2\30\b\3\2\2\2\31\36\5\7\4\2\32\35\5\5\3\2\33\35\5\3\2\2\34\32\3\2\2"+
		"\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 "+
		"\36\3\2\2\2!\"\5\7\4\2\"\n\3\2\2\2#\'\t\3\2\2$&\t\4\2\2%$\3\2\2\2&)\3"+
		"\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\f\3\2\2\2)\'\3\2\2\2*,\7\17\2\2+*\3\2\2"+
		"\2+,\3\2\2\2,-\3\2\2\2-.\7\f\2\2.\16\3\2\2\2/\60\7?\2\2\60\20\3\2\2\2"+
		"\61\63\t\5\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\b\t\2\2\67\22\3\2\2\2\b\2\34\36\'+\64\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}