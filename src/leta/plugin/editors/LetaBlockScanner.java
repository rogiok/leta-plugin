package leta.plugin.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;


public class LetaBlockScanner extends RuleBasedScanner {

    public LetaBlockScanner(LetaColorManager manager) {

	List<IRule> rules = new ArrayList<IRule>();

	// Main Keywords
	IToken mainKeyword = new Token(new TextAttribute(manager.getColor(LetaColorManager.MAIN_KEYWORD)));

	List<String> mainKeywords = new ArrayList<String>();
	
	mainKeywords.add("Suite");
	mainKeywords.add("Test");
	mainKeywords.add("When");
	mainKeywords.add("Verify");
	mainKeywords.add("And");
	mainKeywords.add("Or");

	// Operators
	IToken operator = new Token(new TextAttribute(manager.getColor(LetaColorManager.OPERATOR)));
	
	List<String> operators = new ArrayList<String>();
	
	operators.add("=");
	operators.add("!=");
	operators.add("<");
	operators.add(">");
	operators.add("<=");
	operators.add(">=");
	
	// Parenthesis
	IToken parenthesis = new Token(new TextAttribute(manager.getColor(LetaColorManager.PARENTHESIS)));
	
	List<String> parentheses = new ArrayList<String>();
	
	parentheses.add("[");
	parentheses.add("]");
	
	// String
	IToken string = new Token(new TextAttribute(manager.getColor(LetaColorManager.STRING)));
	

	// Rules
	rules.add(new WhitespaceRule(new LetaWhitespaceDetector()));
	rules.add(new LetaKeywordRule(mainKeyword, mainKeywords));
//	rules.add(new LetaCharactersRule(parenthesis, parentheses));
	rules.add(new SingleLineRule("\"", "\"", string, '\\'));
	rules.add(new SingleLineRule("[", "]", string));
	rules.add(new LetaCharacterRule(operator, operators));
	
	IRule[] newRules = new IRule[rules.size()];
	
	setRules(rules.toArray(newRules));
	
	this.setDefaultReturnToken(new Token(new TextAttribute(manager.getColor(LetaColorManager.DEFAULT))));

    }

//	IToken setWord = new Token(new TextAttribute(manager.getColor(ColorManager.SET_WORD)));
//	IToken comment = new Token(new TextAttribute(manager.getColor(ColorManager.COMMENT)));

//	rules.add(new EndOfLineRule("//", comment));
	
//	rules.add(new SingleLineRule("context", "\n", contextWord, (char) 0, true));
//	rules.add(new SingleLineRule("context", "\r", contextWord, (char) 0, true));
//	rules.add(new SingleLineRule("context", "\r\n", contextWord, (char) 0, true));
//	rules.add(new SingleLineRule("context", "\n\r", contextWord, (char) 0, true));
//	rules[1] = new EndOfLineRule("set", setWord);
//	rules[2] = new EndOfLineRule("//", comment);
//	rules[1] = new WhitespaceRule(new WhitespaceDetector());

//	rules[0] = new MultiLineRule("context", " ", contextWord, (char) 0, true);
//	rules[1] = new MultiLineRule("context", "\n", contextWord, (char) 0, true);
//	rules[2] = new MultiLineRule("context", "\r", contextWord, (char) 0, true);
//	rules[3] = new MultiLineRule("context", "\r\n", contextWord, (char) 0, true);
//	rules[4] = new MultiLineRule("context", "\n\r", contextWord, (char) 0, true);

}
