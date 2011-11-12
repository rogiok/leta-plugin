package leta.plugin.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class LetaSourceViewerConfiguration extends SourceViewerConfiguration {
    
    private LetaColorManager colorManager;
    
    public LetaSourceViewerConfiguration(LetaColorManager colorManager) {
	this.colorManager = colorManager;
    }

    /**
     * Metodo que define as regras e as cores relacionadas.
     */
    @Override
    public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
	PresentationReconciler reconciler = new PresentationReconciler();

	LetaBlockScanner scanner = new LetaBlockScanner(colorManager);

	DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
	reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
	reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

	return reconciler;
    }

    /**
     * Metodo que exibe as listas de comandos.
     */
    @Override
    public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {

	ContentAssistant contentAssistant = null;

	contentAssistant = new ContentAssistant();
	contentAssistant.setContentAssistProcessor(new LetaContentAssist(), IDocument.DEFAULT_CONTENT_TYPE);
	contentAssistant.enableAutoActivation(true);
	contentAssistant.setAutoActivationDelay(500);
	contentAssistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
	contentAssistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
	contentAssistant.setContextInformationPopupBackground(colorManager.getColor(LetaColorManager.BACKGROUND));
	
	return contentAssistant;

    }

}