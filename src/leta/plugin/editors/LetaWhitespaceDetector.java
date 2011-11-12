package leta.plugin.editors;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class LetaWhitespaceDetector implements IWhitespaceDetector {

    public boolean isWhitespace(char c) {
	return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
    }
}
