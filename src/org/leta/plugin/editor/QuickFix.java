package org.leta.plugin.editor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.ui.IMarkerResolution;

public class QuickFix implements IMarkerResolution {

    private String label;
    
    public QuickFix(String label) {
	super();
	this.label = label;
    }

    @Override
    public String getLabel() {
	return this.label;
    }

    @Override
    public void run(IMarker marker) {
	System.out.println();
    }

}
