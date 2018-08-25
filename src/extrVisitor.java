// Generated from extr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link extrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface extrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link extrParser#linha1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha1(@NotNull extrParser.Linha1Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#comments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComments(@NotNull extrParser.CommentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#l1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL1(@NotNull extrParser.L1Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linhaJournal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinhaJournal(@NotNull extrParser.LinhaJournalContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#subjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjects(@NotNull extrParser.SubjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull extrParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#documento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumento(@NotNull extrParser.DocumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(@NotNull extrParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linha6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha6(@NotNull extrParser.Linha6Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#autores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutores(@NotNull extrParser.AutoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linha4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha4(@NotNull extrParser.Linha4Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linha5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha5(@NotNull extrParser.Linha5Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linha2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha2(@NotNull extrParser.Linha2Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#linha3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha3(@NotNull extrParser.Linha3Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#pontuacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPontuacao(@NotNull extrParser.PontuacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#alfanumerico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlfanumerico(@NotNull extrParser.AlfanumericoContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#subAux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAux2(@NotNull extrParser.SubAux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#resumo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumo(@NotNull extrParser.ResumoContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#seq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq(@NotNull extrParser.SeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link extrParser#subAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAux(@NotNull extrParser.SubAuxContext ctx);
}