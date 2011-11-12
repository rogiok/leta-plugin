package org.leta.plugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWhitespaceDetector;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;

public class GeneralCodeScanner extends RuleBasedPartitionScanner {

    private ColorManager colorManager;
    
    public GeneralCodeScanner() {
	super();
	
	this.colorManager = new ColorManager();
	
	List<IPredicateRule> rules = new ArrayList<IPredicateRule>();

	// Add rule for single line comments.
	IToken comment = new Token(new TextAttribute(colorManager.getColor(ColorManager.COMMENT)));

	rules.add(new EndOfLineRule("//", comment));

//	rules.add(new WhitespaceRule(new WhitespaceDetector()));
	
	IToken string = new Token(new TextAttribute(colorManager.getColor(ColorManager.STRING)));

	// Add rule for strings and character constants.
	rules.add(new SingleLineRule("\"", "\"", string, '\\'));
//	rules.add(new SingleLineRule("'", "'", string, '\\'));

	// Add rule for reserved words
	IToken reservedWord = new Token(new TextAttribute(colorManager.getColor(ColorManager.WORD)));
	
	List<String> mainReservedwords = new ArrayList<String>();

	mainReservedwords.add("Test");
	mainReservedwords.add("When");
	mainReservedwords.add("Verify");
	mainReservedwords.add("And");
	mainReservedwords.add("Or");

	rules.add(new WordRule(reservedWord, mainReservedwords));

	IPredicateRule[] result = new IPredicateRule[rules.size()];
	rules.toArray(result);
	this.setPredicateRules(result);

//	this.setDefaultReturnToken(new Token(new TextAttribute(colorManager.getColor(ColorManager.DEFAULT))));

    }

    class WhitespaceDetector implements IWhitespaceDetector {
	public boolean isWhitespace(char c) {
	    return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
    }

}
