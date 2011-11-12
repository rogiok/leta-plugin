package org.leta.plugin.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class CommentCodeScanner extends RuleBasedPartitionScanner {

    private ColorManager colorManager;
    
    public CommentCodeScanner() {
	super();
	
	this.colorManager = new ColorManager();
	
	// Add rule for single line comments.
	IToken comment = new Token(new TextAttribute(colorManager.getColor(ColorManager.COMMENT)));

	this.setDefaultReturnToken(comment);
    }

}
