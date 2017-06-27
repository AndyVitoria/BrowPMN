// Generated from BrowPMN.g4 by ANTLR 4.5.1

import struct.*;

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
	 * Enter a parse tree produced by {@link BrowPMNParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(BrowPMNParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(BrowPMNParser.VariavelContext ctx);
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