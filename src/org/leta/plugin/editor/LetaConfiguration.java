package org.leta.plugin.editor;


public class LetaConfiguration {

    private static LetaConfiguration instance;
    
    private LetaEditor letaEditor; 
    
    public static LetaConfiguration getInstance() {
	if (instance == null) {
	    instance = new LetaConfiguration();
	}
	
	return instance;
    }

    public LetaEditor getLetaEditor() {
        return letaEditor;
    }

    public void setLetaEditor(LetaEditor letaEditor) {
        this.letaEditor = letaEditor;
    }
    
}
