package org.leta.plugin.editor;

import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class WordRule implements IPredicateRule {
    
    private IToken token;
    private List<String> keywords;

    public WordRule(IToken token, List<String> keywords) {
	super();
	this.token = token;
	this.keywords = keywords;
    }

    @Override
    public IToken evaluate(ICharacterScanner scanner) {
	return this.evaluate(scanner, false);
    }

    @Override
    public IToken getSuccessToken() {
	return token;
    }

    @Override
    public IToken evaluate(ICharacterScanner scanner, boolean resume) {

	StringBuffer buff = new StringBuffer();
	boolean stopReading = false;
	int reads = 0;

	if (scanner.getColumn() > 0) {
	    scanner.unread();
	    
	    char c = (char) scanner.read();

	    if (Character.isJavaIdentifierPart(c))
		return Token.UNDEFINED;
	}
	
	while (!stopReading) {

	    reads++;

	    char c = (char) scanner.read();

	    String currentWord = buff.toString();
	    
	    if (buff.length() > 0 && !Character.isJavaIdentifierPart(c)) {
		if (this.isKeyword(currentWord) && !this.hasProbablyKeywords(currentWord + c)) {
		    scanner.unread();
		    
		    return this.token;
		}
	    }
	    
	    buff.append(c);

	    stopReading = !this.hasProbablyKeywords(currentWord);
	}
	
	for (int i = 0; i < reads; i++) {
	    scanner.unread();
	}

	return Token.UNDEFINED;
    }

    private boolean isKeyword(String word) {
	
	word = word.toLowerCase();
	
	for (int i = 0; i < keywords.size(); i++) {
	    String w = keywords.get(i).toLowerCase();
	    
	    if (w.equals(word))
		return true;
	}
	
	return false;
    }
    
    private boolean hasProbablyKeywords(String prefix) {
	
	prefix = prefix.toLowerCase();
	
	for (int i = 0; i < keywords.size(); i++) {
	    String w = keywords.get(i).toLowerCase();

	    if (w.startsWith(prefix))
		return true;
	}

	return false;
    }

}
