package at.caks.eglipse.lang.program.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.caks.eglipse.lang.program.services.ProgramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g"; }


     
     	private ProgramGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProgramGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProgram"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:60:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:61:1: ( ruleProgram EOF )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:62:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram61);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:69:1: ruleProgram : ( ( rule__Program__ShaderAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:73:2: ( ( ( rule__Program__ShaderAssignment )* ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:74:1: ( ( rule__Program__ShaderAssignment )* )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:74:1: ( ( rule__Program__ShaderAssignment )* )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:75:1: ( rule__Program__ShaderAssignment )*
            {
             before(grammarAccess.getProgramAccess().getShaderAssignment()); 
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:76:1: ( rule__Program__ShaderAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:76:2: rule__Program__ShaderAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Program__ShaderAssignment_in_ruleProgram94);
            	    rule__Program__ShaderAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getShaderAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleShader"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:88:1: entryRuleShader : ruleShader EOF ;
    public final void entryRuleShader() throws RecognitionException {
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:89:1: ( ruleShader EOF )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:90:1: ruleShader EOF
            {
             before(grammarAccess.getShaderRule()); 
            pushFollow(FOLLOW_ruleShader_in_entryRuleShader122);
            ruleShader();

            state._fsp--;

             after(grammarAccess.getShaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShader129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShader"


    // $ANTLR start "ruleShader"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:97:1: ruleShader : ( ( rule__Shader__Group__0 ) ) ;
    public final void ruleShader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:101:2: ( ( ( rule__Shader__Group__0 ) ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:102:1: ( ( rule__Shader__Group__0 ) )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:102:1: ( ( rule__Shader__Group__0 ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:103:1: ( rule__Shader__Group__0 )
            {
             before(grammarAccess.getShaderAccess().getGroup()); 
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:104:1: ( rule__Shader__Group__0 )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:104:2: rule__Shader__Group__0
            {
            pushFollow(FOLLOW_rule__Shader__Group__0_in_ruleShader155);
            rule__Shader__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShader"


    // $ANTLR start "rule__Shader__Group__0"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:118:1: rule__Shader__Group__0 : rule__Shader__Group__0__Impl rule__Shader__Group__1 ;
    public final void rule__Shader__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:122:1: ( rule__Shader__Group__0__Impl rule__Shader__Group__1 )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:123:2: rule__Shader__Group__0__Impl rule__Shader__Group__1
            {
            pushFollow(FOLLOW_rule__Shader__Group__0__Impl_in_rule__Shader__Group__0189);
            rule__Shader__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Shader__Group__1_in_rule__Shader__Group__0192);
            rule__Shader__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shader__Group__0"


    // $ANTLR start "rule__Shader__Group__0__Impl"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:130:1: rule__Shader__Group__0__Impl : ( 'shader' ) ;
    public final void rule__Shader__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:134:1: ( ( 'shader' ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:135:1: ( 'shader' )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:135:1: ( 'shader' )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:136:1: 'shader'
            {
             before(grammarAccess.getShaderAccess().getShaderKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Shader__Group__0__Impl220); 
             after(grammarAccess.getShaderAccess().getShaderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shader__Group__0__Impl"


    // $ANTLR start "rule__Shader__Group__1"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:149:1: rule__Shader__Group__1 : rule__Shader__Group__1__Impl ;
    public final void rule__Shader__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:153:1: ( rule__Shader__Group__1__Impl )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:154:2: rule__Shader__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Shader__Group__1__Impl_in_rule__Shader__Group__1251);
            rule__Shader__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shader__Group__1"


    // $ANTLR start "rule__Shader__Group__1__Impl"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:160:1: rule__Shader__Group__1__Impl : ( ( rule__Shader__PathAssignment_1 ) ) ;
    public final void rule__Shader__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:164:1: ( ( ( rule__Shader__PathAssignment_1 ) ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:165:1: ( ( rule__Shader__PathAssignment_1 ) )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:165:1: ( ( rule__Shader__PathAssignment_1 ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:166:1: ( rule__Shader__PathAssignment_1 )
            {
             before(grammarAccess.getShaderAccess().getPathAssignment_1()); 
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:167:1: ( rule__Shader__PathAssignment_1 )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:167:2: rule__Shader__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__Shader__PathAssignment_1_in_rule__Shader__Group__1__Impl278);
            rule__Shader__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShaderAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shader__Group__1__Impl"


    // $ANTLR start "rule__Program__ShaderAssignment"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:182:1: rule__Program__ShaderAssignment : ( ruleShader ) ;
    public final void rule__Program__ShaderAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:186:1: ( ( ruleShader ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:187:1: ( ruleShader )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:187:1: ( ruleShader )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:188:1: ruleShader
            {
             before(grammarAccess.getProgramAccess().getShaderShaderParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleShader_in_rule__Program__ShaderAssignment317);
            ruleShader();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getShaderShaderParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ShaderAssignment"


    // $ANTLR start "rule__Shader__PathAssignment_1"
    // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:197:1: rule__Shader__PathAssignment_1 : ( RULE_PATH ) ;
    public final void rule__Shader__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:201:1: ( ( RULE_PATH ) )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:202:1: ( RULE_PATH )
            {
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:202:1: ( RULE_PATH )
            // ../at.caks.eglipse.lang.program.ui/src-gen/at/caks/eglipse/lang/program/ui/contentassist/antlr/internal/InternalProgram.g:203:1: RULE_PATH
            {
             before(grammarAccess.getShaderAccess().getPathPATHTerminalRuleCall_1_0()); 
            match(input,RULE_PATH,FOLLOW_RULE_PATH_in_rule__Shader__PathAssignment_1348); 
             after(grammarAccess.getShaderAccess().getPathPATHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shader__PathAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Program__ShaderAssignment_in_ruleProgram94 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleShader_in_entryRuleShader122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShader129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shader__Group__0_in_ruleShader155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shader__Group__0__Impl_in_rule__Shader__Group__0189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Shader__Group__1_in_rule__Shader__Group__0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Shader__Group__0__Impl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shader__Group__1__Impl_in_rule__Shader__Group__1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Shader__PathAssignment_1_in_rule__Shader__Group__1__Impl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShader_in_rule__Program__ShaderAssignment317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PATH_in_rule__Shader__PathAssignment_1348 = new BitSet(new long[]{0x0000000000000002L});

}