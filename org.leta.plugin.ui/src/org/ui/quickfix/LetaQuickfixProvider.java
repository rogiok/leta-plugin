package org.ui.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.validation.LetaJavaValidator;

public class LetaQuickfixProvider extends DefaultQuickfixProvider {

    @Fix(value = LetaJavaValidator.INCOMPLETE_FACT)
    public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
	
	String[] data = issue.getData();
	
	if (data[0].equals("10")) {
	}
	
	acceptor.accept(issue, "Create a fact (term complement)", "Create a fact with term and complement.", "upcase.png", new IModification() {

	    public void apply(IModificationContext context) throws BadLocationException {
		
		IXtextDocument xtextDocument = context.getXtextDocument();
		xtextDocument.replace(issue.getOffset() + issue.getLength(), 0, " term complement");
		
	    }
	});

	acceptor.accept(issue, "Create a complement", "Create a complement for a term.", "upcase.png", new IModification() {

	    public void apply(IModificationContext context) throws BadLocationException {
		
		IXtextDocument xtextDocument = context.getXtextDocument();
		xtextDocument.replace(issue.getOffset() + issue.getLength(), 0, " complement");
		
//		IXtextDocument xtextDocument = context.getXtextDocument();
//		String firstLetter = xtextDocument.get(issue.getOffset(), 1);
//		xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
	    }
	});

    }

    // @Fix(MyJavaValidator.INVALID_NAME)
    // public void capitalizeName(final Issue issue, IssueResolutionAcceptor
    // acceptor) {
    // acceptor.accept(issue, "Capitalize name", "Capitalize the name.",
    // "upcase.png", new IModification() {
    // public void apply(IModificationContext context) throws
    // BadLocationException {
    // IXtextDocument xtextDocument = context.getXtextDocument();
    // String firstLetter = xtextDocument.get(issue.getOffset(), 1);
    // xtextDocument.replace(issue.getOffset(), 1, firstLetter.toUpperCase());
    // }
    // });
    // }

}
