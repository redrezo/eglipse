/*
* generated by Xtext
*/
package at.caks.eglipse.lang.program.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.caks.eglipse.lang.program.services.ProgramGrammarAccess;

public class ProgramParser extends AbstractContentAssistParser {
	
	@Inject
	private ProgramGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.caks.eglipse.lang.program.ui.contentassist.antlr.internal.InternalProgramParser createParser() {
		at.caks.eglipse.lang.program.ui.contentassist.antlr.internal.InternalProgramParser result = new at.caks.eglipse.lang.program.ui.contentassist.antlr.internal.InternalProgramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getShaderAccess().getGroup(), "rule__Shader__Group__0");
					put(grammarAccess.getProgramAccess().getShaderAssignment(), "rule__Program__ShaderAssignment");
					put(grammarAccess.getShaderAccess().getPathAssignment_1(), "rule__Shader__PathAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.caks.eglipse.lang.program.ui.contentassist.antlr.internal.InternalProgramParser typedParser = (at.caks.eglipse.lang.program.ui.contentassist.antlr.internal.InternalProgramParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ProgramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
