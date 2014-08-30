package org.leta.plugin.editor;

import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.text.AbstractInformationControl;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IInformationControlExtension2;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class HoverFactory {

    public static ITextHover getHover() {
	
	return new Hover();
	/*
	return new ITextHover() {

	    @Override
	    public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		Point selection = textViewer.getSelectedRange();
		
		if (selection.x <= offset && offset < selection.x + selection.y)
		    return new Region(selection.x, selection.y);
		
		return new Region(offset, 0);
	    }

	    @Override
	    public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		
		if (hoverRegion != null) {
		    return "<b>String inv‡lido, verifique se h‡ um termo</b>";
		}
		
		return "";
	    }

	};*/
	
    }
    
    public static IAnnotationHover getAnnotationHover() {
	return new DefaultAnnotationHover() {

	    @Override
	    public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
		return "Teste";
	    }
	    
	};
    }
    
    static class Hover implements ITextHover, ITextHoverExtension2 {

	AbstractInformationControl d = null;
	StyledText s = null;
	Object o = null;
	
	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		Point selection = textViewer.getSelectedRange();
		
		if (selection.x <= offset && offset < selection.x + selection.y)
		    return new Region(selection.x, selection.y);
		
		return new Region(offset, 0);
	}

	@Override
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		if (hoverRegion != null) {
		    
//		    DefaultInformationControl d = new DefaultInformationControl(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		    LetaConfiguration.getInstance().getLetaEditor().getEditorSite().getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
//			    HTMLTextPresenter h = new HTMLTextPresenter();
//			    d = new DefaultInformationControl(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), 0, null, "abc");
//			    d = new BrowserInformationControl(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), "Arial", "");
//			    d.setStatusText("abc");
//			    d.setInput("Hello!!!");
//			    d.setInformation("Hello!!");
//			    o = new DefaultInformationControl(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), h);
			    
//			    ((DefaultInformationControl) o).setSize(300, 200);
//			    ((DefaultInformationControl) o).setSizeConstraints(300, -1);
//			    ((DefaultInformationControl) o).setInformation("<html><body>Hello!!</body></html>");
//			    ((DefaultInformationControl) o).setStatusText("abc");
//			    ((DefaultInformationControl) o).setVisible(true);
//			    s = new StyledText(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), 0);
//			    d = new DefaultInformationControl2(null, true);
			    
//			    o = new DefaultInformationControl2.Text2(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), 0);
//			    ((DefaultInformationControl2.Text2) o).setText("abc");
//			    ((DefaultInformationControl) o).setInformation("<html><body>Hello!!</body></html>");
			    
			    o = new DefaultInformationControl3(LetaConfiguration.getInstance().getLetaEditor().getSite().getShell(), true).getParent();
//			    o = new DefaultInformationControl.IInformationPresenterExtension() {
//				private HTMLTextPresenter h = new HTMLTextPresenter();
//				
//			        @Override
//			        public String updatePresentation(Drawable drawable, String hoverInfo, TextPresentation presentation, int maxWidth, int maxHeight) {
//			            return h.updatePresentation(drawable, hoverInfo, presentation, maxWidth, maxHeight);
//			        }
//			    };
			}
		    });
		    
		    
//		    return d;
//		    return new DefaultInformationControl(null);
//		    return "<b>String inv‡lido, verifique se h‡ um termo</b> 2222";
//		    return new StyledText(null, 0);
		    
//		    return ((DefaultInformationControl) o).getInformationPresenterControlCreator();
		    
		    return o;
		}
		
		return "";
	}

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		if (hoverRegion != null) {
		    return "<b>String inv‡lido, verifique se h‡ um termo</b>";
		}
		
		return "";
	}

	static class DefaultInformationControl3 extends DefaultInformationControl {

	    private Object parent;
	    
	    public DefaultInformationControl3(Shell parent, boolean isResizeable) {
		super(parent, isResizeable);
	    }

	    public DefaultInformationControl3(Shell parent, IInformationPresenter presenter) {
		super(parent, presenter);
	    }

	    public DefaultInformationControl3(Shell parent, String statusFieldText, IInformationPresenter presenter) {
		super(parent, statusFieldText, presenter);
	    }

	    public DefaultInformationControl3(Shell parent, String statusFieldText) {
		super(parent, statusFieldText);
	    }

	    public DefaultInformationControl3(Shell parent, ToolBarManager toolBarManager, IInformationPresenter presenter) {
		super(parent, toolBarManager, presenter);
	    }

	    public DefaultInformationControl3(Shell parent, ToolBarManager toolBarManager) {
		super(parent, toolBarManager);
	    }

	    public DefaultInformationControl3(Shell parent) {
		super(parent);
	    }

	    @Override
	    protected void createContent(Composite parent) {
		super.createContent(parent);

		Control[] c = parent.getChildren();

		this.parent = parent.getChildren()[0];
		
	    }

	    public Object getParent() {
	        return parent;
	    }

	    @Override
	    public IInformationControlCreator getInformationPresenterControlCreator() {
		return new IInformationControlCreator() {
	            public IInformationControl createInformationControl(Shell parent) {
	                return new DefaultInformationControl3(parent, true);
	            }
	        };
	    }
	    
	}

	static class DefaultInformationControl2 extends AbstractInformationControl implements IInformationControlExtension2 {
	    
	    public Text2 st;
	    
	    static class Text2 extends StyledText {

		public Text2(Composite parent, int style) {
		    super(parent, style);
		}
		
	    }

	    public DefaultInformationControl2(Shell parentShell, boolean isResizable) {
		super(parentShell, isResizable);
		this.create();
	    }

	    public DefaultInformationControl2(Shell parentShell, String statusFieldText) {
		super(parentShell, statusFieldText);
		this.create();
	    }

	    public DefaultInformationControl2(Shell parentShell, ToolBarManager toolBarManager) {
		super(parentShell, toolBarManager);
		this.create();
	    }

	    @Override
	    public boolean hasContents() {
		return this.st.getText().length() > 0;
	    }

	    @Override
	    protected void createContent(Composite parent) {
		st = new Text2(parent, 0);
		st.setText("abc");
	    }

	    @Override
	    public void setInformation(String information) {
		this.st.setText(information);
	    }

	    @Override
	    public IInformationControlCreator getInformationPresenterControlCreator() {
		return new IInformationControlCreator() {
	            public IInformationControl createInformationControl(Shell parent) {
	                return new DefaultInformationControl2(parent, true);
	            }
	        };
	    }

	    @Override
	    public void setInput(Object input) {
		if (input instanceof String)
		    this.setInformation((String) input);
	    }

	}
	
    }
}

