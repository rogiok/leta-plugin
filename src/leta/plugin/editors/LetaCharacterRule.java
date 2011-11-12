package leta.plugin.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

public class LetaCharacterRule implements IRule {

    private IToken keywordToken;
    private List<String> keywords;

    public LetaCharacterRule(IToken token, List<String> keywords) {
	this.keywordToken = token;
	this.keywords = keywords;
    }

    private String[] getKeywords(String prefix) {
	List<String> result = new ArrayList<String>();

	for (String w : keywords) {
	    if (w.startsWith(prefix)) {
		result.add(w);
	    }
	}

	return result.toArray(new String[result.size()]);
    }

    protected boolean isKeyword(String word) {
	for (String w : keywords) {
	    if (w.equals(word)) {
		return true;
	    }
	}
	
	return false;
    }

    protected boolean keywordExists(String prefix) {
	String[] currentWords = getKeywords(prefix);

	return currentWords != null && currentWords.length > 0;
    }

    public IToken evaluate(ICharacterScanner charScanner) {

	RuleBasedScanner scanner = (RuleBasedScanner) charScanner;
	StringBuffer buff = new StringBuffer();
	boolean stopReading = false;
	int reads = 0;

	while (!stopReading) {

	    reads++;

	    char c = (char) scanner.read();

	    String currentWord = buff.toString();

	    if (buff.length() > 0 && Character.isJavaIdentifierPart(c)) {
		if (isKeyword(currentWord.toLowerCase()) && !keywordExists(currentWord + c)) {
		    scanner.unread();
		    return keywordToken;
		}
	    }

	    buff.append(c);

	    stopReading = !keywordExists(currentWord.toLowerCase());
	}

	for (int i = 0; i < reads; i++) {
	    scanner.unread();
	}

	return Token.UNDEFINED;
    }
}
