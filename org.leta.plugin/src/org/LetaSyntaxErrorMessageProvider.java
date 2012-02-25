package org;

import org.antlr.runtime.UnwantedTokenException;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class LetaSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {

    @Override
    public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
	if (context.getRecognitionException() instanceof UnwantedTokenException) {
	    return new SyntaxErrorMessage("Invalid character(s) " + context.getRecognitionException().token.getText(), Diagnostic.SYNTAX_DIAGNOSTIC);
	} else
	    System.out.println(context.getRecognitionException());
	
	return super.getSyntaxErrorMessage(context);
//	return null;
    }

    @Override
    public SyntaxErrorMessage getSyntaxErrorMessage(IValueConverterErrorContext context) {
	return super.getSyntaxErrorMessage(context);
    }

}
