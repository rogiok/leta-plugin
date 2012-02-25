package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.LetaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLetaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_MINUS_FLOAT", "RULE_MINUS_INTEGER", "RULE_DATE_TIME", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "'@'", "'atLeast'", "'atMost'", "'exactly'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "','", "'null'", "'Package'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_DATE_TIME=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MINUS_FLOAT=8;
    public static final int RULE_MINUS_INTEGER=9;
    public static final int RULE_WS=14;
    public static final int RULE_DIGIT=11;

    // delegates
    // delegators


        public InternalLetaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLetaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLetaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g"; }



     	private LetaGrammarAccess grammarAccess;
     	
        public InternalLetaParser(TokenStream input, LetaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Leta";	
       	}
       	
       	@Override
       	protected LetaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLeta"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:67:1: entryRuleLeta returns [EObject current=null] : iv_ruleLeta= ruleLeta EOF ;
    public final EObject entryRuleLeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeta = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:68:2: (iv_ruleLeta= ruleLeta EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:69:2: iv_ruleLeta= ruleLeta EOF
            {
             newCompositeNode(grammarAccess.getLetaRule()); 
            pushFollow(FOLLOW_ruleLeta_in_entryRuleLeta75);
            iv_ruleLeta=ruleLeta();

            state._fsp--;

             current =iv_ruleLeta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeta85); 

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
    // $ANTLR end "entryRuleLeta"


    // $ANTLR start "ruleLeta"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:76:1: ruleLeta returns [EObject current=null] : ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ ) ;
    public final EObject ruleLeta() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tp_0_0 = null;

        EObject lv_tc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:79:28: ( ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:80:1: ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:80:1: ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:80:2: ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:80:2: ( (lv_tp_0_0= ruleTestPackage ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:81:1: (lv_tp_0_0= ruleTestPackage )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:81:1: (lv_tp_0_0= ruleTestPackage )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:82:3: lv_tp_0_0= ruleTestPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetaAccess().getTpTestPackageParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTestPackage_in_ruleLeta131);
                    lv_tp_0_0=ruleTestPackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetaRule());
                    	        }
                           		set(
                           			current, 
                           			"tp",
                            		lv_tp_0_0, 
                            		"TestPackage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:98:3: ( (lv_tc_1_0= ruleTestCase ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:99:1: (lv_tc_1_0= ruleTestCase )
            	    {
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:99:1: (lv_tc_1_0= ruleTestCase )
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:100:3: lv_tc_1_0= ruleTestCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLetaAccess().getTcTestCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTestCase_in_ruleLeta153);
            	    lv_tc_1_0=ruleTestCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLetaRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tc",
            	            		lv_tc_1_0, 
            	            		"TestCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleLeta"


    // $ANTLR start "entryRuleTestCase"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:124:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:125:2: (iv_ruleTestCase= ruleTestCase EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:126:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase190);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase200); 

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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:133:1: ruleTestCase returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        EObject lv_v_2_0 = null;

        EObject lv_w_3_0 = null;

        EObject lv_s_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:136:28: ( (otherlv_0= 'Test' ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:137:1: (otherlv_0= 'Test' ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:137:1: (otherlv_0= 'Test' ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:137:3: otherlv_0= 'Test' ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTestCase237); 

                	newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:141:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:142:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:142:1: (lv_id_1_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:143:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestCase254); 

            			newLeafNode(lv_id_1_0, grammarAccess.getTestCaseAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:159:2: ( (lv_v_2_0= ruleVerifyClause ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:160:1: (lv_v_2_0= ruleVerifyClause )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:160:1: (lv_v_2_0= ruleVerifyClause )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:161:3: lv_v_2_0= ruleVerifyClause
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getVVerifyClauseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVerifyClause_in_ruleTestCase280);
            lv_v_2_0=ruleVerifyClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	        }
                   		set(
                   			current, 
                   			"v",
                    		lv_v_2_0, 
                    		"VerifyClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:177:2: ( (lv_w_3_0= ruleWhenClause ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:178:1: (lv_w_3_0= ruleWhenClause )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:178:1: (lv_w_3_0= ruleWhenClause )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:179:3: lv_w_3_0= ruleWhenClause
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getWWhenClauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleWhenClause_in_ruleTestCase301);
            lv_w_3_0=ruleWhenClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
            	        }
                   		set(
                   			current, 
                   			"w",
                    		lv_w_3_0, 
                    		"WhenClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:195:2: ( (lv_s_4_0= ruleSetClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:196:1: (lv_s_4_0= ruleSetClause )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:196:1: (lv_s_4_0= ruleSetClause )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:197:3: lv_s_4_0= ruleSetClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTestCaseAccess().getSSetClauseParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSetClause_in_ruleTestCase322);
                    lv_s_4_0=ruleSetClause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTestCaseRule());
                    	        }
                           		set(
                           			current, 
                           			"s",
                            		lv_s_4_0, 
                            		"SetClause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleVerifyClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:221:1: entryRuleVerifyClause returns [EObject current=null] : iv_ruleVerifyClause= ruleVerifyClause EOF ;
    public final EObject entryRuleVerifyClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:222:2: (iv_ruleVerifyClause= ruleVerifyClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:223:2: iv_ruleVerifyClause= ruleVerifyClause EOF
            {
             newCompositeNode(grammarAccess.getVerifyClauseRule()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause359);
            iv_ruleVerifyClause=ruleVerifyClause();

            state._fsp--;

             current =iv_ruleVerifyClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerifyClause369); 

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
    // $ANTLR end "entryRuleVerifyClause"


    // $ANTLR start "ruleVerifyClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:230:1: ruleVerifyClause returns [EObject current=null] : (otherlv_0= 'Verify' ( (lv_fc_1_0= rulefactComposite ) ) ) ;
    public final EObject ruleVerifyClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:233:28: ( (otherlv_0= 'Verify' ( (lv_fc_1_0= rulefactComposite ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:234:1: (otherlv_0= 'Verify' ( (lv_fc_1_0= rulefactComposite ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:234:1: (otherlv_0= 'Verify' ( (lv_fc_1_0= rulefactComposite ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:234:3: otherlv_0= 'Verify' ( (lv_fc_1_0= rulefactComposite ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleVerifyClause406); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyClauseAccess().getVerifyKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:238:1: ( (lv_fc_1_0= rulefactComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:239:1: (lv_fc_1_0= rulefactComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:239:1: (lv_fc_1_0= rulefactComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:240:3: lv_fc_1_0= rulefactComposite
            {
             
            	        newCompositeNode(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulefactComposite_in_ruleVerifyClause427);
            lv_fc_1_0=rulefactComposite();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerifyClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fc",
                    		lv_fc_1_0, 
                    		"factComposite");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleVerifyClause"


    // $ANTLR start "entryRuleWhenClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:264:1: entryRuleWhenClause returns [EObject current=null] : iv_ruleWhenClause= ruleWhenClause EOF ;
    public final EObject entryRuleWhenClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:265:2: (iv_ruleWhenClause= ruleWhenClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:266:2: iv_ruleWhenClause= ruleWhenClause EOF
            {
             newCompositeNode(grammarAccess.getWhenClauseRule()); 
            pushFollow(FOLLOW_ruleWhenClause_in_entryRuleWhenClause463);
            iv_ruleWhenClause=ruleWhenClause();

            state._fsp--;

             current =iv_ruleWhenClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenClause473); 

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
    // $ANTLR end "entryRuleWhenClause"


    // $ANTLR start "ruleWhenClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:273:1: ruleWhenClause returns [EObject current=null] : (otherlv_0= 'When' ( (lv_fc_1_0= rulefactComposite ) ) ) ;
    public final EObject ruleWhenClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:276:28: ( (otherlv_0= 'When' ( (lv_fc_1_0= rulefactComposite ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:277:1: (otherlv_0= 'When' ( (lv_fc_1_0= rulefactComposite ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:277:1: (otherlv_0= 'When' ( (lv_fc_1_0= rulefactComposite ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:277:3: otherlv_0= 'When' ( (lv_fc_1_0= rulefactComposite ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleWhenClause510); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenClauseAccess().getWhenKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:281:1: ( (lv_fc_1_0= rulefactComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:282:1: (lv_fc_1_0= rulefactComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:282:1: (lv_fc_1_0= rulefactComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:283:3: lv_fc_1_0= rulefactComposite
            {
             
            	        newCompositeNode(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulefactComposite_in_ruleWhenClause531);
            lv_fc_1_0=rulefactComposite();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fc",
                    		lv_fc_1_0, 
                    		"factComposite");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleWhenClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:307:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:308:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:309:2: iv_ruleSetClause= ruleSetClause EOF
            {
             newCompositeNode(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause567);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;

             current =iv_ruleSetClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause577); 

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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:316:1: ruleSetClause returns [EObject current=null] : ( () otherlv_1= 'Set' otherlv_2= '{' ( (lv_s_3_0= ruleSet ) )? otherlv_4= '}' ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_s_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:319:28: ( ( () otherlv_1= 'Set' otherlv_2= '{' ( (lv_s_3_0= ruleSet ) )? otherlv_4= '}' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:320:1: ( () otherlv_1= 'Set' otherlv_2= '{' ( (lv_s_3_0= ruleSet ) )? otherlv_4= '}' )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:320:1: ( () otherlv_1= 'Set' otherlv_2= '{' ( (lv_s_3_0= ruleSet ) )? otherlv_4= '}' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:320:2: () otherlv_1= 'Set' otherlv_2= '{' ( (lv_s_3_0= ruleSet ) )? otherlv_4= '}'
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:320:2: ()
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:321:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetClauseAccess().getSetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSetClause623); 

                	newLeafNode(otherlv_1, grammarAccess.getSetClauseAccess().getSetKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSetClause635); 

                	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:334:1: ( (lv_s_3_0= ruleSet ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:335:1: (lv_s_3_0= ruleSet )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:335:1: (lv_s_3_0= ruleSet )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:336:3: lv_s_3_0= ruleSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetClauseAccess().getSSetParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSet_in_ruleSetClause656);
                    lv_s_3_0=ruleSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"s",
                            		lv_s_3_0, 
                            		"Set");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleSetClause669); 

                	newLeafNode(otherlv_4, grammarAccess.getSetClauseAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRulefactComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:364:1: entryRulefactComposite returns [EObject current=null] : iv_rulefactComposite= rulefactComposite EOF ;
    public final EObject entryRulefactComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefactComposite = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:365:2: (iv_rulefactComposite= rulefactComposite EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:366:2: iv_rulefactComposite= rulefactComposite EOF
            {
             newCompositeNode(grammarAccess.getFactCompositeRule()); 
            pushFollow(FOLLOW_rulefactComposite_in_entryRulefactComposite705);
            iv_rulefactComposite=rulefactComposite();

            state._fsp--;

             current =iv_rulefactComposite; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactComposite715); 

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
    // $ANTLR end "entryRulefactComposite"


    // $ANTLR start "rulefactComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:373:1: rulefactComposite returns [EObject current=null] : ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? ) | (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? ) ) ;
    public final EObject rulefactComposite() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_f_0_0 = null;

        EObject lv_fo_1_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_fc_3_0 = null;

        EObject lv_fc1_5_0 = null;

        AntlrDatatypeRuleToken lv_op_7_0 = null;

        EObject lv_fc2_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:376:28: ( ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? ) | (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:1: ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? ) | (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:1: ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? ) | (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=27 && LA8_0<=30)) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:2: ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:2: ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:3: ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:3: ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) )
                    int alt5=2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:4: ( (lv_f_0_0= ruleFact ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:377:4: ( (lv_f_0_0= ruleFact ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:378:1: (lv_f_0_0= ruleFact )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:378:1: (lv_f_0_0= ruleFact )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:379:3: lv_f_0_0= ruleFact
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFFactParserRuleCall_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFact_in_rulefactComposite763);
                            lv_f_0_0=ruleFact();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"f",
                                    		lv_f_0_0, 
                                    		"Fact");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:396:6: ( (lv_fo_1_0= ruleFormula ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:396:6: ( (lv_fo_1_0= ruleFormula ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:397:1: (lv_fo_1_0= ruleFormula )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:397:1: (lv_fo_1_0= ruleFormula )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:398:3: lv_fo_1_0= ruleFormula
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFoFormulaParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormula_in_rulefactComposite790);
                            lv_fo_1_0=ruleFormula();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fo",
                                    		lv_fo_1_0, 
                                    		"Formula");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:414:3: ( ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:414:4: ( (lv_op_2_0= rulelogicalOperator ) ) ( (lv_fc_3_0= rulefactComposite ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:414:4: ( (lv_op_2_0= rulelogicalOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:415:1: (lv_op_2_0= rulelogicalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:415:1: (lv_op_2_0= rulelogicalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:416:3: lv_op_2_0= rulelogicalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulelogicalOperator_in_rulefactComposite813);
                            lv_op_2_0=rulelogicalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_2_0, 
                                    		"logicalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:432:2: ( (lv_fc_3_0= rulefactComposite ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:433:1: (lv_fc_3_0= rulefactComposite )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:433:1: (lv_fc_3_0= rulefactComposite )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:434:3: lv_fc_3_0= rulefactComposite
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFcFactCompositeParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulefactComposite_in_rulefactComposite834);
                            lv_fc_3_0=rulefactComposite();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fc",
                                    		lv_fc_3_0, 
                                    		"factComposite");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:451:6: (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:451:6: (otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:451:8: otherlv_4= '(' ( (lv_fc1_5_0= rulefactComposite ) ) otherlv_6= ')' ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )?
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_rulefactComposite856); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactCompositeAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:455:1: ( (lv_fc1_5_0= rulefactComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:456:1: (lv_fc1_5_0= rulefactComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:456:1: (lv_fc1_5_0= rulefactComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:457:3: lv_fc1_5_0= rulefactComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFc1FactCompositeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulefactComposite_in_rulefactComposite877);
                    lv_fc1_5_0=rulefactComposite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"fc1",
                            		lv_fc1_5_0, 
                            		"factComposite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_rulefactComposite889); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactCompositeAccess().getRightParenthesisKeyword_1_2());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:477:1: ( ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:477:2: ( (lv_op_7_0= rulelogicalOperator ) ) ( (lv_fc2_8_0= rulefactComposite ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:477:2: ( (lv_op_7_0= rulelogicalOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:478:1: (lv_op_7_0= rulelogicalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:478:1: (lv_op_7_0= rulelogicalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:479:3: lv_op_7_0= rulelogicalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulelogicalOperator_in_rulefactComposite911);
                            lv_op_7_0=rulelogicalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_7_0, 
                                    		"logicalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:495:2: ( (lv_fc2_8_0= rulefactComposite ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:496:1: (lv_fc2_8_0= rulefactComposite )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:496:1: (lv_fc2_8_0= rulefactComposite )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:497:3: lv_fc2_8_0= rulefactComposite
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFc2FactCompositeParserRuleCall_1_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulefactComposite_in_rulefactComposite932);
                            lv_fc2_8_0=rulefactComposite();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fc2",
                                    		lv_fc2_8_0, 
                                    		"factComposite");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "rulefactComposite"


    // $ANTLR start "entryRulelogicalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:521:1: entryRulelogicalOperator returns [String current=null] : iv_rulelogicalOperator= rulelogicalOperator EOF ;
    public final String entryRulelogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogicalOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:522:2: (iv_rulelogicalOperator= rulelogicalOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:523:2: iv_rulelogicalOperator= rulelogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_rulelogicalOperator_in_entryRulelogicalOperator972);
            iv_rulelogicalOperator=rulelogicalOperator();

            state._fsp--;

             current =iv_rulelogicalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelogicalOperator983); 

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
    // $ANTLR end "entryRulelogicalOperator"


    // $ANTLR start "rulelogicalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:530:1: rulelogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'And' | kw= 'Or' ) ;
    public final AntlrDatatypeRuleToken rulelogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:533:28: ( (kw= 'And' | kw= 'Or' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:534:1: (kw= 'And' | kw= 'Or' )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:534:1: (kw= 'And' | kw= 'Or' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:535:2: kw= 'And'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_rulelogicalOperator1021); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:542:2: kw= 'Or'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulelogicalOperator1040); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "rulelogicalOperator"


    // $ANTLR start "entryRuleFact"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:555:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:556:2: (iv_ruleFact= ruleFact EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:557:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact1080);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact1090); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:564:1: ruleFact returns [EObject current=null] : ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        EObject lv_termComposite_0_0 = null;

        EObject lv_complement_1_0 = null;

        EObject lv_termComposite2_2_0 = null;

        EObject lv_factExt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:567:28: ( ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:568:1: ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:568:1: ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:568:2: ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:568:2: ( (lv_termComposite_0_0= ruleTermComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:569:1: (lv_termComposite_0_0= ruleTermComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:569:1: (lv_termComposite_0_0= ruleTermComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:570:3: lv_termComposite_0_0= ruleTermComposite
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getTermCompositeTermCompositeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermComposite_in_ruleFact1136);
            lv_termComposite_0_0=ruleTermComposite();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactRule());
            	        }
                   		set(
                   			current, 
                   			"termComposite",
                    		lv_termComposite_0_0, 
                    		"TermComposite");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:586:2: ( (lv_complement_1_0= ruleComplement ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:587:1: (lv_complement_1_0= ruleComplement )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:587:1: (lv_complement_1_0= ruleComplement )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:588:3: lv_complement_1_0= ruleComplement
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getComplementComplementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComplement_in_ruleFact1157);
            lv_complement_1_0=ruleComplement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactRule());
            	        }
                   		set(
                   			current, 
                   			"complement",
                    		lv_complement_1_0, 
                    		"Complement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:604:2: ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||(LA11_0>=27 && LA11_0<=30)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:604:3: ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:604:3: ( (lv_termComposite2_2_0= ruleTermComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:605:1: (lv_termComposite2_2_0= ruleTermComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:605:1: (lv_termComposite2_2_0= ruleTermComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:606:3: lv_termComposite2_2_0= ruleTermComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactAccess().getTermComposite2TermCompositeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermComposite_in_ruleFact1179);
                    lv_termComposite2_2_0=ruleTermComposite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactRule());
                    	        }
                           		set(
                           			current, 
                           			"termComposite2",
                            		lv_termComposite2_2_0, 
                            		"TermComposite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:622:2: ( (lv_factExt_3_0= ruleFactExt ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:623:1: (lv_factExt_3_0= ruleFactExt )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:623:1: (lv_factExt_3_0= ruleFactExt )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:624:3: lv_factExt_3_0= ruleFactExt
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactAccess().getFactExtFactExtParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactExt_in_ruleFact1200);
                            lv_factExt_3_0=ruleFactExt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"factExt",
                                    		lv_factExt_3_0, 
                                    		"FactExt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleFactExt"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:648:1: entryRuleFactExt returns [EObject current=null] : iv_ruleFactExt= ruleFactExt EOF ;
    public final EObject entryRuleFactExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactExt = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:649:2: (iv_ruleFactExt= ruleFactExt EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:650:2: iv_ruleFactExt= ruleFactExt EOF
            {
             newCompositeNode(grammarAccess.getFactExtRule()); 
            pushFollow(FOLLOW_ruleFactExt_in_entryRuleFactExt1239);
            iv_ruleFactExt=ruleFactExt();

            state._fsp--;

             current =iv_ruleFactExt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactExt1249); 

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
    // $ANTLR end "entryRuleFactExt"


    // $ANTLR start "ruleFactExt"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:657:1: ruleFactExt returns [EObject current=null] : ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? ) ;
    public final EObject ruleFactExt() throws RecognitionException {
        EObject current = null;

        EObject lv_complement_0_0 = null;

        EObject lv_termComposite_1_0 = null;

        EObject lv_factExt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:660:28: ( ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:661:1: ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:661:1: ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:661:2: ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:661:2: ( (lv_complement_0_0= ruleComplement ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:662:1: (lv_complement_0_0= ruleComplement )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:662:1: (lv_complement_0_0= ruleComplement )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:663:3: lv_complement_0_0= ruleComplement
            {
             
            	        newCompositeNode(grammarAccess.getFactExtAccess().getComplementComplementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComplement_in_ruleFactExt1295);
            lv_complement_0_0=ruleComplement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFactExtRule());
            	        }
                   		set(
                   			current, 
                   			"complement",
                    		lv_complement_0_0, 
                    		"Complement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:679:2: ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=27 && LA13_0<=30)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:679:3: ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:679:3: ( (lv_termComposite_1_0= ruleTermComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:680:1: (lv_termComposite_1_0= ruleTermComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:680:1: (lv_termComposite_1_0= ruleTermComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:681:3: lv_termComposite_1_0= ruleTermComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactExtAccess().getTermCompositeTermCompositeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermComposite_in_ruleFactExt1317);
                    lv_termComposite_1_0=ruleTermComposite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactExtRule());
                    	        }
                           		set(
                           			current, 
                           			"termComposite",
                            		lv_termComposite_1_0, 
                            		"TermComposite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:697:2: ( (lv_factExt_2_0= ruleFactExt ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:698:1: (lv_factExt_2_0= ruleFactExt )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:698:1: (lv_factExt_2_0= ruleFactExt )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:699:3: lv_factExt_2_0= ruleFactExt
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactExtAccess().getFactExtFactExtParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactExt_in_ruleFactExt1338);
                            lv_factExt_2_0=ruleFactExt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactExtRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"factExt",
                                    		lv_factExt_2_0, 
                                    		"FactExt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFactExt"


    // $ANTLR start "entryRuleTermComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:723:1: entryRuleTermComposite returns [EObject current=null] : iv_ruleTermComposite= ruleTermComposite EOF ;
    public final EObject entryRuleTermComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermComposite = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:724:2: (iv_ruleTermComposite= ruleTermComposite EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:725:2: iv_ruleTermComposite= ruleTermComposite EOF
            {
             newCompositeNode(grammarAccess.getTermCompositeRule()); 
            pushFollow(FOLLOW_ruleTermComposite_in_entryRuleTermComposite1377);
            iv_ruleTermComposite=ruleTermComposite();

            state._fsp--;

             current =iv_ruleTermComposite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermComposite1387); 

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
    // $ANTLR end "entryRuleTermComposite"


    // $ANTLR start "ruleTermComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:732:1: ruleTermComposite returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) ) ;
    public final EObject ruleTermComposite() throws RecognitionException {
        EObject current = null;

        EObject lv_quantifier_0_0 = null;

        EObject lv_term_1_0 = null;

        EObject lv_termInstance_2_0 = null;

        EObject lv_termWithAssociation_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:735:28: ( ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:736:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:736:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:736:2: ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:736:2: ( (lv_quantifier_0_0= ruleQuantifier ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:737:1: (lv_quantifier_0_0= ruleQuantifier )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:737:1: (lv_quantifier_0_0= ruleQuantifier )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:738:3: lv_quantifier_0_0= ruleQuantifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getQuantifierQuantifierParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantifier_in_ruleTermComposite1433);
                    lv_quantifier_0_0=ruleQuantifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"quantifier",
                            		lv_quantifier_0_0, 
                            		"Quantifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:754:3: ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:754:4: ( (lv_term_1_0= ruleTerm ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:754:4: ( (lv_term_1_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:755:1: (lv_term_1_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:755:1: (lv_term_1_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:756:3: lv_term_1_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermTermParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermComposite1456);
                    lv_term_1_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_1_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:773:6: ( (lv_termInstance_2_0= ruleTermInstance ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:773:6: ( (lv_termInstance_2_0= ruleTermInstance ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:774:1: (lv_termInstance_2_0= ruleTermInstance )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:774:1: (lv_termInstance_2_0= ruleTermInstance )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:775:3: lv_termInstance_2_0= ruleTermInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermInstanceTermInstanceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermInstance_in_ruleTermComposite1483);
                    lv_termInstance_2_0=ruleTermInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"termInstance",
                            		lv_termInstance_2_0, 
                            		"TermInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:792:6: ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:792:6: ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:793:1: (lv_termWithAssociation_3_0= ruleTermWithAssociation )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:793:1: (lv_termWithAssociation_3_0= ruleTermWithAssociation )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:794:3: lv_termWithAssociation_3_0= ruleTermWithAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermWithAssociationTermWithAssociationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermWithAssociation_in_ruleTermComposite1510);
                    lv_termWithAssociation_3_0=ruleTermWithAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"termWithAssociation",
                            		lv_termWithAssociation_3_0, 
                            		"TermWithAssociation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTermComposite"


    // $ANTLR start "entryRuleTerm"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:818:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:819:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:820:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1547);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1557); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:827:1: ruleTerm returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:830:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:831:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:831:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:832:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:832:1: (lv_id_0_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:833:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm1598); 

            			newLeafNode(lv_id_0_0, grammarAccess.getTermAccess().getIdIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTermInstance"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:857:1: entryRuleTermInstance returns [EObject current=null] : iv_ruleTermInstance= ruleTermInstance EOF ;
    public final EObject entryRuleTermInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermInstance = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:858:2: (iv_ruleTermInstance= ruleTermInstance EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:859:2: iv_ruleTermInstance= ruleTermInstance EOF
            {
             newCompositeNode(grammarAccess.getTermInstanceRule()); 
            pushFollow(FOLLOW_ruleTermInstance_in_entryRuleTermInstance1638);
            iv_ruleTermInstance=ruleTermInstance();

            state._fsp--;

             current =iv_ruleTermInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermInstance1648); 

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
    // $ANTLR end "entryRuleTermInstance"


    // $ANTLR start "ruleTermInstance"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:866:1: ruleTermInstance returns [EObject current=null] : ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) ) ;
    public final EObject ruleTermInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        AntlrDatatypeRuleToken lv_notEqualOperator_1_0 = null;

        AntlrDatatypeRuleToken lv_stringLiteral_2_0 = null;

        EObject lv_term_3_0 = null;

        EObject lv_relationalOperator_4_0 = null;

        AntlrDatatypeRuleToken lv_otherLiteral_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:869:28: ( ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:1: ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:1: ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==RULE_INT||(LA18_2>=RULE_FLOAT && LA18_2<=RULE_DATE_TIME)) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==RULE_STRING||LA18_2==44) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                case 44:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_INT:
                case RULE_FLOAT:
                case RULE_MINUS_FLOAT:
                case RULE_MINUS_INTEGER:
                case RULE_DATE_TIME:
                case 38:
                case 39:
                case 40:
                case 41:
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:2: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:2: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:3: ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:870:3: ( (lv_term_0_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:871:1: (lv_term_0_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:871:1: (lv_term_0_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:872:3: lv_term_0_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermInstance1695);
                    lv_term_0_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_0_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:888:2: ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==42) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:889:1: (lv_notEqualOperator_1_0= ruleNotEqualOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:889:1: (lv_notEqualOperator_1_0= ruleNotEqualOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:890:3: lv_notEqualOperator_1_0= ruleNotEqualOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getTermInstanceAccess().getNotEqualOperatorNotEqualOperatorParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNotEqualOperator_in_ruleTermInstance1716);
                            lv_notEqualOperator_1_0=ruleNotEqualOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"notEqualOperator",
                                    		lv_notEqualOperator_1_0, 
                                    		"NotEqualOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:906:3: ( (lv_stringLiteral_2_0= ruleStringLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:907:1: (lv_stringLiteral_2_0= ruleStringLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:907:1: (lv_stringLiteral_2_0= ruleStringLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:908:3: lv_stringLiteral_2_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getStringLiteralStringLiteralParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleTermInstance1738);
                    lv_stringLiteral_2_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"stringLiteral",
                            		lv_stringLiteral_2_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:925:6: ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:925:6: ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:925:7: ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:925:7: ( (lv_term_3_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:926:1: (lv_term_3_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:926:1: (lv_term_3_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:927:3: lv_term_3_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermInstance1767);
                    lv_term_3_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"term",
                            		lv_term_3_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:943:2: ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=38 && LA17_0<=42)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:944:1: (lv_relationalOperator_4_0= ruleRelationalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:944:1: (lv_relationalOperator_4_0= ruleRelationalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:945:3: lv_relationalOperator_4_0= ruleRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getTermInstanceAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleTermInstance1788);
                            lv_relationalOperator_4_0=ruleRelationalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"relationalOperator",
                                    		lv_relationalOperator_4_0, 
                                    		"RelationalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:961:3: ( (lv_otherLiteral_5_0= ruleOtherLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:962:1: (lv_otherLiteral_5_0= ruleOtherLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:962:1: (lv_otherLiteral_5_0= ruleOtherLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:963:3: lv_otherLiteral_5_0= ruleOtherLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getOtherLiteralOtherLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOtherLiteral_in_ruleTermInstance1810);
                    lv_otherLiteral_5_0=ruleOtherLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermInstanceRule());
                    	        }
                           		set(
                           			current, 
                           			"otherLiteral",
                            		lv_otherLiteral_5_0, 
                            		"OtherLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTermInstance"


    // $ANTLR start "entryRuleTermWithAssociation"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:987:1: entryRuleTermWithAssociation returns [EObject current=null] : iv_ruleTermWithAssociation= ruleTermWithAssociation EOF ;
    public final EObject entryRuleTermWithAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermWithAssociation = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:988:2: (iv_ruleTermWithAssociation= ruleTermWithAssociation EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:989:2: iv_ruleTermWithAssociation= ruleTermWithAssociation EOF
            {
             newCompositeNode(grammarAccess.getTermWithAssociationRule()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation1847);
            iv_ruleTermWithAssociation=ruleTermWithAssociation();

            state._fsp--;

             current =iv_ruleTermWithAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermWithAssociation1857); 

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
    // $ANTLR end "entryRuleTermWithAssociation"


    // $ANTLR start "ruleTermWithAssociation"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:996:1: ruleTermWithAssociation returns [EObject current=null] : ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= '@' ( (lv_index_3_0= RULE_INT ) ) ) ;
    public final EObject ruleTermWithAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_index_3_0=null;
        EObject lv_t_0_0 = null;

        EObject lv_ro_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:999:28: ( ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= '@' ( (lv_index_3_0= RULE_INT ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1000:1: ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= '@' ( (lv_index_3_0= RULE_INT ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1000:1: ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= '@' ( (lv_index_3_0= RULE_INT ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1000:2: ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= '@' ( (lv_index_3_0= RULE_INT ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1000:2: ( (lv_t_0_0= ruleTerm ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1001:1: (lv_t_0_0= ruleTerm )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1001:1: (lv_t_0_0= ruleTerm )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1002:3: lv_t_0_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermWithAssociationAccess().getTTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTermWithAssociation1903);
            lv_t_0_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermWithAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"t",
                    		lv_t_0_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1018:2: ( (lv_ro_1_0= ruleRelationalOperator ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=38 && LA19_0<=42)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1019:1: (lv_ro_1_0= ruleRelationalOperator )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1019:1: (lv_ro_1_0= ruleRelationalOperator )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1020:3: lv_ro_1_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermWithAssociationAccess().getRoRelationalOperatorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleTermWithAssociation1924);
                    lv_ro_1_0=ruleRelationalOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermWithAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"ro",
                            		lv_ro_1_0, 
                            		"RelationalOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleTermWithAssociation1937); 

                	newLeafNode(otherlv_2, grammarAccess.getTermWithAssociationAccess().getCommercialAtKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1040:1: ( (lv_index_3_0= RULE_INT ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1041:1: (lv_index_3_0= RULE_INT )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1041:1: (lv_index_3_0= RULE_INT )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1042:3: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTermWithAssociation1954); 

            			newLeafNode(lv_index_3_0, grammarAccess.getTermWithAssociationAccess().getIndexINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTermWithAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"index",
                    		lv_index_3_0, 
                    		"INT");
            	    

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
    // $ANTLR end "ruleTermWithAssociation"


    // $ANTLR start "entryRuleQuantifier"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1066:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1067:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1068:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1995);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier2005); 

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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1075:1: ruleQuantifier returns [EObject current=null] : ( (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) ) ;
    public final EObject ruleQuantifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_v_1_0=null;
        Token otherlv_2=null;
        Token lv_v_3_0=null;
        Token otherlv_4=null;
        Token lv_v_5_0=null;
        Token otherlv_6=null;
        Token lv_v1_7_0=null;
        Token lv_v2_8_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1078:28: ( ( (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1079:1: ( (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1079:1: ( (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt20=1;
                }
                break;
            case 28:
                {
                alt20=2;
                }
                break;
            case 29:
                {
                alt20=3;
                }
                break;
            case 30:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1079:2: (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1079:2: (otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1079:4: otherlv_0= 'atLeast' ( (lv_v_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleQuantifier2043); 

                        	newLeafNode(otherlv_0, grammarAccess.getQuantifierAccess().getAtLeastKeyword_0_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1083:1: ( (lv_v_1_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1084:1: (lv_v_1_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1084:1: (lv_v_1_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1085:3: lv_v_1_0= RULE_INT
                    {
                    lv_v_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2060); 

                    			newLeafNode(lv_v_1_0, grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v",
                            		lv_v_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1102:6: (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1102:6: (otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1102:8: otherlv_2= 'atMost' ( (lv_v_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleQuantifier2085); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuantifierAccess().getAtMostKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1106:1: ( (lv_v_3_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1107:1: (lv_v_3_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1107:1: (lv_v_3_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1108:3: lv_v_3_0= RULE_INT
                    {
                    lv_v_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2102); 

                    			newLeafNode(lv_v_3_0, grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v",
                            		lv_v_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1125:6: (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1125:6: (otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1125:8: otherlv_4= 'exactly' ( (lv_v_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleQuantifier2127); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuantifierAccess().getExactlyKeyword_2_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1129:1: ( (lv_v_5_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1130:1: (lv_v_5_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1130:1: (lv_v_5_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1131:3: lv_v_5_0= RULE_INT
                    {
                    lv_v_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2144); 

                    			newLeafNode(lv_v_5_0, grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v",
                            		lv_v_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1148:6: (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1148:6: (otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1148:8: otherlv_6= 'atLeastAndAtMost' ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleQuantifier2169); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuantifierAccess().getAtLeastAndAtMostKeyword_3_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1152:1: ( (lv_v1_7_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1153:1: (lv_v1_7_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1153:1: (lv_v1_7_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1154:3: lv_v1_7_0= RULE_INT
                    {
                    lv_v1_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2186); 

                    			newLeafNode(lv_v1_7_0, grammarAccess.getQuantifierAccess().getV1INTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v1",
                            		lv_v1_7_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1170:2: ( (lv_v2_8_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1171:1: (lv_v2_8_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1171:1: (lv_v2_8_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1172:3: lv_v2_8_0= RULE_INT
                    {
                    lv_v2_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2208); 

                    			newLeafNode(lv_v2_8_0, grammarAccess.getQuantifierAccess().getV2INTTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuantifierRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"v2",
                            		lv_v2_8_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleComplement"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1196:1: entryRuleComplement returns [EObject current=null] : iv_ruleComplement= ruleComplement EOF ;
    public final EObject entryRuleComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplement = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1197:2: (iv_ruleComplement= ruleComplement EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1198:2: iv_ruleComplement= ruleComplement EOF
            {
             newCompositeNode(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_ruleComplement_in_entryRuleComplement2250);
            iv_ruleComplement=ruleComplement();

            state._fsp--;

             current =iv_ruleComplement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplement2260); 

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
    // $ANTLR end "entryRuleComplement"


    // $ANTLR start "ruleComplement"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1205:1: ruleComplement returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleComplement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1208:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1209:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1209:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1210:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1210:1: (lv_id_0_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1211:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplement2301); 

            			newLeafNode(lv_id_0_0, grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleComplement"


    // $ANTLR start "entryRuleFormula"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1235:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1236:2: (iv_ruleFormula= ruleFormula EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1237:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula2341);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula2351); 

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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1244:1: ruleFormula returns [EObject current=null] : ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= '=' ( (lv_fe_2_0= ruleFormulaExpression ) ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fi_0_0 = null;

        EObject lv_fe_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1247:28: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= '=' ( (lv_fe_2_0= ruleFormulaExpression ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1248:1: ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= '=' ( (lv_fe_2_0= ruleFormulaExpression ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1248:1: ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= '=' ( (lv_fe_2_0= ruleFormulaExpression ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1248:2: ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= '=' ( (lv_fe_2_0= ruleFormulaExpression ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1248:2: ( (lv_fi_0_0= ruleFormulaItem ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1249:1: (lv_fi_0_0= ruleFormulaItem )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1249:1: (lv_fi_0_0= ruleFormulaItem )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1250:3: lv_fi_0_0= ruleFormulaItem
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFormulaItem_in_ruleFormula2397);
            lv_fi_0_0=ruleFormulaItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormulaRule());
            	        }
                   		set(
                   			current, 
                   			"fi",
                    		lv_fi_0_0, 
                    		"FormulaItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleFormula2409); 

                	newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getEqualsSignKeyword_1());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1270:1: ( (lv_fe_2_0= ruleFormulaExpression ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1271:1: (lv_fe_2_0= ruleFormulaExpression )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1271:1: (lv_fe_2_0= ruleFormulaExpression )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1272:3: lv_fe_2_0= ruleFormulaExpression
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormula2430);
            lv_fe_2_0=ruleFormulaExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormulaRule());
            	        }
                   		set(
                   			current, 
                   			"fe",
                    		lv_fe_2_0, 
                    		"FormulaExpression");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleFormulaExpression"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1296:1: entryRuleFormulaExpression returns [EObject current=null] : iv_ruleFormulaExpression= ruleFormulaExpression EOF ;
    public final EObject entryRuleFormulaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaExpression = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1297:2: (iv_ruleFormulaExpression= ruleFormulaExpression EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1298:2: iv_ruleFormulaExpression= ruleFormulaExpression EOF
            {
             newCompositeNode(grammarAccess.getFormulaExpressionRule()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression2466);
            iv_ruleFormulaExpression=ruleFormulaExpression();

            state._fsp--;

             current =iv_ruleFormulaExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaExpression2476); 

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
    // $ANTLR end "entryRuleFormulaExpression"


    // $ANTLR start "ruleFormulaExpression"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1305:1: ruleFormulaExpression returns [EObject current=null] : ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) ) ;
    public final EObject ruleFormulaExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fi_0_0 = null;

        AntlrDatatypeRuleToken lv_mo_1_0 = null;

        EObject lv_fe_2_0 = null;

        EObject lv_fe1_4_0 = null;

        AntlrDatatypeRuleToken lv_mo_6_0 = null;

        EObject lv_fe2_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1308:28: ( ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:1: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:1: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:2: ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:2: ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:3: ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1309:3: ( (lv_fi_0_0= ruleFormulaItem ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1310:1: (lv_fi_0_0= ruleFormulaItem )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1310:1: (lv_fi_0_0= ruleFormulaItem )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1311:3: lv_fi_0_0= ruleFormulaItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFiFormulaItemParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormulaItem_in_ruleFormulaExpression2523);
                    lv_fi_0_0=ruleFormulaItem();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"fi",
                            		lv_fi_0_0, 
                            		"FormulaItem");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1327:2: ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=32 && LA21_0<=37)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1327:3: ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1327:3: ( (lv_mo_1_0= ruleMathOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1328:1: (lv_mo_1_0= ruleMathOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1328:1: (lv_mo_1_0= ruleMathOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1329:3: lv_mo_1_0= ruleMathOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleFormulaExpression2545);
                            lv_mo_1_0=ruleMathOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mo",
                                    		lv_mo_1_0, 
                                    		"MathOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1345:2: ( (lv_fe_2_0= ruleFormulaExpression ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1346:1: (lv_fe_2_0= ruleFormulaExpression )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1346:1: (lv_fe_2_0= ruleFormulaExpression )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1347:3: lv_fe_2_0= ruleFormulaExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFeFormulaExpressionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2566);
                            lv_fe_2_0=ruleFormulaExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fe",
                                    		lv_fe_2_0, 
                                    		"FormulaExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1364:6: (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1364:6: (otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1364:8: otherlv_3= '(' ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= ')' ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleFormulaExpression2588); 

                        	newLeafNode(otherlv_3, grammarAccess.getFormulaExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1368:1: ( (lv_fe1_4_0= ruleFormulaExpression ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1369:1: (lv_fe1_4_0= ruleFormulaExpression )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1369:1: (lv_fe1_4_0= ruleFormulaExpression )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1370:3: lv_fe1_4_0= ruleFormulaExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFe1FormulaExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2609);
                    lv_fe1_4_0=ruleFormulaExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"fe1",
                            		lv_fe1_4_0, 
                            		"FormulaExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleFormulaExpression2621); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormulaExpressionAccess().getRightParenthesisKeyword_1_2());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1390:1: ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=32 && LA22_0<=37)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1390:2: ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1390:2: ( (lv_mo_6_0= ruleMathOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1391:1: (lv_mo_6_0= ruleMathOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1391:1: (lv_mo_6_0= ruleMathOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1392:3: lv_mo_6_0= ruleMathOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleFormulaExpression2643);
                            lv_mo_6_0=ruleMathOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mo",
                                    		lv_mo_6_0, 
                                    		"MathOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1408:2: ( (lv_fe2_7_0= ruleFormulaExpression ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1409:1: (lv_fe2_7_0= ruleFormulaExpression )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1409:1: (lv_fe2_7_0= ruleFormulaExpression )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1410:3: lv_fe2_7_0= ruleFormulaExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFe2FormulaExpressionParserRuleCall_1_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2664);
                            lv_fe2_7_0=ruleFormulaExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFormulaExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fe2",
                                    		lv_fe2_7_0, 
                                    		"FormulaExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFormulaExpression"


    // $ANTLR start "entryRuleFormulaItem"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1434:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1435:2: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1436:2: iv_ruleFormulaItem= ruleFormulaItem EOF
            {
             newCompositeNode(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem2703);
            iv_ruleFormulaItem=ruleFormulaItem();

            state._fsp--;

             current =iv_ruleFormulaItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaItem2713); 

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
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1443:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        EObject lv_ti_1_0 = null;

        EObject lv_twa_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1446:28: ( ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1447:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1447:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1447:2: ( (lv_t_0_0= ruleTerm ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1447:2: ( (lv_t_0_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1448:1: (lv_t_0_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1448:1: (lv_t_0_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1449:3: lv_t_0_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleFormulaItem2759);
                    lv_t_0_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormulaItemRule());
                    	        }
                           		set(
                           			current, 
                           			"t",
                            		lv_t_0_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1466:6: ( (lv_ti_1_0= ruleTermInstance ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1466:6: ( (lv_ti_1_0= ruleTermInstance ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1467:1: (lv_ti_1_0= ruleTermInstance )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1467:1: (lv_ti_1_0= ruleTermInstance )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1468:3: lv_ti_1_0= ruleTermInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTiTermInstanceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermInstance_in_ruleFormulaItem2786);
                    lv_ti_1_0=ruleTermInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormulaItemRule());
                    	        }
                           		set(
                           			current, 
                           			"ti",
                            		lv_ti_1_0, 
                            		"TermInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1485:6: ( (lv_twa_2_0= ruleTermWithAssociation ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1485:6: ( (lv_twa_2_0= ruleTermWithAssociation ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1486:1: (lv_twa_2_0= ruleTermWithAssociation )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1486:1: (lv_twa_2_0= ruleTermWithAssociation )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1487:3: lv_twa_2_0= ruleTermWithAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTwaTermWithAssociationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermWithAssociation_in_ruleFormulaItem2813);
                    lv_twa_2_0=ruleTermWithAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormulaItemRule());
                    	        }
                           		set(
                           			current, 
                           			"twa",
                            		lv_twa_2_0, 
                            		"TermWithAssociation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleMathOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1511:1: entryRuleMathOperator returns [String current=null] : iv_ruleMathOperator= ruleMathOperator EOF ;
    public final String entryRuleMathOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1512:2: (iv_ruleMathOperator= ruleMathOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1513:2: iv_ruleMathOperator= ruleMathOperator EOF
            {
             newCompositeNode(grammarAccess.getMathOperatorRule()); 
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator2850);
            iv_ruleMathOperator=ruleMathOperator();

            state._fsp--;

             current =iv_ruleMathOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator2861); 

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
    // $ANTLR end "entryRuleMathOperator"


    // $ANTLR start "ruleMathOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1520:1: ruleMathOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' | kw= '**' ) ;
    public final AntlrDatatypeRuleToken ruleMathOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1523:28: ( (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' | kw= '**' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1524:1: (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' | kw= '**' )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1524:1: (kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '%' | kw= '**' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt25=1;
                }
                break;
            case 33:
                {
                alt25=2;
                }
                break;
            case 34:
                {
                alt25=3;
                }
                break;
            case 35:
                {
                alt25=4;
                }
                break;
            case 36:
                {
                alt25=5;
                }
                break;
            case 37:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1525:2: kw= '+'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleMathOperator2899); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1532:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleMathOperator2918); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1539:2: kw= '/'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleMathOperator2937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getSolidusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1546:2: kw= '*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleMathOperator2956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1553:2: kw= '%'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleMathOperator2975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getPercentSignKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1560:2: kw= '**'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleMathOperator2994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMathOperatorAccess().getAsteriskAsteriskKeyword_5()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1573:1: entryRuleRelationalOperator returns [EObject current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final EObject entryRuleRelationalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1574:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1575:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator3034);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator3044); 

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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1582:1: ruleRelationalOperator returns [EObject current=null] : ( ( (lv_o_0_0= '>' ) ) | ( (lv_o_1_0= '<' ) ) | ( (lv_o_2_0= '>=' ) ) | ( (lv_o_3_0= '<=' ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) ) ;
    public final EObject ruleRelationalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_o_0_0=null;
        Token lv_o_1_0=null;
        Token lv_o_2_0=null;
        Token lv_o_3_0=null;
        AntlrDatatypeRuleToken lv_neo_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1585:28: ( ( ( (lv_o_0_0= '>' ) ) | ( (lv_o_1_0= '<' ) ) | ( (lv_o_2_0= '>=' ) ) | ( (lv_o_3_0= '<=' ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1586:1: ( ( (lv_o_0_0= '>' ) ) | ( (lv_o_1_0= '<' ) ) | ( (lv_o_2_0= '>=' ) ) | ( (lv_o_3_0= '<=' ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1586:1: ( ( (lv_o_0_0= '>' ) ) | ( (lv_o_1_0= '<' ) ) | ( (lv_o_2_0= '>=' ) ) | ( (lv_o_3_0= '<=' ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case 40:
                {
                alt26=3;
                }
                break;
            case 41:
                {
                alt26=4;
                }
                break;
            case 42:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1586:2: ( (lv_o_0_0= '>' ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1586:2: ( (lv_o_0_0= '>' ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1587:1: (lv_o_0_0= '>' )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1587:1: (lv_o_0_0= '>' )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1588:3: lv_o_0_0= '>'
                    {
                    lv_o_0_0=(Token)match(input,38,FOLLOW_38_in_ruleRelationalOperator3087); 

                            newLeafNode(lv_o_0_0, grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "o", lv_o_0_0, ">");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1602:6: ( (lv_o_1_0= '<' ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1602:6: ( (lv_o_1_0= '<' ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1603:1: (lv_o_1_0= '<' )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1603:1: (lv_o_1_0= '<' )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1604:3: lv_o_1_0= '<'
                    {
                    lv_o_1_0=(Token)match(input,39,FOLLOW_39_in_ruleRelationalOperator3124); 

                            newLeafNode(lv_o_1_0, grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "o", lv_o_1_0, "<");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1618:6: ( (lv_o_2_0= '>=' ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1618:6: ( (lv_o_2_0= '>=' ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1619:1: (lv_o_2_0= '>=' )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1619:1: (lv_o_2_0= '>=' )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1620:3: lv_o_2_0= '>='
                    {
                    lv_o_2_0=(Token)match(input,40,FOLLOW_40_in_ruleRelationalOperator3161); 

                            newLeafNode(lv_o_2_0, grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "o", lv_o_2_0, ">=");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1634:6: ( (lv_o_3_0= '<=' ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1634:6: ( (lv_o_3_0= '<=' ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1635:1: (lv_o_3_0= '<=' )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1635:1: (lv_o_3_0= '<=' )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1636:3: lv_o_3_0= '<='
                    {
                    lv_o_3_0=(Token)match(input,41,FOLLOW_41_in_ruleRelationalOperator3198); 

                            newLeafNode(lv_o_3_0, grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "o", lv_o_3_0, "<=");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1650:6: ( (lv_neo_4_0= ruleNotEqualOperator ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1650:6: ( (lv_neo_4_0= ruleNotEqualOperator ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1651:1: (lv_neo_4_0= ruleNotEqualOperator )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1651:1: (lv_neo_4_0= ruleNotEqualOperator )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1652:3: lv_neo_4_0= ruleNotEqualOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalOperatorAccess().getNeoNotEqualOperatorParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotEqualOperator_in_ruleRelationalOperator3238);
                    lv_neo_4_0=ruleNotEqualOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalOperatorRule());
                    	        }
                           		set(
                           			current, 
                           			"neo",
                            		lv_neo_4_0, 
                            		"NotEqualOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleNotEqualOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1676:1: entryRuleNotEqualOperator returns [String current=null] : iv_ruleNotEqualOperator= ruleNotEqualOperator EOF ;
    public final String entryRuleNotEqualOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotEqualOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1677:2: (iv_ruleNotEqualOperator= ruleNotEqualOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1678:2: iv_ruleNotEqualOperator= ruleNotEqualOperator EOF
            {
             newCompositeNode(grammarAccess.getNotEqualOperatorRule()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator3275);
            iv_ruleNotEqualOperator=ruleNotEqualOperator();

            state._fsp--;

             current =iv_ruleNotEqualOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualOperator3286); 

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
    // $ANTLR end "entryRuleNotEqualOperator"


    // $ANTLR start "ruleNotEqualOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1685:1: ruleNotEqualOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken ruleNotEqualOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1688:28: (kw= '!=' )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1690:2: kw= '!='
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleNotEqualOperator3323); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNotEqualOperatorAccess().getExclamationMarkEqualsSignKeyword()); 
                

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
    // $ANTLR end "ruleNotEqualOperator"


    // $ANTLR start "entryRuleSet"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1703:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1704:2: (iv_ruleSet= ruleSet EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1705:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet3362);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet3372); 

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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1712:1: ruleSet returns [EObject current=null] : (otherlv_0= '{' ( (lv_l_1_0= ruleList ) ) otherlv_2= '}' (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_l_1_0 = null;

        EObject lv_s_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1715:28: ( (otherlv_0= '{' ( (lv_l_1_0= ruleList ) ) otherlv_2= '}' (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1716:1: (otherlv_0= '{' ( (lv_l_1_0= ruleList ) ) otherlv_2= '}' (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1716:1: (otherlv_0= '{' ( (lv_l_1_0= ruleList ) ) otherlv_2= '}' (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1716:3: otherlv_0= '{' ( (lv_l_1_0= ruleList ) ) otherlv_2= '}' (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSet3409); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1720:1: ( (lv_l_1_0= ruleList ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1721:1: (lv_l_1_0= ruleList )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1721:1: (lv_l_1_0= ruleList )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1722:3: lv_l_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getSetAccess().getLListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleSet3430);
            lv_l_1_0=ruleList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSetRule());
            	        }
                   		set(
                   			current, 
                   			"l",
                    		lv_l_1_0, 
                    		"List");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleSet3442); 

                	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1742:1: (otherlv_3= ',' ( (lv_s_4_0= ruleSet ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1742:3: otherlv_3= ',' ( (lv_s_4_0= ruleSet ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleSet3455); 

                        	newLeafNode(otherlv_3, grammarAccess.getSetAccess().getCommaKeyword_3_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1746:1: ( (lv_s_4_0= ruleSet ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1747:1: (lv_s_4_0= ruleSet )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1747:1: (lv_s_4_0= ruleSet )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1748:3: lv_s_4_0= ruleSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getSSetParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSet_in_ruleSet3476);
                    lv_s_4_0=ruleSet();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSetRule());
                    	        }
                           		set(
                           			current, 
                           			"s",
                            		lv_s_4_0, 
                            		"Set");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleList"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1772:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1773:2: (iv_ruleList= ruleList EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1774:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList3514);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList3524); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1781:1: ruleList returns [EObject current=null] : ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_sl_0_0 = null;

        AntlrDatatypeRuleToken lv_ol_1_0 = null;

        EObject lv_l_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1784:28: ( ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:1: ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:1: ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:2: ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:2: ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING||LA28_0==44) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT||(LA28_0>=RULE_FLOAT && LA28_0<=RULE_DATE_TIME)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:3: ( (lv_sl_0_0= ruleStringLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1785:3: ( (lv_sl_0_0= ruleStringLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1786:1: (lv_sl_0_0= ruleStringLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1786:1: (lv_sl_0_0= ruleStringLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1787:3: lv_sl_0_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getSlStringLiteralParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleList3571);
                    lv_sl_0_0=ruleStringLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		set(
                           			current, 
                           			"sl",
                            		lv_sl_0_0, 
                            		"StringLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1804:6: ( (lv_ol_1_0= ruleOtherLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1804:6: ( (lv_ol_1_0= ruleOtherLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1805:1: (lv_ol_1_0= ruleOtherLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1805:1: (lv_ol_1_0= ruleOtherLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1806:3: lv_ol_1_0= ruleOtherLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getOlOtherLiteralParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOtherLiteral_in_ruleList3598);
                    lv_ol_1_0=ruleOtherLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		set(
                           			current, 
                           			"ol",
                            		lv_ol_1_0, 
                            		"OtherLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1822:3: (otherlv_2= ',' ( (lv_l_3_0= ruleList ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1822:5: otherlv_2= ',' ( (lv_l_3_0= ruleList ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleList3612); 

                        	newLeafNode(otherlv_2, grammarAccess.getListAccess().getCommaKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1826:1: ( (lv_l_3_0= ruleList ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1827:1: (lv_l_3_0= ruleList )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1827:1: (lv_l_3_0= ruleList )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1828:3: lv_l_3_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getLListParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleList3633);
                    lv_l_3_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		set(
                           			current, 
                           			"l",
                            		lv_l_3_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1852:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1853:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1854:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3672);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3683); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1861:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1864:28: ( (this_STRING_0= RULE_STRING | kw= 'null' ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1865:1: (this_STRING_0= RULE_STRING | kw= 'null' )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1865:1: (this_STRING_0= RULE_STRING | kw= 'null' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==44) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1865:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3723); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1874:2: kw= 'null'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleStringLiteral3747); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStringLiteralAccess().getNullKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleOtherLiteral"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1887:1: entryRuleOtherLiteral returns [String current=null] : iv_ruleOtherLiteral= ruleOtherLiteral EOF ;
    public final String entryRuleOtherLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherLiteral = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1888:2: (iv_ruleOtherLiteral= ruleOtherLiteral EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1889:2: iv_ruleOtherLiteral= ruleOtherLiteral EOF
            {
             newCompositeNode(grammarAccess.getOtherLiteralRule()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral3788);
            iv_ruleOtherLiteral=ruleOtherLiteral();

            state._fsp--;

             current =iv_ruleOtherLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLiteral3799); 

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
    // $ANTLR end "entryRuleOtherLiteral"


    // $ANTLR start "ruleOtherLiteral"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1896:1: ruleOtherLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME ) ;
    public final AntlrDatatypeRuleToken ruleOtherLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_MINUS_FLOAT_1=null;
        Token this_INT_2=null;
        Token this_MINUS_INTEGER_3=null;
        Token this_DATE_TIME_4=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1899:28: ( (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1900:1: (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1900:1: (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME )
            int alt31=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt31=1;
                }
                break;
            case RULE_MINUS_FLOAT:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case RULE_MINUS_INTEGER:
                {
                alt31=4;
                }
                break;
            case RULE_DATE_TIME:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1900:6: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleOtherLiteral3839); 

                    		current.merge(this_FLOAT_0);
                        
                     
                        newLeafNode(this_FLOAT_0, grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1908:10: this_MINUS_FLOAT_1= RULE_MINUS_FLOAT
                    {
                    this_MINUS_FLOAT_1=(Token)match(input,RULE_MINUS_FLOAT,FOLLOW_RULE_MINUS_FLOAT_in_ruleOtherLiteral3865); 

                    		current.merge(this_MINUS_FLOAT_1);
                        
                     
                        newLeafNode(this_MINUS_FLOAT_1, grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1916:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOtherLiteral3891); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1924:10: this_MINUS_INTEGER_3= RULE_MINUS_INTEGER
                    {
                    this_MINUS_INTEGER_3=(Token)match(input,RULE_MINUS_INTEGER,FOLLOW_RULE_MINUS_INTEGER_in_ruleOtherLiteral3917); 

                    		current.merge(this_MINUS_INTEGER_3);
                        
                     
                        newLeafNode(this_MINUS_INTEGER_3, grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1932:10: this_DATE_TIME_4= RULE_DATE_TIME
                    {
                    this_DATE_TIME_4=(Token)match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_ruleOtherLiteral3943); 

                    		current.merge(this_DATE_TIME_4);
                        
                     
                        newLeafNode(this_DATE_TIME_4, grammarAccess.getOtherLiteralAccess().getDATE_TIMETerminalRuleCall_4()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleOtherLiteral"


    // $ANTLR start "entryRuleTestPackage"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1947:1: entryRuleTestPackage returns [String current=null] : iv_ruleTestPackage= ruleTestPackage EOF ;
    public final String entryRuleTestPackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestPackage = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1948:2: (iv_ruleTestPackage= ruleTestPackage EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1949:2: iv_ruleTestPackage= ruleTestPackage EOF
            {
             newCompositeNode(grammarAccess.getTestPackageRule()); 
            pushFollow(FOLLOW_ruleTestPackage_in_entryRuleTestPackage3989);
            iv_ruleTestPackage=ruleTestPackage();

            state._fsp--;

             current =iv_ruleTestPackage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestPackage4000); 

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
    // $ANTLR end "entryRuleTestPackage"


    // $ANTLR start "ruleTestPackage"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1956:1: ruleTestPackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Package' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleTestPackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1959:28: ( (kw= 'Package' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1960:1: (kw= 'Package' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1960:1: (kw= 'Package' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )* )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1961:2: kw= 'Package' this_ID_1= RULE_ID (kw= '.' this_ID_3= RULE_ID )*
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleTestPackage4038); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestPackageAccess().getPackageKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestPackage4053); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1973:1: (kw= '.' this_ID_3= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==46) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLeta.g:1974:2: kw= '.' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_46_in_ruleTestPackage4072); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTestPackageAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestPackage4087); 

            	    		current.merge(this_ID_3);
            	        
            	     
            	        newLeafNode(this_ID_3, grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
    // $ANTLR end "ruleTestPackage"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\4\1\uffff\1\4\5\5\5\4\1\5\2\4\1\uffff\1\4";
    static final String DFA5_maxS =
        "\1\36\1\uffff\1\54\4\32\1\54\5\37\1\5\2\37\1\uffff\1\37";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\16\uffff\1\2\1\uffff";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\26\uffff\4\1",
            "",
            "\1\1\1\12\1\16\1\10\1\11\1\13\1\14\17\uffff\1\15\4\uffff\1"+
            "\20\6\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\17",
            "\1\12\1\uffff\1\10\1\11\1\13\1\14\17\uffff\1\15",
            "\1\12\1\uffff\1\10\1\11\1\13\1\14\17\uffff\1\15",
            "\1\12\1\uffff\1\10\1\11\1\13\1\14\17\uffff\1\15",
            "\1\12\1\uffff\1\10\1\11\1\13\1\14\17\uffff\1\15",
            "\1\12\1\16\1\10\1\11\1\13\1\14\17\uffff\1\15\21\uffff\1\17",
            "\1\1\32\uffff\1\20",
            "\1\1\32\uffff\1\20",
            "\1\1\32\uffff\1\20",
            "\1\1\32\uffff\1\20",
            "\1\1\32\uffff\1\20",
            "\1\21",
            "\1\1\32\uffff\1\20",
            "\1\1\32\uffff\1\20",
            "",
            "\1\1\32\uffff\1\20"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "377:3: ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\12\uffff";
    static final String DFA15_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA15_minS =
        "\2\4\5\5\3\uffff";
    static final String DFA15_maxS =
        "\1\4\1\54\4\32\1\54\3\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\10\6\7\5\uffff\1\10\1\uffff\2\10\3\uffff\3\10\1\11\13\uffff"+
            "\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7",
            "\1\7\1\uffff\4\7\17\uffff\1\11",
            "\1\7\1\uffff\4\7\17\uffff\1\11",
            "\1\7\1\uffff\4\7\17\uffff\1\11",
            "\1\7\1\uffff\4\7\17\uffff\1\11",
            "\6\7\17\uffff\1\11\21\uffff\1\7",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "754:3: ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )";
        }
    }
    static final String DFA24_eotS =
        "\12\uffff";
    static final String DFA24_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA24_minS =
        "\1\4\1\5\1\uffff\5\5\2\uffff";
    static final String DFA24_maxS =
        "\1\4\1\54\1\uffff\4\32\1\54\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA24_specialS =
        "\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\6\10\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\11\4\uffff\7\2"+
            "\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10",
            "",
            "\1\10\1\uffff\4\10\17\uffff\1\11",
            "\1\10\1\uffff\4\10\17\uffff\1\11",
            "\1\10\1\uffff\4\10\17\uffff\1\11",
            "\1\10\1\uffff\4\10\17\uffff\1\11",
            "\6\10\17\uffff\1\11\21\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1447:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLeta_in_entryRuleLeta75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeta85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_ruleLeta131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTestCase_in_ruleLeta153 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTestCase237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestCase254 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_ruleTestCase280 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleWhenClause_in_ruleTestCase301 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleTestCase322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerifyClause369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVerifyClause406 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_rulefactComposite_in_ruleVerifyClause427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_entryRuleWhenClause463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenClause473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleWhenClause510 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_rulefactComposite_in_ruleWhenClause531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSetClause623 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSetClause635 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSetClause656 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSetClause669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_entryRulefactComposite705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactComposite715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rulefactComposite763 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rulefactComposite790 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_rulefactComposite813 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_rulefactComposite_in_rulefactComposite834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulefactComposite856 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_rulefactComposite_in_rulefactComposite877 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulefactComposite889 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_rulefactComposite911 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_rulefactComposite_in_rulefactComposite932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_entryRulelogicalOperator972 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogicalOperator983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulelogicalOperator1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulelogicalOperator1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFact1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComplement_in_ruleFact1157 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFact1179 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFactExt_in_ruleFact1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_entryRuleFactExt1239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactExt1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_ruleFactExt1295 = new BitSet(new long[]{0x0000000078000012L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFactExt1317 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFactExt_in_ruleFactExt1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_entryRuleTermComposite1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermComposite1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_ruleTermComposite1433 = new BitSet(new long[]{0x0000000078000010L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermComposite1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_ruleTermComposite1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_ruleTermComposite1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_entryRuleTermInstance1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermInstance1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermInstance1695 = new BitSet(new long[]{0x0000140000000040L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_ruleTermInstance1716 = new BitSet(new long[]{0x0000140000000040L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleTermInstance1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermInstance1767 = new BitSet(new long[]{0x000007C0000007A0L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleTermInstance1788 = new BitSet(new long[]{0x000007C0000007A0L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_ruleTermInstance1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermWithAssociation1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermWithAssociation1903 = new BitSet(new long[]{0x000007C004000000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleTermWithAssociation1924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTermWithAssociation1937 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTermWithAssociation1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleQuantifier2043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleQuantifier2085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleQuantifier2127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleQuantifier2169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_entryRuleComplement2250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplement2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplement2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula2341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_ruleFormula2397 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFormula2409 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormula2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaExpression2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_ruleFormulaExpression2523 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleFormulaExpression2545 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFormulaExpression2588 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2609 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFormulaExpression2621 = new BitSet(new long[]{0x0000003F00000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleFormulaExpression2643 = new BitSet(new long[]{0x0000000078400010L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaItem2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFormulaItem2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_ruleFormulaItem2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_ruleFormulaItem2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator2850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMathOperator2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleMathOperator2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMathOperator2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMathOperator2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMathOperator2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMathOperator2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator3034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRelationalOperator3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationalOperator3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationalOperator3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationalOperator3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_ruleRelationalOperator3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator3275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualOperator3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotEqualOperator3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSet3409 = new BitSet(new long[]{0x000017C0000007E0L});
    public static final BitSet FOLLOW_ruleList_in_ruleSet3430 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSet3442 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleSet3455 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSet3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleList3571 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_ruleList3598 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleList3612 = new BitSet(new long[]{0x000017C0000007E0L});
    public static final BitSet FOLLOW_ruleList_in_ruleList3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleStringLiteral3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral3788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLiteral3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleOtherLiteral3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_FLOAT_in_ruleOtherLiteral3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOtherLiteral3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_INTEGER_in_ruleOtherLiteral3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_ruleOtherLiteral3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_entryRuleTestPackage3989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestPackage4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTestPackage4038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestPackage4053 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTestPackage4072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestPackage4087 = new BitSet(new long[]{0x0000400000000002L});

}