package at.caks.eglipse.lang.program.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProgramLexer extends Lexer {
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

    public InternalProgramLexer() {;} 
    public InternalProgramLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProgramLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:11:7: ( 'shader' )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:11:9: 'shader'
            {
            match("shader"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "RULE_PATH"
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:148:11: ( RULE_STRING )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:148:13: RULE_STRING
            {
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATH"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:150:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:150:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:150:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:150:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:150:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:152:10: ( ( '0' .. '9' )+ )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:152:12: ( '0' .. '9' )+
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:152:12: ( '0' .. '9' )+
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
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:152:13: '0' .. '9'
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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:154:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:156:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:156:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:156:24: ( options {greedy=false; } : . )*
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
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:156:52: .
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
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:41: ( '\\r' )? '\\n'
                    {
                    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:158:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:160:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:160:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:162:16: ( . )
            // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:162:18: .
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
        // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:8: ( T__12 | RULE_PATH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=9;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:16: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 3 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:26: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 4 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:34: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 5 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:43: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 6 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:55: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 7 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:71: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 8 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:87: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 9 :
                // ../at.caks.eglipse.lang.program/src-gen/at/caks/eglipse/lang/program/parser/antlr/internal/InternalProgram.g:1:95: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\13\3\11\2\uffff\1\11\2\uffff\1\13\13\uffff\1\13\3\uffff"+
        "\2\13\1\35\1\uffff";
    static final String DFA12_eofS =
        "\36\uffff";
    static final String DFA12_minS =
        "\1\0\1\150\2\0\1\101\2\uffff\1\52\2\uffff\1\141\1\uffff\1\42\1\0"+
        "\1\uffff\1\42\1\0\5\uffff\1\144\1\0\1\uffff\1\0\1\145\1\162\1\60"+
        "\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\150\2\uffff\1\172\2\uffff\1\57\2\uffff\1\141\1\uffff"+
        "\1\165\1\uffff\1\uffff\1\165\1\uffff\5\uffff\1\144\1\uffff\1\uffff"+
        "\1\uffff\1\145\1\162\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\3\1\4\1\uffff\1\10\1\11\1\uffff\1\3\2\uffff\1\2\2\uffff"+
        "\1\2\1\4\1\6\1\7\1\10\2\uffff\1\2\4\uffff\1\1";
    static final String DFA12_specialS =
        "\1\0\1\uffff\1\2\1\1\11\uffff\1\4\2\uffff\1\6\6\uffff\1\5\1\uffff"+
        "\1\3\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\11\2\10\2\11\1\10\22\11\1\10\1\11\1\2\4\11\1\3\7\11\1\7"+
            "\12\6\7\11\32\5\3\11\1\4\1\5\1\11\22\5\1\1\7\5\uff85\11",
            "\1\12",
            "\42\15\1\16\71\15\1\14\uffa3\15",
            "\47\20\1\21\64\20\1\17\uffa3\20",
            "\32\13\4\uffff\1\13\1\uffff\32\13",
            "",
            "",
            "\1\23\4\uffff\1\24",
            "",
            "",
            "\1\26",
            "",
            "\1\27\4\uffff\1\27\64\uffff\1\27\5\uffff\1\27\3\uffff\1\27"+
            "\7\uffff\1\27\3\uffff\1\27\1\uffff\2\27",
            "\42\15\1\16\71\15\1\14\uffa3\15",
            "",
            "\1\31\4\uffff\1\31\64\uffff\1\31\5\uffff\1\31\3\uffff\1\31"+
            "\7\uffff\1\31\3\uffff\1\31\1\uffff\2\31",
            "\47\20\1\21\64\20\1\17\uffa3\20",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\42\15\1\16\71\15\1\14\uffa3\15",
            "",
            "\47\20\1\21\64\20\1\17\uffa3\20",
            "\1\33",
            "\1\34",
            "\12\13\7\uffff\32\13\4\uffff\1\13\1\uffff\32\13",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | RULE_PATH | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='\"') ) {s = 2;}

                        else if ( (LA12_0=='\'') ) {s = 3;}

                        else if ( (LA12_0=='^') ) {s = 4;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 5;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 6;}

                        else if ( (LA12_0=='/') ) {s = 7;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 8;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 9;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( (LA12_3=='\\') ) {s = 15;}

                        else if ( ((LA12_3>='\u0000' && LA12_3<='&')||(LA12_3>='(' && LA12_3<='[')||(LA12_3>=']' && LA12_3<='\uFFFF')) ) {s = 16;}

                        else if ( (LA12_3=='\'') ) {s = 17;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( (LA12_2=='\\') ) {s = 12;}

                        else if ( ((LA12_2>='\u0000' && LA12_2<='!')||(LA12_2>='#' && LA12_2<='[')||(LA12_2>=']' && LA12_2<='\uFFFF')) ) {s = 13;}

                        else if ( (LA12_2=='\"') ) {s = 14;}

                        else s = 9;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='\'') ) {s = 17;}

                        else if ( (LA12_25=='\\') ) {s = 15;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='&')||(LA12_25>='(' && LA12_25<='[')||(LA12_25>=']' && LA12_25<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( (LA12_13=='\"') ) {s = 14;}

                        else if ( (LA12_13=='\\') ) {s = 12;}

                        else if ( ((LA12_13>='\u0000' && LA12_13<='!')||(LA12_13>='#' && LA12_13<='[')||(LA12_13>=']' && LA12_13<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23=='\"') ) {s = 14;}

                        else if ( (LA12_23=='\\') ) {s = 12;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='!')||(LA12_23>='#' && LA12_23<='[')||(LA12_23>=']' && LA12_23<='\uFFFF')) ) {s = 13;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='\'') ) {s = 17;}

                        else if ( (LA12_16=='\\') ) {s = 15;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='&')||(LA12_16>='(' && LA12_16<='[')||(LA12_16>=']' && LA12_16<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}