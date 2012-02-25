package org.leta.plugin.editor;

import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.widgets.Shell;

/**
 * Class defines behavior in editor like syntax highlight. 
 * 
 * @author Rogerio
 *
 */
public class ViewerConfiguration extends SourceViewerConfiguration {

    /**
     * Defines syntax color using Reconciling, Damage e Repair concepts.
     */
    @Override
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
	
	PresentationReconciler reconciler = new PresentationReconciler();
	
	// Uses the Scanner to define rules for syntax color
	DefaultDamagerRepairer dr = new DefaultDamagerRepairer(new GeneralCodeScanner());
	reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
	reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
	
//	dr = new DefaultDamagerRepairer(new CodeScanner());
//	reconciler.setDamager(dr, PartitionScanner.PARTITION_TYPES[0]);
//	reconciler.setRepairer(dr, PartitionScanner.PARTITION_TYPES[0]);
	
	dr = new DefaultDamagerRepairer(new CommentCodeScanner());
	reconciler.setDamager(dr, PartitionScanner.COMMENT);
	reconciler.setRepairer(dr, PartitionScanner.COMMENT);
	
	return reconciler;
    }
    
    @Override
    public IInformationControlCreator getInformationControlCreator(ISourceViewer sourceViewer) {
	return new IInformationControlCreator() {
	    public IInformationControl createInformationControl(Shell parent) {
//		 return new HoverFactory.Hover.DefaultInformationControl2(parent, true);
		return new HoverFactory.Hover.DefaultInformationControl3(parent, true);
	    }
	};
    }
	
    @Override
    public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
	return HoverFactory.getHover();
    }


/*
    @Override
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
	
	ContentAssistant assistant= new ContentAssistant();
	
	assistant.enableAutoActivation(true);
	assistant.setAutoActivationDelay(500);
	assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
	assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
	assistant.setContextInformationPopupBackground(new ColorManager().getColor(ColorManager.BACKGROUND));
	assistant.setStatusLineVisible(true);
	
	assistant.setContentAssistProcessor(new IContentAssistProcessor() {

	    @Override
	    public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		return new ICompletionProposal[] {new CompletionProposal("ABC", offset, 0, "ABC".length())};
	    }

	    @Override
	    public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return new IContextInformation[] {new ContextInformation("Teste", "OUtro")};
	    }

	    @Override
	    public char[] getCompletionProposalAutoActivationCharacters() {
		return new char[] { '.' };
	    }

	    @Override
	    public char[] getContextInformationAutoActivationCharacters() {
		return new char[] { '#' };
	    }

	    @Override
	    public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	    }

	    @Override
	    public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	    }
	    
	}, IDocument.DEFAULT_CONTENT_TYPE);
	
	return assistant;
    }*/

//    @Override
//    public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
//	return HoverFactory.getAnnotationHover();
//    }

//    @Override
//    public IAnnotationHover getOverviewRulerAnnotationHover(ISourceViewer sourceViewer) {
//	return HoverFactory.getAnnotationHover();
//    }
    
}
