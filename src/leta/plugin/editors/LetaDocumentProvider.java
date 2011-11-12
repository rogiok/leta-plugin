package leta.plugin.editors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class LetaDocumentProvider extends FileDocumentProvider {

    protected IDocument createDocument(Object element) throws CoreException {
	IDocument document = super.createDocument(element);

	return document;
    }
    
}