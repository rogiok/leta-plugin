package org.leta.plugin.editor.event;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import leta.core.Generator;
import leta.core.grammar.SyntaxMessage;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ide.ResourceUtil;
import org.leta.plugin.editor.LetaConfiguration;
import org.leta.plugin.editor.MarkerFactory;

public class DocumentListener implements IDocumentListener {

    @Override
    public void documentAboutToBeChanged(DocumentEvent event) {
//	System.out.println("1");
    }

    @Override
    public void documentChanged(DocumentEvent event) {
	
	IEditorInput editorInput = LetaConfiguration.getInstance().getLetaEditor().getEditorInput();
	IAnnotationModel annotationModel = LetaConfiguration.getInstance().getLetaEditor().getDocumentProvider().getAnnotationModel(editorInput);

	if (annotationModel == null)
	    return;

	try {
	    IFile resource = ResourceUtil.getFile(editorInput);

	    // 1. Removes all annotations and markers
//	    MarkerFactory.removeAllAnnotation(LetaConfiguration.getInstance().getLetaEditor());
	    resource.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);

	    IDocument document = event.getDocument();

	    if (document != null) {
		List<SyntaxMessage> errors = new ArrayList<SyntaxMessage>();
		
		try {
		    errors = new Generator().checkSyntax(document.get().getBytes());
		} catch (IOException e1) {
		    e1.printStackTrace();
		    
		    return;
		} catch (RecognitionException e1) {
		    e1.printStackTrace();
		    
		    return;
		}
		
//		MarkerFactory.connect(LetaConfiguration.getInstance().getLetaEditor());
		
		for (SyntaxMessage m : errors) {

		    try {

		    IMarker marker = resource.createMarker(IMarker.PROBLEM);
		    
		    int start = document.getLineOffset(m.getLine() - 1) + m.getCharPositionInLine();
		    int end = start + (m.getToken() != null ? m.getToken().length() : 1);
		    
//		    marker.setAttribute("syntaxMessage", m.getMessage());
		    marker.setAttribute(IMarker.MESSAGE, m.getMessage());
		    marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		    marker.setAttribute(IMarker.LINE_NUMBER, m.getLine());
		    marker.setAttribute(IMarker.CHAR_START, start);
//		    marker.setAttribute(IMarker.CHAR_END, m.getCharPositionInLine() + (m.getToken() != null ? m.getToken().length() : 1));
		    marker.setAttribute(IMarker.CHAR_END, end);

//		    marker.setAttribute(IMarker.LINE_NUMBER, 1);
//		    marker.setAttribute(IMarker.CHAR_START, 3);
//		    marker.setAttribute(IMarker.CHAR_END, 5);

		    System.out.println(m);
		    
//			TextSelection selection = new TextSelection(document, document.getLineOffset(m.getLine() - 1) + m.getCharPositionInLine(), m.getToken() != null ? m.getToken().length() : 1);

//			MarkerFactory.addAnnotation(marker, selection, LetaConfiguration.getInstance().getLetaEditor());
		    } catch (BadLocationException e) {
		    }
		}
		
		System.out.println();
		
//		MarkerFactory.disconnect(LetaConfiguration.getInstance().getLetaEditor());

	    }
	    /*
	    List<IMarker> markers = Arrays.asList(resource.findMarkers("LetaTextMarker", false, IResource.DEPTH_ZERO));
	    
	    IMarker marker = !markers.isEmpty() ? markers.get(0) : null;
	    
	    // Verifies if the resource has some marker. 
	    if (marker == null) {
		marker = resource.createMarker("LetaTextMarker");
	    
		System.out.println(marker.exists() ? "New marker" : null);
	    
		// This is the document we want to connect to. This is taken from the current editor input.
//		IDocument document = event.getDocument();

		TextSelection selection = new TextSelection(document, event.getOffset(), 5);

		System.out.println("offset: " + event.getOffset() + " length: " + event.getLength());

		MarkerFactory.addAnnotation(marker, selection, LetaConfiguration.getInstance().getLetaEditor());
	    } else {
	    }*/
	} catch (CoreException e) {
	    e.printStackTrace();
	}
	
    }

}
