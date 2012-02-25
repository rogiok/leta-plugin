package org.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLetaLexer extends Lexer {
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=7;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_DATE_TIME=9;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MINUS_FLOAT=6;
    public static final int RULE_MINUS_INTEGER=8;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=11;

    // delegates
    // delegators

    public InternalLetaLexer() {;} 
    public InternalLetaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLetaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:11:7: ( '!=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:11:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:12:7: ( 'And' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:12:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:13:7: ( 'Or' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:13:9: 'Or'
            {
            match("Or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:14:7: ( '+' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:14:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:15:7: ( '-' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:16:7: ( '/' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:16:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:17:7: ( '*' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:18:7: ( '%' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:18:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:19:7: ( '**' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:19:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:20:7: ( 'null' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:20:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:21:7: ( 'Test' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:21:9: 'Test'
            {
            match("Test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:22:7: ( 'Verify' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:22:9: 'Verify'
            {
            match("Verify"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:23:7: ( 'When' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:23:9: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:24:7: ( 'Set' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:24:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:25:7: ( '{' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:25:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:26:7: ( '}' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:26:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:27:7: ( '(' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:28:7: ( ')' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:29:7: ( '@' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:29:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:30:7: ( 'atLeast' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:30:9: 'atLeast'
            {
            match("atLeast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:31:7: ( 'atMost' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:31:9: 'atMost'
            {
            match("atMost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:32:7: ( 'exactly' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:32:9: 'exactly'
            {
            match("exactly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:33:7: ( 'atLeastAndAtMost' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:33:9: 'atLeastAndAtMost'
            {
            match("atLeastAndAtMost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:34:7: ( '=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:35:7: ( ',' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:35:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:36:7: ( 'Package' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:36:9: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:37:7: ( '.' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:37:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:38:7: ( '>' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:38:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:39:7: ( '<' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:39:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:40:7: ( '>=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:40:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:41:7: ( '<=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:41:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4799:21: ( '0' .. '9' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4799:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_MINUS_INTEGER"
    public final void mRULE_MINUS_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_MINUS_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4801:20: ( '-' ( RULE_DIGIT )+ )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4801:22: '-' ( RULE_DIGIT )+
            {
            match('-'); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4801:26: ( RULE_DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4801:26: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_INTEGER"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:12: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:14: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:14: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:14: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

            match('.'); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:30: ( RULE_DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4803:30: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_MINUS_FLOAT"
    public final void mRULE_MINUS_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_MINUS_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:18: ( '-' ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:20: '-' ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
            {
            match('-'); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:24: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:24: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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

            match('.'); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:40: ( RULE_DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4805:40: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_FLOAT"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:16: ( '[' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )? ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )? ']' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:18: '[' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )? ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )? ']'
            {
            match('['); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:22: ( RULE_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:22: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:34: ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:35: '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )?
                    {
                    match('-'); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:39: ( RULE_DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:39: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:51: ( '-' ( RULE_DIGIT )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:52: '-' ( RULE_DIGIT )+
                            {
                            match('-'); 
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:56: ( RULE_DIGIT )+
                            int cnt8=0;
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:56: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt8 >= 1 ) break loop8;
                                        EarlyExitException eee =
                                            new EarlyExitException(8, input);
                                        throw eee;
                                }
                                cnt8++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:72: ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:73: ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )?
                    {
                    match(' '); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:77: ( RULE_DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:77: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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

                    match(':'); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:93: ( RULE_DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:93: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:105: ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==':') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:106: ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )?
                            {
                            match(':'); 
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:110: ( RULE_DIGIT )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:110: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
                            } while (true);

                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:122: ( '.' ( RULE_DIGIT )+ )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='.') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:123: '.' ( RULE_DIGIT )+
                                    {
                                    match('.'); 
                                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:127: ( RULE_DIGIT )+
                                    int cnt14=0;
                                    loop14:
                                    do {
                                        int alt14=2;
                                        int LA14_0 = input.LA(1);

                                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                            alt14=1;
                                        }


                                        switch (alt14) {
                                    	case 1 :
                                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:127: RULE_DIGIT
                                    	    {
                                    	    mRULE_DIGIT(); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt14 >= 1 ) break loop14;
                                                EarlyExitException eee =
                                                    new EarlyExitException(14, input);
                                                throw eee;
                                        }
                                        cnt14++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:143: ( 'AM' | 'PM' )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='A') ) {
                        alt17=1;
                    }
                    else if ( (LA17_0=='P') ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:144: 'AM'
                            {
                            match("AM"); 


                            }
                            break;
                        case 2 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:149: 'PM'
                            {
                            match("PM"); 


                            }
                            break;

                    }

                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:156: ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='+'||LA20_0=='-') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:157: ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:167: ( RULE_DIGIT )+
                            int cnt18=0;
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:167: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt18 >= 1 ) break loop18;
                                        EarlyExitException eee =
                                            new EarlyExitException(18, input);
                                        throw eee;
                                }
                                cnt18++;
                            } while (true);

                            match(':'); 
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:183: ( RULE_DIGIT )+
                            int cnt19=0;
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4807:183: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt19 >= 1 ) break loop19;
                                        EarlyExitException eee =
                                            new EarlyExitException(19, input);
                                        throw eee;
                                }
                                cnt19++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4809:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4809:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4809:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4809:11: '^'
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

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4809:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:
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
            	    break loop23;
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4811:10: ( ( '0' .. '9' )+ )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4811:12: ( '0' .. '9' )+
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4811:12: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4811:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\"') ) {
                alt27=1;
            }
            else if ( (LA27_0=='\'') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0=='\\') ) {
                            alt25=1;
                        }
                        else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop25;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4813:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop26;
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4815:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4815:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4815:24: ( options {greedy=false; } : . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='*') ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1=='/') ) {
                        alt28=2;
                    }
                    else if ( ((LA28_1>='\u0000' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='\uFFFF')) ) {
                        alt28=1;
                    }


                }
                else if ( ((LA28_0>='\u0000' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4815:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop29;
                }
            } while (true);

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:40: ( ( '\\r' )? '\\n' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:41: ( '\\r' )? '\\n'
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:41: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4817:41: '\\r'
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4819:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4819:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4819:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4821:16: ( . )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4821:18: .
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
        // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_MINUS_INTEGER | RULE_FLOAT | RULE_MINUS_FLOAT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt33=42;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:196: RULE_MINUS_INTEGER
                {
                mRULE_MINUS_INTEGER(); 

                }
                break;
            case 33 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:215: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 34 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:226: RULE_MINUS_FLOAT
                {
                mRULE_MINUS_FLOAT(); 

                }
                break;
            case 35 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:243: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 36 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:258: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:266: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:275: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:287: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:303: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:319: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1:327: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\1\uffff\1\42\2\45\1\uffff\1\50\1\54\1\56\1\uffff\5\45\5\uffff\2"+
        "\45\2\uffff\1\45\1\uffff\1\101\1\103\1\104\2\42\1\uffff\2\42\3\uffff"+
        "\1\45\1\uffff\1\113\2\uffff\1\114\6\uffff\5\45\5\uffff\2\45\2\uffff"+
        "\1\45\7\uffff\1\104\3\uffff\1\127\3\uffff\4\45\1\134\4\45\1\uffff"+
        "\1\141\1\142\1\45\1\144\1\uffff\4\45\2\uffff\1\45\1\uffff\4\45\1"+
        "\156\1\45\1\160\2\45\1\uffff\1\164\1\uffff\1\165\1\166\1\45\3\uffff"+
        "\7\45\1\177\1\uffff";
    static final String DFA33_eofS =
        "\u0080\uffff";
    static final String DFA33_minS =
        "\1\0\1\75\1\156\1\162\1\uffff\1\60\2\52\1\uffff\1\165\2\145\1\150"+
        "\1\145\5\uffff\1\164\1\170\2\uffff\1\141\1\uffff\2\75\1\56\1\60"+
        "\1\101\1\uffff\2\0\3\uffff\1\144\1\uffff\1\60\2\uffff\1\56\6\uffff"+
        "\1\154\1\163\1\162\1\145\1\164\5\uffff\1\114\1\141\2\uffff\1\143"+
        "\7\uffff\1\56\3\uffff\1\60\3\uffff\1\154\1\164\1\151\1\156\1\60"+
        "\1\145\1\157\1\143\1\153\1\uffff\2\60\1\146\1\60\1\uffff\1\141\1"+
        "\163\1\164\1\141\2\uffff\1\171\1\uffff\1\163\1\164\1\154\1\147\1"+
        "\60\1\164\1\60\1\171\1\145\1\uffff\1\60\1\uffff\2\60\1\156\3\uffff"+
        "\1\144\1\101\1\164\1\115\1\157\1\163\1\164\1\60\1\uffff";
    static final String DFA33_maxS =
        "\1\uffff\1\75\1\156\1\162\1\uffff\1\71\1\57\1\52\1\uffff\1\165\2"+
        "\145\1\150\1\145\5\uffff\1\164\1\170\2\uffff\1\141\1\uffff\2\75"+
        "\2\71\1\172\1\uffff\2\uffff\3\uffff\1\144\1\uffff\1\172\2\uffff"+
        "\1\71\6\uffff\1\154\1\163\1\162\1\145\1\164\5\uffff\1\115\1\141"+
        "\2\uffff\1\143\7\uffff\1\71\3\uffff\1\172\3\uffff\1\154\1\164\1"+
        "\151\1\156\1\172\1\145\1\157\1\143\1\153\1\uffff\2\172\1\146\1\172"+
        "\1\uffff\1\141\1\163\1\164\1\141\2\uffff\1\171\1\uffff\1\163\1\164"+
        "\1\154\1\147\1\172\1\164\1\172\1\171\1\145\1\uffff\1\172\1\uffff"+
        "\2\172\1\156\3\uffff\1\144\1\101\1\164\1\115\1\157\1\163\1\164\1"+
        "\172\1\uffff";
    static final String DFA33_acceptS =
        "\4\uffff\1\4\3\uffff\1\10\5\uffff\1\17\1\20\1\21\1\22\1\23\2\uffff"+
        "\1\30\1\31\1\uffff\1\33\5\uffff\1\44\2\uffff\1\51\1\52\1\1\1\uffff"+
        "\1\44\1\uffff\1\4\1\5\1\uffff\1\47\1\50\1\6\1\11\1\7\1\10\5\uffff"+
        "\1\17\1\20\1\21\1\22\1\23\2\uffff\1\30\1\31\1\uffff\1\33\1\36\1"+
        "\34\1\37\1\35\1\45\1\41\1\uffff\1\43\1\46\1\51\1\uffff\1\3\1\40"+
        "\1\42\11\uffff\1\2\4\uffff\1\16\4\uffff\1\12\1\13\1\uffff\1\15\11"+
        "\uffff\1\14\1\uffff\1\25\3\uffff\1\24\1\26\1\32\10\uffff\1\27";
    static final String DFA33_specialS =
        "\1\1\36\uffff\1\2\1\0\137\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\1\1\1\37\2\42\1\10\1\42\1\40"+
            "\1\20\1\21\1\7\1\4\1\26\1\5\1\30\1\6\12\33\2\42\1\32\1\25\1"+
            "\31\1\42\1\22\1\2\15\36\1\3\1\27\2\36\1\15\1\12\1\36\1\13\1"+
            "\14\3\36\1\34\2\42\1\35\1\36\1\42\1\23\3\36\1\24\10\36\1\11"+
            "\14\36\1\16\1\42\1\17\uff82\42",
            "\1\43",
            "\1\44",
            "\1\46",
            "",
            "\12\51",
            "\1\52\4\uffff\1\53",
            "\1\55",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\76",
            "",
            "\1\100",
            "\1\102",
            "\1\105\1\uffff\12\106",
            "\12\107",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\0\110",
            "\0\110",
            "",
            "",
            "",
            "\1\112",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\115\1\uffff\12\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123\1\124",
            "\1\125",
            "",
            "",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\1\uffff\12\106",
            "",
            "",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\143",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\157",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\161",
            "\1\162",
            "",
            "\12\45\7\uffff\1\163\31\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\167",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_MINUS_INTEGER | RULE_FLOAT | RULE_MINUS_FLOAT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_32 = input.LA(1);

                        s = -1;
                        if ( ((LA33_32>='\u0000' && LA33_32<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_0 = input.LA(1);

                        s = -1;
                        if ( (LA33_0=='!') ) {s = 1;}

                        else if ( (LA33_0=='A') ) {s = 2;}

                        else if ( (LA33_0=='O') ) {s = 3;}

                        else if ( (LA33_0=='+') ) {s = 4;}

                        else if ( (LA33_0=='-') ) {s = 5;}

                        else if ( (LA33_0=='/') ) {s = 6;}

                        else if ( (LA33_0=='*') ) {s = 7;}

                        else if ( (LA33_0=='%') ) {s = 8;}

                        else if ( (LA33_0=='n') ) {s = 9;}

                        else if ( (LA33_0=='T') ) {s = 10;}

                        else if ( (LA33_0=='V') ) {s = 11;}

                        else if ( (LA33_0=='W') ) {s = 12;}

                        else if ( (LA33_0=='S') ) {s = 13;}

                        else if ( (LA33_0=='{') ) {s = 14;}

                        else if ( (LA33_0=='}') ) {s = 15;}

                        else if ( (LA33_0=='(') ) {s = 16;}

                        else if ( (LA33_0==')') ) {s = 17;}

                        else if ( (LA33_0=='@') ) {s = 18;}

                        else if ( (LA33_0=='a') ) {s = 19;}

                        else if ( (LA33_0=='e') ) {s = 20;}

                        else if ( (LA33_0=='=') ) {s = 21;}

                        else if ( (LA33_0==',') ) {s = 22;}

                        else if ( (LA33_0=='P') ) {s = 23;}

                        else if ( (LA33_0=='.') ) {s = 24;}

                        else if ( (LA33_0=='>') ) {s = 25;}

                        else if ( (LA33_0=='<') ) {s = 26;}

                        else if ( ((LA33_0>='0' && LA33_0<='9')) ) {s = 27;}

                        else if ( (LA33_0=='[') ) {s = 28;}

                        else if ( (LA33_0=='^') ) {s = 29;}

                        else if ( ((LA33_0>='B' && LA33_0<='N')||(LA33_0>='Q' && LA33_0<='R')||LA33_0=='U'||(LA33_0>='X' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='b' && LA33_0<='d')||(LA33_0>='f' && LA33_0<='m')||(LA33_0>='o' && LA33_0<='z')) ) {s = 30;}

                        else if ( (LA33_0=='\"') ) {s = 31;}

                        else if ( (LA33_0=='\'') ) {s = 32;}

                        else if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {s = 33;}

                        else if ( ((LA33_0>='\u0000' && LA33_0<='\b')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\u001F')||(LA33_0>='#' && LA33_0<='$')||LA33_0=='&'||(LA33_0>=':' && LA33_0<=';')||LA33_0=='?'||(LA33_0>='\\' && LA33_0<=']')||LA33_0=='`'||LA33_0=='|'||(LA33_0>='~' && LA33_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_31 = input.LA(1);

                        s = -1;
                        if ( ((LA33_31>='\u0000' && LA33_31<='\uFFFF')) ) {s = 72;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}