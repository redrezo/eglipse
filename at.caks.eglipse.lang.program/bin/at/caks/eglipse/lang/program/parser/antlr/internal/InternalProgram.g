/*
* generated by Xtext
*/
grammar InternalProgram;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.caks.eglipse.lang.program.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.caks.eglipse.lang.program.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.caks.eglipse.lang.program.services.ProgramGrammarAccess;

}

@parser::members {

 	private ProgramGrammarAccess grammarAccess;
 	
    public InternalProgramParser(TokenStream input, ProgramGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Program";	
   	}
   	
   	@Override
   	protected ProgramGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	 iv_ruleProgram=ruleProgram 
	 { $current=$iv_ruleProgram.current; } 
	 EOF 
;

// Rule Program
ruleProgram returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getProgramAccess().getShaderShaderParserRuleCall_0()); 
	    }
		lv_shader_0_0=ruleShader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProgramRule());
	        }
       		add(
       			$current, 
       			"shader",
        		lv_shader_0_0, 
        		"Shader");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleShader
entryRuleShader returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getShaderRule()); }
	 iv_ruleShader=ruleShader 
	 { $current=$iv_ruleShader.current; } 
	 EOF 
;

// Rule Shader
ruleShader returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='shader' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getShaderAccess().getShaderKeyword_0());
    }
(
(
		lv_path_1_0=RULE_PATH
		{
			newLeafNode(lv_path_1_0, grammarAccess.getShaderAccess().getPathPATHTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getShaderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"path",
        		lv_path_1_0, 
        		"PATH");
	    }

)
))
;





RULE_PATH : RULE_STRING;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

