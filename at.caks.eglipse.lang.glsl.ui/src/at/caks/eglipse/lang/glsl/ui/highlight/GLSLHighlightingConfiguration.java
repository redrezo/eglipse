package at.caks.eglipse.lang.glsl.ui.highlight;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class GLSLHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public static final String TYPE_TYPE = "type";
	public static final String TYPE_QUALIFIER = "type_qualifier";
	public static final String NUM_CONSTANT = "num_constant";
	public static final String PRECOMPILER_STATEMENT = "precompiler_statement";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(TYPE_TYPE, "Type",
				keywordTextStyle());
		acceptor.acceptDefaultHighlighting(TYPE_QUALIFIER, "Type Qualifier",
				typeQualiferTextStyle());
		acceptor.acceptDefaultHighlighting(NUM_CONSTANT, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(PRECOMPILER_STATEMENT, "Precompiler Statement", precompilerStatementTextStyle());
		super.configure(acceptor);
	}

	private TextStyle precompilerStatementTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 95));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle keywordTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(127, 0, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle typeQualiferTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 127, 85));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle numberTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(100, 127, 85));
		return textStyle;
	}

}