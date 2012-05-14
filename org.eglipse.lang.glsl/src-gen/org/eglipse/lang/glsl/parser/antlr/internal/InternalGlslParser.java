package org.eglipse.lang.glsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eglipse.lang.glsl.services.GlslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGlslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEMICOLON", "RULE_INTCONSTANT", "RULE_IDENTIFIER", "RULE_UNIFORM", "RULE_IN", "RULE_OUT", "RULE_INOUT", "RULE_VOID", "RULE_INTX", "RULE_UINT", "RULE_BOOL", "RULE_FLOAT", "RULE_VEC2", "RULE_VEC3", "RULE_VEC4", "RULE_IVEC2", "RULE_IVEC3", "RULE_IVEC4", "RULE_UVEC2", "RULE_UVEC3", "RULE_UVEC4", "RULE_BVEC2", "RULE_BVEC3", "RULE_BVEC4", "RULE_MAT2", "RULE_MAT3", "RULE_MAT4", "RULE_MAT2X2", "RULE_MAT2X3", "RULE_MAT2X4", "RULE_MAT3X2", "RULE_MAT3X3", "RULE_MAT3X4", "RULE_MAT4X2", "RULE_MAT4X3", "RULE_MAT4X4", "RULE_LEFT_BRACE", "RULE_RIGHT_BRACE", "RULE_IF", "RULE_ELSE", "RULE_WHILE", "RULE_DO", "RULE_FOR", "RULE_SWITCH", "RULE_CASE", "RULE_UINTCONSTANT", "RULE_FLOATCONSTANT", "RULE_COLON", "RULE_DEFAULT", "RULE_CONTINUE", "RULE_BREAK", "RULE_RETURN", "RULE_DISCARD", "RULE_QUESTION", "RULE_PLUS", "RULE_DASH", "RULE_STAR", "RULE_SLASH", "RULE_PERCENT", "RULE_BOOLCONSTANT", "RULE_ATTRIBUTE", "RULE_CONST", "RULE_CENTROID", "RULE_VARYING", "RULE_NOPERSPECTIVE", "RULE_FLAT", "RULE_SMOOTH", "RULE_LAYOUT", "RULE_STRUCT", "RULE_TYPE_NAME", "RULE_FIELD_SELECTION", "RULE_LEFT_OP", "RULE_RIGHT_OP", "RULE_INC_OP", "RULE_DEC_OP", "RULE_AND_OP", "RULE_OR_OP", "RULE_XOR_OP", "RULE_MUL_ASSIGN", "RULE_DIV_ASSIGN", "RULE_ADD_ASSIGN", "RULE_MOD_ASSIGN", "RULE_LEFT_ASSIGN", "RULE_RIGHT_ASSIGN", "RULE_AND_ASSIGN", "RULE_XOR_ASSIGN", "RULE_OR_ASSIGN", "RULE_SUB_ASSIGN", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_BANG", "RULE_TILDE", "RULE_VERTICAL_BAR", "RULE_CARET", "RULE_AMPERSAND", "RULE_INVARIANT", "RULE_HIGH_PRECISION", "RULE_MEDIUM_PRECISION", "RULE_LOW_PRECISION", "RULE_PRECISION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_PRECOMPILER_STATEMENT", "RULE_NL", "RULE_WS", "RULE_ANY_OTHER", "'#version'", "'('", "','", "')'", "'='", "'.'", "'x'", "'y'", "'z'", "'w'", "'!='", "'=='", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int RULE_TILDE=95;
    public static final int RULE_LAYOUT=71;
    public static final int RULE_MAT3X4=36;
    public static final int RULE_MAT3X2=34;
    public static final int RULE_MAT3X3=35;
    public static final int RULE_RIGHT_ASSIGN=87;
    public static final int RULE_ANY_OTHER=109;
    public static final int RULE_STRUCT=72;
    public static final int RULE_INTX=12;
    public static final int RULE_PERCENT=62;
    public static final int RULE_OR_OP=80;
    public static final int RULE_CONST=65;
    public static final int EOF=-1;
    public static final int RULE_INC_OP=77;
    public static final int RULE_VARYING=67;
    public static final int RULE_SUB_ASSIGN=91;
    public static final int RULE_AMPERSAND=98;
    public static final int RULE_FLOATCONSTANT=50;
    public static final int RULE_MEDIUM_PRECISION=101;
    public static final int RULE_LEFT_BRACE=40;
    public static final int RULE_CENTROID=66;
    public static final int RULE_BANG=94;
    public static final int RULE_DEC_OP=78;
    public static final int RULE_CONTINUE=53;
    public static final int RULE_MUL_ASSIGN=82;
    public static final int RULE_NOPERSPECTIVE=68;
    public static final int RULE_UVEC3=23;
    public static final int RULE_UVEC2=22;
    public static final int RULE_PRECISION=103;
    public static final int RULE_LOW_PRECISION=102;
    public static final int RULE_UVEC4=24;
    public static final int RULE_UINT=13;
    public static final int RULE_XOR_OP=81;
    public static final int RULE_ADD_ASSIGN=84;
    public static final int RULE_ML_COMMENT=104;
    public static final int T__125=125;
    public static final int RULE_LEFT_ASSIGN=86;
    public static final int RULE_DIV_ASSIGN=83;
    public static final int RULE_MOD_ASSIGN=85;
    public static final int RULE_VOID=11;
    public static final int RULE_LEFT_BRACKET=92;
    public static final int RULE_IN=8;
    public static final int RULE_SLASH=61;
    public static final int RULE_UINTCONSTANT=49;
    public static final int RULE_IF=42;
    public static final int RULE_QUESTION=57;
    public static final int RULE_MAT4X4=39;
    public static final int RULE_MAT4X3=38;
    public static final int RULE_INOUT=10;
    public static final int RULE_MAT4X2=37;
    public static final int RULE_SWITCH=47;
    public static final int RULE_DISCARD=56;
    public static final int RULE_DO=45;
    public static final int RULE_XOR_ASSIGN=89;
    public static final int T__118=118;
    public static final int RULE_SEMICOLON=4;
    public static final int T__119=119;
    public static final int RULE_AND_OP=79;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int RULE_RETURN=55;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int RULE_FOR=46;
    public static final int T__124=124;
    public static final int RULE_BOOL=14;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int RULE_UNIFORM=7;
    public static final int RULE_WHILE=44;
    public static final int RULE_MAT2X2=31;
    public static final int RULE_BVEC2=25;
    public static final int RULE_BVEC4=27;
    public static final int RULE_BVEC3=26;
    public static final int RULE_VERTICAL_BAR=96;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int RULE_FIELD_SELECTION=74;
    public static final int RULE_MAT2X4=33;
    public static final int RULE_MAT2X3=32;
    public static final int RULE_AND_ASSIGN=88;
    public static final int RULE_MAT2=28;
    public static final int RULE_MAT4=30;
    public static final int RULE_MAT3=29;
    public static final int RULE_INVARIANT=99;
    public static final int RULE_OR_ASSIGN=90;
    public static final int RULE_CARET=97;
    public static final int RULE_ATTRIBUTE=64;
    public static final int RULE_RIGHT_OP=76;
    public static final int RULE_PLUS=58;
    public static final int RULE_CASE=48;
    public static final int RULE_PRECOMPILER_STATEMENT=106;
    public static final int RULE_NL=107;
    public static final int RULE_HIGH_PRECISION=100;
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_SMOOTH=70;
    public static final int RULE_FLOAT=15;
    public static final int RULE_SL_COMMENT=105;
    public static final int RULE_DEFAULT=52;
    public static final int RULE_OUT=9;
    public static final int RULE_INTCONSTANT=5;
    public static final int RULE_COLON=51;
    public static final int RULE_FLAT=69;
    public static final int RULE_STAR=60;
    public static final int RULE_VEC2=16;
    public static final int RULE_VEC3=17;
    public static final int RULE_VEC4=18;
    public static final int RULE_RIGHT_BRACKET=93;
    public static final int RULE_IVEC4=21;
    public static final int RULE_IVEC3=20;
    public static final int RULE_BOOLCONSTANT=63;
    public static final int RULE_IVEC2=19;
    public static final int RULE_RIGHT_BRACE=41;
    public static final int RULE_WS=108;
    public static final int RULE_TYPE_NAME=73;
    public static final int RULE_ELSE=43;
    public static final int RULE_BREAK=54;
    public static final int RULE_LEFT_OP=75;
    public static final int RULE_DASH=59;

    // delegates
    // delegators


        public InternalGlslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGlslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGlslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g"; }



     	private GlslGrammarAccess grammarAccess;
     	
        public InternalGlslParser(TokenStream input, GlslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SourceFile";	
       	}
       	
       	@Override
       	protected GlslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSourceFile"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:68:1: entryRuleSourceFile returns [EObject current=null] : iv_ruleSourceFile= ruleSourceFile EOF ;
    public final EObject entryRuleSourceFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceFile = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:69:2: (iv_ruleSourceFile= ruleSourceFile EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:70:2: iv_ruleSourceFile= ruleSourceFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSourceFileRule()); 
            }
            pushFollow(FOLLOW_ruleSourceFile_in_entryRuleSourceFile75);
            iv_ruleSourceFile=ruleSourceFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSourceFile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSourceFile85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSourceFile"


    // $ANTLR start "ruleSourceFile"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:77:1: ruleSourceFile returns [EObject current=null] : ( ( (lv_pre_0_0= rulePrecompilerStatement ) )* ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )* ) ;
    public final EObject ruleSourceFile() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_4=null;
        Token this_SEMICOLON_6=null;
        Token this_SEMICOLON_9=null;
        EObject lv_pre_0_0 = null;

        EObject lv_uniforms_1_0 = null;

        EObject lv_attribs_3_0 = null;

        EObject lv_prototypes_5_0 = null;

        EObject lv_functions_7_0 = null;

        EObject lv_variables_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:80:28: ( ( ( (lv_pre_0_0= rulePrecompilerStatement ) )* ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )* ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:81:1: ( ( (lv_pre_0_0= rulePrecompilerStatement ) )* ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )* )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:81:1: ( ( (lv_pre_0_0= rulePrecompilerStatement ) )* ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )* )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:81:2: ( (lv_pre_0_0= rulePrecompilerStatement ) )* ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )*
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:81:2: ( (lv_pre_0_0= rulePrecompilerStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==110) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:82:1: (lv_pre_0_0= rulePrecompilerStatement )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:82:1: (lv_pre_0_0= rulePrecompilerStatement )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:83:3: lv_pre_0_0= rulePrecompilerStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getPrePrecompilerStatementParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrecompilerStatement_in_ruleSourceFile131);
            	    lv_pre_0_0=rulePrecompilerStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pre",
            	              		lv_pre_0_0, 
            	              		"PrecompilerStatement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:99:3: ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )*
            loop2:
            do {
                int alt2=6;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:99:4: ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:99:4: ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:99:5: ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:99:5: ( (lv_uniforms_1_0= ruleUniformDeclaration ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:100:1: (lv_uniforms_1_0= ruleUniformDeclaration )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:100:1: (lv_uniforms_1_0= ruleUniformDeclaration )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:101:3: lv_uniforms_1_0= ruleUniformDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getUniformsUniformDeclarationParserRuleCall_1_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUniformDeclaration_in_ruleSourceFile155);
            	    lv_uniforms_1_0=ruleUniformDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"uniforms",
            	              		lv_uniforms_1_0, 
            	              		"UniformDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSourceFile166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_2, grammarAccess.getSourceFileAccess().getSEMICOLONTerminalRuleCall_1_0_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:122:6: ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:122:6: ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:122:7: ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:122:7: ( (lv_attribs_3_0= ruleAttributeDeclaration ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:123:1: (lv_attribs_3_0= ruleAttributeDeclaration )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:123:1: (lv_attribs_3_0= ruleAttributeDeclaration )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:124:3: lv_attribs_3_0= ruleAttributeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getAttribsAttributeDeclarationParserRuleCall_1_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleSourceFile194);
            	    lv_attribs_3_0=ruleAttributeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attribs",
            	              		lv_attribs_3_0, 
            	              		"AttributeDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSourceFile205); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_4, grammarAccess.getSourceFileAccess().getSEMICOLONTerminalRuleCall_1_1_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:145:6: ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:145:6: ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:145:7: ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:145:7: ( (lv_prototypes_5_0= ruleFunctionPrototype ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:146:1: (lv_prototypes_5_0= ruleFunctionPrototype )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:146:1: (lv_prototypes_5_0= ruleFunctionPrototype )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:147:3: lv_prototypes_5_0= ruleFunctionPrototype
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getPrototypesFunctionPrototypeParserRuleCall_1_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionPrototype_in_ruleSourceFile233);
            	    lv_prototypes_5_0=ruleFunctionPrototype();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"prototypes",
            	              		lv_prototypes_5_0, 
            	              		"FunctionPrototype");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSourceFile244); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_6, grammarAccess.getSourceFileAccess().getSEMICOLONTerminalRuleCall_1_2_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:168:6: ( (lv_functions_7_0= ruleFunctionDefinition ) )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:168:6: ( (lv_functions_7_0= ruleFunctionDefinition ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:169:1: (lv_functions_7_0= ruleFunctionDefinition )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:169:1: (lv_functions_7_0= ruleFunctionDefinition )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:170:3: lv_functions_7_0= ruleFunctionDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getFunctionsFunctionDefinitionParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleSourceFile271);
            	    lv_functions_7_0=ruleFunctionDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functions",
            	              		lv_functions_7_0, 
            	              		"FunctionDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:187:6: ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:187:6: ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:187:7: ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:187:7: ( (lv_variables_8_0= ruleVariableDeclaration ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:188:1: (lv_variables_8_0= ruleVariableDeclaration )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:188:1: (lv_variables_8_0= ruleVariableDeclaration )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:189:3: lv_variables_8_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSourceFileAccess().getVariablesVariableDeclarationParserRuleCall_1_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleSourceFile299);
            	    lv_variables_8_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSourceFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_8_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleSourceFile310); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SEMICOLON_9, grammarAccess.getSourceFileAccess().getSEMICOLONTerminalRuleCall_1_4_1()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSourceFile"


    // $ANTLR start "entryRulePrecompilerStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:217:1: entryRulePrecompilerStatement returns [EObject current=null] : iv_rulePrecompilerStatement= rulePrecompilerStatement EOF ;
    public final EObject entryRulePrecompilerStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecompilerStatement = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:218:2: (iv_rulePrecompilerStatement= rulePrecompilerStatement EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:219:2: iv_rulePrecompilerStatement= rulePrecompilerStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrecompilerStatementRule()); 
            }
            pushFollow(FOLLOW_rulePrecompilerStatement_in_entryRulePrecompilerStatement348);
            iv_rulePrecompilerStatement=rulePrecompilerStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrecompilerStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecompilerStatement358); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecompilerStatement"


    // $ANTLR start "rulePrecompilerStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:226:1: rulePrecompilerStatement returns [EObject current=null] : this_PrecompilerVersion_0= rulePrecompilerVersion ;
    public final EObject rulePrecompilerStatement() throws RecognitionException {
        EObject current = null;

        EObject this_PrecompilerVersion_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:229:28: (this_PrecompilerVersion_0= rulePrecompilerVersion )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:231:5: this_PrecompilerVersion_0= rulePrecompilerVersion
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPrecompilerStatementAccess().getPrecompilerVersionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePrecompilerVersion_in_rulePrecompilerStatement404);
            this_PrecompilerVersion_0=rulePrecompilerVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrecompilerVersion_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecompilerStatement"


    // $ANTLR start "entryRulePrecompilerVersion"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:247:1: entryRulePrecompilerVersion returns [EObject current=null] : iv_rulePrecompilerVersion= rulePrecompilerVersion EOF ;
    public final EObject entryRulePrecompilerVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecompilerVersion = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:248:2: (iv_rulePrecompilerVersion= rulePrecompilerVersion EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:249:2: iv_rulePrecompilerVersion= rulePrecompilerVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrecompilerVersionRule()); 
            }
            pushFollow(FOLLOW_rulePrecompilerVersion_in_entryRulePrecompilerVersion438);
            iv_rulePrecompilerVersion=rulePrecompilerVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrecompilerVersion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecompilerVersion448); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecompilerVersion"


    // $ANTLR start "rulePrecompilerVersion"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:256:1: rulePrecompilerVersion returns [EObject current=null] : (otherlv_0= '#version' ( (lv_version_1_0= RULE_INTCONSTANT ) ) ( (lv_profile_2_0= RULE_IDENTIFIER ) )? ) ;
    public final EObject rulePrecompilerVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;
        Token lv_profile_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:259:28: ( (otherlv_0= '#version' ( (lv_version_1_0= RULE_INTCONSTANT ) ) ( (lv_profile_2_0= RULE_IDENTIFIER ) )? ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:260:1: (otherlv_0= '#version' ( (lv_version_1_0= RULE_INTCONSTANT ) ) ( (lv_profile_2_0= RULE_IDENTIFIER ) )? )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:260:1: (otherlv_0= '#version' ( (lv_version_1_0= RULE_INTCONSTANT ) ) ( (lv_profile_2_0= RULE_IDENTIFIER ) )? )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:260:3: otherlv_0= '#version' ( (lv_version_1_0= RULE_INTCONSTANT ) ) ( (lv_profile_2_0= RULE_IDENTIFIER ) )?
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_rulePrecompilerVersion485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPrecompilerVersionAccess().getVersionKeyword_0());
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:264:1: ( (lv_version_1_0= RULE_INTCONSTANT ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:265:1: (lv_version_1_0= RULE_INTCONSTANT )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:265:1: (lv_version_1_0= RULE_INTCONSTANT )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:266:3: lv_version_1_0= RULE_INTCONSTANT
            {
            lv_version_1_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_rulePrecompilerVersion502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_1_0, grammarAccess.getPrecompilerVersionAccess().getVersionINTCONSTANTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPrecompilerVersionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_1_0, 
                      		"INTCONSTANT");
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:282:2: ( (lv_profile_2_0= RULE_IDENTIFIER ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_IDENTIFIER) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:283:1: (lv_profile_2_0= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:283:1: (lv_profile_2_0= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:284:3: lv_profile_2_0= RULE_IDENTIFIER
                    {
                    lv_profile_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulePrecompilerVersion524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_profile_2_0, grammarAccess.getPrecompilerVersionAccess().getProfileIDENTIFIERTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrecompilerVersionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"profile",
                              		lv_profile_2_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecompilerVersion"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:308:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:309:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:310:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration566);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration576); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:317:1: ruleDeclaration returns [EObject current=null] : ( (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON ) | (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON ) | (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_FunctionDefinition_7= ruleFunctionDefinition ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        Token this_SEMICOLON_3=null;
        Token this_SEMICOLON_5=null;
        EObject this_UniformDeclaration_0 = null;

        EObject this_AttributeDeclaration_2 = null;

        EObject this_FunctionPrototype_4 = null;

        EObject this_VariableDeclaration_6 = null;

        EObject this_FunctionDefinition_7 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:320:28: ( ( (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON ) | (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON ) | (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_FunctionDefinition_7= ruleFunctionDefinition ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:321:1: ( (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON ) | (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON ) | (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_FunctionDefinition_7= ruleFunctionDefinition )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:321:1: ( (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON ) | (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON ) | (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_FunctionDefinition_7= ruleFunctionDefinition )
            int alt4=5;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:321:2: (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:321:2: (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:322:5: this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getUniformDeclarationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUniformDeclaration_in_ruleDeclaration624);
                    this_UniformDeclaration_0=ruleUniformDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UniformDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleDeclaration634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getDeclarationAccess().getSEMICOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:335:6: (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:335:6: (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:336:5: this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getAttributeDeclarationParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleDeclaration663);
                    this_AttributeDeclaration_2=ruleAttributeDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleDeclaration673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_3, grammarAccess.getDeclarationAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:349:6: (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:349:6: (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:350:5: this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionPrototypeParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionPrototype_in_ruleDeclaration702);
                    this_FunctionPrototype_4=ruleFunctionPrototype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionPrototype_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleDeclaration712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_5, grammarAccess.getDeclarationAccess().getSEMICOLONTerminalRuleCall_2_1()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:364:5: this_VariableDeclaration_6= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleDeclaration740);
                    this_VariableDeclaration_6=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:374:5: this_FunctionDefinition_7= ruleFunctionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getFunctionDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleDeclaration767);
                    this_FunctionDefinition_7=ruleFunctionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDefinition_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleUniformDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:394:1: entryRuleUniformDeclaration returns [EObject current=null] : iv_ruleUniformDeclaration= ruleUniformDeclaration EOF ;
    public final EObject entryRuleUniformDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniformDeclaration = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:395:2: (iv_ruleUniformDeclaration= ruleUniformDeclaration EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:396:2: iv_ruleUniformDeclaration= ruleUniformDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUniformDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleUniformDeclaration_in_entryRuleUniformDeclaration806);
            iv_ruleUniformDeclaration=ruleUniformDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUniformDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUniformDeclaration816); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUniformDeclaration"


    // $ANTLR start "ruleUniformDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:403:1: ruleUniformDeclaration returns [EObject current=null] : ( () ( (lv_qualifier_1_0= RULE_UNIFORM ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject ruleUniformDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_qualifier_1_0=null;
        Token lv_name_3_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:406:28: ( ( () ( (lv_qualifier_1_0= RULE_UNIFORM ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:407:1: ( () ( (lv_qualifier_1_0= RULE_UNIFORM ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:407:1: ( () ( (lv_qualifier_1_0= RULE_UNIFORM ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:407:2: () ( (lv_qualifier_1_0= RULE_UNIFORM ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:407:2: ()
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:408:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUniformDeclarationAccess().getUniformDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:413:2: ( (lv_qualifier_1_0= RULE_UNIFORM ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:414:1: (lv_qualifier_1_0= RULE_UNIFORM )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:414:1: (lv_qualifier_1_0= RULE_UNIFORM )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:415:3: lv_qualifier_1_0= RULE_UNIFORM
            {
            lv_qualifier_1_0=(Token)match(input,RULE_UNIFORM,FOLLOW_RULE_UNIFORM_in_ruleUniformDeclaration867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_qualifier_1_0, grammarAccess.getUniformDeclarationAccess().getQualifierUNIFORMTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUniformDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"qualifier",
                      		lv_qualifier_1_0, 
                      		"UNIFORM");
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:431:2: ( (lv_type_2_0= ruleType ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:432:1: (lv_type_2_0= ruleType )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:432:1: (lv_type_2_0= ruleType )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:433:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUniformDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleUniformDeclaration893);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUniformDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:449:2: ( (lv_name_3_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:450:1: (lv_name_3_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:450:1: (lv_name_3_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:451:3: lv_name_3_0= RULE_IDENTIFIER
            {
            lv_name_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleUniformDeclaration910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getUniformDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUniformDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUniformDeclaration"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:475:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:476:2: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:477:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration951);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDeclaration961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:484:1: ruleAttributeDeclaration returns [EObject current=null] : ( ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) ) ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_qualifier_1_0=null;
        Token lv_name_3_0=null;
        Token lv_qualifier_5_0=null;
        Token lv_name_7_0=null;
        Token lv_qualifier_9_0=null;
        Token lv_name_11_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_type_6_0 = null;

        EObject lv_type_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:487:28: ( ( ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:1: ( ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:1: ( ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) ) | ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_IN:
                {
                alt5=1;
                }
                break;
            case RULE_OUT:
                {
                alt5=2;
                }
                break;
            case RULE_INOUT:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:2: ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:2: ( () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:3: () ( (lv_qualifier_1_0= RULE_IN ) ) ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:488:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:489:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAttributeDeclarationAccess().getInAttributeDeclarationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:494:2: ( (lv_qualifier_1_0= RULE_IN ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:495:1: (lv_qualifier_1_0= RULE_IN )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:495:1: (lv_qualifier_1_0= RULE_IN )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:496:3: lv_qualifier_1_0= RULE_IN
                    {
                    lv_qualifier_1_0=(Token)match(input,RULE_IN,FOLLOW_RULE_IN_in_ruleAttributeDeclaration1013); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_qualifier_1_0, grammarAccess.getAttributeDeclarationAccess().getQualifierINTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"qualifier",
                              		lv_qualifier_1_0, 
                              		"IN");
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:512:2: ( (lv_type_2_0= ruleType ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:513:1: (lv_type_2_0= ruleType )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:513:1: (lv_type_2_0= ruleType )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:514:3: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleAttributeDeclaration1039);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:530:2: ( (lv_name_3_0= RULE_IDENTIFIER ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:531:1: (lv_name_3_0= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:531:1: (lv_name_3_0= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:532:3: lv_name_3_0= RULE_IDENTIFIER
                    {
                    lv_name_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:549:6: ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:549:6: ( () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:549:7: () ( (lv_qualifier_5_0= RULE_OUT ) ) ( (lv_type_6_0= ruleType ) ) ( (lv_name_7_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:549:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:550:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAttributeDeclarationAccess().getOutAttributeDeclarationAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:555:2: ( (lv_qualifier_5_0= RULE_OUT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:556:1: (lv_qualifier_5_0= RULE_OUT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:556:1: (lv_qualifier_5_0= RULE_OUT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:557:3: lv_qualifier_5_0= RULE_OUT
                    {
                    lv_qualifier_5_0=(Token)match(input,RULE_OUT,FOLLOW_RULE_OUT_in_ruleAttributeDeclaration1095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_qualifier_5_0, grammarAccess.getAttributeDeclarationAccess().getQualifierOUTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"qualifier",
                              		lv_qualifier_5_0, 
                              		"OUT");
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:573:2: ( (lv_type_6_0= ruleType ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:574:1: (lv_type_6_0= ruleType )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:574:1: (lv_type_6_0= ruleType )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:575:3: lv_type_6_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleAttributeDeclaration1121);
                    lv_type_6_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:591:2: ( (lv_name_7_0= RULE_IDENTIFIER ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:592:1: (lv_name_7_0= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:592:1: (lv_name_7_0= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:593:3: lv_name_7_0= RULE_IDENTIFIER
                    {
                    lv_name_7_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:610:6: ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:610:6: ( () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:610:7: () ( (lv_qualifier_9_0= RULE_INOUT ) ) ( (lv_type_10_0= ruleType ) ) ( (lv_name_11_0= RULE_IDENTIFIER ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:610:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:611:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAttributeDeclarationAccess().getInOutAttributeDeclarationAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:616:2: ( (lv_qualifier_9_0= RULE_INOUT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:617:1: (lv_qualifier_9_0= RULE_INOUT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:617:1: (lv_qualifier_9_0= RULE_INOUT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:618:3: lv_qualifier_9_0= RULE_INOUT
                    {
                    lv_qualifier_9_0=(Token)match(input,RULE_INOUT,FOLLOW_RULE_INOUT_in_ruleAttributeDeclaration1177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_qualifier_9_0, grammarAccess.getAttributeDeclarationAccess().getQualifierINOUTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"qualifier",
                              		lv_qualifier_9_0, 
                              		"INOUT");
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:634:2: ( (lv_type_10_0= ruleType ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:635:1: (lv_type_10_0= ruleType )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:635:1: (lv_type_10_0= ruleType )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:636:3: lv_type_10_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleAttributeDeclaration1203);
                    lv_type_10_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_10_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:652:2: ( (lv_name_11_0= RULE_IDENTIFIER ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:653:1: (lv_name_11_0= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:653:1: (lv_name_11_0= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:654:3: lv_name_11_0= RULE_IDENTIFIER
                    {
                    lv_name_11_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_11_0, grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeDeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_11_0, 
                              		"IDENTIFIER");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleFunctionPrototype"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:678:1: entryRuleFunctionPrototype returns [EObject current=null] : iv_ruleFunctionPrototype= ruleFunctionPrototype EOF ;
    public final EObject entryRuleFunctionPrototype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionPrototype = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:679:2: (iv_ruleFunctionPrototype= ruleFunctionPrototype EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:680:2: iv_ruleFunctionPrototype= ruleFunctionPrototype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionPrototypeRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionPrototype_in_entryRuleFunctionPrototype1262);
            iv_ruleFunctionPrototype=ruleFunctionPrototype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionPrototype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionPrototype1272); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionPrototype"


    // $ANTLR start "ruleFunctionPrototype"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:687:1: ruleFunctionPrototype returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) ) otherlv_7= ')' ) ;
    public final EObject ruleFunctionPrototype() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_VOID_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_type_0_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:690:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) ) otherlv_7= ')' ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:691:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) ) otherlv_7= ')' )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:691:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) ) otherlv_7= ')' )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:691:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) otherlv_2= '(' ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) ) otherlv_7= ')'
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:691:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:692:1: (lv_type_0_0= ruleType )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:692:1: (lv_type_0_0= ruleType )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:693:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionPrototypeAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFunctionPrototype1318);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionPrototypeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:709:2: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:710:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:710:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:711:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleFunctionPrototype1335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionPrototypeAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionPrototypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleFunctionPrototype1352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionPrototypeAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:731:1: ( (this_VOID_3= RULE_VOID )? | ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case RULE_VOID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==113) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_IDENTIFIER) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case 113:
                {
                alt8=1;
                }
                break;
            case RULE_INTX:
            case RULE_UINT:
            case RULE_BOOL:
            case RULE_FLOAT:
            case RULE_VEC2:
            case RULE_VEC3:
            case RULE_VEC4:
            case RULE_IVEC2:
            case RULE_IVEC3:
            case RULE_IVEC4:
            case RULE_UVEC2:
            case RULE_UVEC3:
            case RULE_UVEC4:
            case RULE_BVEC2:
            case RULE_BVEC3:
            case RULE_BVEC4:
            case RULE_MAT2:
            case RULE_MAT3:
            case RULE_MAT4:
            case RULE_MAT2X2:
            case RULE_MAT2X3:
            case RULE_MAT2X4:
            case RULE_MAT3X2:
            case RULE_MAT3X3:
            case RULE_MAT3X4:
            case RULE_MAT4X2:
            case RULE_MAT4X3:
            case RULE_MAT4X4:
                {
                alt8=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:731:2: (this_VOID_3= RULE_VOID )?
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:731:2: (this_VOID_3= RULE_VOID )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_VOID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:731:3: this_VOID_3= RULE_VOID
                            {
                            this_VOID_3=(Token)match(input,RULE_VOID,FOLLOW_RULE_VOID_in_ruleFunctionPrototype1365); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_VOID_3, grammarAccess.getFunctionPrototypeAccess().getVOIDTerminalRuleCall_3_0()); 
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:736:6: ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:736:6: ( ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )* )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:736:7: ( (lv_params_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:736:7: ( (lv_params_4_0= ruleParameter ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:737:1: (lv_params_4_0= ruleParameter )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:737:1: (lv_params_4_0= ruleParameter )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:738:3: lv_params_4_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionPrototypeAccess().getParamsParameterParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionPrototype1394);
                    lv_params_4_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionPrototypeRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_4_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:754:2: (otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==112) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:754:4: otherlv_5= ',' ( (lv_params_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,112,FOLLOW_112_in_ruleFunctionPrototype1407); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionPrototypeAccess().getCommaKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:758:1: ( (lv_params_6_0= ruleParameter ) )
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:759:1: (lv_params_6_0= ruleParameter )
                    	    {
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:759:1: (lv_params_6_0= ruleParameter )
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:760:3: lv_params_6_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionPrototypeAccess().getParamsParameterParserRuleCall_3_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleFunctionPrototype1428);
                    	    lv_params_6_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionPrototypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_6_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,113,FOLLOW_113_in_ruleFunctionPrototype1444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionPrototypeAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionPrototype"


    // $ANTLR start "entryRuleParameter"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:788:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:789:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:790:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1480);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:797:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:800:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:801:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:801:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:801:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:801:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:802:1: (lv_type_0_0= ruleType )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:802:1: (lv_type_0_0= ruleType )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:803:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameter1536);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:819:2: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:820:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:820:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:821:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleParameter1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:845:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:846:2: (iv_ruleType= ruleType EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:847:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1594);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:854:1: ruleType returns [EObject current=null] : (this_ScalarType_0= ruleScalarType | this_ComplexType_1= ruleComplexType | ( () ( (lv_name_3_0= RULE_VOID ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject this_ScalarType_0 = null;

        EObject this_ComplexType_1 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:857:28: ( (this_ScalarType_0= ruleScalarType | this_ComplexType_1= ruleComplexType | ( () ( (lv_name_3_0= RULE_VOID ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:858:1: (this_ScalarType_0= ruleScalarType | this_ComplexType_1= ruleComplexType | ( () ( (lv_name_3_0= RULE_VOID ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:858:1: (this_ScalarType_0= ruleScalarType | this_ComplexType_1= ruleComplexType | ( () ( (lv_name_3_0= RULE_VOID ) ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INTX:
            case RULE_UINT:
            case RULE_BOOL:
            case RULE_FLOAT:
                {
                alt9=1;
                }
                break;
            case RULE_VEC2:
            case RULE_VEC3:
            case RULE_VEC4:
            case RULE_IVEC2:
            case RULE_IVEC3:
            case RULE_IVEC4:
            case RULE_UVEC2:
            case RULE_UVEC3:
            case RULE_UVEC4:
            case RULE_BVEC2:
            case RULE_BVEC3:
            case RULE_BVEC4:
            case RULE_MAT2:
            case RULE_MAT3:
            case RULE_MAT4:
            case RULE_MAT2X2:
            case RULE_MAT2X3:
            case RULE_MAT2X4:
            case RULE_MAT3X2:
            case RULE_MAT3X3:
            case RULE_MAT3X4:
            case RULE_MAT4X2:
            case RULE_MAT4X3:
            case RULE_MAT4X4:
                {
                alt9=2;
                }
                break;
            case RULE_VOID:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:859:5: this_ScalarType_0= ruleScalarType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getScalarTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleScalarType_in_ruleType1651);
                    this_ScalarType_0=ruleScalarType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ScalarType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:869:5: this_ComplexType_1= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getComplexTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_ruleType1678);
                    this_ComplexType_1=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:878:6: ( () ( (lv_name_3_0= RULE_VOID ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:878:6: ( () ( (lv_name_3_0= RULE_VOID ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:878:7: () ( (lv_name_3_0= RULE_VOID ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:878:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:879:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getTypeAccess().getVoidTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:884:2: ( (lv_name_3_0= RULE_VOID ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:885:1: (lv_name_3_0= RULE_VOID )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:885:1: (lv_name_3_0= RULE_VOID )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:886:3: lv_name_3_0= RULE_VOID
                    {
                    lv_name_3_0=(Token)match(input,RULE_VOID,FOLLOW_RULE_VOID_in_ruleType1710); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getTypeAccess().getNameVOIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"VOID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleScalarType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:910:1: entryRuleScalarType returns [EObject current=null] : iv_ruleScalarType= ruleScalarType EOF ;
    public final EObject entryRuleScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarType = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:911:2: (iv_ruleScalarType= ruleScalarType EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:912:2: iv_ruleScalarType= ruleScalarType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScalarTypeRule()); 
            }
            pushFollow(FOLLOW_ruleScalarType_in_entryRuleScalarType1752);
            iv_ruleScalarType=ruleScalarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScalarType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScalarType1762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarType"


    // $ANTLR start "ruleScalarType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:919:1: ruleScalarType returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_INTX ) ) ) | ( () ( (lv_name_3_0= RULE_UINT ) ) ) | ( () ( (lv_name_5_0= RULE_BOOL ) ) ) | ( () ( (lv_name_7_0= RULE_FLOAT ) ) ) ) ;
    public final EObject ruleScalarType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:922:28: ( ( ( () ( (lv_name_1_0= RULE_INTX ) ) ) | ( () ( (lv_name_3_0= RULE_UINT ) ) ) | ( () ( (lv_name_5_0= RULE_BOOL ) ) ) | ( () ( (lv_name_7_0= RULE_FLOAT ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:1: ( ( () ( (lv_name_1_0= RULE_INTX ) ) ) | ( () ( (lv_name_3_0= RULE_UINT ) ) ) | ( () ( (lv_name_5_0= RULE_BOOL ) ) ) | ( () ( (lv_name_7_0= RULE_FLOAT ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:1: ( ( () ( (lv_name_1_0= RULE_INTX ) ) ) | ( () ( (lv_name_3_0= RULE_UINT ) ) ) | ( () ( (lv_name_5_0= RULE_BOOL ) ) ) | ( () ( (lv_name_7_0= RULE_FLOAT ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_INTX:
                {
                alt10=1;
                }
                break;
            case RULE_UINT:
                {
                alt10=2;
                }
                break;
            case RULE_BOOL:
                {
                alt10=3;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:2: ( () ( (lv_name_1_0= RULE_INTX ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:2: ( () ( (lv_name_1_0= RULE_INTX ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:3: () ( (lv_name_1_0= RULE_INTX ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:923:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:924:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getScalarTypeAccess().getIntTypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:929:2: ( (lv_name_1_0= RULE_INTX ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:930:1: (lv_name_1_0= RULE_INTX )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:930:1: (lv_name_1_0= RULE_INTX )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:931:3: lv_name_1_0= RULE_INTX
                    {
                    lv_name_1_0=(Token)match(input,RULE_INTX,FOLLOW_RULE_INTX_in_ruleScalarType1814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getScalarTypeAccess().getNameINTXTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScalarTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"INTX");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:948:6: ( () ( (lv_name_3_0= RULE_UINT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:948:6: ( () ( (lv_name_3_0= RULE_UINT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:948:7: () ( (lv_name_3_0= RULE_UINT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:948:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:949:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getScalarTypeAccess().getUIntTypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:954:2: ( (lv_name_3_0= RULE_UINT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:955:1: (lv_name_3_0= RULE_UINT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:955:1: (lv_name_3_0= RULE_UINT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:956:3: lv_name_3_0= RULE_UINT
                    {
                    lv_name_3_0=(Token)match(input,RULE_UINT,FOLLOW_RULE_UINT_in_ruleScalarType1853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getScalarTypeAccess().getNameUINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScalarTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"UINT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:973:6: ( () ( (lv_name_5_0= RULE_BOOL ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:973:6: ( () ( (lv_name_5_0= RULE_BOOL ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:973:7: () ( (lv_name_5_0= RULE_BOOL ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:973:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:974:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getScalarTypeAccess().getBoolTypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:979:2: ( (lv_name_5_0= RULE_BOOL ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:980:1: (lv_name_5_0= RULE_BOOL )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:980:1: (lv_name_5_0= RULE_BOOL )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:981:3: lv_name_5_0= RULE_BOOL
                    {
                    lv_name_5_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleScalarType1892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getScalarTypeAccess().getNameBOOLTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScalarTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"BOOL");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:998:6: ( () ( (lv_name_7_0= RULE_FLOAT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:998:6: ( () ( (lv_name_7_0= RULE_FLOAT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:998:7: () ( (lv_name_7_0= RULE_FLOAT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:998:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:999:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getScalarTypeAccess().getFloatTypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1004:2: ( (lv_name_7_0= RULE_FLOAT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1005:1: (lv_name_7_0= RULE_FLOAT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1005:1: (lv_name_7_0= RULE_FLOAT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1006:3: lv_name_7_0= RULE_FLOAT
                    {
                    lv_name_7_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleScalarType1931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getScalarTypeAccess().getNameFLOATTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScalarTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"FLOAT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarType"


    // $ANTLR start "entryRuleComplexType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1030:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1031:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1032:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType1973);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType1983); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1039:1: ruleComplexType returns [EObject current=null] : (this_VecType_0= ruleVecType | this_MatType_1= ruleMatType ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        EObject this_VecType_0 = null;

        EObject this_MatType_1 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1042:28: ( (this_VecType_0= ruleVecType | this_MatType_1= ruleMatType ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1043:1: (this_VecType_0= ruleVecType | this_MatType_1= ruleMatType )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1043:1: (this_VecType_0= ruleVecType | this_MatType_1= ruleMatType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_VEC2 && LA11_0<=RULE_BVEC4)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_MAT2 && LA11_0<=RULE_MAT4X4)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1044:5: this_VecType_0= ruleVecType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getVecTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVecType_in_ruleComplexType2030);
                    this_VecType_0=ruleVecType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VecType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1054:5: this_MatType_1= ruleMatType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComplexTypeAccess().getMatTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMatType_in_ruleComplexType2057);
                    this_MatType_1=ruleMatType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MatType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleVecType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1070:1: entryRuleVecType returns [EObject current=null] : iv_ruleVecType= ruleVecType EOF ;
    public final EObject entryRuleVecType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVecType = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1071:2: (iv_ruleVecType= ruleVecType EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1072:2: iv_ruleVecType= ruleVecType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVecTypeRule()); 
            }
            pushFollow(FOLLOW_ruleVecType_in_entryRuleVecType2092);
            iv_ruleVecType=ruleVecType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVecType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVecType2102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVecType"


    // $ANTLR start "ruleVecType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1079:1: ruleVecType returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_VEC2 ) ) ) | ( () ( (lv_name_3_0= RULE_VEC3 ) ) ) | ( () ( (lv_name_5_0= RULE_VEC4 ) ) ) | ( () ( (lv_name_7_0= RULE_IVEC2 ) ) ) | ( () ( (lv_name_9_0= RULE_IVEC3 ) ) ) | ( () ( (lv_name_11_0= RULE_IVEC4 ) ) ) | ( () ( (lv_name_13_0= RULE_UVEC2 ) ) ) | ( () ( (lv_name_15_0= RULE_UVEC3 ) ) ) | ( () ( (lv_name_17_0= RULE_UVEC4 ) ) ) | ( () ( (lv_name_19_0= RULE_BVEC2 ) ) ) | ( () ( (lv_name_21_0= RULE_BVEC3 ) ) ) | ( () ( (lv_name_23_0= RULE_BVEC4 ) ) ) ) ;
    public final EObject ruleVecType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;
        Token lv_name_9_0=null;
        Token lv_name_11_0=null;
        Token lv_name_13_0=null;
        Token lv_name_15_0=null;
        Token lv_name_17_0=null;
        Token lv_name_19_0=null;
        Token lv_name_21_0=null;
        Token lv_name_23_0=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1082:28: ( ( ( () ( (lv_name_1_0= RULE_VEC2 ) ) ) | ( () ( (lv_name_3_0= RULE_VEC3 ) ) ) | ( () ( (lv_name_5_0= RULE_VEC4 ) ) ) | ( () ( (lv_name_7_0= RULE_IVEC2 ) ) ) | ( () ( (lv_name_9_0= RULE_IVEC3 ) ) ) | ( () ( (lv_name_11_0= RULE_IVEC4 ) ) ) | ( () ( (lv_name_13_0= RULE_UVEC2 ) ) ) | ( () ( (lv_name_15_0= RULE_UVEC3 ) ) ) | ( () ( (lv_name_17_0= RULE_UVEC4 ) ) ) | ( () ( (lv_name_19_0= RULE_BVEC2 ) ) ) | ( () ( (lv_name_21_0= RULE_BVEC3 ) ) ) | ( () ( (lv_name_23_0= RULE_BVEC4 ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:1: ( ( () ( (lv_name_1_0= RULE_VEC2 ) ) ) | ( () ( (lv_name_3_0= RULE_VEC3 ) ) ) | ( () ( (lv_name_5_0= RULE_VEC4 ) ) ) | ( () ( (lv_name_7_0= RULE_IVEC2 ) ) ) | ( () ( (lv_name_9_0= RULE_IVEC3 ) ) ) | ( () ( (lv_name_11_0= RULE_IVEC4 ) ) ) | ( () ( (lv_name_13_0= RULE_UVEC2 ) ) ) | ( () ( (lv_name_15_0= RULE_UVEC3 ) ) ) | ( () ( (lv_name_17_0= RULE_UVEC4 ) ) ) | ( () ( (lv_name_19_0= RULE_BVEC2 ) ) ) | ( () ( (lv_name_21_0= RULE_BVEC3 ) ) ) | ( () ( (lv_name_23_0= RULE_BVEC4 ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:1: ( ( () ( (lv_name_1_0= RULE_VEC2 ) ) ) | ( () ( (lv_name_3_0= RULE_VEC3 ) ) ) | ( () ( (lv_name_5_0= RULE_VEC4 ) ) ) | ( () ( (lv_name_7_0= RULE_IVEC2 ) ) ) | ( () ( (lv_name_9_0= RULE_IVEC3 ) ) ) | ( () ( (lv_name_11_0= RULE_IVEC4 ) ) ) | ( () ( (lv_name_13_0= RULE_UVEC2 ) ) ) | ( () ( (lv_name_15_0= RULE_UVEC3 ) ) ) | ( () ( (lv_name_17_0= RULE_UVEC4 ) ) ) | ( () ( (lv_name_19_0= RULE_BVEC2 ) ) ) | ( () ( (lv_name_21_0= RULE_BVEC3 ) ) ) | ( () ( (lv_name_23_0= RULE_BVEC4 ) ) ) )
            int alt12=12;
            switch ( input.LA(1) ) {
            case RULE_VEC2:
                {
                alt12=1;
                }
                break;
            case RULE_VEC3:
                {
                alt12=2;
                }
                break;
            case RULE_VEC4:
                {
                alt12=3;
                }
                break;
            case RULE_IVEC2:
                {
                alt12=4;
                }
                break;
            case RULE_IVEC3:
                {
                alt12=5;
                }
                break;
            case RULE_IVEC4:
                {
                alt12=6;
                }
                break;
            case RULE_UVEC2:
                {
                alt12=7;
                }
                break;
            case RULE_UVEC3:
                {
                alt12=8;
                }
                break;
            case RULE_UVEC4:
                {
                alt12=9;
                }
                break;
            case RULE_BVEC2:
                {
                alt12=10;
                }
                break;
            case RULE_BVEC3:
                {
                alt12=11;
                }
                break;
            case RULE_BVEC4:
                {
                alt12=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:2: ( () ( (lv_name_1_0= RULE_VEC2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:2: ( () ( (lv_name_1_0= RULE_VEC2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:3: () ( (lv_name_1_0= RULE_VEC2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1083:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1084:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getVec2TypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1089:2: ( (lv_name_1_0= RULE_VEC2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1090:1: (lv_name_1_0= RULE_VEC2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1090:1: (lv_name_1_0= RULE_VEC2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1091:3: lv_name_1_0= RULE_VEC2
                    {
                    lv_name_1_0=(Token)match(input,RULE_VEC2,FOLLOW_RULE_VEC2_in_ruleVecType2154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getVecTypeAccess().getNameVEC2TerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"VEC2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1108:6: ( () ( (lv_name_3_0= RULE_VEC3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1108:6: ( () ( (lv_name_3_0= RULE_VEC3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1108:7: () ( (lv_name_3_0= RULE_VEC3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1108:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1109:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getVec3TypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1114:2: ( (lv_name_3_0= RULE_VEC3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1115:1: (lv_name_3_0= RULE_VEC3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1115:1: (lv_name_3_0= RULE_VEC3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1116:3: lv_name_3_0= RULE_VEC3
                    {
                    lv_name_3_0=(Token)match(input,RULE_VEC3,FOLLOW_RULE_VEC3_in_ruleVecType2193); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getVecTypeAccess().getNameVEC3TerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"VEC3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1133:6: ( () ( (lv_name_5_0= RULE_VEC4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1133:6: ( () ( (lv_name_5_0= RULE_VEC4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1133:7: () ( (lv_name_5_0= RULE_VEC4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1133:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1134:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getVec4TypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1139:2: ( (lv_name_5_0= RULE_VEC4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1140:1: (lv_name_5_0= RULE_VEC4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1140:1: (lv_name_5_0= RULE_VEC4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1141:3: lv_name_5_0= RULE_VEC4
                    {
                    lv_name_5_0=(Token)match(input,RULE_VEC4,FOLLOW_RULE_VEC4_in_ruleVecType2232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getVecTypeAccess().getNameVEC4TerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"VEC4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1158:6: ( () ( (lv_name_7_0= RULE_IVEC2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1158:6: ( () ( (lv_name_7_0= RULE_IVEC2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1158:7: () ( (lv_name_7_0= RULE_IVEC2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1158:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1159:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getIVec2TypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1164:2: ( (lv_name_7_0= RULE_IVEC2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1165:1: (lv_name_7_0= RULE_IVEC2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1165:1: (lv_name_7_0= RULE_IVEC2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1166:3: lv_name_7_0= RULE_IVEC2
                    {
                    lv_name_7_0=(Token)match(input,RULE_IVEC2,FOLLOW_RULE_IVEC2_in_ruleVecType2271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getVecTypeAccess().getNameIVEC2TerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"IVEC2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1183:6: ( () ( (lv_name_9_0= RULE_IVEC3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1183:6: ( () ( (lv_name_9_0= RULE_IVEC3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1183:7: () ( (lv_name_9_0= RULE_IVEC3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1183:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1184:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getIVec3TypeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1189:2: ( (lv_name_9_0= RULE_IVEC3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1190:1: (lv_name_9_0= RULE_IVEC3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1190:1: (lv_name_9_0= RULE_IVEC3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1191:3: lv_name_9_0= RULE_IVEC3
                    {
                    lv_name_9_0=(Token)match(input,RULE_IVEC3,FOLLOW_RULE_IVEC3_in_ruleVecType2310); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_9_0, grammarAccess.getVecTypeAccess().getNameIVEC3TerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_9_0, 
                              		"IVEC3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1208:6: ( () ( (lv_name_11_0= RULE_IVEC4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1208:6: ( () ( (lv_name_11_0= RULE_IVEC4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1208:7: () ( (lv_name_11_0= RULE_IVEC4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1208:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1209:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getIVec4TypeAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1214:2: ( (lv_name_11_0= RULE_IVEC4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1215:1: (lv_name_11_0= RULE_IVEC4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1215:1: (lv_name_11_0= RULE_IVEC4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1216:3: lv_name_11_0= RULE_IVEC4
                    {
                    lv_name_11_0=(Token)match(input,RULE_IVEC4,FOLLOW_RULE_IVEC4_in_ruleVecType2349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_11_0, grammarAccess.getVecTypeAccess().getNameIVEC4TerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_11_0, 
                              		"IVEC4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1233:6: ( () ( (lv_name_13_0= RULE_UVEC2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1233:6: ( () ( (lv_name_13_0= RULE_UVEC2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1233:7: () ( (lv_name_13_0= RULE_UVEC2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1233:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1234:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getUVec2TypeAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1239:2: ( (lv_name_13_0= RULE_UVEC2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1240:1: (lv_name_13_0= RULE_UVEC2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1240:1: (lv_name_13_0= RULE_UVEC2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1241:3: lv_name_13_0= RULE_UVEC2
                    {
                    lv_name_13_0=(Token)match(input,RULE_UVEC2,FOLLOW_RULE_UVEC2_in_ruleVecType2388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_13_0, grammarAccess.getVecTypeAccess().getNameUVEC2TerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_13_0, 
                              		"UVEC2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1258:6: ( () ( (lv_name_15_0= RULE_UVEC3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1258:6: ( () ( (lv_name_15_0= RULE_UVEC3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1258:7: () ( (lv_name_15_0= RULE_UVEC3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1258:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1259:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getUVec3TypeAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1264:2: ( (lv_name_15_0= RULE_UVEC3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1265:1: (lv_name_15_0= RULE_UVEC3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1265:1: (lv_name_15_0= RULE_UVEC3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1266:3: lv_name_15_0= RULE_UVEC3
                    {
                    lv_name_15_0=(Token)match(input,RULE_UVEC3,FOLLOW_RULE_UVEC3_in_ruleVecType2427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_15_0, grammarAccess.getVecTypeAccess().getNameUVEC3TerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"UVEC3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1283:6: ( () ( (lv_name_17_0= RULE_UVEC4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1283:6: ( () ( (lv_name_17_0= RULE_UVEC4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1283:7: () ( (lv_name_17_0= RULE_UVEC4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1283:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1284:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getUVec4TypeAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1289:2: ( (lv_name_17_0= RULE_UVEC4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1290:1: (lv_name_17_0= RULE_UVEC4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1290:1: (lv_name_17_0= RULE_UVEC4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1291:3: lv_name_17_0= RULE_UVEC4
                    {
                    lv_name_17_0=(Token)match(input,RULE_UVEC4,FOLLOW_RULE_UVEC4_in_ruleVecType2466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_17_0, grammarAccess.getVecTypeAccess().getNameUVEC4TerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_17_0, 
                              		"UVEC4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1308:6: ( () ( (lv_name_19_0= RULE_BVEC2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1308:6: ( () ( (lv_name_19_0= RULE_BVEC2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1308:7: () ( (lv_name_19_0= RULE_BVEC2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1308:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1309:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getBVec2TypeAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1314:2: ( (lv_name_19_0= RULE_BVEC2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1315:1: (lv_name_19_0= RULE_BVEC2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1315:1: (lv_name_19_0= RULE_BVEC2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1316:3: lv_name_19_0= RULE_BVEC2
                    {
                    lv_name_19_0=(Token)match(input,RULE_BVEC2,FOLLOW_RULE_BVEC2_in_ruleVecType2505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_19_0, grammarAccess.getVecTypeAccess().getNameBVEC2TerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_19_0, 
                              		"BVEC2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1333:6: ( () ( (lv_name_21_0= RULE_BVEC3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1333:6: ( () ( (lv_name_21_0= RULE_BVEC3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1333:7: () ( (lv_name_21_0= RULE_BVEC3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1333:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1334:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getBVec3TypeAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1339:2: ( (lv_name_21_0= RULE_BVEC3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1340:1: (lv_name_21_0= RULE_BVEC3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1340:1: (lv_name_21_0= RULE_BVEC3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1341:3: lv_name_21_0= RULE_BVEC3
                    {
                    lv_name_21_0=(Token)match(input,RULE_BVEC3,FOLLOW_RULE_BVEC3_in_ruleVecType2544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_21_0, grammarAccess.getVecTypeAccess().getNameBVEC3TerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_21_0, 
                              		"BVEC3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1358:6: ( () ( (lv_name_23_0= RULE_BVEC4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1358:6: ( () ( (lv_name_23_0= RULE_BVEC4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1358:7: () ( (lv_name_23_0= RULE_BVEC4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1358:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1359:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getVecTypeAccess().getBVec4TypeAction_11_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1364:2: ( (lv_name_23_0= RULE_BVEC4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1365:1: (lv_name_23_0= RULE_BVEC4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1365:1: (lv_name_23_0= RULE_BVEC4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1366:3: lv_name_23_0= RULE_BVEC4
                    {
                    lv_name_23_0=(Token)match(input,RULE_BVEC4,FOLLOW_RULE_BVEC4_in_ruleVecType2583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_23_0, grammarAccess.getVecTypeAccess().getNameBVEC4TerminalRuleCall_11_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVecTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_23_0, 
                              		"BVEC4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVecType"


    // $ANTLR start "entryRuleMatType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1390:1: entryRuleMatType returns [EObject current=null] : iv_ruleMatType= ruleMatType EOF ;
    public final EObject entryRuleMatType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatType = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1391:2: (iv_ruleMatType= ruleMatType EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1392:2: iv_ruleMatType= ruleMatType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatTypeRule()); 
            }
            pushFollow(FOLLOW_ruleMatType_in_entryRuleMatType2625);
            iv_ruleMatType=ruleMatType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMatType2635); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatType"


    // $ANTLR start "ruleMatType"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1399:1: ruleMatType returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_MAT2 ) ) ) | ( () ( (lv_name_3_0= RULE_MAT3 ) ) ) | ( () ( (lv_name_5_0= RULE_MAT4 ) ) ) | ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) ) | ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) ) | ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) ) | ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) ) | ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) ) | ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) ) | ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) ) | ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) ) | ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) ) ) ;
    public final EObject ruleMatType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;
        Token lv_name_9_0=null;
        Token lv_name_11_0=null;
        Token lv_name_13_0=null;
        Token lv_name_15_0=null;
        Token lv_name_17_0=null;
        Token lv_name_19_0=null;
        Token lv_name_21_0=null;
        Token lv_name_23_0=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1402:28: ( ( ( () ( (lv_name_1_0= RULE_MAT2 ) ) ) | ( () ( (lv_name_3_0= RULE_MAT3 ) ) ) | ( () ( (lv_name_5_0= RULE_MAT4 ) ) ) | ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) ) | ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) ) | ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) ) | ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) ) | ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) ) | ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) ) | ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) ) | ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) ) | ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:1: ( ( () ( (lv_name_1_0= RULE_MAT2 ) ) ) | ( () ( (lv_name_3_0= RULE_MAT3 ) ) ) | ( () ( (lv_name_5_0= RULE_MAT4 ) ) ) | ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) ) | ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) ) | ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) ) | ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) ) | ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) ) | ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) ) | ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) ) | ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) ) | ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:1: ( ( () ( (lv_name_1_0= RULE_MAT2 ) ) ) | ( () ( (lv_name_3_0= RULE_MAT3 ) ) ) | ( () ( (lv_name_5_0= RULE_MAT4 ) ) ) | ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) ) | ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) ) | ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) ) | ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) ) | ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) ) | ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) ) | ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) ) | ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) ) | ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) ) )
            int alt13=12;
            switch ( input.LA(1) ) {
            case RULE_MAT2:
                {
                alt13=1;
                }
                break;
            case RULE_MAT3:
                {
                alt13=2;
                }
                break;
            case RULE_MAT4:
                {
                alt13=3;
                }
                break;
            case RULE_MAT2X2:
                {
                alt13=4;
                }
                break;
            case RULE_MAT2X3:
                {
                alt13=5;
                }
                break;
            case RULE_MAT2X4:
                {
                alt13=6;
                }
                break;
            case RULE_MAT3X2:
                {
                alt13=7;
                }
                break;
            case RULE_MAT3X3:
                {
                alt13=8;
                }
                break;
            case RULE_MAT3X4:
                {
                alt13=9;
                }
                break;
            case RULE_MAT4X2:
                {
                alt13=10;
                }
                break;
            case RULE_MAT4X3:
                {
                alt13=11;
                }
                break;
            case RULE_MAT4X4:
                {
                alt13=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:2: ( () ( (lv_name_1_0= RULE_MAT2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:2: ( () ( (lv_name_1_0= RULE_MAT2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:3: () ( (lv_name_1_0= RULE_MAT2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1403:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1404:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat2TypeAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1409:2: ( (lv_name_1_0= RULE_MAT2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1410:1: (lv_name_1_0= RULE_MAT2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1410:1: (lv_name_1_0= RULE_MAT2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1411:3: lv_name_1_0= RULE_MAT2
                    {
                    lv_name_1_0=(Token)match(input,RULE_MAT2,FOLLOW_RULE_MAT2_in_ruleMatType2687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getMatTypeAccess().getNameMAT2TerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"MAT2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1428:6: ( () ( (lv_name_3_0= RULE_MAT3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1428:6: ( () ( (lv_name_3_0= RULE_MAT3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1428:7: () ( (lv_name_3_0= RULE_MAT3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1428:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat3TypeAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1434:2: ( (lv_name_3_0= RULE_MAT3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1435:1: (lv_name_3_0= RULE_MAT3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1435:1: (lv_name_3_0= RULE_MAT3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1436:3: lv_name_3_0= RULE_MAT3
                    {
                    lv_name_3_0=(Token)match(input,RULE_MAT3,FOLLOW_RULE_MAT3_in_ruleMatType2726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_3_0, grammarAccess.getMatTypeAccess().getNameMAT3TerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"MAT3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1453:6: ( () ( (lv_name_5_0= RULE_MAT4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1453:6: ( () ( (lv_name_5_0= RULE_MAT4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1453:7: () ( (lv_name_5_0= RULE_MAT4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1453:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1454:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat4TypeAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1459:2: ( (lv_name_5_0= RULE_MAT4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1460:1: (lv_name_5_0= RULE_MAT4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1460:1: (lv_name_5_0= RULE_MAT4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1461:3: lv_name_5_0= RULE_MAT4
                    {
                    lv_name_5_0=(Token)match(input,RULE_MAT4,FOLLOW_RULE_MAT4_in_ruleMatType2765); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_5_0, grammarAccess.getMatTypeAccess().getNameMAT4TerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"MAT4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1478:6: ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1478:6: ( () ( (lv_name_7_0= RULE_MAT2X2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1478:7: () ( (lv_name_7_0= RULE_MAT2X2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1478:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1479:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat2x2TypeAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1484:2: ( (lv_name_7_0= RULE_MAT2X2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1485:1: (lv_name_7_0= RULE_MAT2X2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1485:1: (lv_name_7_0= RULE_MAT2X2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1486:3: lv_name_7_0= RULE_MAT2X2
                    {
                    lv_name_7_0=(Token)match(input,RULE_MAT2X2,FOLLOW_RULE_MAT2X2_in_ruleMatType2804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_7_0, grammarAccess.getMatTypeAccess().getNameMAT2X2TerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_7_0, 
                              		"MAT2X2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1503:6: ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1503:6: ( () ( (lv_name_9_0= RULE_MAT2X3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1503:7: () ( (lv_name_9_0= RULE_MAT2X3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1503:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1504:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat2x3TypeAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1509:2: ( (lv_name_9_0= RULE_MAT2X3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1510:1: (lv_name_9_0= RULE_MAT2X3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1510:1: (lv_name_9_0= RULE_MAT2X3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1511:3: lv_name_9_0= RULE_MAT2X3
                    {
                    lv_name_9_0=(Token)match(input,RULE_MAT2X3,FOLLOW_RULE_MAT2X3_in_ruleMatType2843); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_9_0, grammarAccess.getMatTypeAccess().getNameMAT2X3TerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_9_0, 
                              		"MAT2X3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1528:6: ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1528:6: ( () ( (lv_name_11_0= RULE_MAT2X4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1528:7: () ( (lv_name_11_0= RULE_MAT2X4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1528:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1529:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat2x4TypeAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1534:2: ( (lv_name_11_0= RULE_MAT2X4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1535:1: (lv_name_11_0= RULE_MAT2X4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1535:1: (lv_name_11_0= RULE_MAT2X4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1536:3: lv_name_11_0= RULE_MAT2X4
                    {
                    lv_name_11_0=(Token)match(input,RULE_MAT2X4,FOLLOW_RULE_MAT2X4_in_ruleMatType2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_11_0, grammarAccess.getMatTypeAccess().getNameMAT2X4TerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_11_0, 
                              		"MAT2X4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1553:6: ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1553:6: ( () ( (lv_name_13_0= RULE_MAT3X2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1553:7: () ( (lv_name_13_0= RULE_MAT3X2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1553:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1554:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat3x2TypeAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1559:2: ( (lv_name_13_0= RULE_MAT3X2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1560:1: (lv_name_13_0= RULE_MAT3X2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1560:1: (lv_name_13_0= RULE_MAT3X2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1561:3: lv_name_13_0= RULE_MAT3X2
                    {
                    lv_name_13_0=(Token)match(input,RULE_MAT3X2,FOLLOW_RULE_MAT3X2_in_ruleMatType2921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_13_0, grammarAccess.getMatTypeAccess().getNameMAT3X2TerminalRuleCall_6_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_13_0, 
                              		"MAT3X2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1578:6: ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1578:6: ( () ( (lv_name_15_0= RULE_MAT3X3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1578:7: () ( (lv_name_15_0= RULE_MAT3X3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1578:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1579:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat3x3TypeAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1584:2: ( (lv_name_15_0= RULE_MAT3X3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1585:1: (lv_name_15_0= RULE_MAT3X3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1585:1: (lv_name_15_0= RULE_MAT3X3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1586:3: lv_name_15_0= RULE_MAT3X3
                    {
                    lv_name_15_0=(Token)match(input,RULE_MAT3X3,FOLLOW_RULE_MAT3X3_in_ruleMatType2960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_15_0, grammarAccess.getMatTypeAccess().getNameMAT3X3TerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_15_0, 
                              		"MAT3X3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1603:6: ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1603:6: ( () ( (lv_name_17_0= RULE_MAT3X4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1603:7: () ( (lv_name_17_0= RULE_MAT3X4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1603:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1604:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat3x4TypeAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1609:2: ( (lv_name_17_0= RULE_MAT3X4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1610:1: (lv_name_17_0= RULE_MAT3X4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1610:1: (lv_name_17_0= RULE_MAT3X4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1611:3: lv_name_17_0= RULE_MAT3X4
                    {
                    lv_name_17_0=(Token)match(input,RULE_MAT3X4,FOLLOW_RULE_MAT3X4_in_ruleMatType2999); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_17_0, grammarAccess.getMatTypeAccess().getNameMAT3X4TerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_17_0, 
                              		"MAT3X4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1628:6: ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1628:6: ( () ( (lv_name_19_0= RULE_MAT4X2 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1628:7: () ( (lv_name_19_0= RULE_MAT4X2 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1628:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1629:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat4x2TypeAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1634:2: ( (lv_name_19_0= RULE_MAT4X2 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1635:1: (lv_name_19_0= RULE_MAT4X2 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1635:1: (lv_name_19_0= RULE_MAT4X2 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1636:3: lv_name_19_0= RULE_MAT4X2
                    {
                    lv_name_19_0=(Token)match(input,RULE_MAT4X2,FOLLOW_RULE_MAT4X2_in_ruleMatType3038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_19_0, grammarAccess.getMatTypeAccess().getNameMAT4X2TerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_19_0, 
                              		"MAT4X2");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1653:6: ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1653:6: ( () ( (lv_name_21_0= RULE_MAT4X3 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1653:7: () ( (lv_name_21_0= RULE_MAT4X3 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1653:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1654:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat4x3TypeAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1659:2: ( (lv_name_21_0= RULE_MAT4X3 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1660:1: (lv_name_21_0= RULE_MAT4X3 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1660:1: (lv_name_21_0= RULE_MAT4X3 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1661:3: lv_name_21_0= RULE_MAT4X3
                    {
                    lv_name_21_0=(Token)match(input,RULE_MAT4X3,FOLLOW_RULE_MAT4X3_in_ruleMatType3077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_21_0, grammarAccess.getMatTypeAccess().getNameMAT4X3TerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_21_0, 
                              		"MAT4X3");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1678:6: ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1678:6: ( () ( (lv_name_23_0= RULE_MAT4X4 ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1678:7: () ( (lv_name_23_0= RULE_MAT4X4 ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1678:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1679:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getMatTypeAccess().getMat4x4TypeAction_11_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1684:2: ( (lv_name_23_0= RULE_MAT4X4 ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1685:1: (lv_name_23_0= RULE_MAT4X4 )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1685:1: (lv_name_23_0= RULE_MAT4X4 )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1686:3: lv_name_23_0= RULE_MAT4X4
                    {
                    lv_name_23_0=(Token)match(input,RULE_MAT4X4,FOLLOW_RULE_MAT4X4_in_ruleMatType3116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_23_0, grammarAccess.getMatTypeAccess().getNameMAT4X4TerminalRuleCall_11_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMatTypeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_23_0, 
                              		"MAT4X4");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatType"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1710:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1711:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1712:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3158);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition3168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1719:1: ruleFunctionDefinition returns [EObject current=null] : (this_FunctionPrototype_0= ruleFunctionPrototype this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_1=null;
        Token this_RIGHT_BRACE_3=null;
        EObject this_FunctionPrototype_0 = null;

        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1722:28: ( (this_FunctionPrototype_0= ruleFunctionPrototype this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1723:1: (this_FunctionPrototype_0= ruleFunctionPrototype this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1723:1: (this_FunctionPrototype_0= ruleFunctionPrototype this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1724:5: this_FunctionPrototype_0= ruleFunctionPrototype this_LEFT_BRACE_1= RULE_LEFT_BRACE ( (lv_statements_2_0= ruleStatement ) )* this_RIGHT_BRACE_3= RULE_RIGHT_BRACE
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionPrototypeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleFunctionPrototype_in_ruleFunctionDefinition3215);
            this_FunctionPrototype_0=ruleFunctionPrototype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_FunctionPrototype_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_LEFT_BRACE_1=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_ruleFunctionDefinition3225); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_1, grammarAccess.getFunctionDefinitionAccess().getLEFT_BRACETerminalRuleCall_1()); 
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1736:1: ( (lv_statements_2_0= ruleStatement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_IDENTIFIER||(LA14_0>=RULE_VOID && LA14_0<=RULE_LEFT_BRACE)||LA14_0==RULE_IF||(LA14_0>=RULE_WHILE && LA14_0<=RULE_SWITCH)||(LA14_0>=RULE_CONTINUE && LA14_0<=RULE_DISCARD)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1737:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1737:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1738:3: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getStatementsStatementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleFunctionDefinition3245);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_2_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_RIGHT_BRACE_3=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_ruleFunctionDefinition3257); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACE_3, grammarAccess.getFunctionDefinitionAccess().getRIGHT_BRACETerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1768:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1769:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1770:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement3294);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement3304); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1777:1: ruleStatement returns [EObject current=null] : (this_BlockStatement_0= ruleBlockStatement | this_VariableDeclaration_1= ruleVariableDeclaration | this_AssignmentStatement_2= ruleAssignmentStatement | this_JumpStatement_3= ruleJumpStatement | ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON ) | ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? ) | ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) ) | ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON ) | ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) ) | ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_SEMICOLON_11=null;
        Token this_IF_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token this_ELSE_18=null;
        Token this_WHILE_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token this_DO_27=null;
        Token this_WHILE_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token this_SEMICOLON_33=null;
        Token this_FOR_35=null;
        Token otherlv_36=null;
        Token this_SEMICOLON_38=null;
        Token this_SEMICOLON_40=null;
        Token otherlv_42=null;
        Token this_SWITCH_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token this_LEFT_BRACE_49=null;
        Token this_RIGHT_BRACE_51=null;
        EObject this_BlockStatement_0 = null;

        EObject this_VariableDeclaration_1 = null;

        EObject this_AssignmentStatement_2 = null;

        EObject this_JumpStatement_3 = null;

        EObject lv_actuals_7_0 = null;

        EObject lv_actuals_9_0 = null;

        EObject lv_condition_15_0 = null;

        EObject lv_then_17_0 = null;

        EObject lv_else_19_0 = null;

        EObject lv_condition_23_0 = null;

        EObject lv_do_25_0 = null;

        EObject lv_do_28_0 = null;

        EObject lv_condition_31_0 = null;

        EObject lv_a_37_1 = null;

        EObject lv_a_37_2 = null;

        EObject lv_b_39_0 = null;

        EObject lv_c_41_0 = null;

        EObject lv_do_43_0 = null;

        EObject lv_a_47_0 = null;

        EObject lv_cases_50_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1780:28: ( (this_BlockStatement_0= ruleBlockStatement | this_VariableDeclaration_1= ruleVariableDeclaration | this_AssignmentStatement_2= ruleAssignmentStatement | this_JumpStatement_3= ruleJumpStatement | ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON ) | ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? ) | ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) ) | ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON ) | ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) ) | ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1781:1: (this_BlockStatement_0= ruleBlockStatement | this_VariableDeclaration_1= ruleVariableDeclaration | this_AssignmentStatement_2= ruleAssignmentStatement | this_JumpStatement_3= ruleJumpStatement | ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON ) | ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? ) | ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) ) | ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON ) | ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) ) | ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1781:1: (this_BlockStatement_0= ruleBlockStatement | this_VariableDeclaration_1= ruleVariableDeclaration | this_AssignmentStatement_2= ruleAssignmentStatement | this_JumpStatement_3= ruleJumpStatement | ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON ) | ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? ) | ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) ) | ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON ) | ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) ) | ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE ) )
            int alt22=10;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1782:5: this_BlockStatement_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getBlockStatementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleStatement3351);
                    this_BlockStatement_0=ruleBlockStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BlockStatement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1792:5: this_VariableDeclaration_1= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleStatement3378);
                    this_VariableDeclaration_1=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_VariableDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1802:5: this_AssignmentStatement_2= ruleAssignmentStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignmentStatement_in_ruleStatement3405);
                    this_AssignmentStatement_2=ruleAssignmentStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignmentStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1812:5: this_JumpStatement_3= ruleJumpStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getJumpStatementParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJumpStatement_in_ruleStatement3432);
                    this_JumpStatement_3=ruleJumpStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JumpStatement_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1821:6: ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1821:6: ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1821:7: () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1821:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1822:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getSymbolRefAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1827:2: ( (otherlv_5= RULE_IDENTIFIER ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1828:1: (otherlv_5= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1828:1: (otherlv_5= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1829:3: otherlv_5= RULE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatementRule());
                      	        }
                              
                    }
                    otherlv_5=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleStatement3467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getSymbolSymbolCrossReference_4_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1840:2: (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==111) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1840:4: otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')'
                            {
                            otherlv_6=(Token)match(input,111,FOLLOW_111_in_ruleStatement3480); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_4_2_0());
                                  
                            }
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1844:1: ( (lv_actuals_7_0= ruleExp ) )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( ((LA15_0>=RULE_INTCONSTANT && LA15_0<=RULE_IDENTIFIER)||(LA15_0>=RULE_VEC2 && LA15_0<=RULE_MAT4X4)||(LA15_0>=RULE_UINTCONSTANT && LA15_0<=RULE_FLOATCONSTANT)||LA15_0==RULE_BOOLCONSTANT||LA15_0==111) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1845:1: (lv_actuals_7_0= ruleExp )
                                    {
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1845:1: (lv_actuals_7_0= ruleExp )
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1846:3: lv_actuals_7_0= ruleExp
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getStatementAccess().getActualsExpParserRuleCall_4_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExp_in_ruleStatement3501);
                                    lv_actuals_7_0=ruleExp();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"actuals",
                                              		lv_actuals_7_0, 
                                              		"Exp");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1862:3: (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==112) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1862:5: otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) )
                            	    {
                            	    otherlv_8=(Token)match(input,112,FOLLOW_112_in_ruleStatement3515); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_8, grammarAccess.getStatementAccess().getCommaKeyword_4_2_2_0());
                            	          
                            	    }
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1866:1: ( (lv_actuals_9_0= ruleExp ) )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1867:1: (lv_actuals_9_0= ruleExp )
                            	    {
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1867:1: (lv_actuals_9_0= ruleExp )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1868:3: lv_actuals_9_0= ruleExp
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStatementAccess().getActualsExpParserRuleCall_4_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExp_in_ruleStatement3536);
                            	    lv_actuals_9_0=ruleExp();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"actuals",
                            	              		lv_actuals_9_0, 
                            	              		"Exp");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,113,FOLLOW_113_in_ruleStatement3550); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_10, grammarAccess.getStatementAccess().getRightParenthesisKeyword_4_2_3());
                                  
                            }

                            }
                            break;

                    }

                    this_SEMICOLON_11=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStatement3563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_11, grammarAccess.getStatementAccess().getSEMICOLONTerminalRuleCall_4_3()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1893:6: ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1893:6: ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1893:7: () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )?
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1893:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1894:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getIfStatementAction_5_0(),
                                  current);
                          
                    }

                    }

                    this_IF_13=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleStatement3590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_IF_13, grammarAccess.getStatementAccess().getIFTerminalRuleCall_5_1()); 
                          
                    }
                    otherlv_14=(Token)match(input,111,FOLLOW_111_in_ruleStatement3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_5_2());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1907:1: ( (lv_condition_15_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1908:1: (lv_condition_15_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1908:1: (lv_condition_15_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1909:3: lv_condition_15_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getConditionExpParserRuleCall_5_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleStatement3622);
                    lv_condition_15_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_15_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,113,FOLLOW_113_in_ruleStatement3634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getRightParenthesisKeyword_5_4());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1929:1: ( (lv_then_17_0= ruleStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1930:1: (lv_then_17_0= ruleStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1930:1: (lv_then_17_0= ruleStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1931:3: lv_then_17_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getThenStatementParserRuleCall_5_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3655);
                    lv_then_17_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_17_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:2: ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ELSE) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred1_InternalGlsl()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:3: ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:3: ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:4: ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE
                            {
                            this_ELSE_18=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleStatement3673); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ELSE_18, grammarAccess.getStatementAccess().getELSETerminalRuleCall_5_6_0()); 
                                  
                            }

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1951:2: ( (lv_else_19_0= ruleStatement ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1952:1: (lv_else_19_0= ruleStatement )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1952:1: (lv_else_19_0= ruleStatement )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1953:3: lv_else_19_0= ruleStatement
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getElseStatementParserRuleCall_5_6_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStatement_in_ruleStatement3694);
                            lv_else_19_0=ruleStatement();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"else",
                                      		lv_else_19_0, 
                                      		"Statement");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1970:6: ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1970:6: ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1970:7: () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1970:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1971:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getWhileStatementAction_6_0(),
                                  current);
                          
                    }

                    }

                    this_WHILE_21=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleStatement3724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_21, grammarAccess.getStatementAccess().getWHILETerminalRuleCall_6_1()); 
                          
                    }
                    otherlv_22=(Token)match(input,111,FOLLOW_111_in_ruleStatement3735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_6_2());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1984:1: ( (lv_condition_23_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1985:1: (lv_condition_23_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1985:1: (lv_condition_23_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1986:3: lv_condition_23_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getConditionExpParserRuleCall_6_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleStatement3756);
                    lv_condition_23_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_23_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_24=(Token)match(input,113,FOLLOW_113_in_ruleStatement3768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getStatementAccess().getRightParenthesisKeyword_6_4());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2006:1: ( (lv_do_25_0= ruleStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2007:1: (lv_do_25_0= ruleStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2007:1: (lv_do_25_0= ruleStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2008:3: lv_do_25_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementParserRuleCall_6_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement3789);
                    lv_do_25_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"do",
                              		lv_do_25_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2025:6: ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2025:6: ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2025:7: () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2025:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2026:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getWhileStatementAction_7_0(),
                                  current);
                          
                    }

                    }

                    this_DO_27=(Token)match(input,RULE_DO,FOLLOW_RULE_DO_in_ruleStatement3817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DO_27, grammarAccess.getStatementAccess().getDOTerminalRuleCall_7_1()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2035:1: ( (lv_do_28_0= ruleBlockStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2036:1: (lv_do_28_0= ruleBlockStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2036:1: (lv_do_28_0= ruleBlockStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2037:3: lv_do_28_0= ruleBlockStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoBlockStatementParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlockStatement_in_ruleStatement3837);
                    lv_do_28_0=ruleBlockStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"do",
                              		lv_do_28_0, 
                              		"BlockStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_WHILE_29=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_ruleStatement3848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_29, grammarAccess.getStatementAccess().getWHILETerminalRuleCall_7_3()); 
                          
                    }
                    otherlv_30=(Token)match(input,111,FOLLOW_111_in_ruleStatement3859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_30, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_7_4());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2061:1: ( (lv_condition_31_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2062:1: (lv_condition_31_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2062:1: (lv_condition_31_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2063:3: lv_condition_31_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getConditionExpParserRuleCall_7_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleStatement3880);
                    lv_condition_31_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_31_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_32=(Token)match(input,113,FOLLOW_113_in_ruleStatement3892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getStatementAccess().getRightParenthesisKeyword_7_6());
                          
                    }
                    this_SEMICOLON_33=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStatement3903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_33, grammarAccess.getStatementAccess().getSEMICOLONTerminalRuleCall_7_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2088:6: ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2088:6: ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2088:7: () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2088:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2089:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getForStatementAction_8_0(),
                                  current);
                          
                    }

                    }

                    this_FOR_35=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_ruleStatement3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_35, grammarAccess.getStatementAccess().getFORTerminalRuleCall_8_1()); 
                          
                    }
                    otherlv_36=(Token)match(input,111,FOLLOW_111_in_ruleStatement3941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_8_2());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2102:1: ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2103:1: ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2103:1: ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2104:1: (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2104:1: (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration )
                    int alt19=2;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2105:3: lv_a_37_1= ruleExp
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getAExpParserRuleCall_8_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExp_in_ruleStatement3964);
                            lv_a_37_1=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"a",
                                      		lv_a_37_1, 
                                      		"Exp");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2120:8: lv_a_37_2= ruleDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getADeclarationParserRuleCall_8_3_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleDeclaration_in_ruleStatement3983);
                            lv_a_37_2=ruleDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"a",
                                      		lv_a_37_2, 
                                      		"Declaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStatement3997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_38, grammarAccess.getStatementAccess().getSEMICOLONTerminalRuleCall_8_4()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2142:1: ( (lv_b_39_0= ruleExp ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_INTCONSTANT && LA20_0<=RULE_IDENTIFIER)||(LA20_0>=RULE_VEC2 && LA20_0<=RULE_MAT4X4)||(LA20_0>=RULE_UINTCONSTANT && LA20_0<=RULE_FLOATCONSTANT)||LA20_0==RULE_BOOLCONSTANT||LA20_0==111) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2143:1: (lv_b_39_0= ruleExp )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2143:1: (lv_b_39_0= ruleExp )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2144:3: lv_b_39_0= ruleExp
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getBExpParserRuleCall_8_5_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExp_in_ruleStatement4017);
                            lv_b_39_0=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"b",
                                      		lv_b_39_0, 
                                      		"Exp");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_SEMICOLON_40=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleStatement4029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_40, grammarAccess.getStatementAccess().getSEMICOLONTerminalRuleCall_8_6()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2164:1: ( (lv_c_41_0= ruleExp ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=RULE_INTCONSTANT && LA21_0<=RULE_IDENTIFIER)||(LA21_0>=RULE_VEC2 && LA21_0<=RULE_MAT4X4)||(LA21_0>=RULE_UINTCONSTANT && LA21_0<=RULE_FLOATCONSTANT)||LA21_0==RULE_BOOLCONSTANT||LA21_0==111) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2165:1: (lv_c_41_0= ruleExp )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2165:1: (lv_c_41_0= ruleExp )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2166:3: lv_c_41_0= ruleExp
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStatementAccess().getCExpParserRuleCall_8_7_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExp_in_ruleStatement4049);
                            lv_c_41_0=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"c",
                                      		lv_c_41_0, 
                                      		"Exp");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_42=(Token)match(input,113,FOLLOW_113_in_ruleStatement4062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getStatementAccess().getRightParenthesisKeyword_8_8());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2186:1: ( (lv_do_43_0= ruleStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2187:1: (lv_do_43_0= ruleStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2187:1: (lv_do_43_0= ruleStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2188:3: lv_do_43_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getDoStatementParserRuleCall_8_9_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleStatement4083);
                    lv_do_43_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"do",
                              		lv_do_43_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2205:6: ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2205:6: ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2205:7: () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2205:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2206:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getStatementAccess().getSwitchStatementAction_9_0(),
                                  current);
                          
                    }

                    }

                    this_SWITCH_45=(Token)match(input,RULE_SWITCH,FOLLOW_RULE_SWITCH_in_ruleStatement4111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SWITCH_45, grammarAccess.getStatementAccess().getSWITCHTerminalRuleCall_9_1()); 
                          
                    }
                    otherlv_46=(Token)match(input,111,FOLLOW_111_in_ruleStatement4122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_46, grammarAccess.getStatementAccess().getLeftParenthesisKeyword_9_2());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2219:1: ( (lv_a_47_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2220:1: (lv_a_47_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2220:1: (lv_a_47_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2221:3: lv_a_47_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getAExpParserRuleCall_9_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleStatement4143);
                    lv_a_47_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"a",
                              		lv_a_47_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_48=(Token)match(input,113,FOLLOW_113_in_ruleStatement4155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_48, grammarAccess.getStatementAccess().getRightParenthesisKeyword_9_4());
                          
                    }
                    this_LEFT_BRACE_49=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_ruleStatement4166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LEFT_BRACE_49, grammarAccess.getStatementAccess().getLEFT_BRACETerminalRuleCall_9_5()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2245:1: ( (lv_cases_50_0= ruleSwitchCase ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2246:1: (lv_cases_50_0= ruleSwitchCase )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2246:1: (lv_cases_50_0= ruleSwitchCase )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2247:3: lv_cases_50_0= ruleSwitchCase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementAccess().getCasesSwitchCaseParserRuleCall_9_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchCase_in_ruleStatement4186);
                    lv_cases_50_0=ruleSwitchCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementRule());
                      	        }
                             		add(
                             			current, 
                             			"cases",
                              		lv_cases_50_0, 
                              		"SwitchCase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RIGHT_BRACE_51=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_ruleStatement4197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RIGHT_BRACE_51, grammarAccess.getStatementAccess().getRIGHT_BRACETerminalRuleCall_9_7()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSwitchCase"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2275:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2276:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2277:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase4233);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase4243); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2284:1: ruleSwitchCase returns [EObject current=null] : ( (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) ) | (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token this_CASE_0=null;
        Token lv_case_1_0=null;
        Token lv_case_2_0=null;
        Token lv_fcase_3_0=null;
        Token this_COLON_4=null;
        Token this_DEFAULT_6=null;
        Token this_COLON_7=null;
        EObject lv_then_5_0 = null;

        EObject lv_then_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2287:28: ( ( (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) ) | (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2288:1: ( (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) ) | (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2288:1: ( (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) ) | (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_CASE) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_DEFAULT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2288:2: (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2288:2: (this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2288:3: this_CASE_0= RULE_CASE ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) ) this_COLON_4= RULE_COLON ( (lv_then_5_0= ruleStatement ) )
                    {
                    this_CASE_0=(Token)match(input,RULE_CASE,FOLLOW_RULE_CASE_in_ruleSwitchCase4280); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CASE_0, grammarAccess.getSwitchCaseAccess().getCASETerminalRuleCall_0_0()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2292:1: ( ( (lv_case_1_0= RULE_INTCONSTANT ) ) | ( (lv_case_2_0= RULE_UINTCONSTANT ) ) | ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) ) )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case RULE_INTCONSTANT:
                        {
                        alt23=1;
                        }
                        break;
                    case RULE_UINTCONSTANT:
                        {
                        alt23=2;
                        }
                        break;
                    case RULE_FLOATCONSTANT:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2292:2: ( (lv_case_1_0= RULE_INTCONSTANT ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2292:2: ( (lv_case_1_0= RULE_INTCONSTANT ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2293:1: (lv_case_1_0= RULE_INTCONSTANT )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2293:1: (lv_case_1_0= RULE_INTCONSTANT )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2294:3: lv_case_1_0= RULE_INTCONSTANT
                            {
                            lv_case_1_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleSwitchCase4297); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_1_0, grammarAccess.getSwitchCaseAccess().getCaseINTCONSTANTTerminalRuleCall_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSwitchCaseRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_1_0, 
                                      		"INTCONSTANT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2311:6: ( (lv_case_2_0= RULE_UINTCONSTANT ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2311:6: ( (lv_case_2_0= RULE_UINTCONSTANT ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2312:1: (lv_case_2_0= RULE_UINTCONSTANT )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2312:1: (lv_case_2_0= RULE_UINTCONSTANT )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2313:3: lv_case_2_0= RULE_UINTCONSTANT
                            {
                            lv_case_2_0=(Token)match(input,RULE_UINTCONSTANT,FOLLOW_RULE_UINTCONSTANT_in_ruleSwitchCase4325); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_case_2_0, grammarAccess.getSwitchCaseAccess().getCaseUINTCONSTANTTerminalRuleCall_0_1_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSwitchCaseRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"case",
                                      		lv_case_2_0, 
                                      		"UINTCONSTANT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2330:6: ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2330:6: ( (lv_fcase_3_0= RULE_FLOATCONSTANT ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2331:1: (lv_fcase_3_0= RULE_FLOATCONSTANT )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2331:1: (lv_fcase_3_0= RULE_FLOATCONSTANT )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2332:3: lv_fcase_3_0= RULE_FLOATCONSTANT
                            {
                            lv_fcase_3_0=(Token)match(input,RULE_FLOATCONSTANT,FOLLOW_RULE_FLOATCONSTANT_in_ruleSwitchCase4353); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_fcase_3_0, grammarAccess.getSwitchCaseAccess().getFcaseFLOATCONSTANTTerminalRuleCall_0_1_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSwitchCaseRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"fcase",
                                      		lv_fcase_3_0, 
                                      		"FLOATCONSTANT");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitchCase4370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getSwitchCaseAccess().getCOLONTerminalRuleCall_0_2()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2352:1: ( (lv_then_5_0= ruleStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2353:1: (lv_then_5_0= ruleStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2353:1: (lv_then_5_0= ruleStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2354:3: lv_then_5_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getThenStatementParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleSwitchCase4390);
                    lv_then_5_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_5_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2371:6: (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2371:6: (this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2371:7: this_DEFAULT_6= RULE_DEFAULT this_COLON_7= RULE_COLON ( (lv_then_8_0= ruleStatement ) )
                    {
                    this_DEFAULT_6=(Token)match(input,RULE_DEFAULT,FOLLOW_RULE_DEFAULT_in_ruleSwitchCase4409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DEFAULT_6, grammarAccess.getSwitchCaseAccess().getDEFAULTTerminalRuleCall_1_0()); 
                          
                    }
                    this_COLON_7=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleSwitchCase4419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_7, grammarAccess.getSwitchCaseAccess().getCOLONTerminalRuleCall_1_1()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2379:1: ( (lv_then_8_0= ruleStatement ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2380:1: (lv_then_8_0= ruleStatement )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2380:1: (lv_then_8_0= ruleStatement )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2381:3: lv_then_8_0= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getThenStatementParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleSwitchCase4439);
                    lv_then_8_0=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_8_0, 
                              		"Statement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleBlockStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2405:1: entryRuleBlockStatement returns [EObject current=null] : iv_ruleBlockStatement= ruleBlockStatement EOF ;
    public final EObject entryRuleBlockStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockStatement = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2406:2: (iv_ruleBlockStatement= ruleBlockStatement EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2407:2: iv_ruleBlockStatement= ruleBlockStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockStatementRule()); 
            }
            pushFollow(FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement4476);
            iv_ruleBlockStatement=ruleBlockStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlockStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockStatement4486); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockStatement"


    // $ANTLR start "ruleBlockStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2414:1: ruleBlockStatement returns [EObject current=null] : (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_statements_1_0= ruleStatement ) )* this_RIGHT_BRACE_2= RULE_RIGHT_BRACE ) ;
    public final EObject ruleBlockStatement() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACE_0=null;
        Token this_RIGHT_BRACE_2=null;
        EObject lv_statements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2417:28: ( (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_statements_1_0= ruleStatement ) )* this_RIGHT_BRACE_2= RULE_RIGHT_BRACE ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2418:1: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_statements_1_0= ruleStatement ) )* this_RIGHT_BRACE_2= RULE_RIGHT_BRACE )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2418:1: (this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_statements_1_0= ruleStatement ) )* this_RIGHT_BRACE_2= RULE_RIGHT_BRACE )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2418:2: this_LEFT_BRACE_0= RULE_LEFT_BRACE ( (lv_statements_1_0= ruleStatement ) )* this_RIGHT_BRACE_2= RULE_RIGHT_BRACE
            {
            this_LEFT_BRACE_0=(Token)match(input,RULE_LEFT_BRACE,FOLLOW_RULE_LEFT_BRACE_in_ruleBlockStatement4522); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEFT_BRACE_0, grammarAccess.getBlockStatementAccess().getLEFT_BRACETerminalRuleCall_0()); 
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2422:1: ( (lv_statements_1_0= ruleStatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_IDENTIFIER||(LA25_0>=RULE_VOID && LA25_0<=RULE_LEFT_BRACE)||LA25_0==RULE_IF||(LA25_0>=RULE_WHILE && LA25_0<=RULE_SWITCH)||(LA25_0>=RULE_CONTINUE && LA25_0<=RULE_DISCARD)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2423:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2423:1: (lv_statements_1_0= ruleStatement )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2424:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockStatementAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlockStatement4542);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockStatementRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            this_RIGHT_BRACE_2=(Token)match(input,RULE_RIGHT_BRACE,FOLLOW_RULE_RIGHT_BRACE_in_ruleBlockStatement4554); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RIGHT_BRACE_2, grammarAccess.getBlockStatementAccess().getRIGHT_BRACETerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockStatement"


    // $ANTLR start "entryRuleJumpStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2452:1: entryRuleJumpStatement returns [EObject current=null] : iv_ruleJumpStatement= ruleJumpStatement EOF ;
    public final EObject entryRuleJumpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpStatement = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2453:2: (iv_ruleJumpStatement= ruleJumpStatement EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2454:2: iv_ruleJumpStatement= ruleJumpStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJumpStatementRule()); 
            }
            pushFollow(FOLLOW_ruleJumpStatement_in_entryRuleJumpStatement4589);
            iv_ruleJumpStatement=ruleJumpStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJumpStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpStatement4599); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJumpStatement"


    // $ANTLR start "ruleJumpStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2461:1: ruleJumpStatement returns [EObject current=null] : ( (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON ) | (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON ) | ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON ) | ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON ) | (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON ) ) ;
    public final EObject ruleJumpStatement() throws RecognitionException {
        EObject current = null;

        Token this_CONTINUE_0=null;
        Token this_SEMICOLON_1=null;
        Token this_BREAK_2=null;
        Token this_SEMICOLON_3=null;
        Token this_RETURN_5=null;
        Token this_SEMICOLON_6=null;
        Token this_RETURN_8=null;
        Token this_SEMICOLON_10=null;
        Token this_DISCARD_11=null;
        Token this_SEMICOLON_12=null;
        EObject lv_value_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2464:28: ( ( (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON ) | (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON ) | ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON ) | ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON ) | (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2465:1: ( (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON ) | (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON ) | ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON ) | ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON ) | (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2465:1: ( (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON ) | (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON ) | ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON ) | ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON ) | (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case RULE_CONTINUE:
                {
                alt26=1;
                }
                break;
            case RULE_BREAK:
                {
                alt26=2;
                }
                break;
            case RULE_RETURN:
                {
                int LA26_3 = input.LA(2);

                if ( (LA26_3==RULE_SEMICOLON) ) {
                    alt26=3;
                }
                else if ( ((LA26_3>=RULE_INTCONSTANT && LA26_3<=RULE_IDENTIFIER)||(LA26_3>=RULE_VEC2 && LA26_3<=RULE_MAT4X4)||(LA26_3>=RULE_UINTCONSTANT && LA26_3<=RULE_FLOATCONSTANT)||LA26_3==RULE_BOOLCONSTANT||LA26_3==111) ) {
                    alt26=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DISCARD:
                {
                alt26=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2465:2: (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2465:2: (this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2465:3: this_CONTINUE_0= RULE_CONTINUE this_SEMICOLON_1= RULE_SEMICOLON
                    {
                    this_CONTINUE_0=(Token)match(input,RULE_CONTINUE,FOLLOW_RULE_CONTINUE_in_ruleJumpStatement4636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CONTINUE_0, grammarAccess.getJumpStatementAccess().getCONTINUETerminalRuleCall_0_0()); 
                          
                    }
                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2474:6: (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2474:6: (this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2474:7: this_BREAK_2= RULE_BREAK this_SEMICOLON_3= RULE_SEMICOLON
                    {
                    this_BREAK_2=(Token)match(input,RULE_BREAK,FOLLOW_RULE_BREAK_in_ruleJumpStatement4664); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BREAK_2, grammarAccess.getJumpStatementAccess().getBREAKTerminalRuleCall_1_0()); 
                          
                    }
                    this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_3, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2483:6: ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2483:6: ( () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2483:7: () this_RETURN_5= RULE_RETURN this_SEMICOLON_6= RULE_SEMICOLON
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2483:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2484:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJumpStatementAccess().getReturnAction_2_0(),
                                  current);
                          
                    }

                    }

                    this_RETURN_5=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_ruleJumpStatement4701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_5, grammarAccess.getJumpStatementAccess().getRETURNTerminalRuleCall_2_1()); 
                          
                    }
                    this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_6, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2498:6: ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2498:6: ( () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2498:7: () this_RETURN_8= RULE_RETURN ( (lv_value_9_0= ruleExp ) ) this_SEMICOLON_10= RULE_SEMICOLON
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2498:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2499:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getJumpStatementAccess().getReturnAction_3_0(),
                                  current);
                          
                    }

                    }

                    this_RETURN_8=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_ruleJumpStatement4738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RETURN_8, grammarAccess.getJumpStatementAccess().getRETURNTerminalRuleCall_3_1()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2508:1: ( (lv_value_9_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2509:1: (lv_value_9_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2509:1: (lv_value_9_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2510:3: lv_value_9_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJumpStatementAccess().getValueExpParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleJumpStatement4758);
                    lv_value_9_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJumpStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_9_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_10, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_3_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2531:6: (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2531:6: (this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2531:7: this_DISCARD_11= RULE_DISCARD this_SEMICOLON_12= RULE_SEMICOLON
                    {
                    this_DISCARD_11=(Token)match(input,RULE_DISCARD,FOLLOW_RULE_DISCARD_in_ruleJumpStatement4787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DISCARD_11, grammarAccess.getJumpStatementAccess().getDISCARDTerminalRuleCall_4_0()); 
                          
                    }
                    this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_12, grammarAccess.getJumpStatementAccess().getSEMICOLONTerminalRuleCall_4_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJumpStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2547:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2548:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2549:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4833);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4843); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2556:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )? this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_SEMICOLON_4=null;
        EObject lv_type_0_0 = null;

        EObject lv_init_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2559:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )? this_SEMICOLON_4= RULE_SEMICOLON ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2560:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2560:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2560:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_IDENTIFIER ) ) (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )? this_SEMICOLON_4= RULE_SEMICOLON
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2560:2: ( (lv_type_0_0= ruleType ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2561:1: (lv_type_0_0= ruleType )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2561:1: (lv_type_0_0= ruleType )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2562:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration4889);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2578:2: ( (lv_name_1_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2579:1: (lv_name_1_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2579:1: (lv_name_1_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2580:3: lv_name_1_0= RULE_IDENTIFIER
            {
            lv_name_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleVariableDeclaration4906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2596:2: (otherlv_2= '=' ( (lv_init_3_0= ruleExp ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==114) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2596:4: otherlv_2= '=' ( (lv_init_3_0= ruleExp ) )
                    {
                    otherlv_2=(Token)match(input,114,FOLLOW_114_in_ruleVariableDeclaration4924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2600:1: ( (lv_init_3_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2601:1: (lv_init_3_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2601:1: (lv_init_3_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2602:3: lv_init_3_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInitExpParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleVariableDeclaration4945);
                    lv_init_3_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_3_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleVariableDeclaration4958); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_4, grammarAccess.getVariableDeclarationAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleAssignmentStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2630:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2631:2: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2632:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            }
            pushFollow(FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement4993);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentStatement5003); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2639:1: ruleAssignmentStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENTIFIER ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExp ) ) this_SEMICOLON_3= RULE_SEMICOLON ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token this_SEMICOLON_3=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2642:28: ( ( ( (otherlv_0= RULE_IDENTIFIER ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExp ) ) this_SEMICOLON_3= RULE_SEMICOLON ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2643:1: ( ( (otherlv_0= RULE_IDENTIFIER ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExp ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2643:1: ( ( (otherlv_0= RULE_IDENTIFIER ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExp ) ) this_SEMICOLON_3= RULE_SEMICOLON )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2643:2: ( (otherlv_0= RULE_IDENTIFIER ) ) otherlv_1= '=' ( (lv_right_2_0= ruleExp ) ) this_SEMICOLON_3= RULE_SEMICOLON
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2643:2: ( (otherlv_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2644:1: (otherlv_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2644:1: (otherlv_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2645:3: otherlv_0= RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentStatementRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleAssignmentStatement5048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentStatementAccess().getVariableSymbolCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,114,FOLLOW_114_in_ruleAssignmentStatement5060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2660:1: ( (lv_right_2_0= ruleExp ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2661:1: (lv_right_2_0= ruleExp )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2661:1: (lv_right_2_0= ruleExp )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2662:3: lv_right_2_0= ruleExp
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentStatementAccess().getRightExpParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExp_in_ruleAssignmentStatement5081);
            lv_right_2_0=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"Exp");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_SEMICOLON_3=(Token)match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_ruleAssignmentStatement5092); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SEMICOLON_3, grammarAccess.getAssignmentStatementAccess().getSEMICOLONTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2690:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2691:2: (iv_ruleExp= ruleExp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2692:2: iv_ruleExp= ruleExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpRule()); 
            }
            pushFollow(FOLLOW_ruleExp_in_entryRuleExp5127);
            iv_ruleExp=ruleExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExp5137); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2699:1: ruleExp returns [EObject current=null] : (this_LogicExp_0= ruleLogicExp ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )? ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token this_QUESTION_2=null;
        Token this_COLON_4=null;
        EObject this_LogicExp_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2702:28: ( (this_LogicExp_0= ruleLogicExp ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )? ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2703:1: (this_LogicExp_0= ruleLogicExp ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )? )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2703:1: (this_LogicExp_0= ruleLogicExp ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )? )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2704:5: this_LogicExp_0= ruleLogicExp ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpAccess().getLogicExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicExp_in_ruleExp5184);
            this_LogicExp_0=ruleLogicExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2712:1: ( () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_QUESTION) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2712:2: () ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION ) ( (lv_then_3_0= ruleExp ) ) this_COLON_4= RULE_COLON ( (lv_else_5_0= ruleExp ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2712:2: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2713:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2718:2: ( ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2718:3: ( RULE_QUESTION )=>this_QUESTION_2= RULE_QUESTION
                    {
                    this_QUESTION_2=(Token)match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleExp5210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_QUESTION_2, grammarAccess.getExpAccess().getQUESTIONTerminalRuleCall_1_1()); 
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2722:2: ( (lv_then_3_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2723:1: (lv_then_3_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2723:1: (lv_then_3_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2724:3: lv_then_3_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpAccess().getThenExpParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleExp5231);
                    lv_then_3_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_3_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleExp5242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_4, grammarAccess.getExpAccess().getCOLONTerminalRuleCall_1_3()); 
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2744:1: ( (lv_else_5_0= ruleExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2745:1: (lv_else_5_0= ruleExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2745:1: (lv_else_5_0= ruleExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2746:3: lv_else_5_0= ruleExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpAccess().getElseExpParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleExp5262);
                    lv_else_5_0=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_5_0, 
                              		"Exp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleLogicExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2770:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2771:2: (iv_ruleLogicExp= ruleLogicExp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2772:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicExpRule()); 
            }
            pushFollow(FOLLOW_ruleLogicExp_in_entryRuleLogicExp5300);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExp5310); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2779:1: ruleLogicExp returns [EObject current=null] : (this_AddExp_0= ruleAddExp ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )? ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject this_AddExp_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2782:28: ( (this_AddExp_0= ruleAddExp ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )? ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2783:1: (this_AddExp_0= ruleAddExp ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )? )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2783:1: (this_AddExp_0= ruleAddExp ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )? )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2784:5: this_AddExp_0= ruleAddExp ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicExpAccess().getAddExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddExp_in_ruleLogicExp5357);
            this_AddExp_0=ruleAddExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AddExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2792:1: ( () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=120 && LA29_0<=125)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2792:2: () ( (lv_op_2_0= ruleLogicOp ) ) ( (lv_right_3_0= ruleAddExp ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2792:2: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2793:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2798:2: ( (lv_op_2_0= ruleLogicOp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2799:1: (lv_op_2_0= ruleLogicOp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2799:1: (lv_op_2_0= ruleLogicOp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2800:3: lv_op_2_0= ruleLogicOp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicExpAccess().getOpLogicOpEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicOp_in_ruleLogicExp5387);
                    lv_op_2_0=ruleLogicOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicExpRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_2_0, 
                              		"LogicOp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2816:2: ( (lv_right_3_0= ruleAddExp ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2817:1: (lv_right_3_0= ruleAddExp )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2817:1: (lv_right_3_0= ruleAddExp )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2818:3: lv_right_3_0= ruleAddExp
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicExpAccess().getRightAddExpParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddExp_in_ruleLogicExp5408);
                    lv_right_3_0=ruleAddExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicExpRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"AddExp");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleAddExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2842:1: entryRuleAddExp returns [EObject current=null] : iv_ruleAddExp= ruleAddExp EOF ;
    public final EObject entryRuleAddExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2843:2: (iv_ruleAddExp= ruleAddExp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2844:2: iv_ruleAddExp= ruleAddExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpRule()); 
            }
            pushFollow(FOLLOW_ruleAddExp_in_entryRuleAddExp5446);
            iv_ruleAddExp=ruleAddExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExp5456); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExp"


    // $ANTLR start "ruleAddExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2851:1: ruleAddExp returns [EObject current=null] : (this_MulExp_0= ruleMulExp ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )* ) ;
    public final EObject ruleAddExp() throws RecognitionException {
        EObject current = null;

        EObject this_MulExp_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2854:28: ( (this_MulExp_0= ruleMulExp ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )* ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2855:1: (this_MulExp_0= ruleMulExp ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )* )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2855:1: (this_MulExp_0= ruleMulExp ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )* )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2856:5: this_MulExp_0= ruleMulExp ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpAccess().getMulExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMulExp_in_ruleAddExp5503);
            this_MulExp_0=ruleMulExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MulExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2864:1: ( () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_PLUS && LA30_0<=RULE_DASH)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2864:2: () ( (lv_op_2_0= ruleAddOp ) ) ( (lv_right_3_0= ruleMulExp ) )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2864:2: ()
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2865:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2870:2: ( (lv_op_2_0= ruleAddOp ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2871:1: (lv_op_2_0= ruleAddOp )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2871:1: (lv_op_2_0= ruleAddOp )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2872:3: lv_op_2_0= ruleAddOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpAccess().getOpAddOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddOp_in_ruleAddExp5533);
            	    lv_op_2_0=ruleAddOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"AddOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2888:2: ( (lv_right_3_0= ruleMulExp ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2889:1: (lv_right_3_0= ruleMulExp )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2889:1: (lv_right_3_0= ruleMulExp )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2890:3: lv_right_3_0= ruleMulExp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpAccess().getRightMulExpParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulExp_in_ruleAddExp5554);
            	    lv_right_3_0=ruleMulExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAddExpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MulExp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExp"


    // $ANTLR start "entryRuleAddOp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2914:1: entryRuleAddOp returns [String current=null] : iv_ruleAddOp= ruleAddOp EOF ;
    public final String entryRuleAddOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddOp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2915:2: (iv_ruleAddOp= ruleAddOp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2916:2: iv_ruleAddOp= ruleAddOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddOpRule()); 
            }
            pushFollow(FOLLOW_ruleAddOp_in_entryRuleAddOp5593);
            iv_ruleAddOp=ruleAddOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddOp5604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddOp"


    // $ANTLR start "ruleAddOp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2923:1: ruleAddOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH ) ;
    public final AntlrDatatypeRuleToken ruleAddOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2926:28: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2927:1: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2927:1: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_PLUS) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_DASH) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2927:6: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleAddOp5644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PLUS_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_0, grammarAccess.getAddOpAccess().getPLUSTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2935:10: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FOLLOW_RULE_DASH_in_ruleAddOp5670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DASH_1, grammarAccess.getAddOpAccess().getDASHTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddOp"


    // $ANTLR start "entryRuleMulExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2950:1: entryRuleMulExp returns [EObject current=null] : iv_ruleMulExp= ruleMulExp EOF ;
    public final EObject entryRuleMulExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2951:2: (iv_ruleMulExp= ruleMulExp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2952:2: iv_ruleMulExp= ruleMulExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExpRule()); 
            }
            pushFollow(FOLLOW_ruleMulExp_in_entryRuleMulExp5715);
            iv_ruleMulExp=ruleMulExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulExp5725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulExp"


    // $ANTLR start "ruleMulExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2959:1: ruleMulExp returns [EObject current=null] : (this_PostfixExp_0= rulePostfixExp ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )* ) ;
    public final EObject ruleMulExp() throws RecognitionException {
        EObject current = null;

        EObject this_PostfixExp_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2962:28: ( (this_PostfixExp_0= rulePostfixExp ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )* ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2963:1: (this_PostfixExp_0= rulePostfixExp ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )* )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2963:1: (this_PostfixExp_0= rulePostfixExp ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )* )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2964:5: this_PostfixExp_0= rulePostfixExp ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMulExpAccess().getPostfixExpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePostfixExp_in_ruleMulExp5772);
            this_PostfixExp_0=rulePostfixExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PostfixExp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2972:1: ( () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STAR && LA32_0<=RULE_PERCENT)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2972:2: () ( (lv_op_2_0= ruleMulOp ) ) ( (lv_right_3_0= rulePostfixExp ) )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2972:2: ()
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2973:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2978:2: ( (lv_op_2_0= ruleMulOp ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2979:1: (lv_op_2_0= ruleMulOp )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2979:1: (lv_op_2_0= ruleMulOp )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2980:3: lv_op_2_0= ruleMulOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulExpAccess().getOpMulOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOp_in_ruleMulExp5802);
            	    lv_op_2_0=ruleMulOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMulExpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"op",
            	              		lv_op_2_0, 
            	              		"MulOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2996:2: ( (lv_right_3_0= rulePostfixExp ) )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2997:1: (lv_right_3_0= rulePostfixExp )
            	    {
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2997:1: (lv_right_3_0= rulePostfixExp )
            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:2998:3: lv_right_3_0= rulePostfixExp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulExpAccess().getRightPostfixExpParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePostfixExp_in_ruleMulExp5823);
            	    lv_right_3_0=rulePostfixExp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMulExpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PostfixExp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulExp"


    // $ANTLR start "entryRuleMulOp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3022:1: entryRuleMulOp returns [String current=null] : iv_ruleMulOp= ruleMulOp EOF ;
    public final String entryRuleMulOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMulOp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3023:2: (iv_ruleMulOp= ruleMulOp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3024:2: iv_ruleMulOp= ruleMulOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOpRule()); 
            }
            pushFollow(FOLLOW_ruleMulOp_in_entryRuleMulOp5862);
            iv_ruleMulOp=ruleMulOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOp.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOp5873); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOp"


    // $ANTLR start "ruleMulOp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3031:1: ruleMulOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_PERCENT_2= RULE_PERCENT ) ;
    public final AntlrDatatypeRuleToken ruleMulOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STAR_0=null;
        Token this_SLASH_1=null;
        Token this_PERCENT_2=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3034:28: ( (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_PERCENT_2= RULE_PERCENT ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3035:1: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_PERCENT_2= RULE_PERCENT )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3035:1: (this_STAR_0= RULE_STAR | this_SLASH_1= RULE_SLASH | this_PERCENT_2= RULE_PERCENT )
            int alt33=3;
            switch ( input.LA(1) ) {
            case RULE_STAR:
                {
                alt33=1;
                }
                break;
            case RULE_SLASH:
                {
                alt33=2;
                }
                break;
            case RULE_PERCENT:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3035:6: this_STAR_0= RULE_STAR
                    {
                    this_STAR_0=(Token)match(input,RULE_STAR,FOLLOW_RULE_STAR_in_ruleMulOp5913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STAR_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STAR_0, grammarAccess.getMulOpAccess().getSTARTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3043:10: this_SLASH_1= RULE_SLASH
                    {
                    this_SLASH_1=(Token)match(input,RULE_SLASH,FOLLOW_RULE_SLASH_in_ruleMulOp5939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SLASH_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SLASH_1, grammarAccess.getMulOpAccess().getSLASHTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3051:10: this_PERCENT_2= RULE_PERCENT
                    {
                    this_PERCENT_2=(Token)match(input,RULE_PERCENT,FOLLOW_RULE_PERCENT_in_ruleMulOp5965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PERCENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PERCENT_2, grammarAccess.getMulOpAccess().getPERCENTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOp"


    // $ANTLR start "entryRulePostfixExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3066:1: entryRulePostfixExp returns [EObject current=null] : iv_rulePostfixExp= rulePostfixExp EOF ;
    public final EObject entryRulePostfixExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixExp = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3067:2: (iv_rulePostfixExp= rulePostfixExp EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3068:2: iv_rulePostfixExp= rulePostfixExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixExpRule()); 
            }
            pushFollow(FOLLOW_rulePostfixExp_in_entryRulePostfixExp6010);
            iv_rulePostfixExp=rulePostfixExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixExp6020); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixExp"


    // $ANTLR start "rulePostfixExp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3075:1: rulePostfixExp returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? ) | this_Atomic_11= ruleAtomic ) ;
    public final EObject rulePostfixExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_member_10_1=null;
        Token lv_member_10_2=null;
        Token lv_member_10_3=null;
        Token lv_member_10_4=null;
        EObject lv_actuals_4_0 = null;

        EObject lv_actuals_6_0 = null;

        EObject this_Atomic_11 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3078:28: ( ( ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? ) | this_Atomic_11= ruleAtomic ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:1: ( ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? ) | this_Atomic_11= ruleAtomic )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:1: ( ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? ) | this_Atomic_11= ruleAtomic )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_IDENTIFIER) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_INTCONSTANT||(LA38_0>=RULE_VEC2 && LA38_0<=RULE_MAT4X4)||(LA38_0>=RULE_UINTCONSTANT && LA38_0<=RULE_FLOATCONSTANT)||LA38_0==RULE_BOOLCONSTANT||LA38_0==111) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:2: ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:2: ( () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )? )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:3: () ( (otherlv_1= RULE_IDENTIFIER ) ) ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )?
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3079:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3080:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPostfixExpAccess().getSymbolRefAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3085:2: ( (otherlv_1= RULE_IDENTIFIER ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3086:1: (otherlv_1= RULE_IDENTIFIER )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3086:1: (otherlv_1= RULE_IDENTIFIER )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3087:3: otherlv_1= RULE_IDENTIFIER
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPostfixExpRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rulePostfixExp6075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getPostfixExpAccess().getSymbolSymbolCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3098:2: ( ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' ) | ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) ) )?
                    int alt37=3;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==111) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==115) ) {
                        alt37=2;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3098:3: ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3098:3: ( () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')' )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3098:4: () ( ( '(' )=>otherlv_3= '(' ) ( (lv_actuals_4_0= ruleExp ) )? (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )* otherlv_7= ')'
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3098:4: ()
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3099:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getPostfixExpAccess().getSymbolRefInvocationSymbolrefAction_0_2_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3104:2: ( ( '(' )=>otherlv_3= '(' )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3104:3: ( '(' )=>otherlv_3= '('
                            {
                            otherlv_3=(Token)match(input,111,FOLLOW_111_in_rulePostfixExp6106); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getPostfixExpAccess().getLeftParenthesisKeyword_0_2_0_1());
                                  
                            }

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3109:2: ( (lv_actuals_4_0= ruleExp ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( ((LA34_0>=RULE_INTCONSTANT && LA34_0<=RULE_IDENTIFIER)||(LA34_0>=RULE_VEC2 && LA34_0<=RULE_MAT4X4)||(LA34_0>=RULE_UINTCONSTANT && LA34_0<=RULE_FLOATCONSTANT)||LA34_0==RULE_BOOLCONSTANT||LA34_0==111) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3110:1: (lv_actuals_4_0= ruleExp )
                                    {
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3110:1: (lv_actuals_4_0= ruleExp )
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3111:3: lv_actuals_4_0= ruleExp
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPostfixExpAccess().getActualsExpParserRuleCall_0_2_0_2_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExp_in_rulePostfixExp6128);
                                    lv_actuals_4_0=ruleExp();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPostfixExpRule());
                                      	        }
                                             		add(
                                             			current, 
                                             			"actuals",
                                              		lv_actuals_4_0, 
                                              		"Exp");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3127:3: (otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==112) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3127:5: otherlv_5= ',' ( (lv_actuals_6_0= ruleExp ) )
                            	    {
                            	    otherlv_5=(Token)match(input,112,FOLLOW_112_in_rulePostfixExp6142); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_5, grammarAccess.getPostfixExpAccess().getCommaKeyword_0_2_0_3_0());
                            	          
                            	    }
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3131:1: ( (lv_actuals_6_0= ruleExp ) )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3132:1: (lv_actuals_6_0= ruleExp )
                            	    {
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3132:1: (lv_actuals_6_0= ruleExp )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3133:3: lv_actuals_6_0= ruleExp
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getPostfixExpAccess().getActualsExpParserRuleCall_0_2_0_3_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExp_in_rulePostfixExp6163);
                            	    lv_actuals_6_0=ruleExp();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getPostfixExpRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"actuals",
                            	              		lv_actuals_6_0, 
                            	              		"Exp");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,113,FOLLOW_113_in_rulePostfixExp6177); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getPostfixExpAccess().getRightParenthesisKeyword_0_2_0_4());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3154:6: ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3154:6: ( () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3154:7: () ( ( '.' )=>otherlv_9= '.' ) ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3154:7: ()
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3155:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getPostfixExpAccess().getSymbolRefMemberSymbolrefAction_0_2_1_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3160:2: ( ( '.' )=>otherlv_9= '.' )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3160:3: ( '.' )=>otherlv_9= '.'
                            {
                            otherlv_9=(Token)match(input,115,FOLLOW_115_in_rulePostfixExp6214); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getPostfixExpAccess().getFullStopKeyword_0_2_1_1());
                                  
                            }

                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3165:2: ( ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3166:1: ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3166:1: ( (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3167:1: (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3167:1: (lv_member_10_1= 'x' | lv_member_10_2= 'y' | lv_member_10_3= 'z' | lv_member_10_4= 'w' )
                            int alt36=4;
                            switch ( input.LA(1) ) {
                            case 116:
                                {
                                alt36=1;
                                }
                                break;
                            case 117:
                                {
                                alt36=2;
                                }
                                break;
                            case 118:
                                {
                                alt36=3;
                                }
                                break;
                            case 119:
                                {
                                alt36=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 36, 0, input);

                                throw nvae;
                            }

                            switch (alt36) {
                                case 1 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3168:3: lv_member_10_1= 'x'
                                    {
                                    lv_member_10_1=(Token)match(input,116,FOLLOW_116_in_rulePostfixExp6235); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_member_10_1, grammarAccess.getPostfixExpAccess().getMemberXKeyword_0_2_1_2_0_0());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPostfixExpRule());
                                      	        }
                                             		setWithLastConsumed(current, "member", lv_member_10_1, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3180:8: lv_member_10_2= 'y'
                                    {
                                    lv_member_10_2=(Token)match(input,117,FOLLOW_117_in_rulePostfixExp6264); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_member_10_2, grammarAccess.getPostfixExpAccess().getMemberYKeyword_0_2_1_2_0_1());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPostfixExpRule());
                                      	        }
                                             		setWithLastConsumed(current, "member", lv_member_10_2, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 3 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3192:8: lv_member_10_3= 'z'
                                    {
                                    lv_member_10_3=(Token)match(input,118,FOLLOW_118_in_rulePostfixExp6293); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_member_10_3, grammarAccess.getPostfixExpAccess().getMemberZKeyword_0_2_1_2_0_2());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPostfixExpRule());
                                      	        }
                                             		setWithLastConsumed(current, "member", lv_member_10_3, null);
                                      	    
                                    }

                                    }
                                    break;
                                case 4 :
                                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3204:8: lv_member_10_4= 'w'
                                    {
                                    lv_member_10_4=(Token)match(input,119,FOLLOW_119_in_rulePostfixExp6322); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                              newLeafNode(lv_member_10_4, grammarAccess.getPostfixExpAccess().getMemberWKeyword_0_2_1_2_0_3());
                                          
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getPostfixExpRule());
                                      	        }
                                             		setWithLastConsumed(current, "member", lv_member_10_4, null);
                                      	    
                                    }

                                    }
                                    break;

                            }


                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3221:5: this_Atomic_11= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPostfixExpAccess().getAtomicParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePostfixExp6370);
                    this_Atomic_11=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixExp"


    // $ANTLR start "entryRuleAtomic"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3237:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3238:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3239:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic6405);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic6415); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3246:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) ) | ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) ) | ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) ) | (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token lv_value_10_0=null;
        Token lv_value_12_0=null;
        Token lv_value_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_type_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject this_Exp_16 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3249:28: ( ( ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) ) | ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) ) | ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) ) | (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:1: ( ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) ) | ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) ) | ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) ) | (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:1: ( ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' ) | ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) ) | ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) ) | ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) ) | ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) ) | (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case RULE_VEC2:
            case RULE_VEC3:
            case RULE_VEC4:
            case RULE_IVEC2:
            case RULE_IVEC3:
            case RULE_IVEC4:
            case RULE_UVEC2:
            case RULE_UVEC3:
            case RULE_UVEC4:
            case RULE_BVEC2:
            case RULE_BVEC3:
            case RULE_BVEC4:
            case RULE_MAT2:
            case RULE_MAT3:
            case RULE_MAT4:
            case RULE_MAT2X2:
            case RULE_MAT2X3:
            case RULE_MAT2X4:
            case RULE_MAT3X2:
            case RULE_MAT3X3:
            case RULE_MAT3X4:
            case RULE_MAT4X2:
            case RULE_MAT4X3:
            case RULE_MAT4X4:
                {
                alt41=1;
                }
                break;
            case RULE_INTCONSTANT:
                {
                alt41=2;
                }
                break;
            case RULE_UINTCONSTANT:
                {
                alt41=3;
                }
                break;
            case RULE_FLOATCONSTANT:
                {
                alt41=4;
                }
                break;
            case RULE_BOOLCONSTANT:
                {
                alt41=5;
                }
                break;
            case 111:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:2: ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:2: ( () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:3: () ( (lv_type_1_0= ruleComplexType ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )? otherlv_6= ')'
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3250:3: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3251:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getConstructorAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3256:2: ( (lv_type_1_0= ruleComplexType ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3257:1: (lv_type_1_0= ruleComplexType )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3257:1: (lv_type_1_0= ruleComplexType )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3258:3: lv_type_1_0= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicAccess().getTypeComplexTypeParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_ruleAtomic6471);
                    lv_type_1_0=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"ComplexType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleAtomic6483); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3278:1: ( ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_INTCONSTANT && LA40_0<=RULE_IDENTIFIER)||(LA40_0>=RULE_VEC2 && LA40_0<=RULE_MAT4X4)||(LA40_0>=RULE_UINTCONSTANT && LA40_0<=RULE_FLOATCONSTANT)||LA40_0==RULE_BOOLCONSTANT||LA40_0==111) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3278:2: ( (lv_params_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )*
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3278:2: ( (lv_params_3_0= ruleExp ) )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3279:1: (lv_params_3_0= ruleExp )
                            {
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3279:1: (lv_params_3_0= ruleExp )
                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3280:3: lv_params_3_0= ruleExp
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAtomicAccess().getParamsExpParserRuleCall_0_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExp_in_ruleAtomic6505);
                            lv_params_3_0=ruleExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"params",
                                      		lv_params_3_0, 
                                      		"Exp");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3296:2: (otherlv_4= ',' ( (lv_params_5_0= ruleExp ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==112) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3296:4: otherlv_4= ',' ( (lv_params_5_0= ruleExp ) )
                            	    {
                            	    otherlv_4=(Token)match(input,112,FOLLOW_112_in_ruleAtomic6518); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getAtomicAccess().getCommaKeyword_0_3_1_0());
                            	          
                            	    }
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3300:1: ( (lv_params_5_0= ruleExp ) )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3301:1: (lv_params_5_0= ruleExp )
                            	    {
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3301:1: (lv_params_5_0= ruleExp )
                            	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3302:3: lv_params_5_0= ruleExp
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAtomicAccess().getParamsExpParserRuleCall_0_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExp_in_ruleAtomic6539);
                            	    lv_params_5_0=ruleExp();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAtomicRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"params",
                            	              		lv_params_5_0, 
                            	              		"Exp");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,113,FOLLOW_113_in_ruleAtomic6555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3323:6: ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3323:6: ( () ( (lv_value_8_0= RULE_INTCONSTANT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3323:7: () ( (lv_value_8_0= RULE_INTCONSTANT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3323:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3324:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getIntegerLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3329:2: ( (lv_value_8_0= RULE_INTCONSTANT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3330:1: (lv_value_8_0= RULE_INTCONSTANT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3330:1: (lv_value_8_0= RULE_INTCONSTANT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3331:3: lv_value_8_0= RULE_INTCONSTANT
                    {
                    lv_value_8_0=(Token)match(input,RULE_INTCONSTANT,FOLLOW_RULE_INTCONSTANT_in_ruleAtomic6589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_8_0, grammarAccess.getAtomicAccess().getValueINTCONSTANTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_8_0, 
                              		"INTCONSTANT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3348:6: ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3348:6: ( () ( (lv_value_10_0= RULE_UINTCONSTANT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3348:7: () ( (lv_value_10_0= RULE_UINTCONSTANT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3348:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3349:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getUIntegerLiteralAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3354:2: ( (lv_value_10_0= RULE_UINTCONSTANT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3355:1: (lv_value_10_0= RULE_UINTCONSTANT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3355:1: (lv_value_10_0= RULE_UINTCONSTANT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3356:3: lv_value_10_0= RULE_UINTCONSTANT
                    {
                    lv_value_10_0=(Token)match(input,RULE_UINTCONSTANT,FOLLOW_RULE_UINTCONSTANT_in_ruleAtomic6628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_10_0, grammarAccess.getAtomicAccess().getValueUINTCONSTANTTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_10_0, 
                              		"UINTCONSTANT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3373:6: ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3373:6: ( () ( (lv_value_12_0= RULE_FLOATCONSTANT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3373:7: () ( (lv_value_12_0= RULE_FLOATCONSTANT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3373:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3374:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getFloatLiteralAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3379:2: ( (lv_value_12_0= RULE_FLOATCONSTANT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3380:1: (lv_value_12_0= RULE_FLOATCONSTANT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3380:1: (lv_value_12_0= RULE_FLOATCONSTANT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3381:3: lv_value_12_0= RULE_FLOATCONSTANT
                    {
                    lv_value_12_0=(Token)match(input,RULE_FLOATCONSTANT,FOLLOW_RULE_FLOATCONSTANT_in_ruleAtomic6667); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_12_0, grammarAccess.getAtomicAccess().getValueFLOATCONSTANTTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_12_0, 
                              		"FLOATCONSTANT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3398:6: ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3398:6: ( () ( (lv_value_14_0= RULE_BOOLCONSTANT ) ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3398:7: () ( (lv_value_14_0= RULE_BOOLCONSTANT ) )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3398:7: ()
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3399:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBoolLiteralAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3404:2: ( (lv_value_14_0= RULE_BOOLCONSTANT ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3405:1: (lv_value_14_0= RULE_BOOLCONSTANT )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3405:1: (lv_value_14_0= RULE_BOOLCONSTANT )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3406:3: lv_value_14_0= RULE_BOOLCONSTANT
                    {
                    lv_value_14_0=(Token)match(input,RULE_BOOLCONSTANT,FOLLOW_RULE_BOOLCONSTANT_in_ruleAtomic6706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_14_0, grammarAccess.getAtomicAccess().getValueBOOLCONSTANTTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_14_0, 
                              		"BOOLCONSTANT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3423:6: (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3423:6: (otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3423:8: otherlv_15= '(' this_Exp_16= ruleExp otherlv_17= ')'
                    {
                    otherlv_15=(Token)match(input,111,FOLLOW_111_in_ruleAtomic6731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicAccess().getExpParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExp_in_ruleAtomic6753);
                    this_Exp_16=ruleExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Exp_16; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_17=(Token)match(input,113,FOLLOW_113_in_ruleAtomic6764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_5_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleDefinition"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3450:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3451:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3452:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition6803);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition6813); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3459:1: ruleDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_args_2_0 = null;

        EObject lv_args_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3462:28: ( ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3463:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3463:1: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )? )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3463:2: ( (lv_name_0_0= RULE_IDENTIFIER ) ) (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )?
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3463:2: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3464:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3464:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3465:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleDefinition6855); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDefinitionAccess().getNameIDENTIFIERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }

            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3481:2: (otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==111) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3481:4: otherlv_1= '(' ( (lv_args_2_0= ruleDeclaredParameter ) ) (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,111,FOLLOW_111_in_ruleDefinition6873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3485:1: ( (lv_args_2_0= ruleDeclaredParameter ) )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3486:1: (lv_args_2_0= ruleDeclaredParameter )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3486:1: (lv_args_2_0= ruleDeclaredParameter )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3487:3: lv_args_2_0= ruleDeclaredParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition6894);
                    lv_args_2_0=ruleDeclaredParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"args",
                              		lv_args_2_0, 
                              		"DeclaredParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3503:2: (otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==112) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3503:4: otherlv_3= ',' ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,112,FOLLOW_112_in_ruleDefinition6907); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3507:1: ( (lv_args_4_0= ruleDeclaredParameter ) )
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3508:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    {
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3508:1: (lv_args_4_0= ruleDeclaredParameter )
                    	    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3509:3: lv_args_4_0= ruleDeclaredParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleDeclaredParameter_in_ruleDefinition6928);
                    	    lv_args_4_0=ruleDeclaredParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"args",
                    	              		lv_args_4_0, 
                    	              		"DeclaredParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,113,FOLLOW_113_in_ruleDefinition6942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDeclaredParameter"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3537:1: entryRuleDeclaredParameter returns [EObject current=null] : iv_ruleDeclaredParameter= ruleDeclaredParameter EOF ;
    public final EObject entryRuleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredParameter = null;


        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3538:2: (iv_ruleDeclaredParameter= ruleDeclaredParameter EOF )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3539:2: iv_ruleDeclaredParameter= ruleDeclaredParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaredParameterRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter6980);
            iv_ruleDeclaredParameter=ruleDeclaredParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaredParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter6990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaredParameter"


    // $ANTLR start "ruleDeclaredParameter"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3546:1: ruleDeclaredParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleDeclaredParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3549:28: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3550:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3550:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3551:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3551:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3552:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleDeclaredParameter7031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDeclaredParameterAccess().getNameIDENTIFIERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeclaredParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaredParameter"


    // $ANTLR start "ruleLogicOp"
    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3578:1: ruleLogicOp returns [Enumerator current=null] : ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator ruleLogicOp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3580:28: ( ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) ) )
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3581:1: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            {
            // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3581:1: ( (enumLiteral_0= '!=' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '>=' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 120:
                {
                alt44=1;
                }
                break;
            case 121:
                {
                alt44=2;
                }
                break;
            case 122:
                {
                alt44=3;
                }
                break;
            case 123:
                {
                alt44=4;
                }
                break;
            case 124:
                {
                alt44=5;
                }
                break;
            case 125:
                {
                alt44=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3581:2: (enumLiteral_0= '!=' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3581:2: (enumLiteral_0= '!=' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3581:4: enumLiteral_0= '!='
                    {
                    enumLiteral_0=(Token)match(input,120,FOLLOW_120_in_ruleLogicOp7087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getNOT_EQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLogicOpAccess().getNOT_EQUALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3587:6: (enumLiteral_1= '==' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3587:6: (enumLiteral_1= '==' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3587:8: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,121,FOLLOW_121_in_ruleLogicOp7104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLogicOpAccess().getEQUALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3593:6: (enumLiteral_2= '<' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3593:6: (enumLiteral_2= '<' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3593:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,122,FOLLOW_122_in_ruleLogicOp7121); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getLESSEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getLogicOpAccess().getLESSEREnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3599:6: (enumLiteral_3= '>' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3599:6: (enumLiteral_3= '>' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3599:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,123,FOLLOW_123_in_ruleLogicOp7138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getGREATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getLogicOpAccess().getGREATEREnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3605:6: (enumLiteral_4= '<=' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3605:6: (enumLiteral_4= '<=' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3605:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,124,FOLLOW_124_in_ruleLogicOp7155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getLESSER_EQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getLogicOpAccess().getLESSER_EQUALEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3611:6: (enumLiteral_5= '>=' )
                    {
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3611:6: (enumLiteral_5= '>=' )
                    // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3611:8: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,125,FOLLOW_125_in_ruleLogicOp7172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLogicOpAccess().getGREATER_EQUALEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getLogicOpAccess().getGREATER_EQUALEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOp"

    // $ANTLR start synpred1_InternalGlsl
    public final void synpred1_InternalGlsl_fragment() throws RecognitionException {   
        // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:4: ( RULE_ELSE )
        // ../org.eglipse.lang.glsl/src-gen/org/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1947:6: RULE_ELSE
        {
        match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_synpred1_InternalGlsl3668); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGlsl

    // Delegated rules

    public final boolean synpred1_InternalGlsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGlsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA2_eotS =
        "\144\uffff";
    static final String DFA2_eofS =
        "\1\1\143\uffff";
    static final String DFA2_minS =
        "\1\7\3\uffff\35\6\1\4\1\uffff\1\13\1\6\1\4\34\6\1\160\2\uffff\1"+
        "\13\35\6\1\160";
    static final String DFA2_maxS =
        "\1\47\3\uffff\35\6\1\162\1\uffff\2\161\1\50\34\6\1\161\2\uffff"+
        "\1\47\35\6\1\161";
    static final String DFA2_acceptS =
        "\1\uffff\1\6\1\1\1\2\36\uffff\1\5\40\uffff\1\4\1\3\37\uffff";
    static final String DFA2_specialS =
        "\144\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\3\3\1\40\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\32\1\33\1\34\1\35\1\36\1\37",
            "",
            "",
            "",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\42\152\uffff\1\43\2\uffff\1\42",
            "",
            "\1\44\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1"+
            "\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1"+
            "\74\1\75\1\76\1\77\1\100\1\101\111\uffff\1\45",
            "\1\102\152\uffff\1\45",
            "\1\104\43\uffff\1\103",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\102",
            "\1\105\1\45",
            "",
            "",
            "\1\142\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116"+
            "\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
            "\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\143",
            "\1\105\1\45"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 99:3: ( ( ( (lv_uniforms_1_0= ruleUniformDeclaration ) ) this_SEMICOLON_2= RULE_SEMICOLON ) | ( ( (lv_attribs_3_0= ruleAttributeDeclaration ) ) this_SEMICOLON_4= RULE_SEMICOLON ) | ( ( (lv_prototypes_5_0= ruleFunctionPrototype ) ) this_SEMICOLON_6= RULE_SEMICOLON ) | ( (lv_functions_7_0= ruleFunctionDefinition ) ) | ( ( (lv_variables_8_0= ruleVariableDeclaration ) ) this_SEMICOLON_9= RULE_SEMICOLON ) )*";
        }
    }
    static final String DFA4_eotS =
        "\143\uffff";
    static final String DFA4_eofS =
        "\143\uffff";
    static final String DFA4_minS =
        "\1\7\2\uffff\35\6\1\4\1\uffff\1\13\1\6\1\4\34\6\1\160\2\uffff\1"+
        "\13\35\6\1\160";
    static final String DFA4_maxS =
        "\1\47\2\uffff\35\6\1\162\1\uffff\2\161\1\50\34\6\1\161\2\uffff"+
        "\1\47\35\6\1\161";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\36\uffff\1\4\40\uffff\1\5\1\3\37\uffff";
    static final String DFA4_specialS =
        "\143\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\3\2\1\37\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\1\34\1\35\1\36",
            "",
            "",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\40",
            "\1\41\152\uffff\1\42\2\uffff\1\41",
            "",
            "\1\43\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1"+
            "\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1"+
            "\73\1\74\1\75\1\76\1\77\1\100\111\uffff\1\44",
            "\1\101\152\uffff\1\44",
            "\1\103\43\uffff\1\102",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\101",
            "\1\104\1\44",
            "",
            "",
            "\1\141\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115"+
            "\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127"+
            "\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\142",
            "\1\104\1\44"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "321:1: ( (this_UniformDeclaration_0= ruleUniformDeclaration this_SEMICOLON_1= RULE_SEMICOLON ) | (this_AttributeDeclaration_2= ruleAttributeDeclaration this_SEMICOLON_3= RULE_SEMICOLON ) | (this_FunctionPrototype_4= ruleFunctionPrototype this_SEMICOLON_5= RULE_SEMICOLON ) | this_VariableDeclaration_6= ruleVariableDeclaration | this_FunctionDefinition_7= ruleFunctionDefinition )";
        }
    }
    static final String DFA22_eotS =
        "\14\uffff";
    static final String DFA22_eofS =
        "\14\uffff";
    static final String DFA22_minS =
        "\1\6\2\uffff\1\4\10\uffff";
    static final String DFA22_maxS =
        "\1\70\2\uffff\1\162\10\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\6\1\7\1\10\1\11\1\12\1\5\1\3";
    static final String DFA22_specialS =
        "\14\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\3\4\uffff\35\2\1\1\1\uffff\1\5\1\uffff\1\6\1\7\1\10\1\11"+
            "\5\uffff\4\4",
            "",
            "",
            "\1\12\152\uffff\1\12\2\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1781:1: (this_BlockStatement_0= ruleBlockStatement | this_VariableDeclaration_1= ruleVariableDeclaration | this_AssignmentStatement_2= ruleAssignmentStatement | this_JumpStatement_3= ruleJumpStatement | ( () ( (otherlv_5= RULE_IDENTIFIER ) ) (otherlv_6= '(' ( (lv_actuals_7_0= ruleExp ) )? (otherlv_8= ',' ( (lv_actuals_9_0= ruleExp ) ) )* otherlv_10= ')' )? this_SEMICOLON_11= RULE_SEMICOLON ) | ( () this_IF_13= RULE_IF otherlv_14= '(' ( (lv_condition_15_0= ruleExp ) ) otherlv_16= ')' ( (lv_then_17_0= ruleStatement ) ) ( ( ( RULE_ELSE )=>this_ELSE_18= RULE_ELSE ) ( (lv_else_19_0= ruleStatement ) ) )? ) | ( () this_WHILE_21= RULE_WHILE otherlv_22= '(' ( (lv_condition_23_0= ruleExp ) ) otherlv_24= ')' ( (lv_do_25_0= ruleStatement ) ) ) | ( () this_DO_27= RULE_DO ( (lv_do_28_0= ruleBlockStatement ) ) this_WHILE_29= RULE_WHILE otherlv_30= '(' ( (lv_condition_31_0= ruleExp ) ) otherlv_32= ')' this_SEMICOLON_33= RULE_SEMICOLON ) | ( () this_FOR_35= RULE_FOR otherlv_36= '(' ( ( (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration ) ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_b_39_0= ruleExp ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_c_41_0= ruleExp ) )? otherlv_42= ')' ( (lv_do_43_0= ruleStatement ) ) ) | ( () this_SWITCH_45= RULE_SWITCH otherlv_46= '(' ( (lv_a_47_0= ruleExp ) ) otherlv_48= ')' this_LEFT_BRACE_49= RULE_LEFT_BRACE ( (lv_cases_50_0= ruleSwitchCase ) ) this_RIGHT_BRACE_51= RULE_RIGHT_BRACE ) )";
        }
    }
    static final String DFA19_eotS =
        "\33\uffff";
    static final String DFA19_eofS =
        "\33\uffff";
    static final String DFA19_minS =
        "\1\5\1\uffff\30\6\1\uffff";
    static final String DFA19_maxS =
        "\1\157\1\uffff\30\157\1\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\30\uffff\1\2";
    static final String DFA19_specialS =
        "\33\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\1\11\32\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\11\uffff\2\1\14\uffff\1\1\57\uffff\1\1",
            "",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            "\1\32\150\uffff\1\1",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2104:1: (lv_a_37_1= ruleExp | lv_a_37_2= ruleDeclaration )";
        }
    }
 

    public static final BitSet FOLLOW_ruleSourceFile_in_entryRuleSourceFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSourceFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecompilerStatement_in_ruleSourceFile131 = new BitSet(new long[]{0x000000FFFFFFFF82L,0x0000400000000000L});
    public static final BitSet FOLLOW_ruleUniformDeclaration_in_ruleSourceFile155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSourceFile166 = new BitSet(new long[]{0x000000FFFFFFFF82L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleSourceFile194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSourceFile205 = new BitSet(new long[]{0x000000FFFFFFFF82L});
    public static final BitSet FOLLOW_ruleFunctionPrototype_in_ruleSourceFile233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSourceFile244 = new BitSet(new long[]{0x000000FFFFFFFF82L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleSourceFile271 = new BitSet(new long[]{0x000000FFFFFFFF82L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSourceFile299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleSourceFile310 = new BitSet(new long[]{0x000000FFFFFFFF82L});
    public static final BitSet FOLLOW_rulePrecompilerStatement_in_entryRulePrecompilerStatement348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecompilerStatement358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecompilerVersion_in_rulePrecompilerStatement404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecompilerVersion_in_entryRulePrecompilerVersion438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecompilerVersion448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rulePrecompilerVersion485 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_rulePrecompilerVersion502 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulePrecompilerVersion524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniformDeclaration_in_ruleDeclaration624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleDeclaration634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleDeclaration663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleDeclaration673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionPrototype_in_ruleDeclaration702 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleDeclaration712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleDeclaration740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleDeclaration767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUniformDeclaration_in_entryRuleUniformDeclaration806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUniformDeclaration816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNIFORM_in_ruleUniformDeclaration867 = new BitSet(new long[]{0x000000FFFFFFF800L});
    public static final BitSet FOLLOW_ruleType_in_ruleUniformDeclaration893 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleUniformDeclaration910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDeclaration961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IN_in_ruleAttributeDeclaration1013 = new BitSet(new long[]{0x000000FFFFFFF800L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttributeDeclaration1039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OUT_in_ruleAttributeDeclaration1095 = new BitSet(new long[]{0x000000FFFFFFF800L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttributeDeclaration1121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INOUT_in_ruleAttributeDeclaration1177 = new BitSet(new long[]{0x000000FFFFFFF800L});
    public static final BitSet FOLLOW_ruleType_in_ruleAttributeDeclaration1203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleAttributeDeclaration1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionPrototype_in_entryRuleFunctionPrototype1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionPrototype1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionPrototype1318 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleFunctionPrototype1335 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleFunctionPrototype1352 = new BitSet(new long[]{0x000000FFFFFFF800L,0x0002000000000000L});
    public static final BitSet FOLLOW_RULE_VOID_in_ruleFunctionPrototype1365 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionPrototype1394 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_ruleFunctionPrototype1407 = new BitSet(new long[]{0x000000FFFFFFF800L,0x0002000000000000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleFunctionPrototype1428 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_ruleFunctionPrototype1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameter1536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleParameter1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_ruleType1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleType1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VOID_in_ruleType1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScalarType_in_entryRuleScalarType1752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScalarType1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTX_in_ruleScalarType1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UINT_in_ruleScalarType1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleScalarType1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleScalarType1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVecType_in_ruleComplexType2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatType_in_ruleComplexType2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVecType_in_entryRuleVecType2092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVecType2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VEC2_in_ruleVecType2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VEC3_in_ruleVecType2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VEC4_in_ruleVecType2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IVEC2_in_ruleVecType2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IVEC3_in_ruleVecType2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IVEC4_in_ruleVecType2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UVEC2_in_ruleVecType2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UVEC3_in_ruleVecType2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UVEC4_in_ruleVecType2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BVEC2_in_ruleVecType2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BVEC3_in_ruleVecType2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BVEC4_in_ruleVecType2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMatType_in_entryRuleMatType2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMatType2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT2_in_ruleMatType2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT3_in_ruleMatType2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT4_in_ruleMatType2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT2X2_in_ruleMatType2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT2X3_in_ruleMatType2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT2X4_in_ruleMatType2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT3X2_in_ruleMatType2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT3X3_in_ruleMatType2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT3X4_in_ruleMatType2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT4X2_in_ruleMatType3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT4X3_in_ruleMatType3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAT4X4_in_ruleMatType3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionPrototype_in_ruleFunctionDefinition3215 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_ruleFunctionDefinition3225 = new BitSet(new long[]{0x01E0F7FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleFunctionDefinition3245 = new BitSet(new long[]{0x01E0F7FFFFFFFFC0L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_ruleFunctionDefinition3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleStatement3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleStatement3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_ruleStatement3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpStatement_in_ruleStatement3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleStatement3467 = new BitSet(new long[]{0x0000000000000010L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement3480 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0003800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3501 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_ruleStatement3515 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3536 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement3550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStatement3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleStatement3590 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement3601 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3622 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement3634 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3655 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleStatement3673 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleStatement3724 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement3735 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3756 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement3768 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DO_in_ruleStatement3817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_ruleStatement3837 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RULE_WHILE_in_ruleStatement3848 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement3859 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3880 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement3892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStatement3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_ruleStatement3930 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement3941 = new BitSet(new long[]{0x800600FFFFFFFFE0L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement3964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleStatement3983 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStatement3997 = new BitSet(new long[]{0x800600FFFFFF0070L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleStatement4029 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0002800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement4049 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement4062 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleStatement4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SWITCH_in_ruleStatement4111 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleStatement4122 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleStatement4143 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleStatement4155 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_ruleStatement4166 = new BitSet(new long[]{0x0011000000000000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleStatement4186 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_ruleStatement4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase4233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CASE_in_ruleSwitchCase4280 = new BitSet(new long[]{0x0006000000000020L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleSwitchCase4297 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_UINTCONSTANT_in_ruleSwitchCase4325 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_FLOATCONSTANT_in_ruleSwitchCase4353 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitchCase4370 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchCase4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEFAULT_in_ruleSwitchCase4409 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleSwitchCase4419 = new BitSet(new long[]{0x01E0F5FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSwitchCase4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockStatement_in_entryRuleBlockStatement4476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockStatement4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACE_in_ruleBlockStatement4522 = new BitSet(new long[]{0x01E0F7FFFFFFFFC0L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlockStatement4542 = new BitSet(new long[]{0x01E0F7FFFFFFFFC0L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACE_in_ruleBlockStatement4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpStatement_in_entryRuleJumpStatement4589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpStatement4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONTINUE_in_ruleJumpStatement4636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BREAK_in_ruleJumpStatement4664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_ruleJumpStatement4701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_ruleJumpStatement4738 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleJumpStatement4758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DISCARD_in_ruleJumpStatement4787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleJumpStatement4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration4889 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleVariableDeclaration4906 = new BitSet(new long[]{0x0000000000000010L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleVariableDeclaration4924 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleVariableDeclaration4945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleVariableDeclaration4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentStatement_in_entryRuleAssignmentStatement4993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentStatement5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleAssignmentStatement5048 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleAssignmentStatement5060 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAssignmentStatement5081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_SEMICOLON_in_ruleAssignmentStatement5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExp_in_entryRuleExp5127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExp5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExp_in_ruleExp5184 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleExp5210 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp5231 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleExp5242 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleExp5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExp_in_entryRuleLogicExp5300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExp5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleLogicExp5357 = new BitSet(new long[]{0x0000000000000002L,0x3F00000000000000L});
    public static final BitSet FOLLOW_ruleLogicOp_in_ruleLogicExp5387 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleAddExp_in_ruleLogicExp5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExp_in_entryRuleAddExp5446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExp5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExp_in_ruleAddExp5503 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleAddOp_in_ruleAddExp5533 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleMulExp_in_ruleAddExp5554 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_ruleAddOp_in_entryRuleAddOp5593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddOp5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleAddOp5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DASH_in_ruleAddOp5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulExp_in_entryRuleMulExp5715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulExp5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixExp_in_ruleMulExp5772 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleMulOp_in_ruleMulExp5802 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_rulePostfixExp_in_ruleMulExp5823 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_ruleMulOp_in_entryRuleMulOp5862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOp5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STAR_in_ruleMulOp5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SLASH_in_ruleMulOp5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PERCENT_in_ruleMulOp5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixExp_in_entryRulePostfixExp6010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixExp6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rulePostfixExp6075 = new BitSet(new long[]{0x0000000000000002L,0x0008800000000000L});
    public static final BitSet FOLLOW_111_in_rulePostfixExp6106 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0003800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_rulePostfixExp6128 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_rulePostfixExp6142 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_rulePostfixExp6163 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_rulePostfixExp6177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rulePostfixExp6214 = new BitSet(new long[]{0x0000000000000000L,0x00F0000000000000L});
    public static final BitSet FOLLOW_116_in_rulePostfixExp6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_rulePostfixExp6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rulePostfixExp6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rulePostfixExp6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePostfixExp6370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic6405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleAtomic6471 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleAtomic6483 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0002800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAtomic6505 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_ruleAtomic6518 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAtomic6539 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_ruleAtomic6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTCONSTANT_in_ruleAtomic6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UINTCONSTANT_in_ruleAtomic6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATCONSTANT_in_ruleAtomic6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLCONSTANT_in_ruleAtomic6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleAtomic6731 = new BitSet(new long[]{0x800600FFFFFF0060L,0x0000800000000000L});
    public static final BitSet FOLLOW_ruleExp_in_ruleAtomic6753 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleAtomic6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition6803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition6813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleDefinition6855 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleDefinition6873 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition6894 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_112_in_ruleDefinition6907 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_ruleDefinition6928 = new BitSet(new long[]{0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_113_in_ruleDefinition6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter6980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleDeclaredParameter7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleLogicOp7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleLogicOp7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleLogicOp7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleLogicOp7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleLogicOp7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleLogicOp7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_synpred1_InternalGlsl3668 = new BitSet(new long[]{0x0000000000000002L});

}