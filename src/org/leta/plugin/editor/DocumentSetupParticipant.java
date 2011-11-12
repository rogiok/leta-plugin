package org.leta.plugin.editor;

import org.eclipse.core.filebuffers.IDocumentSetupParticipant;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.leta.plugin.editor.event.DocumentListener;

public class DocumentSetupParticipant implements IDocumentSetupParticipant {

    @Override
    public void setup(IDocument document) {
	
	IDocumentPartitioner partitioner = new FastPartitioner(new PartitionScanner(), PartitionScanner.getPartitionTypes());
	
	document.setDocumentPartitioner(partitioner);
	document.addDocumentListener(new DocumentListener());

	partitioner.connect(document);
	
    }

}
