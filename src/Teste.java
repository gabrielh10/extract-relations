import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Teste {

	public static void main(String[] args) throws Exception {
		InputStream stream = new FileInputStream("Equipe5 Docx para Text.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		extrLexer lexer = new extrLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		extrParser parser = new extrParser(token);
		ParseTree tree = parser.start();
	    Eval eval = new Eval();
	    eval.visit(tree);
	    RelationExtrator extrator = new RelationExtrator();
	    extrator.main(args);
	}
}
