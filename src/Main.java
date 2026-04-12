import ast.types.Type;
import errorHandler.ErrorHandler;
import generator.OffsetVisitor;
import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import ast.ASTNode;
import parser.TSmmLexer;
import parser.TSmmParser;
import visitor.IdentificationVisitor;
import visitor.LValueVisitor;
import visitor.TypeCheckingVisitor;
import visitor.Visitor;

public class Main {

	public static void main(String... args) throws Exception {
		   if (args.length<1) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		TSmmLexer lexer = new TSmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		TSmmParser parser = new TSmmParser(tokens);
		ASTNode ast = parser.program().ast;

		Visitor<Void,Void> lValueVisitor = new LValueVisitor(); //TODO: instanciate a new LValueVisitor
		Visitor<Void,Void> identificationVisitor = new IdentificationVisitor();
		Visitor<Type,Void> typeCheckingVisitor = new TypeCheckingVisitor();
		ast.accept(lValueVisitor,null);	  //Incorrect use of the Visitor pattern, Fix it!
		ast.accept(identificationVisitor,null);
		ast.accept(typeCheckingVisitor,null);

		// * Check errors
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			OffsetVisitor offsetVisitor = new OffsetVisitor();
			ast.accept(offsetVisitor,null);
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
		}
	}
}
