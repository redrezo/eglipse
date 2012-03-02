/*
* generated by Xtext
*/
package at.caks.eglipse.lang.glsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.caks.eglipse.lang.glsl.services.GlslGrammarAccess;

public class GlslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private GlslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_NL", "RULE_PRECOMPILER_STATEMENT");
	}
	
	@Override
	protected at.caks.eglipse.lang.glsl.parser.antlr.internal.InternalGlslParser createParser(XtextTokenStream stream) {
		return new at.caks.eglipse.lang.glsl.parser.antlr.internal.InternalGlslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SourceFile";
	}
	
	public GlslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GlslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
