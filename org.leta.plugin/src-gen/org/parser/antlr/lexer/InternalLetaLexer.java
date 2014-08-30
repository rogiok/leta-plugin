package org.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLetaLexer extends Lexer {
    public static final int RULE_ID=40;
    public static final int RULE_ANY_OTHER=46;
    public static final int KEYWORD_19=18;
    public static final int KEYWORD_17=16;
    public static final int KEYWORD_18=17;
    public static final int KEYWORD_15=34;
    public static final int KEYWORD_16=15;
    public static final int KEYWORD_13=32;
    public static final int KEYWORD_14=33;
    public static final int KEYWORD_11=30;
    public static final int EOF=-1;
    public static final int KEYWORD_12=31;
    public static final int KEYWORD_10=29;
    public static final int KEYWORD_6=25;
    public static final int KEYWORD_7=26;
    public static final int KEYWORD_8=27;
    public static final int KEYWORD_9=28;
    public static final int KEYWORD_28=5;
    public static final int KEYWORD_29=6;
    public static final int RULE_INT=41;
    public static final int KEYWORD_24=11;
    public static final int KEYWORD_25=12;
    public static final int KEYWORD_26=8;
    public static final int KEYWORD_27=9;
    public static final int KEYWORD_20=19;
    public static final int KEYWORD_21=13;
    public static final int KEYWORD_22=14;
    public static final int KEYWORD_23=10;
    public static final int KEYWORD_30=7;
    public static final int KEYWORD_1=20;
    public static final int KEYWORD_5=24;
    public static final int KEYWORD_4=23;
    public static final int KEYWORD_3=22;
    public static final int KEYWORD_31=4;
    public static final int KEYWORD_2=21;
    public static final int RULE_FLOAT=37;
    public static final int RULE_SL_COMMENT=44;
    public static final int RULE_ML_COMMENT=43;
    public static final int RULE_STRING=42;
    public static final int RULE_DATE_TIME=39;
    public static final int RULE_MINUS_FLOAT=38;
    public static final int RULE_MINUS_INTEGER=36;
    public static final int RULE_WS=45;
    public static final int RULE_DIGIT=35;

    // delegates
    // delegators

    public InternalLetaLexer() {;} 
    public InternalLetaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLetaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g"; }

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:19:12: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:19:14: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:21:12: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:21:14: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:23:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'Y' | 'y' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:23:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'L' | 'l' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:25:12: ( ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:25:14: ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'K' | 'k' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:27:12: ( ( 'A' | 'a' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:27:14: ( 'A' | 'a' ) ( 'T' | 't' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:29:12: ( ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'Y' | 'y' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:29:14: ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:31:12: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:31:14: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:33:12: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:33:14: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:35:12: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:35:14: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:37:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:37:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:39:12: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:39:14: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:41:12: ( '!' '=' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:41:14: '!' '='
            {
            match('!'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:43:12: ( '*' '*' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:43:14: '*' '*'
            {
            match('*'); 
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:45:12: ( '<' '=' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:45:14: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:47:12: ( '>' '=' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:47:14: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:49:12: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:49:14: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:51:11: ( '%' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:51:13: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:53:11: ( '(' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:53:13: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:55:11: ( ')' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:55:13: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:57:11: ( '*' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:57:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:59:11: ( '+' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:59:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:61:11: ( ',' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:61:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:63:11: ( '-' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:63:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:65:11: ( '.' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:65:13: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:67:11: ( '/' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:67:13: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:69:12: ( '<' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:69:14: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:71:12: ( '=' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:71:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:73:12: ( '>' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:73:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:75:12: ( '@' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:75:14: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:77:12: ( '{' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:77:14: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:79:12: ( '}' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:79:14: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:83:21: ( '0' .. '9' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:83:23: '0' .. '9'
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:85:20: ( '-' ( RULE_DIGIT )+ )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:85:22: '-' ( RULE_DIGIT )+
            {
            match('-'); 
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:85:26: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:85:26: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:12: ( ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:14: ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:14: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:14: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:30: ( RULE_DIGIT )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:87:30: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:18: ( '-' ( RULE_DIGIT )+ '.' ( RULE_DIGIT )* )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:20: '-' ( RULE_DIGIT )+ '.' ( RULE_DIGIT )*
            {
            match('-'); 
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:24: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:24: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:40: ( RULE_DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:89:40: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:16: ( '[' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )? ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )? ']' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:18: '[' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )? ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )? ']'
            {
            match('['); 
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:22: ( RULE_DIGIT )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:22: RULE_DIGIT
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:34: ( '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:35: '-' ( RULE_DIGIT )+ ( '-' ( RULE_DIGIT )+ )?
                    {
                    match('-'); 
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:39: ( RULE_DIGIT )+
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:39: RULE_DIGIT
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:51: ( '-' ( RULE_DIGIT )+ )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:52: '-' ( RULE_DIGIT )+
                            {
                            match('-'); 
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:56: ( RULE_DIGIT )+
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
                            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:56: RULE_DIGIT
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:72: ( ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==' ') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:73: ' ' ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )?
                    {
                    match(' '); 
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:77: ( RULE_DIGIT )+
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:77: RULE_DIGIT
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:93: ( RULE_DIGIT )+
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:93: RULE_DIGIT
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:105: ( ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==':') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:106: ':' ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )?
                            {
                            match(':'); 
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:110: ( RULE_DIGIT )+
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
                            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:110: RULE_DIGIT
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

                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:122: ( '.' ( RULE_DIGIT )+ )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='.') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:123: '.' ( RULE_DIGIT )+
                                    {
                                    match('.'); 
                                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:127: ( RULE_DIGIT )+
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
                                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:127: RULE_DIGIT
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:143: ( 'AM' | 'PM' )?
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
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:144: 'AM'
                            {
                            match("AM"); 


                            }
                            break;
                        case 2 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:149: 'PM'
                            {
                            match("PM"); 


                            }
                            break;

                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:156: ( ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+ )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='+'||LA20_0=='-') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:157: ( '+' | '-' ) ( RULE_DIGIT )+ ':' ( RULE_DIGIT )+
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:167: ( RULE_DIGIT )+
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
                            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:167: RULE_DIGIT
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
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:183: ( RULE_DIGIT )+
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
                            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:91:183: RULE_DIGIT
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:93:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:93:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:93:11: ( '^' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='^') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:93:11: '^'
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:93:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:95:10: ( ( '0' .. '9' )+ )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:95:12: ( '0' .. '9' )+
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:95:12: ( '0' .. '9' )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:95:13: '0' .. '9'
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:97:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:99:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:99:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:99:24: ( options {greedy=false; } : . )*
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:99:52: .
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:40: ( ( '\\r' )? '\\n' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:41: ( '\\r' )? '\\n'
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:41: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:101:41: '\\r'
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:103:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:103:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:103:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:105:16: ( . )
            // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:105:18: .
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
        // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:8: ( KEYWORD_31 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_26 | KEYWORD_27 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_21 | KEYWORD_22 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | RULE_MINUS_INTEGER | RULE_FLOAT | RULE_MINUS_FLOAT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt33=42;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:10: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 2 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:21: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 3 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:32: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 4 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:43: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 5 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:54: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 6 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:65: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 7 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:76: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 8 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:87: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 9 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:98: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 10 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:109: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 11 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:120: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 12 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:131: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 13 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:142: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 14 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:153: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 15 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:164: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 16 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:175: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 17 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:186: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 18 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:196: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 19 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:206: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 20 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:216: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 21 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:226: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 22 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:236: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 23 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:246: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 24 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:256: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 25 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:266: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 26 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:276: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 27 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:287: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 28 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:298: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 29 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:309: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 30 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:320: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 31 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:331: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 32 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:342: RULE_MINUS_INTEGER
                {
                mRULE_MINUS_INTEGER(); 

                }
                break;
            case 33 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:361: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 34 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:372: RULE_MINUS_FLOAT
                {
                mRULE_MINUS_FLOAT(); 

                }
                break;
            case 35 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:389: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 36 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:404: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 37 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:412: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 38 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:421: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 39 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:433: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 40 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:449: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 41 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:465: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 42 :
                // ../org.leta.plugin/src-gen/org/parser/antlr/lexer/InternalLetaLexer.g:1:473: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\1\uffff\10\44\1\41\1\56\1\60\1\62\1\44\5\uffff\1\71\1\uffff\1\76"+
        "\4\uffff\1\103\2\41\1\uffff\2\41\2\uffff\2\44\1\uffff\7\44\7\uffff"+
        "\1\123\6\uffff\1\124\12\uffff\1\103\3\uffff\2\44\1\130\6\44\1\137"+
        "\3\uffff\2\44\1\uffff\3\44\1\145\1\146\1\147\1\uffff\5\44\3\uffff"+
        "\1\44\1\156\2\44\1\161\1\163\1\uffff\1\164\1\165\1\uffff\1\44\3"+
        "\uffff\7\44\1\176\1\uffff";
    static final String DFA33_eofS =
        "\177\uffff";
    static final String DFA33_minS =
        "\1\0\1\116\1\130\1\101\2\105\1\125\1\110\1\105\1\75\1\52\2\75\1"+
        "\122\5\uffff\1\60\1\uffff\1\52\4\uffff\1\56\1\60\1\101\1\uffff\2"+
        "\0\2\uffff\1\114\1\104\1\uffff\1\101\1\103\1\122\1\123\1\114\1\105"+
        "\1\124\7\uffff\1\60\6\uffff\1\56\12\uffff\1\56\3\uffff\1\105\1\117"+
        "\1\60\1\103\1\113\1\111\1\124\1\114\1\116\1\60\3\uffff\1\101\1\123"+
        "\1\uffff\1\124\1\101\1\106\3\60\1\uffff\1\123\1\124\1\114\1\107"+
        "\1\131\3\uffff\1\124\1\60\1\131\1\105\2\60\1\uffff\2\60\1\uffff"+
        "\1\116\3\uffff\1\104\1\101\1\124\1\115\1\117\1\123\1\124\1\60\1"+
        "\uffff";
    static final String DFA33_maxS =
        "\1\uffff\1\164\1\170\1\141\2\145\1\165\1\150\1\145\1\75\1\52\2\75"+
        "\1\162\5\uffff\1\71\1\uffff\1\57\4\uffff\2\71\1\172\1\uffff\2\uffff"+
        "\2\uffff\1\155\1\144\1\uffff\1\141\1\143\1\162\1\163\1\154\1\145"+
        "\1\164\7\uffff\1\172\6\uffff\1\71\12\uffff\1\71\3\uffff\1\145\1"+
        "\157\1\172\1\143\1\153\1\151\1\164\1\154\1\156\1\172\3\uffff\1\141"+
        "\1\163\1\uffff\1\164\1\141\1\146\3\172\1\uffff\1\163\1\164\1\154"+
        "\1\147\1\171\3\uffff\1\164\1\172\1\171\1\145\2\172\1\uffff\2\172"+
        "\1\uffff\1\156\3\uffff\1\144\1\141\1\164\1\155\1\157\1\163\1\164"+
        "\1\172\1\uffff";
    static final String DFA33_acceptS =
        "\16\uffff\1\21\1\22\1\23\1\25\1\26\1\uffff\1\30\1\uffff\1\33\1\35"+
        "\1\36\1\37\3\uffff\1\44\2\uffff\1\51\1\52\2\uffff\1\44\7\uffff\1"+
        "\14\1\15\1\24\1\16\1\32\1\17\1\34\1\uffff\1\21\1\22\1\23\1\25\1"+
        "\26\1\27\1\uffff\1\30\1\47\1\50\1\31\1\33\1\35\1\36\1\37\1\45\1"+
        "\41\1\uffff\1\43\1\46\1\51\12\uffff\1\20\1\40\1\42\2\uffff\1\12"+
        "\6\uffff\1\13\5\uffff\1\7\1\10\1\11\6\uffff\1\5\2\uffff\1\6\1\uffff"+
        "\1\2\1\3\1\4\10\uffff\1\1";
    static final String DFA33_specialS =
        "\1\0\35\uffff\1\2\1\1\137\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\11\1\36\2\41\1\16\1\41\1"+
            "\37\1\17\1\20\1\12\1\21\1\22\1\23\1\24\1\25\12\32\2\41\1\13"+
            "\1\26\1\14\1\41\1\27\1\1\3\35\1\2\10\35\1\6\1\15\1\3\2\35\1"+
            "\10\1\5\1\35\1\4\1\7\3\35\1\33\2\41\1\34\1\35\1\41\1\1\3\35"+
            "\1\2\10\35\1\6\1\15\1\3\2\35\1\10\1\5\1\35\1\4\1\7\3\35\1\30"+
            "\1\41\1\31\uff82\41",
            "\1\43\5\uffff\1\42\31\uffff\1\43\5\uffff\1\42",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\1\47\37\uffff\1\47",
            "\1\50\37\uffff\1\50",
            "\1\51\37\uffff\1\51",
            "\1\52\37\uffff\1\52",
            "\1\53\37\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\63\37\uffff\1\63",
            "",
            "",
            "",
            "",
            "",
            "\12\72",
            "",
            "\1\74\4\uffff\1\75",
            "",
            "",
            "",
            "",
            "\1\104\1\uffff\12\105",
            "\12\106",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\107",
            "\0\107",
            "",
            "",
            "\1\111\1\112\36\uffff\1\111\1\112",
            "\1\113\37\uffff\1\113",
            "",
            "\1\114\37\uffff\1\114",
            "\1\115\37\uffff\1\115",
            "\1\116\37\uffff\1\116",
            "\1\117\37\uffff\1\117",
            "\1\120\37\uffff\1\120",
            "\1\121\37\uffff\1\121",
            "\1\122\37\uffff\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125\1\uffff\12\72",
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
            "\1\104\1\uffff\12\105",
            "",
            "",
            "",
            "\1\126\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\131\37\uffff\1\131",
            "\1\132\37\uffff\1\132",
            "\1\133\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\135",
            "\1\136\37\uffff\1\136",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "\1\140\37\uffff\1\140",
            "\1\141\37\uffff\1\141",
            "",
            "\1\142\37\uffff\1\142",
            "\1\143\37\uffff\1\143",
            "\1\144\37\uffff\1\144",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\150\37\uffff\1\150",
            "\1\151\37\uffff\1\151",
            "\1\152\37\uffff\1\152",
            "\1\153\37\uffff\1\153",
            "\1\154\37\uffff\1\154",
            "",
            "",
            "",
            "\1\155\37\uffff\1\155",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\157\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\1\162\31\44\4\uffff\1\44\1\uffff\1\162\31\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\166\37\uffff\1\166",
            "",
            "",
            "",
            "\1\167\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\173\37\uffff\1\173",
            "\1\174\37\uffff\1\174",
            "\1\175\37\uffff\1\175",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( KEYWORD_31 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_26 | KEYWORD_27 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_21 | KEYWORD_22 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | RULE_MINUS_INTEGER | RULE_FLOAT | RULE_MINUS_FLOAT | RULE_DATE_TIME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                        s = -1;
                        if ( (LA33_0=='A'||LA33_0=='a') ) {s = 1;}

                        else if ( (LA33_0=='E'||LA33_0=='e') ) {s = 2;}

                        else if ( (LA33_0=='P'||LA33_0=='p') ) {s = 3;}

                        else if ( (LA33_0=='V'||LA33_0=='v') ) {s = 4;}

                        else if ( (LA33_0=='T'||LA33_0=='t') ) {s = 5;}

                        else if ( (LA33_0=='N'||LA33_0=='n') ) {s = 6;}

                        else if ( (LA33_0=='W'||LA33_0=='w') ) {s = 7;}

                        else if ( (LA33_0=='S'||LA33_0=='s') ) {s = 8;}

                        else if ( (LA33_0=='!') ) {s = 9;}

                        else if ( (LA33_0=='*') ) {s = 10;}

                        else if ( (LA33_0=='<') ) {s = 11;}

                        else if ( (LA33_0=='>') ) {s = 12;}

                        else if ( (LA33_0=='O'||LA33_0=='o') ) {s = 13;}

                        else if ( (LA33_0=='%') ) {s = 14;}

                        else if ( (LA33_0=='(') ) {s = 15;}

                        else if ( (LA33_0==')') ) {s = 16;}

                        else if ( (LA33_0=='+') ) {s = 17;}

                        else if ( (LA33_0==',') ) {s = 18;}

                        else if ( (LA33_0=='-') ) {s = 19;}

                        else if ( (LA33_0=='.') ) {s = 20;}

                        else if ( (LA33_0=='/') ) {s = 21;}

                        else if ( (LA33_0=='=') ) {s = 22;}

                        else if ( (LA33_0=='@') ) {s = 23;}

                        else if ( (LA33_0=='{') ) {s = 24;}

                        else if ( (LA33_0=='}') ) {s = 25;}

                        else if ( ((LA33_0>='0' && LA33_0<='9')) ) {s = 26;}

                        else if ( (LA33_0=='[') ) {s = 27;}

                        else if ( (LA33_0=='^') ) {s = 28;}

                        else if ( ((LA33_0>='B' && LA33_0<='D')||(LA33_0>='F' && LA33_0<='M')||(LA33_0>='Q' && LA33_0<='R')||LA33_0=='U'||(LA33_0>='X' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='b' && LA33_0<='d')||(LA33_0>='f' && LA33_0<='m')||(LA33_0>='q' && LA33_0<='r')||LA33_0=='u'||(LA33_0>='x' && LA33_0<='z')) ) {s = 29;}

                        else if ( (LA33_0=='\"') ) {s = 30;}

                        else if ( (LA33_0=='\'') ) {s = 31;}

                        else if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {s = 32;}

                        else if ( ((LA33_0>='\u0000' && LA33_0<='\b')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\u001F')||(LA33_0>='#' && LA33_0<='$')||LA33_0=='&'||(LA33_0>=':' && LA33_0<=';')||LA33_0=='?'||(LA33_0>='\\' && LA33_0<=']')||LA33_0=='`'||LA33_0=='|'||(LA33_0>='~' && LA33_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_31 = input.LA(1);

                        s = -1;
                        if ( ((LA33_31>='\u0000' && LA33_31<='\uFFFF')) ) {s = 71;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_30 = input.LA(1);

                        s = -1;
                        if ( ((LA33_30>='\u0000' && LA33_30<='\uFFFF')) ) {s = 71;}

                        else s = 33;

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