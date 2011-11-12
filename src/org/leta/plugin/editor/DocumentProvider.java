package org.leta.plugin.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.editors.text.FileDocumentProvider;

@Deprecated
public class DocumentProvider extends FileDocumentProvider {

    protected IDocument createDocument(Object element) throws CoreException {
	IDocument document = super.createDocument(element);

//	IDocumentPartitioner partitioner = new FastPartitioner(new PartitionScanner(), PartitionScanner.getPartitionTypes());
//	partitioner.connect(document);
	
//	document.setDocumentPartitioner(partitioner);
	
	return document;
    }
    
}