package leta.plugin.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

public class LetaKeywordRule implements IRule {

    private IToken keywordToken;
    private List<String> keywords;

    public LetaKeywordRule(IToken token, List<String> keywords) {
	this.keywordToken = token;
	this.keywords = keywords;
    }

    private String[] getKeywords(String prefix) {
	List<String> result = new ArrayList<String>();

	for (int i = 0; i < keywords.size(); i++) {
	    String w = keywords.get(i).toLowerCase();

	    if (w.startsWith(prefix))
		result.add(w);
	}

	return result.toArray(new String[result.size()]);
    }

    protected boolean isKeyword(String word) {
	for (int i = 0; i < keywords.size(); i++) {
	    String w = keywords.get(i).toLowerCase();
	    if (w.equals(word))
		return true;
	}
	return false;
    }

    /**
     * @param prefix
     * @return
     */
    protected boolean keywordExists(String prefix) {
	String[] currentWords = getKeywords(prefix.toLowerCase());

	return currentWords != null && currentWords.length > 0;
    }

    public IToken evaluate(ICharacterScanner charScanner) {

	RuleBasedScanner scanner = (RuleBasedScanner) charScanner;
	StringBuffer buff = new StringBuffer();
	boolean stopReading = false;
	int reads = 0;

	/*char c = (char) ICharacterScanner.EOF;
	
	do {
	    c = (char) scanner.read();

	    System.out.print(c);
	} while (c != (char) ICharacterScanner.EOF);

	scanner.unread();*/
	
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
