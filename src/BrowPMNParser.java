// Generated from BrowPMN.g4 by ANTLR 4.5.1

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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTAG=1, COMMA=2, TAGINICIO=3, TAGFIM=4, LPAR=5, RPAR=6, PROXIMO=7, 
		LCOL=8, RCOL=9, STRING=10, ID=11, NEWLINE=12, ATRIBUICAO=13, WHILE=14, 
		IF=15, ELIF=16, ELSE=17, DO=18, AND=19, IGNORE=20;
	public static final int
		RULE_prog = 0, RULE_sttm = 1, RULE_assinatura = 2, RULE_atribuicao = 3, 
		RULE_fluxo = 4, RULE_string = 5;
	public static final String[] ruleNames = {
		"prog", "sttm", "assinatura", "atribuicao", "fluxo", "string"
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
				setState(12);
				((ProgContext)_localctx).s = sttm();
				((ProgContext)_localctx).result =  ((ProgContext)_localctx).s.result;
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAGINICIO) | (1L << TAGFIM) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(23);
			switch (_input.LA(1)) {
			case TAGINICIO:
			case TAGFIM:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((SttmContext)_localctx).co = assinatura();
				((SttmContext)_localctx).result =  ((SttmContext)_localctx).co.result;
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
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
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 4, RULE_assinatura);
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((AssinaturaContext)_localctx).atribuicao = atribuicao();
				((AssinaturaContext)_localctx).result =  ((AssinaturaContext)_localctx).atribuicao.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
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
			setState(48);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((AtribuicaoContext)_localctx).id = match(ID);
				setState(35);
				match(ATRIBUICAO);
				setState(36);
				((AtribuicaoContext)_localctx).string = string();
				((AtribuicaoContext)_localctx).result =  mkAssing(((AtribuicaoContext)_localctx).id.getText(), ((AtribuicaoContext)_localctx).string.result, "");
				}
				break;
			case TAGINICIO:
			case TAGFIM:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				switch (_input.LA(1)) {
				case TAGINICIO:
					{
					setState(39);
					((AtribuicaoContext)_localctx).tag = match(TAGINICIO);
					}
					break;
				case TAGFIM:
					{
					setState(40);
					((AtribuicaoContext)_localctx).tag = match(TAGFIM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				((AtribuicaoContext)_localctx).id = match(ID);
				setState(44);
				match(ATRIBUICAO);
				setState(45);
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
		public Token var;
		public Token next;
		public Token str;
		public List<TerminalNode> ID() { return getTokens(BrowPMNParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BrowPMNParser.ID, i);
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(50);
				((FluxoContext)_localctx).var = match(ID);
				}
				setState(51);
				match(PROXIMO);
				{
				setState(52);
				((FluxoContext)_localctx).next = match(ID);
				}
				((FluxoContext)_localctx).result =  Node.setNextNode(((FluxoContext)_localctx).var.getText(), ((FluxoContext)_localctx).next.getText(), "");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(54);
				((FluxoContext)_localctx).var = match(ID);
				}
				setState(55);
				match(PROXIMO);
				{
				setState(56);
				((FluxoContext)_localctx).next = match(ID);
				}
				{
				setState(57);
				match(LPAR);
				setState(58);
				((FluxoContext)_localctx).str = match(STRING);
				setState(59);
				match(RPAR);
				}
				((FluxoContext)_localctx).result =  Node.setNextNode(((FluxoContext)_localctx).var.getText(), ((FluxoContext)_localctx).next.getText(), ((FluxoContext)_localctx).str.getText());
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
		enterRule(_localctx, 10, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7\2\2"+
		"\b\2\4\6\b\n\f\2\2F\2\21\3\2\2\2\4\31\3\2\2\2\6\"\3\2\2\2\b\62\3\2\2\2"+
		"\n@\3\2\2\2\fB\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\22\3\2\2\2\21\16"+
		"\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26"+
		"\5\6\4\2\26\27\b\3\1\2\27\32\3\2\2\2\30\32\7\16\2\2\31\25\3\2\2\2\31\30"+
		"\3\2\2\2\32\5\3\2\2\2\33\34\5\b\5\2\34\35\b\4\1\2\35#\3\2\2\2\36#\5\f"+
		"\7\2\37 \5\n\6\2 !\b\4\1\2!#\3\2\2\2\"\33\3\2\2\2\"\36\3\2\2\2\"\37\3"+
		"\2\2\2#\7\3\2\2\2$%\7\r\2\2%&\7\17\2\2&\'\5\f\7\2\'(\b\5\1\2(\63\3\2\2"+
		"\2),\7\5\2\2*,\7\6\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-.\7\r\2\2./\7\17"+
		"\2\2/\60\5\f\7\2\60\61\b\5\1\2\61\63\3\2\2\2\62$\3\2\2\2\62+\3\2\2\2\63"+
		"\t\3\2\2\2\64\65\7\r\2\2\65\66\7\t\2\2\66\67\7\r\2\2\67A\b\6\1\289\7\r"+
		"\2\29:\7\t\2\2:;\7\r\2\2;<\7\7\2\2<=\7\f\2\2=>\7\b\2\2>?\3\2\2\2?A\b\6"+
		"\1\2@\64\3\2\2\2@8\3\2\2\2A\13\3\2\2\2BC\7\f\2\2CD\b\7\1\2D\r\3\2\2\2"+
		"\b\23\31\"+\62@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}