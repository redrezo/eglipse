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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PATH", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'shader'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
    public static final int T__12=12;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_PATH=4;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

    // delegates
    // delegators


        public InternalProgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProgramParser.tokenNames; }
    public String getGrammarFileName() { return "../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g"; }



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



    // $ANTLR start "entryRuleProgram"
    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:76:1: ruleProgram returns [EObject current=null] : ( (lv_shader_0_0= ruleShader ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_shader_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:79:28: ( ( (lv_shader_0_0= ruleShader ) )* )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:80:1: ( (lv_shader_0_0= ruleShader ) )*
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:80:1: ( (lv_shader_0_0= ruleShader ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:81:1: (lv_shader_0_0= ruleShader )
            	    {
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:81:1: (lv_shader_0_0= ruleShader )
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:82:3: lv_shader_0_0= ruleShader
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getProgramAccess().getShaderShaderParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleShader_in_ruleProgram130);
            	    lv_shader_0_0=ruleShader();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"shader",
            	            		lv_shader_0_0, 
            	            		"Shader");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleShader"
    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:106:1: entryRuleShader returns [EObject current=null] : iv_ruleShader= ruleShader EOF ;
    public final EObject entryRuleShader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShader = null;


        try {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:107:2: (iv_ruleShader= ruleShader EOF )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:108:2: iv_ruleShader= ruleShader EOF
            {
             newCompositeNode(grammarAccess.getShaderRule()); 
            pushFollow(FOLLOW_ruleShader_in_entryRuleShader166);
            iv_ruleShader=ruleShader();

            state._fsp--;

             current =iv_ruleShader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShader176); 

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
    // $ANTLR end "entryRuleShader"


    // $ANTLR start "ruleShader"
    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:115:1: ruleShader returns [EObject current=null] : (otherlv_0= 'shader' ( (lv_path_1_0= RULE_PATH ) ) ) ;
    public final EObject ruleShader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_path_1_0=null;

         enterRule(); 
            
        try {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:118:28: ( (otherlv_0= 'shader' ( (lv_path_1_0= RULE_PATH ) ) ) )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:119:1: (otherlv_0= 'shader' ( (lv_path_1_0= RULE_PATH ) ) )
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:119:1: (otherlv_0= 'shader' ( (lv_path_1_0= RULE_PATH ) ) )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:119:3: otherlv_0= 'shader' ( (lv_path_1_0= RULE_PATH ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleShader213); 

                	newLeafNode(otherlv_0, grammarAccess.getShaderAccess().getShaderKeyword_0());
                
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:123:1: ( (lv_path_1_0= RULE_PATH ) )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:124:1: (lv_path_1_0= RULE_PATH )
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:124:1: (lv_path_1_0= RULE_PATH )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:125:3: lv_path_1_0= RULE_PATH
            {
            lv_path_1_0=(Token)match(input,RULE_PATH,FOLLOW_RULE_PATH_in_ruleShader230); 

            			newLeafNode(lv_path_1_0, grammarAccess.getShaderAccess().getPathPATHTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getShaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"PATH");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShader"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShader_in_ruleProgram130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleShader_in_entryRuleShader166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShader176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleShader213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_PATH_in_ruleShader230 = new BitSet(new long[]{0x0000000000000002L});

}