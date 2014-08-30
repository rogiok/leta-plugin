package org.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

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
import org.services.LetaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLetaParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g"; }


     
     	private LetaGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'%'");
    		tokenNameToValue.put("KEYWORD_2", "'('");
    		tokenNameToValue.put("KEYWORD_3", "')'");
    		tokenNameToValue.put("KEYWORD_4", "'*'");
    		tokenNameToValue.put("KEYWORD_5", "'+'");
    		tokenNameToValue.put("KEYWORD_6", "','");
    		tokenNameToValue.put("KEYWORD_7", "'-'");
    		tokenNameToValue.put("KEYWORD_8", "'.'");
    		tokenNameToValue.put("KEYWORD_9", "'/'");
    		tokenNameToValue.put("KEYWORD_10", "'<'");
    		tokenNameToValue.put("KEYWORD_11", "'='");
    		tokenNameToValue.put("KEYWORD_12", "'>'");
    		tokenNameToValue.put("KEYWORD_13", "'@'");
    		tokenNameToValue.put("KEYWORD_14", "'{'");
    		tokenNameToValue.put("KEYWORD_15", "'}'");
    		tokenNameToValue.put("KEYWORD_16", "'!='");
    		tokenNameToValue.put("KEYWORD_17", "'**'");
    		tokenNameToValue.put("KEYWORD_18", "'<='");
    		tokenNameToValue.put("KEYWORD_19", "'>='");
    		tokenNameToValue.put("KEYWORD_20", "'or'");
    		tokenNameToValue.put("KEYWORD_21", "'and'");
    		tokenNameToValue.put("KEYWORD_22", "'set'");
    		tokenNameToValue.put("KEYWORD_23", "'Test'");
    		tokenNameToValue.put("KEYWORD_24", "'null'");
    		tokenNameToValue.put("KEYWORD_25", "'when'");
    		tokenNameToValue.put("KEYWORD_26", "'atmost'");
    		tokenNameToValue.put("KEYWORD_27", "'verify'");
    		tokenNameToValue.put("KEYWORD_28", "'atleast'");
    		tokenNameToValue.put("KEYWORD_29", "'exactly'");
    		tokenNameToValue.put("KEYWORD_30", "'package'");
    		tokenNameToValue.put("KEYWORD_31", "'atleastandatmost'");
     	}
     	
        public void setGrammarAccess(LetaGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleLeta"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:94:1: entryRuleLeta : ruleLeta EOF ;
    public final void entryRuleLeta() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:95:1: ( ruleLeta EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:96:1: ruleLeta EOF
            {
             before(grammarAccess.getLetaRule()); 
            pushFollow(FOLLOW_ruleLeta_in_entryRuleLeta54);
            ruleLeta();

            state._fsp--;

             after(grammarAccess.getLetaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeta61); 

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
    // $ANTLR end "entryRuleLeta"


    // $ANTLR start "ruleLeta"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:103:1: ruleLeta : ( ( rule__Leta__Group__0 ) ) ;
    public final void ruleLeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:107:5: ( ( ( rule__Leta__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:108:1: ( ( rule__Leta__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:108:1: ( ( rule__Leta__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:109:1: ( rule__Leta__Group__0 )
            {
             before(grammarAccess.getLetaAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:110:1: ( rule__Leta__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:110:2: rule__Leta__Group__0
            {
            pushFollow(FOLLOW_rule__Leta__Group__0_in_ruleLeta91);
            rule__Leta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetaAccess().getGroup()); 

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
    // $ANTLR end "ruleLeta"


    // $ANTLR start "entryRuleTestCase"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:122:1: entryRuleTestCase : ruleTestCase EOF ;
    public final void entryRuleTestCase() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:123:1: ( ruleTestCase EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:124:1: ruleTestCase EOF
            {
             before(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase118);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getTestCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase125); 

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
    // $ANTLR end "entryRuleTestCase"


    // $ANTLR start "ruleTestCase"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:131:1: ruleTestCase : ( ( rule__TestCase__Group__0 ) ) ;
    public final void ruleTestCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:135:5: ( ( ( rule__TestCase__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:136:1: ( ( rule__TestCase__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:136:1: ( ( rule__TestCase__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:137:1: ( rule__TestCase__Group__0 )
            {
             before(grammarAccess.getTestCaseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:138:1: ( rule__TestCase__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:138:2: rule__TestCase__Group__0
            {
            pushFollow(FOLLOW_rule__TestCase__Group__0_in_ruleTestCase155);
            rule__TestCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getGroup()); 

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
    // $ANTLR end "ruleTestCase"


    // $ANTLR start "entryRuleVerifyClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:150:1: entryRuleVerifyClause : ruleVerifyClause EOF ;
    public final void entryRuleVerifyClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:151:1: ( ruleVerifyClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:152:1: ruleVerifyClause EOF
            {
             before(grammarAccess.getVerifyClauseRule()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause182);
            ruleVerifyClause();

            state._fsp--;

             after(grammarAccess.getVerifyClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerifyClause189); 

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
    // $ANTLR end "entryRuleVerifyClause"


    // $ANTLR start "ruleVerifyClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:159:1: ruleVerifyClause : ( ( rule__VerifyClause__Group__0 ) ) ;
    public final void ruleVerifyClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:163:5: ( ( ( rule__VerifyClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:164:1: ( ( rule__VerifyClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:164:1: ( ( rule__VerifyClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:165:1: ( rule__VerifyClause__Group__0 )
            {
             before(grammarAccess.getVerifyClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:166:1: ( rule__VerifyClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:166:2: rule__VerifyClause__Group__0
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__0_in_ruleVerifyClause219);
            rule__VerifyClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleVerifyClause"


    // $ANTLR start "entryRuleWhenClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:178:1: entryRuleWhenClause : ruleWhenClause EOF ;
    public final void entryRuleWhenClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:179:1: ( ruleWhenClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:180:1: ruleWhenClause EOF
            {
             before(grammarAccess.getWhenClauseRule()); 
            pushFollow(FOLLOW_ruleWhenClause_in_entryRuleWhenClause246);
            ruleWhenClause();

            state._fsp--;

             after(grammarAccess.getWhenClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenClause253); 

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
    // $ANTLR end "entryRuleWhenClause"


    // $ANTLR start "ruleWhenClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:187:1: ruleWhenClause : ( ( rule__WhenClause__Group__0 ) ) ;
    public final void ruleWhenClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:191:5: ( ( ( rule__WhenClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:192:1: ( ( rule__WhenClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:192:1: ( ( rule__WhenClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:193:1: ( rule__WhenClause__Group__0 )
            {
             before(grammarAccess.getWhenClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:194:1: ( rule__WhenClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:194:2: rule__WhenClause__Group__0
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__0_in_ruleWhenClause283);
            rule__WhenClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleWhenClause"


    // $ANTLR start "entryRuleSetClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:206:1: entryRuleSetClause : ruleSetClause EOF ;
    public final void entryRuleSetClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:207:1: ( ruleSetClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:208:1: ruleSetClause EOF
            {
             before(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause310);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getSetClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause317); 

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
    // $ANTLR end "entryRuleSetClause"


    // $ANTLR start "ruleSetClause"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:215:1: ruleSetClause : ( ( rule__SetClause__Group__0 ) ) ;
    public final void ruleSetClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:219:5: ( ( ( rule__SetClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:220:1: ( ( rule__SetClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:220:1: ( ( rule__SetClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:221:1: ( rule__SetClause__Group__0 )
            {
             before(grammarAccess.getSetClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:222:1: ( rule__SetClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:222:2: rule__SetClause__Group__0
            {
            pushFollow(FOLLOW_rule__SetClause__Group__0_in_ruleSetClause347);
            rule__SetClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleSetClause"


    // $ANTLR start "entryRuleFactComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:234:1: entryRuleFactComposite : ruleFactComposite EOF ;
    public final void entryRuleFactComposite() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:235:1: ( ruleFactComposite EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:236:1: ruleFactComposite EOF
            {
             before(grammarAccess.getFactCompositeRule()); 
            pushFollow(FOLLOW_ruleFactComposite_in_entryRuleFactComposite374);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getFactCompositeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactComposite381); 

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
    // $ANTLR end "entryRuleFactComposite"


    // $ANTLR start "ruleFactComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:243:1: ruleFactComposite : ( ( rule__FactComposite__Alternatives ) ) ;
    public final void ruleFactComposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:247:5: ( ( ( rule__FactComposite__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:248:1: ( ( rule__FactComposite__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:248:1: ( ( rule__FactComposite__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:249:1: ( rule__FactComposite__Alternatives )
            {
             before(grammarAccess.getFactCompositeAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:250:1: ( rule__FactComposite__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:250:2: rule__FactComposite__Alternatives
            {
            pushFollow(FOLLOW_rule__FactComposite__Alternatives_in_ruleFactComposite411);
            rule__FactComposite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFactComposite"


    // $ANTLR start "entryRuleLogicalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:262:1: entryRuleLogicalOperator : ruleLogicalOperator EOF ;
    public final void entryRuleLogicalOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:263:1: ( ruleLogicalOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:264:1: ruleLogicalOperator EOF
            {
             before(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_ruleLogicalOperator_in_entryRuleLogicalOperator438);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOperator445); 

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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:271:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:275:5: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:276:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:276:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:277:1: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:278:1: ( rule__LogicalOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:278:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator475);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleFact"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:290:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:291:1: ( ruleFact EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:292:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact502);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact509); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:299:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:303:5: ( ( ( rule__Fact__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:304:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:304:1: ( ( rule__Fact__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:305:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:306:1: ( rule__Fact__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:306:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact539);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleFactExt"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:318:1: entryRuleFactExt : ruleFactExt EOF ;
    public final void entryRuleFactExt() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:319:1: ( ruleFactExt EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:320:1: ruleFactExt EOF
            {
             before(grammarAccess.getFactExtRule()); 
            pushFollow(FOLLOW_ruleFactExt_in_entryRuleFactExt566);
            ruleFactExt();

            state._fsp--;

             after(grammarAccess.getFactExtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactExt573); 

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
    // $ANTLR end "entryRuleFactExt"


    // $ANTLR start "ruleFactExt"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:327:1: ruleFactExt : ( ( rule__FactExt__Group__0 ) ) ;
    public final void ruleFactExt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:331:5: ( ( ( rule__FactExt__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:332:1: ( ( rule__FactExt__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:332:1: ( ( rule__FactExt__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:333:1: ( rule__FactExt__Group__0 )
            {
             before(grammarAccess.getFactExtAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:334:1: ( rule__FactExt__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:334:2: rule__FactExt__Group__0
            {
            pushFollow(FOLLOW_rule__FactExt__Group__0_in_ruleFactExt603);
            rule__FactExt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactExtAccess().getGroup()); 

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
    // $ANTLR end "ruleFactExt"


    // $ANTLR start "entryRuleTermComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:346:1: entryRuleTermComposite : ruleTermComposite EOF ;
    public final void entryRuleTermComposite() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:347:1: ( ruleTermComposite EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:348:1: ruleTermComposite EOF
            {
             before(grammarAccess.getTermCompositeRule()); 
            pushFollow(FOLLOW_ruleTermComposite_in_entryRuleTermComposite630);
            ruleTermComposite();

            state._fsp--;

             after(grammarAccess.getTermCompositeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermComposite637); 

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
    // $ANTLR end "entryRuleTermComposite"


    // $ANTLR start "ruleTermComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:355:1: ruleTermComposite : ( ( rule__TermComposite__Group__0 ) ) ;
    public final void ruleTermComposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:359:5: ( ( ( rule__TermComposite__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:360:1: ( ( rule__TermComposite__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:360:1: ( ( rule__TermComposite__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:361:1: ( rule__TermComposite__Group__0 )
            {
             before(grammarAccess.getTermCompositeAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:362:1: ( rule__TermComposite__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:362:2: rule__TermComposite__Group__0
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__0_in_ruleTermComposite667);
            rule__TermComposite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermCompositeAccess().getGroup()); 

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
    // $ANTLR end "ruleTermComposite"


    // $ANTLR start "entryRuleTerm"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:374:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:375:1: ( ruleTerm EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:376:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm694);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm701); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:383:1: ruleTerm : ( ( rule__Term__IdAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:387:5: ( ( ( rule__Term__IdAssignment ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:388:1: ( ( rule__Term__IdAssignment ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:388:1: ( ( rule__Term__IdAssignment ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:389:1: ( rule__Term__IdAssignment )
            {
             before(grammarAccess.getTermAccess().getIdAssignment()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:390:1: ( rule__Term__IdAssignment )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:390:2: rule__Term__IdAssignment
            {
            pushFollow(FOLLOW_rule__Term__IdAssignment_in_ruleTerm731);
            rule__Term__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleTermInstance"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:402:1: entryRuleTermInstance : ruleTermInstance EOF ;
    public final void entryRuleTermInstance() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:403:1: ( ruleTermInstance EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:404:1: ruleTermInstance EOF
            {
             before(grammarAccess.getTermInstanceRule()); 
            pushFollow(FOLLOW_ruleTermInstance_in_entryRuleTermInstance758);
            ruleTermInstance();

            state._fsp--;

             after(grammarAccess.getTermInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermInstance765); 

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
    // $ANTLR end "entryRuleTermInstance"


    // $ANTLR start "ruleTermInstance"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:411:1: ruleTermInstance : ( ( rule__TermInstance__Alternatives ) ) ;
    public final void ruleTermInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:415:5: ( ( ( rule__TermInstance__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:416:1: ( ( rule__TermInstance__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:416:1: ( ( rule__TermInstance__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:417:1: ( rule__TermInstance__Alternatives )
            {
             before(grammarAccess.getTermInstanceAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:418:1: ( rule__TermInstance__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:418:2: rule__TermInstance__Alternatives
            {
            pushFollow(FOLLOW_rule__TermInstance__Alternatives_in_ruleTermInstance795);
            rule__TermInstance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermInstanceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTermInstance"


    // $ANTLR start "entryRuleTermWithAssociation"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:430:1: entryRuleTermWithAssociation : ruleTermWithAssociation EOF ;
    public final void entryRuleTermWithAssociation() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:431:1: ( ruleTermWithAssociation EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:432:1: ruleTermWithAssociation EOF
            {
             before(grammarAccess.getTermWithAssociationRule()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation822);
            ruleTermWithAssociation();

            state._fsp--;

             after(grammarAccess.getTermWithAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermWithAssociation829); 

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
    // $ANTLR end "entryRuleTermWithAssociation"


    // $ANTLR start "ruleTermWithAssociation"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:439:1: ruleTermWithAssociation : ( ( rule__TermWithAssociation__Group__0 ) ) ;
    public final void ruleTermWithAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:443:5: ( ( ( rule__TermWithAssociation__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:444:1: ( ( rule__TermWithAssociation__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:444:1: ( ( rule__TermWithAssociation__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:445:1: ( rule__TermWithAssociation__Group__0 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:446:1: ( rule__TermWithAssociation__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:446:2: rule__TermWithAssociation__Group__0
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__0_in_ruleTermWithAssociation859);
            rule__TermWithAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermWithAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleTermWithAssociation"


    // $ANTLR start "entryRuleQuantifier"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:458:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:459:1: ( ruleQuantifier EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:460:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier886);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier893); 

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
    // $ANTLR end "entryRuleQuantifier"


    // $ANTLR start "ruleQuantifier"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:467:1: ruleQuantifier : ( ( rule__Quantifier__Alternatives ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:471:5: ( ( ( rule__Quantifier__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:472:1: ( ( rule__Quantifier__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:472:1: ( ( rule__Quantifier__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:473:1: ( rule__Quantifier__Alternatives )
            {
             before(grammarAccess.getQuantifierAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:474:1: ( rule__Quantifier__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:474:2: rule__Quantifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier923);
            rule__Quantifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "entryRuleComplement"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:486:1: entryRuleComplement : ruleComplement EOF ;
    public final void entryRuleComplement() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:487:1: ( ruleComplement EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:488:1: ruleComplement EOF
            {
             before(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_ruleComplement_in_entryRuleComplement950);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getComplementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplement957); 

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
    // $ANTLR end "entryRuleComplement"


    // $ANTLR start "ruleComplement"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:495:1: ruleComplement : ( ( rule__Complement__IdAssignment ) ) ;
    public final void ruleComplement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:499:5: ( ( ( rule__Complement__IdAssignment ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:500:1: ( ( rule__Complement__IdAssignment ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:500:1: ( ( rule__Complement__IdAssignment ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:501:1: ( rule__Complement__IdAssignment )
            {
             before(grammarAccess.getComplementAccess().getIdAssignment()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:502:1: ( rule__Complement__IdAssignment )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:502:2: rule__Complement__IdAssignment
            {
            pushFollow(FOLLOW_rule__Complement__IdAssignment_in_ruleComplement987);
            rule__Complement__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComplementAccess().getIdAssignment()); 

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
    // $ANTLR end "ruleComplement"


    // $ANTLR start "entryRuleFormula"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:514:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:515:1: ( ruleFormula EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:516:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula1014);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula1021); 

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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:523:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:527:5: ( ( ( rule__Formula__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:528:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:528:1: ( ( rule__Formula__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:529:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:530:1: ( rule__Formula__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:530:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula1051);
            rule__Formula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleFormulaExpression"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:542:1: entryRuleFormulaExpression : ruleFormulaExpression EOF ;
    public final void entryRuleFormulaExpression() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:543:1: ( ruleFormulaExpression EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:544:1: ruleFormulaExpression EOF
            {
             before(grammarAccess.getFormulaExpressionRule()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression1078);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaExpression1085); 

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
    // $ANTLR end "entryRuleFormulaExpression"


    // $ANTLR start "ruleFormulaExpression"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:551:1: ruleFormulaExpression : ( ( rule__FormulaExpression__Alternatives ) ) ;
    public final void ruleFormulaExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:555:5: ( ( ( rule__FormulaExpression__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:556:1: ( ( rule__FormulaExpression__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:556:1: ( ( rule__FormulaExpression__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:557:1: ( rule__FormulaExpression__Alternatives )
            {
             before(grammarAccess.getFormulaExpressionAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:558:1: ( rule__FormulaExpression__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:558:2: rule__FormulaExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Alternatives_in_ruleFormulaExpression1115);
            rule__FormulaExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormulaExpression"


    // $ANTLR start "entryRuleFormulaItem"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:570:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:571:1: ( ruleFormulaItem EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:572:1: ruleFormulaItem EOF
            {
             before(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem1142);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaItem1149); 

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
    // $ANTLR end "entryRuleFormulaItem"


    // $ANTLR start "ruleFormulaItem"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:579:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:583:5: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:584:1: ( ( rule__FormulaItem__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:584:1: ( ( rule__FormulaItem__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:585:1: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:586:1: ( rule__FormulaItem__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:586:2: rule__FormulaItem__Alternatives
            {
            pushFollow(FOLLOW_rule__FormulaItem__Alternatives_in_ruleFormulaItem1179);
            rule__FormulaItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormulaItemAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFormulaItem"


    // $ANTLR start "entryRuleMathOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:598:1: entryRuleMathOperator : ruleMathOperator EOF ;
    public final void entryRuleMathOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:599:1: ( ruleMathOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:600:1: ruleMathOperator EOF
            {
             before(grammarAccess.getMathOperatorRule()); 
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator1206);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getMathOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator1213); 

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
    // $ANTLR end "entryRuleMathOperator"


    // $ANTLR start "ruleMathOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:607:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:611:5: ( ( ( rule__MathOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:612:1: ( ( rule__MathOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:612:1: ( ( rule__MathOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:613:1: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:614:1: ( rule__MathOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:614:2: rule__MathOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1243);
            rule__MathOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "entryRuleRelationalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:626:1: entryRuleRelationalOperator : ruleRelationalOperator EOF ;
    public final void entryRuleRelationalOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:627:1: ( ruleRelationalOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:628:1: ruleRelationalOperator EOF
            {
             before(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator1270);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator1277); 

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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:635:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:639:5: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:640:1: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:640:1: ( ( rule__RelationalOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:641:1: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:642:1: ( rule__RelationalOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:642:2: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationalOperator__Alternatives_in_ruleRelationalOperator1307);
            rule__RelationalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleNotEqualOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:654:1: entryRuleNotEqualOperator : ruleNotEqualOperator EOF ;
    public final void entryRuleNotEqualOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:655:1: ( ruleNotEqualOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:656:1: ruleNotEqualOperator EOF
            {
             before(grammarAccess.getNotEqualOperatorRule()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator1334);
            ruleNotEqualOperator();

            state._fsp--;

             after(grammarAccess.getNotEqualOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualOperator1341); 

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
    // $ANTLR end "entryRuleNotEqualOperator"


    // $ANTLR start "ruleNotEqualOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:663:1: ruleNotEqualOperator : ( ( rule__NotEqualOperator__NeAssignment ) ) ;
    public final void ruleNotEqualOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:667:5: ( ( ( rule__NotEqualOperator__NeAssignment ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:668:1: ( ( rule__NotEqualOperator__NeAssignment ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:668:1: ( ( rule__NotEqualOperator__NeAssignment ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:669:1: ( rule__NotEqualOperator__NeAssignment )
            {
             before(grammarAccess.getNotEqualOperatorAccess().getNeAssignment()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:670:1: ( rule__NotEqualOperator__NeAssignment )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:670:2: rule__NotEqualOperator__NeAssignment
            {
            pushFollow(FOLLOW_rule__NotEqualOperator__NeAssignment_in_ruleNotEqualOperator1371);
            rule__NotEqualOperator__NeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNotEqualOperatorAccess().getNeAssignment()); 

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
    // $ANTLR end "ruleNotEqualOperator"


    // $ANTLR start "entryRuleSet"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:682:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:683:1: ( ruleSet EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:684:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet1398);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet1405); 

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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:691:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:695:5: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:696:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:696:1: ( ( rule__Set__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:697:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:698:1: ( rule__Set__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:698:2: rule__Set__Group__0
            {
            pushFollow(FOLLOW_rule__Set__Group__0_in_ruleSet1435);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleList"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:710:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:711:1: ( ruleList EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:712:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList1462);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1469); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:719:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:723:5: ( ( ( rule__List__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:724:1: ( ( rule__List__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:724:1: ( ( rule__List__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:725:1: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:726:1: ( rule__List__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:726:2: rule__List__Group__0
            {
            pushFollow(FOLLOW_rule__List__Group__0_in_ruleList1499);
            rule__List__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getGroup()); 

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:738:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:739:1: ( ruleStringLiteral EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:740:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1526);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1533); 

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:747:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:751:5: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:752:1: ( ( rule__StringLiteral__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:752:1: ( ( rule__StringLiteral__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:753:1: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:754:1: ( rule__StringLiteral__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:754:2: rule__StringLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral1563);
            rule__StringLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleOtherLiteral"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:766:1: entryRuleOtherLiteral : ruleOtherLiteral EOF ;
    public final void entryRuleOtherLiteral() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:767:1: ( ruleOtherLiteral EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:768:1: ruleOtherLiteral EOF
            {
             before(grammarAccess.getOtherLiteralRule()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral1590);
            ruleOtherLiteral();

            state._fsp--;

             after(grammarAccess.getOtherLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLiteral1597); 

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
    // $ANTLR end "entryRuleOtherLiteral"


    // $ANTLR start "ruleOtherLiteral"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:775:1: ruleOtherLiteral : ( ( rule__OtherLiteral__Alternatives ) ) ;
    public final void ruleOtherLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:779:5: ( ( ( rule__OtherLiteral__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:780:1: ( ( rule__OtherLiteral__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:780:1: ( ( rule__OtherLiteral__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:781:1: ( rule__OtherLiteral__Alternatives )
            {
             before(grammarAccess.getOtherLiteralAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:782:1: ( rule__OtherLiteral__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:782:2: rule__OtherLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__OtherLiteral__Alternatives_in_ruleOtherLiteral1627);
            rule__OtherLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOtherLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOtherLiteral"


    // $ANTLR start "entryRuleTestPackage"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:794:1: entryRuleTestPackage : ruleTestPackage EOF ;
    public final void entryRuleTestPackage() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:795:1: ( ruleTestPackage EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:796:1: ruleTestPackage EOF
            {
             before(grammarAccess.getTestPackageRule()); 
            pushFollow(FOLLOW_ruleTestPackage_in_entryRuleTestPackage1654);
            ruleTestPackage();

            state._fsp--;

             after(grammarAccess.getTestPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestPackage1661); 

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
    // $ANTLR end "entryRuleTestPackage"


    // $ANTLR start "ruleTestPackage"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:803:1: ruleTestPackage : ( ( rule__TestPackage__Group__0 ) ) ;
    public final void ruleTestPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:807:5: ( ( ( rule__TestPackage__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:808:1: ( ( rule__TestPackage__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:808:1: ( ( rule__TestPackage__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:809:1: ( rule__TestPackage__Group__0 )
            {
             before(grammarAccess.getTestPackageAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:810:1: ( rule__TestPackage__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:810:2: rule__TestPackage__Group__0
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__0_in_ruleTestPackage1691);
            rule__TestPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestPackageAccess().getGroup()); 

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
    // $ANTLR end "ruleTestPackage"


    // $ANTLR start "rule__FactComposite__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:822:1: rule__FactComposite__Alternatives : ( ( ( rule__FactComposite__Group_0__0 ) ) | ( ( rule__FactComposite__Group_1__0 ) ) );
    public final void rule__FactComposite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:826:1: ( ( ( rule__FactComposite__Group_0__0 ) ) | ( ( rule__FactComposite__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=KEYWORD_31 && LA1_0<=KEYWORD_29)||LA1_0==KEYWORD_26||LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==KEYWORD_2) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:827:1: ( ( rule__FactComposite__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:827:1: ( ( rule__FactComposite__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:828:1: ( rule__FactComposite__Group_0__0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:829:1: ( rule__FactComposite__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:829:2: rule__FactComposite__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_0__0_in_rule__FactComposite__Alternatives1727);
                    rule__FactComposite__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:833:6: ( ( rule__FactComposite__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:833:6: ( ( rule__FactComposite__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:834:1: ( rule__FactComposite__Group_1__0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:835:1: ( rule__FactComposite__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:835:2: rule__FactComposite__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_1__0_in_rule__FactComposite__Alternatives1745);
                    rule__FactComposite__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__FactComposite__Alternatives"


    // $ANTLR start "rule__FactComposite__Alternatives_0_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:844:1: rule__FactComposite__Alternatives_0_0 : ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) );
    public final void rule__FactComposite__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:848:1: ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:849:1: ( ( rule__FactComposite__FAssignment_0_0_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:849:1: ( ( rule__FactComposite__FAssignment_0_0_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:850:1: ( rule__FactComposite__FAssignment_0_0_0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getFAssignment_0_0_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:851:1: ( rule__FactComposite__FAssignment_0_0_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:851:2: rule__FactComposite__FAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__FAssignment_0_0_0_in_rule__FactComposite__Alternatives_0_01778);
                    rule__FactComposite__FAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getFAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:855:6: ( ( rule__FactComposite__FoAssignment_0_0_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:855:6: ( ( rule__FactComposite__FoAssignment_0_0_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:856:1: ( rule__FactComposite__FoAssignment_0_0_1 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getFoAssignment_0_0_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:857:1: ( rule__FactComposite__FoAssignment_0_0_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:857:2: rule__FactComposite__FoAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__FactComposite__FoAssignment_0_0_1_in_rule__FactComposite__Alternatives_0_01796);
                    rule__FactComposite__FoAssignment_0_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getFoAssignment_0_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__FactComposite__Alternatives_0_0"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:866:1: rule__LogicalOperator__Alternatives : ( ( KEYWORD_21 ) | ( KEYWORD_20 ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:870:1: ( ( KEYWORD_21 ) | ( KEYWORD_20 ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_21) ) {
                alt3=1;
            }
            else if ( (LA3_0==KEYWORD_20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:871:1: ( KEYWORD_21 )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:871:1: ( KEYWORD_21 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:872:1: KEYWORD_21
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                    match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__LogicalOperator__Alternatives1830); 
                     after(grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:879:6: ( KEYWORD_20 )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:879:6: ( KEYWORD_20 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:880:1: KEYWORD_20
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 
                    match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__LogicalOperator__Alternatives1850); 
                     after(grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__TermComposite__Alternatives_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:892:1: rule__TermComposite__Alternatives_1 : ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) );
    public final void rule__TermComposite__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:896:1: ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:897:1: ( ( rule__TermComposite__TermAssignment_1_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:897:1: ( ( rule__TermComposite__TermAssignment_1_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:898:1: ( rule__TermComposite__TermAssignment_1_0 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermAssignment_1_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:899:1: ( rule__TermComposite__TermAssignment_1_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:899:2: rule__TermComposite__TermAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermAssignment_1_0_in_rule__TermComposite__Alternatives_11884);
                    rule__TermComposite__TermAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermCompositeAccess().getTermAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:903:6: ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:903:6: ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:904:1: ( rule__TermComposite__TermInstanceAssignment_1_1 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermInstanceAssignment_1_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:905:1: ( rule__TermComposite__TermInstanceAssignment_1_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:905:2: rule__TermComposite__TermInstanceAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermInstanceAssignment_1_1_in_rule__TermComposite__Alternatives_11902);
                    rule__TermComposite__TermInstanceAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermCompositeAccess().getTermInstanceAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:909:6: ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:909:6: ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:910:1: ( rule__TermComposite__TermWithAssociationAssignment_1_2 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermWithAssociationAssignment_1_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:911:1: ( rule__TermComposite__TermWithAssociationAssignment_1_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:911:2: rule__TermComposite__TermWithAssociationAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermWithAssociationAssignment_1_2_in_rule__TermComposite__Alternatives_11920);
                    rule__TermComposite__TermWithAssociationAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermCompositeAccess().getTermWithAssociationAssignment_1_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TermComposite__Alternatives_1"


    // $ANTLR start "rule__TermInstance__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:920:1: rule__TermInstance__Alternatives : ( ( ( rule__TermInstance__Group_0__0 ) ) | ( ( rule__TermInstance__Group_1__0 ) ) );
    public final void rule__TermInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:924:1: ( ( ( rule__TermInstance__Group_0__0 ) ) | ( ( rule__TermInstance__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
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
                    alt5=2;
                    }
                    break;
                case KEYWORD_16:
                    {
                    int LA5_3 = input.LA(3);

                    if ( ((LA5_3>=RULE_MINUS_INTEGER && LA5_3<=RULE_DATE_TIME)||LA5_3==RULE_INT) ) {
                        alt5=2;
                    }
                    else if ( (LA5_3==KEYWORD_24||LA5_3==RULE_STRING) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case KEYWORD_24:
                case RULE_STRING:
                    {
                    alt5=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:925:1: ( ( rule__TermInstance__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:925:1: ( ( rule__TermInstance__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:926:1: ( rule__TermInstance__Group_0__0 )
                    {
                     before(grammarAccess.getTermInstanceAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:927:1: ( rule__TermInstance__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:927:2: rule__TermInstance__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TermInstance__Group_0__0_in_rule__TermInstance__Alternatives1953);
                    rule__TermInstance__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermInstanceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:931:6: ( ( rule__TermInstance__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:931:6: ( ( rule__TermInstance__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:932:1: ( rule__TermInstance__Group_1__0 )
                    {
                     before(grammarAccess.getTermInstanceAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:933:1: ( rule__TermInstance__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:933:2: rule__TermInstance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TermInstance__Group_1__0_in_rule__TermInstance__Alternatives1971);
                    rule__TermInstance__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermInstanceAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__TermInstance__Alternatives"


    // $ANTLR start "rule__Quantifier__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:942:1: rule__Quantifier__Alternatives : ( ( ( rule__Quantifier__Group_0__0 ) ) | ( ( rule__Quantifier__Group_1__0 ) ) | ( ( rule__Quantifier__Group_2__0 ) ) | ( ( rule__Quantifier__Group_3__0 ) ) );
    public final void rule__Quantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:946:1: ( ( ( rule__Quantifier__Group_0__0 ) ) | ( ( rule__Quantifier__Group_1__0 ) ) | ( ( rule__Quantifier__Group_2__0 ) ) | ( ( rule__Quantifier__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case KEYWORD_28:
                {
                alt6=1;
                }
                break;
            case KEYWORD_26:
                {
                alt6=2;
                }
                break;
            case KEYWORD_29:
                {
                alt6=3;
                }
                break;
            case KEYWORD_31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:947:1: ( ( rule__Quantifier__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:947:1: ( ( rule__Quantifier__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:948:1: ( rule__Quantifier__Group_0__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:949:1: ( rule__Quantifier__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:949:2: rule__Quantifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_0__0_in_rule__Quantifier__Alternatives2004);
                    rule__Quantifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:953:6: ( ( rule__Quantifier__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:953:6: ( ( rule__Quantifier__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:954:1: ( rule__Quantifier__Group_1__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:955:1: ( rule__Quantifier__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:955:2: rule__Quantifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_1__0_in_rule__Quantifier__Alternatives2022);
                    rule__Quantifier__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:959:6: ( ( rule__Quantifier__Group_2__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:959:6: ( ( rule__Quantifier__Group_2__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:960:1: ( rule__Quantifier__Group_2__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:961:1: ( rule__Quantifier__Group_2__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:961:2: rule__Quantifier__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_2__0_in_rule__Quantifier__Alternatives2040);
                    rule__Quantifier__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:965:6: ( ( rule__Quantifier__Group_3__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:965:6: ( ( rule__Quantifier__Group_3__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:966:1: ( rule__Quantifier__Group_3__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_3()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:967:1: ( rule__Quantifier__Group_3__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:967:2: rule__Quantifier__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_3__0_in_rule__Quantifier__Alternatives2058);
                    rule__Quantifier__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Quantifier__Alternatives"


    // $ANTLR start "rule__FormulaExpression__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:976:1: rule__FormulaExpression__Alternatives : ( ( ( rule__FormulaExpression__Group_0__0 ) ) | ( ( rule__FormulaExpression__Group_1__0 ) ) );
    public final void rule__FormulaExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:980:1: ( ( ( rule__FormulaExpression__Group_0__0 ) ) | ( ( rule__FormulaExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_2) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:981:1: ( ( rule__FormulaExpression__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:981:1: ( ( rule__FormulaExpression__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:982:1: ( rule__FormulaExpression__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaExpressionAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:983:1: ( rule__FormulaExpression__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:983:2: rule__FormulaExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_0__0_in_rule__FormulaExpression__Alternatives2091);
                    rule__FormulaExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:987:6: ( ( rule__FormulaExpression__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:987:6: ( ( rule__FormulaExpression__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:988:1: ( rule__FormulaExpression__Group_1__0 )
                    {
                     before(grammarAccess.getFormulaExpressionAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:989:1: ( rule__FormulaExpression__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:989:2: rule__FormulaExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_1__0_in_rule__FormulaExpression__Alternatives2109);
                    rule__FormulaExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__FormulaExpression__Alternatives"


    // $ANTLR start "rule__FormulaItem__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:998:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1002:1: ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1003:1: ( ( rule__FormulaItem__TAssignment_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1003:1: ( ( rule__FormulaItem__TAssignment_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1004:1: ( rule__FormulaItem__TAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTAssignment_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1005:1: ( rule__FormulaItem__TAssignment_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1005:2: rule__FormulaItem__TAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TAssignment_0_in_rule__FormulaItem__Alternatives2142);
                    rule__FormulaItem__TAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getTAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1009:6: ( ( rule__FormulaItem__TiAssignment_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1009:6: ( ( rule__FormulaItem__TiAssignment_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1010:1: ( rule__FormulaItem__TiAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTiAssignment_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1011:1: ( rule__FormulaItem__TiAssignment_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1011:2: rule__FormulaItem__TiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TiAssignment_1_in_rule__FormulaItem__Alternatives2160);
                    rule__FormulaItem__TiAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getTiAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1015:6: ( ( rule__FormulaItem__TwaAssignment_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1015:6: ( ( rule__FormulaItem__TwaAssignment_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1016:1: ( rule__FormulaItem__TwaAssignment_2 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTwaAssignment_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1017:1: ( rule__FormulaItem__TwaAssignment_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1017:2: rule__FormulaItem__TwaAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TwaAssignment_2_in_rule__FormulaItem__Alternatives2178);
                    rule__FormulaItem__TwaAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getTwaAssignment_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__FormulaItem__Alternatives"


    // $ANTLR start "rule__MathOperator__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1026:1: rule__MathOperator__Alternatives : ( ( ( rule__MathOperator__SumAssignment_0 ) ) | ( ( rule__MathOperator__SubtractAssignment_1 ) ) | ( ( rule__MathOperator__DivideAssignment_2 ) ) | ( ( rule__MathOperator__MultiplyAssignment_3 ) ) | ( ( rule__MathOperator__RAssignment_4 ) ) | ( ( rule__MathOperator__PAssignment_5 ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1030:1: ( ( ( rule__MathOperator__SumAssignment_0 ) ) | ( ( rule__MathOperator__SubtractAssignment_1 ) ) | ( ( rule__MathOperator__DivideAssignment_2 ) ) | ( ( rule__MathOperator__MultiplyAssignment_3 ) ) | ( ( rule__MathOperator__RAssignment_4 ) ) | ( ( rule__MathOperator__PAssignment_5 ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case KEYWORD_5:
                {
                alt9=1;
                }
                break;
            case KEYWORD_7:
                {
                alt9=2;
                }
                break;
            case KEYWORD_9:
                {
                alt9=3;
                }
                break;
            case KEYWORD_4:
                {
                alt9=4;
                }
                break;
            case KEYWORD_1:
                {
                alt9=5;
                }
                break;
            case KEYWORD_17:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1031:1: ( ( rule__MathOperator__SumAssignment_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1031:1: ( ( rule__MathOperator__SumAssignment_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1032:1: ( rule__MathOperator__SumAssignment_0 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getSumAssignment_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1033:1: ( rule__MathOperator__SumAssignment_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1033:2: rule__MathOperator__SumAssignment_0
                    {
                    pushFollow(FOLLOW_rule__MathOperator__SumAssignment_0_in_rule__MathOperator__Alternatives2211);
                    rule__MathOperator__SumAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getSumAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1037:6: ( ( rule__MathOperator__SubtractAssignment_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1037:6: ( ( rule__MathOperator__SubtractAssignment_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1038:1: ( rule__MathOperator__SubtractAssignment_1 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getSubtractAssignment_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1039:1: ( rule__MathOperator__SubtractAssignment_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1039:2: rule__MathOperator__SubtractAssignment_1
                    {
                    pushFollow(FOLLOW_rule__MathOperator__SubtractAssignment_1_in_rule__MathOperator__Alternatives2229);
                    rule__MathOperator__SubtractAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getSubtractAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1043:6: ( ( rule__MathOperator__DivideAssignment_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1043:6: ( ( rule__MathOperator__DivideAssignment_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1044:1: ( rule__MathOperator__DivideAssignment_2 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDivideAssignment_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1045:1: ( rule__MathOperator__DivideAssignment_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1045:2: rule__MathOperator__DivideAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MathOperator__DivideAssignment_2_in_rule__MathOperator__Alternatives2247);
                    rule__MathOperator__DivideAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getDivideAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1049:6: ( ( rule__MathOperator__MultiplyAssignment_3 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1049:6: ( ( rule__MathOperator__MultiplyAssignment_3 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1050:1: ( rule__MathOperator__MultiplyAssignment_3 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getMultiplyAssignment_3()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1051:1: ( rule__MathOperator__MultiplyAssignment_3 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1051:2: rule__MathOperator__MultiplyAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MathOperator__MultiplyAssignment_3_in_rule__MathOperator__Alternatives2265);
                    rule__MathOperator__MultiplyAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getMultiplyAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1055:6: ( ( rule__MathOperator__RAssignment_4 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1055:6: ( ( rule__MathOperator__RAssignment_4 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1056:1: ( rule__MathOperator__RAssignment_4 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getRAssignment_4()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1057:1: ( rule__MathOperator__RAssignment_4 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1057:2: rule__MathOperator__RAssignment_4
                    {
                    pushFollow(FOLLOW_rule__MathOperator__RAssignment_4_in_rule__MathOperator__Alternatives2283);
                    rule__MathOperator__RAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getRAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1061:6: ( ( rule__MathOperator__PAssignment_5 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1061:6: ( ( rule__MathOperator__PAssignment_5 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1062:1: ( rule__MathOperator__PAssignment_5 )
                    {
                     before(grammarAccess.getMathOperatorAccess().getPAssignment_5()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1063:1: ( rule__MathOperator__PAssignment_5 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1063:2: rule__MathOperator__PAssignment_5
                    {
                    pushFollow(FOLLOW_rule__MathOperator__PAssignment_5_in_rule__MathOperator__Alternatives2301);
                    rule__MathOperator__PAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getMathOperatorAccess().getPAssignment_5()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MathOperator__Alternatives"


    // $ANTLR start "rule__RelationalOperator__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1072:1: rule__RelationalOperator__Alternatives : ( ( ( rule__RelationalOperator__OAssignment_0 ) ) | ( ( rule__RelationalOperator__OAssignment_1 ) ) | ( ( rule__RelationalOperator__OAssignment_2 ) ) | ( ( rule__RelationalOperator__OAssignment_3 ) ) | ( ( rule__RelationalOperator__NeoAssignment_4 ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1076:1: ( ( ( rule__RelationalOperator__OAssignment_0 ) ) | ( ( rule__RelationalOperator__OAssignment_1 ) ) | ( ( rule__RelationalOperator__OAssignment_2 ) ) | ( ( rule__RelationalOperator__OAssignment_3 ) ) | ( ( rule__RelationalOperator__NeoAssignment_4 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case KEYWORD_12:
                {
                alt10=1;
                }
                break;
            case KEYWORD_10:
                {
                alt10=2;
                }
                break;
            case KEYWORD_19:
                {
                alt10=3;
                }
                break;
            case KEYWORD_18:
                {
                alt10=4;
                }
                break;
            case KEYWORD_16:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1077:1: ( ( rule__RelationalOperator__OAssignment_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1077:1: ( ( rule__RelationalOperator__OAssignment_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1078:1: ( rule__RelationalOperator__OAssignment_0 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1079:1: ( rule__RelationalOperator__OAssignment_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1079:2: rule__RelationalOperator__OAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_0_in_rule__RelationalOperator__Alternatives2334);
                    rule__RelationalOperator__OAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1083:6: ( ( rule__RelationalOperator__OAssignment_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1083:6: ( ( rule__RelationalOperator__OAssignment_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1084:1: ( rule__RelationalOperator__OAssignment_1 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1085:1: ( rule__RelationalOperator__OAssignment_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1085:2: rule__RelationalOperator__OAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_1_in_rule__RelationalOperator__Alternatives2352);
                    rule__RelationalOperator__OAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1089:6: ( ( rule__RelationalOperator__OAssignment_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1089:6: ( ( rule__RelationalOperator__OAssignment_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1090:1: ( rule__RelationalOperator__OAssignment_2 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1091:1: ( rule__RelationalOperator__OAssignment_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1091:2: rule__RelationalOperator__OAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_2_in_rule__RelationalOperator__Alternatives2370);
                    rule__RelationalOperator__OAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1095:6: ( ( rule__RelationalOperator__OAssignment_3 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1095:6: ( ( rule__RelationalOperator__OAssignment_3 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1096:1: ( rule__RelationalOperator__OAssignment_3 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_3()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1097:1: ( rule__RelationalOperator__OAssignment_3 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1097:2: rule__RelationalOperator__OAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_3_in_rule__RelationalOperator__Alternatives2388);
                    rule__RelationalOperator__OAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1101:6: ( ( rule__RelationalOperator__NeoAssignment_4 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1101:6: ( ( rule__RelationalOperator__NeoAssignment_4 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1102:1: ( rule__RelationalOperator__NeoAssignment_4 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getNeoAssignment_4()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1103:1: ( rule__RelationalOperator__NeoAssignment_4 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1103:2: rule__RelationalOperator__NeoAssignment_4
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__NeoAssignment_4_in_rule__RelationalOperator__Alternatives2406);
                    rule__RelationalOperator__NeoAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getNeoAssignment_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__RelationalOperator__Alternatives"


    // $ANTLR start "rule__List__Alternatives_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1112:1: rule__List__Alternatives_0 : ( ( ( rule__List__SlAssignment_0_0 ) ) | ( ( rule__List__OlAssignment_0_1 ) ) );
    public final void rule__List__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1116:1: ( ( ( rule__List__SlAssignment_0_0 ) ) | ( ( rule__List__OlAssignment_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_24||LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_MINUS_INTEGER && LA11_0<=RULE_DATE_TIME)||LA11_0==RULE_INT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1117:1: ( ( rule__List__SlAssignment_0_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1117:1: ( ( rule__List__SlAssignment_0_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1118:1: ( rule__List__SlAssignment_0_0 )
                    {
                     before(grammarAccess.getListAccess().getSlAssignment_0_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1119:1: ( rule__List__SlAssignment_0_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1119:2: rule__List__SlAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__List__SlAssignment_0_0_in_rule__List__Alternatives_02439);
                    rule__List__SlAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getSlAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1123:6: ( ( rule__List__OlAssignment_0_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1123:6: ( ( rule__List__OlAssignment_0_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1124:1: ( rule__List__OlAssignment_0_1 )
                    {
                     before(grammarAccess.getListAccess().getOlAssignment_0_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1125:1: ( rule__List__OlAssignment_0_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1125:2: rule__List__OlAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__List__OlAssignment_0_1_in_rule__List__Alternatives_02457);
                    rule__List__OlAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getOlAssignment_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__List__Alternatives_0"


    // $ANTLR start "rule__StringLiteral__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1134:1: rule__StringLiteral__Alternatives : ( ( RULE_STRING ) | ( KEYWORD_24 ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1138:1: ( ( RULE_STRING ) | ( KEYWORD_24 ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==KEYWORD_24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1139:1: ( RULE_STRING )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1139:1: ( RULE_STRING )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1140:1: RULE_STRING
                    {
                     before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__Alternatives2490); 
                     after(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1145:6: ( KEYWORD_24 )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1145:6: ( KEYWORD_24 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1146:1: KEYWORD_24
                    {
                     before(grammarAccess.getStringLiteralAccess().getNullKeyword_1()); 
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__StringLiteral__Alternatives2508); 
                     after(grammarAccess.getStringLiteralAccess().getNullKeyword_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__StringLiteral__Alternatives"


    // $ANTLR start "rule__OtherLiteral__Alternatives"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1158:1: rule__OtherLiteral__Alternatives : ( ( RULE_FLOAT ) | ( RULE_MINUS_FLOAT ) | ( RULE_INT ) | ( RULE_MINUS_INTEGER ) | ( RULE_DATE_TIME ) );
    public final void rule__OtherLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1162:1: ( ( RULE_FLOAT ) | ( RULE_MINUS_FLOAT ) | ( RULE_INT ) | ( RULE_MINUS_INTEGER ) | ( RULE_DATE_TIME ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt13=1;
                }
                break;
            case RULE_MINUS_FLOAT:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
                {
                alt13=3;
                }
                break;
            case RULE_MINUS_INTEGER:
                {
                alt13=4;
                }
                break;
            case RULE_DATE_TIME:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1163:1: ( RULE_FLOAT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1163:1: ( RULE_FLOAT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1164:1: RULE_FLOAT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__OtherLiteral__Alternatives2542); 
                     after(grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1169:6: ( RULE_MINUS_FLOAT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1169:6: ( RULE_MINUS_FLOAT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1170:1: RULE_MINUS_FLOAT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 
                    match(input,RULE_MINUS_FLOAT,FOLLOW_RULE_MINUS_FLOAT_in_rule__OtherLiteral__Alternatives2559); 
                     after(grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1175:6: ( RULE_INT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1175:6: ( RULE_INT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1176:1: RULE_INT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__OtherLiteral__Alternatives2576); 
                     after(grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1181:6: ( RULE_MINUS_INTEGER )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1181:6: ( RULE_MINUS_INTEGER )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1182:1: RULE_MINUS_INTEGER
                    {
                     before(grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 
                    match(input,RULE_MINUS_INTEGER,FOLLOW_RULE_MINUS_INTEGER_in_rule__OtherLiteral__Alternatives2593); 
                     after(grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1187:6: ( RULE_DATE_TIME )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1187:6: ( RULE_DATE_TIME )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1188:1: RULE_DATE_TIME
                    {
                     before(grammarAccess.getOtherLiteralAccess().getDATE_TIMETerminalRuleCall_4()); 
                    match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_rule__OtherLiteral__Alternatives2610); 
                     after(grammarAccess.getOtherLiteralAccess().getDATE_TIMETerminalRuleCall_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__OtherLiteral__Alternatives"


    // $ANTLR start "rule__Leta__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1200:1: rule__Leta__Group__0 : rule__Leta__Group__0__Impl rule__Leta__Group__1 ;
    public final void rule__Leta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1204:1: ( rule__Leta__Group__0__Impl rule__Leta__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1205:2: rule__Leta__Group__0__Impl rule__Leta__Group__1
            {
            pushFollow(FOLLOW_rule__Leta__Group__0__Impl_in_rule__Leta__Group__02640);
            rule__Leta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Leta__Group__1_in_rule__Leta__Group__02643);
            rule__Leta__Group__1();

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
    // $ANTLR end "rule__Leta__Group__0"


    // $ANTLR start "rule__Leta__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1212:1: rule__Leta__Group__0__Impl : ( ( rule__Leta__TpAssignment_0 )? ) ;
    public final void rule__Leta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1216:1: ( ( ( rule__Leta__TpAssignment_0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1217:1: ( ( rule__Leta__TpAssignment_0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1217:1: ( ( rule__Leta__TpAssignment_0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1218:1: ( rule__Leta__TpAssignment_0 )?
            {
             before(grammarAccess.getLetaAccess().getTpAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1219:1: ( rule__Leta__TpAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1219:2: rule__Leta__TpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Leta__TpAssignment_0_in_rule__Leta__Group__0__Impl2670);
                    rule__Leta__TpAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLetaAccess().getTpAssignment_0()); 

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
    // $ANTLR end "rule__Leta__Group__0__Impl"


    // $ANTLR start "rule__Leta__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1229:1: rule__Leta__Group__1 : rule__Leta__Group__1__Impl ;
    public final void rule__Leta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1233:1: ( rule__Leta__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1234:2: rule__Leta__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Leta__Group__1__Impl_in_rule__Leta__Group__12701);
            rule__Leta__Group__1__Impl();

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
    // $ANTLR end "rule__Leta__Group__1"


    // $ANTLR start "rule__Leta__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1240:1: rule__Leta__Group__1__Impl : ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) ) ;
    public final void rule__Leta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1244:1: ( ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1245:1: ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1245:1: ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1246:1: ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1246:1: ( ( rule__Leta__TcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1247:1: ( rule__Leta__TcAssignment_1 )
            {
             before(grammarAccess.getLetaAccess().getTcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1248:1: ( rule__Leta__TcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1248:2: rule__Leta__TcAssignment_1
            {
            pushFollow(FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2730);
            rule__Leta__TcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetaAccess().getTcAssignment_1()); 

            }

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1251:1: ( ( rule__Leta__TcAssignment_1 )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1252:1: ( rule__Leta__TcAssignment_1 )*
            {
             before(grammarAccess.getLetaAccess().getTcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1253:1: ( rule__Leta__TcAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==KEYWORD_23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1253:2: rule__Leta__TcAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2742);
            	    rule__Leta__TcAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getLetaAccess().getTcAssignment_1()); 

            }


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
    // $ANTLR end "rule__Leta__Group__1__Impl"


    // $ANTLR start "rule__TestCase__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1268:1: rule__TestCase__Group__0 : rule__TestCase__Group__0__Impl rule__TestCase__Group__1 ;
    public final void rule__TestCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1272:1: ( rule__TestCase__Group__0__Impl rule__TestCase__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1273:2: rule__TestCase__Group__0__Impl rule__TestCase__Group__1
            {
            pushFollow(FOLLOW_rule__TestCase__Group__0__Impl_in_rule__TestCase__Group__02779);
            rule__TestCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__1_in_rule__TestCase__Group__02782);
            rule__TestCase__Group__1();

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
    // $ANTLR end "rule__TestCase__Group__0"


    // $ANTLR start "rule__TestCase__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1280:1: rule__TestCase__Group__0__Impl : ( KEYWORD_23 ) ;
    public final void rule__TestCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1284:1: ( ( KEYWORD_23 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1285:1: ( KEYWORD_23 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1285:1: ( KEYWORD_23 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1286:1: KEYWORD_23
            {
             before(grammarAccess.getTestCaseAccess().getTestKeyword_0()); 
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__TestCase__Group__0__Impl2810); 
             after(grammarAccess.getTestCaseAccess().getTestKeyword_0()); 

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
    // $ANTLR end "rule__TestCase__Group__0__Impl"


    // $ANTLR start "rule__TestCase__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1299:1: rule__TestCase__Group__1 : rule__TestCase__Group__1__Impl rule__TestCase__Group__2 ;
    public final void rule__TestCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1303:1: ( rule__TestCase__Group__1__Impl rule__TestCase__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1304:2: rule__TestCase__Group__1__Impl rule__TestCase__Group__2
            {
            pushFollow(FOLLOW_rule__TestCase__Group__1__Impl_in_rule__TestCase__Group__12841);
            rule__TestCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__2_in_rule__TestCase__Group__12844);
            rule__TestCase__Group__2();

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
    // $ANTLR end "rule__TestCase__Group__1"


    // $ANTLR start "rule__TestCase__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1311:1: rule__TestCase__Group__1__Impl : ( ( rule__TestCase__IdAssignment_1 ) ) ;
    public final void rule__TestCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1315:1: ( ( ( rule__TestCase__IdAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1316:1: ( ( rule__TestCase__IdAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1316:1: ( ( rule__TestCase__IdAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1317:1: ( rule__TestCase__IdAssignment_1 )
            {
             before(grammarAccess.getTestCaseAccess().getIdAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1318:1: ( rule__TestCase__IdAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1318:2: rule__TestCase__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__TestCase__IdAssignment_1_in_rule__TestCase__Group__1__Impl2871);
            rule__TestCase__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__TestCase__Group__1__Impl"


    // $ANTLR start "rule__TestCase__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1328:1: rule__TestCase__Group__2 : rule__TestCase__Group__2__Impl rule__TestCase__Group__3 ;
    public final void rule__TestCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1332:1: ( rule__TestCase__Group__2__Impl rule__TestCase__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1333:2: rule__TestCase__Group__2__Impl rule__TestCase__Group__3
            {
            pushFollow(FOLLOW_rule__TestCase__Group__2__Impl_in_rule__TestCase__Group__22901);
            rule__TestCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__3_in_rule__TestCase__Group__22904);
            rule__TestCase__Group__3();

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
    // $ANTLR end "rule__TestCase__Group__2"


    // $ANTLR start "rule__TestCase__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1340:1: rule__TestCase__Group__2__Impl : ( ( rule__TestCase__VAssignment_2 ) ) ;
    public final void rule__TestCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1344:1: ( ( ( rule__TestCase__VAssignment_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1345:1: ( ( rule__TestCase__VAssignment_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1345:1: ( ( rule__TestCase__VAssignment_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1346:1: ( rule__TestCase__VAssignment_2 )
            {
             before(grammarAccess.getTestCaseAccess().getVAssignment_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1347:1: ( rule__TestCase__VAssignment_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1347:2: rule__TestCase__VAssignment_2
            {
            pushFollow(FOLLOW_rule__TestCase__VAssignment_2_in_rule__TestCase__Group__2__Impl2931);
            rule__TestCase__VAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getVAssignment_2()); 

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
    // $ANTLR end "rule__TestCase__Group__2__Impl"


    // $ANTLR start "rule__TestCase__Group__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1357:1: rule__TestCase__Group__3 : rule__TestCase__Group__3__Impl rule__TestCase__Group__4 ;
    public final void rule__TestCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1361:1: ( rule__TestCase__Group__3__Impl rule__TestCase__Group__4 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1362:2: rule__TestCase__Group__3__Impl rule__TestCase__Group__4
            {
            pushFollow(FOLLOW_rule__TestCase__Group__3__Impl_in_rule__TestCase__Group__32961);
            rule__TestCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__4_in_rule__TestCase__Group__32964);
            rule__TestCase__Group__4();

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
    // $ANTLR end "rule__TestCase__Group__3"


    // $ANTLR start "rule__TestCase__Group__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1369:1: rule__TestCase__Group__3__Impl : ( ( rule__TestCase__WAssignment_3 ) ) ;
    public final void rule__TestCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1373:1: ( ( ( rule__TestCase__WAssignment_3 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1374:1: ( ( rule__TestCase__WAssignment_3 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1374:1: ( ( rule__TestCase__WAssignment_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1375:1: ( rule__TestCase__WAssignment_3 )
            {
             before(grammarAccess.getTestCaseAccess().getWAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1376:1: ( rule__TestCase__WAssignment_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1376:2: rule__TestCase__WAssignment_3
            {
            pushFollow(FOLLOW_rule__TestCase__WAssignment_3_in_rule__TestCase__Group__3__Impl2991);
            rule__TestCase__WAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestCaseAccess().getWAssignment_3()); 

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
    // $ANTLR end "rule__TestCase__Group__3__Impl"


    // $ANTLR start "rule__TestCase__Group__4"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1386:1: rule__TestCase__Group__4 : rule__TestCase__Group__4__Impl ;
    public final void rule__TestCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1390:1: ( rule__TestCase__Group__4__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1391:2: rule__TestCase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TestCase__Group__4__Impl_in_rule__TestCase__Group__43021);
            rule__TestCase__Group__4__Impl();

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
    // $ANTLR end "rule__TestCase__Group__4"


    // $ANTLR start "rule__TestCase__Group__4__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1397:1: rule__TestCase__Group__4__Impl : ( ( rule__TestCase__SAssignment_4 )? ) ;
    public final void rule__TestCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1401:1: ( ( ( rule__TestCase__SAssignment_4 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1402:1: ( ( rule__TestCase__SAssignment_4 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1402:1: ( ( rule__TestCase__SAssignment_4 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1403:1: ( rule__TestCase__SAssignment_4 )?
            {
             before(grammarAccess.getTestCaseAccess().getSAssignment_4()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1404:1: ( rule__TestCase__SAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1404:2: rule__TestCase__SAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TestCase__SAssignment_4_in_rule__TestCase__Group__4__Impl3048);
                    rule__TestCase__SAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestCaseAccess().getSAssignment_4()); 

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
    // $ANTLR end "rule__TestCase__Group__4__Impl"


    // $ANTLR start "rule__VerifyClause__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1424:1: rule__VerifyClause__Group__0 : rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1 ;
    public final void rule__VerifyClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1428:1: ( rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1429:2: rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__0__Impl_in_rule__VerifyClause__Group__03089);
            rule__VerifyClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerifyClause__Group__1_in_rule__VerifyClause__Group__03092);
            rule__VerifyClause__Group__1();

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
    // $ANTLR end "rule__VerifyClause__Group__0"


    // $ANTLR start "rule__VerifyClause__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1436:1: rule__VerifyClause__Group__0__Impl : ( KEYWORD_27 ) ;
    public final void rule__VerifyClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1440:1: ( ( KEYWORD_27 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1441:1: ( KEYWORD_27 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1441:1: ( KEYWORD_27 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1442:1: KEYWORD_27
            {
             before(grammarAccess.getVerifyClauseAccess().getVerifyKeyword_0()); 
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__VerifyClause__Group__0__Impl3120); 
             after(grammarAccess.getVerifyClauseAccess().getVerifyKeyword_0()); 

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
    // $ANTLR end "rule__VerifyClause__Group__0__Impl"


    // $ANTLR start "rule__VerifyClause__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1455:1: rule__VerifyClause__Group__1 : rule__VerifyClause__Group__1__Impl ;
    public final void rule__VerifyClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1459:1: ( rule__VerifyClause__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1460:2: rule__VerifyClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__1__Impl_in_rule__VerifyClause__Group__13151);
            rule__VerifyClause__Group__1__Impl();

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
    // $ANTLR end "rule__VerifyClause__Group__1"


    // $ANTLR start "rule__VerifyClause__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1466:1: rule__VerifyClause__Group__1__Impl : ( ( rule__VerifyClause__FcAssignment_1 ) ) ;
    public final void rule__VerifyClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1470:1: ( ( ( rule__VerifyClause__FcAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1471:1: ( ( rule__VerifyClause__FcAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1471:1: ( ( rule__VerifyClause__FcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1472:1: ( rule__VerifyClause__FcAssignment_1 )
            {
             before(grammarAccess.getVerifyClauseAccess().getFcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1473:1: ( rule__VerifyClause__FcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1473:2: rule__VerifyClause__FcAssignment_1
            {
            pushFollow(FOLLOW_rule__VerifyClause__FcAssignment_1_in_rule__VerifyClause__Group__1__Impl3178);
            rule__VerifyClause__FcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerifyClauseAccess().getFcAssignment_1()); 

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
    // $ANTLR end "rule__VerifyClause__Group__1__Impl"


    // $ANTLR start "rule__WhenClause__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1487:1: rule__WhenClause__Group__0 : rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 ;
    public final void rule__WhenClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1491:1: ( rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1492:2: rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__0__Impl_in_rule__WhenClause__Group__03212);
            rule__WhenClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenClause__Group__1_in_rule__WhenClause__Group__03215);
            rule__WhenClause__Group__1();

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
    // $ANTLR end "rule__WhenClause__Group__0"


    // $ANTLR start "rule__WhenClause__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1499:1: rule__WhenClause__Group__0__Impl : ( KEYWORD_25 ) ;
    public final void rule__WhenClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1503:1: ( ( KEYWORD_25 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1504:1: ( KEYWORD_25 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1504:1: ( KEYWORD_25 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1505:1: KEYWORD_25
            {
             before(grammarAccess.getWhenClauseAccess().getWhenKeyword_0()); 
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__WhenClause__Group__0__Impl3243); 
             after(grammarAccess.getWhenClauseAccess().getWhenKeyword_0()); 

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
    // $ANTLR end "rule__WhenClause__Group__0__Impl"


    // $ANTLR start "rule__WhenClause__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1518:1: rule__WhenClause__Group__1 : rule__WhenClause__Group__1__Impl ;
    public final void rule__WhenClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1522:1: ( rule__WhenClause__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1523:2: rule__WhenClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__1__Impl_in_rule__WhenClause__Group__13274);
            rule__WhenClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhenClause__Group__1"


    // $ANTLR start "rule__WhenClause__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1529:1: rule__WhenClause__Group__1__Impl : ( ( rule__WhenClause__FcAssignment_1 ) ) ;
    public final void rule__WhenClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1533:1: ( ( ( rule__WhenClause__FcAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1534:1: ( ( rule__WhenClause__FcAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1534:1: ( ( rule__WhenClause__FcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1535:1: ( rule__WhenClause__FcAssignment_1 )
            {
             before(grammarAccess.getWhenClauseAccess().getFcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1536:1: ( rule__WhenClause__FcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1536:2: rule__WhenClause__FcAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenClause__FcAssignment_1_in_rule__WhenClause__Group__1__Impl3301);
            rule__WhenClause__FcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenClauseAccess().getFcAssignment_1()); 

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
    // $ANTLR end "rule__WhenClause__Group__1__Impl"


    // $ANTLR start "rule__SetClause__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1550:1: rule__SetClause__Group__0 : rule__SetClause__Group__0__Impl rule__SetClause__Group__1 ;
    public final void rule__SetClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1554:1: ( rule__SetClause__Group__0__Impl rule__SetClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1555:2: rule__SetClause__Group__0__Impl rule__SetClause__Group__1
            {
            pushFollow(FOLLOW_rule__SetClause__Group__0__Impl_in_rule__SetClause__Group__03335);
            rule__SetClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__1_in_rule__SetClause__Group__03338);
            rule__SetClause__Group__1();

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
    // $ANTLR end "rule__SetClause__Group__0"


    // $ANTLR start "rule__SetClause__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1562:1: rule__SetClause__Group__0__Impl : ( () ) ;
    public final void rule__SetClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1566:1: ( ( () ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1567:1: ( () )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1567:1: ( () )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1568:1: ()
            {
             before(grammarAccess.getSetClauseAccess().getSetAction_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1569:1: ()
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1571:1: 
            {
            }

             after(grammarAccess.getSetClauseAccess().getSetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetClause__Group__0__Impl"


    // $ANTLR start "rule__SetClause__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1581:1: rule__SetClause__Group__1 : rule__SetClause__Group__1__Impl rule__SetClause__Group__2 ;
    public final void rule__SetClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1585:1: ( rule__SetClause__Group__1__Impl rule__SetClause__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1586:2: rule__SetClause__Group__1__Impl rule__SetClause__Group__2
            {
            pushFollow(FOLLOW_rule__SetClause__Group__1__Impl_in_rule__SetClause__Group__13396);
            rule__SetClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__2_in_rule__SetClause__Group__13399);
            rule__SetClause__Group__2();

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
    // $ANTLR end "rule__SetClause__Group__1"


    // $ANTLR start "rule__SetClause__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1593:1: rule__SetClause__Group__1__Impl : ( KEYWORD_22 ) ;
    public final void rule__SetClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1597:1: ( ( KEYWORD_22 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1598:1: ( KEYWORD_22 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1598:1: ( KEYWORD_22 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1599:1: KEYWORD_22
            {
             before(grammarAccess.getSetClauseAccess().getSetKeyword_1()); 
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SetClause__Group__1__Impl3427); 
             after(grammarAccess.getSetClauseAccess().getSetKeyword_1()); 

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
    // $ANTLR end "rule__SetClause__Group__1__Impl"


    // $ANTLR start "rule__SetClause__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1612:1: rule__SetClause__Group__2 : rule__SetClause__Group__2__Impl rule__SetClause__Group__3 ;
    public final void rule__SetClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1616:1: ( rule__SetClause__Group__2__Impl rule__SetClause__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1617:2: rule__SetClause__Group__2__Impl rule__SetClause__Group__3
            {
            pushFollow(FOLLOW_rule__SetClause__Group__2__Impl_in_rule__SetClause__Group__23458);
            rule__SetClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__3_in_rule__SetClause__Group__23461);
            rule__SetClause__Group__3();

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
    // $ANTLR end "rule__SetClause__Group__2"


    // $ANTLR start "rule__SetClause__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1624:1: rule__SetClause__Group__2__Impl : ( KEYWORD_14 ) ;
    public final void rule__SetClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1628:1: ( ( KEYWORD_14 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1629:1: ( KEYWORD_14 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1629:1: ( KEYWORD_14 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1630:1: KEYWORD_14
            {
             before(grammarAccess.getSetClauseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__SetClause__Group__2__Impl3489); 
             after(grammarAccess.getSetClauseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SetClause__Group__2__Impl"


    // $ANTLR start "rule__SetClause__Group__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1643:1: rule__SetClause__Group__3 : rule__SetClause__Group__3__Impl rule__SetClause__Group__4 ;
    public final void rule__SetClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1647:1: ( rule__SetClause__Group__3__Impl rule__SetClause__Group__4 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1648:2: rule__SetClause__Group__3__Impl rule__SetClause__Group__4
            {
            pushFollow(FOLLOW_rule__SetClause__Group__3__Impl_in_rule__SetClause__Group__33520);
            rule__SetClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__4_in_rule__SetClause__Group__33523);
            rule__SetClause__Group__4();

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
    // $ANTLR end "rule__SetClause__Group__3"


    // $ANTLR start "rule__SetClause__Group__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1655:1: rule__SetClause__Group__3__Impl : ( ( rule__SetClause__SAssignment_3 )? ) ;
    public final void rule__SetClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1659:1: ( ( ( rule__SetClause__SAssignment_3 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1660:1: ( ( rule__SetClause__SAssignment_3 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1660:1: ( ( rule__SetClause__SAssignment_3 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1661:1: ( rule__SetClause__SAssignment_3 )?
            {
             before(grammarAccess.getSetClauseAccess().getSAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1662:1: ( rule__SetClause__SAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1662:2: rule__SetClause__SAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SetClause__SAssignment_3_in_rule__SetClause__Group__3__Impl3550);
                    rule__SetClause__SAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetClauseAccess().getSAssignment_3()); 

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
    // $ANTLR end "rule__SetClause__Group__3__Impl"


    // $ANTLR start "rule__SetClause__Group__4"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1672:1: rule__SetClause__Group__4 : rule__SetClause__Group__4__Impl ;
    public final void rule__SetClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1676:1: ( rule__SetClause__Group__4__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1677:2: rule__SetClause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SetClause__Group__4__Impl_in_rule__SetClause__Group__43581);
            rule__SetClause__Group__4__Impl();

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
    // $ANTLR end "rule__SetClause__Group__4"


    // $ANTLR start "rule__SetClause__Group__4__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1683:1: rule__SetClause__Group__4__Impl : ( KEYWORD_15 ) ;
    public final void rule__SetClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1687:1: ( ( KEYWORD_15 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1688:1: ( KEYWORD_15 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1688:1: ( KEYWORD_15 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1689:1: KEYWORD_15
            {
             before(grammarAccess.getSetClauseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__SetClause__Group__4__Impl3609); 
             after(grammarAccess.getSetClauseAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SetClause__Group__4__Impl"


    // $ANTLR start "rule__FactComposite__Group_0__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1712:1: rule__FactComposite__Group_0__0 : rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1 ;
    public final void rule__FactComposite__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1716:1: ( rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1717:2: rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0__0__Impl_in_rule__FactComposite__Group_0__03650);
            rule__FactComposite__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_0__1_in_rule__FactComposite__Group_0__03653);
            rule__FactComposite__Group_0__1();

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
    // $ANTLR end "rule__FactComposite__Group_0__0"


    // $ANTLR start "rule__FactComposite__Group_0__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1724:1: rule__FactComposite__Group_0__0__Impl : ( ( rule__FactComposite__Alternatives_0_0 ) ) ;
    public final void rule__FactComposite__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1728:1: ( ( ( rule__FactComposite__Alternatives_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1729:1: ( ( rule__FactComposite__Alternatives_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1729:1: ( ( rule__FactComposite__Alternatives_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1730:1: ( rule__FactComposite__Alternatives_0_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getAlternatives_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1731:1: ( rule__FactComposite__Alternatives_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1731:2: rule__FactComposite__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__FactComposite__Alternatives_0_0_in_rule__FactComposite__Group_0__0__Impl3680);
            rule__FactComposite__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getAlternatives_0_0()); 

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
    // $ANTLR end "rule__FactComposite__Group_0__0__Impl"


    // $ANTLR start "rule__FactComposite__Group_0__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1741:1: rule__FactComposite__Group_0__1 : rule__FactComposite__Group_0__1__Impl ;
    public final void rule__FactComposite__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1745:1: ( rule__FactComposite__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1746:2: rule__FactComposite__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0__1__Impl_in_rule__FactComposite__Group_0__13710);
            rule__FactComposite__Group_0__1__Impl();

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
    // $ANTLR end "rule__FactComposite__Group_0__1"


    // $ANTLR start "rule__FactComposite__Group_0__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1752:1: rule__FactComposite__Group_0__1__Impl : ( ( rule__FactComposite__Group_0_1__0 )? ) ;
    public final void rule__FactComposite__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1756:1: ( ( ( rule__FactComposite__Group_0_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1757:1: ( ( rule__FactComposite__Group_0_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1757:1: ( ( rule__FactComposite__Group_0_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1758:1: ( rule__FactComposite__Group_0_1__0 )?
            {
             before(grammarAccess.getFactCompositeAccess().getGroup_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1759:1: ( rule__FactComposite__Group_0_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_21||LA18_0==KEYWORD_20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1759:2: rule__FactComposite__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_0_1__0_in_rule__FactComposite__Group_0__1__Impl3737);
                    rule__FactComposite__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactCompositeAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__FactComposite__Group_0__1__Impl"


    // $ANTLR start "rule__FactComposite__Group_0_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1773:1: rule__FactComposite__Group_0_1__0 : rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1 ;
    public final void rule__FactComposite__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1777:1: ( rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1778:2: rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__0__Impl_in_rule__FactComposite__Group_0_1__03772);
            rule__FactComposite__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__1_in_rule__FactComposite__Group_0_1__03775);
            rule__FactComposite__Group_0_1__1();

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
    // $ANTLR end "rule__FactComposite__Group_0_1__0"


    // $ANTLR start "rule__FactComposite__Group_0_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1785:1: rule__FactComposite__Group_0_1__0__Impl : ( ( rule__FactComposite__OpAssignment_0_1_0 ) ) ;
    public final void rule__FactComposite__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1789:1: ( ( ( rule__FactComposite__OpAssignment_0_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1790:1: ( ( rule__FactComposite__OpAssignment_0_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1790:1: ( ( rule__FactComposite__OpAssignment_0_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1791:1: ( rule__FactComposite__OpAssignment_0_1_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getOpAssignment_0_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1792:1: ( rule__FactComposite__OpAssignment_0_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1792:2: rule__FactComposite__OpAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__FactComposite__OpAssignment_0_1_0_in_rule__FactComposite__Group_0_1__0__Impl3802);
            rule__FactComposite__OpAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getOpAssignment_0_1_0()); 

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
    // $ANTLR end "rule__FactComposite__Group_0_1__0__Impl"


    // $ANTLR start "rule__FactComposite__Group_0_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1802:1: rule__FactComposite__Group_0_1__1 : rule__FactComposite__Group_0_1__1__Impl ;
    public final void rule__FactComposite__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1806:1: ( rule__FactComposite__Group_0_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1807:2: rule__FactComposite__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__1__Impl_in_rule__FactComposite__Group_0_1__13832);
            rule__FactComposite__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__FactComposite__Group_0_1__1"


    // $ANTLR start "rule__FactComposite__Group_0_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1813:1: rule__FactComposite__Group_0_1__1__Impl : ( ( rule__FactComposite__FcAssignment_0_1_1 ) ) ;
    public final void rule__FactComposite__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1817:1: ( ( ( rule__FactComposite__FcAssignment_0_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1818:1: ( ( rule__FactComposite__FcAssignment_0_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1818:1: ( ( rule__FactComposite__FcAssignment_0_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1819:1: ( rule__FactComposite__FcAssignment_0_1_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFcAssignment_0_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1820:1: ( rule__FactComposite__FcAssignment_0_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1820:2: rule__FactComposite__FcAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FactComposite__FcAssignment_0_1_1_in_rule__FactComposite__Group_0_1__1__Impl3859);
            rule__FactComposite__FcAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getFcAssignment_0_1_1()); 

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
    // $ANTLR end "rule__FactComposite__Group_0_1__1__Impl"


    // $ANTLR start "rule__FactComposite__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1834:1: rule__FactComposite__Group_1__0 : rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1 ;
    public final void rule__FactComposite__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1838:1: ( rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1839:2: rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__0__Impl_in_rule__FactComposite__Group_1__03893);
            rule__FactComposite__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__1_in_rule__FactComposite__Group_1__03896);
            rule__FactComposite__Group_1__1();

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
    // $ANTLR end "rule__FactComposite__Group_1__0"


    // $ANTLR start "rule__FactComposite__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1846:1: rule__FactComposite__Group_1__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__FactComposite__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1850:1: ( ( KEYWORD_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1851:1: ( KEYWORD_2 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1851:1: ( KEYWORD_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1852:1: KEYWORD_2
            {
             before(grammarAccess.getFactCompositeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__FactComposite__Group_1__0__Impl3924); 
             after(grammarAccess.getFactCompositeAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__FactComposite__Group_1__0__Impl"


    // $ANTLR start "rule__FactComposite__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1865:1: rule__FactComposite__Group_1__1 : rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2 ;
    public final void rule__FactComposite__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1869:1: ( rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1870:2: rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__1__Impl_in_rule__FactComposite__Group_1__13955);
            rule__FactComposite__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__2_in_rule__FactComposite__Group_1__13958);
            rule__FactComposite__Group_1__2();

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
    // $ANTLR end "rule__FactComposite__Group_1__1"


    // $ANTLR start "rule__FactComposite__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1877:1: rule__FactComposite__Group_1__1__Impl : ( ( rule__FactComposite__Fc1Assignment_1_1 ) ) ;
    public final void rule__FactComposite__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1881:1: ( ( ( rule__FactComposite__Fc1Assignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1882:1: ( ( rule__FactComposite__Fc1Assignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1882:1: ( ( rule__FactComposite__Fc1Assignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1883:1: ( rule__FactComposite__Fc1Assignment_1_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFc1Assignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1884:1: ( rule__FactComposite__Fc1Assignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1884:2: rule__FactComposite__Fc1Assignment_1_1
            {
            pushFollow(FOLLOW_rule__FactComposite__Fc1Assignment_1_1_in_rule__FactComposite__Group_1__1__Impl3985);
            rule__FactComposite__Fc1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getFc1Assignment_1_1()); 

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
    // $ANTLR end "rule__FactComposite__Group_1__1__Impl"


    // $ANTLR start "rule__FactComposite__Group_1__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1894:1: rule__FactComposite__Group_1__2 : rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3 ;
    public final void rule__FactComposite__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1898:1: ( rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1899:2: rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__2__Impl_in_rule__FactComposite__Group_1__24015);
            rule__FactComposite__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__3_in_rule__FactComposite__Group_1__24018);
            rule__FactComposite__Group_1__3();

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
    // $ANTLR end "rule__FactComposite__Group_1__2"


    // $ANTLR start "rule__FactComposite__Group_1__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1906:1: rule__FactComposite__Group_1__2__Impl : ( KEYWORD_3 ) ;
    public final void rule__FactComposite__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1910:1: ( ( KEYWORD_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1911:1: ( KEYWORD_3 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1911:1: ( KEYWORD_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1912:1: KEYWORD_3
            {
             before(grammarAccess.getFactCompositeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__FactComposite__Group_1__2__Impl4046); 
             after(grammarAccess.getFactCompositeAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__FactComposite__Group_1__2__Impl"


    // $ANTLR start "rule__FactComposite__Group_1__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1925:1: rule__FactComposite__Group_1__3 : rule__FactComposite__Group_1__3__Impl ;
    public final void rule__FactComposite__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1929:1: ( rule__FactComposite__Group_1__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1930:2: rule__FactComposite__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__3__Impl_in_rule__FactComposite__Group_1__34077);
            rule__FactComposite__Group_1__3__Impl();

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
    // $ANTLR end "rule__FactComposite__Group_1__3"


    // $ANTLR start "rule__FactComposite__Group_1__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1936:1: rule__FactComposite__Group_1__3__Impl : ( ( rule__FactComposite__Group_1_3__0 )? ) ;
    public final void rule__FactComposite__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1940:1: ( ( ( rule__FactComposite__Group_1_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1941:1: ( ( rule__FactComposite__Group_1_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1941:1: ( ( rule__FactComposite__Group_1_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1942:1: ( rule__FactComposite__Group_1_3__0 )?
            {
             before(grammarAccess.getFactCompositeAccess().getGroup_1_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1943:1: ( rule__FactComposite__Group_1_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_21||LA19_0==KEYWORD_20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1943:2: rule__FactComposite__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_1_3__0_in_rule__FactComposite__Group_1__3__Impl4104);
                    rule__FactComposite__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactCompositeAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__FactComposite__Group_1__3__Impl"


    // $ANTLR start "rule__FactComposite__Group_1_3__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1961:1: rule__FactComposite__Group_1_3__0 : rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1 ;
    public final void rule__FactComposite__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1965:1: ( rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1966:2: rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__0__Impl_in_rule__FactComposite__Group_1_3__04143);
            rule__FactComposite__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__1_in_rule__FactComposite__Group_1_3__04146);
            rule__FactComposite__Group_1_3__1();

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
    // $ANTLR end "rule__FactComposite__Group_1_3__0"


    // $ANTLR start "rule__FactComposite__Group_1_3__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1973:1: rule__FactComposite__Group_1_3__0__Impl : ( ( rule__FactComposite__OpAssignment_1_3_0 ) ) ;
    public final void rule__FactComposite__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1977:1: ( ( ( rule__FactComposite__OpAssignment_1_3_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1978:1: ( ( rule__FactComposite__OpAssignment_1_3_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1978:1: ( ( rule__FactComposite__OpAssignment_1_3_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1979:1: ( rule__FactComposite__OpAssignment_1_3_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getOpAssignment_1_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1980:1: ( rule__FactComposite__OpAssignment_1_3_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1980:2: rule__FactComposite__OpAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__FactComposite__OpAssignment_1_3_0_in_rule__FactComposite__Group_1_3__0__Impl4173);
            rule__FactComposite__OpAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getOpAssignment_1_3_0()); 

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
    // $ANTLR end "rule__FactComposite__Group_1_3__0__Impl"


    // $ANTLR start "rule__FactComposite__Group_1_3__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1990:1: rule__FactComposite__Group_1_3__1 : rule__FactComposite__Group_1_3__1__Impl ;
    public final void rule__FactComposite__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1994:1: ( rule__FactComposite__Group_1_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:1995:2: rule__FactComposite__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__1__Impl_in_rule__FactComposite__Group_1_3__14203);
            rule__FactComposite__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__FactComposite__Group_1_3__1"


    // $ANTLR start "rule__FactComposite__Group_1_3__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2001:1: rule__FactComposite__Group_1_3__1__Impl : ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) ) ;
    public final void rule__FactComposite__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2005:1: ( ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2006:1: ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2006:1: ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2007:1: ( rule__FactComposite__Fc2Assignment_1_3_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFc2Assignment_1_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2008:1: ( rule__FactComposite__Fc2Assignment_1_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2008:2: rule__FactComposite__Fc2Assignment_1_3_1
            {
            pushFollow(FOLLOW_rule__FactComposite__Fc2Assignment_1_3_1_in_rule__FactComposite__Group_1_3__1__Impl4230);
            rule__FactComposite__Fc2Assignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFactCompositeAccess().getFc2Assignment_1_3_1()); 

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
    // $ANTLR end "rule__FactComposite__Group_1_3__1__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2022:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2026:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2027:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__04264);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__04267);
            rule__Fact__Group__1();

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
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2034:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__TermCompositeAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2038:1: ( ( ( rule__Fact__TermCompositeAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2039:1: ( ( rule__Fact__TermCompositeAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2039:1: ( ( rule__Fact__TermCompositeAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2040:1: ( rule__Fact__TermCompositeAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getTermCompositeAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2041:1: ( rule__Fact__TermCompositeAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2041:2: rule__Fact__TermCompositeAssignment_0
            {
            pushFollow(FOLLOW_rule__Fact__TermCompositeAssignment_0_in_rule__Fact__Group__0__Impl4294);
            rule__Fact__TermCompositeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getTermCompositeAssignment_0()); 

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
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2051:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2055:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2056:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__14324);
            rule__Fact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__14327);
            rule__Fact__Group__2();

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
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2063:1: rule__Fact__Group__1__Impl : ( ( rule__Fact__ComplementAssignment_1 ) ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2067:1: ( ( ( rule__Fact__ComplementAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2068:1: ( ( rule__Fact__ComplementAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2068:1: ( ( rule__Fact__ComplementAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2069:1: ( rule__Fact__ComplementAssignment_1 )
            {
             before(grammarAccess.getFactAccess().getComplementAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2070:1: ( rule__Fact__ComplementAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2070:2: rule__Fact__ComplementAssignment_1
            {
            pushFollow(FOLLOW_rule__Fact__ComplementAssignment_1_in_rule__Fact__Group__1__Impl4354);
            rule__Fact__ComplementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getComplementAssignment_1()); 

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
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2080:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2084:1: ( rule__Fact__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2085:2: rule__Fact__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__24384);
            rule__Fact__Group__2__Impl();

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
    // $ANTLR end "rule__Fact__Group__2"


    // $ANTLR start "rule__Fact__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2091:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )? ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2095:1: ( ( ( rule__Fact__Group_2__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2096:1: ( ( rule__Fact__Group_2__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2096:1: ( ( rule__Fact__Group_2__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2097:1: ( rule__Fact__Group_2__0 )?
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2098:1: ( rule__Fact__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=KEYWORD_31 && LA20_0<=KEYWORD_29)||LA20_0==KEYWORD_26||LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2098:2: rule__Fact__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl4411);
                    rule__Fact__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Fact__Group__2__Impl"


    // $ANTLR start "rule__Fact__Group_2__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2114:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2118:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2119:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__04448);
            rule__Fact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__04451);
            rule__Fact__Group_2__1();

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
    // $ANTLR end "rule__Fact__Group_2__0"


    // $ANTLR start "rule__Fact__Group_2__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2126:1: rule__Fact__Group_2__0__Impl : ( ( rule__Fact__TermComposite2Assignment_2_0 ) ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2130:1: ( ( ( rule__Fact__TermComposite2Assignment_2_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2131:1: ( ( rule__Fact__TermComposite2Assignment_2_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2131:1: ( ( rule__Fact__TermComposite2Assignment_2_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2132:1: ( rule__Fact__TermComposite2Assignment_2_0 )
            {
             before(grammarAccess.getFactAccess().getTermComposite2Assignment_2_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2133:1: ( rule__Fact__TermComposite2Assignment_2_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2133:2: rule__Fact__TermComposite2Assignment_2_0
            {
            pushFollow(FOLLOW_rule__Fact__TermComposite2Assignment_2_0_in_rule__Fact__Group_2__0__Impl4478);
            rule__Fact__TermComposite2Assignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getTermComposite2Assignment_2_0()); 

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
    // $ANTLR end "rule__Fact__Group_2__0__Impl"


    // $ANTLR start "rule__Fact__Group_2__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2143:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2147:1: ( rule__Fact__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2148:2: rule__Fact__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__14508);
            rule__Fact__Group_2__1__Impl();

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
    // $ANTLR end "rule__Fact__Group_2__1"


    // $ANTLR start "rule__Fact__Group_2__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2154:1: rule__Fact__Group_2__1__Impl : ( ( rule__Fact__FactExtAssignment_2_1 )? ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2158:1: ( ( ( rule__Fact__FactExtAssignment_2_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2159:1: ( ( rule__Fact__FactExtAssignment_2_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2159:1: ( ( rule__Fact__FactExtAssignment_2_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2160:1: ( rule__Fact__FactExtAssignment_2_1 )?
            {
             before(grammarAccess.getFactAccess().getFactExtAssignment_2_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2161:1: ( rule__Fact__FactExtAssignment_2_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2161:2: rule__Fact__FactExtAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Fact__FactExtAssignment_2_1_in_rule__Fact__Group_2__1__Impl4535);
                    rule__Fact__FactExtAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactAccess().getFactExtAssignment_2_1()); 

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
    // $ANTLR end "rule__Fact__Group_2__1__Impl"


    // $ANTLR start "rule__FactExt__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2175:1: rule__FactExt__Group__0 : rule__FactExt__Group__0__Impl rule__FactExt__Group__1 ;
    public final void rule__FactExt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2179:1: ( rule__FactExt__Group__0__Impl rule__FactExt__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2180:2: rule__FactExt__Group__0__Impl rule__FactExt__Group__1
            {
            pushFollow(FOLLOW_rule__FactExt__Group__0__Impl_in_rule__FactExt__Group__04570);
            rule__FactExt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactExt__Group__1_in_rule__FactExt__Group__04573);
            rule__FactExt__Group__1();

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
    // $ANTLR end "rule__FactExt__Group__0"


    // $ANTLR start "rule__FactExt__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2187:1: rule__FactExt__Group__0__Impl : ( ( rule__FactExt__ComplementAssignment_0 ) ) ;
    public final void rule__FactExt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2191:1: ( ( ( rule__FactExt__ComplementAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2192:1: ( ( rule__FactExt__ComplementAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2192:1: ( ( rule__FactExt__ComplementAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2193:1: ( rule__FactExt__ComplementAssignment_0 )
            {
             before(grammarAccess.getFactExtAccess().getComplementAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2194:1: ( rule__FactExt__ComplementAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2194:2: rule__FactExt__ComplementAssignment_0
            {
            pushFollow(FOLLOW_rule__FactExt__ComplementAssignment_0_in_rule__FactExt__Group__0__Impl4600);
            rule__FactExt__ComplementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFactExtAccess().getComplementAssignment_0()); 

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
    // $ANTLR end "rule__FactExt__Group__0__Impl"


    // $ANTLR start "rule__FactExt__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2204:1: rule__FactExt__Group__1 : rule__FactExt__Group__1__Impl ;
    public final void rule__FactExt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2208:1: ( rule__FactExt__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2209:2: rule__FactExt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FactExt__Group__1__Impl_in_rule__FactExt__Group__14630);
            rule__FactExt__Group__1__Impl();

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
    // $ANTLR end "rule__FactExt__Group__1"


    // $ANTLR start "rule__FactExt__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2215:1: rule__FactExt__Group__1__Impl : ( ( rule__FactExt__Group_1__0 )? ) ;
    public final void rule__FactExt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2219:1: ( ( ( rule__FactExt__Group_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2220:1: ( ( rule__FactExt__Group_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2220:1: ( ( rule__FactExt__Group_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2221:1: ( rule__FactExt__Group_1__0 )?
            {
             before(grammarAccess.getFactExtAccess().getGroup_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2222:1: ( rule__FactExt__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=KEYWORD_31 && LA22_0<=KEYWORD_29)||LA22_0==KEYWORD_26||LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2222:2: rule__FactExt__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactExt__Group_1__0_in_rule__FactExt__Group__1__Impl4657);
                    rule__FactExt__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactExtAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FactExt__Group__1__Impl"


    // $ANTLR start "rule__FactExt__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2236:1: rule__FactExt__Group_1__0 : rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1 ;
    public final void rule__FactExt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2240:1: ( rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2241:2: rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactExt__Group_1__0__Impl_in_rule__FactExt__Group_1__04692);
            rule__FactExt__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactExt__Group_1__1_in_rule__FactExt__Group_1__04695);
            rule__FactExt__Group_1__1();

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
    // $ANTLR end "rule__FactExt__Group_1__0"


    // $ANTLR start "rule__FactExt__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2248:1: rule__FactExt__Group_1__0__Impl : ( ( rule__FactExt__TermCompositeAssignment_1_0 ) ) ;
    public final void rule__FactExt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2252:1: ( ( ( rule__FactExt__TermCompositeAssignment_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2253:1: ( ( rule__FactExt__TermCompositeAssignment_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2253:1: ( ( rule__FactExt__TermCompositeAssignment_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2254:1: ( rule__FactExt__TermCompositeAssignment_1_0 )
            {
             before(grammarAccess.getFactExtAccess().getTermCompositeAssignment_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2255:1: ( rule__FactExt__TermCompositeAssignment_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2255:2: rule__FactExt__TermCompositeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__FactExt__TermCompositeAssignment_1_0_in_rule__FactExt__Group_1__0__Impl4722);
            rule__FactExt__TermCompositeAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactExtAccess().getTermCompositeAssignment_1_0()); 

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
    // $ANTLR end "rule__FactExt__Group_1__0__Impl"


    // $ANTLR start "rule__FactExt__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2265:1: rule__FactExt__Group_1__1 : rule__FactExt__Group_1__1__Impl ;
    public final void rule__FactExt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2269:1: ( rule__FactExt__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2270:2: rule__FactExt__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FactExt__Group_1__1__Impl_in_rule__FactExt__Group_1__14752);
            rule__FactExt__Group_1__1__Impl();

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
    // $ANTLR end "rule__FactExt__Group_1__1"


    // $ANTLR start "rule__FactExt__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2276:1: rule__FactExt__Group_1__1__Impl : ( ( rule__FactExt__FactExtAssignment_1_1 )? ) ;
    public final void rule__FactExt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2280:1: ( ( ( rule__FactExt__FactExtAssignment_1_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2281:1: ( ( rule__FactExt__FactExtAssignment_1_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2281:1: ( ( rule__FactExt__FactExtAssignment_1_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2282:1: ( rule__FactExt__FactExtAssignment_1_1 )?
            {
             before(grammarAccess.getFactExtAccess().getFactExtAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2283:1: ( rule__FactExt__FactExtAssignment_1_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2283:2: rule__FactExt__FactExtAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__FactExt__FactExtAssignment_1_1_in_rule__FactExt__Group_1__1__Impl4779);
                    rule__FactExt__FactExtAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFactExtAccess().getFactExtAssignment_1_1()); 

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
    // $ANTLR end "rule__FactExt__Group_1__1__Impl"


    // $ANTLR start "rule__TermComposite__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2297:1: rule__TermComposite__Group__0 : rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1 ;
    public final void rule__TermComposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2301:1: ( rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2302:2: rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__0__Impl_in_rule__TermComposite__Group__04814);
            rule__TermComposite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermComposite__Group__1_in_rule__TermComposite__Group__04817);
            rule__TermComposite__Group__1();

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
    // $ANTLR end "rule__TermComposite__Group__0"


    // $ANTLR start "rule__TermComposite__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2309:1: rule__TermComposite__Group__0__Impl : ( ( rule__TermComposite__QuantifierAssignment_0 )? ) ;
    public final void rule__TermComposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2313:1: ( ( ( rule__TermComposite__QuantifierAssignment_0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2314:1: ( ( rule__TermComposite__QuantifierAssignment_0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2314:1: ( ( rule__TermComposite__QuantifierAssignment_0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2315:1: ( rule__TermComposite__QuantifierAssignment_0 )?
            {
             before(grammarAccess.getTermCompositeAccess().getQuantifierAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2316:1: ( rule__TermComposite__QuantifierAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=KEYWORD_31 && LA24_0<=KEYWORD_29)||LA24_0==KEYWORD_26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2316:2: rule__TermComposite__QuantifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TermComposite__QuantifierAssignment_0_in_rule__TermComposite__Group__0__Impl4844);
                    rule__TermComposite__QuantifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermCompositeAccess().getQuantifierAssignment_0()); 

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
    // $ANTLR end "rule__TermComposite__Group__0__Impl"


    // $ANTLR start "rule__TermComposite__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2326:1: rule__TermComposite__Group__1 : rule__TermComposite__Group__1__Impl ;
    public final void rule__TermComposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2330:1: ( rule__TermComposite__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2331:2: rule__TermComposite__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__1__Impl_in_rule__TermComposite__Group__14875);
            rule__TermComposite__Group__1__Impl();

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
    // $ANTLR end "rule__TermComposite__Group__1"


    // $ANTLR start "rule__TermComposite__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2337:1: rule__TermComposite__Group__1__Impl : ( ( rule__TermComposite__Alternatives_1 ) ) ;
    public final void rule__TermComposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2341:1: ( ( ( rule__TermComposite__Alternatives_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2342:1: ( ( rule__TermComposite__Alternatives_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2342:1: ( ( rule__TermComposite__Alternatives_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2343:1: ( rule__TermComposite__Alternatives_1 )
            {
             before(grammarAccess.getTermCompositeAccess().getAlternatives_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2344:1: ( rule__TermComposite__Alternatives_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2344:2: rule__TermComposite__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TermComposite__Alternatives_1_in_rule__TermComposite__Group__1__Impl4902);
            rule__TermComposite__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTermCompositeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TermComposite__Group__1__Impl"


    // $ANTLR start "rule__TermInstance__Group_0__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2358:1: rule__TermInstance__Group_0__0 : rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1 ;
    public final void rule__TermInstance__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2362:1: ( rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2363:2: rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__0__Impl_in_rule__TermInstance__Group_0__04936);
            rule__TermInstance__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_0__1_in_rule__TermInstance__Group_0__04939);
            rule__TermInstance__Group_0__1();

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
    // $ANTLR end "rule__TermInstance__Group_0__0"


    // $ANTLR start "rule__TermInstance__Group_0__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2370:1: rule__TermInstance__Group_0__0__Impl : ( ( rule__TermInstance__TermAssignment_0_0 ) ) ;
    public final void rule__TermInstance__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2374:1: ( ( ( rule__TermInstance__TermAssignment_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2375:1: ( ( rule__TermInstance__TermAssignment_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2375:1: ( ( rule__TermInstance__TermAssignment_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2376:1: ( rule__TermInstance__TermAssignment_0_0 )
            {
             before(grammarAccess.getTermInstanceAccess().getTermAssignment_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2377:1: ( rule__TermInstance__TermAssignment_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2377:2: rule__TermInstance__TermAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TermInstance__TermAssignment_0_0_in_rule__TermInstance__Group_0__0__Impl4966);
            rule__TermInstance__TermAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTermInstanceAccess().getTermAssignment_0_0()); 

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
    // $ANTLR end "rule__TermInstance__Group_0__0__Impl"


    // $ANTLR start "rule__TermInstance__Group_0__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2387:1: rule__TermInstance__Group_0__1 : rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2 ;
    public final void rule__TermInstance__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2391:1: ( rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2392:2: rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__1__Impl_in_rule__TermInstance__Group_0__14996);
            rule__TermInstance__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_0__2_in_rule__TermInstance__Group_0__14999);
            rule__TermInstance__Group_0__2();

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
    // $ANTLR end "rule__TermInstance__Group_0__1"


    // $ANTLR start "rule__TermInstance__Group_0__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2399:1: rule__TermInstance__Group_0__1__Impl : ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? ) ;
    public final void rule__TermInstance__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2403:1: ( ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2404:1: ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2404:1: ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2405:1: ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )?
            {
             before(grammarAccess.getTermInstanceAccess().getNotEqualOperatorAssignment_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2406:1: ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2406:2: rule__TermInstance__NotEqualOperatorAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__TermInstance__NotEqualOperatorAssignment_0_1_in_rule__TermInstance__Group_0__1__Impl5026);
                    rule__TermInstance__NotEqualOperatorAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermInstanceAccess().getNotEqualOperatorAssignment_0_1()); 

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
    // $ANTLR end "rule__TermInstance__Group_0__1__Impl"


    // $ANTLR start "rule__TermInstance__Group_0__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2416:1: rule__TermInstance__Group_0__2 : rule__TermInstance__Group_0__2__Impl ;
    public final void rule__TermInstance__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2420:1: ( rule__TermInstance__Group_0__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2421:2: rule__TermInstance__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__2__Impl_in_rule__TermInstance__Group_0__25057);
            rule__TermInstance__Group_0__2__Impl();

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
    // $ANTLR end "rule__TermInstance__Group_0__2"


    // $ANTLR start "rule__TermInstance__Group_0__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2427:1: rule__TermInstance__Group_0__2__Impl : ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) ) ;
    public final void rule__TermInstance__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2431:1: ( ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2432:1: ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2432:1: ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2433:1: ( rule__TermInstance__StringLiteralAssignment_0_2 )
            {
             before(grammarAccess.getTermInstanceAccess().getStringLiteralAssignment_0_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2434:1: ( rule__TermInstance__StringLiteralAssignment_0_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2434:2: rule__TermInstance__StringLiteralAssignment_0_2
            {
            pushFollow(FOLLOW_rule__TermInstance__StringLiteralAssignment_0_2_in_rule__TermInstance__Group_0__2__Impl5084);
            rule__TermInstance__StringLiteralAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTermInstanceAccess().getStringLiteralAssignment_0_2()); 

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
    // $ANTLR end "rule__TermInstance__Group_0__2__Impl"


    // $ANTLR start "rule__TermInstance__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2450:1: rule__TermInstance__Group_1__0 : rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1 ;
    public final void rule__TermInstance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2454:1: ( rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2455:2: rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__0__Impl_in_rule__TermInstance__Group_1__05120);
            rule__TermInstance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_1__1_in_rule__TermInstance__Group_1__05123);
            rule__TermInstance__Group_1__1();

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
    // $ANTLR end "rule__TermInstance__Group_1__0"


    // $ANTLR start "rule__TermInstance__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2462:1: rule__TermInstance__Group_1__0__Impl : ( ( rule__TermInstance__TermAssignment_1_0 ) ) ;
    public final void rule__TermInstance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2466:1: ( ( ( rule__TermInstance__TermAssignment_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2467:1: ( ( rule__TermInstance__TermAssignment_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2467:1: ( ( rule__TermInstance__TermAssignment_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2468:1: ( rule__TermInstance__TermAssignment_1_0 )
            {
             before(grammarAccess.getTermInstanceAccess().getTermAssignment_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2469:1: ( rule__TermInstance__TermAssignment_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2469:2: rule__TermInstance__TermAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TermInstance__TermAssignment_1_0_in_rule__TermInstance__Group_1__0__Impl5150);
            rule__TermInstance__TermAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermInstanceAccess().getTermAssignment_1_0()); 

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
    // $ANTLR end "rule__TermInstance__Group_1__0__Impl"


    // $ANTLR start "rule__TermInstance__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2479:1: rule__TermInstance__Group_1__1 : rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2 ;
    public final void rule__TermInstance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2483:1: ( rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2484:2: rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__1__Impl_in_rule__TermInstance__Group_1__15180);
            rule__TermInstance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_1__2_in_rule__TermInstance__Group_1__15183);
            rule__TermInstance__Group_1__2();

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
    // $ANTLR end "rule__TermInstance__Group_1__1"


    // $ANTLR start "rule__TermInstance__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2491:1: rule__TermInstance__Group_1__1__Impl : ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? ) ;
    public final void rule__TermInstance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2495:1: ( ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2496:1: ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2496:1: ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2497:1: ( rule__TermInstance__RelationalOperatorAssignment_1_1 )?
            {
             before(grammarAccess.getTermInstanceAccess().getRelationalOperatorAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2498:1: ( rule__TermInstance__RelationalOperatorAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_16||(LA26_0>=KEYWORD_18 && LA26_0<=KEYWORD_19)||LA26_0==KEYWORD_10||LA26_0==KEYWORD_12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2498:2: rule__TermInstance__RelationalOperatorAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TermInstance__RelationalOperatorAssignment_1_1_in_rule__TermInstance__Group_1__1__Impl5210);
                    rule__TermInstance__RelationalOperatorAssignment_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermInstanceAccess().getRelationalOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__TermInstance__Group_1__1__Impl"


    // $ANTLR start "rule__TermInstance__Group_1__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2508:1: rule__TermInstance__Group_1__2 : rule__TermInstance__Group_1__2__Impl ;
    public final void rule__TermInstance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2512:1: ( rule__TermInstance__Group_1__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2513:2: rule__TermInstance__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__2__Impl_in_rule__TermInstance__Group_1__25241);
            rule__TermInstance__Group_1__2__Impl();

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
    // $ANTLR end "rule__TermInstance__Group_1__2"


    // $ANTLR start "rule__TermInstance__Group_1__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2519:1: rule__TermInstance__Group_1__2__Impl : ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) ) ;
    public final void rule__TermInstance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2523:1: ( ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2524:1: ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2524:1: ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2525:1: ( rule__TermInstance__OtherLiteralAssignment_1_2 )
            {
             before(grammarAccess.getTermInstanceAccess().getOtherLiteralAssignment_1_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2526:1: ( rule__TermInstance__OtherLiteralAssignment_1_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2526:2: rule__TermInstance__OtherLiteralAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TermInstance__OtherLiteralAssignment_1_2_in_rule__TermInstance__Group_1__2__Impl5268);
            rule__TermInstance__OtherLiteralAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTermInstanceAccess().getOtherLiteralAssignment_1_2()); 

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
    // $ANTLR end "rule__TermInstance__Group_1__2__Impl"


    // $ANTLR start "rule__TermWithAssociation__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2542:1: rule__TermWithAssociation__Group__0 : rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1 ;
    public final void rule__TermWithAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2546:1: ( rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2547:2: rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__0__Impl_in_rule__TermWithAssociation__Group__05304);
            rule__TermWithAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__1_in_rule__TermWithAssociation__Group__05307);
            rule__TermWithAssociation__Group__1();

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
    // $ANTLR end "rule__TermWithAssociation__Group__0"


    // $ANTLR start "rule__TermWithAssociation__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2554:1: rule__TermWithAssociation__Group__0__Impl : ( ( rule__TermWithAssociation__TAssignment_0 ) ) ;
    public final void rule__TermWithAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2558:1: ( ( ( rule__TermWithAssociation__TAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2559:1: ( ( rule__TermWithAssociation__TAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2559:1: ( ( rule__TermWithAssociation__TAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2560:1: ( rule__TermWithAssociation__TAssignment_0 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getTAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2561:1: ( rule__TermWithAssociation__TAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2561:2: rule__TermWithAssociation__TAssignment_0
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__TAssignment_0_in_rule__TermWithAssociation__Group__0__Impl5334);
            rule__TermWithAssociation__TAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermWithAssociationAccess().getTAssignment_0()); 

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
    // $ANTLR end "rule__TermWithAssociation__Group__0__Impl"


    // $ANTLR start "rule__TermWithAssociation__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2571:1: rule__TermWithAssociation__Group__1 : rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2 ;
    public final void rule__TermWithAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2575:1: ( rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2576:2: rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__1__Impl_in_rule__TermWithAssociation__Group__15364);
            rule__TermWithAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__2_in_rule__TermWithAssociation__Group__15367);
            rule__TermWithAssociation__Group__2();

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
    // $ANTLR end "rule__TermWithAssociation__Group__1"


    // $ANTLR start "rule__TermWithAssociation__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2583:1: rule__TermWithAssociation__Group__1__Impl : ( ( rule__TermWithAssociation__RoAssignment_1 )? ) ;
    public final void rule__TermWithAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2587:1: ( ( ( rule__TermWithAssociation__RoAssignment_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2588:1: ( ( rule__TermWithAssociation__RoAssignment_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2588:1: ( ( rule__TermWithAssociation__RoAssignment_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2589:1: ( rule__TermWithAssociation__RoAssignment_1 )?
            {
             before(grammarAccess.getTermWithAssociationAccess().getRoAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2590:1: ( rule__TermWithAssociation__RoAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_16||(LA27_0>=KEYWORD_18 && LA27_0<=KEYWORD_19)||LA27_0==KEYWORD_10||LA27_0==KEYWORD_12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2590:2: rule__TermWithAssociation__RoAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TermWithAssociation__RoAssignment_1_in_rule__TermWithAssociation__Group__1__Impl5394);
                    rule__TermWithAssociation__RoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermWithAssociationAccess().getRoAssignment_1()); 

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
    // $ANTLR end "rule__TermWithAssociation__Group__1__Impl"


    // $ANTLR start "rule__TermWithAssociation__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2600:1: rule__TermWithAssociation__Group__2 : rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3 ;
    public final void rule__TermWithAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2604:1: ( rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2605:2: rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__2__Impl_in_rule__TermWithAssociation__Group__25425);
            rule__TermWithAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__3_in_rule__TermWithAssociation__Group__25428);
            rule__TermWithAssociation__Group__3();

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
    // $ANTLR end "rule__TermWithAssociation__Group__2"


    // $ANTLR start "rule__TermWithAssociation__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2612:1: rule__TermWithAssociation__Group__2__Impl : ( KEYWORD_13 ) ;
    public final void rule__TermWithAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2616:1: ( ( KEYWORD_13 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2617:1: ( KEYWORD_13 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2617:1: ( KEYWORD_13 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2618:1: KEYWORD_13
            {
             before(grammarAccess.getTermWithAssociationAccess().getCommercialAtKeyword_2()); 
            match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__TermWithAssociation__Group__2__Impl5456); 
             after(grammarAccess.getTermWithAssociationAccess().getCommercialAtKeyword_2()); 

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
    // $ANTLR end "rule__TermWithAssociation__Group__2__Impl"


    // $ANTLR start "rule__TermWithAssociation__Group__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2631:1: rule__TermWithAssociation__Group__3 : rule__TermWithAssociation__Group__3__Impl ;
    public final void rule__TermWithAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2635:1: ( rule__TermWithAssociation__Group__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2636:2: rule__TermWithAssociation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__3__Impl_in_rule__TermWithAssociation__Group__35487);
            rule__TermWithAssociation__Group__3__Impl();

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
    // $ANTLR end "rule__TermWithAssociation__Group__3"


    // $ANTLR start "rule__TermWithAssociation__Group__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2642:1: rule__TermWithAssociation__Group__3__Impl : ( ( rule__TermWithAssociation__IndexAssignment_3 ) ) ;
    public final void rule__TermWithAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2646:1: ( ( ( rule__TermWithAssociation__IndexAssignment_3 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2647:1: ( ( rule__TermWithAssociation__IndexAssignment_3 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2647:1: ( ( rule__TermWithAssociation__IndexAssignment_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2648:1: ( rule__TermWithAssociation__IndexAssignment_3 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getIndexAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2649:1: ( rule__TermWithAssociation__IndexAssignment_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2649:2: rule__TermWithAssociation__IndexAssignment_3
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__IndexAssignment_3_in_rule__TermWithAssociation__Group__3__Impl5514);
            rule__TermWithAssociation__IndexAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTermWithAssociationAccess().getIndexAssignment_3()); 

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
    // $ANTLR end "rule__TermWithAssociation__Group__3__Impl"


    // $ANTLR start "rule__Quantifier__Group_0__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2667:1: rule__Quantifier__Group_0__0 : rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1 ;
    public final void rule__Quantifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2671:1: ( rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2672:2: rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_0__0__Impl_in_rule__Quantifier__Group_0__05552);
            rule__Quantifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_0__1_in_rule__Quantifier__Group_0__05555);
            rule__Quantifier__Group_0__1();

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
    // $ANTLR end "rule__Quantifier__Group_0__0"


    // $ANTLR start "rule__Quantifier__Group_0__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2679:1: rule__Quantifier__Group_0__0__Impl : ( KEYWORD_28 ) ;
    public final void rule__Quantifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2683:1: ( ( KEYWORD_28 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2684:1: ( KEYWORD_28 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2684:1: ( KEYWORD_28 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2685:1: KEYWORD_28
            {
             before(grammarAccess.getQuantifierAccess().getAtleastKeyword_0_0()); 
            match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__Quantifier__Group_0__0__Impl5583); 
             after(grammarAccess.getQuantifierAccess().getAtleastKeyword_0_0()); 

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
    // $ANTLR end "rule__Quantifier__Group_0__0__Impl"


    // $ANTLR start "rule__Quantifier__Group_0__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2698:1: rule__Quantifier__Group_0__1 : rule__Quantifier__Group_0__1__Impl ;
    public final void rule__Quantifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2702:1: ( rule__Quantifier__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2703:2: rule__Quantifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_0__1__Impl_in_rule__Quantifier__Group_0__15614);
            rule__Quantifier__Group_0__1__Impl();

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
    // $ANTLR end "rule__Quantifier__Group_0__1"


    // $ANTLR start "rule__Quantifier__Group_0__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2709:1: rule__Quantifier__Group_0__1__Impl : ( ( rule__Quantifier__VAssignment_0_1 ) ) ;
    public final void rule__Quantifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2713:1: ( ( ( rule__Quantifier__VAssignment_0_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2714:1: ( ( rule__Quantifier__VAssignment_0_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2714:1: ( ( rule__Quantifier__VAssignment_0_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2715:1: ( rule__Quantifier__VAssignment_0_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2716:1: ( rule__Quantifier__VAssignment_0_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2716:2: rule__Quantifier__VAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_0_1_in_rule__Quantifier__Group_0__1__Impl5641);
            rule__Quantifier__VAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getVAssignment_0_1()); 

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
    // $ANTLR end "rule__Quantifier__Group_0__1__Impl"


    // $ANTLR start "rule__Quantifier__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2730:1: rule__Quantifier__Group_1__0 : rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1 ;
    public final void rule__Quantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2734:1: ( rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2735:2: rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_1__0__Impl_in_rule__Quantifier__Group_1__05675);
            rule__Quantifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_1__1_in_rule__Quantifier__Group_1__05678);
            rule__Quantifier__Group_1__1();

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
    // $ANTLR end "rule__Quantifier__Group_1__0"


    // $ANTLR start "rule__Quantifier__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2742:1: rule__Quantifier__Group_1__0__Impl : ( KEYWORD_26 ) ;
    public final void rule__Quantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2746:1: ( ( KEYWORD_26 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2747:1: ( KEYWORD_26 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2747:1: ( KEYWORD_26 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2748:1: KEYWORD_26
            {
             before(grammarAccess.getQuantifierAccess().getAtmostKeyword_1_0()); 
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__Quantifier__Group_1__0__Impl5706); 
             after(grammarAccess.getQuantifierAccess().getAtmostKeyword_1_0()); 

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
    // $ANTLR end "rule__Quantifier__Group_1__0__Impl"


    // $ANTLR start "rule__Quantifier__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2761:1: rule__Quantifier__Group_1__1 : rule__Quantifier__Group_1__1__Impl ;
    public final void rule__Quantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2765:1: ( rule__Quantifier__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2766:2: rule__Quantifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_1__1__Impl_in_rule__Quantifier__Group_1__15737);
            rule__Quantifier__Group_1__1__Impl();

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
    // $ANTLR end "rule__Quantifier__Group_1__1"


    // $ANTLR start "rule__Quantifier__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2772:1: rule__Quantifier__Group_1__1__Impl : ( ( rule__Quantifier__VAssignment_1_1 ) ) ;
    public final void rule__Quantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2776:1: ( ( ( rule__Quantifier__VAssignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2777:1: ( ( rule__Quantifier__VAssignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2777:1: ( ( rule__Quantifier__VAssignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2778:1: ( rule__Quantifier__VAssignment_1_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2779:1: ( rule__Quantifier__VAssignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2779:2: rule__Quantifier__VAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_1_1_in_rule__Quantifier__Group_1__1__Impl5764);
            rule__Quantifier__VAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getVAssignment_1_1()); 

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
    // $ANTLR end "rule__Quantifier__Group_1__1__Impl"


    // $ANTLR start "rule__Quantifier__Group_2__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2793:1: rule__Quantifier__Group_2__0 : rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1 ;
    public final void rule__Quantifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2797:1: ( rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2798:2: rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_2__0__Impl_in_rule__Quantifier__Group_2__05798);
            rule__Quantifier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_2__1_in_rule__Quantifier__Group_2__05801);
            rule__Quantifier__Group_2__1();

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
    // $ANTLR end "rule__Quantifier__Group_2__0"


    // $ANTLR start "rule__Quantifier__Group_2__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2805:1: rule__Quantifier__Group_2__0__Impl : ( KEYWORD_29 ) ;
    public final void rule__Quantifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2809:1: ( ( KEYWORD_29 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2810:1: ( KEYWORD_29 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2810:1: ( KEYWORD_29 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2811:1: KEYWORD_29
            {
             before(grammarAccess.getQuantifierAccess().getExactlyKeyword_2_0()); 
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__Quantifier__Group_2__0__Impl5829); 
             after(grammarAccess.getQuantifierAccess().getExactlyKeyword_2_0()); 

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
    // $ANTLR end "rule__Quantifier__Group_2__0__Impl"


    // $ANTLR start "rule__Quantifier__Group_2__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2824:1: rule__Quantifier__Group_2__1 : rule__Quantifier__Group_2__1__Impl ;
    public final void rule__Quantifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2828:1: ( rule__Quantifier__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2829:2: rule__Quantifier__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_2__1__Impl_in_rule__Quantifier__Group_2__15860);
            rule__Quantifier__Group_2__1__Impl();

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
    // $ANTLR end "rule__Quantifier__Group_2__1"


    // $ANTLR start "rule__Quantifier__Group_2__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2835:1: rule__Quantifier__Group_2__1__Impl : ( ( rule__Quantifier__VAssignment_2_1 ) ) ;
    public final void rule__Quantifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2839:1: ( ( ( rule__Quantifier__VAssignment_2_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2840:1: ( ( rule__Quantifier__VAssignment_2_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2840:1: ( ( rule__Quantifier__VAssignment_2_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2841:1: ( rule__Quantifier__VAssignment_2_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_2_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2842:1: ( rule__Quantifier__VAssignment_2_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2842:2: rule__Quantifier__VAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_2_1_in_rule__Quantifier__Group_2__1__Impl5887);
            rule__Quantifier__VAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getVAssignment_2_1()); 

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
    // $ANTLR end "rule__Quantifier__Group_2__1__Impl"


    // $ANTLR start "rule__Quantifier__Group_3__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2856:1: rule__Quantifier__Group_3__0 : rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1 ;
    public final void rule__Quantifier__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2860:1: ( rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2861:2: rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__0__Impl_in_rule__Quantifier__Group_3__05921);
            rule__Quantifier__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_3__1_in_rule__Quantifier__Group_3__05924);
            rule__Quantifier__Group_3__1();

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
    // $ANTLR end "rule__Quantifier__Group_3__0"


    // $ANTLR start "rule__Quantifier__Group_3__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2868:1: rule__Quantifier__Group_3__0__Impl : ( KEYWORD_31 ) ;
    public final void rule__Quantifier__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2872:1: ( ( KEYWORD_31 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2873:1: ( KEYWORD_31 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2873:1: ( KEYWORD_31 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2874:1: KEYWORD_31
            {
             before(grammarAccess.getQuantifierAccess().getAtleastandatmostKeyword_3_0()); 
            match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__Quantifier__Group_3__0__Impl5952); 
             after(grammarAccess.getQuantifierAccess().getAtleastandatmostKeyword_3_0()); 

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
    // $ANTLR end "rule__Quantifier__Group_3__0__Impl"


    // $ANTLR start "rule__Quantifier__Group_3__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2887:1: rule__Quantifier__Group_3__1 : rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2 ;
    public final void rule__Quantifier__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2891:1: ( rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2892:2: rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__1__Impl_in_rule__Quantifier__Group_3__15983);
            rule__Quantifier__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_3__2_in_rule__Quantifier__Group_3__15986);
            rule__Quantifier__Group_3__2();

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
    // $ANTLR end "rule__Quantifier__Group_3__1"


    // $ANTLR start "rule__Quantifier__Group_3__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2899:1: rule__Quantifier__Group_3__1__Impl : ( ( rule__Quantifier__V1Assignment_3_1 ) ) ;
    public final void rule__Quantifier__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2903:1: ( ( ( rule__Quantifier__V1Assignment_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2904:1: ( ( rule__Quantifier__V1Assignment_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2904:1: ( ( rule__Quantifier__V1Assignment_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2905:1: ( rule__Quantifier__V1Assignment_3_1 )
            {
             before(grammarAccess.getQuantifierAccess().getV1Assignment_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2906:1: ( rule__Quantifier__V1Assignment_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2906:2: rule__Quantifier__V1Assignment_3_1
            {
            pushFollow(FOLLOW_rule__Quantifier__V1Assignment_3_1_in_rule__Quantifier__Group_3__1__Impl6013);
            rule__Quantifier__V1Assignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getV1Assignment_3_1()); 

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
    // $ANTLR end "rule__Quantifier__Group_3__1__Impl"


    // $ANTLR start "rule__Quantifier__Group_3__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2916:1: rule__Quantifier__Group_3__2 : rule__Quantifier__Group_3__2__Impl ;
    public final void rule__Quantifier__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2920:1: ( rule__Quantifier__Group_3__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2921:2: rule__Quantifier__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__2__Impl_in_rule__Quantifier__Group_3__26043);
            rule__Quantifier__Group_3__2__Impl();

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
    // $ANTLR end "rule__Quantifier__Group_3__2"


    // $ANTLR start "rule__Quantifier__Group_3__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2927:1: rule__Quantifier__Group_3__2__Impl : ( ( rule__Quantifier__V2Assignment_3_2 ) ) ;
    public final void rule__Quantifier__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2931:1: ( ( ( rule__Quantifier__V2Assignment_3_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2932:1: ( ( rule__Quantifier__V2Assignment_3_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2932:1: ( ( rule__Quantifier__V2Assignment_3_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2933:1: ( rule__Quantifier__V2Assignment_3_2 )
            {
             before(grammarAccess.getQuantifierAccess().getV2Assignment_3_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2934:1: ( rule__Quantifier__V2Assignment_3_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2934:2: rule__Quantifier__V2Assignment_3_2
            {
            pushFollow(FOLLOW_rule__Quantifier__V2Assignment_3_2_in_rule__Quantifier__Group_3__2__Impl6070);
            rule__Quantifier__V2Assignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantifierAccess().getV2Assignment_3_2()); 

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
    // $ANTLR end "rule__Quantifier__Group_3__2__Impl"


    // $ANTLR start "rule__Formula__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2950:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2954:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2955:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06106);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06109);
            rule__Formula__Group__1();

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
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2962:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__FiAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2966:1: ( ( ( rule__Formula__FiAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2967:1: ( ( rule__Formula__FiAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2967:1: ( ( rule__Formula__FiAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2968:1: ( rule__Formula__FiAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getFiAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2969:1: ( rule__Formula__FiAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2969:2: rule__Formula__FiAssignment_0
            {
            pushFollow(FOLLOW_rule__Formula__FiAssignment_0_in_rule__Formula__Group__0__Impl6136);
            rule__Formula__FiAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getFiAssignment_0()); 

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
    // $ANTLR end "rule__Formula__Group__0__Impl"


    // $ANTLR start "rule__Formula__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2979:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2983:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2984:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16166);
            rule__Formula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16169);
            rule__Formula__Group__2();

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
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2991:1: rule__Formula__Group__1__Impl : ( KEYWORD_11 ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2995:1: ( ( KEYWORD_11 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2996:1: ( KEYWORD_11 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2996:1: ( KEYWORD_11 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:2997:1: KEYWORD_11
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_1()); 
            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__Formula__Group__1__Impl6197); 
             after(grammarAccess.getFormulaAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Formula__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3010:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3014:1: ( rule__Formula__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3015:2: rule__Formula__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26228);
            rule__Formula__Group__2__Impl();

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
    // $ANTLR end "rule__Formula__Group__2"


    // $ANTLR start "rule__Formula__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3021:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__FeAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3025:1: ( ( ( rule__Formula__FeAssignment_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3026:1: ( ( rule__Formula__FeAssignment_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3026:1: ( ( rule__Formula__FeAssignment_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3027:1: ( rule__Formula__FeAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getFeAssignment_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3028:1: ( rule__Formula__FeAssignment_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3028:2: rule__Formula__FeAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__FeAssignment_2_in_rule__Formula__Group__2__Impl6255);
            rule__Formula__FeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getFeAssignment_2()); 

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
    // $ANTLR end "rule__Formula__Group__2__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_0__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3044:1: rule__FormulaExpression__Group_0__0 : rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1 ;
    public final void rule__FormulaExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3048:1: ( rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3049:2: rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__0__Impl_in_rule__FormulaExpression__Group_0__06291);
            rule__FormulaExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__1_in_rule__FormulaExpression__Group_0__06294);
            rule__FormulaExpression__Group_0__1();

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
    // $ANTLR end "rule__FormulaExpression__Group_0__0"


    // $ANTLR start "rule__FormulaExpression__Group_0__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3056:1: rule__FormulaExpression__Group_0__0__Impl : ( ( rule__FormulaExpression__FiAssignment_0_0 ) ) ;
    public final void rule__FormulaExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3060:1: ( ( ( rule__FormulaExpression__FiAssignment_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3061:1: ( ( rule__FormulaExpression__FiAssignment_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3061:1: ( ( rule__FormulaExpression__FiAssignment_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3062:1: ( rule__FormulaExpression__FiAssignment_0_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFiAssignment_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3063:1: ( rule__FormulaExpression__FiAssignment_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3063:2: rule__FormulaExpression__FiAssignment_0_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__FiAssignment_0_0_in_rule__FormulaExpression__Group_0__0__Impl6321);
            rule__FormulaExpression__FiAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getFiAssignment_0_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_0__0__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_0__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3073:1: rule__FormulaExpression__Group_0__1 : rule__FormulaExpression__Group_0__1__Impl ;
    public final void rule__FormulaExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3077:1: ( rule__FormulaExpression__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3078:2: rule__FormulaExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__1__Impl_in_rule__FormulaExpression__Group_0__16351);
            rule__FormulaExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__FormulaExpression__Group_0__1"


    // $ANTLR start "rule__FormulaExpression__Group_0__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3084:1: rule__FormulaExpression__Group_0__1__Impl : ( ( rule__FormulaExpression__Group_0_1__0 )? ) ;
    public final void rule__FormulaExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3088:1: ( ( ( rule__FormulaExpression__Group_0_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3089:1: ( ( rule__FormulaExpression__Group_0_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3089:1: ( ( rule__FormulaExpression__Group_0_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3090:1: ( rule__FormulaExpression__Group_0_1__0 )?
            {
             before(grammarAccess.getFormulaExpressionAccess().getGroup_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3091:1: ( rule__FormulaExpression__Group_0_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_17||LA28_0==KEYWORD_1||(LA28_0>=KEYWORD_4 && LA28_0<=KEYWORD_5)||LA28_0==KEYWORD_7||LA28_0==KEYWORD_9) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3091:2: rule__FormulaExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__0_in_rule__FormulaExpression__Group_0__1__Impl6378);
                    rule__FormulaExpression__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormulaExpressionAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_0__1__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_0_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3105:1: rule__FormulaExpression__Group_0_1__0 : rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1 ;
    public final void rule__FormulaExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3109:1: ( rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3110:2: rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__0__Impl_in_rule__FormulaExpression__Group_0_1__06413);
            rule__FormulaExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__1_in_rule__FormulaExpression__Group_0_1__06416);
            rule__FormulaExpression__Group_0_1__1();

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
    // $ANTLR end "rule__FormulaExpression__Group_0_1__0"


    // $ANTLR start "rule__FormulaExpression__Group_0_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3117:1: rule__FormulaExpression__Group_0_1__0__Impl : ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) ) ;
    public final void rule__FormulaExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3121:1: ( ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3122:1: ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3122:1: ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3123:1: ( rule__FormulaExpression__MoAssignment_0_1_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoAssignment_0_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3124:1: ( rule__FormulaExpression__MoAssignment_0_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3124:2: rule__FormulaExpression__MoAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__MoAssignment_0_1_0_in_rule__FormulaExpression__Group_0_1__0__Impl6443);
            rule__FormulaExpression__MoAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getMoAssignment_0_1_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_0_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3134:1: rule__FormulaExpression__Group_0_1__1 : rule__FormulaExpression__Group_0_1__1__Impl ;
    public final void rule__FormulaExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3138:1: ( rule__FormulaExpression__Group_0_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3139:2: rule__FormulaExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__1__Impl_in_rule__FormulaExpression__Group_0_1__16473);
            rule__FormulaExpression__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__FormulaExpression__Group_0_1__1"


    // $ANTLR start "rule__FormulaExpression__Group_0_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3145:1: rule__FormulaExpression__Group_0_1__1__Impl : ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) ) ;
    public final void rule__FormulaExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3149:1: ( ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3150:1: ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3150:1: ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3151:1: ( rule__FormulaExpression__FeAssignment_0_1_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFeAssignment_0_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3152:1: ( rule__FormulaExpression__FeAssignment_0_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3152:2: rule__FormulaExpression__FeAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__FeAssignment_0_1_1_in_rule__FormulaExpression__Group_0_1__1__Impl6500);
            rule__FormulaExpression__FeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getFeAssignment_0_1_1()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3166:1: rule__FormulaExpression__Group_1__0 : rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1 ;
    public final void rule__FormulaExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3170:1: ( rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3171:2: rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__0__Impl_in_rule__FormulaExpression__Group_1__06534);
            rule__FormulaExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__1_in_rule__FormulaExpression__Group_1__06537);
            rule__FormulaExpression__Group_1__1();

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
    // $ANTLR end "rule__FormulaExpression__Group_1__0"


    // $ANTLR start "rule__FormulaExpression__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3178:1: rule__FormulaExpression__Group_1__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__FormulaExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3182:1: ( ( KEYWORD_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3183:1: ( KEYWORD_2 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3183:1: ( KEYWORD_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3184:1: KEYWORD_2
            {
             before(grammarAccess.getFormulaExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__FormulaExpression__Group_1__0__Impl6565); 
             after(grammarAccess.getFormulaExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1__0__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3197:1: rule__FormulaExpression__Group_1__1 : rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2 ;
    public final void rule__FormulaExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3201:1: ( rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3202:2: rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__1__Impl_in_rule__FormulaExpression__Group_1__16596);
            rule__FormulaExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__2_in_rule__FormulaExpression__Group_1__16599);
            rule__FormulaExpression__Group_1__2();

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
    // $ANTLR end "rule__FormulaExpression__Group_1__1"


    // $ANTLR start "rule__FormulaExpression__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3209:1: rule__FormulaExpression__Group_1__1__Impl : ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) ) ;
    public final void rule__FormulaExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3213:1: ( ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3214:1: ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3214:1: ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3215:1: ( rule__FormulaExpression__Fe1Assignment_1_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe1Assignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3216:1: ( rule__FormulaExpression__Fe1Assignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3216:2: rule__FormulaExpression__Fe1Assignment_1_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Fe1Assignment_1_1_in_rule__FormulaExpression__Group_1__1__Impl6626);
            rule__FormulaExpression__Fe1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getFe1Assignment_1_1()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3226:1: rule__FormulaExpression__Group_1__2 : rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3 ;
    public final void rule__FormulaExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3230:1: ( rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3231:2: rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__2__Impl_in_rule__FormulaExpression__Group_1__26656);
            rule__FormulaExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__3_in_rule__FormulaExpression__Group_1__26659);
            rule__FormulaExpression__Group_1__3();

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
    // $ANTLR end "rule__FormulaExpression__Group_1__2"


    // $ANTLR start "rule__FormulaExpression__Group_1__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3238:1: rule__FormulaExpression__Group_1__2__Impl : ( KEYWORD_3 ) ;
    public final void rule__FormulaExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3242:1: ( ( KEYWORD_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3243:1: ( KEYWORD_3 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3243:1: ( KEYWORD_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3244:1: KEYWORD_3
            {
             before(grammarAccess.getFormulaExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__FormulaExpression__Group_1__2__Impl6687); 
             after(grammarAccess.getFormulaExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1__2__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3257:1: rule__FormulaExpression__Group_1__3 : rule__FormulaExpression__Group_1__3__Impl ;
    public final void rule__FormulaExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3261:1: ( rule__FormulaExpression__Group_1__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3262:2: rule__FormulaExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__3__Impl_in_rule__FormulaExpression__Group_1__36718);
            rule__FormulaExpression__Group_1__3__Impl();

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
    // $ANTLR end "rule__FormulaExpression__Group_1__3"


    // $ANTLR start "rule__FormulaExpression__Group_1__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3268:1: rule__FormulaExpression__Group_1__3__Impl : ( ( rule__FormulaExpression__Group_1_3__0 )? ) ;
    public final void rule__FormulaExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3272:1: ( ( ( rule__FormulaExpression__Group_1_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3273:1: ( ( rule__FormulaExpression__Group_1_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3273:1: ( ( rule__FormulaExpression__Group_1_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3274:1: ( rule__FormulaExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getFormulaExpressionAccess().getGroup_1_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3275:1: ( rule__FormulaExpression__Group_1_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_17||LA29_0==KEYWORD_1||(LA29_0>=KEYWORD_4 && LA29_0<=KEYWORD_5)||LA29_0==KEYWORD_7||LA29_0==KEYWORD_9) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3275:2: rule__FormulaExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__0_in_rule__FormulaExpression__Group_1__3__Impl6745);
                    rule__FormulaExpression__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormulaExpressionAccess().getGroup_1_3()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1__3__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1_3__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3293:1: rule__FormulaExpression__Group_1_3__0 : rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1 ;
    public final void rule__FormulaExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3297:1: ( rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3298:2: rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__0__Impl_in_rule__FormulaExpression__Group_1_3__06784);
            rule__FormulaExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__1_in_rule__FormulaExpression__Group_1_3__06787);
            rule__FormulaExpression__Group_1_3__1();

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
    // $ANTLR end "rule__FormulaExpression__Group_1_3__0"


    // $ANTLR start "rule__FormulaExpression__Group_1_3__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3305:1: rule__FormulaExpression__Group_1_3__0__Impl : ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) ) ;
    public final void rule__FormulaExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3309:1: ( ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3310:1: ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3310:1: ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3311:1: ( rule__FormulaExpression__MoAssignment_1_3_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoAssignment_1_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3312:1: ( rule__FormulaExpression__MoAssignment_1_3_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3312:2: rule__FormulaExpression__MoAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__MoAssignment_1_3_0_in_rule__FormulaExpression__Group_1_3__0__Impl6814);
            rule__FormulaExpression__MoAssignment_1_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getMoAssignment_1_3_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1_3__0__Impl"


    // $ANTLR start "rule__FormulaExpression__Group_1_3__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3322:1: rule__FormulaExpression__Group_1_3__1 : rule__FormulaExpression__Group_1_3__1__Impl ;
    public final void rule__FormulaExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3326:1: ( rule__FormulaExpression__Group_1_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3327:2: rule__FormulaExpression__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__1__Impl_in_rule__FormulaExpression__Group_1_3__16844);
            rule__FormulaExpression__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__FormulaExpression__Group_1_3__1"


    // $ANTLR start "rule__FormulaExpression__Group_1_3__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3333:1: rule__FormulaExpression__Group_1_3__1__Impl : ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) ) ;
    public final void rule__FormulaExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3337:1: ( ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3338:1: ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3338:1: ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3339:1: ( rule__FormulaExpression__Fe2Assignment_1_3_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe2Assignment_1_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3340:1: ( rule__FormulaExpression__Fe2Assignment_1_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3340:2: rule__FormulaExpression__Fe2Assignment_1_3_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Fe2Assignment_1_3_1_in_rule__FormulaExpression__Group_1_3__1__Impl6871);
            rule__FormulaExpression__Fe2Assignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaExpressionAccess().getFe2Assignment_1_3_1()); 

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
    // $ANTLR end "rule__FormulaExpression__Group_1_3__1__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3354:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3358:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3359:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06905);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06908);
            rule__Set__Group__1();

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
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3366:1: rule__Set__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3370:1: ( ( KEYWORD_14 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3371:1: ( KEYWORD_14 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3371:1: ( KEYWORD_14 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3372:1: KEYWORD_14
            {
             before(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Set__Group__0__Impl6936); 
             after(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3385:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3389:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3390:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16967);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16970);
            rule__Set__Group__2();

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
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3397:1: rule__Set__Group__1__Impl : ( ( rule__Set__LAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3401:1: ( ( ( rule__Set__LAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3402:1: ( ( rule__Set__LAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3402:1: ( ( rule__Set__LAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3403:1: ( rule__Set__LAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getLAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3404:1: ( rule__Set__LAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3404:2: rule__Set__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Set__LAssignment_1_in_rule__Set__Group__1__Impl6997);
            rule__Set__LAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getLAssignment_1()); 

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
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3414:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3418:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3419:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__27027);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__3_in_rule__Set__Group__27030);
            rule__Set__Group__3();

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
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3426:1: rule__Set__Group__2__Impl : ( KEYWORD_15 ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3430:1: ( ( KEYWORD_15 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3431:1: ( KEYWORD_15 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3431:1: ( KEYWORD_15 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3432:1: KEYWORD_15
            {
             before(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2()); 
            match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__Set__Group__2__Impl7058); 
             after(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3445:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3449:1: ( rule__Set__Group__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3450:2: rule__Set__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__37089);
            rule__Set__Group__3__Impl();

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
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3456:1: rule__Set__Group__3__Impl : ( ( rule__Set__Group_3__0 )? ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3460:1: ( ( ( rule__Set__Group_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3461:1: ( ( rule__Set__Group_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3461:1: ( ( rule__Set__Group_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3462:1: ( rule__Set__Group_3__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3463:1: ( rule__Set__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_6) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3463:2: rule__Set__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl7116);
                    rule__Set__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group_3__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3481:1: rule__Set__Group_3__0 : rule__Set__Group_3__0__Impl rule__Set__Group_3__1 ;
    public final void rule__Set__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3485:1: ( rule__Set__Group_3__0__Impl rule__Set__Group_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3486:2: rule__Set__Group_3__0__Impl rule__Set__Group_3__1
            {
            pushFollow(FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__07155);
            rule__Set__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__07158);
            rule__Set__Group_3__1();

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
    // $ANTLR end "rule__Set__Group_3__0"


    // $ANTLR start "rule__Set__Group_3__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3493:1: rule__Set__Group_3__0__Impl : ( KEYWORD_6 ) ;
    public final void rule__Set__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3497:1: ( ( KEYWORD_6 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3498:1: ( KEYWORD_6 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3498:1: ( KEYWORD_6 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3499:1: KEYWORD_6
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_3_0()); 
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Set__Group_3__0__Impl7186); 
             after(grammarAccess.getSetAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Set__Group_3__0__Impl"


    // $ANTLR start "rule__Set__Group_3__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3512:1: rule__Set__Group_3__1 : rule__Set__Group_3__1__Impl ;
    public final void rule__Set__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3516:1: ( rule__Set__Group_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3517:2: rule__Set__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__17217);
            rule__Set__Group_3__1__Impl();

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
    // $ANTLR end "rule__Set__Group_3__1"


    // $ANTLR start "rule__Set__Group_3__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3523:1: rule__Set__Group_3__1__Impl : ( ( rule__Set__SAssignment_3_1 ) ) ;
    public final void rule__Set__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3527:1: ( ( ( rule__Set__SAssignment_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3528:1: ( ( rule__Set__SAssignment_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3528:1: ( ( rule__Set__SAssignment_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3529:1: ( rule__Set__SAssignment_3_1 )
            {
             before(grammarAccess.getSetAccess().getSAssignment_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3530:1: ( rule__Set__SAssignment_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3530:2: rule__Set__SAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Set__SAssignment_3_1_in_rule__Set__Group_3__1__Impl7244);
            rule__Set__SAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getSAssignment_3_1()); 

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
    // $ANTLR end "rule__Set__Group_3__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3544:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3548:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3549:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__07278);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__1_in_rule__List__Group__07281);
            rule__List__Group__1();

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
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3556:1: rule__List__Group__0__Impl : ( ( rule__List__Alternatives_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3560:1: ( ( ( rule__List__Alternatives_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3561:1: ( ( rule__List__Alternatives_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3561:1: ( ( rule__List__Alternatives_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3562:1: ( rule__List__Alternatives_0 )
            {
             before(grammarAccess.getListAccess().getAlternatives_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3563:1: ( rule__List__Alternatives_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3563:2: rule__List__Alternatives_0
            {
            pushFollow(FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl7308);
            rule__List__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3573:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3577:1: ( rule__List__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3578:2: rule__List__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__17338);
            rule__List__Group__1__Impl();

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
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3584:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )? ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3588:1: ( ( ( rule__List__Group_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3589:1: ( ( rule__List__Group_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3589:1: ( ( rule__List__Group_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3590:1: ( rule__List__Group_1__0 )?
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3591:1: ( rule__List__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_6) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3591:2: rule__List__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__List__Group_1__0_in_rule__List__Group__1__Impl7365);
                    rule__List__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group_1__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3605:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3609:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3610:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_rule__List__Group_1__0__Impl_in_rule__List__Group_1__07400);
            rule__List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group_1__1_in_rule__List__Group_1__07403);
            rule__List__Group_1__1();

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
    // $ANTLR end "rule__List__Group_1__0"


    // $ANTLR start "rule__List__Group_1__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3617:1: rule__List__Group_1__0__Impl : ( KEYWORD_6 ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3621:1: ( ( KEYWORD_6 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3622:1: ( KEYWORD_6 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3622:1: ( KEYWORD_6 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3623:1: KEYWORD_6
            {
             before(grammarAccess.getListAccess().getCommaKeyword_1_0()); 
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__List__Group_1__0__Impl7431); 
             after(grammarAccess.getListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__List__Group_1__0__Impl"


    // $ANTLR start "rule__List__Group_1__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3636:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3640:1: ( rule__List__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3641:2: rule__List__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__List__Group_1__1__Impl_in_rule__List__Group_1__17462);
            rule__List__Group_1__1__Impl();

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
    // $ANTLR end "rule__List__Group_1__1"


    // $ANTLR start "rule__List__Group_1__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3647:1: rule__List__Group_1__1__Impl : ( ( rule__List__LAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3651:1: ( ( ( rule__List__LAssignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3652:1: ( ( rule__List__LAssignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3652:1: ( ( rule__List__LAssignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3653:1: ( rule__List__LAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getLAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3654:1: ( rule__List__LAssignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3654:2: rule__List__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__List__LAssignment_1_1_in_rule__List__Group_1__1__Impl7489);
            rule__List__LAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getLAssignment_1_1()); 

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
    // $ANTLR end "rule__List__Group_1__1__Impl"


    // $ANTLR start "rule__TestPackage__Group__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3668:1: rule__TestPackage__Group__0 : rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1 ;
    public final void rule__TestPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3672:1: ( rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3673:2: rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__0__Impl_in_rule__TestPackage__Group__07523);
            rule__TestPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group__1_in_rule__TestPackage__Group__07526);
            rule__TestPackage__Group__1();

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
    // $ANTLR end "rule__TestPackage__Group__0"


    // $ANTLR start "rule__TestPackage__Group__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3680:1: rule__TestPackage__Group__0__Impl : ( KEYWORD_30 ) ;
    public final void rule__TestPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3684:1: ( ( KEYWORD_30 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3685:1: ( KEYWORD_30 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3685:1: ( KEYWORD_30 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3686:1: KEYWORD_30
            {
             before(grammarAccess.getTestPackageAccess().getPackageKeyword_0()); 
            match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__TestPackage__Group__0__Impl7554); 
             after(grammarAccess.getTestPackageAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__TestPackage__Group__0__Impl"


    // $ANTLR start "rule__TestPackage__Group__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3699:1: rule__TestPackage__Group__1 : rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2 ;
    public final void rule__TestPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3703:1: ( rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3704:2: rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__1__Impl_in_rule__TestPackage__Group__17585);
            rule__TestPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group__2_in_rule__TestPackage__Group__17588);
            rule__TestPackage__Group__2();

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
    // $ANTLR end "rule__TestPackage__Group__1"


    // $ANTLR start "rule__TestPackage__Group__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3711:1: rule__TestPackage__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__TestPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3715:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3716:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3716:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3717:1: RULE_ID
            {
             before(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestPackage__Group__1__Impl7615); 
             after(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__TestPackage__Group__1__Impl"


    // $ANTLR start "rule__TestPackage__Group__2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3728:1: rule__TestPackage__Group__2 : rule__TestPackage__Group__2__Impl ;
    public final void rule__TestPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3732:1: ( rule__TestPackage__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3733:2: rule__TestPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__2__Impl_in_rule__TestPackage__Group__27644);
            rule__TestPackage__Group__2__Impl();

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
    // $ANTLR end "rule__TestPackage__Group__2"


    // $ANTLR start "rule__TestPackage__Group__2__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3739:1: rule__TestPackage__Group__2__Impl : ( ( rule__TestPackage__Group_2__0 )* ) ;
    public final void rule__TestPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3743:1: ( ( ( rule__TestPackage__Group_2__0 )* ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3744:1: ( ( rule__TestPackage__Group_2__0 )* )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3744:1: ( ( rule__TestPackage__Group_2__0 )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3745:1: ( rule__TestPackage__Group_2__0 )*
            {
             before(grammarAccess.getTestPackageAccess().getGroup_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3746:1: ( rule__TestPackage__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==KEYWORD_8) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3746:2: rule__TestPackage__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TestPackage__Group_2__0_in_rule__TestPackage__Group__2__Impl7671);
            	    rule__TestPackage__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getTestPackageAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TestPackage__Group__2__Impl"


    // $ANTLR start "rule__TestPackage__Group_2__0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3762:1: rule__TestPackage__Group_2__0 : rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1 ;
    public final void rule__TestPackage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3766:1: ( rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3767:2: rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1
            {
            pushFollow(FOLLOW_rule__TestPackage__Group_2__0__Impl_in_rule__TestPackage__Group_2__07708);
            rule__TestPackage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group_2__1_in_rule__TestPackage__Group_2__07711);
            rule__TestPackage__Group_2__1();

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
    // $ANTLR end "rule__TestPackage__Group_2__0"


    // $ANTLR start "rule__TestPackage__Group_2__0__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3774:1: rule__TestPackage__Group_2__0__Impl : ( KEYWORD_8 ) ;
    public final void rule__TestPackage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3778:1: ( ( KEYWORD_8 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3779:1: ( KEYWORD_8 )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3779:1: ( KEYWORD_8 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3780:1: KEYWORD_8
            {
             before(grammarAccess.getTestPackageAccess().getFullStopKeyword_2_0()); 
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__TestPackage__Group_2__0__Impl7739); 
             after(grammarAccess.getTestPackageAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__TestPackage__Group_2__0__Impl"


    // $ANTLR start "rule__TestPackage__Group_2__1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3793:1: rule__TestPackage__Group_2__1 : rule__TestPackage__Group_2__1__Impl ;
    public final void rule__TestPackage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3797:1: ( rule__TestPackage__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3798:2: rule__TestPackage__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TestPackage__Group_2__1__Impl_in_rule__TestPackage__Group_2__17770);
            rule__TestPackage__Group_2__1__Impl();

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
    // $ANTLR end "rule__TestPackage__Group_2__1"


    // $ANTLR start "rule__TestPackage__Group_2__1__Impl"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3804:1: rule__TestPackage__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__TestPackage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3808:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3809:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3809:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3810:1: RULE_ID
            {
             before(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestPackage__Group_2__1__Impl7797); 
             after(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__TestPackage__Group_2__1__Impl"


    // $ANTLR start "rule__Leta__TpAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3826:1: rule__Leta__TpAssignment_0 : ( ruleTestPackage ) ;
    public final void rule__Leta__TpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3830:1: ( ( ruleTestPackage ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3831:1: ( ruleTestPackage )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3831:1: ( ruleTestPackage )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3832:1: ruleTestPackage
            {
             before(grammarAccess.getLetaAccess().getTpTestPackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTestPackage_in_rule__Leta__TpAssignment_07835);
            ruleTestPackage();

            state._fsp--;

             after(grammarAccess.getLetaAccess().getTpTestPackageParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Leta__TpAssignment_0"


    // $ANTLR start "rule__Leta__TcAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3841:1: rule__Leta__TcAssignment_1 : ( ruleTestCase ) ;
    public final void rule__Leta__TcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3845:1: ( ( ruleTestCase ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3846:1: ( ruleTestCase )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3846:1: ( ruleTestCase )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3847:1: ruleTestCase
            {
             before(grammarAccess.getLetaAccess().getTcTestCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTestCase_in_rule__Leta__TcAssignment_17866);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getLetaAccess().getTcTestCaseParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Leta__TcAssignment_1"


    // $ANTLR start "rule__TestCase__IdAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3856:1: rule__TestCase__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__TestCase__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3860:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3861:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3861:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3862:1: RULE_ID
            {
             before(grammarAccess.getTestCaseAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestCase__IdAssignment_17897); 
             after(grammarAccess.getTestCaseAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TestCase__IdAssignment_1"


    // $ANTLR start "rule__TestCase__VAssignment_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3871:1: rule__TestCase__VAssignment_2 : ( ruleVerifyClause ) ;
    public final void rule__TestCase__VAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3875:1: ( ( ruleVerifyClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3876:1: ( ruleVerifyClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3876:1: ( ruleVerifyClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3877:1: ruleVerifyClause
            {
             before(grammarAccess.getTestCaseAccess().getVVerifyClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_rule__TestCase__VAssignment_27928);
            ruleVerifyClause();

            state._fsp--;

             after(grammarAccess.getTestCaseAccess().getVVerifyClauseParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TestCase__VAssignment_2"


    // $ANTLR start "rule__TestCase__WAssignment_3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3886:1: rule__TestCase__WAssignment_3 : ( ruleWhenClause ) ;
    public final void rule__TestCase__WAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3890:1: ( ( ruleWhenClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3891:1: ( ruleWhenClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3891:1: ( ruleWhenClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3892:1: ruleWhenClause
            {
             before(grammarAccess.getTestCaseAccess().getWWhenClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWhenClause_in_rule__TestCase__WAssignment_37959);
            ruleWhenClause();

            state._fsp--;

             after(grammarAccess.getTestCaseAccess().getWWhenClauseParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TestCase__WAssignment_3"


    // $ANTLR start "rule__TestCase__SAssignment_4"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3901:1: rule__TestCase__SAssignment_4 : ( ruleSetClause ) ;
    public final void rule__TestCase__SAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3905:1: ( ( ruleSetClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3906:1: ( ruleSetClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3906:1: ( ruleSetClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3907:1: ruleSetClause
            {
             before(grammarAccess.getTestCaseAccess().getSSetClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSetClause_in_rule__TestCase__SAssignment_47990);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getTestCaseAccess().getSSetClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TestCase__SAssignment_4"


    // $ANTLR start "rule__VerifyClause__FcAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3916:1: rule__VerifyClause__FcAssignment_1 : ( ruleFactComposite ) ;
    public final void rule__VerifyClause__FcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3920:1: ( ( ruleFactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3921:1: ( ruleFactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3921:1: ( ruleFactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3922:1: ruleFactComposite
            {
             before(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFactComposite_in_rule__VerifyClause__FcAssignment_18021);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VerifyClause__FcAssignment_1"


    // $ANTLR start "rule__WhenClause__FcAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3931:1: rule__WhenClause__FcAssignment_1 : ( ruleFactComposite ) ;
    public final void rule__WhenClause__FcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3935:1: ( ( ruleFactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3936:1: ( ruleFactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3936:1: ( ruleFactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3937:1: ruleFactComposite
            {
             before(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFactComposite_in_rule__WhenClause__FcAssignment_18052);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhenClause__FcAssignment_1"


    // $ANTLR start "rule__SetClause__SAssignment_3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3946:1: rule__SetClause__SAssignment_3 : ( ruleSet ) ;
    public final void rule__SetClause__SAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3950:1: ( ( ruleSet ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3951:1: ( ruleSet )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3951:1: ( ruleSet )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3952:1: ruleSet
            {
             before(grammarAccess.getSetClauseAccess().getSSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSet_in_rule__SetClause__SAssignment_38083);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetClauseAccess().getSSetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SetClause__SAssignment_3"


    // $ANTLR start "rule__FactComposite__FAssignment_0_0_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3961:1: rule__FactComposite__FAssignment_0_0_0 : ( ruleFact ) ;
    public final void rule__FactComposite__FAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3965:1: ( ( ruleFact ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3966:1: ( ruleFact )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3966:1: ( ruleFact )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3967:1: ruleFact
            {
             before(grammarAccess.getFactCompositeAccess().getFFactParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__FactComposite__FAssignment_0_0_08114);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getFFactParserRuleCall_0_0_0_0()); 

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
    // $ANTLR end "rule__FactComposite__FAssignment_0_0_0"


    // $ANTLR start "rule__FactComposite__FoAssignment_0_0_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3976:1: rule__FactComposite__FoAssignment_0_0_1 : ( ruleFormula ) ;
    public final void rule__FactComposite__FoAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3980:1: ( ( ruleFormula ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3981:1: ( ruleFormula )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3981:1: ( ruleFormula )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3982:1: ruleFormula
            {
             before(grammarAccess.getFactCompositeAccess().getFoFormulaParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_ruleFormula_in_rule__FactComposite__FoAssignment_0_0_18145);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getFoFormulaParserRuleCall_0_0_1_0()); 

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
    // $ANTLR end "rule__FactComposite__FoAssignment_0_0_1"


    // $ANTLR start "rule__FactComposite__OpAssignment_0_1_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3991:1: rule__FactComposite__OpAssignment_0_1_0 : ( ruleLogicalOperator ) ;
    public final void rule__FactComposite__OpAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3995:1: ( ( ruleLogicalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3996:1: ( ruleLogicalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3996:1: ( ruleLogicalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:3997:1: ruleLogicalOperator
            {
             before(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__FactComposite__OpAssignment_0_1_08176);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__FactComposite__OpAssignment_0_1_0"


    // $ANTLR start "rule__FactComposite__FcAssignment_0_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4006:1: rule__FactComposite__FcAssignment_0_1_1 : ( ruleFactComposite ) ;
    public final void rule__FactComposite__FcAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4010:1: ( ( ruleFactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4011:1: ( ruleFactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4011:1: ( ruleFactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4012:1: ruleFactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFcFactCompositeParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleFactComposite_in_rule__FactComposite__FcAssignment_0_1_18207);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getFcFactCompositeParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__FactComposite__FcAssignment_0_1_1"


    // $ANTLR start "rule__FactComposite__Fc1Assignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4021:1: rule__FactComposite__Fc1Assignment_1_1 : ( ruleFactComposite ) ;
    public final void rule__FactComposite__Fc1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4025:1: ( ( ruleFactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4026:1: ( ruleFactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4026:1: ( ruleFactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4027:1: ruleFactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFc1FactCompositeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFactComposite_in_rule__FactComposite__Fc1Assignment_1_18238);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getFc1FactCompositeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FactComposite__Fc1Assignment_1_1"


    // $ANTLR start "rule__FactComposite__OpAssignment_1_3_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4036:1: rule__FactComposite__OpAssignment_1_3_0 : ( ruleLogicalOperator ) ;
    public final void rule__FactComposite__OpAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4040:1: ( ( ruleLogicalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4041:1: ( ruleLogicalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4041:1: ( ruleLogicalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4042:1: ruleLogicalOperator
            {
             before(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleLogicalOperator_in_rule__FactComposite__OpAssignment_1_3_08269);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_1_3_0_0()); 

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
    // $ANTLR end "rule__FactComposite__OpAssignment_1_3_0"


    // $ANTLR start "rule__FactComposite__Fc2Assignment_1_3_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4051:1: rule__FactComposite__Fc2Assignment_1_3_1 : ( ruleFactComposite ) ;
    public final void rule__FactComposite__Fc2Assignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4055:1: ( ( ruleFactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4056:1: ( ruleFactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4056:1: ( ruleFactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4057:1: ruleFactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFc2FactCompositeParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleFactComposite_in_rule__FactComposite__Fc2Assignment_1_3_18300);
            ruleFactComposite();

            state._fsp--;

             after(grammarAccess.getFactCompositeAccess().getFc2FactCompositeParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__FactComposite__Fc2Assignment_1_3_1"


    // $ANTLR start "rule__Fact__TermCompositeAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4066:1: rule__Fact__TermCompositeAssignment_0 : ( ruleTermComposite ) ;
    public final void rule__Fact__TermCompositeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4070:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4071:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4071:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4072:1: ruleTermComposite
            {
             before(grammarAccess.getFactAccess().getTermCompositeTermCompositeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__Fact__TermCompositeAssignment_08331);
            ruleTermComposite();

            state._fsp--;

             after(grammarAccess.getFactAccess().getTermCompositeTermCompositeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Fact__TermCompositeAssignment_0"


    // $ANTLR start "rule__Fact__ComplementAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4081:1: rule__Fact__ComplementAssignment_1 : ( ruleComplement ) ;
    public final void rule__Fact__ComplementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4085:1: ( ( ruleComplement ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4086:1: ( ruleComplement )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4086:1: ( ruleComplement )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4087:1: ruleComplement
            {
             before(grammarAccess.getFactAccess().getComplementComplementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplement_in_rule__Fact__ComplementAssignment_18362);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getFactAccess().getComplementComplementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fact__ComplementAssignment_1"


    // $ANTLR start "rule__Fact__TermComposite2Assignment_2_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4096:1: rule__Fact__TermComposite2Assignment_2_0 : ( ruleTermComposite ) ;
    public final void rule__Fact__TermComposite2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4100:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4101:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4101:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4102:1: ruleTermComposite
            {
             before(grammarAccess.getFactAccess().getTermComposite2TermCompositeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__Fact__TermComposite2Assignment_2_08393);
            ruleTermComposite();

            state._fsp--;

             after(grammarAccess.getFactAccess().getTermComposite2TermCompositeParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Fact__TermComposite2Assignment_2_0"


    // $ANTLR start "rule__Fact__FactExtAssignment_2_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4111:1: rule__Fact__FactExtAssignment_2_1 : ( ruleFactExt ) ;
    public final void rule__Fact__FactExtAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4115:1: ( ( ruleFactExt ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4116:1: ( ruleFactExt )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4116:1: ( ruleFactExt )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4117:1: ruleFactExt
            {
             before(grammarAccess.getFactAccess().getFactExtFactExtParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFactExt_in_rule__Fact__FactExtAssignment_2_18424);
            ruleFactExt();

            state._fsp--;

             after(grammarAccess.getFactAccess().getFactExtFactExtParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Fact__FactExtAssignment_2_1"


    // $ANTLR start "rule__FactExt__ComplementAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4126:1: rule__FactExt__ComplementAssignment_0 : ( ruleComplement ) ;
    public final void rule__FactExt__ComplementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4130:1: ( ( ruleComplement ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4131:1: ( ruleComplement )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4131:1: ( ruleComplement )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4132:1: ruleComplement
            {
             before(grammarAccess.getFactExtAccess().getComplementComplementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComplement_in_rule__FactExt__ComplementAssignment_08455);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getFactExtAccess().getComplementComplementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FactExt__ComplementAssignment_0"


    // $ANTLR start "rule__FactExt__TermCompositeAssignment_1_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4141:1: rule__FactExt__TermCompositeAssignment_1_0 : ( ruleTermComposite ) ;
    public final void rule__FactExt__TermCompositeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4145:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4146:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4146:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4147:1: ruleTermComposite
            {
             before(grammarAccess.getFactExtAccess().getTermCompositeTermCompositeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__FactExt__TermCompositeAssignment_1_08486);
            ruleTermComposite();

            state._fsp--;

             after(grammarAccess.getFactExtAccess().getTermCompositeTermCompositeParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__FactExt__TermCompositeAssignment_1_0"


    // $ANTLR start "rule__FactExt__FactExtAssignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4156:1: rule__FactExt__FactExtAssignment_1_1 : ( ruleFactExt ) ;
    public final void rule__FactExt__FactExtAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4160:1: ( ( ruleFactExt ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4161:1: ( ruleFactExt )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4161:1: ( ruleFactExt )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4162:1: ruleFactExt
            {
             before(grammarAccess.getFactExtAccess().getFactExtFactExtParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFactExt_in_rule__FactExt__FactExtAssignment_1_18517);
            ruleFactExt();

            state._fsp--;

             after(grammarAccess.getFactExtAccess().getFactExtFactExtParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FactExt__FactExtAssignment_1_1"


    // $ANTLR start "rule__TermComposite__QuantifierAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4171:1: rule__TermComposite__QuantifierAssignment_0 : ( ruleQuantifier ) ;
    public final void rule__TermComposite__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4175:1: ( ( ruleQuantifier ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4176:1: ( ruleQuantifier )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4176:1: ( ruleQuantifier )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4177:1: ruleQuantifier
            {
             before(grammarAccess.getTermCompositeAccess().getQuantifierQuantifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantifier_in_rule__TermComposite__QuantifierAssignment_08548);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getTermCompositeAccess().getQuantifierQuantifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TermComposite__QuantifierAssignment_0"


    // $ANTLR start "rule__TermComposite__TermAssignment_1_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4186:1: rule__TermComposite__TermAssignment_1_0 : ( ruleTerm ) ;
    public final void rule__TermComposite__TermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4190:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4191:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4191:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4192:1: ruleTerm
            {
             before(grammarAccess.getTermCompositeAccess().getTermTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermComposite__TermAssignment_1_08579);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermCompositeAccess().getTermTermParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__TermComposite__TermAssignment_1_0"


    // $ANTLR start "rule__TermComposite__TermInstanceAssignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4201:1: rule__TermComposite__TermInstanceAssignment_1_1 : ( ruleTermInstance ) ;
    public final void rule__TermComposite__TermInstanceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4205:1: ( ( ruleTermInstance ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4206:1: ( ruleTermInstance )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4206:1: ( ruleTermInstance )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4207:1: ruleTermInstance
            {
             before(grammarAccess.getTermCompositeAccess().getTermInstanceTermInstanceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTermInstance_in_rule__TermComposite__TermInstanceAssignment_1_18610);
            ruleTermInstance();

            state._fsp--;

             after(grammarAccess.getTermCompositeAccess().getTermInstanceTermInstanceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TermComposite__TermInstanceAssignment_1_1"


    // $ANTLR start "rule__TermComposite__TermWithAssociationAssignment_1_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4216:1: rule__TermComposite__TermWithAssociationAssignment_1_2 : ( ruleTermWithAssociation ) ;
    public final void rule__TermComposite__TermWithAssociationAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4220:1: ( ( ruleTermWithAssociation ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4221:1: ( ruleTermWithAssociation )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4221:1: ( ruleTermWithAssociation )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4222:1: ruleTermWithAssociation
            {
             before(grammarAccess.getTermCompositeAccess().getTermWithAssociationTermWithAssociationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_rule__TermComposite__TermWithAssociationAssignment_1_28641);
            ruleTermWithAssociation();

            state._fsp--;

             after(grammarAccess.getTermCompositeAccess().getTermWithAssociationTermWithAssociationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TermComposite__TermWithAssociationAssignment_1_2"


    // $ANTLR start "rule__Term__IdAssignment"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4231:1: rule__Term__IdAssignment : ( RULE_ID ) ;
    public final void rule__Term__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4235:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4236:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4236:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4237:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__IdAssignment8672); 
             after(grammarAccess.getTermAccess().getIdIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Term__IdAssignment"


    // $ANTLR start "rule__TermInstance__TermAssignment_0_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4246:1: rule__TermInstance__TermAssignment_0_0 : ( ruleTerm ) ;
    public final void rule__TermInstance__TermAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4250:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4251:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4251:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4252:1: ruleTerm
            {
             before(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_0_08703);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__TermInstance__TermAssignment_0_0"


    // $ANTLR start "rule__TermInstance__NotEqualOperatorAssignment_0_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4261:1: rule__TermInstance__NotEqualOperatorAssignment_0_1 : ( ruleNotEqualOperator ) ;
    public final void rule__TermInstance__NotEqualOperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4265:1: ( ( ruleNotEqualOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4266:1: ( ruleNotEqualOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4266:1: ( ruleNotEqualOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4267:1: ruleNotEqualOperator
            {
             before(grammarAccess.getTermInstanceAccess().getNotEqualOperatorNotEqualOperatorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_rule__TermInstance__NotEqualOperatorAssignment_0_18734);
            ruleNotEqualOperator();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getNotEqualOperatorNotEqualOperatorParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__TermInstance__NotEqualOperatorAssignment_0_1"


    // $ANTLR start "rule__TermInstance__StringLiteralAssignment_0_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4276:1: rule__TermInstance__StringLiteralAssignment_0_2 : ( ruleStringLiteral ) ;
    public final void rule__TermInstance__StringLiteralAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4280:1: ( ( ruleStringLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4281:1: ( ruleStringLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4281:1: ( ruleStringLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4282:1: ruleStringLiteral
            {
             before(grammarAccess.getTermInstanceAccess().getStringLiteralStringLiteralParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__TermInstance__StringLiteralAssignment_0_28765);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getStringLiteralStringLiteralParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__TermInstance__StringLiteralAssignment_0_2"


    // $ANTLR start "rule__TermInstance__TermAssignment_1_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4291:1: rule__TermInstance__TermAssignment_1_0 : ( ruleTerm ) ;
    public final void rule__TermInstance__TermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4295:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4296:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4296:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4297:1: ruleTerm
            {
             before(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_1_08796);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__TermInstance__TermAssignment_1_0"


    // $ANTLR start "rule__TermInstance__RelationalOperatorAssignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4306:1: rule__TermInstance__RelationalOperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__TermInstance__RelationalOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4310:1: ( ( ruleRelationalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4311:1: ( ruleRelationalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4311:1: ( ruleRelationalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4312:1: ruleRelationalOperator
            {
             before(grammarAccess.getTermInstanceAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_rule__TermInstance__RelationalOperatorAssignment_1_18827);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TermInstance__RelationalOperatorAssignment_1_1"


    // $ANTLR start "rule__TermInstance__OtherLiteralAssignment_1_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4321:1: rule__TermInstance__OtherLiteralAssignment_1_2 : ( ruleOtherLiteral ) ;
    public final void rule__TermInstance__OtherLiteralAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4325:1: ( ( ruleOtherLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4326:1: ( ruleOtherLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4326:1: ( ruleOtherLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4327:1: ruleOtherLiteral
            {
             before(grammarAccess.getTermInstanceAccess().getOtherLiteralOtherLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_rule__TermInstance__OtherLiteralAssignment_1_28858);
            ruleOtherLiteral();

            state._fsp--;

             after(grammarAccess.getTermInstanceAccess().getOtherLiteralOtherLiteralParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TermInstance__OtherLiteralAssignment_1_2"


    // $ANTLR start "rule__TermWithAssociation__TAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4336:1: rule__TermWithAssociation__TAssignment_0 : ( ruleTerm ) ;
    public final void rule__TermWithAssociation__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4340:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4341:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4341:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4342:1: ruleTerm
            {
             before(grammarAccess.getTermWithAssociationAccess().getTTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermWithAssociation__TAssignment_08889);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermWithAssociationAccess().getTTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TermWithAssociation__TAssignment_0"


    // $ANTLR start "rule__TermWithAssociation__RoAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4351:1: rule__TermWithAssociation__RoAssignment_1 : ( ruleRelationalOperator ) ;
    public final void rule__TermWithAssociation__RoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4355:1: ( ( ruleRelationalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4356:1: ( ruleRelationalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4356:1: ( ruleRelationalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4357:1: ruleRelationalOperator
            {
             before(grammarAccess.getTermWithAssociationAccess().getRoRelationalOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_rule__TermWithAssociation__RoAssignment_18920);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getTermWithAssociationAccess().getRoRelationalOperatorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TermWithAssociation__RoAssignment_1"


    // $ANTLR start "rule__TermWithAssociation__IndexAssignment_3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4366:1: rule__TermWithAssociation__IndexAssignment_3 : ( RULE_INT ) ;
    public final void rule__TermWithAssociation__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4370:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4371:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4371:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4372:1: RULE_INT
            {
             before(grammarAccess.getTermWithAssociationAccess().getIndexINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TermWithAssociation__IndexAssignment_38951); 
             after(grammarAccess.getTermWithAssociationAccess().getIndexINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__TermWithAssociation__IndexAssignment_3"


    // $ANTLR start "rule__Quantifier__VAssignment_0_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4381:1: rule__Quantifier__VAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4385:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4386:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4386:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4387:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_0_18982); 
             after(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Quantifier__VAssignment_0_1"


    // $ANTLR start "rule__Quantifier__VAssignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4396:1: rule__Quantifier__VAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4400:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4401:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4401:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4402:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_1_19013); 
             after(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Quantifier__VAssignment_1_1"


    // $ANTLR start "rule__Quantifier__VAssignment_2_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4411:1: rule__Quantifier__VAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4415:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4416:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4416:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4417:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_2_19044); 
             after(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Quantifier__VAssignment_2_1"


    // $ANTLR start "rule__Quantifier__V1Assignment_3_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4426:1: rule__Quantifier__V1Assignment_3_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__V1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4430:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4431:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4431:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4432:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getV1INTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__V1Assignment_3_19075); 
             after(grammarAccess.getQuantifierAccess().getV1INTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Quantifier__V1Assignment_3_1"


    // $ANTLR start "rule__Quantifier__V2Assignment_3_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4441:1: rule__Quantifier__V2Assignment_3_2 : ( RULE_INT ) ;
    public final void rule__Quantifier__V2Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4445:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4446:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4446:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4447:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getV2INTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__V2Assignment_3_29106); 
             after(grammarAccess.getQuantifierAccess().getV2INTTerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Quantifier__V2Assignment_3_2"


    // $ANTLR start "rule__Complement__IdAssignment"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4456:1: rule__Complement__IdAssignment : ( RULE_ID ) ;
    public final void rule__Complement__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4460:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4461:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4461:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4462:1: RULE_ID
            {
             before(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Complement__IdAssignment9137); 
             after(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Complement__IdAssignment"


    // $ANTLR start "rule__Formula__FiAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4471:1: rule__Formula__FiAssignment_0 : ( ruleFormulaItem ) ;
    public final void rule__Formula__FiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4475:1: ( ( ruleFormulaItem ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4476:1: ( ruleFormulaItem )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4476:1: ( ruleFormulaItem )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4477:1: ruleFormulaItem
            {
             before(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_rule__Formula__FiAssignment_09168);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Formula__FiAssignment_0"


    // $ANTLR start "rule__Formula__FeAssignment_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4486:1: rule__Formula__FeAssignment_2 : ( ruleFormulaExpression ) ;
    public final void rule__Formula__FeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4490:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4491:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4491:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4492:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__Formula__FeAssignment_29199);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Formula__FeAssignment_2"


    // $ANTLR start "rule__FormulaExpression__FiAssignment_0_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4501:1: rule__FormulaExpression__FiAssignment_0_0 : ( ruleFormulaItem ) ;
    public final void rule__FormulaExpression__FiAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4505:1: ( ( ruleFormulaItem ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4506:1: ( ruleFormulaItem )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4506:1: ( ruleFormulaItem )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4507:1: ruleFormulaItem
            {
             before(grammarAccess.getFormulaExpressionAccess().getFiFormulaItemParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_rule__FormulaExpression__FiAssignment_0_09230);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getFiFormulaItemParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__FormulaExpression__FiAssignment_0_0"


    // $ANTLR start "rule__FormulaExpression__MoAssignment_0_1_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4516:1: rule__FormulaExpression__MoAssignment_0_1_0 : ( ruleMathOperator ) ;
    public final void rule__FormulaExpression__MoAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4520:1: ( ( ruleMathOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4521:1: ( ruleMathOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4521:1: ( ruleMathOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4522:1: ruleMathOperator
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_0_1_09261);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__FormulaExpression__MoAssignment_0_1_0"


    // $ANTLR start "rule__FormulaExpression__FeAssignment_0_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4531:1: rule__FormulaExpression__FeAssignment_0_1_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__FeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4535:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4536:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4536:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4537:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFeFormulaExpressionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__FeAssignment_0_1_19292);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getFeFormulaExpressionParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__FormulaExpression__FeAssignment_0_1_1"


    // $ANTLR start "rule__FormulaExpression__Fe1Assignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4546:1: rule__FormulaExpression__Fe1Assignment_1_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__Fe1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4550:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4551:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4551:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4552:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe1FormulaExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe1Assignment_1_19323);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getFe1FormulaExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Fe1Assignment_1_1"


    // $ANTLR start "rule__FormulaExpression__MoAssignment_1_3_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4561:1: rule__FormulaExpression__MoAssignment_1_3_0 : ( ruleMathOperator ) ;
    public final void rule__FormulaExpression__MoAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4565:1: ( ( ruleMathOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4566:1: ( ruleMathOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4566:1: ( ruleMathOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4567:1: ruleMathOperator
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_1_3_09354);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_1_3_0_0()); 

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
    // $ANTLR end "rule__FormulaExpression__MoAssignment_1_3_0"


    // $ANTLR start "rule__FormulaExpression__Fe2Assignment_1_3_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4576:1: rule__FormulaExpression__Fe2Assignment_1_3_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__Fe2Assignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4580:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4581:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4581:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4582:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe2FormulaExpressionParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe2Assignment_1_3_19385);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionAccess().getFe2FormulaExpressionParserRuleCall_1_3_1_0()); 

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
    // $ANTLR end "rule__FormulaExpression__Fe2Assignment_1_3_1"


    // $ANTLR start "rule__FormulaItem__TAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4591:1: rule__FormulaItem__TAssignment_0 : ( ruleTerm ) ;
    public final void rule__FormulaItem__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4595:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4596:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4596:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4597:1: ruleTerm
            {
             before(grammarAccess.getFormulaItemAccess().getTTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__FormulaItem__TAssignment_09416);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getFormulaItemAccess().getTTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormulaItem__TAssignment_0"


    // $ANTLR start "rule__FormulaItem__TiAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4606:1: rule__FormulaItem__TiAssignment_1 : ( ruleTermInstance ) ;
    public final void rule__FormulaItem__TiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4610:1: ( ( ruleTermInstance ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4611:1: ( ruleTermInstance )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4611:1: ( ruleTermInstance )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4612:1: ruleTermInstance
            {
             before(grammarAccess.getFormulaItemAccess().getTiTermInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTermInstance_in_rule__FormulaItem__TiAssignment_19447);
            ruleTermInstance();

            state._fsp--;

             after(grammarAccess.getFormulaItemAccess().getTiTermInstanceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FormulaItem__TiAssignment_1"


    // $ANTLR start "rule__FormulaItem__TwaAssignment_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4621:1: rule__FormulaItem__TwaAssignment_2 : ( ruleTermWithAssociation ) ;
    public final void rule__FormulaItem__TwaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4625:1: ( ( ruleTermWithAssociation ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4626:1: ( ruleTermWithAssociation )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4626:1: ( ruleTermWithAssociation )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4627:1: ruleTermWithAssociation
            {
             before(grammarAccess.getFormulaItemAccess().getTwaTermWithAssociationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_rule__FormulaItem__TwaAssignment_29478);
            ruleTermWithAssociation();

            state._fsp--;

             after(grammarAccess.getFormulaItemAccess().getTwaTermWithAssociationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FormulaItem__TwaAssignment_2"


    // $ANTLR start "rule__MathOperator__SumAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4636:1: rule__MathOperator__SumAssignment_0 : ( ( KEYWORD_5 ) ) ;
    public final void rule__MathOperator__SumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4640:1: ( ( ( KEYWORD_5 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4641:1: ( ( KEYWORD_5 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4641:1: ( ( KEYWORD_5 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4642:1: ( KEYWORD_5 )
            {
             before(grammarAccess.getMathOperatorAccess().getSumPlusSignKeyword_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4643:1: ( KEYWORD_5 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4644:1: KEYWORD_5
            {
             before(grammarAccess.getMathOperatorAccess().getSumPlusSignKeyword_0_0()); 
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__MathOperator__SumAssignment_09514); 
             after(grammarAccess.getMathOperatorAccess().getSumPlusSignKeyword_0_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getSumPlusSignKeyword_0_0()); 

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
    // $ANTLR end "rule__MathOperator__SumAssignment_0"


    // $ANTLR start "rule__MathOperator__SubtractAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4659:1: rule__MathOperator__SubtractAssignment_1 : ( ( KEYWORD_7 ) ) ;
    public final void rule__MathOperator__SubtractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4663:1: ( ( ( KEYWORD_7 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4664:1: ( ( KEYWORD_7 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4664:1: ( ( KEYWORD_7 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4665:1: ( KEYWORD_7 )
            {
             before(grammarAccess.getMathOperatorAccess().getSubtractHyphenMinusKeyword_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4666:1: ( KEYWORD_7 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4667:1: KEYWORD_7
            {
             before(grammarAccess.getMathOperatorAccess().getSubtractHyphenMinusKeyword_1_0()); 
            match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__MathOperator__SubtractAssignment_19558); 
             after(grammarAccess.getMathOperatorAccess().getSubtractHyphenMinusKeyword_1_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getSubtractHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__MathOperator__SubtractAssignment_1"


    // $ANTLR start "rule__MathOperator__DivideAssignment_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4682:1: rule__MathOperator__DivideAssignment_2 : ( ( KEYWORD_9 ) ) ;
    public final void rule__MathOperator__DivideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4686:1: ( ( ( KEYWORD_9 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4687:1: ( ( KEYWORD_9 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4687:1: ( ( KEYWORD_9 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4688:1: ( KEYWORD_9 )
            {
             before(grammarAccess.getMathOperatorAccess().getDivideSolidusKeyword_2_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4689:1: ( KEYWORD_9 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4690:1: KEYWORD_9
            {
             before(grammarAccess.getMathOperatorAccess().getDivideSolidusKeyword_2_0()); 
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__MathOperator__DivideAssignment_29602); 
             after(grammarAccess.getMathOperatorAccess().getDivideSolidusKeyword_2_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getDivideSolidusKeyword_2_0()); 

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
    // $ANTLR end "rule__MathOperator__DivideAssignment_2"


    // $ANTLR start "rule__MathOperator__MultiplyAssignment_3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4705:1: rule__MathOperator__MultiplyAssignment_3 : ( ( KEYWORD_4 ) ) ;
    public final void rule__MathOperator__MultiplyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4709:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4710:1: ( ( KEYWORD_4 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4710:1: ( ( KEYWORD_4 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4711:1: ( KEYWORD_4 )
            {
             before(grammarAccess.getMathOperatorAccess().getMultiplyAsteriskKeyword_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4712:1: ( KEYWORD_4 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4713:1: KEYWORD_4
            {
             before(grammarAccess.getMathOperatorAccess().getMultiplyAsteriskKeyword_3_0()); 
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__MathOperator__MultiplyAssignment_39646); 
             after(grammarAccess.getMathOperatorAccess().getMultiplyAsteriskKeyword_3_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getMultiplyAsteriskKeyword_3_0()); 

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
    // $ANTLR end "rule__MathOperator__MultiplyAssignment_3"


    // $ANTLR start "rule__MathOperator__RAssignment_4"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4728:1: rule__MathOperator__RAssignment_4 : ( ( KEYWORD_1 ) ) ;
    public final void rule__MathOperator__RAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4732:1: ( ( ( KEYWORD_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4733:1: ( ( KEYWORD_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4733:1: ( ( KEYWORD_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4734:1: ( KEYWORD_1 )
            {
             before(grammarAccess.getMathOperatorAccess().getRPercentSignKeyword_4_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4735:1: ( KEYWORD_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4736:1: KEYWORD_1
            {
             before(grammarAccess.getMathOperatorAccess().getRPercentSignKeyword_4_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__MathOperator__RAssignment_49690); 
             after(grammarAccess.getMathOperatorAccess().getRPercentSignKeyword_4_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getRPercentSignKeyword_4_0()); 

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
    // $ANTLR end "rule__MathOperator__RAssignment_4"


    // $ANTLR start "rule__MathOperator__PAssignment_5"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4751:1: rule__MathOperator__PAssignment_5 : ( ( KEYWORD_17 ) ) ;
    public final void rule__MathOperator__PAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4755:1: ( ( ( KEYWORD_17 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4756:1: ( ( KEYWORD_17 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4756:1: ( ( KEYWORD_17 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4757:1: ( KEYWORD_17 )
            {
             before(grammarAccess.getMathOperatorAccess().getPAsteriskAsteriskKeyword_5_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4758:1: ( KEYWORD_17 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4759:1: KEYWORD_17
            {
             before(grammarAccess.getMathOperatorAccess().getPAsteriskAsteriskKeyword_5_0()); 
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__MathOperator__PAssignment_59734); 
             after(grammarAccess.getMathOperatorAccess().getPAsteriskAsteriskKeyword_5_0()); 

            }

             after(grammarAccess.getMathOperatorAccess().getPAsteriskAsteriskKeyword_5_0()); 

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
    // $ANTLR end "rule__MathOperator__PAssignment_5"


    // $ANTLR start "rule__RelationalOperator__OAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4774:1: rule__RelationalOperator__OAssignment_0 : ( ( KEYWORD_12 ) ) ;
    public final void rule__RelationalOperator__OAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4778:1: ( ( ( KEYWORD_12 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4779:1: ( ( KEYWORD_12 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4779:1: ( ( KEYWORD_12 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4780:1: ( KEYWORD_12 )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4781:1: ( KEYWORD_12 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4782:1: KEYWORD_12
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 
            match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__RelationalOperator__OAssignment_09778); 
             after(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 

            }

             after(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 

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
    // $ANTLR end "rule__RelationalOperator__OAssignment_0"


    // $ANTLR start "rule__RelationalOperator__OAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4797:1: rule__RelationalOperator__OAssignment_1 : ( ( KEYWORD_10 ) ) ;
    public final void rule__RelationalOperator__OAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4801:1: ( ( ( KEYWORD_10 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4802:1: ( ( KEYWORD_10 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4802:1: ( ( KEYWORD_10 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4803:1: ( KEYWORD_10 )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4804:1: ( KEYWORD_10 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4805:1: KEYWORD_10
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 
            match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__RelationalOperator__OAssignment_19822); 
             after(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 

            }

             after(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__RelationalOperator__OAssignment_1"


    // $ANTLR start "rule__RelationalOperator__OAssignment_2"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4820:1: rule__RelationalOperator__OAssignment_2 : ( ( KEYWORD_19 ) ) ;
    public final void rule__RelationalOperator__OAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4824:1: ( ( ( KEYWORD_19 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4825:1: ( ( KEYWORD_19 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4825:1: ( ( KEYWORD_19 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4826:1: ( KEYWORD_19 )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4827:1: ( KEYWORD_19 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4828:1: KEYWORD_19
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 
            match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__RelationalOperator__OAssignment_29866); 
             after(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 

            }

             after(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__RelationalOperator__OAssignment_2"


    // $ANTLR start "rule__RelationalOperator__OAssignment_3"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4843:1: rule__RelationalOperator__OAssignment_3 : ( ( KEYWORD_18 ) ) ;
    public final void rule__RelationalOperator__OAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4847:1: ( ( ( KEYWORD_18 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4848:1: ( ( KEYWORD_18 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4848:1: ( ( KEYWORD_18 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4849:1: ( KEYWORD_18 )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4850:1: ( KEYWORD_18 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4851:1: KEYWORD_18
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__RelationalOperator__OAssignment_39910); 
             after(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 

            }

             after(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RelationalOperator__OAssignment_3"


    // $ANTLR start "rule__RelationalOperator__NeoAssignment_4"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4866:1: rule__RelationalOperator__NeoAssignment_4 : ( ruleNotEqualOperator ) ;
    public final void rule__RelationalOperator__NeoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4870:1: ( ( ruleNotEqualOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4871:1: ( ruleNotEqualOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4871:1: ( ruleNotEqualOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4872:1: ruleNotEqualOperator
            {
             before(grammarAccess.getRelationalOperatorAccess().getNeoNotEqualOperatorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_rule__RelationalOperator__NeoAssignment_49949);
            ruleNotEqualOperator();

            state._fsp--;

             after(grammarAccess.getRelationalOperatorAccess().getNeoNotEqualOperatorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RelationalOperator__NeoAssignment_4"


    // $ANTLR start "rule__NotEqualOperator__NeAssignment"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4881:1: rule__NotEqualOperator__NeAssignment : ( ( KEYWORD_16 ) ) ;
    public final void rule__NotEqualOperator__NeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4885:1: ( ( ( KEYWORD_16 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4886:1: ( ( KEYWORD_16 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4886:1: ( ( KEYWORD_16 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4887:1: ( KEYWORD_16 )
            {
             before(grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4888:1: ( KEYWORD_16 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4889:1: KEYWORD_16
            {
             before(grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0()); 
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__NotEqualOperator__NeAssignment9985); 
             after(grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0()); 

            }

             after(grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0()); 

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
    // $ANTLR end "rule__NotEqualOperator__NeAssignment"


    // $ANTLR start "rule__Set__LAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4904:1: rule__Set__LAssignment_1 : ( ruleList ) ;
    public final void rule__Set__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4908:1: ( ( ruleList ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4909:1: ( ruleList )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4909:1: ( ruleList )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4910:1: ruleList
            {
             before(grammarAccess.getSetAccess().getLListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleList_in_rule__Set__LAssignment_110024);
            ruleList();

            state._fsp--;

             after(grammarAccess.getSetAccess().getLListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Set__LAssignment_1"


    // $ANTLR start "rule__Set__SAssignment_3_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4919:1: rule__Set__SAssignment_3_1 : ( ruleSet ) ;
    public final void rule__Set__SAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4923:1: ( ( ruleSet ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4924:1: ( ruleSet )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4924:1: ( ruleSet )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4925:1: ruleSet
            {
             before(grammarAccess.getSetAccess().getSSetParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSet_in_rule__Set__SAssignment_3_110055);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetAccess().getSSetParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Set__SAssignment_3_1"


    // $ANTLR start "rule__List__SlAssignment_0_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4934:1: rule__List__SlAssignment_0_0 : ( ruleStringLiteral ) ;
    public final void rule__List__SlAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4938:1: ( ( ruleStringLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4939:1: ( ruleStringLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4939:1: ( ruleStringLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4940:1: ruleStringLiteral
            {
             before(grammarAccess.getListAccess().getSlStringLiteralParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__List__SlAssignment_0_010086);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getListAccess().getSlStringLiteralParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__List__SlAssignment_0_0"


    // $ANTLR start "rule__List__OlAssignment_0_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4949:1: rule__List__OlAssignment_0_1 : ( ruleOtherLiteral ) ;
    public final void rule__List__OlAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4953:1: ( ( ruleOtherLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4954:1: ( ruleOtherLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4954:1: ( ruleOtherLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4955:1: ruleOtherLiteral
            {
             before(grammarAccess.getListAccess().getOlOtherLiteralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_rule__List__OlAssignment_0_110117);
            ruleOtherLiteral();

            state._fsp--;

             after(grammarAccess.getListAccess().getOlOtherLiteralParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__List__OlAssignment_0_1"


    // $ANTLR start "rule__List__LAssignment_1_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4964:1: rule__List__LAssignment_1_1 : ( ruleList ) ;
    public final void rule__List__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4968:1: ( ( ruleList ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4969:1: ( ruleList )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4969:1: ( ruleList )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLetaParser.g:4970:1: ruleList
            {
             before(grammarAccess.getListAccess().getLListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleList_in_rule__List__LAssignment_1_110148);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListAccess().getLListParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__List__LAssignment_1_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA2_eotS =
        "\22\uffff";
    static final String DFA2_eofS =
        "\22\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\13\4\40\1\13\1\51\1\uffff\10\36";
    static final String DFA2_maxS =
        "\1\50\1\uffff\1\52\4\51\1\52\1\51\1\uffff\10\50";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\10\uffff";
    static final String DFA2_specialS =
        "\22\uffff}>";
    static final String[] DFA2_transitionS = {
            "\3\1\1\uffff\1\1\37\uffff\1\2",
            "",
            "\1\20\3\uffff\1\7\1\uffff\1\6\1\5\12\uffff\1\4\1\11\1\3\1\10"+
            "\3\uffff\1\15\1\12\1\13\1\16\1\1\1\14\1\17",
            "\1\10\3\uffff\1\15\1\12\1\13\1\16\1\uffff\1\14",
            "\1\10\3\uffff\1\15\1\12\1\13\1\16\1\uffff\1\14",
            "\1\10\3\uffff\1\15\1\12\1\13\1\16\1\uffff\1\14",
            "\1\10\3\uffff\1\15\1\12\1\13\1\16\1\uffff\1\14",
            "\1\20\24\uffff\1\10\3\uffff\1\15\1\12\1\13\1\16\1\uffff\1\14"+
            "\1\17",
            "\1\21",
            "",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1",
            "\1\11\11\uffff\1\1"
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
            return "844:1: rule__FactComposite__Alternatives_0_0 : ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA4_minS =
        "\1\50\1\12\1\uffff\4\40\1\13\2\uffff";
    static final String DFA4_maxS =
        "\1\50\1\52\1\uffff\4\51\1\52\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\5\uffff\1\3\1\2";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\2\1\11\3\2\1\7\1\uffff\1\6\1\5\1\2\2\uffff\1\2\6\uffff\1"+
            "\4\1\uffff\1\3\1\10\3\uffff\4\11\1\2\2\11",
            "",
            "\1\10\3\uffff\4\11\1\uffff\1\11",
            "\1\10\3\uffff\4\11\1\uffff\1\11",
            "\1\10\3\uffff\4\11\1\uffff\1\11",
            "\1\10\3\uffff\4\11\1\uffff\1\11",
            "\1\11\24\uffff\1\10\3\uffff\4\11\1\uffff\2\11",
            "",
            ""
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
            return "892:1: rule__TermComposite__Alternatives_1 : ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA8_minS =
        "\1\50\1\12\4\40\1\13\3\uffff";
    static final String DFA8_maxS =
        "\1\50\1\52\4\51\1\52\3\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\3\1\2\1\1";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\11\1\10\3\11\1\6\1\11\1\5\1\4\2\11\1\uffff\3\11\1\uffff"+
            "\1\11\1\uffff\1\11\1\3\1\11\1\2\1\7\3\uffff\4\10\1\uffff\2\10",
            "\1\7\3\uffff\4\10\1\uffff\1\10",
            "\1\7\3\uffff\4\10\1\uffff\1\10",
            "\1\7\3\uffff\4\10\1\uffff\1\10",
            "\1\7\3\uffff\4\10\1\uffff\1\10",
            "\1\10\24\uffff\1\7\3\uffff\4\10\1\uffff\2\10",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "998:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleLeta_in_entryRuleLeta54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeta61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__0_in_ruleLeta91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__0_in_ruleTestCase155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerifyClause189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__0_in_ruleVerifyClause219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_entryRuleWhenClause246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenClause253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__0_in_ruleWhenClause283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__0_in_ruleSetClause347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_entryRuleFactComposite374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactComposite381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Alternatives_in_ruleFactComposite411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_entryRuleLogicalOperator438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOperator445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_ruleLogicalOperator475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_entryRuleFactExt566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactExt573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__0_in_ruleFactExt603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_entryRuleTermComposite630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermComposite637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__0_in_ruleTermComposite667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdAssignment_in_ruleTerm731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_entryRuleTermInstance758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermInstance765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Alternatives_in_ruleTermInstance795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermWithAssociation829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__0_in_ruleTermWithAssociation859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_entryRuleComplement950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplement957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Complement__IdAssignment_in_ruleComplement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaExpression1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Alternatives_in_ruleFormulaExpression1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaItem1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__Alternatives_in_ruleFormulaItem1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator1270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__Alternatives_in_ruleRelationalOperator1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualOperator1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotEqualOperator__NeAssignment_in_ruleNotEqualOperator1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleSet1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLiteral1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherLiteral__Alternatives_in_ruleOtherLiteral1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_entryRuleTestPackage1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestPackage1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__0_in_ruleTestPackage1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__0_in_rule__FactComposite__Alternatives1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__0_in_rule__FactComposite__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FAssignment_0_0_0_in_rule__FactComposite__Alternatives_0_01778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FoAssignment_0_0_1_in_rule__FactComposite__Alternatives_0_01796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__LogicalOperator__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__LogicalOperator__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermAssignment_1_0_in_rule__TermComposite__Alternatives_11884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermInstanceAssignment_1_1_in_rule__TermComposite__Alternatives_11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermWithAssociationAssignment_1_2_in_rule__TermComposite__Alternatives_11920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__0_in_rule__TermInstance__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__0_in_rule__TermInstance__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__0_in_rule__Quantifier__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__0_in_rule__Quantifier__Alternatives2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__0_in_rule__Quantifier__Alternatives2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__0_in_rule__Quantifier__Alternatives2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__0_in_rule__FormulaExpression__Alternatives2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__0_in_rule__FormulaExpression__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TAssignment_0_in_rule__FormulaItem__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TiAssignment_1_in_rule__FormulaItem__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TwaAssignment_2_in_rule__FormulaItem__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__SumAssignment_0_in_rule__MathOperator__Alternatives2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__SubtractAssignment_1_in_rule__MathOperator__Alternatives2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__DivideAssignment_2_in_rule__MathOperator__Alternatives2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__MultiplyAssignment_3_in_rule__MathOperator__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__RAssignment_4_in_rule__MathOperator__Alternatives2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__PAssignment_5_in_rule__MathOperator__Alternatives2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_0_in_rule__RelationalOperator__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_1_in_rule__RelationalOperator__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_2_in_rule__RelationalOperator__Alternatives2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_3_in_rule__RelationalOperator__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__NeoAssignment_4_in_rule__RelationalOperator__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__SlAssignment_0_0_in_rule__List__Alternatives_02439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__OlAssignment_0_1_in_rule__List__Alternatives_02457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__Alternatives2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__StringLiteral__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__OtherLiteral__Alternatives2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_FLOAT_in_rule__OtherLiteral__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__OtherLiteral__Alternatives2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_INTEGER_in_rule__OtherLiteral__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_rule__OtherLiteral__Alternatives2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__0__Impl_in_rule__Leta__Group__02640 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Leta__Group__1_in_rule__Leta__Group__02643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__TpAssignment_0_in_rule__Leta__Group__0__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__1__Impl_in_rule__Leta__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2730 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2742 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rule__TestCase__Group__0__Impl_in_rule__TestCase__Group__02779 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__1_in_rule__TestCase__Group__02782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__TestCase__Group__0__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__1__Impl_in_rule__TestCase__Group__12841 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__TestCase__Group__2_in_rule__TestCase__Group__12844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__IdAssignment_1_in_rule__TestCase__Group__1__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__2__Impl_in_rule__TestCase__Group__22901 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__3_in_rule__TestCase__Group__22904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__VAssignment_2_in_rule__TestCase__Group__2__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__3__Impl_in_rule__TestCase__Group__32961 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__4_in_rule__TestCase__Group__32964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__WAssignment_3_in_rule__TestCase__Group__3__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__4__Impl_in_rule__TestCase__Group__43021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__SAssignment_4_in_rule__TestCase__Group__4__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__0__Impl_in_rule__VerifyClause__Group__03089 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__1_in_rule__VerifyClause__Group__03092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__VerifyClause__Group__0__Impl3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__1__Impl_in_rule__VerifyClause__Group__13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__FcAssignment_1_in_rule__VerifyClause__Group__1__Impl3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__0__Impl_in_rule__WhenClause__Group__03212 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__1_in_rule__WhenClause__Group__03215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__WhenClause__Group__0__Impl3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__1__Impl_in_rule__WhenClause__Group__13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__FcAssignment_1_in_rule__WhenClause__Group__1__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__0__Impl_in_rule__SetClause__Group__03335 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__1_in_rule__SetClause__Group__03338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__1__Impl_in_rule__SetClause__Group__13396 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__2_in_rule__SetClause__Group__13399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SetClause__Group__1__Impl3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__2__Impl_in_rule__SetClause__Group__23458 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__3_in_rule__SetClause__Group__23461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__SetClause__Group__2__Impl3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__3__Impl_in_rule__SetClause__Group__33520 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__4_in_rule__SetClause__Group__33523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__SAssignment_3_in_rule__SetClause__Group__3__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__4__Impl_in_rule__SetClause__Group__43581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__SetClause__Group__4__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__0__Impl_in_rule__FactComposite__Group_0__03650 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__1_in_rule__FactComposite__Group_0__03653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Alternatives_0_0_in_rule__FactComposite__Group_0__0__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__1__Impl_in_rule__FactComposite__Group_0__13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__0_in_rule__FactComposite__Group_0__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__0__Impl_in_rule__FactComposite__Group_0_1__03772 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__1_in_rule__FactComposite__Group_0_1__03775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__OpAssignment_0_1_0_in_rule__FactComposite__Group_0_1__0__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__1__Impl_in_rule__FactComposite__Group_0_1__13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FcAssignment_0_1_1_in_rule__FactComposite__Group_0_1__1__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__0__Impl_in_rule__FactComposite__Group_1__03893 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__1_in_rule__FactComposite__Group_1__03896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__FactComposite__Group_1__0__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__1__Impl_in_rule__FactComposite__Group_1__13955 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__2_in_rule__FactComposite__Group_1__13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Fc1Assignment_1_1_in_rule__FactComposite__Group_1__1__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__2__Impl_in_rule__FactComposite__Group_1__24015 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__3_in_rule__FactComposite__Group_1__24018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__FactComposite__Group_1__2__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__3__Impl_in_rule__FactComposite__Group_1__34077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__0_in_rule__FactComposite__Group_1__3__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__0__Impl_in_rule__FactComposite__Group_1_3__04143 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__1_in_rule__FactComposite__Group_1_3__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__OpAssignment_1_3_0_in_rule__FactComposite__Group_1_3__0__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__1__Impl_in_rule__FactComposite__Group_1_3__14203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Fc2Assignment_1_3_1_in_rule__FactComposite__Group_1_3__1__Impl4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__04264 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__04267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__TermCompositeAssignment_0_in_rule__Fact__Group__0__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__14324 = new BitSet(new long[]{0x0000010000000170L});
    public static final BitSet FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__ComplementAssignment_1_in_rule__Fact__Group__1__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__24384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__04448 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__TermComposite2Assignment_2_0_in_rule__Fact__Group_2__0__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__14508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__FactExtAssignment_2_1_in_rule__Fact__Group_2__1__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__0__Impl_in_rule__FactExt__Group__04570 = new BitSet(new long[]{0x0000010000000170L});
    public static final BitSet FOLLOW_rule__FactExt__Group__1_in_rule__FactExt__Group__04573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__ComplementAssignment_0_in_rule__FactExt__Group__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__1__Impl_in_rule__FactExt__Group__14630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__0_in_rule__FactExt__Group__1__Impl4657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__0__Impl_in_rule__FactExt__Group_1__04692 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__1_in_rule__FactExt__Group_1__04695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__TermCompositeAssignment_1_0_in_rule__FactExt__Group_1__0__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__1__Impl_in_rule__FactExt__Group_1__14752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__FactExtAssignment_1_1_in_rule__FactExt__Group_1__1__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__0__Impl_in_rule__TermComposite__Group__04814 = new BitSet(new long[]{0x0000010000000170L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__1_in_rule__TermComposite__Group__04817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__QuantifierAssignment_0_in_rule__TermComposite__Group__0__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__1__Impl_in_rule__TermComposite__Group__14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Alternatives_1_in_rule__TermComposite__Group__1__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__0__Impl_in_rule__TermInstance__Group_0__04936 = new BitSet(new long[]{0x0000040000008800L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__1_in_rule__TermInstance__Group_0__04939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__TermAssignment_0_0_in_rule__TermInstance__Group_0__0__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__1__Impl_in_rule__TermInstance__Group_0__14996 = new BitSet(new long[]{0x0000040000008800L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__2_in_rule__TermInstance__Group_0__14999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__NotEqualOperatorAssignment_0_1_in_rule__TermInstance__Group_0__1__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__2__Impl_in_rule__TermInstance__Group_0__25057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__StringLiteralAssignment_0_2_in_rule__TermInstance__Group_0__2__Impl5084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__0__Impl_in_rule__TermInstance__Group_1__05120 = new BitSet(new long[]{0x000002F0A0068000L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__1_in_rule__TermInstance__Group_1__05123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__TermAssignment_1_0_in_rule__TermInstance__Group_1__0__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__1__Impl_in_rule__TermInstance__Group_1__15180 = new BitSet(new long[]{0x000002F0A0068000L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__2_in_rule__TermInstance__Group_1__15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__RelationalOperatorAssignment_1_1_in_rule__TermInstance__Group_1__1__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__2__Impl_in_rule__TermInstance__Group_1__25241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__OtherLiteralAssignment_1_2_in_rule__TermInstance__Group_1__2__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__0__Impl_in_rule__TermWithAssociation__Group__05304 = new BitSet(new long[]{0x00000001A0068000L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__1_in_rule__TermWithAssociation__Group__05307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__TAssignment_0_in_rule__TermWithAssociation__Group__0__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__1__Impl_in_rule__TermWithAssociation__Group__15364 = new BitSet(new long[]{0x00000001A0068000L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__2_in_rule__TermWithAssociation__Group__15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__RoAssignment_1_in_rule__TermWithAssociation__Group__1__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__2__Impl_in_rule__TermWithAssociation__Group__25425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__3_in_rule__TermWithAssociation__Group__25428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__TermWithAssociation__Group__2__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__3__Impl_in_rule__TermWithAssociation__Group__35487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__IndexAssignment_3_in_rule__TermWithAssociation__Group__3__Impl5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__0__Impl_in_rule__Quantifier__Group_0__05552 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__1_in_rule__Quantifier__Group_0__05555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__Quantifier__Group_0__0__Impl5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__1__Impl_in_rule__Quantifier__Group_0__15614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_0_1_in_rule__Quantifier__Group_0__1__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__0__Impl_in_rule__Quantifier__Group_1__05675 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__1_in_rule__Quantifier__Group_1__05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__Quantifier__Group_1__0__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__1__Impl_in_rule__Quantifier__Group_1__15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_1_1_in_rule__Quantifier__Group_1__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__0__Impl_in_rule__Quantifier__Group_2__05798 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__1_in_rule__Quantifier__Group_2__05801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__Quantifier__Group_2__0__Impl5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__1__Impl_in_rule__Quantifier__Group_2__15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_2_1_in_rule__Quantifier__Group_2__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__0__Impl_in_rule__Quantifier__Group_3__05921 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__1_in_rule__Quantifier__Group_3__05924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__Quantifier__Group_3__0__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__1__Impl_in_rule__Quantifier__Group_3__15983 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__2_in_rule__Quantifier__Group_3__15986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__V1Assignment_3_1_in_rule__Quantifier__Group_3__1__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__2__Impl_in_rule__Quantifier__Group_3__26043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__V2Assignment_3_2_in_rule__Quantifier__Group_3__2__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06106 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__FiAssignment_0_in_rule__Formula__Group__0__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16166 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__Formula__Group__1__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__FeAssignment_2_in_rule__Formula__Group__2__Impl6255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__0__Impl_in_rule__FormulaExpression__Group_0__06291 = new BitSet(new long[]{0x0000000015910000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__1_in_rule__FormulaExpression__Group_0__06294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__FiAssignment_0_0_in_rule__FormulaExpression__Group_0__0__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__1__Impl_in_rule__FormulaExpression__Group_0__16351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__0_in_rule__FormulaExpression__Group_0__1__Impl6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__0__Impl_in_rule__FormulaExpression__Group_0_1__06413 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__1_in_rule__FormulaExpression__Group_0_1__06416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__MoAssignment_0_1_0_in_rule__FormulaExpression__Group_0_1__0__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__1__Impl_in_rule__FormulaExpression__Group_0_1__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__FeAssignment_0_1_1_in_rule__FormulaExpression__Group_0_1__1__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__0__Impl_in_rule__FormulaExpression__Group_1__06534 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__1_in_rule__FormulaExpression__Group_1__06537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__FormulaExpression__Group_1__0__Impl6565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__1__Impl_in_rule__FormulaExpression__Group_1__16596 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__2_in_rule__FormulaExpression__Group_1__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Fe1Assignment_1_1_in_rule__FormulaExpression__Group_1__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__2__Impl_in_rule__FormulaExpression__Group_1__26656 = new BitSet(new long[]{0x0000000015910000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__3_in_rule__FormulaExpression__Group_1__26659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__FormulaExpression__Group_1__2__Impl6687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__3__Impl_in_rule__FormulaExpression__Group_1__36718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__0_in_rule__FormulaExpression__Group_1__3__Impl6745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__0__Impl_in_rule__FormulaExpression__Group_1_3__06784 = new BitSet(new long[]{0x0000010000200170L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__1_in_rule__FormulaExpression__Group_1_3__06787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__MoAssignment_1_3_0_in_rule__FormulaExpression__Group_1_3__0__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__1__Impl_in_rule__FormulaExpression__Group_1_3__16844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Fe2Assignment_1_3_1_in_rule__FormulaExpression__Group_1_3__1__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06905 = new BitSet(new long[]{0x000006F0A0068800L});
    public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Set__Group__0__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16967 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__LAssignment_1_in_rule__Set__Group__1__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__27027 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Set__Group__3_in_rule__Set__Group__27030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__Set__Group__2__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__37089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__07155 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__07158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Set__Group_3__0__Impl7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__17217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__SAssignment_3_1_in_rule__Set__Group_3__1__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__07278 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__07281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl7308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__17338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__0_in_rule__List__Group__1__Impl7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__0__Impl_in_rule__List__Group_1__07400 = new BitSet(new long[]{0x000006F0A0068800L});
    public static final BitSet FOLLOW_rule__List__Group_1__1_in_rule__List__Group_1__07403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__List__Group_1__0__Impl7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__1__Impl_in_rule__List__Group_1__17462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__LAssignment_1_1_in_rule__List__Group_1__1__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__0__Impl_in_rule__TestPackage__Group__07523 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__1_in_rule__TestPackage__Group__07526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__TestPackage__Group__0__Impl7554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__1__Impl_in_rule__TestPackage__Group__17585 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__2_in_rule__TestPackage__Group__17588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestPackage__Group__1__Impl7615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__2__Impl_in_rule__TestPackage__Group__27644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__0_in_rule__TestPackage__Group__2__Impl7671 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__0__Impl_in_rule__TestPackage__Group_2__07708 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__1_in_rule__TestPackage__Group_2__07711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__TestPackage__Group_2__0__Impl7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__1__Impl_in_rule__TestPackage__Group_2__17770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestPackage__Group_2__1__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_rule__Leta__TpAssignment_07835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_rule__Leta__TcAssignment_17866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestCase__IdAssignment_17897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_rule__TestCase__VAssignment_27928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_rule__TestCase__WAssignment_37959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_rule__TestCase__SAssignment_47990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_rule__VerifyClause__FcAssignment_18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_rule__WhenClause__FcAssignment_18052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_rule__SetClause__SAssignment_38083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__FactComposite__FAssignment_0_0_08114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__FactComposite__FoAssignment_0_0_18145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__FactComposite__OpAssignment_0_1_08176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_rule__FactComposite__FcAssignment_0_1_18207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_rule__FactComposite__Fc1Assignment_1_18238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOperator_in_rule__FactComposite__OpAssignment_1_3_08269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactComposite_in_rule__FactComposite__Fc2Assignment_1_3_18300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__Fact__TermCompositeAssignment_08331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_rule__Fact__ComplementAssignment_18362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__Fact__TermComposite2Assignment_2_08393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_rule__Fact__FactExtAssignment_2_18424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_rule__FactExt__ComplementAssignment_08455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__FactExt__TermCompositeAssignment_1_08486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_rule__FactExt__FactExtAssignment_1_18517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__TermComposite__QuantifierAssignment_08548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermComposite__TermAssignment_1_08579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_rule__TermComposite__TermInstanceAssignment_1_18610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_rule__TermComposite__TermWithAssociationAssignment_1_28641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__IdAssignment8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_0_08703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_rule__TermInstance__NotEqualOperatorAssignment_0_18734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__TermInstance__StringLiteralAssignment_0_28765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_1_08796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rule__TermInstance__RelationalOperatorAssignment_1_18827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_rule__TermInstance__OtherLiteralAssignment_1_28858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermWithAssociation__TAssignment_08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rule__TermWithAssociation__RoAssignment_18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TermWithAssociation__IndexAssignment_38951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_0_18982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_1_19013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_2_19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__V1Assignment_3_19075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__V2Assignment_3_29106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Complement__IdAssignment9137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_rule__Formula__FiAssignment_09168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__Formula__FeAssignment_29199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_rule__FormulaExpression__FiAssignment_0_09230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_0_1_09261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__FeAssignment_0_1_19292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe1Assignment_1_19323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_1_3_09354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe2Assignment_1_3_19385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FormulaItem__TAssignment_09416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_rule__FormulaItem__TiAssignment_19447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_rule__FormulaItem__TwaAssignment_29478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__MathOperator__SumAssignment_09514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__MathOperator__SubtractAssignment_19558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__MathOperator__DivideAssignment_29602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__MathOperator__MultiplyAssignment_39646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__MathOperator__RAssignment_49690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__MathOperator__PAssignment_59734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__RelationalOperator__OAssignment_09778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__RelationalOperator__OAssignment_19822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__RelationalOperator__OAssignment_29866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__RelationalOperator__OAssignment_39910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_rule__RelationalOperator__NeoAssignment_49949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__NotEqualOperator__NeAssignment9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Set__LAssignment_110024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_rule__Set__SAssignment_3_110055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__List__SlAssignment_0_010086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_rule__List__OlAssignment_0_110117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__List__LAssignment_1_110148 = new BitSet(new long[]{0x0000000000000002L});

}