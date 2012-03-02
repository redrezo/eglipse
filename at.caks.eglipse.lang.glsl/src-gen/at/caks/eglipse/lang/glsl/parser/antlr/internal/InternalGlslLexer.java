package at.caks.eglipse.lang.glsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGlslLexer extends Lexer {
    public static final int RULE_LAYOUT=71;
    public static final int RULE_TILDE=95;
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
    public static final int RULE_FLOATCONSTANT=50;
    public static final int RULE_AMPERSAND=98;
    public static final int RULE_MEDIUM_PRECISION=101;
    public static final int RULE_CENTROID=66;
    public static final int RULE_LEFT_BRACE=40;
    public static final int RULE_BANG=94;
    public static final int RULE_DEC_OP=78;
    public static final int RULE_CONTINUE=53;
    public static final int RULE_MUL_ASSIGN=82;
    public static final int RULE_NOPERSPECTIVE=68;
    public static final int RULE_UVEC3=23;
    public static final int RULE_UVEC2=22;
    public static final int RULE_PRECISION=103;
    public static final int RULE_UVEC4=24;
    public static final int RULE_LOW_PRECISION=102;
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
    public static final int RULE_IDENTIFIER=6;
    public static final int RULE_HIGH_PRECISION=100;
    public static final int RULE_SMOOTH=70;
    public static final int RULE_FLOAT=15;
    public static final int RULE_SL_COMMENT=105;
    public static final int RULE_DEFAULT=52;
    public static final int RULE_COLON=51;
    public static final int RULE_INTCONSTANT=5;
    public static final int RULE_OUT=9;
    public static final int RULE_FLAT=69;
    public static final int RULE_STAR=60;
    public static final int RULE_VEC2=16;
    public static final int RULE_VEC3=17;
    public static final int RULE_VEC4=18;
    public static final int RULE_IVEC4=21;
    public static final int RULE_RIGHT_BRACKET=93;
    public static final int RULE_BOOLCONSTANT=63;
    public static final int RULE_IVEC3=20;
    public static final int RULE_IVEC2=19;
    public static final int RULE_RIGHT_BRACE=41;
    public static final int RULE_WS=108;
    public static final int RULE_TYPE_NAME=73;
    public static final int RULE_LEFT_OP=75;
    public static final int RULE_BREAK=54;
    public static final int RULE_ELSE=43;
    public static final int RULE_DASH=59;

    // delegates
    // delegators

    public InternalGlslLexer() {;} 
    public InternalGlslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGlslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g"; }

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:11:8: ( '#version' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:11:10: '#version'
            {
            match("#version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:12:8: ( '(' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:12:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:13:8: ( ',' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:13:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:14:8: ( ')' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:14:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:15:8: ( '=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:15:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:16:8: ( '.' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:16:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:17:8: ( 'x' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:17:10: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:18:8: ( 'y' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:18:10: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:19:8: ( 'z' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:19:10: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:20:8: ( 'w' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:20:10: 'w'
            {
            match('w'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:21:8: ( '!=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:21:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:22:8: ( '==' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:22:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:23:8: ( '<' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:23:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:24:8: ( '>' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:24:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:25:8: ( '<=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:25:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:26:8: ( '>=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:26:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "RULE_ATTRIBUTE"
    public final void mRULE_ATTRIBUTE() throws RecognitionException {
        try {
            int _type = RULE_ATTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3620:16: ( 'attribute' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3620:18: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATTRIBUTE"

    // $ANTLR start "RULE_CONST"
    public final void mRULE_CONST() throws RecognitionException {
        try {
            int _type = RULE_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3622:12: ( 'const' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3622:14: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONST"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3624:11: ( 'bool' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3624:13: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3626:12: ( 'float' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3626:14: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_INTX"
    public final void mRULE_INTX() throws RecognitionException {
        try {
            int _type = RULE_INTX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3628:11: ( 'int' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3628:13: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTX"

    // $ANTLR start "RULE_UINT"
    public final void mRULE_UINT() throws RecognitionException {
        try {
            int _type = RULE_UINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3630:11: ( 'uint' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3630:13: 'uint'
            {
            match("uint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UINT"

    // $ANTLR start "RULE_BREAK"
    public final void mRULE_BREAK() throws RecognitionException {
        try {
            int _type = RULE_BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3632:12: ( 'break' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3632:14: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BREAK"

    // $ANTLR start "RULE_CONTINUE"
    public final void mRULE_CONTINUE() throws RecognitionException {
        try {
            int _type = RULE_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3634:15: ( 'continue' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3634:17: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTINUE"

    // $ANTLR start "RULE_DO"
    public final void mRULE_DO() throws RecognitionException {
        try {
            int _type = RULE_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3636:9: ( 'do' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3636:11: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3638:11: ( 'else' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3638:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3640:10: ( 'for' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3640:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3642:9: ( 'if' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3642:11: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_DISCARD"
    public final void mRULE_DISCARD() throws RecognitionException {
        try {
            int _type = RULE_DISCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3644:14: ( 'discard' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3644:16: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISCARD"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3646:13: ( 'return' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3646:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3648:13: ( 'switch' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3648:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_CASE"
    public final void mRULE_CASE() throws RecognitionException {
        try {
            int _type = RULE_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3650:11: ( 'case' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3650:13: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE"

    // $ANTLR start "RULE_DEFAULT"
    public final void mRULE_DEFAULT() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3652:14: ( 'default' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3652:16: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT"

    // $ANTLR start "RULE_BVEC2"
    public final void mRULE_BVEC2() throws RecognitionException {
        try {
            int _type = RULE_BVEC2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3654:12: ( 'bvec2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3654:14: 'bvec2'
            {
            match("bvec2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BVEC2"

    // $ANTLR start "RULE_BVEC3"
    public final void mRULE_BVEC3() throws RecognitionException {
        try {
            int _type = RULE_BVEC3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3656:12: ( 'bvec3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3656:14: 'bvec3'
            {
            match("bvec3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BVEC3"

    // $ANTLR start "RULE_BVEC4"
    public final void mRULE_BVEC4() throws RecognitionException {
        try {
            int _type = RULE_BVEC4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3658:12: ( 'bvec4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3658:14: 'bvec4'
            {
            match("bvec4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BVEC4"

    // $ANTLR start "RULE_IVEC2"
    public final void mRULE_IVEC2() throws RecognitionException {
        try {
            int _type = RULE_IVEC2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3660:12: ( 'ivec2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3660:14: 'ivec2'
            {
            match("ivec2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IVEC2"

    // $ANTLR start "RULE_IVEC3"
    public final void mRULE_IVEC3() throws RecognitionException {
        try {
            int _type = RULE_IVEC3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3662:12: ( 'ivec3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3662:14: 'ivec3'
            {
            match("ivec3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IVEC3"

    // $ANTLR start "RULE_IVEC4"
    public final void mRULE_IVEC4() throws RecognitionException {
        try {
            int _type = RULE_IVEC4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3664:12: ( 'ivec4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3664:14: 'ivec4'
            {
            match("ivec4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IVEC4"

    // $ANTLR start "RULE_UVEC2"
    public final void mRULE_UVEC2() throws RecognitionException {
        try {
            int _type = RULE_UVEC2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3666:12: ( 'uvec2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3666:14: 'uvec2'
            {
            match("uvec2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UVEC2"

    // $ANTLR start "RULE_UVEC3"
    public final void mRULE_UVEC3() throws RecognitionException {
        try {
            int _type = RULE_UVEC3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3668:12: ( 'uvec3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3668:14: 'uvec3'
            {
            match("uvec3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UVEC3"

    // $ANTLR start "RULE_UVEC4"
    public final void mRULE_UVEC4() throws RecognitionException {
        try {
            int _type = RULE_UVEC4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3670:12: ( 'uvec4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3670:14: 'uvec4'
            {
            match("uvec4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UVEC4"

    // $ANTLR start "RULE_VEC2"
    public final void mRULE_VEC2() throws RecognitionException {
        try {
            int _type = RULE_VEC2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3672:11: ( 'vec2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3672:13: 'vec2'
            {
            match("vec2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VEC2"

    // $ANTLR start "RULE_VEC3"
    public final void mRULE_VEC3() throws RecognitionException {
        try {
            int _type = RULE_VEC3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3674:11: ( 'vec3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3674:13: 'vec3'
            {
            match("vec3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VEC3"

    // $ANTLR start "RULE_VEC4"
    public final void mRULE_VEC4() throws RecognitionException {
        try {
            int _type = RULE_VEC4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3676:11: ( 'vec4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3676:13: 'vec4'
            {
            match("vec4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VEC4"

    // $ANTLR start "RULE_MAT2"
    public final void mRULE_MAT2() throws RecognitionException {
        try {
            int _type = RULE_MAT2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3678:11: ( 'mat2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3678:13: 'mat2'
            {
            match("mat2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT2"

    // $ANTLR start "RULE_MAT3"
    public final void mRULE_MAT3() throws RecognitionException {
        try {
            int _type = RULE_MAT3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3680:11: ( 'mat3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3680:13: 'mat3'
            {
            match("mat3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT3"

    // $ANTLR start "RULE_MAT4"
    public final void mRULE_MAT4() throws RecognitionException {
        try {
            int _type = RULE_MAT4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3682:11: ( 'mat4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3682:13: 'mat4'
            {
            match("mat4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT4"

    // $ANTLR start "RULE_CENTROID"
    public final void mRULE_CENTROID() throws RecognitionException {
        try {
            int _type = RULE_CENTROID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3684:15: ( 'centroid' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3684:17: 'centroid'
            {
            match("centroid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CENTROID"

    // $ANTLR start "RULE_IN"
    public final void mRULE_IN() throws RecognitionException {
        try {
            int _type = RULE_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3686:9: ( 'in' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3686:11: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IN"

    // $ANTLR start "RULE_OUT"
    public final void mRULE_OUT() throws RecognitionException {
        try {
            int _type = RULE_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3688:10: ( 'out' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3688:12: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OUT"

    // $ANTLR start "RULE_INOUT"
    public final void mRULE_INOUT() throws RecognitionException {
        try {
            int _type = RULE_INOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3690:12: ( 'inout' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3690:14: 'inout'
            {
            match("inout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INOUT"

    // $ANTLR start "RULE_UNIFORM"
    public final void mRULE_UNIFORM() throws RecognitionException {
        try {
            int _type = RULE_UNIFORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3692:14: ( 'uniform' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3692:16: 'uniform'
            {
            match("uniform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNIFORM"

    // $ANTLR start "RULE_VARYING"
    public final void mRULE_VARYING() throws RecognitionException {
        try {
            int _type = RULE_VARYING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3694:14: ( 'varying' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3694:16: 'varying'
            {
            match("varying"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARYING"

    // $ANTLR start "RULE_NOPERSPECTIVE"
    public final void mRULE_NOPERSPECTIVE() throws RecognitionException {
        try {
            int _type = RULE_NOPERSPECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3696:20: ( 'noperspective' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3696:22: 'noperspective'
            {
            match("noperspective"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOPERSPECTIVE"

    // $ANTLR start "RULE_FLAT"
    public final void mRULE_FLAT() throws RecognitionException {
        try {
            int _type = RULE_FLAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3698:11: ( 'flat' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3698:13: 'flat'
            {
            match("flat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLAT"

    // $ANTLR start "RULE_SMOOTH"
    public final void mRULE_SMOOTH() throws RecognitionException {
        try {
            int _type = RULE_SMOOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3700:13: ( 'smooth' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3700:15: 'smooth'
            {
            match("smooth"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SMOOTH"

    // $ANTLR start "RULE_LAYOUT"
    public final void mRULE_LAYOUT() throws RecognitionException {
        try {
            int _type = RULE_LAYOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3702:13: ( 'layout' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3702:15: 'layout'
            {
            match("layout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LAYOUT"

    // $ANTLR start "RULE_MAT2X2"
    public final void mRULE_MAT2X2() throws RecognitionException {
        try {
            int _type = RULE_MAT2X2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3704:13: ( 'mat2x2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3704:15: 'mat2x2'
            {
            match("mat2x2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT2X2"

    // $ANTLR start "RULE_MAT2X3"
    public final void mRULE_MAT2X3() throws RecognitionException {
        try {
            int _type = RULE_MAT2X3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3706:13: ( 'mat2x3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3706:15: 'mat2x3'
            {
            match("mat2x3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT2X3"

    // $ANTLR start "RULE_MAT2X4"
    public final void mRULE_MAT2X4() throws RecognitionException {
        try {
            int _type = RULE_MAT2X4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3708:13: ( 'mat2x4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3708:15: 'mat2x4'
            {
            match("mat2x4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT2X4"

    // $ANTLR start "RULE_MAT3X2"
    public final void mRULE_MAT3X2() throws RecognitionException {
        try {
            int _type = RULE_MAT3X2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3710:13: ( 'mat3x2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3710:15: 'mat3x2'
            {
            match("mat3x2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT3X2"

    // $ANTLR start "RULE_MAT3X3"
    public final void mRULE_MAT3X3() throws RecognitionException {
        try {
            int _type = RULE_MAT3X3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3712:13: ( 'mat3x3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3712:15: 'mat3x3'
            {
            match("mat3x3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT3X3"

    // $ANTLR start "RULE_MAT3X4"
    public final void mRULE_MAT3X4() throws RecognitionException {
        try {
            int _type = RULE_MAT3X4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3714:13: ( 'mat3x4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3714:15: 'mat3x4'
            {
            match("mat3x4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT3X4"

    // $ANTLR start "RULE_MAT4X2"
    public final void mRULE_MAT4X2() throws RecognitionException {
        try {
            int _type = RULE_MAT4X2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3716:13: ( 'mat4x2' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3716:15: 'mat4x2'
            {
            match("mat4x2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT4X2"

    // $ANTLR start "RULE_MAT4X3"
    public final void mRULE_MAT4X3() throws RecognitionException {
        try {
            int _type = RULE_MAT4X3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3718:13: ( 'mat4x3' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3718:15: 'mat4x3'
            {
            match("mat4x3"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT4X3"

    // $ANTLR start "RULE_MAT4X4"
    public final void mRULE_MAT4X4() throws RecognitionException {
        try {
            int _type = RULE_MAT4X4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3720:13: ( 'mat4x4' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3720:15: 'mat4x4'
            {
            match("mat4x4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAT4X4"

    // $ANTLR start "RULE_STRUCT"
    public final void mRULE_STRUCT() throws RecognitionException {
        try {
            int _type = RULE_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3722:13: ( 'struct' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3722:15: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRUCT"

    // $ANTLR start "RULE_VOID"
    public final void mRULE_VOID() throws RecognitionException {
        try {
            int _type = RULE_VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3724:11: ( 'void' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3724:13: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VOID"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3726:12: ( 'while' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3726:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_TYPE_NAME"
    public final void mRULE_TYPE_NAME() throws RecognitionException {
        try {
            int _type = RULE_TYPE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3728:16: ( 'WTF IS THIS?' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3728:18: 'WTF IS THIS?'
            {
            match("WTF IS THIS?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_NAME"

    // $ANTLR start "RULE_FLOATCONSTANT"
    public final void mRULE_FLOATCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_FLOATCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:20: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:22: ( '0' .. '9' )* '.' ( '0' .. '9' )+
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:22: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:23: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('.'); 
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:38: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3730:39: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATCONSTANT"

    // $ANTLR start "RULE_INTCONSTANT"
    public final void mRULE_INTCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_INTCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3732:18: ( ( '0' .. '9' )+ )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3732:20: ( '0' .. '9' )+
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3732:20: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3732:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTCONSTANT"

    // $ANTLR start "RULE_UINTCONSTANT"
    public final void mRULE_UINTCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_UINTCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3734:19: ( ( '0' .. '9' )+ ( 'u' | 'U' ) )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3734:21: ( '0' .. '9' )+ ( 'u' | 'U' )
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3734:21: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3734:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UINTCONSTANT"

    // $ANTLR start "RULE_BOOLCONSTANT"
    public final void mRULE_BOOLCONSTANT() throws RecognitionException {
        try {
            int _type = RULE_BOOLCONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3736:19: ( ( 'true' | 'false' ) )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3736:21: ( 'true' | 'false' )
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3736:21: ( 'true' | 'false' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') ) {
                alt5=1;
            }
            else if ( (LA5_0=='f') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3736:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3736:29: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLCONSTANT"

    // $ANTLR start "RULE_FIELD_SELECTION"
    public final void mRULE_FIELD_SELECTION() throws RecognitionException {
        try {
            int _type = RULE_FIELD_SELECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3738:22: ( 'what is this?' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3738:24: 'what is this?'
            {
            match("what is this?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIELD_SELECTION"

    // $ANTLR start "RULE_LEFT_OP"
    public final void mRULE_LEFT_OP() throws RecognitionException {
        try {
            int _type = RULE_LEFT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3740:14: ( '<<' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3740:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_OP"

    // $ANTLR start "RULE_RIGHT_OP"
    public final void mRULE_RIGHT_OP() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3742:15: ( '>>' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3742:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_OP"

    // $ANTLR start "RULE_INC_OP"
    public final void mRULE_INC_OP() throws RecognitionException {
        try {
            int _type = RULE_INC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3744:13: ( '++' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3744:15: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC_OP"

    // $ANTLR start "RULE_DEC_OP"
    public final void mRULE_DEC_OP() throws RecognitionException {
        try {
            int _type = RULE_DEC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3746:13: ( '--' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3746:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_OP"

    // $ANTLR start "RULE_AND_OP"
    public final void mRULE_AND_OP() throws RecognitionException {
        try {
            int _type = RULE_AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3748:13: ( '&&' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3748:15: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_OP"

    // $ANTLR start "RULE_OR_OP"
    public final void mRULE_OR_OP() throws RecognitionException {
        try {
            int _type = RULE_OR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3750:12: ( '||' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3750:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OP"

    // $ANTLR start "RULE_XOR_OP"
    public final void mRULE_XOR_OP() throws RecognitionException {
        try {
            int _type = RULE_XOR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3752:13: ( '^???' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3752:15: '^???'
            {
            match("^???"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_OP"

    // $ANTLR start "RULE_MUL_ASSIGN"
    public final void mRULE_MUL_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MUL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3754:17: ( '*=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3754:19: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_ASSIGN"

    // $ANTLR start "RULE_DIV_ASSIGN"
    public final void mRULE_DIV_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3756:17: ( '/=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3756:19: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV_ASSIGN"

    // $ANTLR start "RULE_ADD_ASSIGN"
    public final void mRULE_ADD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ADD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3758:17: ( '+=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3758:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_ASSIGN"

    // $ANTLR start "RULE_MOD_ASSIGN"
    public final void mRULE_MOD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3760:17: ( '%=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3760:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_ASSIGN"

    // $ANTLR start "RULE_LEFT_ASSIGN"
    public final void mRULE_LEFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3762:18: ( '??' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3762:20: '??'
            {
            match("??"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_ASSIGN"

    // $ANTLR start "RULE_RIGHT_ASSIGN"
    public final void mRULE_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3764:19: ( '??ASDF' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3764:21: '??ASDF'
            {
            match("??ASDF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_ASSIGN"

    // $ANTLR start "RULE_AND_ASSIGN"
    public final void mRULE_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3766:17: ( '&=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3766:19: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_ASSIGN"

    // $ANTLR start "RULE_XOR_ASSIGN"
    public final void mRULE_XOR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3768:17: ( '^=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3768:19: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_ASSIGN"

    // $ANTLR start "RULE_OR_ASSIGN"
    public final void mRULE_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3770:16: ( '|=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3770:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_ASSIGN"

    // $ANTLR start "RULE_SUB_ASSIGN"
    public final void mRULE_SUB_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_SUB_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3772:17: ( '-=' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3772:19: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUB_ASSIGN"

    // $ANTLR start "RULE_LEFT_BRACKET"
    public final void mRULE_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3774:19: ( '[' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3774:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKET"

    // $ANTLR start "RULE_RIGHT_BRACKET"
    public final void mRULE_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3776:20: ( ']' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3776:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKET"

    // $ANTLR start "RULE_LEFT_BRACE"
    public final void mRULE_LEFT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3778:17: ( '{' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3778:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACE"

    // $ANTLR start "RULE_RIGHT_BRACE"
    public final void mRULE_RIGHT_BRACE() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3780:18: ( '}' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3780:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3782:12: ( ':' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3782:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3784:16: ( ';' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3784:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_BANG"
    public final void mRULE_BANG() throws RecognitionException {
        try {
            int _type = RULE_BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3786:11: ( '!' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3786:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BANG"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3788:11: ( '+' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3788:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3790:11: ( '-' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3790:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_TILDE"
    public final void mRULE_TILDE() throws RecognitionException {
        try {
            int _type = RULE_TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3792:12: ( '~' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3792:14: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TILDE"

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3794:11: ( '*' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3794:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3796:12: ( '/' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3796:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3798:14: ( '%' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3798:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_VERTICAL_BAR"
    public final void mRULE_VERTICAL_BAR() throws RecognitionException {
        try {
            int _type = RULE_VERTICAL_BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3800:19: ( '|' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3800:21: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERTICAL_BAR"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3802:12: ( '^' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3802:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_AMPERSAND"
    public final void mRULE_AMPERSAND() throws RecognitionException {
        try {
            int _type = RULE_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3804:16: ( '&' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3804:18: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AMPERSAND"

    // $ANTLR start "RULE_QUESTION"
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3806:15: ( '?' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3806:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION"

    // $ANTLR start "RULE_INVARIANT"
    public final void mRULE_INVARIANT() throws RecognitionException {
        try {
            int _type = RULE_INVARIANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3808:16: ( 'invariant' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3808:18: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INVARIANT"

    // $ANTLR start "RULE_HIGH_PRECISION"
    public final void mRULE_HIGH_PRECISION() throws RecognitionException {
        try {
            int _type = RULE_HIGH_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3810:21: ( 'high' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3810:23: 'high'
            {
            match("high"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HIGH_PRECISION"

    // $ANTLR start "RULE_MEDIUM_PRECISION"
    public final void mRULE_MEDIUM_PRECISION() throws RecognitionException {
        try {
            int _type = RULE_MEDIUM_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3812:23: ( 'medium' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3812:25: 'medium'
            {
            match("medium"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MEDIUM_PRECISION"

    // $ANTLR start "RULE_LOW_PRECISION"
    public final void mRULE_LOW_PRECISION() throws RecognitionException {
        try {
            int _type = RULE_LOW_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3814:20: ( 'low' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3814:22: 'low'
            {
            match("low"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOW_PRECISION"

    // $ANTLR start "RULE_PRECISION"
    public final void mRULE_PRECISION() throws RecognitionException {
        try {
            int _type = RULE_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3816:16: ( 'precision' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3816:18: 'precision'
            {
            match("precision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRECISION"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3818:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3818:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3818:43: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3820:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3820:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3820:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3820:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:41: ( '\\r' )? '\\n'
                    {
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3822:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_PRECOMPILER_STATEMENT"
    public final void mRULE_PRECOMPILER_STATEMENT() throws RecognitionException {
        try {
            int _type = RULE_PRECOMPILER_STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:28: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:30: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:34: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:34: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:50: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:51: ( '\\r' )? '\\n'
                    {
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:51: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3824:51: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PRECOMPILER_STATEMENT"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3826:9: ( ( '\\r' )? '\\n' )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3826:11: ( '\\r' )? '\\n'
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3826:11: ( '\\r' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3826:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3828:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3828:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3828:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3830:16: ( . )
            // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:3830:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:8: ( T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | RULE_ATTRIBUTE | RULE_CONST | RULE_BOOL | RULE_FLOAT | RULE_INTX | RULE_UINT | RULE_BREAK | RULE_CONTINUE | RULE_DO | RULE_ELSE | RULE_FOR | RULE_IF | RULE_DISCARD | RULE_RETURN | RULE_SWITCH | RULE_CASE | RULE_DEFAULT | RULE_BVEC2 | RULE_BVEC3 | RULE_BVEC4 | RULE_IVEC2 | RULE_IVEC3 | RULE_IVEC4 | RULE_UVEC2 | RULE_UVEC3 | RULE_UVEC4 | RULE_VEC2 | RULE_VEC3 | RULE_VEC4 | RULE_MAT2 | RULE_MAT3 | RULE_MAT4 | RULE_CENTROID | RULE_IN | RULE_OUT | RULE_INOUT | RULE_UNIFORM | RULE_VARYING | RULE_NOPERSPECTIVE | RULE_FLAT | RULE_SMOOTH | RULE_LAYOUT | RULE_MAT2X2 | RULE_MAT2X3 | RULE_MAT2X4 | RULE_MAT3X2 | RULE_MAT3X3 | RULE_MAT3X4 | RULE_MAT4X2 | RULE_MAT4X3 | RULE_MAT4X4 | RULE_STRUCT | RULE_VOID | RULE_WHILE | RULE_TYPE_NAME | RULE_FLOATCONSTANT | RULE_INTCONSTANT | RULE_UINTCONSTANT | RULE_BOOLCONSTANT | RULE_FIELD_SELECTION | RULE_LEFT_OP | RULE_RIGHT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_AND_OP | RULE_OR_OP | RULE_XOR_OP | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_ADD_ASSIGN | RULE_MOD_ASSIGN | RULE_LEFT_ASSIGN | RULE_RIGHT_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_SUB_ASSIGN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_COLON | RULE_SEMICOLON | RULE_BANG | RULE_PLUS | RULE_DASH | RULE_TILDE | RULE_STAR | RULE_SLASH | RULE_PERCENT | RULE_VERTICAL_BAR | RULE_CARET | RULE_AMPERSAND | RULE_QUESTION | RULE_INVARIANT | RULE_HIGH_PRECISION | RULE_MEDIUM_PRECISION | RULE_LOW_PRECISION | RULE_PRECISION | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_PRECOMPILER_STATEMENT | RULE_NL | RULE_WS | RULE_ANY_OTHER )
        int alt16=122;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:10: T__110
                {
                mT__110(); 

                }
                break;
            case 2 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:17: T__111
                {
                mT__111(); 

                }
                break;
            case 3 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:24: T__112
                {
                mT__112(); 

                }
                break;
            case 4 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:31: T__113
                {
                mT__113(); 

                }
                break;
            case 5 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:38: T__114
                {
                mT__114(); 

                }
                break;
            case 6 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:45: T__115
                {
                mT__115(); 

                }
                break;
            case 7 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:52: T__116
                {
                mT__116(); 

                }
                break;
            case 8 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:59: T__117
                {
                mT__117(); 

                }
                break;
            case 9 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:66: T__118
                {
                mT__118(); 

                }
                break;
            case 10 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:73: T__119
                {
                mT__119(); 

                }
                break;
            case 11 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:80: T__120
                {
                mT__120(); 

                }
                break;
            case 12 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:87: T__121
                {
                mT__121(); 

                }
                break;
            case 13 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:94: T__122
                {
                mT__122(); 

                }
                break;
            case 14 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:101: T__123
                {
                mT__123(); 

                }
                break;
            case 15 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:108: T__124
                {
                mT__124(); 

                }
                break;
            case 16 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:115: T__125
                {
                mT__125(); 

                }
                break;
            case 17 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:122: RULE_ATTRIBUTE
                {
                mRULE_ATTRIBUTE(); 

                }
                break;
            case 18 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:137: RULE_CONST
                {
                mRULE_CONST(); 

                }
                break;
            case 19 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:148: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 20 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:158: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 21 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:169: RULE_INTX
                {
                mRULE_INTX(); 

                }
                break;
            case 22 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:179: RULE_UINT
                {
                mRULE_UINT(); 

                }
                break;
            case 23 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:189: RULE_BREAK
                {
                mRULE_BREAK(); 

                }
                break;
            case 24 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:200: RULE_CONTINUE
                {
                mRULE_CONTINUE(); 

                }
                break;
            case 25 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:214: RULE_DO
                {
                mRULE_DO(); 

                }
                break;
            case 26 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:222: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 27 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:232: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 28 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:241: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 29 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:249: RULE_DISCARD
                {
                mRULE_DISCARD(); 

                }
                break;
            case 30 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:262: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 31 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:274: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 32 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:286: RULE_CASE
                {
                mRULE_CASE(); 

                }
                break;
            case 33 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:296: RULE_DEFAULT
                {
                mRULE_DEFAULT(); 

                }
                break;
            case 34 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:309: RULE_BVEC2
                {
                mRULE_BVEC2(); 

                }
                break;
            case 35 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:320: RULE_BVEC3
                {
                mRULE_BVEC3(); 

                }
                break;
            case 36 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:331: RULE_BVEC4
                {
                mRULE_BVEC4(); 

                }
                break;
            case 37 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:342: RULE_IVEC2
                {
                mRULE_IVEC2(); 

                }
                break;
            case 38 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:353: RULE_IVEC3
                {
                mRULE_IVEC3(); 

                }
                break;
            case 39 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:364: RULE_IVEC4
                {
                mRULE_IVEC4(); 

                }
                break;
            case 40 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:375: RULE_UVEC2
                {
                mRULE_UVEC2(); 

                }
                break;
            case 41 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:386: RULE_UVEC3
                {
                mRULE_UVEC3(); 

                }
                break;
            case 42 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:397: RULE_UVEC4
                {
                mRULE_UVEC4(); 

                }
                break;
            case 43 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:408: RULE_VEC2
                {
                mRULE_VEC2(); 

                }
                break;
            case 44 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:418: RULE_VEC3
                {
                mRULE_VEC3(); 

                }
                break;
            case 45 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:428: RULE_VEC4
                {
                mRULE_VEC4(); 

                }
                break;
            case 46 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:438: RULE_MAT2
                {
                mRULE_MAT2(); 

                }
                break;
            case 47 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:448: RULE_MAT3
                {
                mRULE_MAT3(); 

                }
                break;
            case 48 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:458: RULE_MAT4
                {
                mRULE_MAT4(); 

                }
                break;
            case 49 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:468: RULE_CENTROID
                {
                mRULE_CENTROID(); 

                }
                break;
            case 50 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:482: RULE_IN
                {
                mRULE_IN(); 

                }
                break;
            case 51 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:490: RULE_OUT
                {
                mRULE_OUT(); 

                }
                break;
            case 52 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:499: RULE_INOUT
                {
                mRULE_INOUT(); 

                }
                break;
            case 53 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:510: RULE_UNIFORM
                {
                mRULE_UNIFORM(); 

                }
                break;
            case 54 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:523: RULE_VARYING
                {
                mRULE_VARYING(); 

                }
                break;
            case 55 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:536: RULE_NOPERSPECTIVE
                {
                mRULE_NOPERSPECTIVE(); 

                }
                break;
            case 56 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:555: RULE_FLAT
                {
                mRULE_FLAT(); 

                }
                break;
            case 57 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:565: RULE_SMOOTH
                {
                mRULE_SMOOTH(); 

                }
                break;
            case 58 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:577: RULE_LAYOUT
                {
                mRULE_LAYOUT(); 

                }
                break;
            case 59 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:589: RULE_MAT2X2
                {
                mRULE_MAT2X2(); 

                }
                break;
            case 60 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:601: RULE_MAT2X3
                {
                mRULE_MAT2X3(); 

                }
                break;
            case 61 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:613: RULE_MAT2X4
                {
                mRULE_MAT2X4(); 

                }
                break;
            case 62 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:625: RULE_MAT3X2
                {
                mRULE_MAT3X2(); 

                }
                break;
            case 63 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:637: RULE_MAT3X3
                {
                mRULE_MAT3X3(); 

                }
                break;
            case 64 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:649: RULE_MAT3X4
                {
                mRULE_MAT3X4(); 

                }
                break;
            case 65 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:661: RULE_MAT4X2
                {
                mRULE_MAT4X2(); 

                }
                break;
            case 66 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:673: RULE_MAT4X3
                {
                mRULE_MAT4X3(); 

                }
                break;
            case 67 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:685: RULE_MAT4X4
                {
                mRULE_MAT4X4(); 

                }
                break;
            case 68 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:697: RULE_STRUCT
                {
                mRULE_STRUCT(); 

                }
                break;
            case 69 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:709: RULE_VOID
                {
                mRULE_VOID(); 

                }
                break;
            case 70 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:719: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 71 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:730: RULE_TYPE_NAME
                {
                mRULE_TYPE_NAME(); 

                }
                break;
            case 72 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:745: RULE_FLOATCONSTANT
                {
                mRULE_FLOATCONSTANT(); 

                }
                break;
            case 73 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:764: RULE_INTCONSTANT
                {
                mRULE_INTCONSTANT(); 

                }
                break;
            case 74 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:781: RULE_UINTCONSTANT
                {
                mRULE_UINTCONSTANT(); 

                }
                break;
            case 75 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:799: RULE_BOOLCONSTANT
                {
                mRULE_BOOLCONSTANT(); 

                }
                break;
            case 76 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:817: RULE_FIELD_SELECTION
                {
                mRULE_FIELD_SELECTION(); 

                }
                break;
            case 77 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:838: RULE_LEFT_OP
                {
                mRULE_LEFT_OP(); 

                }
                break;
            case 78 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:851: RULE_RIGHT_OP
                {
                mRULE_RIGHT_OP(); 

                }
                break;
            case 79 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:865: RULE_INC_OP
                {
                mRULE_INC_OP(); 

                }
                break;
            case 80 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:877: RULE_DEC_OP
                {
                mRULE_DEC_OP(); 

                }
                break;
            case 81 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:889: RULE_AND_OP
                {
                mRULE_AND_OP(); 

                }
                break;
            case 82 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:901: RULE_OR_OP
                {
                mRULE_OR_OP(); 

                }
                break;
            case 83 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:912: RULE_XOR_OP
                {
                mRULE_XOR_OP(); 

                }
                break;
            case 84 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:924: RULE_MUL_ASSIGN
                {
                mRULE_MUL_ASSIGN(); 

                }
                break;
            case 85 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:940: RULE_DIV_ASSIGN
                {
                mRULE_DIV_ASSIGN(); 

                }
                break;
            case 86 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:956: RULE_ADD_ASSIGN
                {
                mRULE_ADD_ASSIGN(); 

                }
                break;
            case 87 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:972: RULE_MOD_ASSIGN
                {
                mRULE_MOD_ASSIGN(); 

                }
                break;
            case 88 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:988: RULE_LEFT_ASSIGN
                {
                mRULE_LEFT_ASSIGN(); 

                }
                break;
            case 89 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1005: RULE_RIGHT_ASSIGN
                {
                mRULE_RIGHT_ASSIGN(); 

                }
                break;
            case 90 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1023: RULE_AND_ASSIGN
                {
                mRULE_AND_ASSIGN(); 

                }
                break;
            case 91 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1039: RULE_XOR_ASSIGN
                {
                mRULE_XOR_ASSIGN(); 

                }
                break;
            case 92 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1055: RULE_OR_ASSIGN
                {
                mRULE_OR_ASSIGN(); 

                }
                break;
            case 93 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1070: RULE_SUB_ASSIGN
                {
                mRULE_SUB_ASSIGN(); 

                }
                break;
            case 94 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1086: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 95 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1104: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 96 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1123: RULE_LEFT_BRACE
                {
                mRULE_LEFT_BRACE(); 

                }
                break;
            case 97 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1139: RULE_RIGHT_BRACE
                {
                mRULE_RIGHT_BRACE(); 

                }
                break;
            case 98 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1156: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 99 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1167: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 100 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1182: RULE_BANG
                {
                mRULE_BANG(); 

                }
                break;
            case 101 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1192: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 102 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1202: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 103 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1212: RULE_TILDE
                {
                mRULE_TILDE(); 

                }
                break;
            case 104 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1223: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 105 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1233: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 106 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1244: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 107 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1257: RULE_VERTICAL_BAR
                {
                mRULE_VERTICAL_BAR(); 

                }
                break;
            case 108 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1275: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 109 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1286: RULE_AMPERSAND
                {
                mRULE_AMPERSAND(); 

                }
                break;
            case 110 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1301: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 111 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1315: RULE_INVARIANT
                {
                mRULE_INVARIANT(); 

                }
                break;
            case 112 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1330: RULE_HIGH_PRECISION
                {
                mRULE_HIGH_PRECISION(); 

                }
                break;
            case 113 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1350: RULE_MEDIUM_PRECISION
                {
                mRULE_MEDIUM_PRECISION(); 

                }
                break;
            case 114 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1372: RULE_LOW_PRECISION
                {
                mRULE_LOW_PRECISION(); 

                }
                break;
            case 115 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1391: RULE_PRECISION
                {
                mRULE_PRECISION(); 

                }
                break;
            case 116 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1406: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 117 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1422: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 118 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1438: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 119 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1454: RULE_PRECOMPILER_STATEMENT
                {
                mRULE_PRECOMPILER_STATEMENT(); 

                }
                break;
            case 120 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1481: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 121 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1489: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 122 :
                // ../at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.g:1:1497: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\70\3\uffff\1\75\1\76\1\101\1\102\1\103\1\105\1\107\1"+
        "\112\1\115\20\100\1\160\1\100\1\166\1\171\1\174\1\177\1\u0082\1"+
        "\u0084\1\u0088\1\u008a\1\u008c\7\uffff\2\100\1\uffff\1\u0096\1\u0098"+
        "\2\uffff\1\70\14\uffff\1\100\11\uffff\12\100\1\u00aa\1\u00ab\4\100"+
        "\1\u00b0\21\100\2\uffff\1\160\1\100\27\uffff\1\u00c4\10\uffff\2"+
        "\100\1\uffff\1\u0098\1\uffff\1\70\13\100\1\u00d4\1\100\1\u00d6\2"+
        "\100\2\uffff\4\100\1\uffff\14\100\1\u00ed\2\100\1\u00f0\2\100\2"+
        "\uffff\2\100\1\70\5\100\1\u00fb\1\100\1\u00fd\3\100\1\u0103\1\uffff"+
        "\1\100\1\uffff\3\100\1\u010a\4\100\1\u0111\4\100\1\u0116\1\u0117"+
        "\1\u0118\1\100\1\u011a\1\u011c\1\u011e\1\u0120\1\100\1\uffff\2\100"+
        "\2\uffff\1\u0124\1\u0125\1\100\1\70\1\u0128\1\uffff\1\100\1\u012a"+
        "\1\100\1\uffff\1\100\1\uffff\1\u012d\1\u012e\1\u012f\1\u0130\1\u0131"+
        "\1\uffff\1\u0124\1\u0132\1\100\1\u0134\1\u0135\1\u0136\1\uffff\1"+
        "\u0137\1\u0138\1\u0139\3\100\1\uffff\4\100\3\uffff\1\100\1\uffff"+
        "\1\100\1\uffff\1\100\1\uffff\1\100\1\uffff\3\100\2\uffff\1\100\1"+
        "\70\1\uffff\1\100\1\uffff\2\100\6\uffff\1\100\6\uffff\3\100\1\u0157"+
        "\1\u0158\1\u0159\1\u015a\1\100\1\u015c\1\u015d\1\u015e\1\u015f\1"+
        "\u0160\1\u0161\1\u0162\1\u0163\1\u0164\1\u0165\1\100\1\u0167\1\100"+
        "\1\70\4\100\1\u016e\1\u016f\1\u0170\4\uffff\1\u0171\12\uffff\1\100"+
        "\1\uffff\1\100\1\u0174\1\100\1\u0176\1\u0177\1\100\4\uffff\2\100"+
        "\1\uffff\1\u017b\2\uffff\1\u017c\1\100\1\u017e\2\uffff\1\100\1\uffff"+
        "\2\100\1\u0182\1\uffff";
    static final String DFA16_eofS =
        "\u0183\uffff";
    static final String DFA16_minS =
        "\1\0\1\166\3\uffff\1\75\5\60\1\75\1\74\1\75\1\164\1\141\1\157\1"+
        "\141\1\146\1\151\1\145\1\154\1\145\1\155\2\141\1\165\1\157\1\141"+
        "\1\124\1\56\1\162\1\53\1\55\1\46\3\75\1\52\1\75\1\77\7\uffff\1\151"+
        "\1\162\1\uffff\1\12\1\11\2\uffff\1\145\14\uffff\1\141\11\uffff\1"+
        "\164\1\156\1\163\1\156\1\157\2\145\1\141\1\162\1\154\2\60\1\145"+
        "\1\156\1\145\1\151\1\60\1\163\1\146\1\163\1\164\1\151\1\157\1\162"+
        "\1\143\1\162\1\151\1\164\1\144\1\164\1\160\1\171\1\167\1\106\2\uffff"+
        "\1\56\1\165\27\uffff\1\101\10\uffff\1\147\1\145\1\uffff\1\11\1\uffff"+
        "\1\162\1\154\1\164\1\162\1\163\1\145\1\164\1\154\1\141\1\143\1\141"+
        "\1\164\1\60\1\163\1\60\1\165\1\141\2\uffff\1\143\1\164\1\143\1\146"+
        "\1\uffff\1\143\1\141\1\145\1\165\1\164\1\157\1\165\1\62\1\171\1"+
        "\144\1\62\1\151\1\60\1\145\1\157\1\60\1\40\1\145\2\uffff\1\150\1"+
        "\143\1\163\1\145\1\40\1\151\1\164\1\151\1\60\1\162\1\60\1\153\1"+
        "\62\1\164\1\60\1\uffff\1\145\1\uffff\1\164\1\162\1\62\1\60\1\62"+
        "\1\157\1\141\1\165\1\60\1\162\1\143\1\164\1\143\3\60\1\151\4\60"+
        "\1\165\1\uffff\1\162\1\165\2\uffff\2\60\2\151\1\60\1\uffff\1\142"+
        "\1\60\1\156\1\uffff\1\157\1\uffff\5\60\1\uffff\2\60\1\151\3\60\1"+
        "\uffff\3\60\2\162\1\154\1\uffff\1\156\2\150\1\164\3\uffff\1\156"+
        "\1\uffff\1\62\1\uffff\1\62\1\uffff\1\62\1\uffff\1\155\1\163\1\164"+
        "\2\uffff\1\163\1\157\1\uffff\1\165\1\uffff\1\165\1\151\6\uffff\1"+
        "\141\6\uffff\1\155\1\144\1\164\4\60\1\147\12\60\1\160\1\60\1\151"+
        "\1\156\1\164\1\145\1\144\1\156\3\60\4\uffff\1\60\12\uffff\1\145"+
        "\1\uffff\1\157\1\0\1\145\2\60\1\164\4\uffff\1\143\1\156\1\uffff"+
        "\1\60\2\uffff\1\60\1\164\1\60\2\uffff\1\151\1\uffff\1\166\1\145"+
        "\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\166\3\uffff\1\75\1\71\4\172\2\75\1\76\1\164\1\157\1\166"+
        "\1\157\2\166\1\157\1\154\1\145\1\167\1\157\1\145\1\165\2\157\1\124"+
        "\1\165\1\162\3\75\1\174\1\77\3\75\1\77\7\uffff\1\151\1\162\1\uffff"+
        "\1\12\1\40\2\uffff\1\145\14\uffff\1\151\11\uffff\1\164\1\156\1\163"+
        "\1\156\1\157\2\145\1\157\1\162\1\154\2\172\1\145\1\156\1\145\1\151"+
        "\1\172\1\163\1\146\1\163\1\164\1\151\1\157\1\162\1\143\1\162\1\151"+
        "\1\164\1\144\1\164\1\160\1\171\1\167\1\106\2\uffff\2\165\27\uffff"+
        "\1\101\10\uffff\1\147\1\145\1\uffff\1\40\1\uffff\1\162\1\154\1\164"+
        "\1\162\1\164\1\145\1\164\1\154\1\141\1\143\1\141\1\164\1\172\1\163"+
        "\1\172\1\165\1\141\2\uffff\1\143\1\164\1\143\1\146\1\uffff\1\143"+
        "\1\141\1\145\1\165\1\164\1\157\1\165\1\64\1\171\1\144\1\64\1\151"+
        "\1\172\1\145\1\157\1\172\1\40\1\145\2\uffff\1\150\1\143\1\163\1"+
        "\145\1\40\1\151\1\164\1\151\1\172\1\162\1\172\1\153\1\64\1\164\1"+
        "\172\1\uffff\1\145\1\uffff\1\164\1\162\1\64\1\172\1\64\1\157\1\141"+
        "\1\165\1\172\1\162\1\143\1\164\1\143\3\172\1\151\4\172\1\165\1\uffff"+
        "\1\162\1\165\2\uffff\2\172\2\151\1\172\1\uffff\1\142\1\172\1\156"+
        "\1\uffff\1\157\1\uffff\5\172\1\uffff\2\172\1\151\3\172\1\uffff\3"+
        "\172\2\162\1\154\1\uffff\1\156\2\150\1\164\3\uffff\1\156\1\uffff"+
        "\1\64\1\uffff\1\64\1\uffff\1\64\1\uffff\1\155\1\163\1\164\2\uffff"+
        "\1\163\1\157\1\uffff\1\165\1\uffff\1\165\1\151\6\uffff\1\141\6\uffff"+
        "\1\155\1\144\1\164\4\172\1\147\12\172\1\160\1\172\1\151\1\156\1"+
        "\164\1\145\1\144\1\156\3\172\4\uffff\1\172\12\uffff\1\145\1\uffff"+
        "\1\157\1\uffff\1\145\2\172\1\164\4\uffff\1\143\1\156\1\uffff\1\172"+
        "\2\uffff\1\172\1\164\1\172\2\uffff\1\151\1\uffff\1\166\1\145\1\172"+
        "\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\44\uffff\1\136\1\137\1\140\1\141\1\142\1\143"+
        "\1\147\2\uffff\1\164\2\uffff\1\171\1\172\1\uffff\1\167\1\2\1\3\1"+
        "\4\1\14\1\5\1\6\1\110\1\164\1\7\1\10\1\11\1\uffff\1\12\1\13\1\144"+
        "\1\17\1\115\1\15\1\20\1\116\1\16\42\uffff\1\111\1\112\2\uffff\1"+
        "\117\1\126\1\145\1\120\1\135\1\146\1\121\1\132\1\155\1\122\1\134"+
        "\1\153\1\123\1\133\1\154\1\124\1\150\1\125\1\165\1\166\1\151\1\127"+
        "\1\152\1\uffff\1\156\1\136\1\137\1\140\1\141\1\142\1\143\1\147\2"+
        "\uffff\1\171\1\uffff\1\170\21\uffff\1\62\1\34\4\uffff\1\31\22\uffff"+
        "\1\131\1\130\17\uffff\1\33\1\uffff\1\25\26\uffff\1\63\2\uffff\1"+
        "\162\1\107\5\uffff\1\114\3\uffff\1\40\1\uffff\1\23\5\uffff\1\70"+
        "\6\uffff\1\26\6\uffff\1\32\4\uffff\1\53\1\54\1\55\1\uffff\1\105"+
        "\1\uffff\1\56\1\uffff\1\57\1\uffff\1\60\3\uffff\1\113\1\160\2\uffff"+
        "\1\106\1\uffff\1\22\2\uffff\1\27\1\42\1\43\1\44\1\24\1\64\1\uffff"+
        "\1\45\1\46\1\47\1\50\1\51\1\52\35\uffff\1\36\1\37\1\71\1\104\1\uffff"+
        "\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\161\1\uffff"+
        "\1\72\6\uffff\1\65\1\35\1\41\1\66\2\uffff\1\1\1\uffff\1\30\1\61"+
        "\3\uffff\1\21\1\157\1\uffff\1\163\3\uffff\1\67";
    static final String DFA16_specialS =
        "\1\0\u0168\uffff\1\1\31\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\66\1\65\1\64\2\66\1\63\22\66\1\65\1\13\1\66\1\1\1\66\1\47"+
            "\1\42\1\66\1\2\1\4\1\45\1\40\1\3\1\41\1\6\1\46\12\36\1\55\1"+
            "\56\1\14\1\5\1\15\1\50\1\66\26\62\1\35\3\62\1\51\1\66\1\52\1"+
            "\44\1\62\1\66\1\16\1\20\1\17\1\24\1\25\1\21\1\62\1\60\1\22\2"+
            "\62\1\34\1\31\1\33\1\32\1\61\1\62\1\26\1\27\1\37\1\23\1\30\1"+
            "\12\1\7\1\10\1\11\1\53\1\43\1\54\1\57\uff81\66",
            "\1\67",
            "",
            "",
            "",
            "\1\74",
            "\12\77",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\7\100\1\104\22"+
            "\100",
            "\1\106",
            "\1\111\1\110",
            "\1\113\1\114",
            "\1\116",
            "\1\120\3\uffff\1\121\11\uffff\1\117",
            "\1\122\2\uffff\1\123\3\uffff\1\124",
            "\1\127\12\uffff\1\125\2\uffff\1\126",
            "\1\131\7\uffff\1\130\7\uffff\1\132",
            "\1\133\4\uffff\1\135\7\uffff\1\134",
            "\1\140\3\uffff\1\137\5\uffff\1\136",
            "\1\141",
            "\1\142",
            "\1\144\6\uffff\1\145\2\uffff\1\143",
            "\1\147\3\uffff\1\146\11\uffff\1\150",
            "\1\151\3\uffff\1\152",
            "\1\153",
            "\1\154",
            "\1\155\15\uffff\1\156",
            "\1\157",
            "\1\77\1\uffff\12\162\33\uffff\1\161\37\uffff\1\161",
            "\1\163",
            "\1\164\21\uffff\1\165",
            "\1\167\17\uffff\1\170",
            "\1\172\26\uffff\1\173",
            "\1\176\76\uffff\1\175",
            "\1\u0081\1\uffff\1\u0080",
            "\1\u0083",
            "\1\u0086\4\uffff\1\u0087\15\uffff\1\u0085",
            "\1\u0089",
            "\1\u008b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0097",
            "\2\u0096\2\uffff\1\u0096\22\uffff\1\u0096",
            "",
            "",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009b\7\uffff\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\15\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\16\100\1\u00a8"+
            "\4\100\1\u00a7\1\100\1\u00a9\4\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "\1\77\1\uffff\12\162\33\uffff\1\161\37\uffff\1\161",
            "\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\2\u0096\2\uffff\1\u0096\22\uffff\1\u0096",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00d5",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\1\u00e5\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\1\u00ea\1\u00eb",
            "\1\u00ec",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00ee",
            "\1\u00ef",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00fc",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u00fe",
            "\1\u00ff\1\u0100\1\u0101",
            "\1\u0102",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107\1\u0108\1\u0109",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u010b\1\u010c\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0119",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\27\100\1\u011b"+
            "\2\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\27\100\1\u011d"+
            "\2\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\27\100\1\u011f"+
            "\2\100",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0126",
            "\1\u0127",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0129",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u012b",
            "",
            "\1\u012c",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0133",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "",
            "",
            "",
            "\1\u0141",
            "",
            "\1\u0142\1\u0143\1\u0144",
            "",
            "\1\u0145\1\u0146\1\u0147",
            "",
            "\1\u0148\1\u0149\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0153",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u015b",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0166",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0172",
            "",
            "\1\u0173",
            "\0\70",
            "\1\u0175",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u0178",
            "",
            "",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\u017d",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\12\100\7\uffff\32\100\4\uffff\1\100\1\uffff\32\100",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | RULE_ATTRIBUTE | RULE_CONST | RULE_BOOL | RULE_FLOAT | RULE_INTX | RULE_UINT | RULE_BREAK | RULE_CONTINUE | RULE_DO | RULE_ELSE | RULE_FOR | RULE_IF | RULE_DISCARD | RULE_RETURN | RULE_SWITCH | RULE_CASE | RULE_DEFAULT | RULE_BVEC2 | RULE_BVEC3 | RULE_BVEC4 | RULE_IVEC2 | RULE_IVEC3 | RULE_IVEC4 | RULE_UVEC2 | RULE_UVEC3 | RULE_UVEC4 | RULE_VEC2 | RULE_VEC3 | RULE_VEC4 | RULE_MAT2 | RULE_MAT3 | RULE_MAT4 | RULE_CENTROID | RULE_IN | RULE_OUT | RULE_INOUT | RULE_UNIFORM | RULE_VARYING | RULE_NOPERSPECTIVE | RULE_FLAT | RULE_SMOOTH | RULE_LAYOUT | RULE_MAT2X2 | RULE_MAT2X3 | RULE_MAT2X4 | RULE_MAT3X2 | RULE_MAT3X3 | RULE_MAT3X4 | RULE_MAT4X2 | RULE_MAT4X3 | RULE_MAT4X4 | RULE_STRUCT | RULE_VOID | RULE_WHILE | RULE_TYPE_NAME | RULE_FLOATCONSTANT | RULE_INTCONSTANT | RULE_UINTCONSTANT | RULE_BOOLCONSTANT | RULE_FIELD_SELECTION | RULE_LEFT_OP | RULE_RIGHT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_AND_OP | RULE_OR_OP | RULE_XOR_OP | RULE_MUL_ASSIGN | RULE_DIV_ASSIGN | RULE_ADD_ASSIGN | RULE_MOD_ASSIGN | RULE_LEFT_ASSIGN | RULE_RIGHT_ASSIGN | RULE_AND_ASSIGN | RULE_XOR_ASSIGN | RULE_OR_ASSIGN | RULE_SUB_ASSIGN | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_LEFT_BRACE | RULE_RIGHT_BRACE | RULE_COLON | RULE_SEMICOLON | RULE_BANG | RULE_PLUS | RULE_DASH | RULE_TILDE | RULE_STAR | RULE_SLASH | RULE_PERCENT | RULE_VERTICAL_BAR | RULE_CARET | RULE_AMPERSAND | RULE_QUESTION | RULE_INVARIANT | RULE_HIGH_PRECISION | RULE_MEDIUM_PRECISION | RULE_LOW_PRECISION | RULE_PRECISION | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_PRECOMPILER_STATEMENT | RULE_NL | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='#') ) {s = 1;}

                        else if ( (LA16_0=='(') ) {s = 2;}

                        else if ( (LA16_0==',') ) {s = 3;}

                        else if ( (LA16_0==')') ) {s = 4;}

                        else if ( (LA16_0=='=') ) {s = 5;}

                        else if ( (LA16_0=='.') ) {s = 6;}

                        else if ( (LA16_0=='x') ) {s = 7;}

                        else if ( (LA16_0=='y') ) {s = 8;}

                        else if ( (LA16_0=='z') ) {s = 9;}

                        else if ( (LA16_0=='w') ) {s = 10;}

                        else if ( (LA16_0=='!') ) {s = 11;}

                        else if ( (LA16_0=='<') ) {s = 12;}

                        else if ( (LA16_0=='>') ) {s = 13;}

                        else if ( (LA16_0=='a') ) {s = 14;}

                        else if ( (LA16_0=='c') ) {s = 15;}

                        else if ( (LA16_0=='b') ) {s = 16;}

                        else if ( (LA16_0=='f') ) {s = 17;}

                        else if ( (LA16_0=='i') ) {s = 18;}

                        else if ( (LA16_0=='u') ) {s = 19;}

                        else if ( (LA16_0=='d') ) {s = 20;}

                        else if ( (LA16_0=='e') ) {s = 21;}

                        else if ( (LA16_0=='r') ) {s = 22;}

                        else if ( (LA16_0=='s') ) {s = 23;}

                        else if ( (LA16_0=='v') ) {s = 24;}

                        else if ( (LA16_0=='m') ) {s = 25;}

                        else if ( (LA16_0=='o') ) {s = 26;}

                        else if ( (LA16_0=='n') ) {s = 27;}

                        else if ( (LA16_0=='l') ) {s = 28;}

                        else if ( (LA16_0=='W') ) {s = 29;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 30;}

                        else if ( (LA16_0=='t') ) {s = 31;}

                        else if ( (LA16_0=='+') ) {s = 32;}

                        else if ( (LA16_0=='-') ) {s = 33;}

                        else if ( (LA16_0=='&') ) {s = 34;}

                        else if ( (LA16_0=='|') ) {s = 35;}

                        else if ( (LA16_0=='^') ) {s = 36;}

                        else if ( (LA16_0=='*') ) {s = 37;}

                        else if ( (LA16_0=='/') ) {s = 38;}

                        else if ( (LA16_0=='%') ) {s = 39;}

                        else if ( (LA16_0=='?') ) {s = 40;}

                        else if ( (LA16_0=='[') ) {s = 41;}

                        else if ( (LA16_0==']') ) {s = 42;}

                        else if ( (LA16_0=='{') ) {s = 43;}

                        else if ( (LA16_0=='}') ) {s = 44;}

                        else if ( (LA16_0==':') ) {s = 45;}

                        else if ( (LA16_0==';') ) {s = 46;}

                        else if ( (LA16_0=='~') ) {s = 47;}

                        else if ( (LA16_0=='h') ) {s = 48;}

                        else if ( (LA16_0=='p') ) {s = 49;}

                        else if ( ((LA16_0>='A' && LA16_0<='V')||(LA16_0>='X' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='g'||(LA16_0>='j' && LA16_0<='k')||LA16_0=='q') ) {s = 50;}

                        else if ( (LA16_0=='\r') ) {s = 51;}

                        else if ( (LA16_0=='\n') ) {s = 52;}

                        else if ( (LA16_0=='\t'||LA16_0==' ') ) {s = 53;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='\"'||LA16_0=='$'||LA16_0=='\''||LA16_0=='@'||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_361 = input.LA(1);

                        s = -1;
                        if ( ((LA16_361>='\u0000' && LA16_361<='\uFFFF')) ) {s = 56;}

                        else s = 372;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}