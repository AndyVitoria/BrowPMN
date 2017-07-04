// Generated from BrowPMN.g4 by ANTLR 4.5

import struct.*;
import static struct.Node.*;

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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TAGINICIO=8, TAGFIM=9, 
		LPAR=10, RPAR=11, OPEN=12, CLOSE=13, PROXIMO=14, STRING=15, ID=16, NEWLINE=17, 
		ATRIBUICAO=18, IGNORE=19;
	public static final int
		RULE_prog = 0, RULE_sttm = 1, RULE_assinatura = 2, RULE_atribuicao = 3, 
		RULE_fluxo = 4, RULE_ident = 5, RULE_string = 6, RULE_exclusive = 7, RULE_parallel = 8, 
		RULE_loop = 9;
	public static final String[] ruleNames = {
		"prog", "sttm", "assinatura", "atribuicao", "fluxo", "ident", "string", 
		"exclusive", "parallel", "loop"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				((ProgContext)_localctx).s = sttm();
				((ProgContext)_localctx).result =  ((ProgContext)_localctx).s.result;
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << TAGINICIO) | (1L << TAGFIM) | (1L << CLOSE) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public AssinaturaContext co;
		public AssinaturaContext assinatura() {
			return getRuleContext(AssinaturaContext.class,0);
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
			setState(31);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__5:
			case T__6:
			case TAGINICIO:
			case TAGFIM:
			case CLOSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				((SttmContext)_localctx).co = assinatura();
				((SttmContext)_localctx).result =  ((SttmContext)_localctx).co.result;
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
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
		public Node result;
		public AtribuicaoContext atribuicao;
		public FluxoContext fluxo;
		public ExclusiveContext exclusive;
		public ParallelContext parallel;
		public LoopContext loop;
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public FluxoContext fluxo() {
			return getRuleContext(FluxoContext.class,0);
		}
		public ExclusiveContext exclusive() {
			return getRuleContext(ExclusiveContext.class,0);
		}
		public ParallelContext parallel() {
			return getRuleContext(ParallelContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				((AssinaturaContext)_localctx).atribuicao = atribuicao();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).atribuicao.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((AssinaturaContext)_localctx).fluxo = fluxo();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).fluxo.result;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				((AssinaturaContext)_localctx).exclusive = exclusive();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).exclusive.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				((AssinaturaContext)_localctx).parallel = parallel();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).parallel.result;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				((AssinaturaContext)_localctx).loop = loop();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).loop.result;
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public Node result;
		public Token id;
		public StringContext string;
		public Token tag;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode ID() { return getToken(BrowPMNParser.ID, 0); }
		public TerminalNode TAGINICIO() { return getToken(BrowPMNParser.TAGINICIO, 0); }
		public TerminalNode TAGFIM() { return getToken(BrowPMNParser.TAGFIM, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicao);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((AtribuicaoContext)_localctx).id = match(ID);
				setState(51);
				match(ATRIBUICAO);
				setState(52);
				((AtribuicaoContext)_localctx).string = string();
				((AtribuicaoContext)_localctx).result =  mkAssing(((AtribuicaoContext)_localctx).id.getText(), ((AtribuicaoContext)_localctx).string.result, "");
				}
				break;
			case TAGINICIO:
			case TAGFIM:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				switch (_input.LA(1)) {
				case TAGINICIO:
					{
					setState(55);
					((AtribuicaoContext)_localctx).tag = match(TAGINICIO);
					}
					break;
				case TAGFIM:
					{
					setState(56);
					((AtribuicaoContext)_localctx).tag = match(TAGFIM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59);
				((AtribuicaoContext)_localctx).id = match(ID);
				setState(60);
				match(ATRIBUICAO);
				setState(61);
				((AtribuicaoContext)_localctx).string = string();
				((AtribuicaoContext)_localctx).result =  mkAssing(((AtribuicaoContext)_localctx).id.getText(), ((AtribuicaoContext)_localctx).string.result, ((AtribuicaoContext)_localctx).tag.getText());
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
		public IdentContext var;
		public IdentContext next;
		public Token str;
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
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
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((FluxoContext)_localctx).var = ident();
				setState(67);
				match(PROXIMO);
				setState(68);
				((FluxoContext)_localctx).next = ident();
				((FluxoContext)_localctx).result =  Node.setNextNode(((FluxoContext)_localctx).var.result, ((FluxoContext)_localctx).next.result, "");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((FluxoContext)_localctx).var = ident();
				setState(72);
				match(PROXIMO);
				setState(73);
				((FluxoContext)_localctx).next = ident();
				{
				setState(74);
				match(LPAR);
				setState(75);
				((FluxoContext)_localctx).str = match(STRING);
				setState(76);
				match(RPAR);
				}
				((FluxoContext)_localctx).result =  Node.setNextNode(((FluxoContext)_localctx).var.result, ((FluxoContext)_localctx).next.result, ((FluxoContext)_localctx).str.getText());
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

	public static class IdentContext extends ParserRuleContext {
		public String result;
		public Token var;
		public TerminalNode ID() { return getToken(BrowPMNParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ident);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((IdentContext)_localctx).var = match(ID);
				((IdentContext)_localctx).result =  new String(((IdentContext)_localctx).var.getText());
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((IdentContext)_localctx).var = match(T__0);
				((IdentContext)_localctx).result =  new String(((IdentContext)_localctx).var.getText());
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				((IdentContext)_localctx).var = match(T__1);
				((IdentContext)_localctx).result =  new String(((IdentContext)_localctx).var.getText());
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				((IdentContext)_localctx).var = match(T__2);
				((IdentContext)_localctx).result =  new String(((IdentContext)_localctx).var.getText());
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

	public static class StringContext extends ParserRuleContext {
		public Node result;
		public Token str;
		public TerminalNode STRING() { return getToken(BrowPMNParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((StringContext)_localctx).str = match(STRING);
			((StringContext)_localctx).result =  new Str(((StringContext)_localctx).str.getText());
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

	public static class ExclusiveContext extends ParserRuleContext {
		public Node result;
		public IdentContext id1;
		public IdentContext id2;
		public Token desc1;
		public Token desc2;
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(BrowPMNParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BrowPMNParser.STRING, i);
		}
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitExclusive(this);
		}
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exclusive);
		try {
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__3);
				setState(96);
				match(LPAR);
				setState(97);
				((ExclusiveContext)_localctx).id1 = ident();
				setState(98);
				match(T__4);
				setState(99);
				((ExclusiveContext)_localctx).id2 = ident();
				setState(100);
				match(RPAR);
				setState(101);
				match(OPEN);
				((ExclusiveContext)_localctx).result =  mkExclusive(((ExclusiveContext)_localctx).id1.result, ((ExclusiveContext)_localctx).id2.result, "","");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__3);
				setState(105);
				match(LPAR);
				setState(106);
				((ExclusiveContext)_localctx).id1 = ident();
				setState(107);
				match(T__4);
				setState(108);
				((ExclusiveContext)_localctx).id2 = ident();
				setState(109);
				match(RPAR);
				setState(110);
				match(LPAR);
				setState(111);
				((ExclusiveContext)_localctx).desc1 = match(STRING);
				setState(112);
				match(RPAR);
				setState(113);
				match(OPEN);
				((ExclusiveContext)_localctx).result =  mkExclusive(((ExclusiveContext)_localctx).id1.result, ((ExclusiveContext)_localctx).id2.result, ((ExclusiveContext)_localctx).desc1.getText(),"");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(T__3);
				setState(117);
				match(LPAR);
				setState(118);
				((ExclusiveContext)_localctx).id1 = ident();
				setState(119);
				match(T__4);
				setState(120);
				((ExclusiveContext)_localctx).id2 = ident();
				setState(121);
				match(RPAR);
				setState(122);
				match(LPAR);
				setState(123);
				((ExclusiveContext)_localctx).desc1 = match(STRING);
				setState(124);
				match(T__4);
				setState(125);
				((ExclusiveContext)_localctx).desc2 = match(STRING);
				setState(126);
				match(RPAR);
				setState(127);
				match(OPEN);
				((ExclusiveContext)_localctx).result =  mkExclusive(((ExclusiveContext)_localctx).id1.result, ((ExclusiveContext)_localctx).id2.result, ((ExclusiveContext)_localctx).desc1.getText(),((ExclusiveContext)_localctx).desc2.getText());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(CLOSE);
				((ExclusiveContext)_localctx).result =  closeConditional();
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

	public static class ParallelContext extends ParserRuleContext {
		public Node result;
		public IdentContext id1;
		public IdentContext id2;
		public Token desc1;
		public Token desc2;
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(BrowPMNParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BrowPMNParser.STRING, i);
		}
		public ParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).enterParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BrowPMNListener ) ((BrowPMNListener)listener).exitParallel(this);
		}
	}

	public final ParallelContext parallel() throws RecognitionException {
		ParallelContext _localctx = new ParallelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parallel);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__5);
				setState(135);
				match(LPAR);
				setState(136);
				((ParallelContext)_localctx).id1 = ident();
				setState(137);
				match(T__4);
				setState(138);
				((ParallelContext)_localctx).id2 = ident();
				setState(139);
				match(RPAR);
				setState(140);
				match(OPEN);
				((ParallelContext)_localctx).result =  mkParallel(((ParallelContext)_localctx).id1.result, ((ParallelContext)_localctx).id2.result, "","");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__5);
				setState(144);
				match(LPAR);
				setState(145);
				((ParallelContext)_localctx).id1 = ident();
				setState(146);
				match(T__4);
				setState(147);
				((ParallelContext)_localctx).id2 = ident();
				setState(148);
				match(RPAR);
				setState(149);
				match(LPAR);
				setState(150);
				((ParallelContext)_localctx).desc1 = match(STRING);
				setState(151);
				match(RPAR);
				setState(152);
				match(OPEN);
				((ParallelContext)_localctx).result =  mkParallel(((ParallelContext)_localctx).id1.result, ((ParallelContext)_localctx).id2.result, ((ParallelContext)_localctx).desc1.getText(),"");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__5);
				setState(156);
				match(LPAR);
				setState(157);
				((ParallelContext)_localctx).id1 = ident();
				setState(158);
				match(T__4);
				setState(159);
				((ParallelContext)_localctx).id2 = ident();
				setState(160);
				match(RPAR);
				setState(161);
				match(LPAR);
				setState(162);
				((ParallelContext)_localctx).desc1 = match(STRING);
				setState(163);
				match(T__4);
				setState(164);
				((ParallelContext)_localctx).desc2 = match(STRING);
				setState(165);
				match(RPAR);
				setState(166);
				match(OPEN);
				((ParallelContext)_localctx).result =  mkParallel(((ParallelContext)_localctx).id1.result, ((ParallelContext)_localctx).id2.result, ((ParallelContext)_localctx).desc1.getText(),((ParallelContext)_localctx).desc2.getText());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(CLOSE);
				((ParallelContext)_localctx).result =  Node.closeConditional();
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

	public static class LoopContext extends ParserRuleContext {
		public Node result;
		public IdentContext id1;
		public IdentContext id2;
		public Token desc1;
		public Token desc2;
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(BrowPMNParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BrowPMNParser.STRING, i);
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
		enterRule(_localctx, 18, RULE_loop);
		try {
			setState(210);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__6);
				setState(174);
				match(LPAR);
				setState(175);
				((LoopContext)_localctx).id1 = ident();
				setState(176);
				match(T__4);
				setState(177);
				((LoopContext)_localctx).id2 = ident();
				setState(178);
				match(RPAR);
				setState(179);
				match(OPEN);
				((LoopContext)_localctx).result =  mkLoop(((LoopContext)_localctx).id1.result, ((LoopContext)_localctx).id2.result, "","");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__6);
				setState(183);
				match(LPAR);
				setState(184);
				((LoopContext)_localctx).id1 = ident();
				setState(185);
				match(T__4);
				setState(186);
				((LoopContext)_localctx).id2 = ident();
				setState(187);
				match(RPAR);
				setState(188);
				match(LPAR);
				setState(189);
				((LoopContext)_localctx).desc1 = match(STRING);
				setState(190);
				match(RPAR);
				setState(191);
				match(OPEN);
				((LoopContext)_localctx).result =  mkLoop(((LoopContext)_localctx).id1.result, ((LoopContext)_localctx).id2.result, ((LoopContext)_localctx).desc1.getText(),"");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__6);
				setState(195);
				match(LPAR);
				setState(196);
				((LoopContext)_localctx).id1 = ident();
				setState(197);
				match(T__4);
				setState(198);
				((LoopContext)_localctx).id2 = ident();
				setState(199);
				match(RPAR);
				setState(200);
				match(LPAR);
				setState(201);
				((LoopContext)_localctx).desc1 = match(STRING);
				setState(202);
				match(T__4);
				setState(203);
				((LoopContext)_localctx).desc2 = match(STRING);
				setState(204);
				match(RPAR);
				setState(205);
				match(OPEN);
				((LoopContext)_localctx).result =  mkLoop(((LoopContext)_localctx).id1.result, ((LoopContext)_localctx).id2.result, ((LoopContext)_localctx).desc1.getText(),((LoopContext)_localctx).desc2.getText());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(CLOSE);
				((LoopContext)_localctx).result =  Node.closeConditional();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u00d7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00ae\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d5"+
		"\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\u00e1\2\31\3\2\2\2\4!\3\2"+
		"\2\2\6\62\3\2\2\2\bB\3\2\2\2\nR\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20\u0086"+
		"\3\2\2\2\22\u00ad\3\2\2\2\24\u00d4\3\2\2\2\26\27\5\4\3\2\27\30\b\2\1\2"+
		"\30\32\3\2\2\2\31\26\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\3\3\2\2\2\35\36\5\6\4\2\36\37\b\3\1\2\37\"\3\2\2\2 \"\7\23\2\2!\35"+
		"\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\5\b\5\2$%\b\4\1\2%\63\3\2\2\2&\'\5\n"+
		"\6\2\'(\b\4\1\2(\63\3\2\2\2)*\5\20\t\2*+\b\4\1\2+\63\3\2\2\2,-\5\22\n"+
		"\2-.\b\4\1\2.\63\3\2\2\2/\60\5\24\13\2\60\61\b\4\1\2\61\63\3\2\2\2\62"+
		"#\3\2\2\2\62&\3\2\2\2\62)\3\2\2\2\62,\3\2\2\2\62/\3\2\2\2\63\7\3\2\2\2"+
		"\64\65\7\22\2\2\65\66\7\24\2\2\66\67\5\16\b\2\678\b\5\1\28C\3\2\2\29<"+
		"\7\n\2\2:<\7\13\2\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=>\7\22\2\2>?\7\24\2"+
		"\2?@\5\16\b\2@A\b\5\1\2AC\3\2\2\2B\64\3\2\2\2B;\3\2\2\2C\t\3\2\2\2DE\5"+
		"\f\7\2EF\7\20\2\2FG\5\f\7\2GH\b\6\1\2HS\3\2\2\2IJ\5\f\7\2JK\7\20\2\2K"+
		"L\5\f\7\2LM\7\f\2\2MN\7\21\2\2NO\7\r\2\2OP\3\2\2\2PQ\b\6\1\2QS\3\2\2\2"+
		"RD\3\2\2\2RI\3\2\2\2S\13\3\2\2\2TU\7\22\2\2U]\b\7\1\2VW\7\3\2\2W]\b\7"+
		"\1\2XY\7\4\2\2Y]\b\7\1\2Z[\7\5\2\2[]\b\7\1\2\\T\3\2\2\2\\V\3\2\2\2\\X"+
		"\3\2\2\2\\Z\3\2\2\2]\r\3\2\2\2^_\7\21\2\2_`\b\b\1\2`\17\3\2\2\2ab\7\6"+
		"\2\2bc\7\f\2\2cd\5\f\7\2de\7\7\2\2ef\5\f\7\2fg\7\r\2\2gh\7\16\2\2hi\b"+
		"\t\1\2i\u0087\3\2\2\2jk\7\6\2\2kl\7\f\2\2lm\5\f\7\2mn\7\7\2\2no\5\f\7"+
		"\2op\7\r\2\2pq\7\f\2\2qr\7\21\2\2rs\7\r\2\2st\7\16\2\2tu\b\t\1\2u\u0087"+
		"\3\2\2\2vw\7\6\2\2wx\7\f\2\2xy\5\f\7\2yz\7\7\2\2z{\5\f\7\2{|\7\r\2\2|"+
		"}\7\f\2\2}~\7\21\2\2~\177\7\7\2\2\177\u0080\7\21\2\2\u0080\u0081\7\r\2"+
		"\2\u0081\u0082\7\16\2\2\u0082\u0083\b\t\1\2\u0083\u0087\3\2\2\2\u0084"+
		"\u0085\7\17\2\2\u0085\u0087\b\t\1\2\u0086a\3\2\2\2\u0086j\3\2\2\2\u0086"+
		"v\3\2\2\2\u0086\u0084\3\2\2\2\u0087\21\3\2\2\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008a\7\f\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\7\2\2\u008c\u008d\5\f"+
		"\7\2\u008d\u008e\7\r\2\2\u008e\u008f\7\16\2\2\u008f\u0090\b\n\1\2\u0090"+
		"\u00ae\3\2\2\2\u0091\u0092\7\b\2\2\u0092\u0093\7\f\2\2\u0093\u0094\5\f"+
		"\7\2\u0094\u0095\7\7\2\2\u0095\u0096\5\f\7\2\u0096\u0097\7\r\2\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\r\2\2\u009a\u009b\7"+
		"\16\2\2\u009b\u009c\b\n\1\2\u009c\u00ae\3\2\2\2\u009d\u009e\7\b\2\2\u009e"+
		"\u009f\7\f\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5\f"+
		"\7\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\21\2\2\u00a5"+
		"\u00a6\7\7\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\7"+
		"\16\2\2\u00a9\u00aa\b\n\1\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac"+
		"\u00ae\b\n\1\2\u00ad\u0088\3\2\2\2\u00ad\u0091\3\2\2\2\u00ad\u009d\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b0\7\t\2\2\u00b0\u00b1"+
		"\7\f\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\f\7\2\u00b4"+
		"\u00b5\7\r\2\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\b\13\1\2\u00b7\u00d5\3"+
		"\2\2\2\u00b8\u00b9\7\t\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\5\f\7\2\u00bb"+
		"\u00bc\7\7\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\r\2\2\u00be\u00bf\7\f"+
		"\2\2\u00bf\u00c0\7\21\2\2\u00c0\u00c1\7\r\2\2\u00c1\u00c2\7\16\2\2\u00c2"+
		"\u00c3\b\13\1\2\u00c3\u00d5\3\2\2\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7"+
		"\f\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5\f\7\2\u00c9"+
		"\u00ca\7\r\2\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\7\21\2\2\u00cc\u00cd\7"+
		"\7\2\2\u00cd\u00ce\7\21\2\2\u00ce\u00cf\7\r\2\2\u00cf\u00d0\7\16\2\2\u00d0"+
		"\u00d1\b\13\1\2\u00d1\u00d5\3\2\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d5\b"+
		"\13\1\2\u00d4\u00af\3\2\2\2\u00d4\u00b8\3\2\2\2\u00d4\u00c4\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\25\3\2\2\2\f\33!\62;BR\\\u0086\u00ad\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}