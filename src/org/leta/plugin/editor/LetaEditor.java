package org.leta.plugin.editor;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * Main class initialized by plugin.xml when a file with extension .leta is
 * openned.
 * 
 * @author Rogerio
 * 
 */
public class LetaEditor extends TextEditor {

    public LetaEditor() {
	super();
    }

    @Override
    protected void initializeEditor() {
	super.initializeEditor();

	// Defines the syntax highlight for editor
	this.setSourceViewerConfiguration(new EditorConfiguration());
	// this.setDocumentProvider(new DocumentProvider());

	LetaConfiguration.getInstance().setLetaEditor(this);
	
	// Add a resource listener for leta files
	IResourceChangeListener rcl = new IResourceChangeListener() {
	    public void resourceChanged(IResourceChangeEvent event) {
		IResource resource = event.getResource();
		if (resource != null && resource.getFileExtension().equals("leta")) {
		    System.out.println("3");
		}
	    }
	};
	ResourcesPlugin.getWorkspace().addResourceChangeListener(rcl);
    }

    @Override
    protected void doSetInput(IEditorInput input) throws CoreException {
	super.doSetInput(input);
    }

    @Override
    protected void createActions() {
	super.createActions();
    }

    @Override
    public void doSave(IProgressMonitor progressMonitor) {
	super.doSave(progressMonitor);

    }

    /*
    protected void configureSourceViewerDecorationSupport000() {

	for (Object m : this.getAnnotationPreferences().getAnnotationPreferences()) {
	    System.out.println(((AnnotationPreference) m).getAnnotationType());
	    
	    fSourceViewerDecorationSupport.setAnnotationPreference((AnnotationPreference) m);
	}
	
//	fSourceViewerDecorationSupport.setAnnotationPainterPreferenceKeys(DefaultMarkerAnnotationAccess.UNKNOWN, TextEditor.UNKNOWN_INDICATION_COLOR, UNKNOWN_INDICATION, UNKNOWN_INDICATION_IN_OVERVIEW_RULER, 0);

//	fSourceViewerDecorationSupport.setCursorLinePainterPreferenceKeys(CURRENT_LINE, CURRENT_LINE_COLOR);
//	fSourceViewerDecorationSupport.setMarginPainterPreferenceKeys(PRINT_MARGIN, PRINT_MARGIN_COLOR, PRINT_MARGIN_COLUMN);
	fSourceViewerDecorationSupport.setSymbolicFontName(this.getFontPropertyPreferenceKey());
    }*/

}
