package leta.plugin.editors;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Vector;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.TextOperationAction;


public class LetaEditor extends TextEditor {

    private LetaColorManager colorManager;
    private ResourceBundle resourceBundle;

    public LetaEditor() {
	super();

	colorManager = new LetaColorManager();

	setSourceViewerConfiguration(new LetaSourceViewerConfiguration(colorManager));
	setDocumentProvider(new LetaDocumentProvider());
    }

    public void dispose() {
	colorManager.dispose();
	super.dispose();
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void createActions() {
	super.createActions();

	resourceBundle = new ResourceBundle() {

	    @Override
	    public Enumeration getKeys() {
		return new Vector<Object>().elements();
	    }

	    @Override
	    protected Object handleGetObject(final String key) {
		return null;
	    }
	};

	IAction a = new TextOperationAction(resourceBundle, "ContentAssistProposal.", this, ISourceViewer.CONTENTASSIST_PROPOSALS);
	a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
	setAction("ContentAssistProposal", a);

	a = new TextOperationAction(resourceBundle, "ContentAssistTip.", this, ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION);
	a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_CONTEXT_INFORMATION);
	setAction("ContentAssistTip", a);

    }
/*
    @Override
    public void doSave(IProgressMonitor progressMonitor) {
	super.doSave(progressMonitor);

	MessageConsole myConsole = findConsole("Leta Editor Console");
	
	MessageConsoleStream out = myConsole.newMessageStream();
	
//	out.println("Hello from Generic console sample action");
//	out.println(this.getSourceViewer().getDocument().get());
	
	
	try {
	    ByteArrayInputStream letaStream = new ByteArrayInputStream(this.getSourceViewer().getDocument().get().getBytes());

	    ANTLRInputStream source = new ANTLRInputStream(atddStream);
	    AtddLanguageLexer lexer = new AtddLanguageLexer(source);
	    CommonTokenStream tokens = new CommonTokenStream(lexer);

	    AtddLanguageParser parser = new AtddLanguageParser(tokens);
	    CommonTree ast = (CommonTree) parser.atdd().getTree();

//	    out.println(ast.toStringTree());
	    
	    if (ast instanceof CommonErrorNode) {
		out.println("Problemas encontrados:");
		out.println(ast.toStringTree());
		
		return;
	    }

	    CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);

	    AtddTemplate tparser = new AtddTemplate(nodes);
	    nodes.setTokenStream(tokens);

	    InputStream fileTemplate = null;

	    if (ClassLoader.getSystemResource("atdd/transformer/AtddTemplate.stg") != null) {
		fileTemplate = ClassLoader.getSystemResourceAsStream("atdd/transformer/AtddTemplate.stg");
	    } else {
		fileTemplate = this.getClass().getClassLoader().getResourceAsStream("atdd/transformer/AtddTemplate.stg");
	    }

	    Reader templatesIn = new InputStreamReader(fileTemplate);
	    StringTemplateGroup templates = new StringTemplateGroup(templatesIn);

	    tparser.setTemplateLib(templates);

	    AtddTemplate.atdd_return r = tparser.atdd();
	    StringTemplate t = (StringTemplate) r.getTemplate();

	    out.println(t.toString());

	} catch (IOException e) {
	    e.printStackTrace();
	} catch (RecognitionException e) {
	    e.printStackTrace();
	}
	
    }

    private MessageConsole findConsole(String name) {
	ConsolePlugin plugin = ConsolePlugin.getDefault();
	IConsoleManager conMan = plugin.getConsoleManager();
	IConsole[] existing = conMan.getConsoles();

	for (int i = 0; i < existing.length; i++)
	    if (name.equals(existing[i].getName()))
		return (MessageConsole) existing[i];

	// no console found, so create a new one
	MessageConsole myConsole = new MessageConsole(name, null);
	conMan.addConsoles(new IConsole[] { myConsole });

	return myConsole;
    }
*/
}
