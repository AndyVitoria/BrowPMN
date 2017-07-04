// Generated from BrowPMN.g4 by ANTLR 4.5

import struct.*;
import static struct.Node.*;

import org.antlr.v4.runtime.misc.NotNull;
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
	 * Enter a parse tree produced by {@link BrowPMNParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(BrowPMNParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(BrowPMNParser.AtribuicaoContext ctx);
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
	 * Enter a parse tree produced by {@link BrowPMNParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(BrowPMNParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(BrowPMNParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(BrowPMNParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(BrowPMNParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#exclusive}.
	 * @param ctx the parse tree
	 */
	void enterExclusive(BrowPMNParser.ExclusiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#exclusive}.
	 * @param ctx the parse tree
	 */
	void exitExclusive(BrowPMNParser.ExclusiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#parallel}.
	 * @param ctx the parse tree
	 */
	void enterParallel(BrowPMNParser.ParallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#parallel}.
	 * @param ctx the parse tree
	 */
	void exitParallel(BrowPMNParser.ParallelContext ctx);
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
}