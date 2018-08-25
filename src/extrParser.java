// Generated from extr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class extrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, JOURNAL=22, NUMERO=23, IDENTIFICADOR=24, 
		ACENTOS=25, NEWLINE=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'\\%'", "'Subjects'", "':'", "'\\'", "'['", "';'", 
		"'\"\"'", "']'", "'?'", "'_'", "'\"'", "'\"'", "'%'", "'Comments:'", "'&'", 
		"'('", "')'", "','", "'-'", "'.'", "'Journal-ref'", "NUMERO", "IDENTIFICADOR", 
		"ACENTOS", "'\r\n'", "WS"
	};
	public static final int
		RULE_start = 0, RULE_documento = 1, RULE_linha1 = 2, RULE_linha2 = 3, 
		RULE_linha3 = 4, RULE_linha4 = 5, RULE_linhaJournal = 6, RULE_linha5 = 7, 
		RULE_linha6 = 8, RULE_seq = 9, RULE_l1 = 10, RULE_titulo = 11, RULE_autores = 12, 
		RULE_resumo = 13, RULE_comments = 14, RULE_subjects = 15, RULE_subAux = 16, 
		RULE_subAux2 = 17, RULE_pontuacao = 18, RULE_alfanumerico = 19;
	public static final String[] ruleNames = {
		"start", "documento", "linha1", "linha2", "linha3", "linha4", "linhaJournal", 
		"linha5", "linha6", "seq", "l1", "titulo", "autores", "resumo", "comments", 
		"subjects", "subAux", "subAux2", "pontuacao", "alfanumerico"
	};

	@Override
	public String getGrammarFileName() { return "extr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public extrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(extrParser.EOF, 0); }
		public DocumentoContext documento(int i) {
			return getRuleContext(DocumentoContext.class,i);
		}
		public List<DocumentoContext> documento() {
			return getRuleContexts(DocumentoContext.class);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40); documento();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
			setState(45); match(EOF);
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

	public static class DocumentoContext extends ParserRuleContext {
		public Linha2Context linha2() {
			return getRuleContext(Linha2Context.class,0);
		}
		public Linha6Context linha6() {
			return getRuleContext(Linha6Context.class,0);
		}
		public LinhaJournalContext linhaJournal() {
			return getRuleContext(LinhaJournalContext.class,0);
		}
		public Linha1Context linha1() {
			return getRuleContext(Linha1Context.class,0);
		}
		public Linha5Context linha5() {
			return getRuleContext(Linha5Context.class,0);
		}
		public Linha4Context linha4() {
			return getRuleContext(Linha4Context.class,0);
		}
		public Linha3Context linha3() {
			return getRuleContext(Linha3Context.class,0);
		}
		public DocumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterDocumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitDocumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitDocumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentoContext documento() throws RecognitionException {
		DocumentoContext _localctx = new DocumentoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_documento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); linha1();
			setState(48); linha2();
			setState(49); linha3();
			setState(50); linha4();
			setState(51); linhaJournal();
			setState(52); linha5();
			setState(53); linha6();
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

	public static class Linha1Context extends ParserRuleContext {
		public List<L1Context> l1() {
			return getRuleContexts(L1Context.class);
		}
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public L1Context l1(int i) {
			return getRuleContext(L1Context.class,i);
		}
		public Linha1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha1Context linha1() throws RecognitionException {
		Linha1Context _localctx = new Linha1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_linha1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55); l1();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
			setState(60); match(NEWLINE);
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

	public static class Linha2Context extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public TituloContext titulo(int i) {
			return getRuleContext(TituloContext.class,i);
		}
		public List<TituloContext> titulo() {
			return getRuleContexts(TituloContext.class);
		}
		public Linha2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha2Context linha2() throws RecognitionException {
		Linha2Context _localctx = new Linha2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_linha2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62); titulo();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
			setState(67); match(NEWLINE);
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

	public static class Linha3Context extends ParserRuleContext {
		public List<AutoresContext> autores() {
			return getRuleContexts(AutoresContext.class);
		}
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public AutoresContext autores(int i) {
			return getRuleContext(AutoresContext.class,i);
		}
		public Linha3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha3Context linha3() throws RecognitionException {
		Linha3Context _localctx = new Linha3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_linha3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69); autores();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
			setState(74); match(NEWLINE);
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

	public static class Linha4Context extends ParserRuleContext {
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
		}
		public Linha4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha4Context linha4() throws RecognitionException {
		Linha4Context _localctx = new Linha4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_linha4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0)) {
				{
				{
				setState(76); comments();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82); match(NEWLINE);
				}
				break;
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

	public static class LinhaJournalContext extends ParserRuleContext {
		public SeqContext seq(int i) {
			return getRuleContext(SeqContext.class,i);
		}
		public List<SeqContext> seq() {
			return getRuleContexts(SeqContext.class);
		}
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public LinhaJournalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linhaJournal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinhaJournal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinhaJournal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinhaJournal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaJournalContext linhaJournal() throws RecognitionException {
		LinhaJournalContext _localctx = new LinhaJournalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_linhaJournal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JOURNAL) {
				{
				{
				setState(85); seq();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(91); match(NEWLINE);
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

	public static class Linha5Context extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public SubjectsContext subjects() {
			return getRuleContext(SubjectsContext.class,0);
		}
		public Linha5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha5Context linha5() throws RecognitionException {
		Linha5Context _localctx = new Linha5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_linha5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); subjects();
			setState(95); match(NEWLINE);
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

	public static class Linha6Context extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(extrParser.NEWLINE, 0); }
		public List<ResumoContext> resumo() {
			return getRuleContexts(ResumoContext.class);
		}
		public ResumoContext resumo(int i) {
			return getRuleContext(ResumoContext.class,i);
		}
		public Linha6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterLinha6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitLinha6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitLinha6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Linha6Context linha6() throws RecognitionException {
		Linha6Context _localctx = new Linha6Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_linha6);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(97); resumo();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(100); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(103);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(102); match(NEWLINE);
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

	public static class SeqContext extends ParserRuleContext {
		public TerminalNode JOURNAL() { return getToken(extrParser.JOURNAL, 0); }
		public List<L1Context> l1() {
			return getRuleContexts(L1Context.class);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public L1Context l1(int i) {
			return getRuleContext(L1Context.class,i);
		}
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(JOURNAL);
			setState(106); pontuacao();
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107); l1();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
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

	public static class L1Context extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public L1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterL1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitL1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitL1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L1Context l1() throws RecognitionException {
		L1Context _localctx = new L1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_l1);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); pontuacao();
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

	public static class TituloContext extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_titulo);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); pontuacao();
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

	public static class AutoresContext extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public AutoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterAutores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitAutores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitAutores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutoresContext autores() throws RecognitionException {
		AutoresContext _localctx = new AutoresContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_autores);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); pontuacao();
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

	public static class ResumoContext extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public ResumoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resumo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterResumo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitResumo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitResumo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResumoContext resumo() throws RecognitionException {
		ResumoContext _localctx = new ResumoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_resumo);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); pontuacao();
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

	public static class CommentsContext extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comments);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(T__6);
				}
				break;
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); pontuacao();
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

	public static class SubjectsContext extends ParserRuleContext {
		public SubAuxContext subAux(int i) {
			return getRuleContext(SubAuxContext.class,i);
		}
		public SubAux2Context subAux2() {
			return getRuleContext(SubAux2Context.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public List<SubAuxContext> subAux() {
			return getRuleContexts(SubAuxContext.class);
		}
		public SubjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterSubjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitSubjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitSubjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectsContext subjects() throws RecognitionException {
		SubjectsContext _localctx = new SubjectsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); subAux2();
			setState(134); pontuacao();
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135); subAux();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0) );
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

	public static class SubAuxContext extends ParserRuleContext {
		public AlfanumericoContext alfanumerico() {
			return getRuleContext(AlfanumericoContext.class,0);
		}
		public PontuacaoContext pontuacao() {
			return getRuleContext(PontuacaoContext.class,0);
		}
		public SubAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterSubAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitSubAux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitSubAux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAuxContext subAux() throws RecognitionException {
		SubAuxContext _localctx = new SubAuxContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subAux);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case NUMERO:
			case IDENTIFICADOR:
			case ACENTOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); alfanumerico();
				}
				break;
			case T__20:
			case T__19:
			case T__17:
			case T__16:
			case T__15:
			case T__14:
			case T__13:
			case T__12:
			case T__11:
			case T__10:
			case T__9:
			case T__8:
			case T__7:
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); pontuacao();
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

	public static class SubAux2Context extends ParserRuleContext {
		public SubAux2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterSubAux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitSubAux2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitSubAux2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAux2Context subAux2() throws RecognitionException {
		SubAux2Context _localctx = new SubAux2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_subAux2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__18);
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

	public static class PontuacaoContext extends ParserRuleContext {
		public PontuacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pontuacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterPontuacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitPontuacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitPontuacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PontuacaoContext pontuacao() throws RecognitionException {
		PontuacaoContext _localctx = new PontuacaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pontuacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__19) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__12) | (1L << T__11) | (1L << T__10) | (1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__2) | (1L << T__1) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class AlfanumericoContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(extrParser.NUMERO, 0); }
		public TerminalNode ACENTOS() { return getToken(extrParser.ACENTOS, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(extrParser.IDENTIFICADOR, 0); }
		public AlfanumericoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfanumerico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).enterAlfanumerico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof extrListener ) ((extrListener)listener).exitAlfanumerico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof extrVisitor ) return ((extrVisitor<? extends T>)visitor).visitAlfanumerico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfanumericoContext alfanumerico() throws RecognitionException {
		AlfanumericoContext _localctx = new AlfanumericoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alfanumerico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << IDENTIFICADOR) | (1L << ACENTOS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0099\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4;\n\4\r\4\16\4<\3\4\3\4\3\5\6\5B\n\5\r"+
		"\5\16\5C\3\5\3\5\3\6\6\6I\n\6\r\6\16\6J\3\6\3\6\3\7\7\7P\n\7\f\7\16\7"+
		"S\13\7\3\7\5\7V\n\7\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\b\5\b_\n\b\3\t\3\t"+
		"\3\t\3\n\6\ne\n\n\r\n\16\nf\3\n\5\nj\n\n\3\13\3\13\3\13\6\13o\n\13\r\13"+
		"\16\13p\3\f\3\f\5\fu\n\f\3\r\3\r\5\ry\n\r\3\16\3\16\5\16}\n\16\3\17\3"+
		"\17\5\17\u0081\n\17\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\6\21"+
		"\u008b\n\21\r\21\16\21\u008c\3\22\3\22\5\22\u0091\n\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\4\5\2\3\4\6\20\22\27\3\2\31\33\u0097\2+\3\2\2\2\4\61\3\2\2\2\6:"+
		"\3\2\2\2\bA\3\2\2\2\nH\3\2\2\2\fQ\3\2\2\2\16Z\3\2\2\2\20`\3\2\2\2\22d"+
		"\3\2\2\2\24k\3\2\2\2\26t\3\2\2\2\30x\3\2\2\2\32|\3\2\2\2\34\u0080\3\2"+
		"\2\2\36\u0085\3\2\2\2 \u0087\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u0094"+
		"\3\2\2\2(\u0096\3\2\2\2*,\5\4\3\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2"+
		"\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2\2\2\61\62\5\6\4\2\62\63\5\b\5\2\63"+
		"\64\5\n\6\2\64\65\5\f\7\2\65\66\5\16\b\2\66\67\5\20\t\2\678\5\22\n\28"+
		"\5\3\2\2\29;\5\26\f\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\7\34\2\2?\7\3\2\2\2@B\5\30\r\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DE\3\2\2\2EF\7\34\2\2F\t\3\2\2\2GI\5\32\16\2HG\3\2\2\2IJ\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\34\2\2M\13\3\2\2\2NP\5\36\20\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TV\7\34\2\2UT"+
		"\3\2\2\2UV\3\2\2\2V\r\3\2\2\2WY\5\24\13\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\7\34\2\2^]\3\2\2\2^_\3\2\2\2_\17\3"+
		"\2\2\2`a\5 \21\2ab\7\34\2\2b\21\3\2\2\2ce\5\34\17\2dc\3\2\2\2ef\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\7\34\2\2ih\3\2\2\2ij\3\2\2\2j\23\3"+
		"\2\2\2kl\7\30\2\2ln\5&\24\2mo\5\26\f\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2p"+
		"q\3\2\2\2q\25\3\2\2\2ru\5(\25\2su\5&\24\2tr\3\2\2\2ts\3\2\2\2u\27\3\2"+
		"\2\2vy\5(\25\2wy\5&\24\2xv\3\2\2\2xw\3\2\2\2y\31\3\2\2\2z}\5(\25\2{}\5"+
		"&\24\2|z\3\2\2\2|{\3\2\2\2}\33\3\2\2\2~\u0081\5(\25\2\177\u0081\5&\24"+
		"\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\35\3\2\2\2\u0082\u0086\7\21"+
		"\2\2\u0083\u0086\5(\25\2\u0084\u0086\5&\24\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\37\3\2\2\2\u0087\u0088\5$\23"+
		"\2\u0088\u008a\5&\24\2\u0089\u008b\5\"\22\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d!\3\2\2\2"+
		"\u008e\u0091\5(\25\2\u008f\u0091\5&\24\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091#\3\2\2\2\u0092\u0093\7\5\2\2\u0093%\3\2\2\2\u0094\u0095"+
		"\t\2\2\2\u0095\'\3\2\2\2\u0096\u0097\t\3\2\2\u0097)\3\2\2\2\24-<CJQUZ"+
		"^fiptx|\u0080\u0085\u008c\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}