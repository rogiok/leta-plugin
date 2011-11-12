package org.leta.plugin.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

public class PartitionScanner extends RuleBasedPartitionScanner {

    public static String CODE = "LETA_PARTITION_CODE";
    public static String COMMENT = "LETA_PARTITION_COMMENT";
    
    public PartitionScanner() {
	super();
	
	List<IPredicateRule> rules = new ArrayList<IPredicateRule>();

	// Add rule for single line comments.
	IToken comment = new Token(COMMENT);

	rules.add(new MultiLineRule("/*", "*/", comment, (char) 0, true));

	IPredicateRule[] result = new IPredicateRule[rules.size()];
	rules.toArray(result);
	this.setPredicateRules(result);
    }
    
    public static String[] getPartitionTypes() {
	
	String[] result = new String[2];
	
	result[0] = CODE;
	result[1] = COMMENT;
	
	return result;
    }

}
