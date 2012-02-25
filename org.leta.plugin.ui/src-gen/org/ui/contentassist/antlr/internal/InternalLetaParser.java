package org.ui.contentassist.antlr.internal; 

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FLOAT", "RULE_MINUS_FLOAT", "RULE_INT", "RULE_MINUS_INTEGER", "RULE_DATE_TIME", "RULE_ID", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!='", "'And'", "'Or'", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'null'", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'@'", "'atLeast'", "'atMost'", "'exactly'", "'atLeastAndAtMost'", "'='", "','", "'Package'", "'.'", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int RULE_ID=10;
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


        public InternalLetaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLetaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLetaParser.tokenNames; }
    public String getGrammarFileName() { return "../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g"; }


     
     	private LetaGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LetaGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLeta"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:60:1: entryRuleLeta : ruleLeta EOF ;
    public final void entryRuleLeta() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:61:1: ( ruleLeta EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:62:1: ruleLeta EOF
            {
             before(grammarAccess.getLetaRule()); 
            pushFollow(FOLLOW_ruleLeta_in_entryRuleLeta61);
            ruleLeta();

            state._fsp--;

             after(grammarAccess.getLetaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeta68); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:69:1: ruleLeta : ( ( rule__Leta__Group__0 ) ) ;
    public final void ruleLeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:73:2: ( ( ( rule__Leta__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:74:1: ( ( rule__Leta__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:74:1: ( ( rule__Leta__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:75:1: ( rule__Leta__Group__0 )
            {
             before(grammarAccess.getLetaAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:76:1: ( rule__Leta__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:76:2: rule__Leta__Group__0
            {
            pushFollow(FOLLOW_rule__Leta__Group__0_in_ruleLeta94);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:88:1: entryRuleTestCase : ruleTestCase EOF ;
    public final void entryRuleTestCase() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:89:1: ( ruleTestCase EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:90:1: ruleTestCase EOF
            {
             before(grammarAccess.getTestCaseRule()); 
            pushFollow(FOLLOW_ruleTestCase_in_entryRuleTestCase121);
            ruleTestCase();

            state._fsp--;

             after(grammarAccess.getTestCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestCase128); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:97:1: ruleTestCase : ( ( rule__TestCase__Group__0 ) ) ;
    public final void ruleTestCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:101:2: ( ( ( rule__TestCase__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:102:1: ( ( rule__TestCase__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:102:1: ( ( rule__TestCase__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:103:1: ( rule__TestCase__Group__0 )
            {
             before(grammarAccess.getTestCaseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:104:1: ( rule__TestCase__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:104:2: rule__TestCase__Group__0
            {
            pushFollow(FOLLOW_rule__TestCase__Group__0_in_ruleTestCase154);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:116:1: entryRuleVerifyClause : ruleVerifyClause EOF ;
    public final void entryRuleVerifyClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:117:1: ( ruleVerifyClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:118:1: ruleVerifyClause EOF
            {
             before(grammarAccess.getVerifyClauseRule()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause181);
            ruleVerifyClause();

            state._fsp--;

             after(grammarAccess.getVerifyClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerifyClause188); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:125:1: ruleVerifyClause : ( ( rule__VerifyClause__Group__0 ) ) ;
    public final void ruleVerifyClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:129:2: ( ( ( rule__VerifyClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:130:1: ( ( rule__VerifyClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:130:1: ( ( rule__VerifyClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:131:1: ( rule__VerifyClause__Group__0 )
            {
             before(grammarAccess.getVerifyClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:132:1: ( rule__VerifyClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:132:2: rule__VerifyClause__Group__0
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__0_in_ruleVerifyClause214);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:144:1: entryRuleWhenClause : ruleWhenClause EOF ;
    public final void entryRuleWhenClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:145:1: ( ruleWhenClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:146:1: ruleWhenClause EOF
            {
             before(grammarAccess.getWhenClauseRule()); 
            pushFollow(FOLLOW_ruleWhenClause_in_entryRuleWhenClause241);
            ruleWhenClause();

            state._fsp--;

             after(grammarAccess.getWhenClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWhenClause248); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:153:1: ruleWhenClause : ( ( rule__WhenClause__Group__0 ) ) ;
    public final void ruleWhenClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:157:2: ( ( ( rule__WhenClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:158:1: ( ( rule__WhenClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:158:1: ( ( rule__WhenClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:159:1: ( rule__WhenClause__Group__0 )
            {
             before(grammarAccess.getWhenClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:160:1: ( rule__WhenClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:160:2: rule__WhenClause__Group__0
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__0_in_ruleWhenClause274);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:172:1: entryRuleSetClause : ruleSetClause EOF ;
    public final void entryRuleSetClause() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:173:1: ( ruleSetClause EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:174:1: ruleSetClause EOF
            {
             before(grammarAccess.getSetClauseRule()); 
            pushFollow(FOLLOW_ruleSetClause_in_entryRuleSetClause301);
            ruleSetClause();

            state._fsp--;

             after(grammarAccess.getSetClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSetClause308); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:181:1: ruleSetClause : ( ( rule__SetClause__Group__0 ) ) ;
    public final void ruleSetClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:185:2: ( ( ( rule__SetClause__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:186:1: ( ( rule__SetClause__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:186:1: ( ( rule__SetClause__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:187:1: ( rule__SetClause__Group__0 )
            {
             before(grammarAccess.getSetClauseAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:188:1: ( rule__SetClause__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:188:2: rule__SetClause__Group__0
            {
            pushFollow(FOLLOW_rule__SetClause__Group__0_in_ruleSetClause334);
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


    // $ANTLR start "entryRulefactComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:200:1: entryRulefactComposite : rulefactComposite EOF ;
    public final void entryRulefactComposite() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:201:1: ( rulefactComposite EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:202:1: rulefactComposite EOF
            {
             before(grammarAccess.getFactCompositeRule()); 
            pushFollow(FOLLOW_rulefactComposite_in_entryRulefactComposite361);
            rulefactComposite();

            state._fsp--;

             after(grammarAccess.getFactCompositeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulefactComposite368); 

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
    // $ANTLR end "entryRulefactComposite"


    // $ANTLR start "rulefactComposite"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:209:1: rulefactComposite : ( ( rule__FactComposite__Alternatives ) ) ;
    public final void rulefactComposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:213:2: ( ( ( rule__FactComposite__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:214:1: ( ( rule__FactComposite__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:214:1: ( ( rule__FactComposite__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:215:1: ( rule__FactComposite__Alternatives )
            {
             before(grammarAccess.getFactCompositeAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:216:1: ( rule__FactComposite__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:216:2: rule__FactComposite__Alternatives
            {
            pushFollow(FOLLOW_rule__FactComposite__Alternatives_in_rulefactComposite394);
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
    // $ANTLR end "rulefactComposite"


    // $ANTLR start "entryRulelogicalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:228:1: entryRulelogicalOperator : rulelogicalOperator EOF ;
    public final void entryRulelogicalOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:229:1: ( rulelogicalOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:230:1: rulelogicalOperator EOF
            {
             before(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_rulelogicalOperator_in_entryRulelogicalOperator421);
            rulelogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelogicalOperator428); 

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
    // $ANTLR end "entryRulelogicalOperator"


    // $ANTLR start "rulelogicalOperator"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:237:1: rulelogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void rulelogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:241:2: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:242:1: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:242:1: ( ( rule__LogicalOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:243:1: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:244:1: ( rule__LogicalOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:244:2: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOperator__Alternatives_in_rulelogicalOperator454);
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
    // $ANTLR end "rulelogicalOperator"


    // $ANTLR start "entryRuleFact"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:256:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:257:1: ( ruleFact EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:258:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_ruleFact_in_entryRuleFact481);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFact488); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:265:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:269:2: ( ( ( rule__Fact__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:270:1: ( ( rule__Fact__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:270:1: ( ( rule__Fact__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:271:1: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:272:1: ( rule__Fact__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:272:2: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_rule__Fact__Group__0_in_ruleFact514);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:284:1: entryRuleFactExt : ruleFactExt EOF ;
    public final void entryRuleFactExt() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:285:1: ( ruleFactExt EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:286:1: ruleFactExt EOF
            {
             before(grammarAccess.getFactExtRule()); 
            pushFollow(FOLLOW_ruleFactExt_in_entryRuleFactExt541);
            ruleFactExt();

            state._fsp--;

             after(grammarAccess.getFactExtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFactExt548); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:293:1: ruleFactExt : ( ( rule__FactExt__Group__0 ) ) ;
    public final void ruleFactExt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:297:2: ( ( ( rule__FactExt__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:298:1: ( ( rule__FactExt__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:298:1: ( ( rule__FactExt__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:299:1: ( rule__FactExt__Group__0 )
            {
             before(grammarAccess.getFactExtAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:300:1: ( rule__FactExt__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:300:2: rule__FactExt__Group__0
            {
            pushFollow(FOLLOW_rule__FactExt__Group__0_in_ruleFactExt574);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:312:1: entryRuleTermComposite : ruleTermComposite EOF ;
    public final void entryRuleTermComposite() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:313:1: ( ruleTermComposite EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:314:1: ruleTermComposite EOF
            {
             before(grammarAccess.getTermCompositeRule()); 
            pushFollow(FOLLOW_ruleTermComposite_in_entryRuleTermComposite601);
            ruleTermComposite();

            state._fsp--;

             after(grammarAccess.getTermCompositeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermComposite608); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:321:1: ruleTermComposite : ( ( rule__TermComposite__Group__0 ) ) ;
    public final void ruleTermComposite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:325:2: ( ( ( rule__TermComposite__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:326:1: ( ( rule__TermComposite__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:326:1: ( ( rule__TermComposite__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:327:1: ( rule__TermComposite__Group__0 )
            {
             before(grammarAccess.getTermCompositeAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:328:1: ( rule__TermComposite__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:328:2: rule__TermComposite__Group__0
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__0_in_ruleTermComposite634);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:340:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:341:1: ( ruleTerm EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:342:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm661);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm668); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:349:1: ruleTerm : ( ( rule__Term__IdAssignment ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:353:2: ( ( ( rule__Term__IdAssignment ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:354:1: ( ( rule__Term__IdAssignment ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:354:1: ( ( rule__Term__IdAssignment ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:355:1: ( rule__Term__IdAssignment )
            {
             before(grammarAccess.getTermAccess().getIdAssignment()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:356:1: ( rule__Term__IdAssignment )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:356:2: rule__Term__IdAssignment
            {
            pushFollow(FOLLOW_rule__Term__IdAssignment_in_ruleTerm694);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:368:1: entryRuleTermInstance : ruleTermInstance EOF ;
    public final void entryRuleTermInstance() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:369:1: ( ruleTermInstance EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:370:1: ruleTermInstance EOF
            {
             before(grammarAccess.getTermInstanceRule()); 
            pushFollow(FOLLOW_ruleTermInstance_in_entryRuleTermInstance721);
            ruleTermInstance();

            state._fsp--;

             after(grammarAccess.getTermInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermInstance728); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:377:1: ruleTermInstance : ( ( rule__TermInstance__Alternatives ) ) ;
    public final void ruleTermInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:381:2: ( ( ( rule__TermInstance__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:382:1: ( ( rule__TermInstance__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:382:1: ( ( rule__TermInstance__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:383:1: ( rule__TermInstance__Alternatives )
            {
             before(grammarAccess.getTermInstanceAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:384:1: ( rule__TermInstance__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:384:2: rule__TermInstance__Alternatives
            {
            pushFollow(FOLLOW_rule__TermInstance__Alternatives_in_ruleTermInstance754);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:396:1: entryRuleTermWithAssociation : ruleTermWithAssociation EOF ;
    public final void entryRuleTermWithAssociation() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:397:1: ( ruleTermWithAssociation EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:398:1: ruleTermWithAssociation EOF
            {
             before(grammarAccess.getTermWithAssociationRule()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation781);
            ruleTermWithAssociation();

            state._fsp--;

             after(grammarAccess.getTermWithAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTermWithAssociation788); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:405:1: ruleTermWithAssociation : ( ( rule__TermWithAssociation__Group__0 ) ) ;
    public final void ruleTermWithAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:409:2: ( ( ( rule__TermWithAssociation__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:410:1: ( ( rule__TermWithAssociation__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:410:1: ( ( rule__TermWithAssociation__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:411:1: ( rule__TermWithAssociation__Group__0 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:412:1: ( rule__TermWithAssociation__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:412:2: rule__TermWithAssociation__Group__0
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__0_in_ruleTermWithAssociation814);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:424:1: entryRuleQuantifier : ruleQuantifier EOF ;
    public final void entryRuleQuantifier() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:425:1: ( ruleQuantifier EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:426:1: ruleQuantifier EOF
            {
             before(grammarAccess.getQuantifierRule()); 
            pushFollow(FOLLOW_ruleQuantifier_in_entryRuleQuantifier841);
            ruleQuantifier();

            state._fsp--;

             after(grammarAccess.getQuantifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifier848); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:433:1: ruleQuantifier : ( ( rule__Quantifier__Alternatives ) ) ;
    public final void ruleQuantifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:437:2: ( ( ( rule__Quantifier__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:438:1: ( ( rule__Quantifier__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:438:1: ( ( rule__Quantifier__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:439:1: ( rule__Quantifier__Alternatives )
            {
             before(grammarAccess.getQuantifierAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:440:1: ( rule__Quantifier__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:440:2: rule__Quantifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier874);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:452:1: entryRuleComplement : ruleComplement EOF ;
    public final void entryRuleComplement() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:453:1: ( ruleComplement EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:454:1: ruleComplement EOF
            {
             before(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_ruleComplement_in_entryRuleComplement901);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getComplementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplement908); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:461:1: ruleComplement : ( ( rule__Complement__IdAssignment ) ) ;
    public final void ruleComplement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:465:2: ( ( ( rule__Complement__IdAssignment ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:466:1: ( ( rule__Complement__IdAssignment ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:466:1: ( ( rule__Complement__IdAssignment ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:467:1: ( rule__Complement__IdAssignment )
            {
             before(grammarAccess.getComplementAccess().getIdAssignment()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:468:1: ( rule__Complement__IdAssignment )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:468:2: rule__Complement__IdAssignment
            {
            pushFollow(FOLLOW_rule__Complement__IdAssignment_in_ruleComplement934);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:480:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:481:1: ( ruleFormula EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:482:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_ruleFormula_in_entryRuleFormula961);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormula968); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:489:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:493:2: ( ( ( rule__Formula__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:494:1: ( ( rule__Formula__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:494:1: ( ( rule__Formula__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:495:1: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:496:1: ( rule__Formula__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:496:2: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_rule__Formula__Group__0_in_ruleFormula994);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:508:1: entryRuleFormulaExpression : ruleFormulaExpression EOF ;
    public final void entryRuleFormulaExpression() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:509:1: ( ruleFormulaExpression EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:510:1: ruleFormulaExpression EOF
            {
             before(grammarAccess.getFormulaExpressionRule()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression1021);
            ruleFormulaExpression();

            state._fsp--;

             after(grammarAccess.getFormulaExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaExpression1028); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:517:1: ruleFormulaExpression : ( ( rule__FormulaExpression__Alternatives ) ) ;
    public final void ruleFormulaExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:521:2: ( ( ( rule__FormulaExpression__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:522:1: ( ( rule__FormulaExpression__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:522:1: ( ( rule__FormulaExpression__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:523:1: ( rule__FormulaExpression__Alternatives )
            {
             before(grammarAccess.getFormulaExpressionAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:524:1: ( rule__FormulaExpression__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:524:2: rule__FormulaExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Alternatives_in_ruleFormulaExpression1054);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:536:1: entryRuleFormulaItem : ruleFormulaItem EOF ;
    public final void entryRuleFormulaItem() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:537:1: ( ruleFormulaItem EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:538:1: ruleFormulaItem EOF
            {
             before(grammarAccess.getFormulaItemRule()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem1081);
            ruleFormulaItem();

            state._fsp--;

             after(grammarAccess.getFormulaItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormulaItem1088); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:545:1: ruleFormulaItem : ( ( rule__FormulaItem__Alternatives ) ) ;
    public final void ruleFormulaItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:549:2: ( ( ( rule__FormulaItem__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:550:1: ( ( rule__FormulaItem__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:550:1: ( ( rule__FormulaItem__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:551:1: ( rule__FormulaItem__Alternatives )
            {
             before(grammarAccess.getFormulaItemAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:552:1: ( rule__FormulaItem__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:552:2: rule__FormulaItem__Alternatives
            {
            pushFollow(FOLLOW_rule__FormulaItem__Alternatives_in_ruleFormulaItem1114);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:564:1: entryRuleMathOperator : ruleMathOperator EOF ;
    public final void entryRuleMathOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:565:1: ( ruleMathOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:566:1: ruleMathOperator EOF
            {
             before(grammarAccess.getMathOperatorRule()); 
            pushFollow(FOLLOW_ruleMathOperator_in_entryRuleMathOperator1141);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getMathOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOperator1148); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:573:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:577:2: ( ( ( rule__MathOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:578:1: ( ( rule__MathOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:578:1: ( ( rule__MathOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:579:1: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:580:1: ( rule__MathOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:580:2: rule__MathOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1174);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:592:1: entryRuleRelationalOperator : ruleRelationalOperator EOF ;
    public final void entryRuleRelationalOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:593:1: ( ruleRelationalOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:594:1: ruleRelationalOperator EOF
            {
             before(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator1201);
            ruleRelationalOperator();

            state._fsp--;

             after(grammarAccess.getRelationalOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOperator1208); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:601:1: ruleRelationalOperator : ( ( rule__RelationalOperator__Alternatives ) ) ;
    public final void ruleRelationalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:605:2: ( ( ( rule__RelationalOperator__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:606:1: ( ( rule__RelationalOperator__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:606:1: ( ( rule__RelationalOperator__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:607:1: ( rule__RelationalOperator__Alternatives )
            {
             before(grammarAccess.getRelationalOperatorAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:608:1: ( rule__RelationalOperator__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:608:2: rule__RelationalOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationalOperator__Alternatives_in_ruleRelationalOperator1234);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:620:1: entryRuleNotEqualOperator : ruleNotEqualOperator EOF ;
    public final void entryRuleNotEqualOperator() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:621:1: ( ruleNotEqualOperator EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:622:1: ruleNotEqualOperator EOF
            {
             before(grammarAccess.getNotEqualOperatorRule()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator1261);
            ruleNotEqualOperator();

            state._fsp--;

             after(grammarAccess.getNotEqualOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualOperator1268); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:629:1: ruleNotEqualOperator : ( '!=' ) ;
    public final void ruleNotEqualOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:633:2: ( ( '!=' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:634:1: ( '!=' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:634:1: ( '!=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:635:1: '!='
            {
             before(grammarAccess.getNotEqualOperatorAccess().getExclamationMarkEqualsSignKeyword()); 
            match(input,16,FOLLOW_16_in_ruleNotEqualOperator1295); 
             after(grammarAccess.getNotEqualOperatorAccess().getExclamationMarkEqualsSignKeyword()); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:650:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:651:1: ( ruleSet EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:652:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_ruleSet_in_entryRuleSet1323);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSet1330); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:659:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:663:2: ( ( ( rule__Set__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:664:1: ( ( rule__Set__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:664:1: ( ( rule__Set__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:665:1: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:666:1: ( rule__Set__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:666:2: rule__Set__Group__0
            {
            pushFollow(FOLLOW_rule__Set__Group__0_in_ruleSet1356);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:678:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:679:1: ( ruleList EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:680:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList1383);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList1390); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:687:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:691:2: ( ( ( rule__List__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:692:1: ( ( rule__List__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:692:1: ( ( rule__List__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:693:1: ( rule__List__Group__0 )
            {
             before(grammarAccess.getListAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:694:1: ( rule__List__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:694:2: rule__List__Group__0
            {
            pushFollow(FOLLOW_rule__List__Group__0_in_ruleList1416);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:706:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:707:1: ( ruleStringLiteral EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:708:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1443);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral1450); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:715:1: ruleStringLiteral : ( ( rule__StringLiteral__Alternatives ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:719:2: ( ( ( rule__StringLiteral__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:720:1: ( ( rule__StringLiteral__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:720:1: ( ( rule__StringLiteral__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:721:1: ( rule__StringLiteral__Alternatives )
            {
             before(grammarAccess.getStringLiteralAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:722:1: ( rule__StringLiteral__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:722:2: rule__StringLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral1476);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:734:1: entryRuleOtherLiteral : ruleOtherLiteral EOF ;
    public final void entryRuleOtherLiteral() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:735:1: ( ruleOtherLiteral EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:736:1: ruleOtherLiteral EOF
            {
             before(grammarAccess.getOtherLiteralRule()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral1503);
            ruleOtherLiteral();

            state._fsp--;

             after(grammarAccess.getOtherLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherLiteral1510); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:743:1: ruleOtherLiteral : ( ( rule__OtherLiteral__Alternatives ) ) ;
    public final void ruleOtherLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:747:2: ( ( ( rule__OtherLiteral__Alternatives ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:748:1: ( ( rule__OtherLiteral__Alternatives ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:748:1: ( ( rule__OtherLiteral__Alternatives ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:749:1: ( rule__OtherLiteral__Alternatives )
            {
             before(grammarAccess.getOtherLiteralAccess().getAlternatives()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:750:1: ( rule__OtherLiteral__Alternatives )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:750:2: rule__OtherLiteral__Alternatives
            {
            pushFollow(FOLLOW_rule__OtherLiteral__Alternatives_in_ruleOtherLiteral1536);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:762:1: entryRuleTestPackage : ruleTestPackage EOF ;
    public final void entryRuleTestPackage() throws RecognitionException {
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:763:1: ( ruleTestPackage EOF )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:764:1: ruleTestPackage EOF
            {
             before(grammarAccess.getTestPackageRule()); 
            pushFollow(FOLLOW_ruleTestPackage_in_entryRuleTestPackage1563);
            ruleTestPackage();

            state._fsp--;

             after(grammarAccess.getTestPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestPackage1570); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:771:1: ruleTestPackage : ( ( rule__TestPackage__Group__0 ) ) ;
    public final void ruleTestPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:775:2: ( ( ( rule__TestPackage__Group__0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:776:1: ( ( rule__TestPackage__Group__0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:776:1: ( ( rule__TestPackage__Group__0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:777:1: ( rule__TestPackage__Group__0 )
            {
             before(grammarAccess.getTestPackageAccess().getGroup()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:778:1: ( rule__TestPackage__Group__0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:778:2: rule__TestPackage__Group__0
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__0_in_ruleTestPackage1596);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:790:1: rule__FactComposite__Alternatives : ( ( ( rule__FactComposite__Group_0__0 ) ) | ( ( rule__FactComposite__Group_1__0 ) ) );
    public final void rule__FactComposite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:794:1: ( ( ( rule__FactComposite__Group_0__0 ) ) | ( ( rule__FactComposite__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||(LA1_0>=35 && LA1_0<=38)) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:795:1: ( ( rule__FactComposite__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:795:1: ( ( rule__FactComposite__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:796:1: ( rule__FactComposite__Group_0__0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:797:1: ( rule__FactComposite__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:797:2: rule__FactComposite__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_0__0_in_rule__FactComposite__Alternatives1632);
                    rule__FactComposite__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:801:6: ( ( rule__FactComposite__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:801:6: ( ( rule__FactComposite__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:802:1: ( rule__FactComposite__Group_1__0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:803:1: ( rule__FactComposite__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:803:2: rule__FactComposite__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_1__0_in_rule__FactComposite__Alternatives1650);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:812:1: rule__FactComposite__Alternatives_0_0 : ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) );
    public final void rule__FactComposite__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:816:1: ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:817:1: ( ( rule__FactComposite__FAssignment_0_0_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:817:1: ( ( rule__FactComposite__FAssignment_0_0_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:818:1: ( rule__FactComposite__FAssignment_0_0_0 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getFAssignment_0_0_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:819:1: ( rule__FactComposite__FAssignment_0_0_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:819:2: rule__FactComposite__FAssignment_0_0_0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__FAssignment_0_0_0_in_rule__FactComposite__Alternatives_0_01683);
                    rule__FactComposite__FAssignment_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactCompositeAccess().getFAssignment_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:823:6: ( ( rule__FactComposite__FoAssignment_0_0_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:823:6: ( ( rule__FactComposite__FoAssignment_0_0_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:824:1: ( rule__FactComposite__FoAssignment_0_0_1 )
                    {
                     before(grammarAccess.getFactCompositeAccess().getFoAssignment_0_0_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:825:1: ( rule__FactComposite__FoAssignment_0_0_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:825:2: rule__FactComposite__FoAssignment_0_0_1
                    {
                    pushFollow(FOLLOW_rule__FactComposite__FoAssignment_0_0_1_in_rule__FactComposite__Alternatives_0_01701);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:834:1: rule__LogicalOperator__Alternatives : ( ( 'And' ) | ( 'Or' ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:838:1: ( ( 'And' ) | ( 'Or' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:839:1: ( 'And' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:839:1: ( 'And' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:840:1: 'And'
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__LogicalOperator__Alternatives1735); 
                     after(grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:847:6: ( 'Or' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:847:6: ( 'Or' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:848:1: 'Or'
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__LogicalOperator__Alternatives1755); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:860:1: rule__TermComposite__Alternatives_1 : ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) );
    public final void rule__TermComposite__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:864:1: ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:865:1: ( ( rule__TermComposite__TermAssignment_1_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:865:1: ( ( rule__TermComposite__TermAssignment_1_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:866:1: ( rule__TermComposite__TermAssignment_1_0 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermAssignment_1_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:867:1: ( rule__TermComposite__TermAssignment_1_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:867:2: rule__TermComposite__TermAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermAssignment_1_0_in_rule__TermComposite__Alternatives_11789);
                    rule__TermComposite__TermAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermCompositeAccess().getTermAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:871:6: ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:871:6: ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:872:1: ( rule__TermComposite__TermInstanceAssignment_1_1 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermInstanceAssignment_1_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:873:1: ( rule__TermComposite__TermInstanceAssignment_1_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:873:2: rule__TermComposite__TermInstanceAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermInstanceAssignment_1_1_in_rule__TermComposite__Alternatives_11807);
                    rule__TermComposite__TermInstanceAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermCompositeAccess().getTermInstanceAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:877:6: ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:877:6: ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:878:1: ( rule__TermComposite__TermWithAssociationAssignment_1_2 )
                    {
                     before(grammarAccess.getTermCompositeAccess().getTermWithAssociationAssignment_1_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:879:1: ( rule__TermComposite__TermWithAssociationAssignment_1_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:879:2: rule__TermComposite__TermWithAssociationAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__TermComposite__TermWithAssociationAssignment_1_2_in_rule__TermComposite__Alternatives_11825);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:888:1: rule__TermInstance__Alternatives : ( ( ( rule__TermInstance__Group_0__0 ) ) | ( ( rule__TermInstance__Group_1__0 ) ) );
    public final void rule__TermInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:892:1: ( ( ( rule__TermInstance__Group_0__0 ) ) | ( ( rule__TermInstance__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2>=RULE_FLOAT && LA5_2<=RULE_DATE_TIME)) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==RULE_STRING||LA5_2==25) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                case 25:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_FLOAT:
                case RULE_MINUS_FLOAT:
                case RULE_INT:
                case RULE_MINUS_INTEGER:
                case RULE_DATE_TIME:
                case 43:
                case 44:
                case 45:
                case 46:
                    {
                    alt5=2;
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
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:893:1: ( ( rule__TermInstance__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:893:1: ( ( rule__TermInstance__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:894:1: ( rule__TermInstance__Group_0__0 )
                    {
                     before(grammarAccess.getTermInstanceAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:895:1: ( rule__TermInstance__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:895:2: rule__TermInstance__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TermInstance__Group_0__0_in_rule__TermInstance__Alternatives1858);
                    rule__TermInstance__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermInstanceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:899:6: ( ( rule__TermInstance__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:899:6: ( ( rule__TermInstance__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:900:1: ( rule__TermInstance__Group_1__0 )
                    {
                     before(grammarAccess.getTermInstanceAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:901:1: ( rule__TermInstance__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:901:2: rule__TermInstance__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TermInstance__Group_1__0_in_rule__TermInstance__Alternatives1876);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:910:1: rule__Quantifier__Alternatives : ( ( ( rule__Quantifier__Group_0__0 ) ) | ( ( rule__Quantifier__Group_1__0 ) ) | ( ( rule__Quantifier__Group_2__0 ) ) | ( ( rule__Quantifier__Group_3__0 ) ) );
    public final void rule__Quantifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:914:1: ( ( ( rule__Quantifier__Group_0__0 ) ) | ( ( rule__Quantifier__Group_1__0 ) ) | ( ( rule__Quantifier__Group_2__0 ) ) | ( ( rule__Quantifier__Group_3__0 ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 37:
                {
                alt6=3;
                }
                break;
            case 38:
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
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:915:1: ( ( rule__Quantifier__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:915:1: ( ( rule__Quantifier__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:916:1: ( rule__Quantifier__Group_0__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:917:1: ( rule__Quantifier__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:917:2: rule__Quantifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_0__0_in_rule__Quantifier__Alternatives1909);
                    rule__Quantifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:921:6: ( ( rule__Quantifier__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:921:6: ( ( rule__Quantifier__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:922:1: ( rule__Quantifier__Group_1__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:923:1: ( rule__Quantifier__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:923:2: rule__Quantifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_1__0_in_rule__Quantifier__Alternatives1927);
                    rule__Quantifier__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:927:6: ( ( rule__Quantifier__Group_2__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:927:6: ( ( rule__Quantifier__Group_2__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:928:1: ( rule__Quantifier__Group_2__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:929:1: ( rule__Quantifier__Group_2__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:929:2: rule__Quantifier__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_2__0_in_rule__Quantifier__Alternatives1945);
                    rule__Quantifier__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuantifierAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:933:6: ( ( rule__Quantifier__Group_3__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:933:6: ( ( rule__Quantifier__Group_3__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:934:1: ( rule__Quantifier__Group_3__0 )
                    {
                     before(grammarAccess.getQuantifierAccess().getGroup_3()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:935:1: ( rule__Quantifier__Group_3__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:935:2: rule__Quantifier__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Quantifier__Group_3__0_in_rule__Quantifier__Alternatives1963);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:944:1: rule__FormulaExpression__Alternatives : ( ( ( rule__FormulaExpression__Group_0__0 ) ) | ( ( rule__FormulaExpression__Group_1__0 ) ) );
    public final void rule__FormulaExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:948:1: ( ( ( rule__FormulaExpression__Group_0__0 ) ) | ( ( rule__FormulaExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:949:1: ( ( rule__FormulaExpression__Group_0__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:949:1: ( ( rule__FormulaExpression__Group_0__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:950:1: ( rule__FormulaExpression__Group_0__0 )
                    {
                     before(grammarAccess.getFormulaExpressionAccess().getGroup_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:951:1: ( rule__FormulaExpression__Group_0__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:951:2: rule__FormulaExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_0__0_in_rule__FormulaExpression__Alternatives1996);
                    rule__FormulaExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:955:6: ( ( rule__FormulaExpression__Group_1__0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:955:6: ( ( rule__FormulaExpression__Group_1__0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:956:1: ( rule__FormulaExpression__Group_1__0 )
                    {
                     before(grammarAccess.getFormulaExpressionAccess().getGroup_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:957:1: ( rule__FormulaExpression__Group_1__0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:957:2: rule__FormulaExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_1__0_in_rule__FormulaExpression__Alternatives2014);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:966:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) );
    public final void rule__FormulaItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:970:1: ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:971:1: ( ( rule__FormulaItem__TAssignment_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:971:1: ( ( rule__FormulaItem__TAssignment_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:972:1: ( rule__FormulaItem__TAssignment_0 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTAssignment_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:973:1: ( rule__FormulaItem__TAssignment_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:973:2: rule__FormulaItem__TAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TAssignment_0_in_rule__FormulaItem__Alternatives2047);
                    rule__FormulaItem__TAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getTAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:977:6: ( ( rule__FormulaItem__TiAssignment_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:977:6: ( ( rule__FormulaItem__TiAssignment_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:978:1: ( rule__FormulaItem__TiAssignment_1 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTiAssignment_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:979:1: ( rule__FormulaItem__TiAssignment_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:979:2: rule__FormulaItem__TiAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TiAssignment_1_in_rule__FormulaItem__Alternatives2065);
                    rule__FormulaItem__TiAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormulaItemAccess().getTiAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:983:6: ( ( rule__FormulaItem__TwaAssignment_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:983:6: ( ( rule__FormulaItem__TwaAssignment_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:984:1: ( rule__FormulaItem__TwaAssignment_2 )
                    {
                     before(grammarAccess.getFormulaItemAccess().getTwaAssignment_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:985:1: ( rule__FormulaItem__TwaAssignment_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:985:2: rule__FormulaItem__TwaAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FormulaItem__TwaAssignment_2_in_rule__FormulaItem__Alternatives2083);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:994:1: rule__MathOperator__Alternatives : ( ( '+' ) | ( '-' ) | ( '/' ) | ( '*' ) | ( '%' ) | ( '**' ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:998:1: ( ( '+' ) | ( '-' ) | ( '/' ) | ( '*' ) | ( '%' ) | ( '**' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
                {
                alt9=5;
                }
                break;
            case 24:
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
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:999:1: ( '+' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:999:1: ( '+' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1000:1: '+'
                    {
                     before(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__MathOperator__Alternatives2117); 
                     after(grammarAccess.getMathOperatorAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1007:6: ( '-' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1007:6: ( '-' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1008:1: '-'
                    {
                     before(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__MathOperator__Alternatives2137); 
                     after(grammarAccess.getMathOperatorAccess().getHyphenMinusKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1015:6: ( '/' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1015:6: ( '/' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1016:1: '/'
                    {
                     before(grammarAccess.getMathOperatorAccess().getSolidusKeyword_2()); 
                    match(input,21,FOLLOW_21_in_rule__MathOperator__Alternatives2157); 
                     after(grammarAccess.getMathOperatorAccess().getSolidusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1023:6: ( '*' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1023:6: ( '*' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1024:1: '*'
                    {
                     before(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_3()); 
                    match(input,22,FOLLOW_22_in_rule__MathOperator__Alternatives2177); 
                     after(grammarAccess.getMathOperatorAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1031:6: ( '%' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1031:6: ( '%' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1032:1: '%'
                    {
                     before(grammarAccess.getMathOperatorAccess().getPercentSignKeyword_4()); 
                    match(input,23,FOLLOW_23_in_rule__MathOperator__Alternatives2197); 
                     after(grammarAccess.getMathOperatorAccess().getPercentSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1039:6: ( '**' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1039:6: ( '**' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1040:1: '**'
                    {
                     before(grammarAccess.getMathOperatorAccess().getAsteriskAsteriskKeyword_5()); 
                    match(input,24,FOLLOW_24_in_rule__MathOperator__Alternatives2217); 
                     after(grammarAccess.getMathOperatorAccess().getAsteriskAsteriskKeyword_5()); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1052:1: rule__RelationalOperator__Alternatives : ( ( ( rule__RelationalOperator__OAssignment_0 ) ) | ( ( rule__RelationalOperator__OAssignment_1 ) ) | ( ( rule__RelationalOperator__OAssignment_2 ) ) | ( ( rule__RelationalOperator__OAssignment_3 ) ) | ( ( rule__RelationalOperator__NeoAssignment_4 ) ) );
    public final void rule__RelationalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1056:1: ( ( ( rule__RelationalOperator__OAssignment_0 ) ) | ( ( rule__RelationalOperator__OAssignment_1 ) ) | ( ( rule__RelationalOperator__OAssignment_2 ) ) | ( ( rule__RelationalOperator__OAssignment_3 ) ) | ( ( rule__RelationalOperator__NeoAssignment_4 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 45:
                {
                alt10=3;
                }
                break;
            case 46:
                {
                alt10=4;
                }
                break;
            case 16:
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
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1057:1: ( ( rule__RelationalOperator__OAssignment_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1057:1: ( ( rule__RelationalOperator__OAssignment_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1058:1: ( rule__RelationalOperator__OAssignment_0 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1059:1: ( rule__RelationalOperator__OAssignment_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1059:2: rule__RelationalOperator__OAssignment_0
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_0_in_rule__RelationalOperator__Alternatives2251);
                    rule__RelationalOperator__OAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1063:6: ( ( rule__RelationalOperator__OAssignment_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1063:6: ( ( rule__RelationalOperator__OAssignment_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1064:1: ( rule__RelationalOperator__OAssignment_1 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1065:1: ( rule__RelationalOperator__OAssignment_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1065:2: rule__RelationalOperator__OAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_1_in_rule__RelationalOperator__Alternatives2269);
                    rule__RelationalOperator__OAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1069:6: ( ( rule__RelationalOperator__OAssignment_2 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1069:6: ( ( rule__RelationalOperator__OAssignment_2 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1070:1: ( rule__RelationalOperator__OAssignment_2 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_2()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1071:1: ( rule__RelationalOperator__OAssignment_2 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1071:2: rule__RelationalOperator__OAssignment_2
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_2_in_rule__RelationalOperator__Alternatives2287);
                    rule__RelationalOperator__OAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1075:6: ( ( rule__RelationalOperator__OAssignment_3 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1075:6: ( ( rule__RelationalOperator__OAssignment_3 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1076:1: ( rule__RelationalOperator__OAssignment_3 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getOAssignment_3()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1077:1: ( rule__RelationalOperator__OAssignment_3 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1077:2: rule__RelationalOperator__OAssignment_3
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__OAssignment_3_in_rule__RelationalOperator__Alternatives2305);
                    rule__RelationalOperator__OAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalOperatorAccess().getOAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1081:6: ( ( rule__RelationalOperator__NeoAssignment_4 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1081:6: ( ( rule__RelationalOperator__NeoAssignment_4 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1082:1: ( rule__RelationalOperator__NeoAssignment_4 )
                    {
                     before(grammarAccess.getRelationalOperatorAccess().getNeoAssignment_4()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1083:1: ( rule__RelationalOperator__NeoAssignment_4 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1083:2: rule__RelationalOperator__NeoAssignment_4
                    {
                    pushFollow(FOLLOW_rule__RelationalOperator__NeoAssignment_4_in_rule__RelationalOperator__Alternatives2323);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1092:1: rule__List__Alternatives_0 : ( ( ( rule__List__SlAssignment_0_0 ) ) | ( ( rule__List__OlAssignment_0_1 ) ) );
    public final void rule__List__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1096:1: ( ( ( rule__List__SlAssignment_0_0 ) ) | ( ( rule__List__OlAssignment_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==25) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_FLOAT && LA11_0<=RULE_DATE_TIME)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1097:1: ( ( rule__List__SlAssignment_0_0 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1097:1: ( ( rule__List__SlAssignment_0_0 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1098:1: ( rule__List__SlAssignment_0_0 )
                    {
                     before(grammarAccess.getListAccess().getSlAssignment_0_0()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1099:1: ( rule__List__SlAssignment_0_0 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1099:2: rule__List__SlAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__List__SlAssignment_0_0_in_rule__List__Alternatives_02356);
                    rule__List__SlAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getSlAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1103:6: ( ( rule__List__OlAssignment_0_1 ) )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1103:6: ( ( rule__List__OlAssignment_0_1 ) )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1104:1: ( rule__List__OlAssignment_0_1 )
                    {
                     before(grammarAccess.getListAccess().getOlAssignment_0_1()); 
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1105:1: ( rule__List__OlAssignment_0_1 )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1105:2: rule__List__OlAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__List__OlAssignment_0_1_in_rule__List__Alternatives_02374);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1114:1: rule__StringLiteral__Alternatives : ( ( RULE_STRING ) | ( 'null' ) );
    public final void rule__StringLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1118:1: ( ( RULE_STRING ) | ( 'null' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1119:1: ( RULE_STRING )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1119:1: ( RULE_STRING )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1120:1: RULE_STRING
                    {
                     before(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringLiteral__Alternatives2407); 
                     after(grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1125:6: ( 'null' )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1125:6: ( 'null' )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1126:1: 'null'
                    {
                     before(grammarAccess.getStringLiteralAccess().getNullKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__StringLiteral__Alternatives2425); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1138:1: rule__OtherLiteral__Alternatives : ( ( RULE_FLOAT ) | ( RULE_MINUS_FLOAT ) | ( RULE_INT ) | ( RULE_MINUS_INTEGER ) | ( RULE_DATE_TIME ) );
    public final void rule__OtherLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1142:1: ( ( RULE_FLOAT ) | ( RULE_MINUS_FLOAT ) | ( RULE_INT ) | ( RULE_MINUS_INTEGER ) | ( RULE_DATE_TIME ) )
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
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1143:1: ( RULE_FLOAT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1143:1: ( RULE_FLOAT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1144:1: RULE_FLOAT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__OtherLiteral__Alternatives2459); 
                     after(grammarAccess.getOtherLiteralAccess().getFLOATTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1149:6: ( RULE_MINUS_FLOAT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1149:6: ( RULE_MINUS_FLOAT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1150:1: RULE_MINUS_FLOAT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 
                    match(input,RULE_MINUS_FLOAT,FOLLOW_RULE_MINUS_FLOAT_in_rule__OtherLiteral__Alternatives2476); 
                     after(grammarAccess.getOtherLiteralAccess().getMINUS_FLOATTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1155:6: ( RULE_INT )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1155:6: ( RULE_INT )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1156:1: RULE_INT
                    {
                     before(grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__OtherLiteral__Alternatives2493); 
                     after(grammarAccess.getOtherLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1161:6: ( RULE_MINUS_INTEGER )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1161:6: ( RULE_MINUS_INTEGER )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1162:1: RULE_MINUS_INTEGER
                    {
                     before(grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 
                    match(input,RULE_MINUS_INTEGER,FOLLOW_RULE_MINUS_INTEGER_in_rule__OtherLiteral__Alternatives2510); 
                     after(grammarAccess.getOtherLiteralAccess().getMINUS_INTEGERTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1167:6: ( RULE_DATE_TIME )
                    {
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1167:6: ( RULE_DATE_TIME )
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1168:1: RULE_DATE_TIME
                    {
                     before(grammarAccess.getOtherLiteralAccess().getDATE_TIMETerminalRuleCall_4()); 
                    match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_rule__OtherLiteral__Alternatives2527); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1180:1: rule__Leta__Group__0 : rule__Leta__Group__0__Impl rule__Leta__Group__1 ;
    public final void rule__Leta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1184:1: ( rule__Leta__Group__0__Impl rule__Leta__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1185:2: rule__Leta__Group__0__Impl rule__Leta__Group__1
            {
            pushFollow(FOLLOW_rule__Leta__Group__0__Impl_in_rule__Leta__Group__02557);
            rule__Leta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Leta__Group__1_in_rule__Leta__Group__02560);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1192:1: rule__Leta__Group__0__Impl : ( ( rule__Leta__TpAssignment_0 )? ) ;
    public final void rule__Leta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1196:1: ( ( ( rule__Leta__TpAssignment_0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1197:1: ( ( rule__Leta__TpAssignment_0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1197:1: ( ( rule__Leta__TpAssignment_0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1198:1: ( rule__Leta__TpAssignment_0 )?
            {
             before(grammarAccess.getLetaAccess().getTpAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1199:1: ( rule__Leta__TpAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1199:2: rule__Leta__TpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Leta__TpAssignment_0_in_rule__Leta__Group__0__Impl2587);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1209:1: rule__Leta__Group__1 : rule__Leta__Group__1__Impl ;
    public final void rule__Leta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1213:1: ( rule__Leta__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1214:2: rule__Leta__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Leta__Group__1__Impl_in_rule__Leta__Group__12618);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1220:1: rule__Leta__Group__1__Impl : ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) ) ;
    public final void rule__Leta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1224:1: ( ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1225:1: ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1225:1: ( ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1226:1: ( ( rule__Leta__TcAssignment_1 ) ) ( ( rule__Leta__TcAssignment_1 )* )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1226:1: ( ( rule__Leta__TcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1227:1: ( rule__Leta__TcAssignment_1 )
            {
             before(grammarAccess.getLetaAccess().getTcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1228:1: ( rule__Leta__TcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1228:2: rule__Leta__TcAssignment_1
            {
            pushFollow(FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2647);
            rule__Leta__TcAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetaAccess().getTcAssignment_1()); 

            }

            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1231:1: ( ( rule__Leta__TcAssignment_1 )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1232:1: ( rule__Leta__TcAssignment_1 )*
            {
             before(grammarAccess.getLetaAccess().getTcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1233:1: ( rule__Leta__TcAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1233:2: rule__Leta__TcAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2659);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1248:1: rule__TestCase__Group__0 : rule__TestCase__Group__0__Impl rule__TestCase__Group__1 ;
    public final void rule__TestCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1252:1: ( rule__TestCase__Group__0__Impl rule__TestCase__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1253:2: rule__TestCase__Group__0__Impl rule__TestCase__Group__1
            {
            pushFollow(FOLLOW_rule__TestCase__Group__0__Impl_in_rule__TestCase__Group__02696);
            rule__TestCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__1_in_rule__TestCase__Group__02699);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1260:1: rule__TestCase__Group__0__Impl : ( 'Test' ) ;
    public final void rule__TestCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1264:1: ( ( 'Test' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1265:1: ( 'Test' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1265:1: ( 'Test' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1266:1: 'Test'
            {
             before(grammarAccess.getTestCaseAccess().getTestKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TestCase__Group__0__Impl2727); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1279:1: rule__TestCase__Group__1 : rule__TestCase__Group__1__Impl rule__TestCase__Group__2 ;
    public final void rule__TestCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1283:1: ( rule__TestCase__Group__1__Impl rule__TestCase__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1284:2: rule__TestCase__Group__1__Impl rule__TestCase__Group__2
            {
            pushFollow(FOLLOW_rule__TestCase__Group__1__Impl_in_rule__TestCase__Group__12758);
            rule__TestCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__2_in_rule__TestCase__Group__12761);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1291:1: rule__TestCase__Group__1__Impl : ( ( rule__TestCase__IdAssignment_1 ) ) ;
    public final void rule__TestCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1295:1: ( ( ( rule__TestCase__IdAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1296:1: ( ( rule__TestCase__IdAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1296:1: ( ( rule__TestCase__IdAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1297:1: ( rule__TestCase__IdAssignment_1 )
            {
             before(grammarAccess.getTestCaseAccess().getIdAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1298:1: ( rule__TestCase__IdAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1298:2: rule__TestCase__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__TestCase__IdAssignment_1_in_rule__TestCase__Group__1__Impl2788);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1308:1: rule__TestCase__Group__2 : rule__TestCase__Group__2__Impl rule__TestCase__Group__3 ;
    public final void rule__TestCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1312:1: ( rule__TestCase__Group__2__Impl rule__TestCase__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1313:2: rule__TestCase__Group__2__Impl rule__TestCase__Group__3
            {
            pushFollow(FOLLOW_rule__TestCase__Group__2__Impl_in_rule__TestCase__Group__22818);
            rule__TestCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__3_in_rule__TestCase__Group__22821);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1320:1: rule__TestCase__Group__2__Impl : ( ( rule__TestCase__VAssignment_2 ) ) ;
    public final void rule__TestCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1324:1: ( ( ( rule__TestCase__VAssignment_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1325:1: ( ( rule__TestCase__VAssignment_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1325:1: ( ( rule__TestCase__VAssignment_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1326:1: ( rule__TestCase__VAssignment_2 )
            {
             before(grammarAccess.getTestCaseAccess().getVAssignment_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1327:1: ( rule__TestCase__VAssignment_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1327:2: rule__TestCase__VAssignment_2
            {
            pushFollow(FOLLOW_rule__TestCase__VAssignment_2_in_rule__TestCase__Group__2__Impl2848);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1337:1: rule__TestCase__Group__3 : rule__TestCase__Group__3__Impl rule__TestCase__Group__4 ;
    public final void rule__TestCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1341:1: ( rule__TestCase__Group__3__Impl rule__TestCase__Group__4 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1342:2: rule__TestCase__Group__3__Impl rule__TestCase__Group__4
            {
            pushFollow(FOLLOW_rule__TestCase__Group__3__Impl_in_rule__TestCase__Group__32878);
            rule__TestCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestCase__Group__4_in_rule__TestCase__Group__32881);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1349:1: rule__TestCase__Group__3__Impl : ( ( rule__TestCase__WAssignment_3 ) ) ;
    public final void rule__TestCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1353:1: ( ( ( rule__TestCase__WAssignment_3 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1354:1: ( ( rule__TestCase__WAssignment_3 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1354:1: ( ( rule__TestCase__WAssignment_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1355:1: ( rule__TestCase__WAssignment_3 )
            {
             before(grammarAccess.getTestCaseAccess().getWAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1356:1: ( rule__TestCase__WAssignment_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1356:2: rule__TestCase__WAssignment_3
            {
            pushFollow(FOLLOW_rule__TestCase__WAssignment_3_in_rule__TestCase__Group__3__Impl2908);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1366:1: rule__TestCase__Group__4 : rule__TestCase__Group__4__Impl ;
    public final void rule__TestCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1370:1: ( rule__TestCase__Group__4__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1371:2: rule__TestCase__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TestCase__Group__4__Impl_in_rule__TestCase__Group__42938);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1377:1: rule__TestCase__Group__4__Impl : ( ( rule__TestCase__SAssignment_4 )? ) ;
    public final void rule__TestCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1381:1: ( ( ( rule__TestCase__SAssignment_4 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1382:1: ( ( rule__TestCase__SAssignment_4 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1382:1: ( ( rule__TestCase__SAssignment_4 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1383:1: ( rule__TestCase__SAssignment_4 )?
            {
             before(grammarAccess.getTestCaseAccess().getSAssignment_4()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1384:1: ( rule__TestCase__SAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1384:2: rule__TestCase__SAssignment_4
                    {
                    pushFollow(FOLLOW_rule__TestCase__SAssignment_4_in_rule__TestCase__Group__4__Impl2965);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1404:1: rule__VerifyClause__Group__0 : rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1 ;
    public final void rule__VerifyClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1408:1: ( rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1409:2: rule__VerifyClause__Group__0__Impl rule__VerifyClause__Group__1
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__0__Impl_in_rule__VerifyClause__Group__03006);
            rule__VerifyClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VerifyClause__Group__1_in_rule__VerifyClause__Group__03009);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1416:1: rule__VerifyClause__Group__0__Impl : ( 'Verify' ) ;
    public final void rule__VerifyClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1420:1: ( ( 'Verify' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1421:1: ( 'Verify' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1421:1: ( 'Verify' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1422:1: 'Verify'
            {
             before(grammarAccess.getVerifyClauseAccess().getVerifyKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__VerifyClause__Group__0__Impl3037); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1435:1: rule__VerifyClause__Group__1 : rule__VerifyClause__Group__1__Impl ;
    public final void rule__VerifyClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1439:1: ( rule__VerifyClause__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1440:2: rule__VerifyClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VerifyClause__Group__1__Impl_in_rule__VerifyClause__Group__13068);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1446:1: rule__VerifyClause__Group__1__Impl : ( ( rule__VerifyClause__FcAssignment_1 ) ) ;
    public final void rule__VerifyClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1450:1: ( ( ( rule__VerifyClause__FcAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1451:1: ( ( rule__VerifyClause__FcAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1451:1: ( ( rule__VerifyClause__FcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1452:1: ( rule__VerifyClause__FcAssignment_1 )
            {
             before(grammarAccess.getVerifyClauseAccess().getFcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1453:1: ( rule__VerifyClause__FcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1453:2: rule__VerifyClause__FcAssignment_1
            {
            pushFollow(FOLLOW_rule__VerifyClause__FcAssignment_1_in_rule__VerifyClause__Group__1__Impl3095);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1467:1: rule__WhenClause__Group__0 : rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 ;
    public final void rule__WhenClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1471:1: ( rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1472:2: rule__WhenClause__Group__0__Impl rule__WhenClause__Group__1
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__0__Impl_in_rule__WhenClause__Group__03129);
            rule__WhenClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WhenClause__Group__1_in_rule__WhenClause__Group__03132);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1479:1: rule__WhenClause__Group__0__Impl : ( 'When' ) ;
    public final void rule__WhenClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1483:1: ( ( 'When' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1484:1: ( 'When' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1484:1: ( 'When' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1485:1: 'When'
            {
             before(grammarAccess.getWhenClauseAccess().getWhenKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__WhenClause__Group__0__Impl3160); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1498:1: rule__WhenClause__Group__1 : rule__WhenClause__Group__1__Impl ;
    public final void rule__WhenClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1502:1: ( rule__WhenClause__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1503:2: rule__WhenClause__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WhenClause__Group__1__Impl_in_rule__WhenClause__Group__13191);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1509:1: rule__WhenClause__Group__1__Impl : ( ( rule__WhenClause__FcAssignment_1 ) ) ;
    public final void rule__WhenClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1513:1: ( ( ( rule__WhenClause__FcAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1514:1: ( ( rule__WhenClause__FcAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1514:1: ( ( rule__WhenClause__FcAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1515:1: ( rule__WhenClause__FcAssignment_1 )
            {
             before(grammarAccess.getWhenClauseAccess().getFcAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1516:1: ( rule__WhenClause__FcAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1516:2: rule__WhenClause__FcAssignment_1
            {
            pushFollow(FOLLOW_rule__WhenClause__FcAssignment_1_in_rule__WhenClause__Group__1__Impl3218);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1530:1: rule__SetClause__Group__0 : rule__SetClause__Group__0__Impl rule__SetClause__Group__1 ;
    public final void rule__SetClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1534:1: ( rule__SetClause__Group__0__Impl rule__SetClause__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1535:2: rule__SetClause__Group__0__Impl rule__SetClause__Group__1
            {
            pushFollow(FOLLOW_rule__SetClause__Group__0__Impl_in_rule__SetClause__Group__03252);
            rule__SetClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__1_in_rule__SetClause__Group__03255);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1542:1: rule__SetClause__Group__0__Impl : ( () ) ;
    public final void rule__SetClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1546:1: ( ( () ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1547:1: ( () )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1547:1: ( () )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1548:1: ()
            {
             before(grammarAccess.getSetClauseAccess().getSetAction_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1549:1: ()
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1551:1: 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1561:1: rule__SetClause__Group__1 : rule__SetClause__Group__1__Impl rule__SetClause__Group__2 ;
    public final void rule__SetClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1565:1: ( rule__SetClause__Group__1__Impl rule__SetClause__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1566:2: rule__SetClause__Group__1__Impl rule__SetClause__Group__2
            {
            pushFollow(FOLLOW_rule__SetClause__Group__1__Impl_in_rule__SetClause__Group__13313);
            rule__SetClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__2_in_rule__SetClause__Group__13316);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1573:1: rule__SetClause__Group__1__Impl : ( 'Set' ) ;
    public final void rule__SetClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1577:1: ( ( 'Set' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1578:1: ( 'Set' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1578:1: ( 'Set' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1579:1: 'Set'
            {
             before(grammarAccess.getSetClauseAccess().getSetKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__SetClause__Group__1__Impl3344); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1592:1: rule__SetClause__Group__2 : rule__SetClause__Group__2__Impl rule__SetClause__Group__3 ;
    public final void rule__SetClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1596:1: ( rule__SetClause__Group__2__Impl rule__SetClause__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1597:2: rule__SetClause__Group__2__Impl rule__SetClause__Group__3
            {
            pushFollow(FOLLOW_rule__SetClause__Group__2__Impl_in_rule__SetClause__Group__23375);
            rule__SetClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__3_in_rule__SetClause__Group__23378);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1604:1: rule__SetClause__Group__2__Impl : ( '{' ) ;
    public final void rule__SetClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1608:1: ( ( '{' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1609:1: ( '{' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1609:1: ( '{' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1610:1: '{'
            {
             before(grammarAccess.getSetClauseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__SetClause__Group__2__Impl3406); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1623:1: rule__SetClause__Group__3 : rule__SetClause__Group__3__Impl rule__SetClause__Group__4 ;
    public final void rule__SetClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1627:1: ( rule__SetClause__Group__3__Impl rule__SetClause__Group__4 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1628:2: rule__SetClause__Group__3__Impl rule__SetClause__Group__4
            {
            pushFollow(FOLLOW_rule__SetClause__Group__3__Impl_in_rule__SetClause__Group__33437);
            rule__SetClause__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SetClause__Group__4_in_rule__SetClause__Group__33440);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1635:1: rule__SetClause__Group__3__Impl : ( ( rule__SetClause__SAssignment_3 )? ) ;
    public final void rule__SetClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1639:1: ( ( ( rule__SetClause__SAssignment_3 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1640:1: ( ( rule__SetClause__SAssignment_3 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1640:1: ( ( rule__SetClause__SAssignment_3 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1641:1: ( rule__SetClause__SAssignment_3 )?
            {
             before(grammarAccess.getSetClauseAccess().getSAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1642:1: ( rule__SetClause__SAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1642:2: rule__SetClause__SAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SetClause__SAssignment_3_in_rule__SetClause__Group__3__Impl3467);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1652:1: rule__SetClause__Group__4 : rule__SetClause__Group__4__Impl ;
    public final void rule__SetClause__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1656:1: ( rule__SetClause__Group__4__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1657:2: rule__SetClause__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SetClause__Group__4__Impl_in_rule__SetClause__Group__43498);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1663:1: rule__SetClause__Group__4__Impl : ( '}' ) ;
    public final void rule__SetClause__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1667:1: ( ( '}' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1668:1: ( '}' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1668:1: ( '}' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1669:1: '}'
            {
             before(grammarAccess.getSetClauseAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__SetClause__Group__4__Impl3526); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1692:1: rule__FactComposite__Group_0__0 : rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1 ;
    public final void rule__FactComposite__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1696:1: ( rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1697:2: rule__FactComposite__Group_0__0__Impl rule__FactComposite__Group_0__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0__0__Impl_in_rule__FactComposite__Group_0__03567);
            rule__FactComposite__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_0__1_in_rule__FactComposite__Group_0__03570);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1704:1: rule__FactComposite__Group_0__0__Impl : ( ( rule__FactComposite__Alternatives_0_0 ) ) ;
    public final void rule__FactComposite__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1708:1: ( ( ( rule__FactComposite__Alternatives_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1709:1: ( ( rule__FactComposite__Alternatives_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1709:1: ( ( rule__FactComposite__Alternatives_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1710:1: ( rule__FactComposite__Alternatives_0_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getAlternatives_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1711:1: ( rule__FactComposite__Alternatives_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1711:2: rule__FactComposite__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__FactComposite__Alternatives_0_0_in_rule__FactComposite__Group_0__0__Impl3597);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1721:1: rule__FactComposite__Group_0__1 : rule__FactComposite__Group_0__1__Impl ;
    public final void rule__FactComposite__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1725:1: ( rule__FactComposite__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1726:2: rule__FactComposite__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0__1__Impl_in_rule__FactComposite__Group_0__13627);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1732:1: rule__FactComposite__Group_0__1__Impl : ( ( rule__FactComposite__Group_0_1__0 )? ) ;
    public final void rule__FactComposite__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1736:1: ( ( ( rule__FactComposite__Group_0_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1737:1: ( ( rule__FactComposite__Group_0_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1737:1: ( ( rule__FactComposite__Group_0_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1738:1: ( rule__FactComposite__Group_0_1__0 )?
            {
             before(grammarAccess.getFactCompositeAccess().getGroup_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1739:1: ( rule__FactComposite__Group_0_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=17 && LA18_0<=18)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1739:2: rule__FactComposite__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_0_1__0_in_rule__FactComposite__Group_0__1__Impl3654);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1753:1: rule__FactComposite__Group_0_1__0 : rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1 ;
    public final void rule__FactComposite__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1757:1: ( rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1758:2: rule__FactComposite__Group_0_1__0__Impl rule__FactComposite__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__0__Impl_in_rule__FactComposite__Group_0_1__03689);
            rule__FactComposite__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__1_in_rule__FactComposite__Group_0_1__03692);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1765:1: rule__FactComposite__Group_0_1__0__Impl : ( ( rule__FactComposite__OpAssignment_0_1_0 ) ) ;
    public final void rule__FactComposite__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1769:1: ( ( ( rule__FactComposite__OpAssignment_0_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1770:1: ( ( rule__FactComposite__OpAssignment_0_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1770:1: ( ( rule__FactComposite__OpAssignment_0_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1771:1: ( rule__FactComposite__OpAssignment_0_1_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getOpAssignment_0_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1772:1: ( rule__FactComposite__OpAssignment_0_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1772:2: rule__FactComposite__OpAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__FactComposite__OpAssignment_0_1_0_in_rule__FactComposite__Group_0_1__0__Impl3719);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1782:1: rule__FactComposite__Group_0_1__1 : rule__FactComposite__Group_0_1__1__Impl ;
    public final void rule__FactComposite__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1786:1: ( rule__FactComposite__Group_0_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1787:2: rule__FactComposite__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_0_1__1__Impl_in_rule__FactComposite__Group_0_1__13749);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1793:1: rule__FactComposite__Group_0_1__1__Impl : ( ( rule__FactComposite__FcAssignment_0_1_1 ) ) ;
    public final void rule__FactComposite__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1797:1: ( ( ( rule__FactComposite__FcAssignment_0_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1798:1: ( ( rule__FactComposite__FcAssignment_0_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1798:1: ( ( rule__FactComposite__FcAssignment_0_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1799:1: ( rule__FactComposite__FcAssignment_0_1_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFcAssignment_0_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1800:1: ( rule__FactComposite__FcAssignment_0_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1800:2: rule__FactComposite__FcAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FactComposite__FcAssignment_0_1_1_in_rule__FactComposite__Group_0_1__1__Impl3776);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1814:1: rule__FactComposite__Group_1__0 : rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1 ;
    public final void rule__FactComposite__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1818:1: ( rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1819:2: rule__FactComposite__Group_1__0__Impl rule__FactComposite__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__0__Impl_in_rule__FactComposite__Group_1__03810);
            rule__FactComposite__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__1_in_rule__FactComposite__Group_1__03813);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1826:1: rule__FactComposite__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FactComposite__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1830:1: ( ( '(' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1831:1: ( '(' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1831:1: ( '(' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1832:1: '('
            {
             before(grammarAccess.getFactCompositeAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__FactComposite__Group_1__0__Impl3841); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1845:1: rule__FactComposite__Group_1__1 : rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2 ;
    public final void rule__FactComposite__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1849:1: ( rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1850:2: rule__FactComposite__Group_1__1__Impl rule__FactComposite__Group_1__2
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__1__Impl_in_rule__FactComposite__Group_1__13872);
            rule__FactComposite__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__2_in_rule__FactComposite__Group_1__13875);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1857:1: rule__FactComposite__Group_1__1__Impl : ( ( rule__FactComposite__Fc1Assignment_1_1 ) ) ;
    public final void rule__FactComposite__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1861:1: ( ( ( rule__FactComposite__Fc1Assignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1862:1: ( ( rule__FactComposite__Fc1Assignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1862:1: ( ( rule__FactComposite__Fc1Assignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1863:1: ( rule__FactComposite__Fc1Assignment_1_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFc1Assignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1864:1: ( rule__FactComposite__Fc1Assignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1864:2: rule__FactComposite__Fc1Assignment_1_1
            {
            pushFollow(FOLLOW_rule__FactComposite__Fc1Assignment_1_1_in_rule__FactComposite__Group_1__1__Impl3902);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1874:1: rule__FactComposite__Group_1__2 : rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3 ;
    public final void rule__FactComposite__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1878:1: ( rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1879:2: rule__FactComposite__Group_1__2__Impl rule__FactComposite__Group_1__3
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__2__Impl_in_rule__FactComposite__Group_1__23932);
            rule__FactComposite__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1__3_in_rule__FactComposite__Group_1__23935);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1886:1: rule__FactComposite__Group_1__2__Impl : ( ')' ) ;
    public final void rule__FactComposite__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1890:1: ( ( ')' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1891:1: ( ')' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1891:1: ( ')' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1892:1: ')'
            {
             before(grammarAccess.getFactCompositeAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_33_in_rule__FactComposite__Group_1__2__Impl3963); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1905:1: rule__FactComposite__Group_1__3 : rule__FactComposite__Group_1__3__Impl ;
    public final void rule__FactComposite__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1909:1: ( rule__FactComposite__Group_1__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1910:2: rule__FactComposite__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1__3__Impl_in_rule__FactComposite__Group_1__33994);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1916:1: rule__FactComposite__Group_1__3__Impl : ( ( rule__FactComposite__Group_1_3__0 )? ) ;
    public final void rule__FactComposite__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1920:1: ( ( ( rule__FactComposite__Group_1_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1921:1: ( ( rule__FactComposite__Group_1_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1921:1: ( ( rule__FactComposite__Group_1_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1922:1: ( rule__FactComposite__Group_1_3__0 )?
            {
             before(grammarAccess.getFactCompositeAccess().getGroup_1_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1923:1: ( rule__FactComposite__Group_1_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=17 && LA19_0<=18)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1923:2: rule__FactComposite__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__FactComposite__Group_1_3__0_in_rule__FactComposite__Group_1__3__Impl4021);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1941:1: rule__FactComposite__Group_1_3__0 : rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1 ;
    public final void rule__FactComposite__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1945:1: ( rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1946:2: rule__FactComposite__Group_1_3__0__Impl rule__FactComposite__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__0__Impl_in_rule__FactComposite__Group_1_3__04060);
            rule__FactComposite__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__1_in_rule__FactComposite__Group_1_3__04063);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1953:1: rule__FactComposite__Group_1_3__0__Impl : ( ( rule__FactComposite__OpAssignment_1_3_0 ) ) ;
    public final void rule__FactComposite__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1957:1: ( ( ( rule__FactComposite__OpAssignment_1_3_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1958:1: ( ( rule__FactComposite__OpAssignment_1_3_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1958:1: ( ( rule__FactComposite__OpAssignment_1_3_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1959:1: ( rule__FactComposite__OpAssignment_1_3_0 )
            {
             before(grammarAccess.getFactCompositeAccess().getOpAssignment_1_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1960:1: ( rule__FactComposite__OpAssignment_1_3_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1960:2: rule__FactComposite__OpAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__FactComposite__OpAssignment_1_3_0_in_rule__FactComposite__Group_1_3__0__Impl4090);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1970:1: rule__FactComposite__Group_1_3__1 : rule__FactComposite__Group_1_3__1__Impl ;
    public final void rule__FactComposite__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1974:1: ( rule__FactComposite__Group_1_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1975:2: rule__FactComposite__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FactComposite__Group_1_3__1__Impl_in_rule__FactComposite__Group_1_3__14120);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1981:1: rule__FactComposite__Group_1_3__1__Impl : ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) ) ;
    public final void rule__FactComposite__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1985:1: ( ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1986:1: ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1986:1: ( ( rule__FactComposite__Fc2Assignment_1_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1987:1: ( rule__FactComposite__Fc2Assignment_1_3_1 )
            {
             before(grammarAccess.getFactCompositeAccess().getFc2Assignment_1_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1988:1: ( rule__FactComposite__Fc2Assignment_1_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:1988:2: rule__FactComposite__Fc2Assignment_1_3_1
            {
            pushFollow(FOLLOW_rule__FactComposite__Fc2Assignment_1_3_1_in_rule__FactComposite__Group_1_3__1__Impl4147);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2002:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2006:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2007:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__04181);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__04184);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2014:1: rule__Fact__Group__0__Impl : ( ( rule__Fact__TermCompositeAssignment_0 ) ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2018:1: ( ( ( rule__Fact__TermCompositeAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2019:1: ( ( rule__Fact__TermCompositeAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2019:1: ( ( rule__Fact__TermCompositeAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2020:1: ( rule__Fact__TermCompositeAssignment_0 )
            {
             before(grammarAccess.getFactAccess().getTermCompositeAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2021:1: ( rule__Fact__TermCompositeAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2021:2: rule__Fact__TermCompositeAssignment_0
            {
            pushFollow(FOLLOW_rule__Fact__TermCompositeAssignment_0_in_rule__Fact__Group__0__Impl4211);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2031:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl rule__Fact__Group__2 ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2035:1: ( rule__Fact__Group__1__Impl rule__Fact__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2036:2: rule__Fact__Group__1__Impl rule__Fact__Group__2
            {
            pushFollow(FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__14241);
            rule__Fact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__14244);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2043:1: rule__Fact__Group__1__Impl : ( ( rule__Fact__ComplementAssignment_1 ) ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2047:1: ( ( ( rule__Fact__ComplementAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2048:1: ( ( rule__Fact__ComplementAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2048:1: ( ( rule__Fact__ComplementAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2049:1: ( rule__Fact__ComplementAssignment_1 )
            {
             before(grammarAccess.getFactAccess().getComplementAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2050:1: ( rule__Fact__ComplementAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2050:2: rule__Fact__ComplementAssignment_1
            {
            pushFollow(FOLLOW_rule__Fact__ComplementAssignment_1_in_rule__Fact__Group__1__Impl4271);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2060:1: rule__Fact__Group__2 : rule__Fact__Group__2__Impl ;
    public final void rule__Fact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2064:1: ( rule__Fact__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2065:2: rule__Fact__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__24301);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2071:1: rule__Fact__Group__2__Impl : ( ( rule__Fact__Group_2__0 )? ) ;
    public final void rule__Fact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2075:1: ( ( ( rule__Fact__Group_2__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2076:1: ( ( rule__Fact__Group_2__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2076:1: ( ( rule__Fact__Group_2__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2077:1: ( rule__Fact__Group_2__0 )?
            {
             before(grammarAccess.getFactAccess().getGroup_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2078:1: ( rule__Fact__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=35 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2078:2: rule__Fact__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl4328);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2094:1: rule__Fact__Group_2__0 : rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 ;
    public final void rule__Fact__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2098:1: ( rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2099:2: rule__Fact__Group_2__0__Impl rule__Fact__Group_2__1
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__04365);
            rule__Fact__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__04368);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2106:1: rule__Fact__Group_2__0__Impl : ( ( rule__Fact__TermComposite2Assignment_2_0 ) ) ;
    public final void rule__Fact__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2110:1: ( ( ( rule__Fact__TermComposite2Assignment_2_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2111:1: ( ( rule__Fact__TermComposite2Assignment_2_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2111:1: ( ( rule__Fact__TermComposite2Assignment_2_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2112:1: ( rule__Fact__TermComposite2Assignment_2_0 )
            {
             before(grammarAccess.getFactAccess().getTermComposite2Assignment_2_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2113:1: ( rule__Fact__TermComposite2Assignment_2_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2113:2: rule__Fact__TermComposite2Assignment_2_0
            {
            pushFollow(FOLLOW_rule__Fact__TermComposite2Assignment_2_0_in_rule__Fact__Group_2__0__Impl4395);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2123:1: rule__Fact__Group_2__1 : rule__Fact__Group_2__1__Impl ;
    public final void rule__Fact__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2127:1: ( rule__Fact__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2128:2: rule__Fact__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__14425);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2134:1: rule__Fact__Group_2__1__Impl : ( ( rule__Fact__FactExtAssignment_2_1 )? ) ;
    public final void rule__Fact__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2138:1: ( ( ( rule__Fact__FactExtAssignment_2_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2139:1: ( ( rule__Fact__FactExtAssignment_2_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2139:1: ( ( rule__Fact__FactExtAssignment_2_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2140:1: ( rule__Fact__FactExtAssignment_2_1 )?
            {
             before(grammarAccess.getFactAccess().getFactExtAssignment_2_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2141:1: ( rule__Fact__FactExtAssignment_2_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2141:2: rule__Fact__FactExtAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Fact__FactExtAssignment_2_1_in_rule__Fact__Group_2__1__Impl4452);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2155:1: rule__FactExt__Group__0 : rule__FactExt__Group__0__Impl rule__FactExt__Group__1 ;
    public final void rule__FactExt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2159:1: ( rule__FactExt__Group__0__Impl rule__FactExt__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2160:2: rule__FactExt__Group__0__Impl rule__FactExt__Group__1
            {
            pushFollow(FOLLOW_rule__FactExt__Group__0__Impl_in_rule__FactExt__Group__04487);
            rule__FactExt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactExt__Group__1_in_rule__FactExt__Group__04490);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2167:1: rule__FactExt__Group__0__Impl : ( ( rule__FactExt__ComplementAssignment_0 ) ) ;
    public final void rule__FactExt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2171:1: ( ( ( rule__FactExt__ComplementAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2172:1: ( ( rule__FactExt__ComplementAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2172:1: ( ( rule__FactExt__ComplementAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2173:1: ( rule__FactExt__ComplementAssignment_0 )
            {
             before(grammarAccess.getFactExtAccess().getComplementAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2174:1: ( rule__FactExt__ComplementAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2174:2: rule__FactExt__ComplementAssignment_0
            {
            pushFollow(FOLLOW_rule__FactExt__ComplementAssignment_0_in_rule__FactExt__Group__0__Impl4517);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2184:1: rule__FactExt__Group__1 : rule__FactExt__Group__1__Impl ;
    public final void rule__FactExt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2188:1: ( rule__FactExt__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2189:2: rule__FactExt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FactExt__Group__1__Impl_in_rule__FactExt__Group__14547);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2195:1: rule__FactExt__Group__1__Impl : ( ( rule__FactExt__Group_1__0 )? ) ;
    public final void rule__FactExt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2199:1: ( ( ( rule__FactExt__Group_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2200:1: ( ( rule__FactExt__Group_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2200:1: ( ( rule__FactExt__Group_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2201:1: ( rule__FactExt__Group_1__0 )?
            {
             before(grammarAccess.getFactExtAccess().getGroup_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2202:1: ( rule__FactExt__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=35 && LA22_0<=38)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2202:2: rule__FactExt__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FactExt__Group_1__0_in_rule__FactExt__Group__1__Impl4574);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2216:1: rule__FactExt__Group_1__0 : rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1 ;
    public final void rule__FactExt__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2220:1: ( rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2221:2: rule__FactExt__Group_1__0__Impl rule__FactExt__Group_1__1
            {
            pushFollow(FOLLOW_rule__FactExt__Group_1__0__Impl_in_rule__FactExt__Group_1__04609);
            rule__FactExt__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FactExt__Group_1__1_in_rule__FactExt__Group_1__04612);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2228:1: rule__FactExt__Group_1__0__Impl : ( ( rule__FactExt__TermCompositeAssignment_1_0 ) ) ;
    public final void rule__FactExt__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2232:1: ( ( ( rule__FactExt__TermCompositeAssignment_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2233:1: ( ( rule__FactExt__TermCompositeAssignment_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2233:1: ( ( rule__FactExt__TermCompositeAssignment_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2234:1: ( rule__FactExt__TermCompositeAssignment_1_0 )
            {
             before(grammarAccess.getFactExtAccess().getTermCompositeAssignment_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2235:1: ( rule__FactExt__TermCompositeAssignment_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2235:2: rule__FactExt__TermCompositeAssignment_1_0
            {
            pushFollow(FOLLOW_rule__FactExt__TermCompositeAssignment_1_0_in_rule__FactExt__Group_1__0__Impl4639);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2245:1: rule__FactExt__Group_1__1 : rule__FactExt__Group_1__1__Impl ;
    public final void rule__FactExt__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2249:1: ( rule__FactExt__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2250:2: rule__FactExt__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FactExt__Group_1__1__Impl_in_rule__FactExt__Group_1__14669);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2256:1: rule__FactExt__Group_1__1__Impl : ( ( rule__FactExt__FactExtAssignment_1_1 )? ) ;
    public final void rule__FactExt__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2260:1: ( ( ( rule__FactExt__FactExtAssignment_1_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2261:1: ( ( rule__FactExt__FactExtAssignment_1_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2261:1: ( ( rule__FactExt__FactExtAssignment_1_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2262:1: ( rule__FactExt__FactExtAssignment_1_1 )?
            {
             before(grammarAccess.getFactExtAccess().getFactExtAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2263:1: ( rule__FactExt__FactExtAssignment_1_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2263:2: rule__FactExt__FactExtAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__FactExt__FactExtAssignment_1_1_in_rule__FactExt__Group_1__1__Impl4696);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2277:1: rule__TermComposite__Group__0 : rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1 ;
    public final void rule__TermComposite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2281:1: ( rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2282:2: rule__TermComposite__Group__0__Impl rule__TermComposite__Group__1
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__0__Impl_in_rule__TermComposite__Group__04731);
            rule__TermComposite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermComposite__Group__1_in_rule__TermComposite__Group__04734);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2289:1: rule__TermComposite__Group__0__Impl : ( ( rule__TermComposite__QuantifierAssignment_0 )? ) ;
    public final void rule__TermComposite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2293:1: ( ( ( rule__TermComposite__QuantifierAssignment_0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2294:1: ( ( rule__TermComposite__QuantifierAssignment_0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2294:1: ( ( rule__TermComposite__QuantifierAssignment_0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2295:1: ( rule__TermComposite__QuantifierAssignment_0 )?
            {
             before(grammarAccess.getTermCompositeAccess().getQuantifierAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2296:1: ( rule__TermComposite__QuantifierAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=35 && LA24_0<=38)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2296:2: rule__TermComposite__QuantifierAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TermComposite__QuantifierAssignment_0_in_rule__TermComposite__Group__0__Impl4761);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2306:1: rule__TermComposite__Group__1 : rule__TermComposite__Group__1__Impl ;
    public final void rule__TermComposite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2310:1: ( rule__TermComposite__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2311:2: rule__TermComposite__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TermComposite__Group__1__Impl_in_rule__TermComposite__Group__14792);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2317:1: rule__TermComposite__Group__1__Impl : ( ( rule__TermComposite__Alternatives_1 ) ) ;
    public final void rule__TermComposite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2321:1: ( ( ( rule__TermComposite__Alternatives_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2322:1: ( ( rule__TermComposite__Alternatives_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2322:1: ( ( rule__TermComposite__Alternatives_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2323:1: ( rule__TermComposite__Alternatives_1 )
            {
             before(grammarAccess.getTermCompositeAccess().getAlternatives_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2324:1: ( rule__TermComposite__Alternatives_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2324:2: rule__TermComposite__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TermComposite__Alternatives_1_in_rule__TermComposite__Group__1__Impl4819);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2338:1: rule__TermInstance__Group_0__0 : rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1 ;
    public final void rule__TermInstance__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2342:1: ( rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2343:2: rule__TermInstance__Group_0__0__Impl rule__TermInstance__Group_0__1
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__0__Impl_in_rule__TermInstance__Group_0__04853);
            rule__TermInstance__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_0__1_in_rule__TermInstance__Group_0__04856);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2350:1: rule__TermInstance__Group_0__0__Impl : ( ( rule__TermInstance__TermAssignment_0_0 ) ) ;
    public final void rule__TermInstance__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2354:1: ( ( ( rule__TermInstance__TermAssignment_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2355:1: ( ( rule__TermInstance__TermAssignment_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2355:1: ( ( rule__TermInstance__TermAssignment_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2356:1: ( rule__TermInstance__TermAssignment_0_0 )
            {
             before(grammarAccess.getTermInstanceAccess().getTermAssignment_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2357:1: ( rule__TermInstance__TermAssignment_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2357:2: rule__TermInstance__TermAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TermInstance__TermAssignment_0_0_in_rule__TermInstance__Group_0__0__Impl4883);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2367:1: rule__TermInstance__Group_0__1 : rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2 ;
    public final void rule__TermInstance__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2371:1: ( rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2372:2: rule__TermInstance__Group_0__1__Impl rule__TermInstance__Group_0__2
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__1__Impl_in_rule__TermInstance__Group_0__14913);
            rule__TermInstance__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_0__2_in_rule__TermInstance__Group_0__14916);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2379:1: rule__TermInstance__Group_0__1__Impl : ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? ) ;
    public final void rule__TermInstance__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2383:1: ( ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2384:1: ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2384:1: ( ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2385:1: ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )?
            {
             before(grammarAccess.getTermInstanceAccess().getNotEqualOperatorAssignment_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2386:1: ( rule__TermInstance__NotEqualOperatorAssignment_0_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2386:2: rule__TermInstance__NotEqualOperatorAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__TermInstance__NotEqualOperatorAssignment_0_1_in_rule__TermInstance__Group_0__1__Impl4943);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2396:1: rule__TermInstance__Group_0__2 : rule__TermInstance__Group_0__2__Impl ;
    public final void rule__TermInstance__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2400:1: ( rule__TermInstance__Group_0__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2401:2: rule__TermInstance__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_0__2__Impl_in_rule__TermInstance__Group_0__24974);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2407:1: rule__TermInstance__Group_0__2__Impl : ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) ) ;
    public final void rule__TermInstance__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2411:1: ( ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2412:1: ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2412:1: ( ( rule__TermInstance__StringLiteralAssignment_0_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2413:1: ( rule__TermInstance__StringLiteralAssignment_0_2 )
            {
             before(grammarAccess.getTermInstanceAccess().getStringLiteralAssignment_0_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2414:1: ( rule__TermInstance__StringLiteralAssignment_0_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2414:2: rule__TermInstance__StringLiteralAssignment_0_2
            {
            pushFollow(FOLLOW_rule__TermInstance__StringLiteralAssignment_0_2_in_rule__TermInstance__Group_0__2__Impl5001);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2430:1: rule__TermInstance__Group_1__0 : rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1 ;
    public final void rule__TermInstance__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2434:1: ( rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2435:2: rule__TermInstance__Group_1__0__Impl rule__TermInstance__Group_1__1
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__0__Impl_in_rule__TermInstance__Group_1__05037);
            rule__TermInstance__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_1__1_in_rule__TermInstance__Group_1__05040);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2442:1: rule__TermInstance__Group_1__0__Impl : ( ( rule__TermInstance__TermAssignment_1_0 ) ) ;
    public final void rule__TermInstance__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2446:1: ( ( ( rule__TermInstance__TermAssignment_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2447:1: ( ( rule__TermInstance__TermAssignment_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2447:1: ( ( rule__TermInstance__TermAssignment_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2448:1: ( rule__TermInstance__TermAssignment_1_0 )
            {
             before(grammarAccess.getTermInstanceAccess().getTermAssignment_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2449:1: ( rule__TermInstance__TermAssignment_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2449:2: rule__TermInstance__TermAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TermInstance__TermAssignment_1_0_in_rule__TermInstance__Group_1__0__Impl5067);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2459:1: rule__TermInstance__Group_1__1 : rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2 ;
    public final void rule__TermInstance__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2463:1: ( rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2464:2: rule__TermInstance__Group_1__1__Impl rule__TermInstance__Group_1__2
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__1__Impl_in_rule__TermInstance__Group_1__15097);
            rule__TermInstance__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermInstance__Group_1__2_in_rule__TermInstance__Group_1__15100);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2471:1: rule__TermInstance__Group_1__1__Impl : ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? ) ;
    public final void rule__TermInstance__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2475:1: ( ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2476:1: ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2476:1: ( ( rule__TermInstance__RelationalOperatorAssignment_1_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2477:1: ( rule__TermInstance__RelationalOperatorAssignment_1_1 )?
            {
             before(grammarAccess.getTermInstanceAccess().getRelationalOperatorAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2478:1: ( rule__TermInstance__RelationalOperatorAssignment_1_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16||(LA26_0>=43 && LA26_0<=46)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2478:2: rule__TermInstance__RelationalOperatorAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__TermInstance__RelationalOperatorAssignment_1_1_in_rule__TermInstance__Group_1__1__Impl5127);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2488:1: rule__TermInstance__Group_1__2 : rule__TermInstance__Group_1__2__Impl ;
    public final void rule__TermInstance__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2492:1: ( rule__TermInstance__Group_1__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2493:2: rule__TermInstance__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TermInstance__Group_1__2__Impl_in_rule__TermInstance__Group_1__25158);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2499:1: rule__TermInstance__Group_1__2__Impl : ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) ) ;
    public final void rule__TermInstance__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2503:1: ( ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2504:1: ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2504:1: ( ( rule__TermInstance__OtherLiteralAssignment_1_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2505:1: ( rule__TermInstance__OtherLiteralAssignment_1_2 )
            {
             before(grammarAccess.getTermInstanceAccess().getOtherLiteralAssignment_1_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2506:1: ( rule__TermInstance__OtherLiteralAssignment_1_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2506:2: rule__TermInstance__OtherLiteralAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TermInstance__OtherLiteralAssignment_1_2_in_rule__TermInstance__Group_1__2__Impl5185);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2522:1: rule__TermWithAssociation__Group__0 : rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1 ;
    public final void rule__TermWithAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2526:1: ( rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2527:2: rule__TermWithAssociation__Group__0__Impl rule__TermWithAssociation__Group__1
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__0__Impl_in_rule__TermWithAssociation__Group__05221);
            rule__TermWithAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__1_in_rule__TermWithAssociation__Group__05224);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2534:1: rule__TermWithAssociation__Group__0__Impl : ( ( rule__TermWithAssociation__TAssignment_0 ) ) ;
    public final void rule__TermWithAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2538:1: ( ( ( rule__TermWithAssociation__TAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2539:1: ( ( rule__TermWithAssociation__TAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2539:1: ( ( rule__TermWithAssociation__TAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2540:1: ( rule__TermWithAssociation__TAssignment_0 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getTAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2541:1: ( rule__TermWithAssociation__TAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2541:2: rule__TermWithAssociation__TAssignment_0
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__TAssignment_0_in_rule__TermWithAssociation__Group__0__Impl5251);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2551:1: rule__TermWithAssociation__Group__1 : rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2 ;
    public final void rule__TermWithAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2555:1: ( rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2556:2: rule__TermWithAssociation__Group__1__Impl rule__TermWithAssociation__Group__2
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__1__Impl_in_rule__TermWithAssociation__Group__15281);
            rule__TermWithAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__2_in_rule__TermWithAssociation__Group__15284);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2563:1: rule__TermWithAssociation__Group__1__Impl : ( ( rule__TermWithAssociation__RoAssignment_1 )? ) ;
    public final void rule__TermWithAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2567:1: ( ( ( rule__TermWithAssociation__RoAssignment_1 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2568:1: ( ( rule__TermWithAssociation__RoAssignment_1 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2568:1: ( ( rule__TermWithAssociation__RoAssignment_1 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2569:1: ( rule__TermWithAssociation__RoAssignment_1 )?
            {
             before(grammarAccess.getTermWithAssociationAccess().getRoAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2570:1: ( rule__TermWithAssociation__RoAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16||(LA27_0>=43 && LA27_0<=46)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2570:2: rule__TermWithAssociation__RoAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TermWithAssociation__RoAssignment_1_in_rule__TermWithAssociation__Group__1__Impl5311);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2580:1: rule__TermWithAssociation__Group__2 : rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3 ;
    public final void rule__TermWithAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2584:1: ( rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2585:2: rule__TermWithAssociation__Group__2__Impl rule__TermWithAssociation__Group__3
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__2__Impl_in_rule__TermWithAssociation__Group__25342);
            rule__TermWithAssociation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TermWithAssociation__Group__3_in_rule__TermWithAssociation__Group__25345);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2592:1: rule__TermWithAssociation__Group__2__Impl : ( '@' ) ;
    public final void rule__TermWithAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2596:1: ( ( '@' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2597:1: ( '@' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2597:1: ( '@' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2598:1: '@'
            {
             before(grammarAccess.getTermWithAssociationAccess().getCommercialAtKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__TermWithAssociation__Group__2__Impl5373); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2611:1: rule__TermWithAssociation__Group__3 : rule__TermWithAssociation__Group__3__Impl ;
    public final void rule__TermWithAssociation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2615:1: ( rule__TermWithAssociation__Group__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2616:2: rule__TermWithAssociation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__Group__3__Impl_in_rule__TermWithAssociation__Group__35404);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2622:1: rule__TermWithAssociation__Group__3__Impl : ( ( rule__TermWithAssociation__IndexAssignment_3 ) ) ;
    public final void rule__TermWithAssociation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2626:1: ( ( ( rule__TermWithAssociation__IndexAssignment_3 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2627:1: ( ( rule__TermWithAssociation__IndexAssignment_3 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2627:1: ( ( rule__TermWithAssociation__IndexAssignment_3 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2628:1: ( rule__TermWithAssociation__IndexAssignment_3 )
            {
             before(grammarAccess.getTermWithAssociationAccess().getIndexAssignment_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2629:1: ( rule__TermWithAssociation__IndexAssignment_3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2629:2: rule__TermWithAssociation__IndexAssignment_3
            {
            pushFollow(FOLLOW_rule__TermWithAssociation__IndexAssignment_3_in_rule__TermWithAssociation__Group__3__Impl5431);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2647:1: rule__Quantifier__Group_0__0 : rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1 ;
    public final void rule__Quantifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2651:1: ( rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2652:2: rule__Quantifier__Group_0__0__Impl rule__Quantifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_0__0__Impl_in_rule__Quantifier__Group_0__05469);
            rule__Quantifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_0__1_in_rule__Quantifier__Group_0__05472);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2659:1: rule__Quantifier__Group_0__0__Impl : ( 'atLeast' ) ;
    public final void rule__Quantifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2663:1: ( ( 'atLeast' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2664:1: ( 'atLeast' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2664:1: ( 'atLeast' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2665:1: 'atLeast'
            {
             before(grammarAccess.getQuantifierAccess().getAtLeastKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__Quantifier__Group_0__0__Impl5500); 
             after(grammarAccess.getQuantifierAccess().getAtLeastKeyword_0_0()); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2678:1: rule__Quantifier__Group_0__1 : rule__Quantifier__Group_0__1__Impl ;
    public final void rule__Quantifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2682:1: ( rule__Quantifier__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2683:2: rule__Quantifier__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_0__1__Impl_in_rule__Quantifier__Group_0__15531);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2689:1: rule__Quantifier__Group_0__1__Impl : ( ( rule__Quantifier__VAssignment_0_1 ) ) ;
    public final void rule__Quantifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2693:1: ( ( ( rule__Quantifier__VAssignment_0_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2694:1: ( ( rule__Quantifier__VAssignment_0_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2694:1: ( ( rule__Quantifier__VAssignment_0_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2695:1: ( rule__Quantifier__VAssignment_0_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2696:1: ( rule__Quantifier__VAssignment_0_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2696:2: rule__Quantifier__VAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_0_1_in_rule__Quantifier__Group_0__1__Impl5558);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2710:1: rule__Quantifier__Group_1__0 : rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1 ;
    public final void rule__Quantifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2714:1: ( rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2715:2: rule__Quantifier__Group_1__0__Impl rule__Quantifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_1__0__Impl_in_rule__Quantifier__Group_1__05592);
            rule__Quantifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_1__1_in_rule__Quantifier__Group_1__05595);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2722:1: rule__Quantifier__Group_1__0__Impl : ( 'atMost' ) ;
    public final void rule__Quantifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2726:1: ( ( 'atMost' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2727:1: ( 'atMost' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2727:1: ( 'atMost' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2728:1: 'atMost'
            {
             before(grammarAccess.getQuantifierAccess().getAtMostKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Quantifier__Group_1__0__Impl5623); 
             after(grammarAccess.getQuantifierAccess().getAtMostKeyword_1_0()); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2741:1: rule__Quantifier__Group_1__1 : rule__Quantifier__Group_1__1__Impl ;
    public final void rule__Quantifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2745:1: ( rule__Quantifier__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2746:2: rule__Quantifier__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_1__1__Impl_in_rule__Quantifier__Group_1__15654);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2752:1: rule__Quantifier__Group_1__1__Impl : ( ( rule__Quantifier__VAssignment_1_1 ) ) ;
    public final void rule__Quantifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2756:1: ( ( ( rule__Quantifier__VAssignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2757:1: ( ( rule__Quantifier__VAssignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2757:1: ( ( rule__Quantifier__VAssignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2758:1: ( rule__Quantifier__VAssignment_1_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2759:1: ( rule__Quantifier__VAssignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2759:2: rule__Quantifier__VAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_1_1_in_rule__Quantifier__Group_1__1__Impl5681);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2773:1: rule__Quantifier__Group_2__0 : rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1 ;
    public final void rule__Quantifier__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2777:1: ( rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2778:2: rule__Quantifier__Group_2__0__Impl rule__Quantifier__Group_2__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_2__0__Impl_in_rule__Quantifier__Group_2__05715);
            rule__Quantifier__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_2__1_in_rule__Quantifier__Group_2__05718);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2785:1: rule__Quantifier__Group_2__0__Impl : ( 'exactly' ) ;
    public final void rule__Quantifier__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2789:1: ( ( 'exactly' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2790:1: ( 'exactly' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2790:1: ( 'exactly' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2791:1: 'exactly'
            {
             before(grammarAccess.getQuantifierAccess().getExactlyKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Quantifier__Group_2__0__Impl5746); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2804:1: rule__Quantifier__Group_2__1 : rule__Quantifier__Group_2__1__Impl ;
    public final void rule__Quantifier__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2808:1: ( rule__Quantifier__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2809:2: rule__Quantifier__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_2__1__Impl_in_rule__Quantifier__Group_2__15777);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2815:1: rule__Quantifier__Group_2__1__Impl : ( ( rule__Quantifier__VAssignment_2_1 ) ) ;
    public final void rule__Quantifier__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2819:1: ( ( ( rule__Quantifier__VAssignment_2_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2820:1: ( ( rule__Quantifier__VAssignment_2_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2820:1: ( ( rule__Quantifier__VAssignment_2_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2821:1: ( rule__Quantifier__VAssignment_2_1 )
            {
             before(grammarAccess.getQuantifierAccess().getVAssignment_2_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2822:1: ( rule__Quantifier__VAssignment_2_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2822:2: rule__Quantifier__VAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Quantifier__VAssignment_2_1_in_rule__Quantifier__Group_2__1__Impl5804);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2836:1: rule__Quantifier__Group_3__0 : rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1 ;
    public final void rule__Quantifier__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2840:1: ( rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2841:2: rule__Quantifier__Group_3__0__Impl rule__Quantifier__Group_3__1
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__0__Impl_in_rule__Quantifier__Group_3__05838);
            rule__Quantifier__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_3__1_in_rule__Quantifier__Group_3__05841);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2848:1: rule__Quantifier__Group_3__0__Impl : ( 'atLeastAndAtMost' ) ;
    public final void rule__Quantifier__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2852:1: ( ( 'atLeastAndAtMost' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2853:1: ( 'atLeastAndAtMost' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2853:1: ( 'atLeastAndAtMost' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2854:1: 'atLeastAndAtMost'
            {
             before(grammarAccess.getQuantifierAccess().getAtLeastAndAtMostKeyword_3_0()); 
            match(input,38,FOLLOW_38_in_rule__Quantifier__Group_3__0__Impl5869); 
             after(grammarAccess.getQuantifierAccess().getAtLeastAndAtMostKeyword_3_0()); 

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2867:1: rule__Quantifier__Group_3__1 : rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2 ;
    public final void rule__Quantifier__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2871:1: ( rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2872:2: rule__Quantifier__Group_3__1__Impl rule__Quantifier__Group_3__2
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__1__Impl_in_rule__Quantifier__Group_3__15900);
            rule__Quantifier__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quantifier__Group_3__2_in_rule__Quantifier__Group_3__15903);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2879:1: rule__Quantifier__Group_3__1__Impl : ( ( rule__Quantifier__V1Assignment_3_1 ) ) ;
    public final void rule__Quantifier__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2883:1: ( ( ( rule__Quantifier__V1Assignment_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2884:1: ( ( rule__Quantifier__V1Assignment_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2884:1: ( ( rule__Quantifier__V1Assignment_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2885:1: ( rule__Quantifier__V1Assignment_3_1 )
            {
             before(grammarAccess.getQuantifierAccess().getV1Assignment_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2886:1: ( rule__Quantifier__V1Assignment_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2886:2: rule__Quantifier__V1Assignment_3_1
            {
            pushFollow(FOLLOW_rule__Quantifier__V1Assignment_3_1_in_rule__Quantifier__Group_3__1__Impl5930);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2896:1: rule__Quantifier__Group_3__2 : rule__Quantifier__Group_3__2__Impl ;
    public final void rule__Quantifier__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2900:1: ( rule__Quantifier__Group_3__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2901:2: rule__Quantifier__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Quantifier__Group_3__2__Impl_in_rule__Quantifier__Group_3__25960);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2907:1: rule__Quantifier__Group_3__2__Impl : ( ( rule__Quantifier__V2Assignment_3_2 ) ) ;
    public final void rule__Quantifier__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2911:1: ( ( ( rule__Quantifier__V2Assignment_3_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2912:1: ( ( rule__Quantifier__V2Assignment_3_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2912:1: ( ( rule__Quantifier__V2Assignment_3_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2913:1: ( rule__Quantifier__V2Assignment_3_2 )
            {
             before(grammarAccess.getQuantifierAccess().getV2Assignment_3_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2914:1: ( rule__Quantifier__V2Assignment_3_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2914:2: rule__Quantifier__V2Assignment_3_2
            {
            pushFollow(FOLLOW_rule__Quantifier__V2Assignment_3_2_in_rule__Quantifier__Group_3__2__Impl5987);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2930:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2934:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2935:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06023);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06026);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2942:1: rule__Formula__Group__0__Impl : ( ( rule__Formula__FiAssignment_0 ) ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2946:1: ( ( ( rule__Formula__FiAssignment_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2947:1: ( ( rule__Formula__FiAssignment_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2947:1: ( ( rule__Formula__FiAssignment_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2948:1: ( rule__Formula__FiAssignment_0 )
            {
             before(grammarAccess.getFormulaAccess().getFiAssignment_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2949:1: ( rule__Formula__FiAssignment_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2949:2: rule__Formula__FiAssignment_0
            {
            pushFollow(FOLLOW_rule__Formula__FiAssignment_0_in_rule__Formula__Group__0__Impl6053);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2959:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl rule__Formula__Group__2 ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2963:1: ( rule__Formula__Group__1__Impl rule__Formula__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2964:2: rule__Formula__Group__1__Impl rule__Formula__Group__2
            {
            pushFollow(FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16083);
            rule__Formula__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16086);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2971:1: rule__Formula__Group__1__Impl : ( '=' ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2975:1: ( ( '=' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2976:1: ( '=' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2976:1: ( '=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2977:1: '='
            {
             before(grammarAccess.getFormulaAccess().getEqualsSignKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Formula__Group__1__Impl6114); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2990:1: rule__Formula__Group__2 : rule__Formula__Group__2__Impl ;
    public final void rule__Formula__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2994:1: ( rule__Formula__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:2995:2: rule__Formula__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26145);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3001:1: rule__Formula__Group__2__Impl : ( ( rule__Formula__FeAssignment_2 ) ) ;
    public final void rule__Formula__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3005:1: ( ( ( rule__Formula__FeAssignment_2 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3006:1: ( ( rule__Formula__FeAssignment_2 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3006:1: ( ( rule__Formula__FeAssignment_2 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3007:1: ( rule__Formula__FeAssignment_2 )
            {
             before(grammarAccess.getFormulaAccess().getFeAssignment_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3008:1: ( rule__Formula__FeAssignment_2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3008:2: rule__Formula__FeAssignment_2
            {
            pushFollow(FOLLOW_rule__Formula__FeAssignment_2_in_rule__Formula__Group__2__Impl6172);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3024:1: rule__FormulaExpression__Group_0__0 : rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1 ;
    public final void rule__FormulaExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3028:1: ( rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3029:2: rule__FormulaExpression__Group_0__0__Impl rule__FormulaExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__0__Impl_in_rule__FormulaExpression__Group_0__06208);
            rule__FormulaExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__1_in_rule__FormulaExpression__Group_0__06211);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3036:1: rule__FormulaExpression__Group_0__0__Impl : ( ( rule__FormulaExpression__FiAssignment_0_0 ) ) ;
    public final void rule__FormulaExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3040:1: ( ( ( rule__FormulaExpression__FiAssignment_0_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3041:1: ( ( rule__FormulaExpression__FiAssignment_0_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3041:1: ( ( rule__FormulaExpression__FiAssignment_0_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3042:1: ( rule__FormulaExpression__FiAssignment_0_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFiAssignment_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3043:1: ( rule__FormulaExpression__FiAssignment_0_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3043:2: rule__FormulaExpression__FiAssignment_0_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__FiAssignment_0_0_in_rule__FormulaExpression__Group_0__0__Impl6238);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3053:1: rule__FormulaExpression__Group_0__1 : rule__FormulaExpression__Group_0__1__Impl ;
    public final void rule__FormulaExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3057:1: ( rule__FormulaExpression__Group_0__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3058:2: rule__FormulaExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0__1__Impl_in_rule__FormulaExpression__Group_0__16268);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3064:1: rule__FormulaExpression__Group_0__1__Impl : ( ( rule__FormulaExpression__Group_0_1__0 )? ) ;
    public final void rule__FormulaExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3068:1: ( ( ( rule__FormulaExpression__Group_0_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3069:1: ( ( rule__FormulaExpression__Group_0_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3069:1: ( ( rule__FormulaExpression__Group_0_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3070:1: ( rule__FormulaExpression__Group_0_1__0 )?
            {
             before(grammarAccess.getFormulaExpressionAccess().getGroup_0_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3071:1: ( rule__FormulaExpression__Group_0_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=19 && LA28_0<=24)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3071:2: rule__FormulaExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__0_in_rule__FormulaExpression__Group_0__1__Impl6295);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3085:1: rule__FormulaExpression__Group_0_1__0 : rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1 ;
    public final void rule__FormulaExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3089:1: ( rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3090:2: rule__FormulaExpression__Group_0_1__0__Impl rule__FormulaExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__0__Impl_in_rule__FormulaExpression__Group_0_1__06330);
            rule__FormulaExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__1_in_rule__FormulaExpression__Group_0_1__06333);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3097:1: rule__FormulaExpression__Group_0_1__0__Impl : ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) ) ;
    public final void rule__FormulaExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3101:1: ( ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3102:1: ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3102:1: ( ( rule__FormulaExpression__MoAssignment_0_1_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3103:1: ( rule__FormulaExpression__MoAssignment_0_1_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoAssignment_0_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3104:1: ( rule__FormulaExpression__MoAssignment_0_1_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3104:2: rule__FormulaExpression__MoAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__MoAssignment_0_1_0_in_rule__FormulaExpression__Group_0_1__0__Impl6360);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3114:1: rule__FormulaExpression__Group_0_1__1 : rule__FormulaExpression__Group_0_1__1__Impl ;
    public final void rule__FormulaExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3118:1: ( rule__FormulaExpression__Group_0_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3119:2: rule__FormulaExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_0_1__1__Impl_in_rule__FormulaExpression__Group_0_1__16390);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3125:1: rule__FormulaExpression__Group_0_1__1__Impl : ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) ) ;
    public final void rule__FormulaExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3129:1: ( ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3130:1: ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3130:1: ( ( rule__FormulaExpression__FeAssignment_0_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3131:1: ( rule__FormulaExpression__FeAssignment_0_1_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFeAssignment_0_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3132:1: ( rule__FormulaExpression__FeAssignment_0_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3132:2: rule__FormulaExpression__FeAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__FeAssignment_0_1_1_in_rule__FormulaExpression__Group_0_1__1__Impl6417);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3146:1: rule__FormulaExpression__Group_1__0 : rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1 ;
    public final void rule__FormulaExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3150:1: ( rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3151:2: rule__FormulaExpression__Group_1__0__Impl rule__FormulaExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__0__Impl_in_rule__FormulaExpression__Group_1__06451);
            rule__FormulaExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__1_in_rule__FormulaExpression__Group_1__06454);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3158:1: rule__FormulaExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FormulaExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3162:1: ( ( '(' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3163:1: ( '(' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3163:1: ( '(' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3164:1: '('
            {
             before(grammarAccess.getFormulaExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__FormulaExpression__Group_1__0__Impl6482); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3177:1: rule__FormulaExpression__Group_1__1 : rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2 ;
    public final void rule__FormulaExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3181:1: ( rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3182:2: rule__FormulaExpression__Group_1__1__Impl rule__FormulaExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__1__Impl_in_rule__FormulaExpression__Group_1__16513);
            rule__FormulaExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__2_in_rule__FormulaExpression__Group_1__16516);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3189:1: rule__FormulaExpression__Group_1__1__Impl : ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) ) ;
    public final void rule__FormulaExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3193:1: ( ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3194:1: ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3194:1: ( ( rule__FormulaExpression__Fe1Assignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3195:1: ( rule__FormulaExpression__Fe1Assignment_1_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe1Assignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3196:1: ( rule__FormulaExpression__Fe1Assignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3196:2: rule__FormulaExpression__Fe1Assignment_1_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Fe1Assignment_1_1_in_rule__FormulaExpression__Group_1__1__Impl6543);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3206:1: rule__FormulaExpression__Group_1__2 : rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3 ;
    public final void rule__FormulaExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3210:1: ( rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3211:2: rule__FormulaExpression__Group_1__2__Impl rule__FormulaExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__2__Impl_in_rule__FormulaExpression__Group_1__26573);
            rule__FormulaExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__3_in_rule__FormulaExpression__Group_1__26576);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3218:1: rule__FormulaExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__FormulaExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3222:1: ( ( ')' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3223:1: ( ')' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3223:1: ( ')' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3224:1: ')'
            {
             before(grammarAccess.getFormulaExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_33_in_rule__FormulaExpression__Group_1__2__Impl6604); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3237:1: rule__FormulaExpression__Group_1__3 : rule__FormulaExpression__Group_1__3__Impl ;
    public final void rule__FormulaExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3241:1: ( rule__FormulaExpression__Group_1__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3242:2: rule__FormulaExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1__3__Impl_in_rule__FormulaExpression__Group_1__36635);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3248:1: rule__FormulaExpression__Group_1__3__Impl : ( ( rule__FormulaExpression__Group_1_3__0 )? ) ;
    public final void rule__FormulaExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3252:1: ( ( ( rule__FormulaExpression__Group_1_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3253:1: ( ( rule__FormulaExpression__Group_1_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3253:1: ( ( rule__FormulaExpression__Group_1_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3254:1: ( rule__FormulaExpression__Group_1_3__0 )?
            {
             before(grammarAccess.getFormulaExpressionAccess().getGroup_1_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3255:1: ( rule__FormulaExpression__Group_1_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=19 && LA29_0<=24)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3255:2: rule__FormulaExpression__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__0_in_rule__FormulaExpression__Group_1__3__Impl6662);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3273:1: rule__FormulaExpression__Group_1_3__0 : rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1 ;
    public final void rule__FormulaExpression__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3277:1: ( rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3278:2: rule__FormulaExpression__Group_1_3__0__Impl rule__FormulaExpression__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__0__Impl_in_rule__FormulaExpression__Group_1_3__06701);
            rule__FormulaExpression__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__1_in_rule__FormulaExpression__Group_1_3__06704);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3285:1: rule__FormulaExpression__Group_1_3__0__Impl : ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) ) ;
    public final void rule__FormulaExpression__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3289:1: ( ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3290:1: ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3290:1: ( ( rule__FormulaExpression__MoAssignment_1_3_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3291:1: ( rule__FormulaExpression__MoAssignment_1_3_0 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoAssignment_1_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3292:1: ( rule__FormulaExpression__MoAssignment_1_3_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3292:2: rule__FormulaExpression__MoAssignment_1_3_0
            {
            pushFollow(FOLLOW_rule__FormulaExpression__MoAssignment_1_3_0_in_rule__FormulaExpression__Group_1_3__0__Impl6731);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3302:1: rule__FormulaExpression__Group_1_3__1 : rule__FormulaExpression__Group_1_3__1__Impl ;
    public final void rule__FormulaExpression__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3306:1: ( rule__FormulaExpression__Group_1_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3307:2: rule__FormulaExpression__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Group_1_3__1__Impl_in_rule__FormulaExpression__Group_1_3__16761);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3313:1: rule__FormulaExpression__Group_1_3__1__Impl : ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) ) ;
    public final void rule__FormulaExpression__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3317:1: ( ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3318:1: ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3318:1: ( ( rule__FormulaExpression__Fe2Assignment_1_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3319:1: ( rule__FormulaExpression__Fe2Assignment_1_3_1 )
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe2Assignment_1_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3320:1: ( rule__FormulaExpression__Fe2Assignment_1_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3320:2: rule__FormulaExpression__Fe2Assignment_1_3_1
            {
            pushFollow(FOLLOW_rule__FormulaExpression__Fe2Assignment_1_3_1_in_rule__FormulaExpression__Group_1_3__1__Impl6788);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3334:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3338:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3339:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06822);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06825);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3346:1: rule__Set__Group__0__Impl : ( '{' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3350:1: ( ( '{' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3351:1: ( '{' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3351:1: ( '{' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3352:1: '{'
            {
             before(grammarAccess.getSetAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Set__Group__0__Impl6853); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3365:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3369:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3370:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16884);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16887);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3377:1: rule__Set__Group__1__Impl : ( ( rule__Set__LAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3381:1: ( ( ( rule__Set__LAssignment_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3382:1: ( ( rule__Set__LAssignment_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3382:1: ( ( rule__Set__LAssignment_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3383:1: ( rule__Set__LAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getLAssignment_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3384:1: ( rule__Set__LAssignment_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3384:2: rule__Set__LAssignment_1
            {
            pushFollow(FOLLOW_rule__Set__LAssignment_1_in_rule__Set__Group__1__Impl6914);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3394:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3398:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3399:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26944);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group__3_in_rule__Set__Group__26947);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3406:1: rule__Set__Group__2__Impl : ( '}' ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3410:1: ( ( '}' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3411:1: ( '}' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3411:1: ( '}' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3412:1: '}'
            {
             before(grammarAccess.getSetAccess().getRightCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_31_in_rule__Set__Group__2__Impl6975); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3425:1: rule__Set__Group__3 : rule__Set__Group__3__Impl ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3429:1: ( rule__Set__Group__3__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3430:2: rule__Set__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__37006);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3436:1: rule__Set__Group__3__Impl : ( ( rule__Set__Group_3__0 )? ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3440:1: ( ( ( rule__Set__Group_3__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3441:1: ( ( rule__Set__Group_3__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3441:1: ( ( rule__Set__Group_3__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3442:1: ( rule__Set__Group_3__0 )?
            {
             before(grammarAccess.getSetAccess().getGroup_3()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3443:1: ( rule__Set__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3443:2: rule__Set__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl7033);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3461:1: rule__Set__Group_3__0 : rule__Set__Group_3__0__Impl rule__Set__Group_3__1 ;
    public final void rule__Set__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3465:1: ( rule__Set__Group_3__0__Impl rule__Set__Group_3__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3466:2: rule__Set__Group_3__0__Impl rule__Set__Group_3__1
            {
            pushFollow(FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__07072);
            rule__Set__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__07075);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3473:1: rule__Set__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Set__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3477:1: ( ( ',' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3478:1: ( ',' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3478:1: ( ',' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3479:1: ','
            {
             before(grammarAccess.getSetAccess().getCommaKeyword_3_0()); 
            match(input,40,FOLLOW_40_in_rule__Set__Group_3__0__Impl7103); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3492:1: rule__Set__Group_3__1 : rule__Set__Group_3__1__Impl ;
    public final void rule__Set__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3496:1: ( rule__Set__Group_3__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3497:2: rule__Set__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__17134);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3503:1: rule__Set__Group_3__1__Impl : ( ( rule__Set__SAssignment_3_1 ) ) ;
    public final void rule__Set__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3507:1: ( ( ( rule__Set__SAssignment_3_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3508:1: ( ( rule__Set__SAssignment_3_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3508:1: ( ( rule__Set__SAssignment_3_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3509:1: ( rule__Set__SAssignment_3_1 )
            {
             before(grammarAccess.getSetAccess().getSAssignment_3_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3510:1: ( rule__Set__SAssignment_3_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3510:2: rule__Set__SAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Set__SAssignment_3_1_in_rule__Set__Group_3__1__Impl7161);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3524:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3528:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3529:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__07195);
            rule__List__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group__1_in_rule__List__Group__07198);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3536:1: rule__List__Group__0__Impl : ( ( rule__List__Alternatives_0 ) ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3540:1: ( ( ( rule__List__Alternatives_0 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3541:1: ( ( rule__List__Alternatives_0 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3541:1: ( ( rule__List__Alternatives_0 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3542:1: ( rule__List__Alternatives_0 )
            {
             before(grammarAccess.getListAccess().getAlternatives_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3543:1: ( rule__List__Alternatives_0 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3543:2: rule__List__Alternatives_0
            {
            pushFollow(FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl7225);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3553:1: rule__List__Group__1 : rule__List__Group__1__Impl ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3557:1: ( rule__List__Group__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3558:2: rule__List__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__17255);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3564:1: rule__List__Group__1__Impl : ( ( rule__List__Group_1__0 )? ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3568:1: ( ( ( rule__List__Group_1__0 )? ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3569:1: ( ( rule__List__Group_1__0 )? )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3569:1: ( ( rule__List__Group_1__0 )? )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3570:1: ( rule__List__Group_1__0 )?
            {
             before(grammarAccess.getListAccess().getGroup_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3571:1: ( rule__List__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3571:2: rule__List__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__List__Group_1__0_in_rule__List__Group__1__Impl7282);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3585:1: rule__List__Group_1__0 : rule__List__Group_1__0__Impl rule__List__Group_1__1 ;
    public final void rule__List__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3589:1: ( rule__List__Group_1__0__Impl rule__List__Group_1__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3590:2: rule__List__Group_1__0__Impl rule__List__Group_1__1
            {
            pushFollow(FOLLOW_rule__List__Group_1__0__Impl_in_rule__List__Group_1__07317);
            rule__List__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__List__Group_1__1_in_rule__List__Group_1__07320);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3597:1: rule__List__Group_1__0__Impl : ( ',' ) ;
    public final void rule__List__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3601:1: ( ( ',' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3602:1: ( ',' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3602:1: ( ',' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3603:1: ','
            {
             before(grammarAccess.getListAccess().getCommaKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__List__Group_1__0__Impl7348); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3616:1: rule__List__Group_1__1 : rule__List__Group_1__1__Impl ;
    public final void rule__List__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3620:1: ( rule__List__Group_1__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3621:2: rule__List__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__List__Group_1__1__Impl_in_rule__List__Group_1__17379);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3627:1: rule__List__Group_1__1__Impl : ( ( rule__List__LAssignment_1_1 ) ) ;
    public final void rule__List__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3631:1: ( ( ( rule__List__LAssignment_1_1 ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3632:1: ( ( rule__List__LAssignment_1_1 ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3632:1: ( ( rule__List__LAssignment_1_1 ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3633:1: ( rule__List__LAssignment_1_1 )
            {
             before(grammarAccess.getListAccess().getLAssignment_1_1()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3634:1: ( rule__List__LAssignment_1_1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3634:2: rule__List__LAssignment_1_1
            {
            pushFollow(FOLLOW_rule__List__LAssignment_1_1_in_rule__List__Group_1__1__Impl7406);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3648:1: rule__TestPackage__Group__0 : rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1 ;
    public final void rule__TestPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3652:1: ( rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3653:2: rule__TestPackage__Group__0__Impl rule__TestPackage__Group__1
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__0__Impl_in_rule__TestPackage__Group__07440);
            rule__TestPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group__1_in_rule__TestPackage__Group__07443);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3660:1: rule__TestPackage__Group__0__Impl : ( 'Package' ) ;
    public final void rule__TestPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3664:1: ( ( 'Package' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3665:1: ( 'Package' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3665:1: ( 'Package' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3666:1: 'Package'
            {
             before(grammarAccess.getTestPackageAccess().getPackageKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__TestPackage__Group__0__Impl7471); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3679:1: rule__TestPackage__Group__1 : rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2 ;
    public final void rule__TestPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3683:1: ( rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3684:2: rule__TestPackage__Group__1__Impl rule__TestPackage__Group__2
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__1__Impl_in_rule__TestPackage__Group__17502);
            rule__TestPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group__2_in_rule__TestPackage__Group__17505);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3691:1: rule__TestPackage__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__TestPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3695:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3696:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3696:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3697:1: RULE_ID
            {
             before(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestPackage__Group__1__Impl7532); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3708:1: rule__TestPackage__Group__2 : rule__TestPackage__Group__2__Impl ;
    public final void rule__TestPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3712:1: ( rule__TestPackage__Group__2__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3713:2: rule__TestPackage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TestPackage__Group__2__Impl_in_rule__TestPackage__Group__27561);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3719:1: rule__TestPackage__Group__2__Impl : ( ( rule__TestPackage__Group_2__0 )* ) ;
    public final void rule__TestPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3723:1: ( ( ( rule__TestPackage__Group_2__0 )* ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3724:1: ( ( rule__TestPackage__Group_2__0 )* )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3724:1: ( ( rule__TestPackage__Group_2__0 )* )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3725:1: ( rule__TestPackage__Group_2__0 )*
            {
             before(grammarAccess.getTestPackageAccess().getGroup_2()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3726:1: ( rule__TestPackage__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3726:2: rule__TestPackage__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TestPackage__Group_2__0_in_rule__TestPackage__Group__2__Impl7588);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3742:1: rule__TestPackage__Group_2__0 : rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1 ;
    public final void rule__TestPackage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3746:1: ( rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1 )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3747:2: rule__TestPackage__Group_2__0__Impl rule__TestPackage__Group_2__1
            {
            pushFollow(FOLLOW_rule__TestPackage__Group_2__0__Impl_in_rule__TestPackage__Group_2__07625);
            rule__TestPackage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TestPackage__Group_2__1_in_rule__TestPackage__Group_2__07628);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3754:1: rule__TestPackage__Group_2__0__Impl : ( '.' ) ;
    public final void rule__TestPackage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3758:1: ( ( '.' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3759:1: ( '.' )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3759:1: ( '.' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3760:1: '.'
            {
             before(grammarAccess.getTestPackageAccess().getFullStopKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__TestPackage__Group_2__0__Impl7656); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3773:1: rule__TestPackage__Group_2__1 : rule__TestPackage__Group_2__1__Impl ;
    public final void rule__TestPackage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3777:1: ( rule__TestPackage__Group_2__1__Impl )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3778:2: rule__TestPackage__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TestPackage__Group_2__1__Impl_in_rule__TestPackage__Group_2__17687);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3784:1: rule__TestPackage__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__TestPackage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3788:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3789:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3789:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3790:1: RULE_ID
            {
             before(grammarAccess.getTestPackageAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestPackage__Group_2__1__Impl7714); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3806:1: rule__Leta__TpAssignment_0 : ( ruleTestPackage ) ;
    public final void rule__Leta__TpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3810:1: ( ( ruleTestPackage ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3811:1: ( ruleTestPackage )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3811:1: ( ruleTestPackage )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3812:1: ruleTestPackage
            {
             before(grammarAccess.getLetaAccess().getTpTestPackageParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTestPackage_in_rule__Leta__TpAssignment_07752);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3821:1: rule__Leta__TcAssignment_1 : ( ruleTestCase ) ;
    public final void rule__Leta__TcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3825:1: ( ( ruleTestCase ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3826:1: ( ruleTestCase )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3826:1: ( ruleTestCase )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3827:1: ruleTestCase
            {
             before(grammarAccess.getLetaAccess().getTcTestCaseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTestCase_in_rule__Leta__TcAssignment_17783);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3836:1: rule__TestCase__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__TestCase__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3840:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3841:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3841:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3842:1: RULE_ID
            {
             before(grammarAccess.getTestCaseAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TestCase__IdAssignment_17814); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3851:1: rule__TestCase__VAssignment_2 : ( ruleVerifyClause ) ;
    public final void rule__TestCase__VAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3855:1: ( ( ruleVerifyClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3856:1: ( ruleVerifyClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3856:1: ( ruleVerifyClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3857:1: ruleVerifyClause
            {
             before(grammarAccess.getTestCaseAccess().getVVerifyClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVerifyClause_in_rule__TestCase__VAssignment_27845);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3866:1: rule__TestCase__WAssignment_3 : ( ruleWhenClause ) ;
    public final void rule__TestCase__WAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3870:1: ( ( ruleWhenClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3871:1: ( ruleWhenClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3871:1: ( ruleWhenClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3872:1: ruleWhenClause
            {
             before(grammarAccess.getTestCaseAccess().getWWhenClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleWhenClause_in_rule__TestCase__WAssignment_37876);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3881:1: rule__TestCase__SAssignment_4 : ( ruleSetClause ) ;
    public final void rule__TestCase__SAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3885:1: ( ( ruleSetClause ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3886:1: ( ruleSetClause )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3886:1: ( ruleSetClause )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3887:1: ruleSetClause
            {
             before(grammarAccess.getTestCaseAccess().getSSetClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSetClause_in_rule__TestCase__SAssignment_47907);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3896:1: rule__VerifyClause__FcAssignment_1 : ( rulefactComposite ) ;
    public final void rule__VerifyClause__FcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3900:1: ( ( rulefactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3901:1: ( rulefactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3901:1: ( rulefactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3902:1: rulefactComposite
            {
             before(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulefactComposite_in_rule__VerifyClause__FcAssignment_17938);
            rulefactComposite();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3911:1: rule__WhenClause__FcAssignment_1 : ( rulefactComposite ) ;
    public final void rule__WhenClause__FcAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3915:1: ( ( rulefactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3916:1: ( rulefactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3916:1: ( rulefactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3917:1: rulefactComposite
            {
             before(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulefactComposite_in_rule__WhenClause__FcAssignment_17969);
            rulefactComposite();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3926:1: rule__SetClause__SAssignment_3 : ( ruleSet ) ;
    public final void rule__SetClause__SAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3930:1: ( ( ruleSet ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3931:1: ( ruleSet )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3931:1: ( ruleSet )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3932:1: ruleSet
            {
             before(grammarAccess.getSetClauseAccess().getSSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSet_in_rule__SetClause__SAssignment_38000);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3941:1: rule__FactComposite__FAssignment_0_0_0 : ( ruleFact ) ;
    public final void rule__FactComposite__FAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3945:1: ( ( ruleFact ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3946:1: ( ruleFact )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3946:1: ( ruleFact )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3947:1: ruleFact
            {
             before(grammarAccess.getFactCompositeAccess().getFFactParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_ruleFact_in_rule__FactComposite__FAssignment_0_0_08031);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3956:1: rule__FactComposite__FoAssignment_0_0_1 : ( ruleFormula ) ;
    public final void rule__FactComposite__FoAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3960:1: ( ( ruleFormula ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3961:1: ( ruleFormula )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3961:1: ( ruleFormula )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3962:1: ruleFormula
            {
             before(grammarAccess.getFactCompositeAccess().getFoFormulaParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_ruleFormula_in_rule__FactComposite__FoAssignment_0_0_18062);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3971:1: rule__FactComposite__OpAssignment_0_1_0 : ( rulelogicalOperator ) ;
    public final void rule__FactComposite__OpAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3975:1: ( ( rulelogicalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3976:1: ( rulelogicalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3976:1: ( rulelogicalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3977:1: rulelogicalOperator
            {
             before(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_rulelogicalOperator_in_rule__FactComposite__OpAssignment_0_1_08093);
            rulelogicalOperator();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3986:1: rule__FactComposite__FcAssignment_0_1_1 : ( rulefactComposite ) ;
    public final void rule__FactComposite__FcAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3990:1: ( ( rulefactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3991:1: ( rulefactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3991:1: ( rulefactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:3992:1: rulefactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFcFactCompositeParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_rulefactComposite_in_rule__FactComposite__FcAssignment_0_1_18124);
            rulefactComposite();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4001:1: rule__FactComposite__Fc1Assignment_1_1 : ( rulefactComposite ) ;
    public final void rule__FactComposite__Fc1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4005:1: ( ( rulefactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4006:1: ( rulefactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4006:1: ( rulefactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4007:1: rulefactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFc1FactCompositeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulefactComposite_in_rule__FactComposite__Fc1Assignment_1_18155);
            rulefactComposite();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4016:1: rule__FactComposite__OpAssignment_1_3_0 : ( rulelogicalOperator ) ;
    public final void rule__FactComposite__OpAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4020:1: ( ( rulelogicalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4021:1: ( rulelogicalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4021:1: ( rulelogicalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4022:1: rulelogicalOperator
            {
             before(grammarAccess.getFactCompositeAccess().getOpLogicalOperatorParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_rulelogicalOperator_in_rule__FactComposite__OpAssignment_1_3_08186);
            rulelogicalOperator();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4031:1: rule__FactComposite__Fc2Assignment_1_3_1 : ( rulefactComposite ) ;
    public final void rule__FactComposite__Fc2Assignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4035:1: ( ( rulefactComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4036:1: ( rulefactComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4036:1: ( rulefactComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4037:1: rulefactComposite
            {
             before(grammarAccess.getFactCompositeAccess().getFc2FactCompositeParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_rulefactComposite_in_rule__FactComposite__Fc2Assignment_1_3_18217);
            rulefactComposite();

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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4046:1: rule__Fact__TermCompositeAssignment_0 : ( ruleTermComposite ) ;
    public final void rule__Fact__TermCompositeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4050:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4051:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4051:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4052:1: ruleTermComposite
            {
             before(grammarAccess.getFactAccess().getTermCompositeTermCompositeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__Fact__TermCompositeAssignment_08248);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4061:1: rule__Fact__ComplementAssignment_1 : ( ruleComplement ) ;
    public final void rule__Fact__ComplementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4065:1: ( ( ruleComplement ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4066:1: ( ruleComplement )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4066:1: ( ruleComplement )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4067:1: ruleComplement
            {
             before(grammarAccess.getFactAccess().getComplementComplementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplement_in_rule__Fact__ComplementAssignment_18279);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4076:1: rule__Fact__TermComposite2Assignment_2_0 : ( ruleTermComposite ) ;
    public final void rule__Fact__TermComposite2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4080:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4081:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4081:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4082:1: ruleTermComposite
            {
             before(grammarAccess.getFactAccess().getTermComposite2TermCompositeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__Fact__TermComposite2Assignment_2_08310);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4091:1: rule__Fact__FactExtAssignment_2_1 : ( ruleFactExt ) ;
    public final void rule__Fact__FactExtAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4095:1: ( ( ruleFactExt ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4096:1: ( ruleFactExt )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4096:1: ( ruleFactExt )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4097:1: ruleFactExt
            {
             before(grammarAccess.getFactAccess().getFactExtFactExtParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleFactExt_in_rule__Fact__FactExtAssignment_2_18341);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4106:1: rule__FactExt__ComplementAssignment_0 : ( ruleComplement ) ;
    public final void rule__FactExt__ComplementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4110:1: ( ( ruleComplement ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4111:1: ( ruleComplement )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4111:1: ( ruleComplement )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4112:1: ruleComplement
            {
             before(grammarAccess.getFactExtAccess().getComplementComplementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleComplement_in_rule__FactExt__ComplementAssignment_08372);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4121:1: rule__FactExt__TermCompositeAssignment_1_0 : ( ruleTermComposite ) ;
    public final void rule__FactExt__TermCompositeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4125:1: ( ( ruleTermComposite ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4126:1: ( ruleTermComposite )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4126:1: ( ruleTermComposite )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4127:1: ruleTermComposite
            {
             before(grammarAccess.getFactExtAccess().getTermCompositeTermCompositeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTermComposite_in_rule__FactExt__TermCompositeAssignment_1_08403);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4136:1: rule__FactExt__FactExtAssignment_1_1 : ( ruleFactExt ) ;
    public final void rule__FactExt__FactExtAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4140:1: ( ( ruleFactExt ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4141:1: ( ruleFactExt )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4141:1: ( ruleFactExt )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4142:1: ruleFactExt
            {
             before(grammarAccess.getFactExtAccess().getFactExtFactExtParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFactExt_in_rule__FactExt__FactExtAssignment_1_18434);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4151:1: rule__TermComposite__QuantifierAssignment_0 : ( ruleQuantifier ) ;
    public final void rule__TermComposite__QuantifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4155:1: ( ( ruleQuantifier ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4156:1: ( ruleQuantifier )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4156:1: ( ruleQuantifier )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4157:1: ruleQuantifier
            {
             before(grammarAccess.getTermCompositeAccess().getQuantifierQuantifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQuantifier_in_rule__TermComposite__QuantifierAssignment_08465);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4166:1: rule__TermComposite__TermAssignment_1_0 : ( ruleTerm ) ;
    public final void rule__TermComposite__TermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4170:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4171:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4171:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4172:1: ruleTerm
            {
             before(grammarAccess.getTermCompositeAccess().getTermTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermComposite__TermAssignment_1_08496);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4181:1: rule__TermComposite__TermInstanceAssignment_1_1 : ( ruleTermInstance ) ;
    public final void rule__TermComposite__TermInstanceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4185:1: ( ( ruleTermInstance ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4186:1: ( ruleTermInstance )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4186:1: ( ruleTermInstance )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4187:1: ruleTermInstance
            {
             before(grammarAccess.getTermCompositeAccess().getTermInstanceTermInstanceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTermInstance_in_rule__TermComposite__TermInstanceAssignment_1_18527);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4196:1: rule__TermComposite__TermWithAssociationAssignment_1_2 : ( ruleTermWithAssociation ) ;
    public final void rule__TermComposite__TermWithAssociationAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4200:1: ( ( ruleTermWithAssociation ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4201:1: ( ruleTermWithAssociation )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4201:1: ( ruleTermWithAssociation )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4202:1: ruleTermWithAssociation
            {
             before(grammarAccess.getTermCompositeAccess().getTermWithAssociationTermWithAssociationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_rule__TermComposite__TermWithAssociationAssignment_1_28558);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4211:1: rule__Term__IdAssignment : ( RULE_ID ) ;
    public final void rule__Term__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4215:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4216:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4216:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4217:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__IdAssignment8589); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4226:1: rule__TermInstance__TermAssignment_0_0 : ( ruleTerm ) ;
    public final void rule__TermInstance__TermAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4230:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4231:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4231:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4232:1: ruleTerm
            {
             before(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_0_08620);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4241:1: rule__TermInstance__NotEqualOperatorAssignment_0_1 : ( ruleNotEqualOperator ) ;
    public final void rule__TermInstance__NotEqualOperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4245:1: ( ( ruleNotEqualOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4246:1: ( ruleNotEqualOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4246:1: ( ruleNotEqualOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4247:1: ruleNotEqualOperator
            {
             before(grammarAccess.getTermInstanceAccess().getNotEqualOperatorNotEqualOperatorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_rule__TermInstance__NotEqualOperatorAssignment_0_18651);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4256:1: rule__TermInstance__StringLiteralAssignment_0_2 : ( ruleStringLiteral ) ;
    public final void rule__TermInstance__StringLiteralAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4260:1: ( ( ruleStringLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4261:1: ( ruleStringLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4261:1: ( ruleStringLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4262:1: ruleStringLiteral
            {
             before(grammarAccess.getTermInstanceAccess().getStringLiteralStringLiteralParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__TermInstance__StringLiteralAssignment_0_28682);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4271:1: rule__TermInstance__TermAssignment_1_0 : ( ruleTerm ) ;
    public final void rule__TermInstance__TermAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4275:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4276:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4276:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4277:1: ruleTerm
            {
             before(grammarAccess.getTermInstanceAccess().getTermTermParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_1_08713);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4286:1: rule__TermInstance__RelationalOperatorAssignment_1_1 : ( ruleRelationalOperator ) ;
    public final void rule__TermInstance__RelationalOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4290:1: ( ( ruleRelationalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4291:1: ( ruleRelationalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4291:1: ( ruleRelationalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4292:1: ruleRelationalOperator
            {
             before(grammarAccess.getTermInstanceAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_rule__TermInstance__RelationalOperatorAssignment_1_18744);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4301:1: rule__TermInstance__OtherLiteralAssignment_1_2 : ( ruleOtherLiteral ) ;
    public final void rule__TermInstance__OtherLiteralAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4305:1: ( ( ruleOtherLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4306:1: ( ruleOtherLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4306:1: ( ruleOtherLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4307:1: ruleOtherLiteral
            {
             before(grammarAccess.getTermInstanceAccess().getOtherLiteralOtherLiteralParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_rule__TermInstance__OtherLiteralAssignment_1_28775);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4316:1: rule__TermWithAssociation__TAssignment_0 : ( ruleTerm ) ;
    public final void rule__TermWithAssociation__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4320:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4321:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4321:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4322:1: ruleTerm
            {
             before(grammarAccess.getTermWithAssociationAccess().getTTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__TermWithAssociation__TAssignment_08806);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4331:1: rule__TermWithAssociation__RoAssignment_1 : ( ruleRelationalOperator ) ;
    public final void rule__TermWithAssociation__RoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4335:1: ( ( ruleRelationalOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4336:1: ( ruleRelationalOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4336:1: ( ruleRelationalOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4337:1: ruleRelationalOperator
            {
             before(grammarAccess.getTermWithAssociationAccess().getRoRelationalOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOperator_in_rule__TermWithAssociation__RoAssignment_18837);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4346:1: rule__TermWithAssociation__IndexAssignment_3 : ( RULE_INT ) ;
    public final void rule__TermWithAssociation__IndexAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4350:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4351:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4351:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4352:1: RULE_INT
            {
             before(grammarAccess.getTermWithAssociationAccess().getIndexINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TermWithAssociation__IndexAssignment_38868); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4361:1: rule__Quantifier__VAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4365:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4366:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4366:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4367:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_0_18899); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4376:1: rule__Quantifier__VAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4380:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4381:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4381:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4382:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_1_18930); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4391:1: rule__Quantifier__VAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__VAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4395:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4396:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4396:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4397:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getVINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_2_18961); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4406:1: rule__Quantifier__V1Assignment_3_1 : ( RULE_INT ) ;
    public final void rule__Quantifier__V1Assignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4410:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4411:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4411:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4412:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getV1INTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__V1Assignment_3_18992); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4421:1: rule__Quantifier__V2Assignment_3_2 : ( RULE_INT ) ;
    public final void rule__Quantifier__V2Assignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4425:1: ( ( RULE_INT ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4426:1: ( RULE_INT )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4426:1: ( RULE_INT )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4427:1: RULE_INT
            {
             before(grammarAccess.getQuantifierAccess().getV2INTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Quantifier__V2Assignment_3_29023); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4436:1: rule__Complement__IdAssignment : ( RULE_ID ) ;
    public final void rule__Complement__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4440:1: ( ( RULE_ID ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4441:1: ( RULE_ID )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4441:1: ( RULE_ID )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4442:1: RULE_ID
            {
             before(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Complement__IdAssignment9054); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4451:1: rule__Formula__FiAssignment_0 : ( ruleFormulaItem ) ;
    public final void rule__Formula__FiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4455:1: ( ( ruleFormulaItem ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4456:1: ( ruleFormulaItem )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4456:1: ( ruleFormulaItem )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4457:1: ruleFormulaItem
            {
             before(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_rule__Formula__FiAssignment_09085);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4466:1: rule__Formula__FeAssignment_2 : ( ruleFormulaExpression ) ;
    public final void rule__Formula__FeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4470:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4471:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4471:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4472:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__Formula__FeAssignment_29116);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4481:1: rule__FormulaExpression__FiAssignment_0_0 : ( ruleFormulaItem ) ;
    public final void rule__FormulaExpression__FiAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4485:1: ( ( ruleFormulaItem ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4486:1: ( ruleFormulaItem )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4486:1: ( ruleFormulaItem )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4487:1: ruleFormulaItem
            {
             before(grammarAccess.getFormulaExpressionAccess().getFiFormulaItemParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleFormulaItem_in_rule__FormulaExpression__FiAssignment_0_09147);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4496:1: rule__FormulaExpression__MoAssignment_0_1_0 : ( ruleMathOperator ) ;
    public final void rule__FormulaExpression__MoAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4500:1: ( ( ruleMathOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4501:1: ( ruleMathOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4501:1: ( ruleMathOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4502:1: ruleMathOperator
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_0_1_09178);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4511:1: rule__FormulaExpression__FeAssignment_0_1_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__FeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4515:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4516:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4516:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4517:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFeFormulaExpressionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__FeAssignment_0_1_19209);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4526:1: rule__FormulaExpression__Fe1Assignment_1_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__Fe1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4530:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4531:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4531:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4532:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe1FormulaExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe1Assignment_1_19240);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4541:1: rule__FormulaExpression__MoAssignment_1_3_0 : ( ruleMathOperator ) ;
    public final void rule__FormulaExpression__MoAssignment_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4545:1: ( ( ruleMathOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4546:1: ( ruleMathOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4546:1: ( ruleMathOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4547:1: ruleMathOperator
            {
             before(grammarAccess.getFormulaExpressionAccess().getMoMathOperatorParserRuleCall_1_3_0_0()); 
            pushFollow(FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_1_3_09271);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4556:1: rule__FormulaExpression__Fe2Assignment_1_3_1 : ( ruleFormulaExpression ) ;
    public final void rule__FormulaExpression__Fe2Assignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4560:1: ( ( ruleFormulaExpression ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4561:1: ( ruleFormulaExpression )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4561:1: ( ruleFormulaExpression )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4562:1: ruleFormulaExpression
            {
             before(grammarAccess.getFormulaExpressionAccess().getFe2FormulaExpressionParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe2Assignment_1_3_19302);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4571:1: rule__FormulaItem__TAssignment_0 : ( ruleTerm ) ;
    public final void rule__FormulaItem__TAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4575:1: ( ( ruleTerm ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4576:1: ( ruleTerm )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4576:1: ( ruleTerm )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4577:1: ruleTerm
            {
             before(grammarAccess.getFormulaItemAccess().getTTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__FormulaItem__TAssignment_09333);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4586:1: rule__FormulaItem__TiAssignment_1 : ( ruleTermInstance ) ;
    public final void rule__FormulaItem__TiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4590:1: ( ( ruleTermInstance ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4591:1: ( ruleTermInstance )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4591:1: ( ruleTermInstance )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4592:1: ruleTermInstance
            {
             before(grammarAccess.getFormulaItemAccess().getTiTermInstanceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTermInstance_in_rule__FormulaItem__TiAssignment_19364);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4601:1: rule__FormulaItem__TwaAssignment_2 : ( ruleTermWithAssociation ) ;
    public final void rule__FormulaItem__TwaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4605:1: ( ( ruleTermWithAssociation ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4606:1: ( ruleTermWithAssociation )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4606:1: ( ruleTermWithAssociation )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4607:1: ruleTermWithAssociation
            {
             before(grammarAccess.getFormulaItemAccess().getTwaTermWithAssociationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTermWithAssociation_in_rule__FormulaItem__TwaAssignment_29395);
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


    // $ANTLR start "rule__RelationalOperator__OAssignment_0"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4616:1: rule__RelationalOperator__OAssignment_0 : ( ( '>' ) ) ;
    public final void rule__RelationalOperator__OAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4620:1: ( ( ( '>' ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4621:1: ( ( '>' ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4621:1: ( ( '>' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4622:1: ( '>' )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4623:1: ( '>' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4624:1: '>'
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__RelationalOperator__OAssignment_09431); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4639:1: rule__RelationalOperator__OAssignment_1 : ( ( '<' ) ) ;
    public final void rule__RelationalOperator__OAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4643:1: ( ( ( '<' ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4644:1: ( ( '<' ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4644:1: ( ( '<' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4645:1: ( '<' )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4646:1: ( '<' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4647:1: '<'
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__RelationalOperator__OAssignment_19475); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4662:1: rule__RelationalOperator__OAssignment_2 : ( ( '>=' ) ) ;
    public final void rule__RelationalOperator__OAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4666:1: ( ( ( '>=' ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4667:1: ( ( '>=' ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4667:1: ( ( '>=' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4668:1: ( '>=' )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4669:1: ( '>=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4670:1: '>='
            {
             before(grammarAccess.getRelationalOperatorAccess().getOGreaterThanSignEqualsSignKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__RelationalOperator__OAssignment_29519); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4685:1: rule__RelationalOperator__OAssignment_3 : ( ( '<=' ) ) ;
    public final void rule__RelationalOperator__OAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4689:1: ( ( ( '<=' ) ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4690:1: ( ( '<=' ) )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4690:1: ( ( '<=' ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4691:1: ( '<=' )
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4692:1: ( '<=' )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4693:1: '<='
            {
             before(grammarAccess.getRelationalOperatorAccess().getOLessThanSignEqualsSignKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__RelationalOperator__OAssignment_39563); 
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4708:1: rule__RelationalOperator__NeoAssignment_4 : ( ruleNotEqualOperator ) ;
    public final void rule__RelationalOperator__NeoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4712:1: ( ( ruleNotEqualOperator ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4713:1: ( ruleNotEqualOperator )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4713:1: ( ruleNotEqualOperator )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4714:1: ruleNotEqualOperator
            {
             before(grammarAccess.getRelationalOperatorAccess().getNeoNotEqualOperatorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotEqualOperator_in_rule__RelationalOperator__NeoAssignment_49602);
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


    // $ANTLR start "rule__Set__LAssignment_1"
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4723:1: rule__Set__LAssignment_1 : ( ruleList ) ;
    public final void rule__Set__LAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4727:1: ( ( ruleList ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4728:1: ( ruleList )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4728:1: ( ruleList )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4729:1: ruleList
            {
             before(grammarAccess.getSetAccess().getLListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleList_in_rule__Set__LAssignment_19633);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4738:1: rule__Set__SAssignment_3_1 : ( ruleSet ) ;
    public final void rule__Set__SAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4742:1: ( ( ruleSet ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4743:1: ( ruleSet )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4743:1: ( ruleSet )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4744:1: ruleSet
            {
             before(grammarAccess.getSetAccess().getSSetParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSet_in_rule__Set__SAssignment_3_19664);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4753:1: rule__List__SlAssignment_0_0 : ( ruleStringLiteral ) ;
    public final void rule__List__SlAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4757:1: ( ( ruleStringLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4758:1: ( ruleStringLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4758:1: ( ruleStringLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4759:1: ruleStringLiteral
            {
             before(grammarAccess.getListAccess().getSlStringLiteralParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_rule__List__SlAssignment_0_09695);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4768:1: rule__List__OlAssignment_0_1 : ( ruleOtherLiteral ) ;
    public final void rule__List__OlAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4772:1: ( ( ruleOtherLiteral ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4773:1: ( ruleOtherLiteral )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4773:1: ( ruleOtherLiteral )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4774:1: ruleOtherLiteral
            {
             before(grammarAccess.getListAccess().getOlOtherLiteralParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleOtherLiteral_in_rule__List__OlAssignment_0_19726);
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
    // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4783:1: rule__List__LAssignment_1_1 : ( ruleList ) ;
    public final void rule__List__LAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4787:1: ( ( ruleList ) )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4788:1: ( ruleList )
            {
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4788:1: ( ruleList )
            // ../org.leta.plugin.ui/src-gen/org/ui/contentassist/antlr/internal/InternalLeta.g:4789:1: ruleList
            {
             before(grammarAccess.getListAccess().getLListParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleList_in_rule__List__LAssignment_1_19757);
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
        "\1\12\1\uffff\1\4\1\uffff\4\5\1\4\7\12\1\7\1\12";
    static final String DFA2_maxS =
        "\1\46\1\uffff\1\56\1\uffff\5\42\7\47\1\7\1\47";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\16\uffff";
    static final String DFA2_specialS =
        "\22\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\30\uffff\4\1",
            "",
            "\1\16\1\11\1\12\1\13\1\14\1\15\1\1\5\uffff\1\10\10\uffff\1"+
            "\17\10\uffff\1\20\4\uffff\1\3\3\uffff\1\4\1\5\1\6\1\7",
            "",
            "\1\11\1\12\1\13\1\14\1\15\30\uffff\1\20",
            "\1\11\1\12\1\13\1\14\1\15\30\uffff\1\20",
            "\1\11\1\12\1\13\1\14\1\15\30\uffff\1\20",
            "\1\11\1\12\1\13\1\14\1\15\30\uffff\1\20",
            "\1\16\1\11\1\12\1\13\1\14\1\15\17\uffff\1\17\10\uffff\1\20",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\1\34\uffff\1\3",
            "\1\21",
            "\1\1\34\uffff\1\3"
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
            return "812:1: rule__FactComposite__Alternatives_0_0 : ( ( ( rule__FactComposite__FAssignment_0_0_0 ) ) | ( ( rule__FactComposite__FoAssignment_0_0_1 ) ) );";
        }
    }
    static final String DFA4_eotS =
        "\12\uffff";
    static final String DFA4_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA4_minS =
        "\1\12\1\4\4\5\1\4\3\uffff";
    static final String DFA4_maxS =
        "\1\12\1\56\5\42\3\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\3\1\2\1\1";
    static final String DFA4_specialS =
        "\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\6\10\1\11\5\uffff\1\6\2\11\6\uffff\1\10\1\11\1\uffff\2\11"+
            "\3\uffff\1\11\1\7\10\uffff\1\2\1\3\1\4\1\5",
            "\5\10\30\uffff\1\7",
            "\5\10\30\uffff\1\7",
            "\5\10\30\uffff\1\7",
            "\5\10\30\uffff\1\7",
            "\6\10\17\uffff\1\10\10\uffff\1\7",
            "",
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
            return "860:1: rule__TermComposite__Alternatives_1 : ( ( ( rule__TermComposite__TermAssignment_1_0 ) ) | ( ( rule__TermComposite__TermInstanceAssignment_1_1 ) ) | ( ( rule__TermComposite__TermWithAssociationAssignment_1_2 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\12\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\10\10\uffff";
    static final String DFA8_minS =
        "\1\12\1\4\4\5\1\4\3\uffff";
    static final String DFA8_maxS =
        "\1\12\1\56\5\42\3\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\3\1\1\1\2";
    static final String DFA8_specialS =
        "\12\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\6\11\6\uffff\1\6\10\10\1\11\1\10\1\uffff\2\10\3\uffff\1\10"+
            "\1\7\4\uffff\1\10\3\uffff\1\2\1\3\1\4\1\5",
            "\5\11\30\uffff\1\7",
            "\5\11\30\uffff\1\7",
            "\5\11\30\uffff\1\7",
            "\5\11\30\uffff\1\7",
            "\6\11\17\uffff\1\11\10\uffff\1\7",
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
            return "966:1: rule__FormulaItem__Alternatives : ( ( ( rule__FormulaItem__TAssignment_0 ) ) | ( ( rule__FormulaItem__TiAssignment_1 ) ) | ( ( rule__FormulaItem__TwaAssignment_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleLeta_in_entryRuleLeta61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeta68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__0_in_ruleLeta94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_entryRuleTestCase121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestCase128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__0_in_ruleTestCase154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_entryRuleVerifyClause181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerifyClause188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__0_in_ruleVerifyClause214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_entryRuleWhenClause241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWhenClause248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__0_in_ruleWhenClause274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_entryRuleSetClause301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSetClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__0_in_ruleSetClause334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_entryRulefactComposite361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefactComposite368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Alternatives_in_rulefactComposite394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_entryRulelogicalOperator421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelogicalOperator428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOperator__Alternatives_in_rulelogicalOperator454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_entryRuleFact481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFact488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0_in_ruleFact514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_entryRuleFactExt541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFactExt548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__0_in_ruleFactExt574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_entryRuleTermComposite601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermComposite608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__0_in_ruleTermComposite634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__IdAssignment_in_ruleTerm694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_entryRuleTermInstance721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermInstance728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Alternatives_in_ruleTermInstance754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_entryRuleTermWithAssociation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTermWithAssociation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__0_in_ruleTermWithAssociation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_entryRuleQuantifier841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifier848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Alternatives_in_ruleQuantifier874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_entryRuleComplement901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplement908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Complement__IdAssignment_in_ruleComplement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_entryRuleFormula961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormula968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0_in_ruleFormula994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_entryRuleFormulaExpression1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaExpression1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Alternatives_in_ruleFormulaExpression1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_entryRuleFormulaItem1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormulaItem1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__Alternatives_in_ruleFormulaItem1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_entryRuleMathOperator1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOperator1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MathOperator__Alternatives_in_ruleMathOperator1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_entryRuleRelationalOperator1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOperator1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__Alternatives_in_ruleRelationalOperator1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_entryRuleNotEqualOperator1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualOperator1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleNotEqualOperator1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_entryRuleSet1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSet1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0_in_ruleSet1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringLiteral__Alternatives_in_ruleStringLiteral1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_entryRuleOtherLiteral1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherLiteral1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherLiteral__Alternatives_in_ruleOtherLiteral1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_entryRuleTestPackage1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestPackage1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__0_in_ruleTestPackage1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__0_in_rule__FactComposite__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__0_in_rule__FactComposite__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FAssignment_0_0_0_in_rule__FactComposite__Alternatives_0_01683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FoAssignment_0_0_1_in_rule__FactComposite__Alternatives_0_01701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LogicalOperator__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicalOperator__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermAssignment_1_0_in_rule__TermComposite__Alternatives_11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermInstanceAssignment_1_1_in_rule__TermComposite__Alternatives_11807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__TermWithAssociationAssignment_1_2_in_rule__TermComposite__Alternatives_11825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__0_in_rule__TermInstance__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__0_in_rule__TermInstance__Alternatives1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__0_in_rule__Quantifier__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__0_in_rule__Quantifier__Alternatives1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__0_in_rule__Quantifier__Alternatives1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__0_in_rule__Quantifier__Alternatives1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__0_in_rule__FormulaExpression__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__0_in_rule__FormulaExpression__Alternatives2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TAssignment_0_in_rule__FormulaItem__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TiAssignment_1_in_rule__FormulaItem__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaItem__TwaAssignment_2_in_rule__FormulaItem__Alternatives2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MathOperator__Alternatives2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MathOperator__Alternatives2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MathOperator__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MathOperator__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MathOperator__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MathOperator__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_0_in_rule__RelationalOperator__Alternatives2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_1_in_rule__RelationalOperator__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_2_in_rule__RelationalOperator__Alternatives2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__OAssignment_3_in_rule__RelationalOperator__Alternatives2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOperator__NeoAssignment_4_in_rule__RelationalOperator__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__SlAssignment_0_0_in_rule__List__Alternatives_02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__OlAssignment_0_1_in_rule__List__Alternatives_02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringLiteral__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StringLiteral__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__OtherLiteral__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_FLOAT_in_rule__OtherLiteral__Alternatives2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__OtherLiteral__Alternatives2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_INTEGER_in_rule__OtherLiteral__Alternatives2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_rule__OtherLiteral__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__0__Impl_in_rule__Leta__Group__02557 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Leta__Group__1_in_rule__Leta__Group__02560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__TpAssignment_0_in_rule__Leta__Group__0__Impl2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__Group__1__Impl_in_rule__Leta__Group__12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2647 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Leta__TcAssignment_1_in_rule__Leta__Group__1__Impl2659 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__0__Impl_in_rule__TestCase__Group__02696 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TestCase__Group__1_in_rule__TestCase__Group__02699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TestCase__Group__0__Impl2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__1__Impl_in_rule__TestCase__Group__12758 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__2_in_rule__TestCase__Group__12761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__IdAssignment_1_in_rule__TestCase__Group__1__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__2__Impl_in_rule__TestCase__Group__22818 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__3_in_rule__TestCase__Group__22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__VAssignment_2_in_rule__TestCase__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__3__Impl_in_rule__TestCase__Group__32878 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__TestCase__Group__4_in_rule__TestCase__Group__32881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__WAssignment_3_in_rule__TestCase__Group__3__Impl2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__Group__4__Impl_in_rule__TestCase__Group__42938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestCase__SAssignment_4_in_rule__TestCase__Group__4__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__0__Impl_in_rule__VerifyClause__Group__03006 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__1_in_rule__VerifyClause__Group__03009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VerifyClause__Group__0__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__Group__1__Impl_in_rule__VerifyClause__Group__13068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VerifyClause__FcAssignment_1_in_rule__VerifyClause__Group__1__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__0__Impl_in_rule__WhenClause__Group__03129 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__1_in_rule__WhenClause__Group__03132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__WhenClause__Group__0__Impl3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__Group__1__Impl_in_rule__WhenClause__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WhenClause__FcAssignment_1_in_rule__WhenClause__Group__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__0__Impl_in_rule__SetClause__Group__03252 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__1_in_rule__SetClause__Group__03255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__1__Impl_in_rule__SetClause__Group__13313 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__2_in_rule__SetClause__Group__13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SetClause__Group__1__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__2__Impl_in_rule__SetClause__Group__23375 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__3_in_rule__SetClause__Group__23378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SetClause__Group__2__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__3__Impl_in_rule__SetClause__Group__33437 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__SetClause__Group__4_in_rule__SetClause__Group__33440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__SAssignment_3_in_rule__SetClause__Group__3__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SetClause__Group__4__Impl_in_rule__SetClause__Group__43498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SetClause__Group__4__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__0__Impl_in_rule__FactComposite__Group_0__03567 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__1_in_rule__FactComposite__Group_0__03570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Alternatives_0_0_in_rule__FactComposite__Group_0__0__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0__1__Impl_in_rule__FactComposite__Group_0__13627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__0_in_rule__FactComposite__Group_0__1__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__0__Impl_in_rule__FactComposite__Group_0_1__03689 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__1_in_rule__FactComposite__Group_0_1__03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__OpAssignment_0_1_0_in_rule__FactComposite__Group_0_1__0__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_0_1__1__Impl_in_rule__FactComposite__Group_0_1__13749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__FcAssignment_0_1_1_in_rule__FactComposite__Group_0_1__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__0__Impl_in_rule__FactComposite__Group_1__03810 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__1_in_rule__FactComposite__Group_1__03813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FactComposite__Group_1__0__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__1__Impl_in_rule__FactComposite__Group_1__13872 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__2_in_rule__FactComposite__Group_1__13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Fc1Assignment_1_1_in_rule__FactComposite__Group_1__1__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__2__Impl_in_rule__FactComposite__Group_1__23932 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__3_in_rule__FactComposite__Group_1__23935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FactComposite__Group_1__2__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1__3__Impl_in_rule__FactComposite__Group_1__33994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__0_in_rule__FactComposite__Group_1__3__Impl4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__0__Impl_in_rule__FactComposite__Group_1_3__04060 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__1_in_rule__FactComposite__Group_1_3__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__OpAssignment_1_3_0_in_rule__FactComposite__Group_1_3__0__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Group_1_3__1__Impl_in_rule__FactComposite__Group_1_3__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactComposite__Fc2Assignment_1_3_1_in_rule__FactComposite__Group_1_3__1__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__0__Impl_in_rule__Fact__Group__04181 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fact__Group__1_in_rule__Fact__Group__04184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__TermCompositeAssignment_0_in_rule__Fact__Group__0__Impl4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__1__Impl_in_rule__Fact__Group__14241 = new BitSet(new long[]{0x0000007800000400L});
    public static final BitSet FOLLOW_rule__Fact__Group__2_in_rule__Fact__Group__14244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__ComplementAssignment_1_in_rule__Fact__Group__1__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group__2__Impl_in_rule__Fact__Group__24301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0_in_rule__Fact__Group__2__Impl4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__0__Impl_in_rule__Fact__Group_2__04365 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1_in_rule__Fact__Group_2__04368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__TermComposite2Assignment_2_0_in_rule__Fact__Group_2__0__Impl4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__Group_2__1__Impl_in_rule__Fact__Group_2__14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fact__FactExtAssignment_2_1_in_rule__Fact__Group_2__1__Impl4452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__0__Impl_in_rule__FactExt__Group__04487 = new BitSet(new long[]{0x0000007800000400L});
    public static final BitSet FOLLOW_rule__FactExt__Group__1_in_rule__FactExt__Group__04490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__ComplementAssignment_0_in_rule__FactExt__Group__0__Impl4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group__1__Impl_in_rule__FactExt__Group__14547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__0_in_rule__FactExt__Group__1__Impl4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__0__Impl_in_rule__FactExt__Group_1__04609 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__1_in_rule__FactExt__Group_1__04612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__TermCompositeAssignment_1_0_in_rule__FactExt__Group_1__0__Impl4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__Group_1__1__Impl_in_rule__FactExt__Group_1__14669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FactExt__FactExtAssignment_1_1_in_rule__FactExt__Group_1__1__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__0__Impl_in_rule__TermComposite__Group__04731 = new BitSet(new long[]{0x0000007800000400L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__1_in_rule__TermComposite__Group__04734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__QuantifierAssignment_0_in_rule__TermComposite__Group__0__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Group__1__Impl_in_rule__TermComposite__Group__14792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermComposite__Alternatives_1_in_rule__TermComposite__Group__1__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__0__Impl_in_rule__TermInstance__Group_0__04853 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__1_in_rule__TermInstance__Group_0__04856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__TermAssignment_0_0_in_rule__TermInstance__Group_0__0__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__1__Impl_in_rule__TermInstance__Group_0__14913 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__2_in_rule__TermInstance__Group_0__14916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__NotEqualOperatorAssignment_0_1_in_rule__TermInstance__Group_0__1__Impl4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_0__2__Impl_in_rule__TermInstance__Group_0__24974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__StringLiteralAssignment_0_2_in_rule__TermInstance__Group_0__2__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__0__Impl_in_rule__TermInstance__Group_1__05037 = new BitSet(new long[]{0x00007800000103E0L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__1_in_rule__TermInstance__Group_1__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__TermAssignment_1_0_in_rule__TermInstance__Group_1__0__Impl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__1__Impl_in_rule__TermInstance__Group_1__15097 = new BitSet(new long[]{0x00007800000103E0L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__2_in_rule__TermInstance__Group_1__15100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__RelationalOperatorAssignment_1_1_in_rule__TermInstance__Group_1__1__Impl5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__Group_1__2__Impl_in_rule__TermInstance__Group_1__25158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermInstance__OtherLiteralAssignment_1_2_in_rule__TermInstance__Group_1__2__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__0__Impl_in_rule__TermWithAssociation__Group__05221 = new BitSet(new long[]{0x0000780400010000L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__1_in_rule__TermWithAssociation__Group__05224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__TAssignment_0_in_rule__TermWithAssociation__Group__0__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__1__Impl_in_rule__TermWithAssociation__Group__15281 = new BitSet(new long[]{0x0000780400010000L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__2_in_rule__TermWithAssociation__Group__15284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__RoAssignment_1_in_rule__TermWithAssociation__Group__1__Impl5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__2__Impl_in_rule__TermWithAssociation__Group__25342 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__3_in_rule__TermWithAssociation__Group__25345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TermWithAssociation__Group__2__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__Group__3__Impl_in_rule__TermWithAssociation__Group__35404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TermWithAssociation__IndexAssignment_3_in_rule__TermWithAssociation__Group__3__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__0__Impl_in_rule__Quantifier__Group_0__05469 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__1_in_rule__Quantifier__Group_0__05472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Quantifier__Group_0__0__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_0__1__Impl_in_rule__Quantifier__Group_0__15531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_0_1_in_rule__Quantifier__Group_0__1__Impl5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__0__Impl_in_rule__Quantifier__Group_1__05592 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__1_in_rule__Quantifier__Group_1__05595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Quantifier__Group_1__0__Impl5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_1__1__Impl_in_rule__Quantifier__Group_1__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_1_1_in_rule__Quantifier__Group_1__1__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__0__Impl_in_rule__Quantifier__Group_2__05715 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__1_in_rule__Quantifier__Group_2__05718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Quantifier__Group_2__0__Impl5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_2__1__Impl_in_rule__Quantifier__Group_2__15777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__VAssignment_2_1_in_rule__Quantifier__Group_2__1__Impl5804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__0__Impl_in_rule__Quantifier__Group_3__05838 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__1_in_rule__Quantifier__Group_3__05841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Quantifier__Group_3__0__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__1__Impl_in_rule__Quantifier__Group_3__15900 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__2_in_rule__Quantifier__Group_3__15903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__V1Assignment_3_1_in_rule__Quantifier__Group_3__1__Impl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__Group_3__2__Impl_in_rule__Quantifier__Group_3__25960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quantifier__V2Assignment_3_2_in_rule__Quantifier__Group_3__2__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__0__Impl_in_rule__Formula__Group__06023 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Formula__Group__1_in_rule__Formula__Group__06026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__FiAssignment_0_in_rule__Formula__Group__0__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__1__Impl_in_rule__Formula__Group__16083 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__Formula__Group__2_in_rule__Formula__Group__16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Formula__Group__1__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__Group__2__Impl_in_rule__Formula__Group__26145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Formula__FeAssignment_2_in_rule__Formula__Group__2__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__0__Impl_in_rule__FormulaExpression__Group_0__06208 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__1_in_rule__FormulaExpression__Group_0__06211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__FiAssignment_0_0_in_rule__FormulaExpression__Group_0__0__Impl6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0__1__Impl_in_rule__FormulaExpression__Group_0__16268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__0_in_rule__FormulaExpression__Group_0__1__Impl6295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__0__Impl_in_rule__FormulaExpression__Group_0_1__06330 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__1_in_rule__FormulaExpression__Group_0_1__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__MoAssignment_0_1_0_in_rule__FormulaExpression__Group_0_1__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_0_1__1__Impl_in_rule__FormulaExpression__Group_0_1__16390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__FeAssignment_0_1_1_in_rule__FormulaExpression__Group_0_1__1__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__0__Impl_in_rule__FormulaExpression__Group_1__06451 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__1_in_rule__FormulaExpression__Group_1__06454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FormulaExpression__Group_1__0__Impl6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__1__Impl_in_rule__FormulaExpression__Group_1__16513 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__2_in_rule__FormulaExpression__Group_1__16516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Fe1Assignment_1_1_in_rule__FormulaExpression__Group_1__1__Impl6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__2__Impl_in_rule__FormulaExpression__Group_1__26573 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__3_in_rule__FormulaExpression__Group_1__26576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FormulaExpression__Group_1__2__Impl6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1__3__Impl_in_rule__FormulaExpression__Group_1__36635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__0_in_rule__FormulaExpression__Group_1__3__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__0__Impl_in_rule__FormulaExpression__Group_1_3__06701 = new BitSet(new long[]{0x0000007900000400L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__1_in_rule__FormulaExpression__Group_1_3__06704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__MoAssignment_1_3_0_in_rule__FormulaExpression__Group_1_3__0__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Group_1_3__1__Impl_in_rule__FormulaExpression__Group_1_3__16761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormulaExpression__Fe2Assignment_1_3_1_in_rule__FormulaExpression__Group_1_3__1__Impl6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__0__Impl_in_rule__Set__Group__06822 = new BitSet(new long[]{0x00007800020103F0L});
    public static final BitSet FOLLOW_rule__Set__Group__1_in_rule__Set__Group__06825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Set__Group__0__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__1__Impl_in_rule__Set__Group__16884 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Set__Group__2_in_rule__Set__Group__16887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__LAssignment_1_in_rule__Set__Group__1__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__2__Impl_in_rule__Set__Group__26944 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Set__Group__3_in_rule__Set__Group__26947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Set__Group__2__Impl6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group__3__Impl_in_rule__Set__Group__37006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__0_in_rule__Set__Group__3__Impl7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__0__Impl_in_rule__Set__Group_3__07072 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Set__Group_3__1_in_rule__Set__Group_3__07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Set__Group_3__0__Impl7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__Group_3__1__Impl_in_rule__Set__Group_3__17134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Set__SAssignment_3_1_in_rule__Set__Group_3__1__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__07195 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__07198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Alternatives_0_in_rule__List__Group__0__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__17255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__0_in_rule__List__Group__1__Impl7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__0__Impl_in_rule__List__Group_1__07317 = new BitSet(new long[]{0x00007800020103F0L});
    public static final BitSet FOLLOW_rule__List__Group_1__1_in_rule__List__Group_1__07320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__List__Group_1__0__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__Group_1__1__Impl_in_rule__List__Group_1__17379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__List__LAssignment_1_1_in_rule__List__Group_1__1__Impl7406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__0__Impl_in_rule__TestPackage__Group__07440 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__1_in_rule__TestPackage__Group__07443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TestPackage__Group__0__Impl7471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__1__Impl_in_rule__TestPackage__Group__17502 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__2_in_rule__TestPackage__Group__17505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestPackage__Group__1__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group__2__Impl_in_rule__TestPackage__Group__27561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__0_in_rule__TestPackage__Group__2__Impl7588 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__0__Impl_in_rule__TestPackage__Group_2__07625 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__1_in_rule__TestPackage__Group_2__07628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TestPackage__Group_2__0__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TestPackage__Group_2__1__Impl_in_rule__TestPackage__Group_2__17687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestPackage__Group_2__1__Impl7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestPackage_in_rule__Leta__TpAssignment_07752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestCase_in_rule__Leta__TcAssignment_17783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TestCase__IdAssignment_17814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerifyClause_in_rule__TestCase__VAssignment_27845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenClause_in_rule__TestCase__WAssignment_37876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSetClause_in_rule__TestCase__SAssignment_47907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_rule__VerifyClause__FcAssignment_17938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_rule__WhenClause__FcAssignment_17969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_rule__SetClause__SAssignment_38000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFact_in_rule__FactComposite__FAssignment_0_0_08031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormula_in_rule__FactComposite__FoAssignment_0_0_18062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_rule__FactComposite__OpAssignment_0_1_08093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_rule__FactComposite__FcAssignment_0_1_18124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_rule__FactComposite__Fc1Assignment_1_18155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelogicalOperator_in_rule__FactComposite__OpAssignment_1_3_08186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefactComposite_in_rule__FactComposite__Fc2Assignment_1_3_18217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__Fact__TermCompositeAssignment_08248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_rule__Fact__ComplementAssignment_18279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__Fact__TermComposite2Assignment_2_08310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_rule__Fact__FactExtAssignment_2_18341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplement_in_rule__FactExt__ComplementAssignment_08372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermComposite_in_rule__FactExt__TermCompositeAssignment_1_08403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFactExt_in_rule__FactExt__FactExtAssignment_1_18434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifier_in_rule__TermComposite__QuantifierAssignment_08465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermComposite__TermAssignment_1_08496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_rule__TermComposite__TermInstanceAssignment_1_18527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_rule__TermComposite__TermWithAssociationAssignment_1_28558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__IdAssignment8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_0_08620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_rule__TermInstance__NotEqualOperatorAssignment_0_18651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__TermInstance__StringLiteralAssignment_0_28682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermInstance__TermAssignment_1_08713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rule__TermInstance__RelationalOperatorAssignment_1_18744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_rule__TermInstance__OtherLiteralAssignment_1_28775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__TermWithAssociation__TAssignment_08806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_rule__TermWithAssociation__RoAssignment_18837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TermWithAssociation__IndexAssignment_38868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_0_18899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_1_18930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__VAssignment_2_18961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__V1Assignment_3_18992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Quantifier__V2Assignment_3_29023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Complement__IdAssignment9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_rule__Formula__FiAssignment_09085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__Formula__FeAssignment_29116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaItem_in_rule__FormulaExpression__FiAssignment_0_09147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_0_1_09178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__FeAssignment_0_1_19209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe1Assignment_1_19240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOperator_in_rule__FormulaExpression__MoAssignment_1_3_09271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormulaExpression_in_rule__FormulaExpression__Fe2Assignment_1_3_19302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__FormulaItem__TAssignment_09333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermInstance_in_rule__FormulaItem__TiAssignment_19364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTermWithAssociation_in_rule__FormulaItem__TwaAssignment_29395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RelationalOperator__OAssignment_09431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RelationalOperator__OAssignment_19475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RelationalOperator__OAssignment_29519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RelationalOperator__OAssignment_39563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualOperator_in_rule__RelationalOperator__NeoAssignment_49602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__Set__LAssignment_19633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSet_in_rule__Set__SAssignment_3_19664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_rule__List__SlAssignment_0_09695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherLiteral_in_rule__List__OlAssignment_0_19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_rule__List__LAssignment_1_19757 = new BitSet(new long[]{0x0000000000000002L});

}