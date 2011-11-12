package org.leta.plugin.editor.event;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ide.ResourceUtil;
import org.leta.plugin.editor.LetaConfiguration;
import org.leta.plugin.editor.MarkerFactory;

public class DocumentListener implements IDocumentListener {

    @Override
    public void documentAboutToBeChanged(DocumentEvent event) {
	System.out.println("1");
    }

    @Override
    public void documentChanged(DocumentEvent event) {
	System.out.println("2");
	
	IEditorInput editorInput = LetaConfiguration.getInstance().getLetaEditor().getEditorInput();

	IFile resource = ResourceUtil.getFile(editorInput);
	
	try {
	    List<IMarker> markers = Arrays.asList(resource.findMarkers(null, true, IResource.DEPTH_ZERO));
//	    List<IMarker> markers = Arrays.asList(resource.findMarkers("LetaTextMarker", true, IResource.DEPTH_ZERO));
	    
	    IMarker marker = !markers.isEmpty() ? markers.get(0) : null;
	    
	    // Verifies if the resource has some marker of LetaTextMarker type.
	    // See LetaTextMarker type in plugin definition.
	    if (marker == null) {
		marker = MarkerFactory.createMarker(resource);
	    
		System.out.println(marker.exists() ? "New marker" : null);
	    }
	    
	    // This is the document we want to connect to. This is taken from the current editor input.
	    IDocument document = event.getDocument();

	    TextSelection selection = new TextSelection(document, event.getOffset(), 5);
	    
	    System.out.println("offset: " + event.getOffset() + " length: " + event.getLength());
	    
	    MarkerFactory.addAnnotation(marker, selection, LetaConfiguration.getInstance().getLetaEditor());
	} catch (CoreException e) {
	    e.printStackTrace();
	}
	
    }

}
