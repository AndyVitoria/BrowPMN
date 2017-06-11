// Generated from BrowPMN.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTAG=1, COMMA=2, TAGINICIO=3, TAGFIM=4, LPAR=5, RPAR=6, PROXIMO=7, 
		LCOL=8, RCOL=9, STRING=10, ID=11, NEWLINE=12, ATRIBUICAO=13, WHILE=14, 
		IF=15, ELIF=16, ELSE=17, DO=18, AND=19, IGNORE=20;
	public static final int
		RULE_prog = 0, RULE_sttm = 1, RULE_assinatura = 2, RULE_codigo = 3, RULE_fluxo = 4, 
		RULE_condicional = 5, RULE_loop = 6, RULE_paralelo = 7, RULE_paralelo_caminho = 8, 
		RULE_exclusivo = 9, RULE_exclusivo_caminho = 10, RULE_exclusivo_restante = 11, 
		RULE_funcao = 12, RULE_valor = 13;
	public static final String[] ruleNames = {
		"prog", "sttm", "assinatura", "codigo", "fluxo", "condicional", "loop", 
		"paralelo", "paralelo_caminho", "exclusivo", "exclusivo_caminho", "exclusivo_restante", 
		"funcao", "valor"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				sttm();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTAG || _la==NEWLINE );
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
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
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
			int _alt;
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(33);
						funcao();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(36); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
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
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode ATRIBUICAO() { return getToken(BrowPMNParser.ATRIBUICAO, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode TAGINICIO() { return getToken(BrowPMNParser.TAGINICIO, 0); }
		public TerminalNode TAGFIM() { return getToken(BrowPMNParser.TAGFIM, 0); }
		public FluxoContext fluxo() {
			return getRuleContext(FluxoContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(BrowPMNParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(BrowPMNParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BrowPMNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BrowPMNParser.COMMA, i);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
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
		enterRule(_localctx, 4, RULE_assinatura);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(ATRIBUICAO);
				setState(43);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(TAGINICIO);
				setState(45);
				match(ID);
				setState(46);
				match(ATRIBUICAO);
				setState(47);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(TAGFIM);
				setState(49);
				match(ID);
				setState(50);
				match(ATRIBUICAO);
				setState(51);
				valor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				fluxo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(ID);
				setState(54);
				match(ATRIBUICAO);
				setState(55);
				match(ID);
				setState(56);
				match(LPAR);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(57);
					match(ID);
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(58);
						match(COMMA);
						setState(59);
						match(ID);
						}
						}
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(67);
				match(RPAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				condicional();
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

	public static class CodigoContext extends ParserRuleContext {
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BrowPMNParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BrowPMNParser.NEWLINE, i);
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
		enterRule(_localctx, 6, RULE_codigo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(73);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAGINICIO:
					case TAGFIM:
					case ID:
					case WHILE:
					case IF:
					case DO:
						{
						setState(71);
						assinatura();
						}
						break;
					case NEWLINE:
						{
						setState(72);
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
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class FluxoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
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
		enterRule(_localctx, 8, RULE_fluxo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(78);
			match(PROXIMO);
			setState(79);
			match(ID);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(80);
				match(LPAR);
				setState(81);
				match(STRING);
				setState(82);
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

	public static class CondicionalContext extends ParserRuleContext {
		public ExclusivoContext exclusivo() {
			return getRuleContext(ExclusivoContext.class,0);
		}
		public List<Exclusivo_caminhoContext> exclusivo_caminho() {
			return getRuleContexts(Exclusivo_caminhoContext.class);
		}
		public Exclusivo_caminhoContext exclusivo_caminho(int i) {
			return getRuleContext(Exclusivo_caminhoContext.class,i);
		}
		public Exclusivo_restanteContext exclusivo_restante() {
			return getRuleContext(Exclusivo_restanteContext.class,0);
		}
		public ParaleloContext paralelo() {
			return getRuleContext(ParaleloContext.class,0);
		}
		public List<Paralelo_caminhoContext> paralelo_caminho() {
			return getRuleContexts(Paralelo_caminhoContext.class);
		}
		public Paralelo_caminhoContext paralelo_caminho(int i) {
			return getRuleContext(Paralelo_caminhoContext.class,i);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				exclusivo();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(86);
					exclusivo_caminho();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(92);
					exclusivo_restante();
					}
				}

				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				paralelo();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSE) {
					{
					{
					setState(96);
					paralelo_caminho();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				loop();
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BrowPMNParser.WHILE, 0); }
		public List<TerminalNode> LPAR() { return getTokens(BrowPMNParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(BrowPMNParser.LPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(BrowPMNParser.COMMA, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public List<TerminalNode> STRING() { return getTokens(BrowPMNParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BrowPMNParser.STRING, i);
		}
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(WHILE);
			setState(106);
			match(LPAR);
			setState(107);
			match(ID);
			setState(108);
			match(COMMA);
			setState(109);
			match(ID);
			setState(110);
			match(RPAR);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(111);
				match(LPAR);
				setState(112);
				match(STRING);
				setState(113);
				match(RPAR);
				}
			}

			setState(116);
			match(LCOL);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(117);
				assinatura();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(NEWLINE);
			setState(124);
			match(RCOL);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(125);
				match(LPAR);
				setState(126);
				match(STRING);
				setState(127);
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

	public static class ParaleloContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(BrowPMNParser.DO, 0); }
		public List<TerminalNode> LPAR() { return getTokens(BrowPMNParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(BrowPMNParser.LPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(BrowPMNParser.COMMA, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public ParaleloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterParalelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitParalelo(this);
		}
	}

	public final ParaleloContext paralelo() throws RecognitionException {
		ParaleloContext _localctx = new ParaleloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paralelo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DO);
			setState(131);
			match(LPAR);
			setState(132);
			match(ID);
			setState(133);
			match(COMMA);
			setState(134);
			match(ID);
			setState(135);
			match(RPAR);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(136);
				match(LPAR);
				setState(137);
				match(STRING);
				setState(138);
				match(RPAR);
				}
			}

			setState(141);
			match(LCOL);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(142);
				assinatura();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(NEWLINE);
			setState(149);
			match(RCOL);
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

	public static class Paralelo_caminhoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BrowPMNParser.ELSE, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public TerminalNode LPAR() { return getToken(BrowPMNParser.LPAR, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public Paralelo_caminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paralelo_caminho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterParalelo_caminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitParalelo_caminho(this);
		}
	}

	public final Paralelo_caminhoContext paralelo_caminho() throws RecognitionException {
		Paralelo_caminhoContext _localctx = new Paralelo_caminhoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paralelo_caminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ELSE);
			setState(152);
			match(RPAR);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(153);
				match(LPAR);
				setState(154);
				match(STRING);
				setState(155);
				match(RPAR);
				}
			}

			setState(158);
			match(LCOL);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(159);
				assinatura();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(NEWLINE);
			setState(166);
			match(RCOL);
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

	public static class ExclusivoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BrowPMNParser.IF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(BrowPMNParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(BrowPMNParser.LPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(BrowPMNParser.COMMA, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public ExclusivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterExclusivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitExclusivo(this);
		}
	}

	public final ExclusivoContext exclusivo() throws RecognitionException {
		ExclusivoContext _localctx = new ExclusivoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exclusivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			match(LPAR);
			setState(170);
			match(ID);
			setState(171);
			match(COMMA);
			setState(172);
			match(ID);
			setState(173);
			match(RPAR);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(174);
				match(LPAR);
				setState(175);
				match(STRING);
				setState(176);
				match(RPAR);
				}
			}

			setState(179);
			match(LCOL);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(180);
				assinatura();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			match(NEWLINE);
			setState(187);
			match(RCOL);
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

	public static class Exclusivo_caminhoContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(BrowPMNParser.ELIF, 0); }
		public List<TerminalNode> LPAR() { return getTokens(BrowPMNParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(BrowPMNParser.LPAR, i);
		}
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(BrowPMNParser.COMMA, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public Exclusivo_caminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusivo_caminho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterExclusivo_caminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitExclusivo_caminho(this);
		}
	}

	public final Exclusivo_caminhoContext exclusivo_caminho() throws RecognitionException {
		Exclusivo_caminhoContext _localctx = new Exclusivo_caminhoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exclusivo_caminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ELIF);
			setState(190);
			match(LPAR);
			setState(191);
			match(ID);
			setState(192);
			match(COMMA);
			setState(193);
			match(ID);
			setState(194);
			match(RPAR);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(195);
				match(LPAR);
				setState(196);
				match(STRING);
				setState(197);
				match(RPAR);
				}
			}

			setState(200);
			match(LCOL);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(201);
				assinatura();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(NEWLINE);
			setState(208);
			match(RCOL);
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

	public static class Exclusivo_restanteContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BrowPMNParser.ELSE, 0); }
		public List<TerminalNode> RPAR() { return getTokens(BrowPMNParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(BrowPMNParser.RPAR, i);
		}
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public TerminalNode LPAR() { return getToken(BrowPMNParser.LPAR, 0); }
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public List<AssinaturaContext> assinatura() {
			return getRuleContexts(AssinaturaContext.class);
		}
		public AssinaturaContext assinatura(int i) {
			return getRuleContext(AssinaturaContext.class,i);
		}
		public Exclusivo_restanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusivo_restante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterExclusivo_restante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitExclusivo_restante(this);
		}
	}

	public final Exclusivo_restanteContext exclusivo_restante() throws RecognitionException {
		Exclusivo_restanteContext _localctx = new Exclusivo_restanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exclusivo_restante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ELSE);
			setState(211);
			match(RPAR);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(212);
				match(LPAR);
				setState(213);
				match(STRING);
				setState(214);
				match(RPAR);
				}
			}

			setState(217);
			match(LCOL);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << ID) | (1L << WHILE) | (1L << IF) | (1L << DO))) != 0)) {
				{
				{
				setState(218);
				assinatura();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(NEWLINE);
			setState(225);
			match(RCOL);
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCTAG() { return getToken(BrowPMNParser.FUNCTAG, 0); }
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(BrowPMNParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(BrowPMNParser.RPAR, 0); }
		public TerminalNode LCOL() { return getToken(BrowPMNParser.LCOL, 0); }
		public CodigoContext codigo() {
			return getRuleContext(CodigoContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(BrowPMNParser.NEWLINE, 0); }
		public TerminalNode RCOL() { return getToken(BrowPMNParser.RCOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BrowPMNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BrowPMNParser.COMMA, i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(FUNCTAG);
			setState(228);
			match(ID);
			setState(229);
			match(LPAR);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(230);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					match(ID);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
			match(RPAR);
			setState(241);
			match(LCOL);
			setState(242);
			codigo();
			setState(243);
			match(NEWLINE);
			setState(244);
			match(RCOL);
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
		enterRule(_localctx, 26, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\6"+
		"\3%\n\3\r\3\16\3&\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\5\4D\n\4"+
		"\3\4\3\4\5\4H\n\4\3\5\3\5\6\5L\n\5\r\5\16\5M\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6V\n\6\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\5\7`\n\7\3\7\3\7\7\7d\n\7"+
		"\f\7\16\7g\13\7\3\7\5\7j\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu"+
		"\n\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\7\t\u0092\n"+
		"\t\f\t\16\t\u0095\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3"+
		"\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\7\13\u00b8\n\13"+
		"\f\13\16\13\u00bb\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00c9\n\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1"+
		"\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00ec\n\16\f\16\16"+
		"\16\u00ef\13\16\5\16\u00f1\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u010d\2\37\3\2"+
		"\2\2\4)\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nO\3\2\2\2\fi\3\2\2\2\16k\3\2\2"+
		"\2\20\u0084\3\2\2\2\22\u0099\3\2\2\2\24\u00aa\3\2\2\2\26\u00bf\3\2\2\2"+
		"\30\u00d4\3\2\2\2\32\u00e5\3\2\2\2\34\u00f8\3\2\2\2\36 \5\4\3\2\37\36"+
		"\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#%\5\32\16\2$#\3"+
		"\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(*\7\16\2\2)$\3\2\2\2"+
		")(\3\2\2\2*\5\3\2\2\2+,\7\r\2\2,-\7\17\2\2-H\5\34\17\2./\7\5\2\2/\60\7"+
		"\r\2\2\60\61\7\17\2\2\61H\5\34\17\2\62\63\7\6\2\2\63\64\7\r\2\2\64\65"+
		"\7\17\2\2\65H\5\34\17\2\66H\5\n\6\2\678\7\r\2\289\7\17\2\29:\7\r\2\2:"+
		"C\7\7\2\2;@\7\r\2\2<=\7\4\2\2=?\7\r\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2"+
		"@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C;\3\2\2\2CD\3\2\2\2DE\3\2\2\2EH\7\b\2\2"+
		"FH\5\f\7\2G+\3\2\2\2G.\3\2\2\2G\62\3\2\2\2G\66\3\2\2\2G\67\3\2\2\2GF\3"+
		"\2\2\2H\7\3\2\2\2IL\5\6\4\2JL\7\16\2\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2M"+
		"K\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OP\7\r\2\2PQ\7\t\2\2QU\7\r\2\2RS\7\7\2\2"+
		"ST\7\f\2\2TV\7\b\2\2UR\3\2\2\2UV\3\2\2\2V\13\3\2\2\2W[\5\24\13\2XZ\5\26"+
		"\f\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^`\5"+
		"\30\r\2_^\3\2\2\2_`\3\2\2\2`j\3\2\2\2ae\5\20\t\2bd\5\22\n\2cb\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fj\3\2\2\2ge\3\2\2\2hj\5\16\b\2iW\3\2\2"+
		"\2ia\3\2\2\2ih\3\2\2\2j\r\3\2\2\2kl\7\20\2\2lm\7\7\2\2mn\7\r\2\2no\7\4"+
		"\2\2op\7\r\2\2pt\7\b\2\2qr\7\7\2\2rs\7\f\2\2su\7\b\2\2tq\3\2\2\2tu\3\2"+
		"\2\2uv\3\2\2\2vz\7\n\2\2wy\5\6\4\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{}\3\2\2\2|z\3\2\2\2}~\7\16\2\2~\u0082\7\13\2\2\177\u0080\7\7\2\2"+
		"\u0080\u0081\7\f\2\2\u0081\u0083\7\b\2\2\u0082\177\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\7\2\2\u0086"+
		"\u0087\7\r\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7\r\2\2\u0089\u008d\7\b"+
		"\2\2\u008a\u008b\7\7\2\2\u008b\u008c\7\f\2\2\u008c\u008e\7\b\2\2\u008d"+
		"\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\7\n"+
		"\2\2\u0090\u0092\5\6\4\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u0097\7\16\2\2\u0097\u0098\7\13\2\2\u0098\21\3\2\2\2\u0099"+
		"\u009a\7\23\2\2\u009a\u009e\7\b\2\2\u009b\u009c\7\7\2\2\u009c\u009d\7"+
		"\f\2\2\u009d\u009f\7\b\2\2\u009e\u009b\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a4\7\n\2\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2"+
		"\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7"+
		"\13\2\2\u00a9\23\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\7\7\2\2\u00ac"+
		"\u00ad\7\r\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\7\r\2\2\u00af\u00b3\7\b"+
		"\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\7\f\2\2\u00b2\u00b4\7\b\2\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\7\n"+
		"\2\2\u00b6\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00be\7\13\2\2\u00be\25\3\2\2\2\u00bf"+
		"\u00c0\7\22\2\2\u00c0\u00c1\7\7\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\7"+
		"\4\2\2\u00c3\u00c4\7\r\2\2\u00c4\u00c8\7\b\2\2\u00c5\u00c6\7\7\2\2\u00c6"+
		"\u00c7\7\f\2\2\u00c7\u00c9\7\b\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\7\n\2\2\u00cb\u00cd\5\6\4\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2"+
		"\u00d3\7\13\2\2\u00d3\27\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00d9\7\b"+
		"\2\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00da\7\b\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00df\7\n"+
		"\2\2\u00dc\u00de\5\6\4\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e4\7\13\2\2\u00e4\31\3\2\2\2\u00e5"+
		"\u00e6\7\3\2\2\u00e6\u00e7\7\r\2\2\u00e7\u00f0\7\7\2\2\u00e8\u00ed\7\r"+
		"\2\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\7\r\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\b\2\2\u00f3\u00f4\7\n\2\2\u00f4\u00f5\5\b"+
		"\5\2\u00f5\u00f6\7\16\2\2\u00f6\u00f7\7\13\2\2\u00f7\33\3\2\2\2\u00f8"+
		"\u00f9\7\f\2\2\u00f9\35\3\2\2\2\36!&)@CGKMU[_eitz\u0082\u008d\u0093\u009e"+
		"\u00a4\u00b3\u00b9\u00c8\u00ce\u00d9\u00df\u00ed\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}