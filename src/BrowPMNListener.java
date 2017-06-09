// Generated from BrowPMN.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrowPMNParser}.
 */
public interface BrowPMNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BrowPMNParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BrowPMNParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(BrowPMNParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(BrowPMNParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#assinatura}.
	 * @param ctx the parse tree
	 */
	void enterAssinatura(BrowPMNParser.AssinaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#assinatura}.
	 * @param ctx the parse tree
	 */
	void exitAssinatura(BrowPMNParser.AssinaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#fluxo}.
	 * @param ctx the parse tree
	 */
	void enterFluxo(BrowPMNParser.FluxoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#fluxo}.
	 * @param ctx the parse tree
	 */
	void exitFluxo(BrowPMNParser.FluxoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(BrowPMNParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(BrowPMNParser.ValorContext ctx);
}