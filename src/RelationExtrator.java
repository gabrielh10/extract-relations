import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.naturalli.NaturalLogicAnnotations;
import edu.stanford.nlp.util.CoreMap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

/**
 * A demo illustrating how to call the OpenIE system programmatically.
 */
public class RelationExtrator {

  public static void main(String[] args) throws Exception {
    // Create the Stanford CoreNLP pipeline
    int quantidadeDoc=3;
    String out = "E:\\workspace\\ExtraçãoMineração\\out.txt";
    FileWriter outWriter = new FileWriter(out,true);
	 
	
    Properties props = new Properties();
    props.put("openie.affinity_probability_cap", 1.0);
    props.setProperty("annotators", "tokenize,ssplit,pos,lemma,depparse,natlog,openie");
    
    StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
    
    // Annotate an example document.

    for(int i=1;i<=quantidadeDoc;i++){
    String message = org.apache.commons.io.IOUtils.toString(new FileReader ( "E:\\workspace\\ExtraçãoMineração\\doc"+i+".txt" ));
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
    	      		"("+triple.subjectLemmaGloss()+","+triple.objectLemmaGloss()+")")   ;
      
        
           }
    }
      outWriter.write("Documento "+i+" : \r\n");
      for(int j=0;j<relations.size();j++){
    	      outWriter.write("Relação "+(j+1)+" : "+relations.get(j)+"  \r\n");
      }
    }
     
    outWriter.close();
    System.out.println("Finalizado");
  }
}