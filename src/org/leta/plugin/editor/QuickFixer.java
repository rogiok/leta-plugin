package org.leta.plugin.editor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class QuickFixer implements IMarkerResolutionGenerator {

    @Override
    public IMarkerResolution[] getResolutions(IMarker marker) {
	
	try {
	    String m = (String) marker.getAttribute("syntaxMessage");
	    
	    return new IMarkerResolution[] {new QuickFix("Create a term (" + (m != null ? m : "") + ")")};
	} catch (CoreException e) {
	    e.printStackTrace();
	}
	
	return null;
    }

}
