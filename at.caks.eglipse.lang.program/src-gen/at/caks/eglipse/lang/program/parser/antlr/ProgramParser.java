/*
* generated by Xtext
*/
package at.caks.eglipse.lang.program.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import at.caks.eglipse.lang.program.services.ProgramGrammarAccess;

public class ProgramParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ProgramGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected at.caks.eglipse.lang.program.parser.antlr.internal.InternalProgramParser createParser(XtextTokenStream stream) {
		return new at.caks.eglipse.lang.program.parser.antlr.internal.InternalProgramParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}
	
	public ProgramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}