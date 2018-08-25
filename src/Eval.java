import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.naturalli.NaturalLogicAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.util.CoreMap;

public class Eval extends extrBaseVisitor{

		public String visitLinha1(@NotNull extrParser.Linha1Context ctx) { 
			String parcial = ctx.getText();
			if(parcial.lastIndexOf("[") > 0 && parcial.indexOf("arXiv") > 0){
			String tratado = parcial.substring(parcial.indexOf("arXiv"), parcial.lastIndexOf("["));
			System.out.println("Link:"+tratado);
			return tratado;
			
			}else{
				return null;
			}
			
		}
		public String visitLinha2(@NotNull extrParser.Linha2Context ctx) {
			if(ctx.getText().length()-2 > 0){
			String titulo = ctx.getText().substring(0, ctx.getText().length()-2);
			System.out.println("Title:"+ titulo);
			return titulo;
			}else{
				return null;
			}
		}
		public String visitLinha3(@NotNull extrParser.Linha3Context ctx) { 
			if(ctx.getText().length()-2 > 0){
			String autores = ctx.getText().substring(0, ctx.getText().length()-2);
			System.out.println("Authors:"+autores);
			return autores;
			}else{
				return null;
			}
		}	
		public String visitLinha4(@NotNull extrParser.Linha4Context ctx) { 
			if(ctx.getText().length()-2>0){
				String comments = ctx.getText().substring(0, ctx.getText().length()-2);
				System.out.println(comments);
				return comments;
			}else{
				System.out.println("Comments: Null");
				return null;
				} 
			}
		public String visitLinha5(@NotNull extrParser.Linha5Context ctx) { 
			String subjects = ctx.getText();
			System.out.println(subjects);
			return subjects;
			}
	}	
	/*	public String visitLinha6(@NotNull extrParser.Linha6Context ctx) {
			Properties props = new Properties();
		    props.put("openie.affinity_probability_cap", 1.0);
		    props.setProperty("annotators", "tokenize,ssplit,pos,lemma,depparse,natlog,openie");
		    
		    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
		    
		    // Annotate an example document.

		    
		    String message = ctx.getText();
		    System.out.println(message);
		    Annotation doc = new Annotation(message);
		    pipeline.annotate(doc);
		    List<String> relations = new ArrayList<String>();
		    	   
		    // Loop over sentences in the document
		    for (CoreMap sentence : doc.get(CoreAnnotations.SentencesAnnotation.class)) {
		      // Get the OpenIE triples for the sentence
		      Collection<RelationTriple> triples = sentence.get(NaturalLogicAnnotations.RelationTriplesAnnotation.class);
		      // Print the triples
		    
		      for (RelationTriple triple : triples) {
		           
		    	    relations.add(triple.relationLemmaGloss()  +
		    	      		"("+triple.subjectLemmaGloss()+","+triple.objectLemmaGloss()+")") ; 
		        
		           }
		    }
		      
		      for(int j=0;j<relations.size();j++){
		    	     System.out.println("Relação "+(j+1)+" : "+relations.get(j)+"  \r\n");
		      }
		    
		   //System.out.println("Finalizado");
		    return null;
			}

		}
		public String visitComments(@NotNull extrParser.CommentsContext ctx) { 
		
					/* 
		public T visitL1(@NotNull extrParser.L1Context ctx) { return visitChildren(ctx); }
		public T visitSubjects(@NotNull extrParser.SubjectsContext ctx) { return visitChildren(ctx); }
		public T visitStart(@NotNull extrParser.StartContext ctx) { return visitChildren(ctx); }
		public T visitTitulo(@NotNull extrParser.TituloContext ctx) { return visitChildren(ctx); }
		

		public T visitAutores(@NotNull extrParser.AutoresContext ctx) { return visitChildren(ctx); }
		
		
	
		public T visitPontuacao(@NotNull extrParser.PontuacaoContext ctx) { return visitChildren(ctx); }
		public T visitAlfanumerico(@NotNull extrParser.AlfanumericoContext ctx) { return visitChildren(ctx); }
		public T visitResumo(@NotNull extrParser.ResumoContext ctx) { return visitChildren(ctx); }
	}
*/

