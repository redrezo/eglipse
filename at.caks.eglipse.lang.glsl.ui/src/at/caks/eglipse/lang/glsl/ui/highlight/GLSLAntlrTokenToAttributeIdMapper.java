package at.caks.eglipse.lang.glsl.ui.highlight;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class GLSLAntlrTokenToAttributeIdMapper extends
		AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		
		switch (tokenName) {
		
		case "RULE_PRECOMPILER_STATEMENT":
			return GLSLHighlightingConfiguration.PRECOMPILER_STATEMENT;
		
		case "RULE_SL_COMMENT":
		case "RULE_ML_COMMENT":
			return GLSLHighlightingConfiguration.COMMENT_ID;
		
		case "RULE_VOID": 
		case "RULE_BOOL":
		case "RULE_FLOAT":
		case "RULE_INTX":
		case "RULE_VEC2":
		case "RULE_VEC3":
		case "RULE_VEC4":
		case "RULE_MAT2":
		case "RULE_MAT3":
		case "RULE_MAT4":
		case "RULE_BVEC2":
		case "RULE_IVEC3":
		case "RULE_IVEC2":
		case "RULE_BVEC4":
		case "RULE_BVEC3":
		case "RULE_UVEC4":
		case "RULE_UVEC3":
		case "RULE_UVEC2":
		case "RULE_IVEC4":
		case "RULE_UINT":
		case "RULE_MAT2X2":
		case "RULE_MAT3X4":
		case "RULE_MAT4X2":
		case "RULE_MAT4X3":
		case "RULE_MAT4X4":
		case "RULE_MAT2X3":
		case "RULE_MAT2X4":
		case "RULE_MAT3X2":
		case "RULE_MAT3X3":
			return GLSLHighlightingConfiguration.TYPE_TYPE;
		
		case "RULE_IN":
		case "RULE_OUT":
		case "RULE_INOUT":
		case "RULE_UNIFORM":
		case "RULE_NOPERSPECTIVE":
		case "RULE_SMOOTH":
		case "RULE_FLAT":
		case "RULE_PRECISION":
		case "RULE_LOW_PRECISION":
		case "RULE_MEDIUM_PRECISION":
		case "RULE_HIGH_PRECISION":
			return GLSLHighlightingConfiguration.TYPE_QUALIFIER;
			
		case "RULE_INTCONSTANT":
		case "RULE_FLOATCONSTANT":
		case "RULE_BOOLCONSTANT":
		case "RULE_UINTCONSTANT":
			return GLSLHighlightingConfiguration.NUM_CONSTANT;
			
		case "RULE_IF":
		case "RULE_WHILE":
		case "RULE_ELSE":
		case "RULE_BREAK":
		case "RULE_CONTINUE":
		case "RULE_SWITCH":
		case "RULE_CASE":
		case "RULE_RETURN":
		case "RULE_CONST":
		case "RULE_DO":
		case "RULE_FOR":
		case "RULE_DISCARD":
		case "RULE_DEFAULT":
		case "RULE_STRUCT":
			
			return GLSLHighlightingConfiguration.KEYWORD_ID;
			
		default: 
			System.err.println(tokenName + ", " + tokenType);
			return GLSLHighlightingConfiguration.DEFAULT_ID; 
		}
	}

}
