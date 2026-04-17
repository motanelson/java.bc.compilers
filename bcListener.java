// Generated from bc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bcParser}.
 */
public interface bcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bcParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(bcParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(bcParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(bcParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(bcParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoClasse(bcParser.DeclaracaoClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoClasse(bcParser.DeclaracaoClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#modificador}.
	 * @param ctx the parse tree
	 */
	void enterModificador(bcParser.ModificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#modificador}.
	 * @param ctx the parse tree
	 */
	void exitModificador(bcParser.ModificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(bcParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(bcParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(bcParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(bcParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(bcParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(bcParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(bcParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(bcParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(bcParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(bcParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(bcParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(bcParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#store}.
	 * @param ctx the parse tree
	 */
	void enterStore(bcParser.StoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#store}.
	 * @param ctx the parse tree
	 */
	void exitStore(bcParser.StoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(bcParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(bcParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(bcParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(bcParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(bcParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(bcParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(bcParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(bcParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#controleFluxo}.
	 * @param ctx the parse tree
	 */
	void enterControleFluxo(bcParser.ControleFluxoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#controleFluxo}.
	 * @param ctx the parse tree
	 */
	void exitControleFluxo(bcParser.ControleFluxoContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#rotulo}.
	 * @param ctx the parse tree
	 */
	void enterRotulo(bcParser.RotuloContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#rotulo}.
	 * @param ctx the parse tree
	 */
	void exitRotulo(bcParser.RotuloContext ctx);
	/**
	 * Enter a parse tree produced by {@link bcParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(bcParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link bcParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(bcParser.TipoContext ctx);
}