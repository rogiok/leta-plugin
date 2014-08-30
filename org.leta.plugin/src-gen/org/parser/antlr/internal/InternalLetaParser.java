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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_31", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_26", "KEYWORD_27", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_21", "KEYWORD_22", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "RULE_DIGIT", "RULE_MINUS_INTEGER", "RULE_FLOAT", "RULE_MINUS_FLOAT", "RULE_DATE_TIME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    public static final int KEYWORD_12=31;
    public static final int EOF=-1;
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


        public InternalLetaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLetaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLetaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g"; }




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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:61:1: entryRuleLeta returns [EObject current=null] : iv_ruleLeta= ruleLeta EOF ;
    public final EObject entryRuleLeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeta = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:62:2: (iv_ruleLeta= ruleLeta EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:63:2: iv_ruleLeta= ruleLeta EOF
            {
             newCompositeNode(grammarAccess.getLetaRule()); 
            pushFollow(FOLLOW_ruleLeta_in_entryRuleLeta67);
            iv_ruleLeta=ruleLeta();

            state._fsp--;

             current =iv_ruleLeta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeta77); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:70:1: ruleLeta returns [EObject current=null] : ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ ) ;
    public final EObject ruleLeta() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_tp_0_0 = null;

        EObject lv_tc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:73:28: ( ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:74:1: ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:74:1: ( ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+ )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:74:2: ( (lv_tp_0_0= ruleTestPackage ) )? ( (lv_tc_1_0= ruleTestCase ) )+
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:74:2: ( (lv_tp_0_0= ruleTestPackage ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_30) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:75:1: (lv_tp_0_0= ruleTestPackage )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:75:1: (lv_tp_0_0= ruleTestPackage )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:76:3: lv_tp_0_0= ruleTestPackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetaAccess().getTpTestPackageParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTestPackage_in_ruleLeta123);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:92:3: ( (lv_tc_1_0= ruleTestCase ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:93:1: (lv_tc_1_0= ruleTestCase )
            	    {
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:93:1: (lv_tc_1_0= ruleTestCase )
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:94:3: lv_tc_1_0= ruleTestCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLetaAccess().getTcTestCaseParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTestCase_in_ruleLeta145);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:118:1: entryRuleTestCase returns [EObject current=null] : iv_ruleTestCase= ruleTestCase EOF ;
    public final EObject entryRuleTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestCase = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:119:2: (iv_ruleTestCase= ruleTestCase EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:120:2: iv_ruleTestCase= ruleTestCase EOF
            {
             newCompositeNode(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase181);
            iv_ruleTestCase=ruleTestCase();

            state._fsp--;

             current =iv_ruleTestCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase191); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:127:1: ruleTestCase returns [EObject current=null] : (otherlv_0= KEYWORD_23 ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? ) ;
    public final EObject ruleTestCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        EObject lv_v_2_0 = null;

        EObject lv_w_3_0 = null;

        EObject lv_s_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:130:28: ( (otherlv_0= KEYWORD_23 ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:131:1: (otherlv_0= KEYWORD_23 ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:131:1: (otherlv_0= KEYWORD_23 ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:132:2: otherlv_0= KEYWORD_23 ( (lv_id_1_0= RULE_ID ) ) ( (lv_v_2_0= ruleVerifyClause ) ) ( (lv_w_3_0= ruleWhenClause ) ) ( (lv_s_4_0= ruleSetClause ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleTestCase229); 

                	newLeafNode(otherlv_0, grammarAccess.getTestCaseAccess().getTestKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:136:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:137:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:137:1: (lv_id_1_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:138:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestCase245); 

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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:154:2: ( (lv_v_2_0= ruleVerifyClause ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:155:1: (lv_v_2_0= ruleVerifyClause )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:155:1: (lv_v_2_0= ruleVerifyClause )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:156:3: lv_v_2_0= ruleVerifyClause
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getVVerifyClauseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVerifyClause_in_ruleTestCase271);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:172:2: ( (lv_w_3_0= ruleWhenClause ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:173:1: (lv_w_3_0= ruleWhenClause )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:173:1: (lv_w_3_0= ruleWhenClause )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:174:3: lv_w_3_0= ruleWhenClause
            {
             
            	        newCompositeNode(grammarAccess.getTestCaseAccess().getWWhenClauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleWhenClause_in_ruleTestCase292);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:190:2: ( (lv_s_4_0= ruleSetClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:191:1: (lv_s_4_0= ruleSetClause )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:191:1: (lv_s_4_0= ruleSetClause )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:192:3: lv_s_4_0= ruleSetClause
                    {
                     
                    	        newCompositeNode(grammarAccess.getTestCaseAccess().getSSetClauseParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSetClause_in_ruleTestCase313);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:216:1: entryRuleVerifyClause returns [EObject current=null] : iv_ruleVerifyClause= ruleVerifyClause EOF ;
    public final EObject entryRuleVerifyClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:217:2: (iv_ruleVerifyClause= ruleVerifyClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:218:2: iv_ruleVerifyClause= ruleVerifyClause EOF
            {
             newCompositeNode(grammarAccess.getVerifyClauseRule()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause349);
            iv_ruleVerifyClause=ruleVerifyClause();

            state._fsp--;

             current =iv_ruleVerifyClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerifyClause359); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:225:1: ruleVerifyClause returns [EObject current=null] : (otherlv_0= KEYWORD_27 ( (lv_fc_1_0= ruleFactComposite ) ) ) ;
    public final EObject ruleVerifyClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:228:28: ( (otherlv_0= KEYWORD_27 ( (lv_fc_1_0= ruleFactComposite ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:229:1: (otherlv_0= KEYWORD_27 ( (lv_fc_1_0= ruleFactComposite ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:229:1: (otherlv_0= KEYWORD_27 ( (lv_fc_1_0= ruleFactComposite ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:230:2: otherlv_0= KEYWORD_27 ( (lv_fc_1_0= ruleFactComposite ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleVerifyClause397); 

                	newLeafNode(otherlv_0, grammarAccess.getVerifyClauseAccess().getVerifyKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:234:1: ( (lv_fc_1_0= ruleFactComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:235:1: (lv_fc_1_0= ruleFactComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:235:1: (lv_fc_1_0= ruleFactComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:236:3: lv_fc_1_0= ruleFactComposite
            {
             
            	        newCompositeNode(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFactComposite_in_ruleVerifyClause417);
            lv_fc_1_0=ruleFactComposite();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVerifyClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fc",
                    		lv_fc_1_0, 
                    		"FactComposite");
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:260:1: entryRuleWhenClause returns [EObject current=null] : iv_ruleWhenClause= ruleWhenClause EOF ;
    public final EObject entryRuleWhenClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhenClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:261:2: (iv_ruleWhenClause= ruleWhenClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:262:2: iv_ruleWhenClause= ruleWhenClause EOF
            {
             newCompositeNode(grammarAccess.getWhenClauseRule()); 
            pushFollow(FOLLOW_ruleWhenClause_in_entryRuleWhenClause452);
            iv_ruleWhenClause=ruleWhenClause();

            state._fsp--;

             current =iv_ruleWhenClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenClause462); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:269:1: ruleWhenClause returns [EObject current=null] : (otherlv_0= KEYWORD_25 ( (lv_fc_1_0= ruleFactComposite ) ) ) ;
    public final EObject ruleWhenClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:272:28: ( (otherlv_0= KEYWORD_25 ( (lv_fc_1_0= ruleFactComposite ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:273:1: (otherlv_0= KEYWORD_25 ( (lv_fc_1_0= ruleFactComposite ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:273:1: (otherlv_0= KEYWORD_25 ( (lv_fc_1_0= ruleFactComposite ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:274:2: otherlv_0= KEYWORD_25 ( (lv_fc_1_0= ruleFactComposite ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleWhenClause500); 

                	newLeafNode(otherlv_0, grammarAccess.getWhenClauseAccess().getWhenKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:278:1: ( (lv_fc_1_0= ruleFactComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:279:1: (lv_fc_1_0= ruleFactComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:279:1: (lv_fc_1_0= ruleFactComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:280:3: lv_fc_1_0= ruleFactComposite
            {
             
            	        newCompositeNode(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFactComposite_in_ruleWhenClause520);
            lv_fc_1_0=ruleFactComposite();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhenClauseRule());
            	        }
                   		set(
                   			current, 
                   			"fc",
                    		lv_fc_1_0, 
                    		"FactComposite");
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:304:1: entryRuleSetClause returns [EObject current=null] : iv_ruleSetClause= ruleSetClause EOF ;
    public final EObject entryRuleSetClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetClause = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:305:2: (iv_ruleSetClause= ruleSetClause EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:306:2: iv_ruleSetClause= ruleSetClause EOF
            {
             newCompositeNode(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause555);
            iv_ruleSetClause=ruleSetClause();

            state._fsp--;

             current =iv_ruleSetClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause565); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:313:1: ruleSetClause returns [EObject current=null] : ( () otherlv_1= KEYWORD_22 otherlv_2= KEYWORD_14 ( (lv_s_3_0= ruleSet ) )? otherlv_4= KEYWORD_15 ) ;
    public final EObject ruleSetClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_s_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:316:28: ( ( () otherlv_1= KEYWORD_22 otherlv_2= KEYWORD_14 ( (lv_s_3_0= ruleSet ) )? otherlv_4= KEYWORD_15 ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:317:1: ( () otherlv_1= KEYWORD_22 otherlv_2= KEYWORD_14 ( (lv_s_3_0= ruleSet ) )? otherlv_4= KEYWORD_15 )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:317:1: ( () otherlv_1= KEYWORD_22 otherlv_2= KEYWORD_14 ( (lv_s_3_0= ruleSet ) )? otherlv_4= KEYWORD_15 )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:317:2: () otherlv_1= KEYWORD_22 otherlv_2= KEYWORD_14 ( (lv_s_3_0= ruleSet ) )? otherlv_4= KEYWORD_15
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:317:2: ()
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:318:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSetClauseAccess().getSetAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleSetClause612); 

                	newLeafNode(otherlv_1, grammarAccess.getSetClauseAccess().getSetKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSetClause624); 

                	newLeafNode(otherlv_2, grammarAccess.getSetClauseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:333:1: ( (lv_s_3_0= ruleSet ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KEYWORD_14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:334:1: (lv_s_3_0= ruleSet )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:334:1: (lv_s_3_0= ruleSet )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:335:3: lv_s_3_0= ruleSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetClauseAccess().getSSetParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSet_in_ruleSetClause644);
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

            otherlv_4=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSetClause658); 

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


    // $ANTLR start "entryRuleFactComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:364:1: entryRuleFactComposite returns [EObject current=null] : iv_ruleFactComposite= ruleFactComposite EOF ;
    public final EObject entryRuleFactComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactComposite = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:365:2: (iv_ruleFactComposite= ruleFactComposite EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:366:2: iv_ruleFactComposite= ruleFactComposite EOF
            {
             newCompositeNode(grammarAccess.getFactCompositeRule()); 
            pushFollow(FOLLOW_ruleFactComposite_in_entryRuleFactComposite692);
            iv_ruleFactComposite=ruleFactComposite();

            state._fsp--;

             current =iv_ruleFactComposite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactComposite702); 

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
    // $ANTLR end "entryRuleFactComposite"


    // $ANTLR start "ruleFactComposite"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:373:1: ruleFactComposite returns [EObject current=null] : ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? ) | (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? ) ) ;
    public final EObject ruleFactComposite() throws RecognitionException {
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:376:28: ( ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? ) | (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:1: ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? ) | (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:1: ( ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? ) | (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=KEYWORD_31 && LA8_0<=KEYWORD_29)||LA8_0==KEYWORD_26||LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==KEYWORD_2) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:2: ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:2: ( ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:3: ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) ) ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:3: ( ( (lv_f_0_0= ruleFact ) ) | ( (lv_fo_1_0= ruleFormula ) ) )
                    int alt5=2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:4: ( (lv_f_0_0= ruleFact ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:377:4: ( (lv_f_0_0= ruleFact ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:378:1: (lv_f_0_0= ruleFact )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:378:1: (lv_f_0_0= ruleFact )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:379:3: lv_f_0_0= ruleFact
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFFactParserRuleCall_0_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFact_in_ruleFactComposite750);
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
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:396:6: ( (lv_fo_1_0= ruleFormula ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:396:6: ( (lv_fo_1_0= ruleFormula ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:397:1: (lv_fo_1_0= ruleFormula )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:397:1: (lv_fo_1_0= ruleFormula )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:398:3: lv_fo_1_0= ruleFormula
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFoFormulaParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormula_in_ruleFactComposite777);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:414:3: ( ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==KEYWORD_21||LA6_0==KEYWORD_20) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:414:4: ( (lv_op_2_0= ruleLogicalOperator ) ) ( (lv_fc_3_0= ruleFactComposite ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:414:4: ( (lv_op_2_0= ruleLogicalOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:415:1: (lv_op_2_0= ruleLogicalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:415:1: (lv_op_2_0= ruleLogicalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:416:3: lv_op_2_0= ruleLogicalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleFactComposite800);
                            lv_op_2_0=ruleLogicalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_2_0, 
                                    		"LogicalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:432:2: ( (lv_fc_3_0= ruleFactComposite ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:433:1: (lv_fc_3_0= ruleFactComposite )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:433:1: (lv_fc_3_0= ruleFactComposite )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:434:3: lv_fc_3_0= ruleFactComposite
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFcFactCompositeParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactComposite_in_ruleFactComposite821);
                            lv_fc_3_0=ruleFactComposite();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fc",
                                    		lv_fc_3_0, 
                                    		"FactComposite");
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:451:6: (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:451:6: (otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:452:2: otherlv_4= KEYWORD_2 ( (lv_fc1_5_0= ruleFactComposite ) ) otherlv_6= KEYWORD_3 ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )?
                    {
                    otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFactComposite844); 

                        	newLeafNode(otherlv_4, grammarAccess.getFactCompositeAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:456:1: ( (lv_fc1_5_0= ruleFactComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:457:1: (lv_fc1_5_0= ruleFactComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:457:1: (lv_fc1_5_0= ruleFactComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:458:3: lv_fc1_5_0= ruleFactComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFc1FactCompositeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFactComposite_in_ruleFactComposite864);
                    lv_fc1_5_0=ruleFactComposite();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                    	        }
                           		set(
                           			current, 
                           			"fc1",
                            		lv_fc1_5_0, 
                            		"FactComposite");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFactComposite877); 

                        	newLeafNode(otherlv_6, grammarAccess.getFactCompositeAccess().getRightParenthesisKeyword_1_2());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:479:1: ( ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==KEYWORD_21||LA7_0==KEYWORD_20) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:479:2: ( (lv_op_7_0= ruleLogicalOperator ) ) ( (lv_fc2_8_0= ruleFactComposite ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:479:2: ( (lv_op_7_0= ruleLogicalOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:480:1: (lv_op_7_0= ruleLogicalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:480:1: (lv_op_7_0= ruleLogicalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:481:3: lv_op_7_0= ruleLogicalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleLogicalOperator_in_ruleFactComposite898);
                            lv_op_7_0=ruleLogicalOperator();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"op",
                                    		lv_op_7_0, 
                                    		"LogicalOperator");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:497:2: ( (lv_fc2_8_0= ruleFactComposite ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:498:1: (lv_fc2_8_0= ruleFactComposite )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:498:1: (lv_fc2_8_0= ruleFactComposite )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:499:3: lv_fc2_8_0= ruleFactComposite
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactCompositeAccess().getFc2FactCompositeParserRuleCall_1_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactComposite_in_ruleFactComposite919);
                            lv_fc2_8_0=ruleFactComposite();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFactCompositeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"fc2",
                                    		lv_fc2_8_0, 
                                    		"FactComposite");
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
    // $ANTLR end "ruleFactComposite"


    // $ANTLR start "entryRuleLogicalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:523:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:524:1: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:525:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_ruleLogicalOperator_in_entryRuleLogicalOperator958);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;

             current =iv_ruleLogicalOperator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOperator969); 

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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:532:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_21 | kw= KEYWORD_20 ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:536:6: ( (kw= KEYWORD_21 | kw= KEYWORD_20 ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:537:1: (kw= KEYWORD_21 | kw= KEYWORD_20 )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:537:1: (kw= KEYWORD_21 | kw= KEYWORD_20 )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_21) ) {
                alt9=1;
            }
            else if ( (LA9_0==KEYWORD_20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:538:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleLogicalOperator1007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:545:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleLogicalOperator1026); 

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleFact"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:558:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:559:2: (iv_ruleFact= ruleFact EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:560:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact1065);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact1075); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:567:1: ruleFact returns [EObject current=null] : ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        EObject lv_termComposite_0_0 = null;

        EObject lv_complement_1_0 = null;

        EObject lv_termComposite2_2_0 = null;

        EObject lv_factExt_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:570:28: ( ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:571:1: ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:571:1: ( ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:571:2: ( (lv_termComposite_0_0= ruleTermComposite ) ) ( (lv_complement_1_0= ruleComplement ) ) ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:571:2: ( (lv_termComposite_0_0= ruleTermComposite ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:572:1: (lv_termComposite_0_0= ruleTermComposite )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:572:1: (lv_termComposite_0_0= ruleTermComposite )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:573:3: lv_termComposite_0_0= ruleTermComposite
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getTermCompositeTermCompositeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTermComposite_in_ruleFact1121);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:589:2: ( (lv_complement_1_0= ruleComplement ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:590:1: (lv_complement_1_0= ruleComplement )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:590:1: (lv_complement_1_0= ruleComplement )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:591:3: lv_complement_1_0= ruleComplement
            {
             
            	        newCompositeNode(grammarAccess.getFactAccess().getComplementComplementParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComplement_in_ruleFact1142);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:607:2: ( ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=KEYWORD_31 && LA11_0<=KEYWORD_29)||LA11_0==KEYWORD_26||LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:607:3: ( (lv_termComposite2_2_0= ruleTermComposite ) ) ( (lv_factExt_3_0= ruleFactExt ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:607:3: ( (lv_termComposite2_2_0= ruleTermComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:608:1: (lv_termComposite2_2_0= ruleTermComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:608:1: (lv_termComposite2_2_0= ruleTermComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:609:3: lv_termComposite2_2_0= ruleTermComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactAccess().getTermComposite2TermCompositeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermComposite_in_ruleFact1164);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:625:2: ( (lv_factExt_3_0= ruleFactExt ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:626:1: (lv_factExt_3_0= ruleFactExt )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:626:1: (lv_factExt_3_0= ruleFactExt )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:627:3: lv_factExt_3_0= ruleFactExt
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactAccess().getFactExtFactExtParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactExt_in_ruleFact1185);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:651:1: entryRuleFactExt returns [EObject current=null] : iv_ruleFactExt= ruleFactExt EOF ;
    public final EObject entryRuleFactExt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactExt = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:652:2: (iv_ruleFactExt= ruleFactExt EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:653:2: iv_ruleFactExt= ruleFactExt EOF
            {
             newCompositeNode(grammarAccess.getFactExtRule()); 
            pushFollow(FOLLOW_ruleFactExt_in_entryRuleFactExt1223);
            iv_ruleFactExt=ruleFactExt();

            state._fsp--;

             current =iv_ruleFactExt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactExt1233); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:660:1: ruleFactExt returns [EObject current=null] : ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? ) ;
    public final EObject ruleFactExt() throws RecognitionException {
        EObject current = null;

        EObject lv_complement_0_0 = null;

        EObject lv_termComposite_1_0 = null;

        EObject lv_factExt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:663:28: ( ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:664:1: ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:664:1: ( ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:664:2: ( (lv_complement_0_0= ruleComplement ) ) ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:664:2: ( (lv_complement_0_0= ruleComplement ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:665:1: (lv_complement_0_0= ruleComplement )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:665:1: (lv_complement_0_0= ruleComplement )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:666:3: lv_complement_0_0= ruleComplement
            {
             
            	        newCompositeNode(grammarAccess.getFactExtAccess().getComplementComplementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComplement_in_ruleFactExt1279);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:682:2: ( ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=KEYWORD_31 && LA13_0<=KEYWORD_29)||LA13_0==KEYWORD_26||LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:682:3: ( (lv_termComposite_1_0= ruleTermComposite ) ) ( (lv_factExt_2_0= ruleFactExt ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:682:3: ( (lv_termComposite_1_0= ruleTermComposite ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:683:1: (lv_termComposite_1_0= ruleTermComposite )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:683:1: (lv_termComposite_1_0= ruleTermComposite )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:684:3: lv_termComposite_1_0= ruleTermComposite
                    {
                     
                    	        newCompositeNode(grammarAccess.getFactExtAccess().getTermCompositeTermCompositeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermComposite_in_ruleFactExt1301);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:700:2: ( (lv_factExt_2_0= ruleFactExt ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:701:1: (lv_factExt_2_0= ruleFactExt )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:701:1: (lv_factExt_2_0= ruleFactExt )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:702:3: lv_factExt_2_0= ruleFactExt
                            {
                             
                            	        newCompositeNode(grammarAccess.getFactExtAccess().getFactExtFactExtParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFactExt_in_ruleFactExt1322);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:726:1: entryRuleTermComposite returns [EObject current=null] : iv_ruleTermComposite= ruleTermComposite EOF ;
    public final EObject entryRuleTermComposite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermComposite = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:727:2: (iv_ruleTermComposite= ruleTermComposite EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:728:2: iv_ruleTermComposite= ruleTermComposite EOF
            {
             newCompositeNode(grammarAccess.getTermCompositeRule()); 
            pushFollow(FOLLOW_ruleTermComposite_in_entryRuleTermComposite1360);
            iv_ruleTermComposite=ruleTermComposite();

            state._fsp--;

             current =iv_ruleTermComposite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermComposite1370); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:735:1: ruleTermComposite returns [EObject current=null] : ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) ) ;
    public final EObject ruleTermComposite() throws RecognitionException {
        EObject current = null;

        EObject lv_quantifier_0_0 = null;

        EObject lv_term_1_0 = null;

        EObject lv_termInstance_2_0 = null;

        EObject lv_termWithAssociation_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:738:28: ( ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:739:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:739:1: ( ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:739:2: ( (lv_quantifier_0_0= ruleQuantifier ) )? ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:739:2: ( (lv_quantifier_0_0= ruleQuantifier ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=KEYWORD_31 && LA14_0<=KEYWORD_29)||LA14_0==KEYWORD_26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:740:1: (lv_quantifier_0_0= ruleQuantifier )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:740:1: (lv_quantifier_0_0= ruleQuantifier )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:741:3: lv_quantifier_0_0= ruleQuantifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getQuantifierQuantifierParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQuantifier_in_ruleTermComposite1416);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:757:3: ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:757:4: ( (lv_term_1_0= ruleTerm ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:757:4: ( (lv_term_1_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:758:1: (lv_term_1_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:758:1: (lv_term_1_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:759:3: lv_term_1_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermTermParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermComposite1439);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:776:6: ( (lv_termInstance_2_0= ruleTermInstance ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:776:6: ( (lv_termInstance_2_0= ruleTermInstance ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:777:1: (lv_termInstance_2_0= ruleTermInstance )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:777:1: (lv_termInstance_2_0= ruleTermInstance )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:778:3: lv_termInstance_2_0= ruleTermInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermInstanceTermInstanceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermInstance_in_ruleTermComposite1466);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:795:6: ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:795:6: ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:796:1: (lv_termWithAssociation_3_0= ruleTermWithAssociation )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:796:1: (lv_termWithAssociation_3_0= ruleTermWithAssociation )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:797:3: lv_termWithAssociation_3_0= ruleTermWithAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermCompositeAccess().getTermWithAssociationTermWithAssociationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermWithAssociation_in_ruleTermComposite1493);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:821:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:822:2: (iv_ruleTerm= ruleTerm EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:823:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1529);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1539); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:830:1: ruleTerm returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:833:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:834:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:834:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:835:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:835:1: (lv_id_0_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:836:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerm1580); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:860:1: entryRuleTermInstance returns [EObject current=null] : iv_ruleTermInstance= ruleTermInstance EOF ;
    public final EObject entryRuleTermInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermInstance = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:861:2: (iv_ruleTermInstance= ruleTermInstance EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:862:2: iv_ruleTermInstance= ruleTermInstance EOF
            {
             newCompositeNode(grammarAccess.getTermInstanceRule()); 
            pushFollow(FOLLOW_ruleTermInstance_in_entryRuleTermInstance1619);
            iv_ruleTermInstance=ruleTermInstance();

            state._fsp--;

             current =iv_ruleTermInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermInstance1629); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:869:1: ruleTermInstance returns [EObject current=null] : ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) ) ;
    public final EObject ruleTermInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;

        EObject lv_notEqualOperator_1_0 = null;

        AntlrDatatypeRuleToken lv_stringLiteral_2_0 = null;

        EObject lv_term_3_0 = null;

        EObject lv_relationalOperator_4_0 = null;

        AntlrDatatypeRuleToken lv_otherLiteral_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:872:28: ( ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:1: ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:1: ( ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) ) | ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_16:
                    {
                    int LA18_2 = input.LA(3);

                    if ( ((LA18_2>=RULE_MINUS_INTEGER && LA18_2<=RULE_DATE_TIME)||LA18_2==RULE_INT) ) {
                        alt18=2;
                    }
                    else if ( (LA18_2==KEYWORD_24||LA18_2==RULE_STRING) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case KEYWORD_24:
                case RULE_STRING:
                    {
                    alt18=1;
                    }
                    break;
                case KEYWORD_18:
                case KEYWORD_19:
                case KEYWORD_10:
                case KEYWORD_12:
                case RULE_MINUS_INTEGER:
                case RULE_FLOAT:
                case RULE_MINUS_FLOAT:
                case RULE_DATE_TIME:
                case RULE_INT:
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:2: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:2: ( ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:3: ( (lv_term_0_0= ruleTerm ) ) ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )? ( (lv_stringLiteral_2_0= ruleStringLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:873:3: ( (lv_term_0_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:874:1: (lv_term_0_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:874:1: (lv_term_0_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:875:3: lv_term_0_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermInstance1676);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:891:2: ( (lv_notEqualOperator_1_0= ruleNotEqualOperator ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==KEYWORD_16) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:892:1: (lv_notEqualOperator_1_0= ruleNotEqualOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:892:1: (lv_notEqualOperator_1_0= ruleNotEqualOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:893:3: lv_notEqualOperator_1_0= ruleNotEqualOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getTermInstanceAccess().getNotEqualOperatorNotEqualOperatorParserRuleCall_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNotEqualOperator_in_ruleTermInstance1697);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:909:3: ( (lv_stringLiteral_2_0= ruleStringLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:910:1: (lv_stringLiteral_2_0= ruleStringLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:910:1: (lv_stringLiteral_2_0= ruleStringLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:911:3: lv_stringLiteral_2_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getStringLiteralStringLiteralParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleTermInstance1719);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:928:6: ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:928:6: ( ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:928:7: ( (lv_term_3_0= ruleTerm ) ) ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )? ( (lv_otherLiteral_5_0= ruleOtherLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:928:7: ( (lv_term_3_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:929:1: (lv_term_3_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:929:1: (lv_term_3_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:930:3: lv_term_3_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleTermInstance1748);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:946:2: ( (lv_relationalOperator_4_0= ruleRelationalOperator ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==KEYWORD_16||(LA17_0>=KEYWORD_18 && LA17_0<=KEYWORD_19)||LA17_0==KEYWORD_10||LA17_0==KEYWORD_12) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:947:1: (lv_relationalOperator_4_0= ruleRelationalOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:947:1: (lv_relationalOperator_4_0= ruleRelationalOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:948:3: lv_relationalOperator_4_0= ruleRelationalOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getTermInstanceAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalOperator_in_ruleTermInstance1769);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:964:3: ( (lv_otherLiteral_5_0= ruleOtherLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:965:1: (lv_otherLiteral_5_0= ruleOtherLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:965:1: (lv_otherLiteral_5_0= ruleOtherLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:966:3: lv_otherLiteral_5_0= ruleOtherLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermInstanceAccess().getOtherLiteralOtherLiteralParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOtherLiteral_in_ruleTermInstance1791);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:990:1: entryRuleTermWithAssociation returns [EObject current=null] : iv_ruleTermWithAssociation= ruleTermWithAssociation EOF ;
    public final EObject entryRuleTermWithAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermWithAssociation = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:991:2: (iv_ruleTermWithAssociation= ruleTermWithAssociation EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:992:2: iv_ruleTermWithAssociation= ruleTermWithAssociation EOF
            {
             newCompositeNode(grammarAccess.getTermWithAssociationRule()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation1827);
            iv_ruleTermWithAssociation=ruleTermWithAssociation();

            state._fsp--;

             current =iv_ruleTermWithAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermWithAssociation1837); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:999:1: ruleTermWithAssociation returns [EObject current=null] : ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) ;
    public final EObject ruleTermWithAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_index_3_0=null;
        EObject lv_t_0_0 = null;

        EObject lv_ro_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1002:28: ( ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1003:1: ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1003:1: ( ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1003:2: ( (lv_t_0_0= ruleTerm ) ) ( (lv_ro_1_0= ruleRelationalOperator ) )? otherlv_2= KEYWORD_13 ( (lv_index_3_0= RULE_INT ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1003:2: ( (lv_t_0_0= ruleTerm ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1004:1: (lv_t_0_0= ruleTerm )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1004:1: (lv_t_0_0= ruleTerm )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1005:3: lv_t_0_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermWithAssociationAccess().getTTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTermWithAssociation1883);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1021:2: ( (lv_ro_1_0= ruleRelationalOperator ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_16||(LA19_0>=KEYWORD_18 && LA19_0<=KEYWORD_19)||LA19_0==KEYWORD_10||LA19_0==KEYWORD_12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1022:1: (lv_ro_1_0= ruleRelationalOperator )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1022:1: (lv_ro_1_0= ruleRelationalOperator )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1023:3: lv_ro_1_0= ruleRelationalOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermWithAssociationAccess().getRoRelationalOperatorParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleTermWithAssociation1904);
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

            otherlv_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleTermWithAssociation1918); 

                	newLeafNode(otherlv_2, grammarAccess.getTermWithAssociationAccess().getCommercialAtKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1044:1: ( (lv_index_3_0= RULE_INT ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1045:1: (lv_index_3_0= RULE_INT )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1045:1: (lv_index_3_0= RULE_INT )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1046:3: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTermWithAssociation1934); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1070:1: entryRuleQuantifier returns [EObject current=null] : iv_ruleQuantifier= ruleQuantifier EOF ;
    public final EObject entryRuleQuantifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifier = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1071:2: (iv_ruleQuantifier= ruleQuantifier EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1072:2: iv_ruleQuantifier= ruleQuantifier EOF
            {
             newCompositeNode(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier1974);
            iv_ruleQuantifier=ruleQuantifier();

            state._fsp--;

             current =iv_ruleQuantifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier1984); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1079:1: ruleQuantifier returns [EObject current=null] : ( (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) ) ;
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
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1082:28: ( ( (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1083:1: ( (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1083:1: ( (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) ) | (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) ) | (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) ) | (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt20=1;
                }
                break;
            case KEYWORD_26:
                {
                alt20=2;
                }
                break;
            case KEYWORD_29:
                {
                alt20=3;
                }
                break;
            case KEYWORD_31:
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1083:2: (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1083:2: (otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1084:2: otherlv_0= KEYWORD_28 ( (lv_v_1_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleQuantifier2023); 

                        	newLeafNode(otherlv_0, grammarAccess.getQuantifierAccess().getAtleastKeyword_0_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1088:1: ( (lv_v_1_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1089:1: (lv_v_1_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1089:1: (lv_v_1_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1090:3: lv_v_1_0= RULE_INT
                    {
                    lv_v_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2039); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1107:6: (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1107:6: (otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1108:2: otherlv_2= KEYWORD_26 ( (lv_v_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleQuantifier2065); 

                        	newLeafNode(otherlv_2, grammarAccess.getQuantifierAccess().getAtmostKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1112:1: ( (lv_v_3_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1113:1: (lv_v_3_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1113:1: (lv_v_3_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1114:3: lv_v_3_0= RULE_INT
                    {
                    lv_v_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2081); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1131:6: (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1131:6: (otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1132:2: otherlv_4= KEYWORD_29 ( (lv_v_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleQuantifier2107); 

                        	newLeafNode(otherlv_4, grammarAccess.getQuantifierAccess().getExactlyKeyword_2_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1136:1: ( (lv_v_5_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1137:1: (lv_v_5_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1137:1: (lv_v_5_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1138:3: lv_v_5_0= RULE_INT
                    {
                    lv_v_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2123); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1155:6: (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1155:6: (otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1156:2: otherlv_6= KEYWORD_31 ( (lv_v1_7_0= RULE_INT ) ) ( (lv_v2_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleQuantifier2149); 

                        	newLeafNode(otherlv_6, grammarAccess.getQuantifierAccess().getAtleastandatmostKeyword_3_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1160:1: ( (lv_v1_7_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1161:1: (lv_v1_7_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1161:1: (lv_v1_7_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1162:3: lv_v1_7_0= RULE_INT
                    {
                    lv_v1_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2165); 

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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1178:2: ( (lv_v2_8_0= RULE_INT ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1179:1: (lv_v2_8_0= RULE_INT )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1179:1: (lv_v2_8_0= RULE_INT )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1180:3: lv_v2_8_0= RULE_INT
                    {
                    lv_v2_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQuantifier2187); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1204:1: entryRuleComplement returns [EObject current=null] : iv_ruleComplement= ruleComplement EOF ;
    public final EObject entryRuleComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplement = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1205:2: (iv_ruleComplement= ruleComplement EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1206:2: iv_ruleComplement= ruleComplement EOF
            {
             newCompositeNode(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_ruleComplement_in_entryRuleComplement2228);
            iv_ruleComplement=ruleComplement();

            state._fsp--;

             current =iv_ruleComplement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplement2238); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1213:1: ruleComplement returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleComplement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1216:28: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1217:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1217:1: ( (lv_id_0_0= RULE_ID ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1218:1: (lv_id_0_0= RULE_ID )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1218:1: (lv_id_0_0= RULE_ID )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1219:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComplement2279); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1243:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1244:2: (iv_ruleFormula= ruleFormula EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1245:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula2318);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula2328); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1252:1: ruleFormula returns [EObject current=null] : ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= KEYWORD_11 ( (lv_fe_2_0= ruleFormulaExpression ) ) ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_fi_0_0 = null;

        EObject lv_fe_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1255:28: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= KEYWORD_11 ( (lv_fe_2_0= ruleFormulaExpression ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1256:1: ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= KEYWORD_11 ( (lv_fe_2_0= ruleFormulaExpression ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1256:1: ( ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= KEYWORD_11 ( (lv_fe_2_0= ruleFormulaExpression ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1256:2: ( (lv_fi_0_0= ruleFormulaItem ) ) otherlv_1= KEYWORD_11 ( (lv_fe_2_0= ruleFormulaExpression ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1256:2: ( (lv_fi_0_0= ruleFormulaItem ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1257:1: (lv_fi_0_0= ruleFormulaItem )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1257:1: (lv_fi_0_0= ruleFormulaItem )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1258:3: lv_fi_0_0= ruleFormulaItem
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFormulaItem_in_ruleFormula2374);
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

            otherlv_1=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleFormula2387); 

                	newLeafNode(otherlv_1, grammarAccess.getFormulaAccess().getEqualsSignKeyword_1());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1279:1: ( (lv_fe_2_0= ruleFormulaExpression ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1280:1: (lv_fe_2_0= ruleFormulaExpression )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1280:1: (lv_fe_2_0= ruleFormulaExpression )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1281:3: lv_fe_2_0= ruleFormulaExpression
            {
             
            	        newCompositeNode(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormula2407);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1305:1: entryRuleFormulaExpression returns [EObject current=null] : iv_ruleFormulaExpression= ruleFormulaExpression EOF ;
    public final EObject entryRuleFormulaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaExpression = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1306:2: (iv_ruleFormulaExpression= ruleFormulaExpression EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1307:2: iv_ruleFormulaExpression= ruleFormulaExpression EOF
            {
             newCompositeNode(grammarAccess.getFormulaExpressionRule()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression2442);
            iv_ruleFormulaExpression=ruleFormulaExpression();

            state._fsp--;

             current =iv_ruleFormulaExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaExpression2452); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1314:1: ruleFormulaExpression returns [EObject current=null] : ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) ) ;
    public final EObject ruleFormulaExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fi_0_0 = null;

        EObject lv_mo_1_0 = null;

        EObject lv_fe_2_0 = null;

        EObject lv_fe1_4_0 = null;

        EObject lv_mo_6_0 = null;

        EObject lv_fe2_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1317:28: ( ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:1: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:1: ( ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? ) | (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==KEYWORD_2) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:2: ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:2: ( ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:3: ( (lv_fi_0_0= ruleFormulaItem ) ) ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )?
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1318:3: ( (lv_fi_0_0= ruleFormulaItem ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1319:1: (lv_fi_0_0= ruleFormulaItem )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1319:1: (lv_fi_0_0= ruleFormulaItem )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1320:3: lv_fi_0_0= ruleFormulaItem
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFiFormulaItemParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormulaItem_in_ruleFormulaExpression2499);
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

                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1336:2: ( ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KEYWORD_17||LA21_0==KEYWORD_1||(LA21_0>=KEYWORD_4 && LA21_0<=KEYWORD_5)||LA21_0==KEYWORD_7||LA21_0==KEYWORD_9) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1336:3: ( (lv_mo_1_0= ruleMathOperator ) ) ( (lv_fe_2_0= ruleFormulaExpression ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1336:3: ( (lv_mo_1_0= ruleMathOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1337:1: (lv_mo_1_0= ruleMathOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1337:1: (lv_mo_1_0= ruleMathOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1338:3: lv_mo_1_0= ruleMathOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleFormulaExpression2521);
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

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1354:2: ( (lv_fe_2_0= ruleFormulaExpression ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1355:1: (lv_fe_2_0= ruleFormulaExpression )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1355:1: (lv_fe_2_0= ruleFormulaExpression )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1356:3: lv_fe_2_0= ruleFormulaExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFeFormulaExpressionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2542);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1373:6: (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1373:6: (otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )? )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1374:2: otherlv_3= KEYWORD_2 ( (lv_fe1_4_0= ruleFormulaExpression ) ) otherlv_5= KEYWORD_3 ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )?
                    {
                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFormulaExpression2565); 

                        	newLeafNode(otherlv_3, grammarAccess.getFormulaExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1378:1: ( (lv_fe1_4_0= ruleFormulaExpression ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1379:1: (lv_fe1_4_0= ruleFormulaExpression )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1379:1: (lv_fe1_4_0= ruleFormulaExpression )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1380:3: lv_fe1_4_0= ruleFormulaExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFe1FormulaExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2585);
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

                    otherlv_5=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleFormulaExpression2598); 

                        	newLeafNode(otherlv_5, grammarAccess.getFormulaExpressionAccess().getRightParenthesisKeyword_1_2());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1401:1: ( ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KEYWORD_17||LA22_0==KEYWORD_1||(LA22_0>=KEYWORD_4 && LA22_0<=KEYWORD_5)||LA22_0==KEYWORD_7||LA22_0==KEYWORD_9) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1401:2: ( (lv_mo_6_0= ruleMathOperator ) ) ( (lv_fe2_7_0= ruleFormulaExpression ) )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1401:2: ( (lv_mo_6_0= ruleMathOperator ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1402:1: (lv_mo_6_0= ruleMathOperator )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1402:1: (lv_mo_6_0= ruleMathOperator )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1403:3: lv_mo_6_0= ruleMathOperator
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_1_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMathOperator_in_ruleFormulaExpression2619);
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

                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1419:2: ( (lv_fe2_7_0= ruleFormulaExpression ) )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1420:1: (lv_fe2_7_0= ruleFormulaExpression )
                            {
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1420:1: (lv_fe2_7_0= ruleFormulaExpression )
                            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1421:3: lv_fe2_7_0= ruleFormulaExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getFormulaExpressionAccess().getFe2FormulaExpressionParserRuleCall_1_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2640);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1445:1: entryRuleFormulaItem returns [EObject current=null] : iv_ruleFormulaItem= ruleFormulaItem EOF ;
    public final EObject entryRuleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaItem = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1446:2: (iv_ruleFormulaItem= ruleFormulaItem EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1447:2: iv_ruleFormulaItem= ruleFormulaItem EOF
            {
             newCompositeNode(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem2678);
            iv_ruleFormulaItem=ruleFormulaItem();

            state._fsp--;

             current =iv_ruleFormulaItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaItem2688); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1454:1: ruleFormulaItem returns [EObject current=null] : ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) ) ;
    public final EObject ruleFormulaItem() throws RecognitionException {
        EObject current = null;

        EObject lv_t_0_0 = null;

        EObject lv_ti_1_0 = null;

        EObject lv_twa_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1457:28: ( ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1458:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1458:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1458:2: ( (lv_t_0_0= ruleTerm ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1458:2: ( (lv_t_0_0= ruleTerm ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1459:1: (lv_t_0_0= ruleTerm )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1459:1: (lv_t_0_0= ruleTerm )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1460:3: lv_t_0_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTTermParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleFormulaItem2734);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1477:6: ( (lv_ti_1_0= ruleTermInstance ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1477:6: ( (lv_ti_1_0= ruleTermInstance ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1478:1: (lv_ti_1_0= ruleTermInstance )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1478:1: (lv_ti_1_0= ruleTermInstance )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1479:3: lv_ti_1_0= ruleTermInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTiTermInstanceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermInstance_in_ruleFormulaItem2761);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1496:6: ( (lv_twa_2_0= ruleTermWithAssociation ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1496:6: ( (lv_twa_2_0= ruleTermWithAssociation ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1497:1: (lv_twa_2_0= ruleTermWithAssociation )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1497:1: (lv_twa_2_0= ruleTermWithAssociation )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1498:3: lv_twa_2_0= ruleTermWithAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormulaItemAccess().getTwaTermWithAssociationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTermWithAssociation_in_ruleFormulaItem2788);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1522:1: entryRuleMathOperator returns [EObject current=null] : iv_ruleMathOperator= ruleMathOperator EOF ;
    public final EObject entryRuleMathOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1523:2: (iv_ruleMathOperator= ruleMathOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1524:2: iv_ruleMathOperator= ruleMathOperator EOF
            {
             newCompositeNode(grammarAccess.getMathOperatorRule()); 
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator2823);
            iv_ruleMathOperator=ruleMathOperator();

            state._fsp--;

             current =iv_ruleMathOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator2833); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1531:1: ruleMathOperator returns [EObject current=null] : ( ( (lv_sum_0_0= KEYWORD_5 ) ) | ( (lv_subtract_1_0= KEYWORD_7 ) ) | ( (lv_divide_2_0= KEYWORD_9 ) ) | ( (lv_multiply_3_0= KEYWORD_4 ) ) | ( (lv_r_4_0= KEYWORD_1 ) ) | ( (lv_p_5_0= KEYWORD_17 ) ) ) ;
    public final EObject ruleMathOperator() throws RecognitionException {
        EObject current = null;

        Token lv_sum_0_0=null;
        Token lv_subtract_1_0=null;
        Token lv_divide_2_0=null;
        Token lv_multiply_3_0=null;
        Token lv_r_4_0=null;
        Token lv_p_5_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1534:28: ( ( ( (lv_sum_0_0= KEYWORD_5 ) ) | ( (lv_subtract_1_0= KEYWORD_7 ) ) | ( (lv_divide_2_0= KEYWORD_9 ) ) | ( (lv_multiply_3_0= KEYWORD_4 ) ) | ( (lv_r_4_0= KEYWORD_1 ) ) | ( (lv_p_5_0= KEYWORD_17 ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1535:1: ( ( (lv_sum_0_0= KEYWORD_5 ) ) | ( (lv_subtract_1_0= KEYWORD_7 ) ) | ( (lv_divide_2_0= KEYWORD_9 ) ) | ( (lv_multiply_3_0= KEYWORD_4 ) ) | ( (lv_r_4_0= KEYWORD_1 ) ) | ( (lv_p_5_0= KEYWORD_17 ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1535:1: ( ( (lv_sum_0_0= KEYWORD_5 ) ) | ( (lv_subtract_1_0= KEYWORD_7 ) ) | ( (lv_divide_2_0= KEYWORD_9 ) ) | ( (lv_multiply_3_0= KEYWORD_4 ) ) | ( (lv_r_4_0= KEYWORD_1 ) ) | ( (lv_p_5_0= KEYWORD_17 ) ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case KEYWORD_5:
                {
                alt25=1;
                }
                break;
            case KEYWORD_7:
                {
                alt25=2;
                }
                break;
            case KEYWORD_9:
                {
                alt25=3;
                }
                break;
            case KEYWORD_4:
                {
                alt25=4;
                }
                break;
            case KEYWORD_1:
                {
                alt25=5;
                }
                break;
            case KEYWORD_17:
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1535:2: ( (lv_sum_0_0= KEYWORD_5 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1535:2: ( (lv_sum_0_0= KEYWORD_5 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1536:1: (lv_sum_0_0= KEYWORD_5 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1536:1: (lv_sum_0_0= KEYWORD_5 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1537:3: lv_sum_0_0= KEYWORD_5
                    {
                    lv_sum_0_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleMathOperator2877); 

                            newLeafNode(lv_sum_0_0, grammarAccess.getMathOperatorAccess().getSumPlusSignKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "sum", lv_sum_0_0, "+");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1552:6: ( (lv_subtract_1_0= KEYWORD_7 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1552:6: ( (lv_subtract_1_0= KEYWORD_7 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1553:1: (lv_subtract_1_0= KEYWORD_7 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1553:1: (lv_subtract_1_0= KEYWORD_7 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1554:3: lv_subtract_1_0= KEYWORD_7
                    {
                    lv_subtract_1_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleMathOperator2913); 

                            newLeafNode(lv_subtract_1_0, grammarAccess.getMathOperatorAccess().getSubtractHyphenMinusKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "subtract", lv_subtract_1_0, "-");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1569:6: ( (lv_divide_2_0= KEYWORD_9 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1569:6: ( (lv_divide_2_0= KEYWORD_9 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1570:1: (lv_divide_2_0= KEYWORD_9 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1570:1: (lv_divide_2_0= KEYWORD_9 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1571:3: lv_divide_2_0= KEYWORD_9
                    {
                    lv_divide_2_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleMathOperator2949); 

                            newLeafNode(lv_divide_2_0, grammarAccess.getMathOperatorAccess().getDivideSolidusKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "divide", lv_divide_2_0, "/");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1586:6: ( (lv_multiply_3_0= KEYWORD_4 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1586:6: ( (lv_multiply_3_0= KEYWORD_4 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1587:1: (lv_multiply_3_0= KEYWORD_4 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1587:1: (lv_multiply_3_0= KEYWORD_4 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1588:3: lv_multiply_3_0= KEYWORD_4
                    {
                    lv_multiply_3_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMathOperator2985); 

                            newLeafNode(lv_multiply_3_0, grammarAccess.getMathOperatorAccess().getMultiplyAsteriskKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "multiply", lv_multiply_3_0, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1603:6: ( (lv_r_4_0= KEYWORD_1 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1603:6: ( (lv_r_4_0= KEYWORD_1 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1604:1: (lv_r_4_0= KEYWORD_1 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1604:1: (lv_r_4_0= KEYWORD_1 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1605:3: lv_r_4_0= KEYWORD_1
                    {
                    lv_r_4_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleMathOperator3021); 

                            newLeafNode(lv_r_4_0, grammarAccess.getMathOperatorAccess().getRPercentSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "r", lv_r_4_0, "%");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1620:6: ( (lv_p_5_0= KEYWORD_17 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1620:6: ( (lv_p_5_0= KEYWORD_17 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1621:1: (lv_p_5_0= KEYWORD_17 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1621:1: (lv_p_5_0= KEYWORD_17 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1622:3: lv_p_5_0= KEYWORD_17
                    {
                    lv_p_5_0=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleMathOperator3057); 

                            newLeafNode(lv_p_5_0, grammarAccess.getMathOperatorAccess().getPAsteriskAsteriskKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMathOperatorRule());
                    	        }
                           		setWithLastConsumed(current, "p", lv_p_5_0, "**");
                    	    

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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1644:1: entryRuleRelationalOperator returns [EObject current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final EObject entryRuleRelationalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1645:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1646:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator3103);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator3113); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1653:1: ruleRelationalOperator returns [EObject current=null] : ( ( (lv_o_0_0= KEYWORD_12 ) ) | ( (lv_o_1_0= KEYWORD_10 ) ) | ( (lv_o_2_0= KEYWORD_19 ) ) | ( (lv_o_3_0= KEYWORD_18 ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) ) ;
    public final EObject ruleRelationalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_o_0_0=null;
        Token lv_o_1_0=null;
        Token lv_o_2_0=null;
        Token lv_o_3_0=null;
        EObject lv_neo_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1656:28: ( ( ( (lv_o_0_0= KEYWORD_12 ) ) | ( (lv_o_1_0= KEYWORD_10 ) ) | ( (lv_o_2_0= KEYWORD_19 ) ) | ( (lv_o_3_0= KEYWORD_18 ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1657:1: ( ( (lv_o_0_0= KEYWORD_12 ) ) | ( (lv_o_1_0= KEYWORD_10 ) ) | ( (lv_o_2_0= KEYWORD_19 ) ) | ( (lv_o_3_0= KEYWORD_18 ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1657:1: ( ( (lv_o_0_0= KEYWORD_12 ) ) | ( (lv_o_1_0= KEYWORD_10 ) ) | ( (lv_o_2_0= KEYWORD_19 ) ) | ( (lv_o_3_0= KEYWORD_18 ) ) | ( (lv_neo_4_0= ruleNotEqualOperator ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case KEYWORD_12:
                {
                alt26=1;
                }
                break;
            case KEYWORD_10:
                {
                alt26=2;
                }
                break;
            case KEYWORD_19:
                {
                alt26=3;
                }
                break;
            case KEYWORD_18:
                {
                alt26=4;
                }
                break;
            case KEYWORD_16:
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1657:2: ( (lv_o_0_0= KEYWORD_12 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1657:2: ( (lv_o_0_0= KEYWORD_12 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1658:1: (lv_o_0_0= KEYWORD_12 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1658:1: (lv_o_0_0= KEYWORD_12 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1659:3: lv_o_0_0= KEYWORD_12
                    {
                    lv_o_0_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleRelationalOperator3157); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1674:6: ( (lv_o_1_0= KEYWORD_10 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1674:6: ( (lv_o_1_0= KEYWORD_10 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1675:1: (lv_o_1_0= KEYWORD_10 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1675:1: (lv_o_1_0= KEYWORD_10 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1676:3: lv_o_1_0= KEYWORD_10
                    {
                    lv_o_1_0=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleRelationalOperator3193); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1691:6: ( (lv_o_2_0= KEYWORD_19 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1691:6: ( (lv_o_2_0= KEYWORD_19 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1692:1: (lv_o_2_0= KEYWORD_19 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1692:1: (lv_o_2_0= KEYWORD_19 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1693:3: lv_o_2_0= KEYWORD_19
                    {
                    lv_o_2_0=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleRelationalOperator3229); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1708:6: ( (lv_o_3_0= KEYWORD_18 ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1708:6: ( (lv_o_3_0= KEYWORD_18 ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1709:1: (lv_o_3_0= KEYWORD_18 )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1709:1: (lv_o_3_0= KEYWORD_18 )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1710:3: lv_o_3_0= KEYWORD_18
                    {
                    lv_o_3_0=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleRelationalOperator3265); 

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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1725:6: ( (lv_neo_4_0= ruleNotEqualOperator ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1725:6: ( (lv_neo_4_0= ruleNotEqualOperator ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1726:1: (lv_neo_4_0= ruleNotEqualOperator )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1726:1: (lv_neo_4_0= ruleNotEqualOperator )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1727:3: lv_neo_4_0= ruleNotEqualOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalOperatorAccess().getNeoNotEqualOperatorParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotEqualOperator_in_ruleRelationalOperator3303);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1751:1: entryRuleNotEqualOperator returns [EObject current=null] : iv_ruleNotEqualOperator= ruleNotEqualOperator EOF ;
    public final EObject entryRuleNotEqualOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualOperator = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1752:2: (iv_ruleNotEqualOperator= ruleNotEqualOperator EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1753:2: iv_ruleNotEqualOperator= ruleNotEqualOperator EOF
            {
             newCompositeNode(grammarAccess.getNotEqualOperatorRule()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator3338);
            iv_ruleNotEqualOperator=ruleNotEqualOperator();

            state._fsp--;

             current =iv_ruleNotEqualOperator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualOperator3348); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1760:1: ruleNotEqualOperator returns [EObject current=null] : ( (lv_ne_0_0= KEYWORD_16 ) ) ;
    public final EObject ruleNotEqualOperator() throws RecognitionException {
        EObject current = null;

        Token lv_ne_0_0=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1763:28: ( ( (lv_ne_0_0= KEYWORD_16 ) ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1764:1: ( (lv_ne_0_0= KEYWORD_16 ) )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1764:1: ( (lv_ne_0_0= KEYWORD_16 ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1765:1: (lv_ne_0_0= KEYWORD_16 )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1765:1: (lv_ne_0_0= KEYWORD_16 )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1766:3: lv_ne_0_0= KEYWORD_16
            {
            lv_ne_0_0=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleNotEqualOperator3391); 

                    newLeafNode(lv_ne_0_0, grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNotEqualOperatorRule());
            	        }
                   		setWithLastConsumed(current, "ne", lv_ne_0_0, "!=");
            	    

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
    // $ANTLR end "ruleNotEqualOperator"


    // $ANTLR start "entryRuleSet"
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1788:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1789:2: (iv_ruleSet= ruleSet EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1790:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet3436);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet3446); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1797:1: ruleSet returns [EObject current=null] : (otherlv_0= KEYWORD_14 ( (lv_l_1_0= ruleList ) ) otherlv_2= KEYWORD_15 (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )? ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_l_1_0 = null;

        EObject lv_s_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1800:28: ( (otherlv_0= KEYWORD_14 ( (lv_l_1_0= ruleList ) ) otherlv_2= KEYWORD_15 (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1801:1: (otherlv_0= KEYWORD_14 ( (lv_l_1_0= ruleList ) ) otherlv_2= KEYWORD_15 (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1801:1: (otherlv_0= KEYWORD_14 ( (lv_l_1_0= ruleList ) ) otherlv_2= KEYWORD_15 (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1802:2: otherlv_0= KEYWORD_14 ( (lv_l_1_0= ruleList ) ) otherlv_2= KEYWORD_15 (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )?
            {
            otherlv_0=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleSet3484); 

                	newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1806:1: ( (lv_l_1_0= ruleList ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1807:1: (lv_l_1_0= ruleList )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1807:1: (lv_l_1_0= ruleList )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1808:3: lv_l_1_0= ruleList
            {
             
            	        newCompositeNode(grammarAccess.getSetAccess().getLListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleList_in_ruleSet3504);
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

            otherlv_2=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSet3517); 

                	newLeafNode(otherlv_2, grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2());
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1829:1: (otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_6) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1830:2: otherlv_3= KEYWORD_6 ( (lv_s_4_0= ruleSet ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSet3530); 

                        	newLeafNode(otherlv_3, grammarAccess.getSetAccess().getCommaKeyword_3_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1834:1: ( (lv_s_4_0= ruleSet ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1835:1: (lv_s_4_0= ruleSet )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1835:1: (lv_s_4_0= ruleSet )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1836:3: lv_s_4_0= ruleSet
                    {
                     
                    	        newCompositeNode(grammarAccess.getSetAccess().getSSetParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSet_in_ruleSet3550);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1860:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1861:2: (iv_ruleList= ruleList EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1862:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList3587);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList3597); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1869:1: ruleList returns [EObject current=null] : ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_sl_0_0 = null;

        AntlrDatatypeRuleToken lv_ol_1_0 = null;

        EObject lv_l_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1872:28: ( ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )? ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:1: ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )? )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:1: ( ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )? )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:2: ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) ) (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )?
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:2: ( ( (lv_sl_0_0= ruleStringLiteral ) ) | ( (lv_ol_1_0= ruleOtherLiteral ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_24||LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_MINUS_INTEGER && LA28_0<=RULE_DATE_TIME)||LA28_0==RULE_INT) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:3: ( (lv_sl_0_0= ruleStringLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1873:3: ( (lv_sl_0_0= ruleStringLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1874:1: (lv_sl_0_0= ruleStringLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1874:1: (lv_sl_0_0= ruleStringLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1875:3: lv_sl_0_0= ruleStringLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getSlStringLiteralParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleList3644);
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1892:6: ( (lv_ol_1_0= ruleOtherLiteral ) )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1892:6: ( (lv_ol_1_0= ruleOtherLiteral ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1893:1: (lv_ol_1_0= ruleOtherLiteral )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1893:1: (lv_ol_1_0= ruleOtherLiteral )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1894:3: lv_ol_1_0= ruleOtherLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getOlOtherLiteralParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOtherLiteral_in_ruleList3671);
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

            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1910:3: (otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_6) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1911:2: otherlv_2= KEYWORD_6 ( (lv_l_3_0= ruleList ) )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleList3686); 

                        	newLeafNode(otherlv_2, grammarAccess.getListAccess().getCommaKeyword_1_0());
                        
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1915:1: ( (lv_l_3_0= ruleList ) )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1916:1: (lv_l_3_0= ruleList )
                    {
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1916:1: (lv_l_3_0= ruleList )
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1917:3: lv_l_3_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getLListParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleList3706);
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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1941:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1942:1: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1943:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3744);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral3755); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1950:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= KEYWORD_24 ) ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1954:6: ( (this_STRING_0= RULE_STRING | kw= KEYWORD_24 ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1955:1: (this_STRING_0= RULE_STRING | kw= KEYWORD_24 )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1955:1: (this_STRING_0= RULE_STRING | kw= KEYWORD_24 )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==KEYWORD_24) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1955:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral3795); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1964:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleStringLiteral3819); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1977:1: entryRuleOtherLiteral returns [String current=null] : iv_ruleOtherLiteral= ruleOtherLiteral EOF ;
    public final String entryRuleOtherLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOtherLiteral = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1978:1: (iv_ruleOtherLiteral= ruleOtherLiteral EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1979:2: iv_ruleOtherLiteral= ruleOtherLiteral EOF
            {
             newCompositeNode(grammarAccess.getOtherLiteralRule()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral3859);
            iv_ruleOtherLiteral=ruleOtherLiteral();

            state._fsp--;

             current =iv_ruleOtherLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLiteral3870); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1986:1: ruleOtherLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME ) ;
    public final AntlrDatatypeRuleToken ruleOtherLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;
        Token this_MINUS_FLOAT_1=null;
        Token this_INT_2=null;
        Token this_MINUS_INTEGER_3=null;
        Token this_DATE_TIME_4=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1990:6: ( (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1991:1: (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1991:1: (this_FLOAT_0= RULE_FLOAT | this_MINUS_FLOAT_1= RULE_MINUS_FLOAT | this_INT_2= RULE_INT | this_MINUS_INTEGER_3= RULE_MINUS_INTEGER | this_DATE_TIME_4= RULE_DATE_TIME )
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
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1991:6: this_FLOAT_0= RULE_FLOAT
                    {
                    this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleOtherLiteral3910); 

                    		current.merge(this_FLOAT_0);
                        
                     
                        newLeafNode(this_FLOAT_0, grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:1999:10: this_MINUS_FLOAT_1= RULE_MINUS_FLOAT
                    {
                    this_MINUS_FLOAT_1=(Token)match(input,RULE_MINUS_FLOAT,FOLLOW_RULE_MINUS_FLOAT_in_ruleOtherLiteral3936); 

                    		current.merge(this_MINUS_FLOAT_1);
                        
                     
                        newLeafNode(this_MINUS_FLOAT_1, grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2007:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOtherLiteral3962); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2015:10: this_MINUS_INTEGER_3= RULE_MINUS_INTEGER
                    {
                    this_MINUS_INTEGER_3=(Token)match(input,RULE_MINUS_INTEGER,FOLLOW_RULE_MINUS_INTEGER_in_ruleOtherLiteral3988); 

                    		current.merge(this_MINUS_INTEGER_3);
                        
                     
                        newLeafNode(this_MINUS_INTEGER_3, grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2023:10: this_DATE_TIME_4= RULE_DATE_TIME
                    {
                    this_DATE_TIME_4=(Token)match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_ruleOtherLiteral4014); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2038:1: entryRuleTestPackage returns [String current=null] : iv_ruleTestPackage= ruleTestPackage EOF ;
    public final String entryRuleTestPackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTestPackage = null;


        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2039:1: (iv_ruleTestPackage= ruleTestPackage EOF )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2040:2: iv_ruleTestPackage= ruleTestPackage EOF
            {
             newCompositeNode(grammarAccess.getTestPackageRule()); 
            pushFollow(FOLLOW_ruleTestPackage_in_entryRuleTestPackage4059);
            iv_ruleTestPackage=ruleTestPackage();

            state._fsp--;

             current =iv_ruleTestPackage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestPackage4070); 

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
    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2047:1: ruleTestPackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_30 this_ID_1= RULE_ID (kw= KEYWORD_8 this_ID_3= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleTestPackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2051:6: ( (kw= KEYWORD_30 this_ID_1= RULE_ID (kw= KEYWORD_8 this_ID_3= RULE_ID )* ) )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2052:1: (kw= KEYWORD_30 this_ID_1= RULE_ID (kw= KEYWORD_8 this_ID_3= RULE_ID )* )
            {
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2052:1: (kw= KEYWORD_30 this_ID_1= RULE_ID (kw= KEYWORD_8 this_ID_3= RULE_ID )* )
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2053:2: kw= KEYWORD_30 this_ID_1= RULE_ID (kw= KEYWORD_8 this_ID_3= RULE_ID )*
            {
            kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleTestPackage4108); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTestPackageAccess().getPackageKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestPackage4123); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2065:1: (kw= KEYWORD_8 this_ID_3= RULE_ID )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==KEYWORD_8) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.leta.plugin/src-gen/org/parser/antlr/internal/InternalLetaParser.g:2066:2: kw= KEYWORD_8 this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleTestPackage4142); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getTestPackageAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTestPackage4157); 

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
        "\1\4\1\uffff\1\13\4\40\1\13\5\36\1\51\2\36\1\uffff\1\36";
    static final String DFA5_maxS =
        "\1\50\1\uffff\1\52\4\51\1\52\5\50\1\51\2\50\1\uffff\1\50";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\16\uffff\1\2\1\uffff";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\3\1\1\uffff\1\1\37\uffff\1\2",
            "",
            "\1\17\3\uffff\1\7\1\uffff\1\6\1\5\12\uffff\1\4\1\20\1\3\1\15"+
            "\3\uffff\1\13\1\10\1\11\1\14\1\1\1\12\1\16",
            "\1\15\3\uffff\1\13\1\10\1\11\1\14\1\uffff\1\12",
            "\1\15\3\uffff\1\13\1\10\1\11\1\14\1\uffff\1\12",
            "\1\15\3\uffff\1\13\1\10\1\11\1\14\1\uffff\1\12",
            "\1\15\3\uffff\1\13\1\10\1\11\1\14\1\uffff\1\12",
            "\1\17\24\uffff\1\15\3\uffff\1\13\1\10\1\11\1\14\1\uffff\1\12"+
            "\1\16",
            "\1\20\11\uffff\1\1",
            "\1\20\11\uffff\1\1",
            "\1\20\11\uffff\1\1",
            "\1\20\11\uffff\1\1",
            "\1\20\11\uffff\1\1",
            "\1\21",
            "\1\20\11\uffff\1\1",
            "\1\20\11\uffff\1\1",
            "",
            "\1\20\11\uffff\1\1"
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
        "\1\50\1\12\4\40\1\13\3\uffff";
    static final String DFA15_maxS =
        "\1\50\1\52\4\51\1\52\3\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\12\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1",
            "\1\10\1\7\3\10\1\6\1\uffff\1\5\1\4\1\10\2\uffff\1\10\6\uffff"+
            "\1\3\1\uffff\1\2\1\11\3\uffff\4\7\1\10\2\7",
            "\1\11\3\uffff\4\7\1\uffff\1\7",
            "\1\11\3\uffff\4\7\1\uffff\1\7",
            "\1\11\3\uffff\4\7\1\uffff\1\7",
            "\1\11\3\uffff\4\7\1\uffff\1\7",
            "\1\7\24\uffff\1\11\3\uffff\4\7\1\uffff\2\7",
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
            return "757:3: ( ( (lv_term_1_0= ruleTerm ) ) | ( (lv_termInstance_2_0= ruleTermInstance ) ) | ( (lv_termWithAssociation_3_0= ruleTermWithAssociation ) ) )";
        }
    }
    static final String DFA24_eotS =
        "\12\uffff";
    static final String DFA24_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA24_minS =
        "\1\50\1\12\1\uffff\4\40\1\13\2\uffff";
    static final String DFA24_maxS =
        "\1\50\1\52\1\uffff\4\51\1\52\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\1\3";
    static final String DFA24_specialS =
        "\12\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\1\2\1\10\3\2\1\7\1\2\1\6\1\5\2\2\1\uffff\3\2\1\uffff\1\2\1"+
            "\uffff\1\2\1\4\1\2\1\3\1\11\3\uffff\4\10\1\uffff\2\10",
            "",
            "\1\11\3\uffff\4\10\1\uffff\1\10",
            "\1\11\3\uffff\4\10\1\uffff\1\10",
            "\1\11\3\uffff\4\10\1\uffff\1\10",
            "\1\11\3\uffff\4\10\1\uffff\1\10",
            "\1\10\24\uffff\1\11\3\uffff\4\10\1\uffff\2\10",
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
            return "1458:1: ( ( (lv_t_0_0= ruleTerm ) ) | ( (lv_ti_1_0= ruleTermInstance ) ) | ( (lv_twa_2_0= ruleTermWithAssociation ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLeta_in_entryRuleLeta67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeta77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_ruleLeta123 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleTestCase_in_ruleLeta145 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleTestCase229 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestCase245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_ruleTestCase271 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleWhenClause_in_ruleTestCase292 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleSetClause_in_ruleTestCase313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerifyClause359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleVerifyClause397 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFactComposite_in_ruleVerifyClause417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_entryRuleWhenClause452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenClause462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleWhenClause500 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFactComposite_in_ruleWhenClause520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleSetClause612 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSetClause624 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSetClause644 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSetClause658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_entryRuleFactComposite692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactComposite702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_ruleFactComposite750 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleFormula_in_ruleFactComposite777 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleFactComposite800 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFactComposite_in_ruleFactComposite821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFactComposite844 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFactComposite_in_ruleFactComposite864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFactComposite877 = new BitSet(new long[]{0x0000000000082002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_ruleFactComposite898 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFactComposite_in_ruleFactComposite919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_entryRuleLogicalOperator958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOperator969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleLogicalOperator1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleLogicalOperator1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFact1121 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleComplement_in_ruleFact1142 = new BitSet(new long[]{0x0000010000000172L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFact1164 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_ruleFact1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_entryRuleFactExt1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactExt1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_ruleFactExt1279 = new BitSet(new long[]{0x0000010000000172L});
    public static final BitSet FOLLOW_ruleTermComposite_in_ruleFactExt1301 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_ruleFactExt1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_entryRuleTermComposite1360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermComposite1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_ruleTermComposite1416 = new BitSet(new long[]{0x0000010000000170L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermComposite1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_ruleTermComposite1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_ruleTermComposite1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerm1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_entryRuleTermInstance1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermInstance1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermInstance1676 = new BitSet(new long[]{0x0000040000008800L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_ruleTermInstance1697 = new BitSet(new long[]{0x0000040000008800L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleTermInstance1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermInstance1748 = new BitSet(new long[]{0x000002F0A0068000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleTermInstance1769 = new BitSet(new long[]{0x000002F0A0068000L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_ruleTermInstance1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermWithAssociation1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTermWithAssociation1883 = new BitSet(new long[]{0x00000001A0068000L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleTermWithAssociation1904 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleTermWithAssociation1918 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTermWithAssociation1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier1974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleQuantifier2023 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleQuantifier2065 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleQuantifier2107 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleQuantifier2149 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2165 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQuantifier2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_entryRuleComplement2228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplement2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComplement2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_ruleFormula2374 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleFormula2387 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormula2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression2442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaExpression2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_ruleFormulaExpression2499 = new BitSet(new long[]{0x0000000015910002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleFormulaExpression2521 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFormulaExpression2565 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2585 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleFormulaExpression2598 = new BitSet(new long[]{0x0000000015910002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_ruleFormulaExpression2619 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_ruleFormulaExpression2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem2678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaItem2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleFormulaItem2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_ruleFormulaItem2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_ruleFormulaItem2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator2823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleMathOperator2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleMathOperator2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleMathOperator2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMathOperator2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleMathOperator3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleMathOperator3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator3103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleRelationalOperator3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleRelationalOperator3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleRelationalOperator3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleRelationalOperator3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_ruleRelationalOperator3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator3338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualOperator3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleNotEqualOperator3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet3436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleSet3484 = new BitSet(new long[]{0x000006F0A0068800L});
    public static final BitSet FOLLOW_ruleList_in_ruleSet3504 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSet3517 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSet3530 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleSet_in_ruleSet3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList3587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleList3644 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_ruleList3671 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleList3686 = new BitSet(new long[]{0x000006F0A0068800L});
    public static final BitSet FOLLOW_ruleList_in_ruleList3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral3744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleStringLiteral3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLiteral3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleOtherLiteral3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_FLOAT_in_ruleOtherLiteral3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOtherLiteral3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_INTEGER_in_ruleOtherLiteral3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_ruleOtherLiteral4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_entryRuleTestPackage4059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestPackage4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleTestPackage4108 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestPackage4123 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleTestPackage4142 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTestPackage4157 = new BitSet(new long[]{0x0000000008000002L});

}