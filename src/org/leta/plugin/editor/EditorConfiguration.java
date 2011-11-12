package org.leta.plugin.editor;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

/**
 * Class defines behavior in editor like syntax highlight. 
 * 
 * @author Rogerio
 *
 */
public class EditorConfiguration extends SourceViewerConfiguration {

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

}
