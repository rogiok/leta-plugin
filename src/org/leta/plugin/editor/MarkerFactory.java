package org.leta.plugin.editor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.SimpleMarkerAnnotation;

public class MarkerFactory {

    public static IMarker createMarker(IResource resource) throws CoreException {

	IMarker marker = null;

	// Use the id that is defined in your plugin.xml
	marker = resource.createMarker("LetaTextMarker");

	marker.setAttribute("description", "this is one of my markers");
	// You can also use attributes from your supertype
	marker.setAttribute(IMarker.MESSAGE, "My Marker");

	return marker;
    }

    public static void addAnnotation(IMarker marker, ITextSelection selection, ITextEditor editor) {
	
	// The DocumentProvider enables to get the document currently loaded in the editor
	IDocumentProvider documentProvider = editor.getDocumentProvider();
	
	// This is the document we want to connect to. This is taken from the current editor input.
	IDocument document = documentProvider.getDocument(editor.getEditorInput());
	
	// The IannotationModel enables to add/remove/change annotation to a Document loaded in an Editor
	IAnnotationModel annotationModel = documentProvider.getAnnotationModel(editor.getEditorInput());
	
	// Note: The annotation type id specify that you want to create one of your annotations
//	SimpleMarkerAnnotation ma = new SimpleMarkerAnnotation("LetaAnnotationType", marker);

	SimpleMarkerAnnotation ma = new SimpleMarkerAnnotation("org.eclipse.ui.workbench.texteditor.error", marker);
	
	if (document != null && annotationModel != null) {
	    // Finally add the new annotation to the model
	    annotationModel.connect(document);
	    annotationModel.addAnnotation(ma, new Position(selection.getOffset(), selection.getLength()));
	    annotationModel.disconnect(document);
	}
	
    }
}
