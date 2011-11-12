package leta.plugin.editors;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class LetaContentAssist implements IContentAssistProcessor {

    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
	
	String[] proposals = {"Suite", "Test", "When", "Verify"};
	
	ICompletionProposal[] result = new ICompletionProposal[proposals.length];
	
	for (int i = 0; i < proposals.length; i++) {
//	    IContextInformation info = new ContextInformation(fgProposals[i], MessageFormat.format(JavaEditorMessages
//		    .getString("CompletionProcessor.Proposal.ContextInfo.pattern"), new Object[] { fgProposals[i] }));

//	    result[i] = new CompletionProposal(fgProposals[i], documentOffset, 0, fgProposals[i].length(), null, fgProposals[i], info, MessageFormat.format(
//		    JavaEditorMessages.getString("CompletionProcessor.Proposal.hoverinfo.pattern"), new Object[] { fgProposals[i] })); //$NON-NLS-1$

	    result[i] = new CompletionProposal(proposals[i], offset, 0, proposals[i].length());
	}
	
	return result;
    }

    public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
	// TODO Auto-generated method stub
	return null;
    }

    public char[] getCompletionProposalAutoActivationCharacters() {
	return new char[] {'.'};
    }

    public char[] getContextInformationAutoActivationCharacters() {
	// TODO Auto-generated method stub
	return null;
    }

    public IContextInformationValidator getContextInformationValidator() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getErrorMessage() {
	// TODO Auto-generated method stub
	return null;
    }

}
