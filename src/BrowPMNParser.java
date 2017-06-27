// Generated from BrowPMN.g4 by ANTLR 4.5.1

import struct.*;

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
		FUNCTAG=1, COMMA=2, TAGINICIO=3, TAGFIM=4, LPAR=5, RPAR=6, PROXIMO=7, 
		LCOL=8, RCOL=9, STRING=10, ID=11, NEWLINE=12, ATRIBUICAO=13, WHILE=14, 
		IF=15, ELIF=16, ELSE=17, DO=18, AND=19, IGNORE=20;
	public static final int
		RULE_prog = 0, RULE_sttm = 1, RULE_codigo = 2, RULE_assinatura = 3, RULE_variavel = 4, 
		RULE_fluxo = 5, RULE_valor = 6;
	public static final String[] ruleNames = {
		"prog", "sttm", "codigo", "assinatura", "variavel", "fluxo", "valor"
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
		public Node result;
		public SttmContext s;
		public List<SttmContext> sttm() {
			return getRuleContexts(SttmContext.class);
		}
		public SttmContext sttm(int i) {
			return getRuleContext(SttmContext.class,i);
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				((ProgContext)_localctx).s = sttm();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << NEWLINE))) != 0) );
			((ProgContext)_localctx).result =  ((ProgContext)_localctx).s.result;
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

	public static class SttmContext extends ParserRuleContext {
		public Node result;
		public CodigoContext co;
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public SttmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sttm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterSttm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitSttm(this);
		}
	}

	public final SttmContext sttm() throws RecognitionException {
		SttmContext _localctx = new SttmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sttm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((SttmContext)_localctx).co = codigo();
			((SttmContext)_localctx).result =  ((SttmContext)_localctx).co.result;
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

	public static class CodigoContext extends ParserRuleContext {
		public Node result;
		public AssinaturaContext as;
		public List<TerminalNode> NEWLINE() { return getTokens(BrowPMNParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BrowPMNParser.NEWLINE, i);
		}
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitCodigo(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(28);
					switch (_input.LA(1)) {
					case TAGINICIO:
					case TAGFIM:
					case ID:
						{
						setState(24);
						((CodigoContext)_localctx).as = assinatura();
						((CodigoContext)_localctx).result =  ((CodigoContext)_localctx).as.result;
						}
						break;
					case NEWLINE:
						{
						setState(27);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public Node result;
		public VariavelContext variavel;
		public FluxoContext fluxo;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public FluxoContext fluxo() {
			return getRuleContext(FluxoContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_assinatura);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((AssinaturaContext)_localctx).variavel = variavel();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).variavel.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				((AssinaturaContext)_localctx).fluxo = fluxo();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).fluxo.result;
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

	public static class VariavelContext extends ParserRuleContext {
		public Node result;
		public Token id;
		public ValorContext valor;
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ID() { return getToken(BrowPMNParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((VariavelContext)_localctx).id = match(ID);
				setState(41);
				match(ATRIBUICAO);
				setState(42);
				((VariavelContext)_localctx).valor = valor();
				((VariavelContext)_localctx).result =  new Variable(((VariavelContext)_localctx).id.getText(), ((VariavelContext)_localctx).valor.result);
				}
				break;
			case TAGINICIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(TAGINICIO);
				setState(46);
				((VariavelContext)_localctx).id = match(ID);
				setState(47);
				match(ATRIBUICAO);
				setState(48);
				((VariavelContext)_localctx).valor = valor();
				((VariavelContext)_localctx).result =  new Start(((VariavelContext)_localctx).id.getText(), ((VariavelContext)_localctx).valor.result);
				}
				break;
			case TAGFIM:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(TAGFIM);
				setState(52);
				((VariavelContext)_localctx).id = match(ID);
				setState(53);
				match(ATRIBUICAO);
				setState(54);
				((VariavelContext)_localctx).valor = valor();
				((VariavelContext)_localctx).result =  new End(((VariavelContext)_localctx).id.getText(), ((VariavelContext)_localctx).valor.result);
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
		public Node result;
		public VariavelContext var;
		public VariavelContext next;
		public ValorContext valor;
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_fluxo);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(59);
				((FluxoContext)_localctx).var = variavel();
				}
				setState(60);
				match(PROXIMO);
				{
				setState(61);
				((FluxoContext)_localctx).next = variavel();
				}
				((FluxoContext)_localctx).result =  ((FluxoContext)_localctx).var.result.setNextNode(((FluxoContext)_localctx).next.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(64);
				((FluxoContext)_localctx).var = variavel();
				}
				setState(65);
				match(PROXIMO);
				{
				setState(66);
				((FluxoContext)_localctx).next = variavel();
				}
				{
				setState(67);
				match(LPAR);
				setState(68);
				((FluxoContext)_localctx).valor = valor();
				setState(69);
				match(RPAR);
				}
				((FluxoContext)_localctx).result =  ((FluxoContext)_localctx).var.result.setNextNode(((FluxoContext)_localctx).next.result, ((FluxoContext)_localctx).valor.result);
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

	public static class ValorContext extends ParserRuleContext {
		public String result;
		public Token str;
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
		enterRule(_localctx, 12, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((ValorContext)_localctx).str = match(STRING);
			((ValorContext)_localctx).result =  new String(((ValorContext)_localctx).str.getText());
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4\37\n\4\r\4\16\4 \3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5)\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2P\2"+
		"\21\3\2\2\2\4\27\3\2\2\2\6\36\3\2\2\2\b(\3\2\2\2\n;\3\2\2\2\fK\3\2\2\2"+
		"\16M\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23"+
		"\24\3\2\2\2\24\25\3\2\2\2\25\26\b\2\1\2\26\3\3\2\2\2\27\30\5\6\4\2\30"+
		"\31\b\3\1\2\31\5\3\2\2\2\32\33\5\b\5\2\33\34\b\4\1\2\34\37\3\2\2\2\35"+
		"\37\7\16\2\2\36\32\3\2\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\7\3\2\2\2\"#\5\n\6\2#$\b\5\1\2$)\3\2\2\2%&\5\f\7\2&\'\b\5\1\2\'"+
		")\3\2\2\2(\"\3\2\2\2(%\3\2\2\2)\t\3\2\2\2*+\7\r\2\2+,\7\17\2\2,-\5\16"+
		"\b\2-.\b\6\1\2.<\3\2\2\2/\60\7\5\2\2\60\61\7\r\2\2\61\62\7\17\2\2\62\63"+
		"\5\16\b\2\63\64\b\6\1\2\64<\3\2\2\2\65\66\7\6\2\2\66\67\7\r\2\2\678\7"+
		"\17\2\289\5\16\b\29:\b\6\1\2:<\3\2\2\2;*\3\2\2\2;/\3\2\2\2;\65\3\2\2\2"+
		"<\13\3\2\2\2=>\5\n\6\2>?\7\t\2\2?@\5\n\6\2@A\b\7\1\2AL\3\2\2\2BC\5\n\6"+
		"\2CD\7\t\2\2DE\5\n\6\2EF\7\7\2\2FG\5\16\b\2GH\7\b\2\2HI\3\2\2\2IJ\b\7"+
		"\1\2JL\3\2\2\2K=\3\2\2\2KB\3\2\2\2L\r\3\2\2\2MN\7\f\2\2NO\b\b\1\2O\17"+
		"\3\2\2\2\b\23\36 (;K";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}