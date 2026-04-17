// Generated from bc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, STRING=45, NUMERO=46, 
		WS=47;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_declaracaoClasse = 2, RULE_modificador = 3, 
		RULE_campo = 4, RULE_metodo = 5, RULE_parametroLista = 6, RULE_parametro = 7, 
		RULE_instrucao = 8, RULE_load = 9, RULE_store = 10, RULE_consts = 11, 
		RULE_operadorBinario = 12, RULE_chamadaMetodo = 13, RULE_retorno = 14, 
		RULE_controleFluxo = 15, RULE_rotulo = 16, RULE_tipo = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "cabecalho", "declaracaoClasse", "modificador", "campo", 
			"metodo", "parametroLista", "parametro", "instrucao", "load", "store", 
			"consts", "operadorBinario", "chamadaMetodo", "retorno", "controleFluxo", 
			"rotulo", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.source'", "'.class'", "'.super'", "'{'", "'}'", "'public'", 
			"'private'", "'protected'", "'static'", "'final'", "'.field'", "'.method'", 
			"'('", "')'", "'.end'", "'method'", "','", "'iload'", "';'", "'aload'", 
			"'istore'", "'astore'", "'iconst_'", "'ldc'", "'iadd'", "'isub'", "'imul'", 
			"'idiv'", "'invokevirtual'", "'/'", "'return'", "'ireturn'", "'areturn'", 
			"'goto'", "'ifeq'", "'ifne'", "'L'", "'int'", "'float'", "'double'", 
			"'long'", "'void'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "STRING", "NUMERO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "bc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bcParser.EOF, 0); }
		public List<CabecalhoContext> cabecalho() {
			return getRuleContexts(CabecalhoContext.class);
		}
		public CabecalhoContext cabecalho(int i) {
			return getRuleContext(CabecalhoContext.class,i);
		}
		public List<DeclaracaoClasseContext> declaracaoClasse() {
			return getRuleContexts(DeclaracaoClasseContext.class);
		}
		public DeclaracaoClasseContext declaracaoClasse(int i) {
			return getRuleContext(DeclaracaoClasseContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11))) != 0)) {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(36);
					cabecalho();
					}
					break;
				case T__1:
					{
					setState(37);
					declaracaoClasse();
					}
					break;
				case T__11:
					{
					setState(38);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
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

	public static class CabecalhoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(bcParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(bcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bcParser.ID, i);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitCabecalho(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(STRING);
			setState(48);
			match(T__1);
			setState(49);
			match(ID);
			setState(50);
			match(T__2);
			setState(51);
			match(ID);
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

	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public List<ModificadorContext> modificador() {
			return getRuleContexts(ModificadorContext.class);
		}
		public ModificadorContext modificador(int i) {
			return getRuleContext(ModificadorContext.class,i);
		}
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public DeclaracaoClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterDeclaracaoClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitDeclaracaoClasse(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoClasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(54);
				modificador();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(ID);
			setState(61);
			match(T__3);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__11) {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(62);
					campo();
					}
					break;
				case T__11:
					{
					setState(63);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__4);
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

	public static class ModificadorContext extends ParserRuleContext {
		public ModificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterModificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitModificador(this);
		}
	}

	public final ModificadorContext modificador() throws RecognitionException {
		ModificadorContext _localctx = new ModificadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CampoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public List<ModificadorContext> modificador() {
			return getRuleContexts(ModificadorContext.class);
		}
		public ModificadorContext modificador(int i) {
			return getRuleContext(ModificadorContext.class,i);
		}
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitCampo(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__10);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(74);
				modificador();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			tipo();
			setState(81);
			match(ID);
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

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public List<ModificadorContext> modificador() {
			return getRuleContexts(ModificadorContext.class);
		}
		public ModificadorContext modificador(int i) {
			return getRuleContext(ModificadorContext.class,i);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMetodo(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(84);
				modificador();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			tipo();
			setState(91);
			match(ID);
			setState(92);
			match(T__12);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
				{
				setState(93);
				parametroLista();
				}
			}

			setState(96);
			match(T__13);
			setState(97);
			match(T__3);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(98);
				instrucao();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__4);
			setState(105);
			match(T__14);
			setState(106);
			match(T__15);
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

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitParametroLista(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			parametro();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(109);
				match(T__16);
				setState(110);
				parametro();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			tipo();
			setState(117);
			match(ID);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public OperadorBinarioContext operadorBinario() {
			return getRuleContext(OperadorBinarioContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ControleFluxoContext controleFluxo() {
			return getRuleContext(ControleFluxoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucao);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				load();
				}
				break;
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				store();
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				consts();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				operadorBinario();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				chamadaMetodo();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				retorno();
				}
				break;
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 7);
				{
				setState(125);
				controleFluxo();
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

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(bcParser.NUMERO, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterLoad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitLoad(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_load);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__17);
				setState(129);
				match(NUMERO);
				setState(130);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__19);
				setState(132);
				match(NUMERO);
				setState(133);
				match(T__18);
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

	public static class StoreContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(bcParser.NUMERO, 0); }
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStore(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_store);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__20);
				setState(137);
				match(NUMERO);
				setState(138);
				match(T__18);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__21);
				setState(140);
				match(NUMERO);
				setState(141);
				match(T__18);
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

	public static class ConstsContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(bcParser.NUMERO, 0); }
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitConsts(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_consts);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__22);
				setState(145);
				match(NUMERO);
				setState(146);
				match(T__18);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__23);
				setState(148);
				match(NUMERO);
				setState(149);
				match(T__18);
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

	public static class OperadorBinarioContext extends ParserRuleContext {
		public OperadorBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterOperadorBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitOperadorBinario(this);
		}
	}

	public final OperadorBinarioContext operadorBinario() throws RecognitionException {
		OperadorBinarioContext _localctx = new OperadorBinarioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			match(T__18);
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

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(bcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(bcParser.ID, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitChamadaMetodo(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__28);
			setState(156);
			match(ID);
			setState(157);
			match(T__29);
			setState(158);
			match(ID);
			setState(159);
			match(T__12);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
				{
				setState(160);
				parametroLista();
				}
			}

			setState(163);
			match(T__13);
			setState(164);
			tipo();
			setState(165);
			match(T__18);
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

	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retorno);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__30);
				setState(168);
				match(T__18);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__31);
				setState(170);
				match(T__18);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(T__32);
				setState(172);
				match(T__18);
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

	public static class ControleFluxoContext extends ParserRuleContext {
		public RotuloContext rotulo() {
			return getRuleContext(RotuloContext.class,0);
		}
		public ControleFluxoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controleFluxo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterControleFluxo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitControleFluxo(this);
		}
	}

	public final ControleFluxoContext controleFluxo() throws RecognitionException {
		ControleFluxoContext _localctx = new ControleFluxoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_controleFluxo);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__33);
				setState(176);
				rotulo();
				setState(177);
				match(T__18);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__34);
				setState(180);
				rotulo();
				setState(181);
				match(T__18);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				match(T__35);
				setState(184);
				rotulo();
				setState(185);
				match(T__18);
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

	public static class RotuloContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(bcParser.NUMERO, 0); }
		public RotuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterRotulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitRotulo(this);
		}
	}

	public final RotuloContext rotulo() throws RecognitionException {
		RotuloContext _localctx = new RotuloContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rotulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__36);
			setState(190);
			match(NUMERO);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\4\7\4C\n\4"+
		"\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3"+
		"\6\3\6\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3"+
		"\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\br\n\b\f"+
		"\b\16\bu\13\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0091\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\b\f\3\2\33"+
		"\36\3\2(.\2\u00cb\2+\3\2\2\2\4\60\3\2\2\2\6\67\3\2\2\2\bI\3\2\2\2\nK\3"+
		"\2\2\2\fU\3\2\2\2\16n\3\2\2\2\20v\3\2\2\2\22\u0080\3\2\2\2\24\u0088\3"+
		"\2\2\2\26\u0090\3\2\2\2\30\u0098\3\2\2\2\32\u009a\3\2\2\2\34\u009d\3\2"+
		"\2\2\36\u00af\3\2\2\2 \u00bd\3\2\2\2\"\u00bf\3\2\2\2$\u00c2\3\2\2\2&*"+
		"\5\4\3\2\'*\5\6\4\2(*\5\f\7\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2"+
		"+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\61\7"+
		"\3\2\2\61\62\7/\2\2\62\63\7\4\2\2\63\64\7.\2\2\64\65\7\5\2\2\65\66\7."+
		"\2\2\66\5\3\2\2\2\67;\7\4\2\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7.\2\2?D\7\6\2\2@C\5\n\6\2AC\5\f\7\2"+
		"B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2"+
		"GH\7\7\2\2H\7\3\2\2\2IJ\t\2\2\2J\t\3\2\2\2KO\7\r\2\2LN\5\b\5\2ML\3\2\2"+
		"\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5$\23\2ST\7.\2"+
		"\2T\13\3\2\2\2UY\7\16\2\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5$\23\2]^\7.\2\2^`\7\17\2\2_a\5\16\b\2"+
		"`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\20\2\2cg\7\6\2\2df\5\22\n\2ed\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\7\2\2kl\7\21"+
		"\2\2lm\7\22\2\2m\r\3\2\2\2ns\5\20\t\2op\7\23\2\2pr\5\20\t\2qo\3\2\2\2"+
		"ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\5$\23\2wx\7.\2"+
		"\2x\21\3\2\2\2y\u0081\5\24\13\2z\u0081\5\26\f\2{\u0081\5\30\r\2|\u0081"+
		"\5\32\16\2}\u0081\5\34\17\2~\u0081\5\36\20\2\177\u0081\5 \21\2\u0080y"+
		"\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\7\24\2\2\u0083"+
		"\u0084\7\60\2\2\u0084\u0089\7\25\2\2\u0085\u0086\7\26\2\2\u0086\u0087"+
		"\7\60\2\2\u0087\u0089\7\25\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2"+
		"\u0089\25\3\2\2\2\u008a\u008b\7\27\2\2\u008b\u008c\7\60\2\2\u008c\u0091"+
		"\7\25\2\2\u008d\u008e\7\30\2\2\u008e\u008f\7\60\2\2\u008f\u0091\7\25\2"+
		"\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\27\3\2\2\2\u0092\u0093"+
		"\7\31\2\2\u0093\u0094\7\60\2\2\u0094\u0099\7\25\2\2\u0095\u0096\7\32\2"+
		"\2\u0096\u0097\7\60\2\2\u0097\u0099\7\25\2\2\u0098\u0092\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0099\31\3\2\2\2\u009a\u009b\t\3\2\2\u009b\u009c\7\25\2"+
		"\2\u009c\33\3\2\2\2\u009d\u009e\7\37\2\2\u009e\u009f\7.\2\2\u009f\u00a0"+
		"\7 \2\2\u00a0\u00a1\7.\2\2\u00a1\u00a3\7\17\2\2\u00a2\u00a4\5\16\b\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\20"+
		"\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\25\2\2\u00a8\35\3\2\2\2\u00a9\u00aa"+
		"\7!\2\2\u00aa\u00b0\7\25\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00b0\7\25\2\2"+
		"\u00ad\u00ae\7#\2\2\u00ae\u00b0\7\25\2\2\u00af\u00a9\3\2\2\2\u00af\u00ab"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\7$\2\2\u00b2"+
		"\u00b3\5\"\22\2\u00b3\u00b4\7\25\2\2\u00b4\u00be\3\2\2\2\u00b5\u00b6\7"+
		"%\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\7\25\2\2\u00b8\u00be\3\2\2\2\u00b9"+
		"\u00ba\7&\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7\25\2\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be"+
		"!\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0\u00c1\7\60\2\2\u00c1#\3\2\2\2\u00c2"+
		"\u00c3\t\4\2\2\u00c3%\3\2\2\2\23)+;BDOY`gs\u0080\u0088\u0090\u0098\u00a3"+
		"\u00af\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}