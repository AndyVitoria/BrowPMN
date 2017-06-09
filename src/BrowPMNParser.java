// Generated from BrowPMN.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrowPMNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAGINICIO=1, TAGFIM=2, LPAR=3, RPAR=4, PROXIMO=5, STRING=6, VARIAVEL=7, 
		NEWLINE=8, ATRIBUICAO=9, IGNORE=10;
	public static final int
		RULE_prog = 0, RULE_inicio = 1, RULE_assinatura = 2, RULE_fluxo = 3, RULE_valor = 4;
	public static final String[] ruleNames = {
		"prog", "inicio", "assinatura", "fluxo", "valor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'#'", "'('", "')'", "'->'", null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TAGINICIO", "TAGFIM", "LPAR", "RPAR", "PROXIMO", "STRING", "VARIAVEL", 
		"NEWLINE", "ATRIBUICAO", "IGNORE"
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
	public String getGrammarFileName() { return "BrowPMN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrowPMNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				inicio();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << VARIAVEL) | (1L << NEWLINE))) != 0) );
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

	public static class InicioContext extends ParserRuleContext {
		public AssinaturaContext assinatura() {
			return getRuleContext(AssinaturaContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		try {
			setState(19);
			switch (_input.LA(1)) {
			case TAGINICIO:
			case TAGFIM:
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				assinatura();
				setState(16);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(NEWLINE);
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

	public static class AssinaturaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BrowPMNParser.VARIAVEL, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(BrowPMNParser.ATRIBUICAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode TAGINICIO() { return getToken(BrowPMNParser.TAGINICIO, 0); }
		public TerminalNode TAGFIM() { return getToken(BrowPMNParser.TAGFIM, 0); }
		public AssinaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterAssinatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitAssinatura(this);
		}
	}

	public final AssinaturaContext assinatura() throws RecognitionException {
		AssinaturaContext _localctx = new AssinaturaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assinatura);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case VARIAVEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(VARIAVEL);
				setState(22);
				match(ATRIBUICAO);
				setState(23);
				valor();
				}
				break;
			case TAGINICIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(TAGINICIO);
				setState(25);
				match(VARIAVEL);
				setState(26);
				match(ATRIBUICAO);
				setState(27);
				valor();
				}
				break;
			case TAGFIM:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(TAGFIM);
				setState(29);
				match(VARIAVEL);
				setState(30);
				match(ATRIBUICAO);
				setState(31);
				valor();
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

	public static class FluxoContext extends ParserRuleContext {
		public List<TerminalNode> VARIAVEL() { return getTokens(BrowPMNParser.VARIAVEL); }
		public TerminalNode VARIAVEL(int i) {
			return getToken(BrowPMNParser.VARIAVEL, i);
		}
		public TerminalNode PROXIMO() { return getToken(BrowPMNParser.PROXIMO, 0); }
		public TerminalNode LPAR() { return getToken(BrowPMNParser.LPAR, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public TerminalNode RPAR() { return getToken(BrowPMNParser.RPAR, 0); }
		public FluxoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fluxo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterFluxo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitFluxo(this);
		}
	}

	public final FluxoContext fluxo() throws RecognitionException {
		FluxoContext _localctx = new FluxoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fluxo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(VARIAVEL);
			setState(35);
			match(PROXIMO);
			setState(36);
			match(VARIAVEL);
			setState(40);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(37);
				match(LPAR);
				setState(38);
				match(STRING);
				setState(39);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\5\3\26\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2.\2\r\3\2\2"+
		"\2\4\25\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n,\3\2\2\2\f\16\5\4\3\2\r\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4"+
		"\2\22\23\7\n\2\2\23\26\3\2\2\2\24\26\7\n\2\2\25\21\3\2\2\2\25\24\3\2\2"+
		"\2\26\5\3\2\2\2\27\30\7\t\2\2\30\31\7\13\2\2\31#\5\n\6\2\32\33\7\3\2\2"+
		"\33\34\7\t\2\2\34\35\7\13\2\2\35#\5\n\6\2\36\37\7\4\2\2\37 \7\t\2\2 !"+
		"\7\13\2\2!#\5\n\6\2\"\27\3\2\2\2\"\32\3\2\2\2\"\36\3\2\2\2#\7\3\2\2\2"+
		"$%\7\t\2\2%&\7\7\2\2&*\7\t\2\2\'(\7\5\2\2()\7\b\2\2)+\7\6\2\2*\'\3\2\2"+
		"\2*+\3\2\2\2+\t\3\2\2\2,-\7\b\2\2-\13\3\2\2\2\6\17\25\"*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}