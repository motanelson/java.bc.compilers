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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		ICONST=46, ID=47, STRING=48, NUMERO=49, WS=50;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_declaracaoClasse = 2, RULE_modificador = 3, 
		RULE_campo = 4, RULE_metodo = 5, RULE_parametroLista = 6, RULE_parametro = 7, 
		RULE_instrucao = 8, RULE_labelDef = 9, RULE_load = 10, RULE_store = 11, 
		RULE_consts = 12, RULE_operadorBinario = 13, RULE_stackOp = 14, RULE_chamadaMetodo = 15, 
		RULE_classeNome = 16, RULE_metodoNome = 17, RULE_descriptorLista = 18, 
		RULE_retorno = 19, RULE_controleFluxo = 20, RULE_rotulo = 21, RULE_tipo = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "cabecalho", "declaracaoClasse", "modificador", "campo", 
			"metodo", "parametroLista", "parametro", "instrucao", "labelDef", "load", 
			"store", "consts", "operadorBinario", "stackOp", "chamadaMetodo", "classeNome", 
			"metodoNome", "descriptorLista", "retorno", "controleFluxo", "rotulo", 
			"tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.source'", "'.class'", "'.super'", "'{'", "'}'", "'public'", 
			"'private'", "'protected'", "'static'", "'final'", "'.field'", "';'", 
			"'.method'", "'('", "')'", "'.end'", "'method'", "','", "':'", "'iload'", 
			"'aload'", "'istore'", "'astore'", "'ldc'", "'iadd'", "'isub'", "'imul'", 
			"'idiv'", "'dup'", "'pop'", "'invokevirtual'", "'/'", "'return'", "'ireturn'", 
			"'areturn'", "'goto'", "'ifeq'", "'ifne'", "'L'", "'int'", "'float'", 
			"'double'", "'long'", "'void'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ICONST", 
			"ID", "STRING", "NUMERO", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__12))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(46);
					cabecalho();
					}
					break;
				case T__1:
					{
					setState(47);
					declaracaoClasse();
					}
					break;
				case T__12:
					{
					setState(48);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(STRING);
			setState(58);
			match(T__1);
			setState(59);
			match(ID);
			setState(60);
			match(T__2);
			setState(61);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitDeclaracaoClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoClasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(64);
				modificador();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(ID);
			setState(71);
			match(T__3);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__12) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
					{
					setState(72);
					campo();
					}
					break;
				case T__12:
					{
					setState(73);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitModificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificadorContext modificador() throws RecognitionException {
		ModificadorContext _localctx = new ModificadorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__10);
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
			match(T__11);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__12);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				{
				setState(95);
				modificador();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			tipo();
			setState(102);
			match(ID);
			setState(103);
			match(T__13);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << ID))) != 0)) {
				{
				setState(104);
				parametroLista();
				}
			}

			setState(107);
			match(T__14);
			setState(108);
			match(T__3);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << ICONST))) != 0)) {
				{
				{
				setState(109);
				instrucao();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__4);
			setState(116);
			match(T__15);
			setState(117);
			match(T__16);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitParametroLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			parametro();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(120);
				match(T__17);
				setState(121);
				parametro();
				}
				}
				setState(126);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			tipo();
			setState(128);
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
		public LabelDefContext labelDef() {
			return getRuleContext(LabelDefContext.class,0);
		}
		public StackOpContext stackOp() {
			return getRuleContext(StackOpContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucao);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				load();
				}
				break;
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				store();
				}
				break;
			case T__23:
			case ICONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				consts();
				}
				break;
			case T__24:
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				operadorBinario();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				chamadaMetodo();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				retorno();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				controleFluxo();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				labelDef();
				}
				break;
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				stackOp();
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

	public static class LabelDefContext extends ParserRuleContext {
		public RotuloContext rotulo() {
			return getRuleContext(RotuloContext.class,0);
		}
		public LabelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterLabelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitLabelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitLabelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefContext labelDef() throws RecognitionException {
		LabelDefContext _localctx = new LabelDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_labelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			rotulo();
			setState(142);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_load);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__19);
				setState(145);
				match(NUMERO);
				setState(146);
				match(T__11);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__20);
				setState(148);
				match(NUMERO);
				setState(149);
				match(T__11);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_store);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(T__21);
				setState(153);
				match(NUMERO);
				setState(154);
				match(T__11);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__22);
				setState(156);
				match(NUMERO);
				setState(157);
				match(T__11);
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
		public TerminalNode ICONST() { return getToken(bcParser.ICONST, 0); }
		public TerminalNode NUMERO() { return getToken(bcParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(bcParser.STRING, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_consts);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ICONST);
				setState(161);
				match(T__11);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__23);
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==NUMERO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				match(T__11);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitOperadorBinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBinarioContext operadorBinario() throws RecognitionException {
		OperadorBinarioContext _localctx = new OperadorBinarioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operadorBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(T__11);
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

	public static class StackOpContext extends ParserRuleContext {
		public StackOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterStackOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitStackOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitStackOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackOpContext stackOp() throws RecognitionException {
		StackOpContext _localctx = new StackOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stackOp);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__28);
				setState(171);
				match(T__11);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__29);
				setState(173);
				match(T__11);
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

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public ClasseNomeContext classeNome() {
			return getRuleContext(ClasseNomeContext.class,0);
		}
		public MetodoNomeContext metodoNome() {
			return getRuleContext(MetodoNomeContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DescriptorListaContext descriptorLista() {
			return getRuleContext(DescriptorListaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitChamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_chamadaMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__30);
			setState(177);
			classeNome();
			setState(178);
			match(T__31);
			setState(179);
			metodoNome();
			setState(180);
			match(T__13);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << ID))) != 0)) {
				{
				setState(181);
				descriptorLista();
				}
			}

			setState(184);
			match(T__14);
			setState(185);
			tipo();
			setState(186);
			match(T__11);
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

	public static class ClasseNomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public ClasseNomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classeNome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterClasseNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitClasseNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitClasseNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClasseNomeContext classeNome() throws RecognitionException {
		ClasseNomeContext _localctx = new ClasseNomeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_classeNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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

	public static class MetodoNomeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(bcParser.ID, 0); }
		public MetodoNomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoNome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterMetodoNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitMetodoNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitMetodoNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoNomeContext metodoNome() throws RecognitionException {
		MetodoNomeContext _localctx = new MetodoNomeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_metodoNome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static class DescriptorListaContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public DescriptorListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptorLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).enterDescriptorLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bcListener ) ((bcListener)listener).exitDescriptorLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitDescriptorLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptorListaContext descriptorLista() throws RecognitionException {
		DescriptorListaContext _localctx = new DescriptorListaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_descriptorLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			tipo();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(193);
				match(T__17);
				setState(194);
				tipo();
				}
				}
				setState(199);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retorno);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__32);
				setState(201);
				match(T__11);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__33);
				setState(203);
				match(T__11);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__34);
				setState(205);
				match(T__11);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitControleFluxo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleFluxoContext controleFluxo() throws RecognitionException {
		ControleFluxoContext _localctx = new ControleFluxoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_controleFluxo);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__35);
				setState(209);
				rotulo();
				setState(210);
				match(T__11);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__36);
				setState(213);
				rotulo();
				setState(214);
				match(T__11);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__37);
				setState(217);
				rotulo();
				setState(218);
				match(T__11);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitRotulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotuloContext rotulo() throws RecognitionException {
		RotuloContext _localctx = new RotuloContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rotulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__38);
			setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bcVisitor ) return ((bcVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << ID))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\7\7c\n\7\f\7\16\7f\13\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\7\7q\n\7"+
		"\f\7\16\7t\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b}\n\b\f\b\16\b\u0080\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00a1\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\5\20\u00b1\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00b9\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\7\24\u00c6\n\24\f\24\16\24\u00c9\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00d1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00df\n\26\3\27\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\6\3\2\b\f\3\2\62\63\3\2\33\36\4"+
		"\2*/\61\61\2\u00eb\2\65\3\2\2\2\4:\3\2\2\2\6A\3\2\2\2\bS\3\2\2\2\nU\3"+
		"\2\2\2\f`\3\2\2\2\16y\3\2\2\2\20\u0081\3\2\2\2\22\u008d\3\2\2\2\24\u008f"+
		"\3\2\2\2\26\u0098\3\2\2\2\30\u00a0\3\2\2\2\32\u00a7\3\2\2\2\34\u00a9\3"+
		"\2\2\2\36\u00b0\3\2\2\2 \u00b2\3\2\2\2\"\u00be\3\2\2\2$\u00c0\3\2\2\2"+
		"&\u00c2\3\2\2\2(\u00d0\3\2\2\2*\u00de\3\2\2\2,\u00e0\3\2\2\2.\u00e3\3"+
		"\2\2\2\60\64\5\4\3\2\61\64\5\6\4\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3"+
		"\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2\2:;\7\3\2\2;<\7\62\2\2<=\7\4\2\2"+
		"=>\7\61\2\2>?\7\5\2\2?@\7\61\2\2@\5\3\2\2\2AE\7\4\2\2BD\5\b\5\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\61\2\2IN\7"+
		"\6\2\2JM\5\n\6\2KM\5\f\7\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\7\2\2R\7\3\2\2\2ST\t\2\2\2T\t\3\2\2\2U"+
		"Y\7\r\2\2VX\5\b\5\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2"+
		"[Y\3\2\2\2\\]\5.\30\2]^\7\61\2\2^_\7\16\2\2_\13\3\2\2\2`d\7\17\2\2ac\5"+
		"\b\5\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5"+
		".\30\2hi\7\61\2\2ik\7\20\2\2jl\5\16\b\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2"+
		"mn\7\21\2\2nr\7\6\2\2oq\5\22\n\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2su\3\2\2\2tr\3\2\2\2uv\7\7\2\2vw\7\22\2\2wx\7\23\2\2x\r\3\2\2\2y~\5"+
		"\20\t\2z{\7\24\2\2{}\5\20\t\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\17\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5.\30\2\u0082\u0083"+
		"\7\61\2\2\u0083\21\3\2\2\2\u0084\u008e\5\26\f\2\u0085\u008e\5\30\r\2\u0086"+
		"\u008e\5\32\16\2\u0087\u008e\5\34\17\2\u0088\u008e\5 \21\2\u0089\u008e"+
		"\5(\25\2\u008a\u008e\5*\26\2\u008b\u008e\5\24\13\2\u008c\u008e\5\36\20"+
		"\2\u008d\u0084\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0087"+
		"\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\5,\27"+
		"\2\u0090\u0091\7\25\2\2\u0091\25\3\2\2\2\u0092\u0093\7\26\2\2\u0093\u0094"+
		"\7\63\2\2\u0094\u0099\7\16\2\2\u0095\u0096\7\27\2\2\u0096\u0097\7\63\2"+
		"\2\u0097\u0099\7\16\2\2\u0098\u0092\3\2\2\2\u0098\u0095\3\2\2\2\u0099"+
		"\27\3\2\2\2\u009a\u009b\7\30\2\2\u009b\u009c\7\63\2\2\u009c\u00a1\7\16"+
		"\2\2\u009d\u009e\7\31\2\2\u009e\u009f\7\63\2\2\u009f\u00a1\7\16\2\2\u00a0"+
		"\u009a\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\60\2"+
		"\2\u00a3\u00a8\7\16\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\t\3\2\2\u00a6"+
		"\u00a8\7\16\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\33\3\2\2"+
		"\2\u00a9\u00aa\t\4\2\2\u00aa\u00ab\7\16\2\2\u00ab\35\3\2\2\2\u00ac\u00ad"+
		"\7\37\2\2\u00ad\u00b1\7\16\2\2\u00ae\u00af\7 \2\2\u00af\u00b1\7\16\2\2"+
		"\u00b0\u00ac\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3"+
		"\7!\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\5$\23\2\u00b6"+
		"\u00b8\7\20\2\2\u00b7\u00b9\5&\24\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5.\30\2\u00bc"+
		"\u00bd\7\16\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf#\3\2\2\2\u00c0"+
		"\u00c1\7\61\2\2\u00c1%\3\2\2\2\u00c2\u00c7\5.\30\2\u00c3\u00c4\7\24\2"+
		"\2\u00c4\u00c6\5.\30\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\'\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7#\2\2\u00cb\u00d1\7\16\2\2\u00cc\u00cd\7$\2\2\u00cd\u00d1\7\16"+
		"\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d1\7\16\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1)\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3"+
		"\u00d4\5,\27\2\u00d4\u00d5\7\16\2\2\u00d5\u00df\3\2\2\2\u00d6\u00d7\7"+
		"\'\2\2\u00d7\u00d8\5,\27\2\u00d8\u00d9\7\16\2\2\u00d9\u00df\3\2\2\2\u00da"+
		"\u00db\7(\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\16\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00d2\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00da\3\2\2\2\u00df"+
		"+\3\2\2\2\u00e0\u00e1\7)\2\2\u00e1\u00e2\7\63\2\2\u00e2-\3\2\2\2\u00e3"+
		"\u00e4\t\5\2\2\u00e4/\3\2\2\2\25\63\65ELNYdkr~\u008d\u0098\u00a0\u00a7"+
		"\u00b0\u00b8\u00c7\u00d0\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}