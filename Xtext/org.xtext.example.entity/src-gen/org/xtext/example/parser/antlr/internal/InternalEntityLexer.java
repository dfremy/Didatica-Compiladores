package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityLexer extends Lexer {
    public static final int RULE_ID=11;
    public static final int RULE_WS=15;
    public static final int RULE_STRING=12;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LPAREN=5;
    public static final int RULE_MINUS=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_RPAREN=6;
    public static final int RULE_DIV=10;
    public static final int RULE_MULT=9;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_PLUS=8;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalEntityLexer() {;} 
    public InternalEntityLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEntityLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEntity.g"; }

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:406:12: ( '-' )
            // InternalEntity.g:406:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:408:11: ( '+' )
            // InternalEntity.g:408:13: '+'
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

    // $ANTLR start "RULE_DIV"
    public final void mRULE_DIV() throws RecognitionException {
        try {
            int _type = RULE_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:410:10: ( '/' )
            // InternalEntity.g:410:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV"

    // $ANTLR start "RULE_MULT"
    public final void mRULE_MULT() throws RecognitionException {
        try {
            int _type = RULE_MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:412:11: ( '*' )
            // InternalEntity.g:412:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULT"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:414:13: ( '(' )
            // InternalEntity.g:414:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:416:13: ( ')' )
            // InternalEntity.g:416:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEntity.g:418:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEntity.g:418:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEntity.g:418:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntity.g:418:11: '^'
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

            // InternalEntity.g:418:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEntity.g:
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
            // InternalEntity.g:420:10: ( ( '0' .. '9' )+ )
            // InternalEntity.g:420:12: ( '0' .. '9' )+
            {
            // InternalEntity.g:420:12: ( '0' .. '9' )+
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
            	    // InternalEntity.g:420:13: '0' .. '9'
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
            // InternalEntity.g:422:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEntity.g:422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEntity.g:422:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalEntity.g:422:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEntity.g:422:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalEntity.g:422:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEntity.g:422:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalEntity.g:422:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEntity.g:422:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalEntity.g:422:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEntity.g:422:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalEntity.g:424:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEntity.g:424:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEntity.g:424:24: ( options {greedy=false; } : . )*
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
            	    // InternalEntity.g:424:52: .
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
            // InternalEntity.g:426:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEntity.g:426:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEntity.g:426:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntity.g:426:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalEntity.g:426:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntity.g:426:41: ( '\\r' )? '\\n'
                    {
                    // InternalEntity.g:426:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalEntity.g:426:41: '\\r'
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
            // InternalEntity.g:428:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEntity.g:428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEntity.g:428:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalEntity.g:
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
            // InternalEntity.g:430:16: ( . )
            // InternalEntity.g:430:18: .
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
        // InternalEntity.g:1:8: ( RULE_MINUS | RULE_PLUS | RULE_DIV | RULE_MULT | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=13;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalEntity.g:1:10: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 2 :
                // InternalEntity.g:1:21: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 3 :
                // InternalEntity.g:1:31: RULE_DIV
                {
                mRULE_DIV(); 

                }
                break;
            case 4 :
                // InternalEntity.g:1:40: RULE_MULT
                {
                mRULE_MULT(); 

                }
                break;
            case 5 :
                // InternalEntity.g:1:50: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 6 :
                // InternalEntity.g:1:62: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 7 :
                // InternalEntity.g:1:74: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // InternalEntity.g:1:82: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalEntity.g:1:91: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalEntity.g:1:103: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalEntity.g:1:119: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalEntity.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalEntity.g:1:143: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\22\3\uffff\1\15\2\uffff\2\15\16\uffff";
    static final String DFA12_eofS =
        "\32\uffff";
    static final String DFA12_minS =
        "\1\0\2\uffff\1\52\3\uffff\1\101\2\uffff\2\0\16\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\uffff\1\57\3\uffff\1\172\2\uffff\2\uffff\16\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\7\1\10\2\uffff\1\14\1\15\1\1\1\2\1\12\1\13\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\14";
    static final String DFA12_specialS =
        "\1\2\11\uffff\1\1\1\0\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\15\2\14\2\15\1\14\22\15\1\14\1\15\1\12\4\15\1\13\1\5\1\6\1\4\1\2\1\15\1\1\1\15\1\3\12\11\7\15\32\10\3\15\1\7\1\10\1\15\32\10\uff85\15",
            "",
            "",
            "\1\20\4\uffff\1\21",
            "",
            "",
            "",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\30",
            "\0\30",
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
            return "1:1: Tokens : ( RULE_MINUS | RULE_PLUS | RULE_DIV | RULE_MULT | RULE_LPAREN | RULE_RPAREN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 24;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 24;}

                        else s = 13;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='+') ) {s = 2;}

                        else if ( (LA12_0=='/') ) {s = 3;}

                        else if ( (LA12_0=='*') ) {s = 4;}

                        else if ( (LA12_0=='(') ) {s = 5;}

                        else if ( (LA12_0==')') ) {s = 6;}

                        else if ( (LA12_0=='^') ) {s = 7;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 8;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 12;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0==','||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 13;}

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