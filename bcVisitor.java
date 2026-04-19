// Generated from bc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bcParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(bcParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(bcParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoClasse(bcParser.DeclaracaoClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#modificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificador(bcParser.ModificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(bcParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(bcParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#parametroLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroLista(bcParser.ParametroListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(bcParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(bcParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#labelDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDef(bcParser.LabelDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(bcParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#store}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore(bcParser.StoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(bcParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#operadorBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinario(bcParser.OperadorBinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#stackOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackOp(bcParser.StackOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMetodo(bcParser.ChamadaMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#classeNome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasseNome(bcParser.ClasseNomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#metodoNome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoNome(bcParser.MetodoNomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#descriptorLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescriptorLista(bcParser.DescriptorListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(bcParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#controleFluxo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControleFluxo(bcParser.ControleFluxoContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#rotulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotulo(bcParser.RotuloContext ctx);
	/**
	 * Visit a parse tree produced by {@link bcParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(bcParser.TipoContext ctx);
}