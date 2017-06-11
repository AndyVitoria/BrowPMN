// Generated from BrowPMN.g4 by ANTLR 4.7
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
	 * Enter a parse tree produced by {@link BrowPMNParser#sttm}.
	 * @param ctx the parse tree
	 */
	void enterSttm(BrowPMNParser.SttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#sttm}.
	 * @param ctx the parse tree
	 */
	void exitSttm(BrowPMNParser.SttmContext ctx);
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
	 * Enter a parse tree produced by {@link BrowPMNParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(BrowPMNParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(BrowPMNParser.CodigoContext ctx);
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
	 * Enter a parse tree produced by {@link BrowPMNParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(BrowPMNParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(BrowPMNParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(BrowPMNParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(BrowPMNParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#paralelo}.
	 * @param ctx the parse tree
	 */
	void enterParalelo(BrowPMNParser.ParaleloContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#paralelo}.
	 * @param ctx the parse tree
	 */
	void exitParalelo(BrowPMNParser.ParaleloContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#paralelo_caminho}.
	 * @param ctx the parse tree
	 */
	void enterParalelo_caminho(BrowPMNParser.Paralelo_caminhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#paralelo_caminho}.
	 * @param ctx the parse tree
	 */
	void exitParalelo_caminho(BrowPMNParser.Paralelo_caminhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#exclusivo}.
	 * @param ctx the parse tree
	 */
	void enterExclusivo(BrowPMNParser.ExclusivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#exclusivo}.
	 * @param ctx the parse tree
	 */
	void exitExclusivo(BrowPMNParser.ExclusivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#exclusivo_caminho}.
	 * @param ctx the parse tree
	 */
	void enterExclusivo_caminho(BrowPMNParser.Exclusivo_caminhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#exclusivo_caminho}.
	 * @param ctx the parse tree
	 */
	void exitExclusivo_caminho(BrowPMNParser.Exclusivo_caminhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#exclusivo_restante}.
	 * @param ctx the parse tree
	 */
	void enterExclusivo_restante(BrowPMNParser.Exclusivo_restanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#exclusivo_restante}.
	 * @param ctx the parse tree
	 */
	void exitExclusivo_restante(BrowPMNParser.Exclusivo_restanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(BrowPMNParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(BrowPMNParser.FuncaoContext ctx);
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