package leta.plugin.editors;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class LetaColorManager {

    public static final RGB MAIN_KEYWORD = new RGB(122, 0, 38);
    public static final RGB OPERATOR = new RGB(54, 54, 54);
    public static final RGB PARENTHESIS = new RGB(255, 242, 0);

    public static final RGB DEFAULT = new RGB(0, 0, 0);

    public static final RGB INT = new RGB(0, 33, 87);
    public static final RGB STRING = new RGB(0, 114, 188);

    public static final RGB COMMENT = new RGB(0, 0, 255);
    public static final RGB WORD = new RGB(128, 0, 128);
    public static final RGB SET_WORD = new RGB(128, 128, 128);
    public static final RGB BACKGROUND = new RGB(150, 150, 0);

    protected Map<RGB, Color> colorTable = new HashMap<RGB, Color>(10);

    public void dispose() {
	for (Color color : this.colorTable.values()) {
	    color.dispose();
	}
    }

    public Color getColor(RGB rgb) {
	Color color = colorTable.get(rgb);
	
	if (color == null) {
	    color = new Color(Display.getCurrent(), rgb);
	    
	    colorTable.put(rgb, color);
	}
	
	return color;
    }
    
}
