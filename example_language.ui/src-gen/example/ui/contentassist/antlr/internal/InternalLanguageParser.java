package example.ui.contentassist.antlr.internal; 

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
import example.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Composer'", "'{'", "'}'", "','", "'Creator'", "'('", "')'", "'Updater'", "'['", "']'", "'Declarer'", "'Assigner'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g"; }


     
     	private LanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleComposer"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:60:1: entryRuleComposer : ruleComposer EOF ;
    public final void entryRuleComposer() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:61:1: ( ruleComposer EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:62:1: ruleComposer EOF
            {
             before(grammarAccess.getComposerRule()); 
            pushFollow(FOLLOW_ruleComposer_in_entryRuleComposer61);
            ruleComposer();

            state._fsp--;

             after(grammarAccess.getComposerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposer68); 

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
    // $ANTLR end "entryRuleComposer"


    // $ANTLR start "ruleComposer"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:69:1: ruleComposer : ( ( rule__Composer__Group__0 ) ) ;
    public final void ruleComposer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:73:2: ( ( ( rule__Composer__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__Composer__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:74:1: ( ( rule__Composer__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:75:1: ( rule__Composer__Group__0 )
            {
             before(grammarAccess.getComposerAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:76:1: ( rule__Composer__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:76:2: rule__Composer__Group__0
            {
            pushFollow(FOLLOW_rule__Composer__Group__0_in_ruleComposer94);
            rule__Composer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposer"


    // $ANTLR start "entryRuleMTLPrimitive"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:88:1: entryRuleMTLPrimitive : ruleMTLPrimitive EOF ;
    public final void entryRuleMTLPrimitive() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:89:1: ( ruleMTLPrimitive EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:90:1: ruleMTLPrimitive EOF
            {
             before(grammarAccess.getMTLPrimitiveRule()); 
            pushFollow(FOLLOW_ruleMTLPrimitive_in_entryRuleMTLPrimitive121);
            ruleMTLPrimitive();

            state._fsp--;

             after(grammarAccess.getMTLPrimitiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMTLPrimitive128); 

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
    // $ANTLR end "entryRuleMTLPrimitive"


    // $ANTLR start "ruleMTLPrimitive"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:97:1: ruleMTLPrimitive : ( ( rule__MTLPrimitive__Alternatives ) ) ;
    public final void ruleMTLPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:101:2: ( ( ( rule__MTLPrimitive__Alternatives ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__MTLPrimitive__Alternatives ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:102:1: ( ( rule__MTLPrimitive__Alternatives ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:103:1: ( rule__MTLPrimitive__Alternatives )
            {
             before(grammarAccess.getMTLPrimitiveAccess().getAlternatives()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:104:1: ( rule__MTLPrimitive__Alternatives )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:104:2: rule__MTLPrimitive__Alternatives
            {
            pushFollow(FOLLOW_rule__MTLPrimitive__Alternatives_in_ruleMTLPrimitive154);
            rule__MTLPrimitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMTLPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMTLPrimitive"


    // $ANTLR start "entryRuleCreator"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:116:1: entryRuleCreator : ruleCreator EOF ;
    public final void entryRuleCreator() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:117:1: ( ruleCreator EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:118:1: ruleCreator EOF
            {
             before(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator181);
            ruleCreator();

            state._fsp--;

             after(grammarAccess.getCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator188); 

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
    // $ANTLR end "entryRuleCreator"


    // $ANTLR start "ruleCreator"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:125:1: ruleCreator : ( ( rule__Creator__Group__0 ) ) ;
    public final void ruleCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:129:2: ( ( ( rule__Creator__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__Creator__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:130:1: ( ( rule__Creator__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:131:1: ( rule__Creator__Group__0 )
            {
             before(grammarAccess.getCreatorAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:132:1: ( rule__Creator__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:132:2: rule__Creator__Group__0
            {
            pushFollow(FOLLOW_rule__Creator__Group__0_in_ruleCreator214);
            rule__Creator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreator"


    // $ANTLR start "entryRuleUpdater"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:144:1: entryRuleUpdater : ruleUpdater EOF ;
    public final void entryRuleUpdater() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:145:1: ( ruleUpdater EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:146:1: ruleUpdater EOF
            {
             before(grammarAccess.getUpdaterRule()); 
            pushFollow(FOLLOW_ruleUpdater_in_entryRuleUpdater241);
            ruleUpdater();

            state._fsp--;

             after(grammarAccess.getUpdaterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdater248); 

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
    // $ANTLR end "entryRuleUpdater"


    // $ANTLR start "ruleUpdater"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:153:1: ruleUpdater : ( ( rule__Updater__Group__0 ) ) ;
    public final void ruleUpdater() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:157:2: ( ( ( rule__Updater__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__Updater__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:158:1: ( ( rule__Updater__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:159:1: ( rule__Updater__Group__0 )
            {
             before(grammarAccess.getUpdaterAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:160:1: ( rule__Updater__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:160:2: rule__Updater__Group__0
            {
            pushFollow(FOLLOW_rule__Updater__Group__0_in_ruleUpdater274);
            rule__Updater__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdaterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdater"


    // $ANTLR start "entryRuleFeatureAssigner"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:172:1: entryRuleFeatureAssigner : ruleFeatureAssigner EOF ;
    public final void entryRuleFeatureAssigner() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:173:1: ( ruleFeatureAssigner EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:174:1: ruleFeatureAssigner EOF
            {
             before(grammarAccess.getFeatureAssignerRule()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_entryRuleFeatureAssigner301);
            ruleFeatureAssigner();

            state._fsp--;

             after(grammarAccess.getFeatureAssignerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureAssigner308); 

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
    // $ANTLR end "entryRuleFeatureAssigner"


    // $ANTLR start "ruleFeatureAssigner"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:181:1: ruleFeatureAssigner : ( ( rule__FeatureAssigner__Group__0 ) ) ;
    public final void ruleFeatureAssigner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:185:2: ( ( ( rule__FeatureAssigner__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:186:1: ( ( rule__FeatureAssigner__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:186:1: ( ( rule__FeatureAssigner__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:187:1: ( rule__FeatureAssigner__Group__0 )
            {
             before(grammarAccess.getFeatureAssignerAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:188:1: ( rule__FeatureAssigner__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:188:2: rule__FeatureAssigner__Group__0
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__0_in_ruleFeatureAssigner334);
            rule__FeatureAssigner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAssignerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureAssigner"


    // $ANTLR start "entryRuleDeclarer"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:200:1: entryRuleDeclarer : ruleDeclarer EOF ;
    public final void entryRuleDeclarer() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:201:1: ( ruleDeclarer EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:202:1: ruleDeclarer EOF
            {
             before(grammarAccess.getDeclarerRule()); 
            pushFollow(FOLLOW_ruleDeclarer_in_entryRuleDeclarer361);
            ruleDeclarer();

            state._fsp--;

             after(grammarAccess.getDeclarerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarer368); 

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
    // $ANTLR end "entryRuleDeclarer"


    // $ANTLR start "ruleDeclarer"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:209:1: ruleDeclarer : ( ( rule__Declarer__Group__0 ) ) ;
    public final void ruleDeclarer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:213:2: ( ( ( rule__Declarer__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:214:1: ( ( rule__Declarer__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:214:1: ( ( rule__Declarer__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:215:1: ( rule__Declarer__Group__0 )
            {
             before(grammarAccess.getDeclarerAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:216:1: ( rule__Declarer__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:216:2: rule__Declarer__Group__0
            {
            pushFollow(FOLLOW_rule__Declarer__Group__0_in_ruleDeclarer394);
            rule__Declarer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclarer"


    // $ANTLR start "entryRuleAssigner"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:228:1: entryRuleAssigner : ruleAssigner EOF ;
    public final void entryRuleAssigner() throws RecognitionException {
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:229:1: ( ruleAssigner EOF )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:230:1: ruleAssigner EOF
            {
             before(grammarAccess.getAssignerRule()); 
            pushFollow(FOLLOW_ruleAssigner_in_entryRuleAssigner421);
            ruleAssigner();

            state._fsp--;

             after(grammarAccess.getAssignerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigner428); 

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
    // $ANTLR end "entryRuleAssigner"


    // $ANTLR start "ruleAssigner"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:237:1: ruleAssigner : ( ( rule__Assigner__Group__0 ) ) ;
    public final void ruleAssigner() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:241:2: ( ( ( rule__Assigner__Group__0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:242:1: ( ( rule__Assigner__Group__0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:242:1: ( ( rule__Assigner__Group__0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:243:1: ( rule__Assigner__Group__0 )
            {
             before(grammarAccess.getAssignerAccess().getGroup()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:244:1: ( rule__Assigner__Group__0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:244:2: rule__Assigner__Group__0
            {
            pushFollow(FOLLOW_rule__Assigner__Group__0_in_ruleAssigner454);
            rule__Assigner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssigner"


    // $ANTLR start "rule__MTLPrimitive__Alternatives"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:256:1: rule__MTLPrimitive__Alternatives : ( ( ruleCreator ) | ( ruleUpdater ) | ( ruleDeclarer ) | ( ruleAssigner ) | ( ruleComposer ) );
    public final void rule__MTLPrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:260:1: ( ( ruleCreator ) | ( ruleUpdater ) | ( ruleDeclarer ) | ( ruleAssigner ) | ( ruleComposer ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 21:
                {
                alt1=3;
                }
                break;
            case 22:
                {
                alt1=4;
                }
                break;
            case 11:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:261:1: ( ruleCreator )
                    {
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:261:1: ( ruleCreator )
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:262:1: ruleCreator
                    {
                     before(grammarAccess.getMTLPrimitiveAccess().getCreatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreator_in_rule__MTLPrimitive__Alternatives490);
                    ruleCreator();

                    state._fsp--;

                     after(grammarAccess.getMTLPrimitiveAccess().getCreatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:267:6: ( ruleUpdater )
                    {
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:267:6: ( ruleUpdater )
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:268:1: ruleUpdater
                    {
                     before(grammarAccess.getMTLPrimitiveAccess().getUpdaterParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUpdater_in_rule__MTLPrimitive__Alternatives507);
                    ruleUpdater();

                    state._fsp--;

                     after(grammarAccess.getMTLPrimitiveAccess().getUpdaterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:273:6: ( ruleDeclarer )
                    {
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:273:6: ( ruleDeclarer )
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:274:1: ruleDeclarer
                    {
                     before(grammarAccess.getMTLPrimitiveAccess().getDeclarerParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDeclarer_in_rule__MTLPrimitive__Alternatives524);
                    ruleDeclarer();

                    state._fsp--;

                     after(grammarAccess.getMTLPrimitiveAccess().getDeclarerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:279:6: ( ruleAssigner )
                    {
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:279:6: ( ruleAssigner )
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:280:1: ruleAssigner
                    {
                     before(grammarAccess.getMTLPrimitiveAccess().getAssignerParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAssigner_in_rule__MTLPrimitive__Alternatives541);
                    ruleAssigner();

                    state._fsp--;

                     after(grammarAccess.getMTLPrimitiveAccess().getAssignerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:285:6: ( ruleComposer )
                    {
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:285:6: ( ruleComposer )
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:286:1: ruleComposer
                    {
                     before(grammarAccess.getMTLPrimitiveAccess().getComposerParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleComposer_in_rule__MTLPrimitive__Alternatives558);
                    ruleComposer();

                    state._fsp--;

                     after(grammarAccess.getMTLPrimitiveAccess().getComposerParserRuleCall_4()); 

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
    // $ANTLR end "rule__MTLPrimitive__Alternatives"


    // $ANTLR start "rule__Composer__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:298:1: rule__Composer__Group__0 : rule__Composer__Group__0__Impl rule__Composer__Group__1 ;
    public final void rule__Composer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:302:1: ( rule__Composer__Group__0__Impl rule__Composer__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:303:2: rule__Composer__Group__0__Impl rule__Composer__Group__1
            {
            pushFollow(FOLLOW_rule__Composer__Group__0__Impl_in_rule__Composer__Group__0588);
            rule__Composer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group__1_in_rule__Composer__Group__0591);
            rule__Composer__Group__1();

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
    // $ANTLR end "rule__Composer__Group__0"


    // $ANTLR start "rule__Composer__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:310:1: rule__Composer__Group__0__Impl : ( 'Composer' ) ;
    public final void rule__Composer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:314:1: ( ( 'Composer' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:315:1: ( 'Composer' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:315:1: ( 'Composer' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:316:1: 'Composer'
            {
             before(grammarAccess.getComposerAccess().getComposerKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Composer__Group__0__Impl619); 
             after(grammarAccess.getComposerAccess().getComposerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__0__Impl"


    // $ANTLR start "rule__Composer__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:329:1: rule__Composer__Group__1 : rule__Composer__Group__1__Impl rule__Composer__Group__2 ;
    public final void rule__Composer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:333:1: ( rule__Composer__Group__1__Impl rule__Composer__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:334:2: rule__Composer__Group__1__Impl rule__Composer__Group__2
            {
            pushFollow(FOLLOW_rule__Composer__Group__1__Impl_in_rule__Composer__Group__1650);
            rule__Composer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group__2_in_rule__Composer__Group__1653);
            rule__Composer__Group__2();

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
    // $ANTLR end "rule__Composer__Group__1"


    // $ANTLR start "rule__Composer__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:341:1: rule__Composer__Group__1__Impl : ( ( rule__Composer__NameAssignment_1 ) ) ;
    public final void rule__Composer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:345:1: ( ( ( rule__Composer__NameAssignment_1 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( ( rule__Composer__NameAssignment_1 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:346:1: ( ( rule__Composer__NameAssignment_1 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:347:1: ( rule__Composer__NameAssignment_1 )
            {
             before(grammarAccess.getComposerAccess().getNameAssignment_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:348:1: ( rule__Composer__NameAssignment_1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:348:2: rule__Composer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Composer__NameAssignment_1_in_rule__Composer__Group__1__Impl680);
            rule__Composer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComposerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__1__Impl"


    // $ANTLR start "rule__Composer__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:358:1: rule__Composer__Group__2 : rule__Composer__Group__2__Impl rule__Composer__Group__3 ;
    public final void rule__Composer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:362:1: ( rule__Composer__Group__2__Impl rule__Composer__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:363:2: rule__Composer__Group__2__Impl rule__Composer__Group__3
            {
            pushFollow(FOLLOW_rule__Composer__Group__2__Impl_in_rule__Composer__Group__2710);
            rule__Composer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group__3_in_rule__Composer__Group__2713);
            rule__Composer__Group__3();

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
    // $ANTLR end "rule__Composer__Group__2"


    // $ANTLR start "rule__Composer__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:370:1: rule__Composer__Group__2__Impl : ( '{' ) ;
    public final void rule__Composer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:374:1: ( ( '{' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:375:1: ( '{' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:375:1: ( '{' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:376:1: '{'
            {
             before(grammarAccess.getComposerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Composer__Group__2__Impl741); 
             after(grammarAccess.getComposerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__2__Impl"


    // $ANTLR start "rule__Composer__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:389:1: rule__Composer__Group__3 : rule__Composer__Group__3__Impl rule__Composer__Group__4 ;
    public final void rule__Composer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:393:1: ( rule__Composer__Group__3__Impl rule__Composer__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:394:2: rule__Composer__Group__3__Impl rule__Composer__Group__4
            {
            pushFollow(FOLLOW_rule__Composer__Group__3__Impl_in_rule__Composer__Group__3772);
            rule__Composer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group__4_in_rule__Composer__Group__3775);
            rule__Composer__Group__4();

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
    // $ANTLR end "rule__Composer__Group__3"


    // $ANTLR start "rule__Composer__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:401:1: rule__Composer__Group__3__Impl : ( ( rule__Composer__PrimitivesAssignment_3 ) ) ;
    public final void rule__Composer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:405:1: ( ( ( rule__Composer__PrimitivesAssignment_3 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:406:1: ( ( rule__Composer__PrimitivesAssignment_3 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:406:1: ( ( rule__Composer__PrimitivesAssignment_3 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:407:1: ( rule__Composer__PrimitivesAssignment_3 )
            {
             before(grammarAccess.getComposerAccess().getPrimitivesAssignment_3()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:408:1: ( rule__Composer__PrimitivesAssignment_3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:408:2: rule__Composer__PrimitivesAssignment_3
            {
            pushFollow(FOLLOW_rule__Composer__PrimitivesAssignment_3_in_rule__Composer__Group__3__Impl802);
            rule__Composer__PrimitivesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComposerAccess().getPrimitivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__3__Impl"


    // $ANTLR start "rule__Composer__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:418:1: rule__Composer__Group__4 : rule__Composer__Group__4__Impl rule__Composer__Group__5 ;
    public final void rule__Composer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:422:1: ( rule__Composer__Group__4__Impl rule__Composer__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:423:2: rule__Composer__Group__4__Impl rule__Composer__Group__5
            {
            pushFollow(FOLLOW_rule__Composer__Group__4__Impl_in_rule__Composer__Group__4832);
            rule__Composer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group__5_in_rule__Composer__Group__4835);
            rule__Composer__Group__5();

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
    // $ANTLR end "rule__Composer__Group__4"


    // $ANTLR start "rule__Composer__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:430:1: rule__Composer__Group__4__Impl : ( ( rule__Composer__Group_4__0 )* ) ;
    public final void rule__Composer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:434:1: ( ( ( rule__Composer__Group_4__0 )* ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:435:1: ( ( rule__Composer__Group_4__0 )* )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:435:1: ( ( rule__Composer__Group_4__0 )* )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:436:1: ( rule__Composer__Group_4__0 )*
            {
             before(grammarAccess.getComposerAccess().getGroup_4()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:437:1: ( rule__Composer__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:437:2: rule__Composer__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Composer__Group_4__0_in_rule__Composer__Group__4__Impl862);
            	    rule__Composer__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getComposerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__4__Impl"


    // $ANTLR start "rule__Composer__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:447:1: rule__Composer__Group__5 : rule__Composer__Group__5__Impl ;
    public final void rule__Composer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:451:1: ( rule__Composer__Group__5__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:452:2: rule__Composer__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Composer__Group__5__Impl_in_rule__Composer__Group__5893);
            rule__Composer__Group__5__Impl();

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
    // $ANTLR end "rule__Composer__Group__5"


    // $ANTLR start "rule__Composer__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:458:1: rule__Composer__Group__5__Impl : ( '}' ) ;
    public final void rule__Composer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:462:1: ( ( '}' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:463:1: ( '}' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:463:1: ( '}' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:464:1: '}'
            {
             before(grammarAccess.getComposerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Composer__Group__5__Impl921); 
             after(grammarAccess.getComposerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group__5__Impl"


    // $ANTLR start "rule__Composer__Group_4__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:489:1: rule__Composer__Group_4__0 : rule__Composer__Group_4__0__Impl rule__Composer__Group_4__1 ;
    public final void rule__Composer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:493:1: ( rule__Composer__Group_4__0__Impl rule__Composer__Group_4__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:494:2: rule__Composer__Group_4__0__Impl rule__Composer__Group_4__1
            {
            pushFollow(FOLLOW_rule__Composer__Group_4__0__Impl_in_rule__Composer__Group_4__0964);
            rule__Composer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Composer__Group_4__1_in_rule__Composer__Group_4__0967);
            rule__Composer__Group_4__1();

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
    // $ANTLR end "rule__Composer__Group_4__0"


    // $ANTLR start "rule__Composer__Group_4__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:501:1: rule__Composer__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Composer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:505:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:506:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:506:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:507:1: ','
            {
             before(grammarAccess.getComposerAccess().getCommaKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__Composer__Group_4__0__Impl995); 
             after(grammarAccess.getComposerAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group_4__0__Impl"


    // $ANTLR start "rule__Composer__Group_4__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:520:1: rule__Composer__Group_4__1 : rule__Composer__Group_4__1__Impl ;
    public final void rule__Composer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:524:1: ( rule__Composer__Group_4__1__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:525:2: rule__Composer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Composer__Group_4__1__Impl_in_rule__Composer__Group_4__11026);
            rule__Composer__Group_4__1__Impl();

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
    // $ANTLR end "rule__Composer__Group_4__1"


    // $ANTLR start "rule__Composer__Group_4__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:531:1: rule__Composer__Group_4__1__Impl : ( ( rule__Composer__PrimitivesAssignment_4_1 ) ) ;
    public final void rule__Composer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:535:1: ( ( ( rule__Composer__PrimitivesAssignment_4_1 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:536:1: ( ( rule__Composer__PrimitivesAssignment_4_1 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:536:1: ( ( rule__Composer__PrimitivesAssignment_4_1 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:537:1: ( rule__Composer__PrimitivesAssignment_4_1 )
            {
             before(grammarAccess.getComposerAccess().getPrimitivesAssignment_4_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:538:1: ( rule__Composer__PrimitivesAssignment_4_1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:538:2: rule__Composer__PrimitivesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Composer__PrimitivesAssignment_4_1_in_rule__Composer__Group_4__1__Impl1053);
            rule__Composer__PrimitivesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComposerAccess().getPrimitivesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__Group_4__1__Impl"


    // $ANTLR start "rule__Creator__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:552:1: rule__Creator__Group__0 : rule__Creator__Group__0__Impl rule__Creator__Group__1 ;
    public final void rule__Creator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:556:1: ( rule__Creator__Group__0__Impl rule__Creator__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:557:2: rule__Creator__Group__0__Impl rule__Creator__Group__1
            {
            pushFollow(FOLLOW_rule__Creator__Group__0__Impl_in_rule__Creator__Group__01087);
            rule__Creator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__1_in_rule__Creator__Group__01090);
            rule__Creator__Group__1();

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
    // $ANTLR end "rule__Creator__Group__0"


    // $ANTLR start "rule__Creator__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:564:1: rule__Creator__Group__0__Impl : ( () ) ;
    public final void rule__Creator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:568:1: ( ( () ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:569:1: ( () )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:569:1: ( () )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:570:1: ()
            {
             before(grammarAccess.getCreatorAccess().getCreatorAction_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:571:1: ()
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:573:1: 
            {
            }

             after(grammarAccess.getCreatorAccess().getCreatorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__0__Impl"


    // $ANTLR start "rule__Creator__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:583:1: rule__Creator__Group__1 : rule__Creator__Group__1__Impl rule__Creator__Group__2 ;
    public final void rule__Creator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:587:1: ( rule__Creator__Group__1__Impl rule__Creator__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:588:2: rule__Creator__Group__1__Impl rule__Creator__Group__2
            {
            pushFollow(FOLLOW_rule__Creator__Group__1__Impl_in_rule__Creator__Group__11148);
            rule__Creator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__2_in_rule__Creator__Group__11151);
            rule__Creator__Group__2();

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
    // $ANTLR end "rule__Creator__Group__1"


    // $ANTLR start "rule__Creator__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:595:1: rule__Creator__Group__1__Impl : ( 'Creator' ) ;
    public final void rule__Creator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:599:1: ( ( 'Creator' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:600:1: ( 'Creator' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:600:1: ( 'Creator' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:601:1: 'Creator'
            {
             before(grammarAccess.getCreatorAccess().getCreatorKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Creator__Group__1__Impl1179); 
             after(grammarAccess.getCreatorAccess().getCreatorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__1__Impl"


    // $ANTLR start "rule__Creator__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:614:1: rule__Creator__Group__2 : rule__Creator__Group__2__Impl rule__Creator__Group__3 ;
    public final void rule__Creator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:618:1: ( rule__Creator__Group__2__Impl rule__Creator__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:619:2: rule__Creator__Group__2__Impl rule__Creator__Group__3
            {
            pushFollow(FOLLOW_rule__Creator__Group__2__Impl_in_rule__Creator__Group__21210);
            rule__Creator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__3_in_rule__Creator__Group__21213);
            rule__Creator__Group__3();

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
    // $ANTLR end "rule__Creator__Group__2"


    // $ANTLR start "rule__Creator__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:626:1: rule__Creator__Group__2__Impl : ( '(' ) ;
    public final void rule__Creator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:630:1: ( ( '(' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:631:1: ( '(' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:631:1: ( '(' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:632:1: '('
            {
             before(grammarAccess.getCreatorAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Creator__Group__2__Impl1241); 
             after(grammarAccess.getCreatorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__2__Impl"


    // $ANTLR start "rule__Creator__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:645:1: rule__Creator__Group__3 : rule__Creator__Group__3__Impl rule__Creator__Group__4 ;
    public final void rule__Creator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:649:1: ( rule__Creator__Group__3__Impl rule__Creator__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:650:2: rule__Creator__Group__3__Impl rule__Creator__Group__4
            {
            pushFollow(FOLLOW_rule__Creator__Group__3__Impl_in_rule__Creator__Group__31272);
            rule__Creator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__4_in_rule__Creator__Group__31275);
            rule__Creator__Group__4();

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
    // $ANTLR end "rule__Creator__Group__3"


    // $ANTLR start "rule__Creator__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:657:1: rule__Creator__Group__3__Impl : ( ( rule__Creator__TypeAssignment_3 ) ) ;
    public final void rule__Creator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:661:1: ( ( ( rule__Creator__TypeAssignment_3 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:662:1: ( ( rule__Creator__TypeAssignment_3 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:662:1: ( ( rule__Creator__TypeAssignment_3 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:663:1: ( rule__Creator__TypeAssignment_3 )
            {
             before(grammarAccess.getCreatorAccess().getTypeAssignment_3()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:664:1: ( rule__Creator__TypeAssignment_3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:664:2: rule__Creator__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Creator__TypeAssignment_3_in_rule__Creator__Group__3__Impl1302);
            rule__Creator__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__3__Impl"


    // $ANTLR start "rule__Creator__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:674:1: rule__Creator__Group__4 : rule__Creator__Group__4__Impl rule__Creator__Group__5 ;
    public final void rule__Creator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:678:1: ( rule__Creator__Group__4__Impl rule__Creator__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:679:2: rule__Creator__Group__4__Impl rule__Creator__Group__5
            {
            pushFollow(FOLLOW_rule__Creator__Group__4__Impl_in_rule__Creator__Group__41332);
            rule__Creator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__5_in_rule__Creator__Group__41335);
            rule__Creator__Group__5();

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
    // $ANTLR end "rule__Creator__Group__4"


    // $ANTLR start "rule__Creator__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:686:1: rule__Creator__Group__4__Impl : ( ',' ) ;
    public final void rule__Creator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:690:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:691:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:691:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:692:1: ','
            {
             before(grammarAccess.getCreatorAccess().getCommaKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Creator__Group__4__Impl1363); 
             after(grammarAccess.getCreatorAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__4__Impl"


    // $ANTLR start "rule__Creator__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:705:1: rule__Creator__Group__5 : rule__Creator__Group__5__Impl rule__Creator__Group__6 ;
    public final void rule__Creator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:709:1: ( rule__Creator__Group__5__Impl rule__Creator__Group__6 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:710:2: rule__Creator__Group__5__Impl rule__Creator__Group__6
            {
            pushFollow(FOLLOW_rule__Creator__Group__5__Impl_in_rule__Creator__Group__51394);
            rule__Creator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__6_in_rule__Creator__Group__51397);
            rule__Creator__Group__6();

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
    // $ANTLR end "rule__Creator__Group__5"


    // $ANTLR start "rule__Creator__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:717:1: rule__Creator__Group__5__Impl : ( '{' ) ;
    public final void rule__Creator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:721:1: ( ( '{' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:722:1: ( '{' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:722:1: ( '{' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:723:1: '{'
            {
             before(grammarAccess.getCreatorAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Creator__Group__5__Impl1425); 
             after(grammarAccess.getCreatorAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__5__Impl"


    // $ANTLR start "rule__Creator__Group__6"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:736:1: rule__Creator__Group__6 : rule__Creator__Group__6__Impl rule__Creator__Group__7 ;
    public final void rule__Creator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:740:1: ( rule__Creator__Group__6__Impl rule__Creator__Group__7 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:741:2: rule__Creator__Group__6__Impl rule__Creator__Group__7
            {
            pushFollow(FOLLOW_rule__Creator__Group__6__Impl_in_rule__Creator__Group__61456);
            rule__Creator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__7_in_rule__Creator__Group__61459);
            rule__Creator__Group__7();

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
    // $ANTLR end "rule__Creator__Group__6"


    // $ANTLR start "rule__Creator__Group__6__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:748:1: rule__Creator__Group__6__Impl : ( ( rule__Creator__Group_6__0 )* ) ;
    public final void rule__Creator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:752:1: ( ( ( rule__Creator__Group_6__0 )* ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:753:1: ( ( rule__Creator__Group_6__0 )* )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:753:1: ( ( rule__Creator__Group_6__0 )* )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:754:1: ( rule__Creator__Group_6__0 )*
            {
             before(grammarAccess.getCreatorAccess().getGroup_6()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:755:1: ( rule__Creator__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:755:2: rule__Creator__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Creator__Group_6__0_in_rule__Creator__Group__6__Impl1486);
            	    rule__Creator__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCreatorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__6__Impl"


    // $ANTLR start "rule__Creator__Group__7"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:765:1: rule__Creator__Group__7 : rule__Creator__Group__7__Impl rule__Creator__Group__8 ;
    public final void rule__Creator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:769:1: ( rule__Creator__Group__7__Impl rule__Creator__Group__8 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:770:2: rule__Creator__Group__7__Impl rule__Creator__Group__8
            {
            pushFollow(FOLLOW_rule__Creator__Group__7__Impl_in_rule__Creator__Group__71517);
            rule__Creator__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__8_in_rule__Creator__Group__71520);
            rule__Creator__Group__8();

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
    // $ANTLR end "rule__Creator__Group__7"


    // $ANTLR start "rule__Creator__Group__7__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:777:1: rule__Creator__Group__7__Impl : ( '}' ) ;
    public final void rule__Creator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:781:1: ( ( '}' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:782:1: ( '}' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:782:1: ( '}' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:783:1: '}'
            {
             before(grammarAccess.getCreatorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Creator__Group__7__Impl1548); 
             after(grammarAccess.getCreatorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__7__Impl"


    // $ANTLR start "rule__Creator__Group__8"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:796:1: rule__Creator__Group__8 : rule__Creator__Group__8__Impl rule__Creator__Group__9 ;
    public final void rule__Creator__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:800:1: ( rule__Creator__Group__8__Impl rule__Creator__Group__9 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:801:2: rule__Creator__Group__8__Impl rule__Creator__Group__9
            {
            pushFollow(FOLLOW_rule__Creator__Group__8__Impl_in_rule__Creator__Group__81579);
            rule__Creator__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__9_in_rule__Creator__Group__81582);
            rule__Creator__Group__9();

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
    // $ANTLR end "rule__Creator__Group__8"


    // $ANTLR start "rule__Creator__Group__8__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:808:1: rule__Creator__Group__8__Impl : ( ',' ) ;
    public final void rule__Creator__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:812:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:813:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:813:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:814:1: ','
            {
             before(grammarAccess.getCreatorAccess().getCommaKeyword_8()); 
            match(input,14,FOLLOW_14_in_rule__Creator__Group__8__Impl1610); 
             after(grammarAccess.getCreatorAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__8__Impl"


    // $ANTLR start "rule__Creator__Group__9"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:827:1: rule__Creator__Group__9 : rule__Creator__Group__9__Impl rule__Creator__Group__10 ;
    public final void rule__Creator__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:831:1: ( rule__Creator__Group__9__Impl rule__Creator__Group__10 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:832:2: rule__Creator__Group__9__Impl rule__Creator__Group__10
            {
            pushFollow(FOLLOW_rule__Creator__Group__9__Impl_in_rule__Creator__Group__91641);
            rule__Creator__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group__10_in_rule__Creator__Group__91644);
            rule__Creator__Group__10();

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
    // $ANTLR end "rule__Creator__Group__9"


    // $ANTLR start "rule__Creator__Group__9__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:839:1: rule__Creator__Group__9__Impl : ( ( rule__Creator__CreatorNameAssignment_9 ) ) ;
    public final void rule__Creator__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:843:1: ( ( ( rule__Creator__CreatorNameAssignment_9 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:844:1: ( ( rule__Creator__CreatorNameAssignment_9 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:844:1: ( ( rule__Creator__CreatorNameAssignment_9 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:845:1: ( rule__Creator__CreatorNameAssignment_9 )
            {
             before(grammarAccess.getCreatorAccess().getCreatorNameAssignment_9()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:846:1: ( rule__Creator__CreatorNameAssignment_9 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:846:2: rule__Creator__CreatorNameAssignment_9
            {
            pushFollow(FOLLOW_rule__Creator__CreatorNameAssignment_9_in_rule__Creator__Group__9__Impl1671);
            rule__Creator__CreatorNameAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getCreatorNameAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__9__Impl"


    // $ANTLR start "rule__Creator__Group__10"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:856:1: rule__Creator__Group__10 : rule__Creator__Group__10__Impl ;
    public final void rule__Creator__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:860:1: ( rule__Creator__Group__10__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:861:2: rule__Creator__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Creator__Group__10__Impl_in_rule__Creator__Group__101701);
            rule__Creator__Group__10__Impl();

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
    // $ANTLR end "rule__Creator__Group__10"


    // $ANTLR start "rule__Creator__Group__10__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:867:1: rule__Creator__Group__10__Impl : ( ')' ) ;
    public final void rule__Creator__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:871:1: ( ( ')' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:872:1: ( ')' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:872:1: ( ')' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:873:1: ')'
            {
             before(grammarAccess.getCreatorAccess().getRightParenthesisKeyword_10()); 
            match(input,17,FOLLOW_17_in_rule__Creator__Group__10__Impl1729); 
             after(grammarAccess.getCreatorAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group__10__Impl"


    // $ANTLR start "rule__Creator__Group_6__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:908:1: rule__Creator__Group_6__0 : rule__Creator__Group_6__0__Impl rule__Creator__Group_6__1 ;
    public final void rule__Creator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:912:1: ( rule__Creator__Group_6__0__Impl rule__Creator__Group_6__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:913:2: rule__Creator__Group_6__0__Impl rule__Creator__Group_6__1
            {
            pushFollow(FOLLOW_rule__Creator__Group_6__0__Impl_in_rule__Creator__Group_6__01782);
            rule__Creator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group_6__1_in_rule__Creator__Group_6__01785);
            rule__Creator__Group_6__1();

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
    // $ANTLR end "rule__Creator__Group_6__0"


    // $ANTLR start "rule__Creator__Group_6__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:920:1: rule__Creator__Group_6__0__Impl : ( ( rule__Creator__FeaturesAssignment_6_0 ) ) ;
    public final void rule__Creator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:924:1: ( ( ( rule__Creator__FeaturesAssignment_6_0 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:925:1: ( ( rule__Creator__FeaturesAssignment_6_0 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:925:1: ( ( rule__Creator__FeaturesAssignment_6_0 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:926:1: ( rule__Creator__FeaturesAssignment_6_0 )
            {
             before(grammarAccess.getCreatorAccess().getFeaturesAssignment_6_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:927:1: ( rule__Creator__FeaturesAssignment_6_0 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:927:2: rule__Creator__FeaturesAssignment_6_0
            {
            pushFollow(FOLLOW_rule__Creator__FeaturesAssignment_6_0_in_rule__Creator__Group_6__0__Impl1812);
            rule__Creator__FeaturesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getFeaturesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group_6__0__Impl"


    // $ANTLR start "rule__Creator__Group_6__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:937:1: rule__Creator__Group_6__1 : rule__Creator__Group_6__1__Impl ;
    public final void rule__Creator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:941:1: ( rule__Creator__Group_6__1__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:942:2: rule__Creator__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Creator__Group_6__1__Impl_in_rule__Creator__Group_6__11842);
            rule__Creator__Group_6__1__Impl();

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
    // $ANTLR end "rule__Creator__Group_6__1"


    // $ANTLR start "rule__Creator__Group_6__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:948:1: rule__Creator__Group_6__1__Impl : ( ( rule__Creator__Group_6_1__0 )* ) ;
    public final void rule__Creator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:952:1: ( ( ( rule__Creator__Group_6_1__0 )* ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:953:1: ( ( rule__Creator__Group_6_1__0 )* )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:953:1: ( ( rule__Creator__Group_6_1__0 )* )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:954:1: ( rule__Creator__Group_6_1__0 )*
            {
             before(grammarAccess.getCreatorAccess().getGroup_6_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:955:1: ( rule__Creator__Group_6_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:955:2: rule__Creator__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Creator__Group_6_1__0_in_rule__Creator__Group_6__1__Impl1869);
            	    rule__Creator__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCreatorAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group_6__1__Impl"


    // $ANTLR start "rule__Creator__Group_6_1__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:969:1: rule__Creator__Group_6_1__0 : rule__Creator__Group_6_1__0__Impl rule__Creator__Group_6_1__1 ;
    public final void rule__Creator__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:973:1: ( rule__Creator__Group_6_1__0__Impl rule__Creator__Group_6_1__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:974:2: rule__Creator__Group_6_1__0__Impl rule__Creator__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__Creator__Group_6_1__0__Impl_in_rule__Creator__Group_6_1__01904);
            rule__Creator__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Creator__Group_6_1__1_in_rule__Creator__Group_6_1__01907);
            rule__Creator__Group_6_1__1();

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
    // $ANTLR end "rule__Creator__Group_6_1__0"


    // $ANTLR start "rule__Creator__Group_6_1__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:981:1: rule__Creator__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Creator__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:985:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:986:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:986:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:987:1: ','
            {
             before(grammarAccess.getCreatorAccess().getCommaKeyword_6_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Creator__Group_6_1__0__Impl1935); 
             after(grammarAccess.getCreatorAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group_6_1__0__Impl"


    // $ANTLR start "rule__Creator__Group_6_1__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1000:1: rule__Creator__Group_6_1__1 : rule__Creator__Group_6_1__1__Impl ;
    public final void rule__Creator__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1004:1: ( rule__Creator__Group_6_1__1__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1005:2: rule__Creator__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Creator__Group_6_1__1__Impl_in_rule__Creator__Group_6_1__11966);
            rule__Creator__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__Creator__Group_6_1__1"


    // $ANTLR start "rule__Creator__Group_6_1__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1011:1: rule__Creator__Group_6_1__1__Impl : ( ( rule__Creator__FeaturesAssignment_6_1_1 ) ) ;
    public final void rule__Creator__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1015:1: ( ( ( rule__Creator__FeaturesAssignment_6_1_1 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1016:1: ( ( rule__Creator__FeaturesAssignment_6_1_1 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1016:1: ( ( rule__Creator__FeaturesAssignment_6_1_1 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1017:1: ( rule__Creator__FeaturesAssignment_6_1_1 )
            {
             before(grammarAccess.getCreatorAccess().getFeaturesAssignment_6_1_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1018:1: ( rule__Creator__FeaturesAssignment_6_1_1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1018:2: rule__Creator__FeaturesAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__Creator__FeaturesAssignment_6_1_1_in_rule__Creator__Group_6_1__1__Impl1993);
            rule__Creator__FeaturesAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getFeaturesAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Group_6_1__1__Impl"


    // $ANTLR start "rule__Updater__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1032:1: rule__Updater__Group__0 : rule__Updater__Group__0__Impl rule__Updater__Group__1 ;
    public final void rule__Updater__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1036:1: ( rule__Updater__Group__0__Impl rule__Updater__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1037:2: rule__Updater__Group__0__Impl rule__Updater__Group__1
            {
            pushFollow(FOLLOW_rule__Updater__Group__0__Impl_in_rule__Updater__Group__02027);
            rule__Updater__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__1_in_rule__Updater__Group__02030);
            rule__Updater__Group__1();

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
    // $ANTLR end "rule__Updater__Group__0"


    // $ANTLR start "rule__Updater__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1044:1: rule__Updater__Group__0__Impl : ( () ) ;
    public final void rule__Updater__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1048:1: ( ( () ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1049:1: ( () )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1049:1: ( () )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1050:1: ()
            {
             before(grammarAccess.getUpdaterAccess().getUpdaterAction_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1051:1: ()
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1053:1: 
            {
            }

             after(grammarAccess.getUpdaterAccess().getUpdaterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__0__Impl"


    // $ANTLR start "rule__Updater__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1063:1: rule__Updater__Group__1 : rule__Updater__Group__1__Impl rule__Updater__Group__2 ;
    public final void rule__Updater__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1067:1: ( rule__Updater__Group__1__Impl rule__Updater__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1068:2: rule__Updater__Group__1__Impl rule__Updater__Group__2
            {
            pushFollow(FOLLOW_rule__Updater__Group__1__Impl_in_rule__Updater__Group__12088);
            rule__Updater__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__2_in_rule__Updater__Group__12091);
            rule__Updater__Group__2();

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
    // $ANTLR end "rule__Updater__Group__1"


    // $ANTLR start "rule__Updater__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1075:1: rule__Updater__Group__1__Impl : ( 'Updater' ) ;
    public final void rule__Updater__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1079:1: ( ( 'Updater' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1080:1: ( 'Updater' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1080:1: ( 'Updater' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1081:1: 'Updater'
            {
             before(grammarAccess.getUpdaterAccess().getUpdaterKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__Updater__Group__1__Impl2119); 
             after(grammarAccess.getUpdaterAccess().getUpdaterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__1__Impl"


    // $ANTLR start "rule__Updater__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1094:1: rule__Updater__Group__2 : rule__Updater__Group__2__Impl rule__Updater__Group__3 ;
    public final void rule__Updater__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1098:1: ( rule__Updater__Group__2__Impl rule__Updater__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1099:2: rule__Updater__Group__2__Impl rule__Updater__Group__3
            {
            pushFollow(FOLLOW_rule__Updater__Group__2__Impl_in_rule__Updater__Group__22150);
            rule__Updater__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__3_in_rule__Updater__Group__22153);
            rule__Updater__Group__3();

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
    // $ANTLR end "rule__Updater__Group__2"


    // $ANTLR start "rule__Updater__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1106:1: rule__Updater__Group__2__Impl : ( '(' ) ;
    public final void rule__Updater__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1110:1: ( ( '(' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1111:1: ( '(' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1111:1: ( '(' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1112:1: '('
            {
             before(grammarAccess.getUpdaterAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Updater__Group__2__Impl2181); 
             after(grammarAccess.getUpdaterAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__2__Impl"


    // $ANTLR start "rule__Updater__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1125:1: rule__Updater__Group__3 : rule__Updater__Group__3__Impl rule__Updater__Group__4 ;
    public final void rule__Updater__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1129:1: ( rule__Updater__Group__3__Impl rule__Updater__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1130:2: rule__Updater__Group__3__Impl rule__Updater__Group__4
            {
            pushFollow(FOLLOW_rule__Updater__Group__3__Impl_in_rule__Updater__Group__32212);
            rule__Updater__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__4_in_rule__Updater__Group__32215);
            rule__Updater__Group__4();

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
    // $ANTLR end "rule__Updater__Group__3"


    // $ANTLR start "rule__Updater__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1137:1: rule__Updater__Group__3__Impl : ( ( rule__Updater__TypeAssignment_3 ) ) ;
    public final void rule__Updater__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1141:1: ( ( ( rule__Updater__TypeAssignment_3 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1142:1: ( ( rule__Updater__TypeAssignment_3 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1142:1: ( ( rule__Updater__TypeAssignment_3 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1143:1: ( rule__Updater__TypeAssignment_3 )
            {
             before(grammarAccess.getUpdaterAccess().getTypeAssignment_3()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1144:1: ( rule__Updater__TypeAssignment_3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1144:2: rule__Updater__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Updater__TypeAssignment_3_in_rule__Updater__Group__3__Impl2242);
            rule__Updater__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdaterAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__3__Impl"


    // $ANTLR start "rule__Updater__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1154:1: rule__Updater__Group__4 : rule__Updater__Group__4__Impl rule__Updater__Group__5 ;
    public final void rule__Updater__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1158:1: ( rule__Updater__Group__4__Impl rule__Updater__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1159:2: rule__Updater__Group__4__Impl rule__Updater__Group__5
            {
            pushFollow(FOLLOW_rule__Updater__Group__4__Impl_in_rule__Updater__Group__42272);
            rule__Updater__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__5_in_rule__Updater__Group__42275);
            rule__Updater__Group__5();

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
    // $ANTLR end "rule__Updater__Group__4"


    // $ANTLR start "rule__Updater__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1166:1: rule__Updater__Group__4__Impl : ( ',' ) ;
    public final void rule__Updater__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1170:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1171:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1171:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1172:1: ','
            {
             before(grammarAccess.getUpdaterAccess().getCommaKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Updater__Group__4__Impl2303); 
             after(grammarAccess.getUpdaterAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__4__Impl"


    // $ANTLR start "rule__Updater__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1185:1: rule__Updater__Group__5 : rule__Updater__Group__5__Impl rule__Updater__Group__6 ;
    public final void rule__Updater__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1189:1: ( rule__Updater__Group__5__Impl rule__Updater__Group__6 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1190:2: rule__Updater__Group__5__Impl rule__Updater__Group__6
            {
            pushFollow(FOLLOW_rule__Updater__Group__5__Impl_in_rule__Updater__Group__52334);
            rule__Updater__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group__6_in_rule__Updater__Group__52337);
            rule__Updater__Group__6();

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
    // $ANTLR end "rule__Updater__Group__5"


    // $ANTLR start "rule__Updater__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1197:1: rule__Updater__Group__5__Impl : ( ( rule__Updater__Group_5__0 )? ) ;
    public final void rule__Updater__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1201:1: ( ( ( rule__Updater__Group_5__0 )? ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1202:1: ( ( rule__Updater__Group_5__0 )? )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1202:1: ( ( rule__Updater__Group_5__0 )? )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1203:1: ( rule__Updater__Group_5__0 )?
            {
             before(grammarAccess.getUpdaterAccess().getGroup_5()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1204:1: ( rule__Updater__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1204:2: rule__Updater__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Updater__Group_5__0_in_rule__Updater__Group__5__Impl2364);
                    rule__Updater__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdaterAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__5__Impl"


    // $ANTLR start "rule__Updater__Group__6"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1214:1: rule__Updater__Group__6 : rule__Updater__Group__6__Impl ;
    public final void rule__Updater__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1218:1: ( rule__Updater__Group__6__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1219:2: rule__Updater__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Updater__Group__6__Impl_in_rule__Updater__Group__62395);
            rule__Updater__Group__6__Impl();

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
    // $ANTLR end "rule__Updater__Group__6"


    // $ANTLR start "rule__Updater__Group__6__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1225:1: rule__Updater__Group__6__Impl : ( ')' ) ;
    public final void rule__Updater__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1229:1: ( ( ')' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1230:1: ( ')' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1230:1: ( ')' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1231:1: ')'
            {
             before(grammarAccess.getUpdaterAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Updater__Group__6__Impl2423); 
             after(grammarAccess.getUpdaterAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group__6__Impl"


    // $ANTLR start "rule__Updater__Group_5__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1258:1: rule__Updater__Group_5__0 : rule__Updater__Group_5__0__Impl rule__Updater__Group_5__1 ;
    public final void rule__Updater__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1262:1: ( rule__Updater__Group_5__0__Impl rule__Updater__Group_5__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1263:2: rule__Updater__Group_5__0__Impl rule__Updater__Group_5__1
            {
            pushFollow(FOLLOW_rule__Updater__Group_5__0__Impl_in_rule__Updater__Group_5__02468);
            rule__Updater__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group_5__1_in_rule__Updater__Group_5__02471);
            rule__Updater__Group_5__1();

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
    // $ANTLR end "rule__Updater__Group_5__0"


    // $ANTLR start "rule__Updater__Group_5__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1270:1: rule__Updater__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Updater__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1274:1: ( ( '{' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1275:1: ( '{' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1275:1: ( '{' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1276:1: '{'
            {
             before(grammarAccess.getUpdaterAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,12,FOLLOW_12_in_rule__Updater__Group_5__0__Impl2499); 
             after(grammarAccess.getUpdaterAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5__0__Impl"


    // $ANTLR start "rule__Updater__Group_5__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1289:1: rule__Updater__Group_5__1 : rule__Updater__Group_5__1__Impl rule__Updater__Group_5__2 ;
    public final void rule__Updater__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1293:1: ( rule__Updater__Group_5__1__Impl rule__Updater__Group_5__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1294:2: rule__Updater__Group_5__1__Impl rule__Updater__Group_5__2
            {
            pushFollow(FOLLOW_rule__Updater__Group_5__1__Impl_in_rule__Updater__Group_5__12530);
            rule__Updater__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group_5__2_in_rule__Updater__Group_5__12533);
            rule__Updater__Group_5__2();

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
    // $ANTLR end "rule__Updater__Group_5__1"


    // $ANTLR start "rule__Updater__Group_5__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1301:1: rule__Updater__Group_5__1__Impl : ( ( rule__Updater__FeaturesAssignment_5_1 ) ) ;
    public final void rule__Updater__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1305:1: ( ( ( rule__Updater__FeaturesAssignment_5_1 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1306:1: ( ( rule__Updater__FeaturesAssignment_5_1 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1306:1: ( ( rule__Updater__FeaturesAssignment_5_1 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1307:1: ( rule__Updater__FeaturesAssignment_5_1 )
            {
             before(grammarAccess.getUpdaterAccess().getFeaturesAssignment_5_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1308:1: ( rule__Updater__FeaturesAssignment_5_1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1308:2: rule__Updater__FeaturesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Updater__FeaturesAssignment_5_1_in_rule__Updater__Group_5__1__Impl2560);
            rule__Updater__FeaturesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdaterAccess().getFeaturesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5__1__Impl"


    // $ANTLR start "rule__Updater__Group_5__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1318:1: rule__Updater__Group_5__2 : rule__Updater__Group_5__2__Impl rule__Updater__Group_5__3 ;
    public final void rule__Updater__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1322:1: ( rule__Updater__Group_5__2__Impl rule__Updater__Group_5__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1323:2: rule__Updater__Group_5__2__Impl rule__Updater__Group_5__3
            {
            pushFollow(FOLLOW_rule__Updater__Group_5__2__Impl_in_rule__Updater__Group_5__22590);
            rule__Updater__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group_5__3_in_rule__Updater__Group_5__22593);
            rule__Updater__Group_5__3();

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
    // $ANTLR end "rule__Updater__Group_5__2"


    // $ANTLR start "rule__Updater__Group_5__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1330:1: rule__Updater__Group_5__2__Impl : ( ( rule__Updater__Group_5_2__0 )* ) ;
    public final void rule__Updater__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1334:1: ( ( ( rule__Updater__Group_5_2__0 )* ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1335:1: ( ( rule__Updater__Group_5_2__0 )* )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1335:1: ( ( rule__Updater__Group_5_2__0 )* )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1336:1: ( rule__Updater__Group_5_2__0 )*
            {
             before(grammarAccess.getUpdaterAccess().getGroup_5_2()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1337:1: ( rule__Updater__Group_5_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1337:2: rule__Updater__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Updater__Group_5_2__0_in_rule__Updater__Group_5__2__Impl2620);
            	    rule__Updater__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUpdaterAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5__2__Impl"


    // $ANTLR start "rule__Updater__Group_5__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1347:1: rule__Updater__Group_5__3 : rule__Updater__Group_5__3__Impl ;
    public final void rule__Updater__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1351:1: ( rule__Updater__Group_5__3__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1352:2: rule__Updater__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Updater__Group_5__3__Impl_in_rule__Updater__Group_5__32651);
            rule__Updater__Group_5__3__Impl();

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
    // $ANTLR end "rule__Updater__Group_5__3"


    // $ANTLR start "rule__Updater__Group_5__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1358:1: rule__Updater__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Updater__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1362:1: ( ( '}' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1363:1: ( '}' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1363:1: ( '}' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1364:1: '}'
            {
             before(grammarAccess.getUpdaterAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,13,FOLLOW_13_in_rule__Updater__Group_5__3__Impl2679); 
             after(grammarAccess.getUpdaterAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5__3__Impl"


    // $ANTLR start "rule__Updater__Group_5_2__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1385:1: rule__Updater__Group_5_2__0 : rule__Updater__Group_5_2__0__Impl rule__Updater__Group_5_2__1 ;
    public final void rule__Updater__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1389:1: ( rule__Updater__Group_5_2__0__Impl rule__Updater__Group_5_2__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1390:2: rule__Updater__Group_5_2__0__Impl rule__Updater__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__Updater__Group_5_2__0__Impl_in_rule__Updater__Group_5_2__02718);
            rule__Updater__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Updater__Group_5_2__1_in_rule__Updater__Group_5_2__02721);
            rule__Updater__Group_5_2__1();

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
    // $ANTLR end "rule__Updater__Group_5_2__0"


    // $ANTLR start "rule__Updater__Group_5_2__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1397:1: rule__Updater__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Updater__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1401:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1402:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1402:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1403:1: ','
            {
             before(grammarAccess.getUpdaterAccess().getCommaKeyword_5_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Updater__Group_5_2__0__Impl2749); 
             after(grammarAccess.getUpdaterAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5_2__0__Impl"


    // $ANTLR start "rule__Updater__Group_5_2__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1416:1: rule__Updater__Group_5_2__1 : rule__Updater__Group_5_2__1__Impl ;
    public final void rule__Updater__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1420:1: ( rule__Updater__Group_5_2__1__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1421:2: rule__Updater__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Updater__Group_5_2__1__Impl_in_rule__Updater__Group_5_2__12780);
            rule__Updater__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Updater__Group_5_2__1"


    // $ANTLR start "rule__Updater__Group_5_2__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1427:1: rule__Updater__Group_5_2__1__Impl : ( ( rule__Updater__FeaturesAssignment_5_2_1 ) ) ;
    public final void rule__Updater__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1431:1: ( ( ( rule__Updater__FeaturesAssignment_5_2_1 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1432:1: ( ( rule__Updater__FeaturesAssignment_5_2_1 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1432:1: ( ( rule__Updater__FeaturesAssignment_5_2_1 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1433:1: ( rule__Updater__FeaturesAssignment_5_2_1 )
            {
             before(grammarAccess.getUpdaterAccess().getFeaturesAssignment_5_2_1()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1434:1: ( rule__Updater__FeaturesAssignment_5_2_1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1434:2: rule__Updater__FeaturesAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__Updater__FeaturesAssignment_5_2_1_in_rule__Updater__Group_5_2__1__Impl2807);
            rule__Updater__FeaturesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdaterAccess().getFeaturesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__Group_5_2__1__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1448:1: rule__FeatureAssigner__Group__0 : rule__FeatureAssigner__Group__0__Impl rule__FeatureAssigner__Group__1 ;
    public final void rule__FeatureAssigner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1452:1: ( rule__FeatureAssigner__Group__0__Impl rule__FeatureAssigner__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1453:2: rule__FeatureAssigner__Group__0__Impl rule__FeatureAssigner__Group__1
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__0__Impl_in_rule__FeatureAssigner__Group__02841);
            rule__FeatureAssigner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureAssigner__Group__1_in_rule__FeatureAssigner__Group__02844);
            rule__FeatureAssigner__Group__1();

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
    // $ANTLR end "rule__FeatureAssigner__Group__0"


    // $ANTLR start "rule__FeatureAssigner__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1460:1: rule__FeatureAssigner__Group__0__Impl : ( () ) ;
    public final void rule__FeatureAssigner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1464:1: ( ( () ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1465:1: ( () )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1465:1: ( () )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1466:1: ()
            {
             before(grammarAccess.getFeatureAssignerAccess().getFeatureAssignerAction_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1467:1: ()
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1469:1: 
            {
            }

             after(grammarAccess.getFeatureAssignerAccess().getFeatureAssignerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__0__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1479:1: rule__FeatureAssigner__Group__1 : rule__FeatureAssigner__Group__1__Impl rule__FeatureAssigner__Group__2 ;
    public final void rule__FeatureAssigner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1483:1: ( rule__FeatureAssigner__Group__1__Impl rule__FeatureAssigner__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1484:2: rule__FeatureAssigner__Group__1__Impl rule__FeatureAssigner__Group__2
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__1__Impl_in_rule__FeatureAssigner__Group__12902);
            rule__FeatureAssigner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureAssigner__Group__2_in_rule__FeatureAssigner__Group__12905);
            rule__FeatureAssigner__Group__2();

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
    // $ANTLR end "rule__FeatureAssigner__Group__1"


    // $ANTLR start "rule__FeatureAssigner__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1491:1: rule__FeatureAssigner__Group__1__Impl : ( '[' ) ;
    public final void rule__FeatureAssigner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1495:1: ( ( '[' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1496:1: ( '[' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1496:1: ( '[' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1497:1: '['
            {
             before(grammarAccess.getFeatureAssignerAccess().getLeftSquareBracketKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__FeatureAssigner__Group__1__Impl2933); 
             after(grammarAccess.getFeatureAssignerAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__1__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1510:1: rule__FeatureAssigner__Group__2 : rule__FeatureAssigner__Group__2__Impl rule__FeatureAssigner__Group__3 ;
    public final void rule__FeatureAssigner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1514:1: ( rule__FeatureAssigner__Group__2__Impl rule__FeatureAssigner__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1515:2: rule__FeatureAssigner__Group__2__Impl rule__FeatureAssigner__Group__3
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__2__Impl_in_rule__FeatureAssigner__Group__22964);
            rule__FeatureAssigner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureAssigner__Group__3_in_rule__FeatureAssigner__Group__22967);
            rule__FeatureAssigner__Group__3();

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
    // $ANTLR end "rule__FeatureAssigner__Group__2"


    // $ANTLR start "rule__FeatureAssigner__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1522:1: rule__FeatureAssigner__Group__2__Impl : ( ( rule__FeatureAssigner__FeatureAssignment_2 ) ) ;
    public final void rule__FeatureAssigner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1526:1: ( ( ( rule__FeatureAssigner__FeatureAssignment_2 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1527:1: ( ( rule__FeatureAssigner__FeatureAssignment_2 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1527:1: ( ( rule__FeatureAssigner__FeatureAssignment_2 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1528:1: ( rule__FeatureAssigner__FeatureAssignment_2 )
            {
             before(grammarAccess.getFeatureAssignerAccess().getFeatureAssignment_2()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1529:1: ( rule__FeatureAssigner__FeatureAssignment_2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1529:2: rule__FeatureAssigner__FeatureAssignment_2
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__FeatureAssignment_2_in_rule__FeatureAssigner__Group__2__Impl2994);
            rule__FeatureAssigner__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAssignerAccess().getFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__2__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1539:1: rule__FeatureAssigner__Group__3 : rule__FeatureAssigner__Group__3__Impl rule__FeatureAssigner__Group__4 ;
    public final void rule__FeatureAssigner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1543:1: ( rule__FeatureAssigner__Group__3__Impl rule__FeatureAssigner__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1544:2: rule__FeatureAssigner__Group__3__Impl rule__FeatureAssigner__Group__4
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__3__Impl_in_rule__FeatureAssigner__Group__33024);
            rule__FeatureAssigner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureAssigner__Group__4_in_rule__FeatureAssigner__Group__33027);
            rule__FeatureAssigner__Group__4();

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
    // $ANTLR end "rule__FeatureAssigner__Group__3"


    // $ANTLR start "rule__FeatureAssigner__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1551:1: rule__FeatureAssigner__Group__3__Impl : ( ',' ) ;
    public final void rule__FeatureAssigner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1555:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1556:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1556:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1557:1: ','
            {
             before(grammarAccess.getFeatureAssignerAccess().getCommaKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__FeatureAssigner__Group__3__Impl3055); 
             after(grammarAccess.getFeatureAssignerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__3__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1570:1: rule__FeatureAssigner__Group__4 : rule__FeatureAssigner__Group__4__Impl rule__FeatureAssigner__Group__5 ;
    public final void rule__FeatureAssigner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1574:1: ( rule__FeatureAssigner__Group__4__Impl rule__FeatureAssigner__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1575:2: rule__FeatureAssigner__Group__4__Impl rule__FeatureAssigner__Group__5
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__4__Impl_in_rule__FeatureAssigner__Group__43086);
            rule__FeatureAssigner__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FeatureAssigner__Group__5_in_rule__FeatureAssigner__Group__43089);
            rule__FeatureAssigner__Group__5();

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
    // $ANTLR end "rule__FeatureAssigner__Group__4"


    // $ANTLR start "rule__FeatureAssigner__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1582:1: rule__FeatureAssigner__Group__4__Impl : ( ( rule__FeatureAssigner__ValueAssignment_4 ) ) ;
    public final void rule__FeatureAssigner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1586:1: ( ( ( rule__FeatureAssigner__ValueAssignment_4 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1587:1: ( ( rule__FeatureAssigner__ValueAssignment_4 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1587:1: ( ( rule__FeatureAssigner__ValueAssignment_4 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1588:1: ( rule__FeatureAssigner__ValueAssignment_4 )
            {
             before(grammarAccess.getFeatureAssignerAccess().getValueAssignment_4()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1589:1: ( rule__FeatureAssigner__ValueAssignment_4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1589:2: rule__FeatureAssigner__ValueAssignment_4
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__ValueAssignment_4_in_rule__FeatureAssigner__Group__4__Impl3116);
            rule__FeatureAssigner__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAssignerAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__4__Impl"


    // $ANTLR start "rule__FeatureAssigner__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1599:1: rule__FeatureAssigner__Group__5 : rule__FeatureAssigner__Group__5__Impl ;
    public final void rule__FeatureAssigner__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1603:1: ( rule__FeatureAssigner__Group__5__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1604:2: rule__FeatureAssigner__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FeatureAssigner__Group__5__Impl_in_rule__FeatureAssigner__Group__53146);
            rule__FeatureAssigner__Group__5__Impl();

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
    // $ANTLR end "rule__FeatureAssigner__Group__5"


    // $ANTLR start "rule__FeatureAssigner__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1610:1: rule__FeatureAssigner__Group__5__Impl : ( ']' ) ;
    public final void rule__FeatureAssigner__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1614:1: ( ( ']' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1615:1: ( ']' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1615:1: ( ']' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1616:1: ']'
            {
             before(grammarAccess.getFeatureAssignerAccess().getRightSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__FeatureAssigner__Group__5__Impl3174); 
             after(grammarAccess.getFeatureAssignerAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__Group__5__Impl"


    // $ANTLR start "rule__Declarer__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1641:1: rule__Declarer__Group__0 : rule__Declarer__Group__0__Impl rule__Declarer__Group__1 ;
    public final void rule__Declarer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1645:1: ( rule__Declarer__Group__0__Impl rule__Declarer__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1646:2: rule__Declarer__Group__0__Impl rule__Declarer__Group__1
            {
            pushFollow(FOLLOW_rule__Declarer__Group__0__Impl_in_rule__Declarer__Group__03217);
            rule__Declarer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__1_in_rule__Declarer__Group__03220);
            rule__Declarer__Group__1();

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
    // $ANTLR end "rule__Declarer__Group__0"


    // $ANTLR start "rule__Declarer__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1653:1: rule__Declarer__Group__0__Impl : ( () ) ;
    public final void rule__Declarer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1657:1: ( ( () ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1658:1: ( () )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1658:1: ( () )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1659:1: ()
            {
             before(grammarAccess.getDeclarerAccess().getDeclarerAction_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1660:1: ()
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1662:1: 
            {
            }

             after(grammarAccess.getDeclarerAccess().getDeclarerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__0__Impl"


    // $ANTLR start "rule__Declarer__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1672:1: rule__Declarer__Group__1 : rule__Declarer__Group__1__Impl rule__Declarer__Group__2 ;
    public final void rule__Declarer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1676:1: ( rule__Declarer__Group__1__Impl rule__Declarer__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1677:2: rule__Declarer__Group__1__Impl rule__Declarer__Group__2
            {
            pushFollow(FOLLOW_rule__Declarer__Group__1__Impl_in_rule__Declarer__Group__13278);
            rule__Declarer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__2_in_rule__Declarer__Group__13281);
            rule__Declarer__Group__2();

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
    // $ANTLR end "rule__Declarer__Group__1"


    // $ANTLR start "rule__Declarer__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1684:1: rule__Declarer__Group__1__Impl : ( 'Declarer' ) ;
    public final void rule__Declarer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1688:1: ( ( 'Declarer' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1689:1: ( 'Declarer' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1689:1: ( 'Declarer' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1690:1: 'Declarer'
            {
             before(grammarAccess.getDeclarerAccess().getDeclarerKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Declarer__Group__1__Impl3309); 
             after(grammarAccess.getDeclarerAccess().getDeclarerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__1__Impl"


    // $ANTLR start "rule__Declarer__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1703:1: rule__Declarer__Group__2 : rule__Declarer__Group__2__Impl rule__Declarer__Group__3 ;
    public final void rule__Declarer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1707:1: ( rule__Declarer__Group__2__Impl rule__Declarer__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1708:2: rule__Declarer__Group__2__Impl rule__Declarer__Group__3
            {
            pushFollow(FOLLOW_rule__Declarer__Group__2__Impl_in_rule__Declarer__Group__23340);
            rule__Declarer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__3_in_rule__Declarer__Group__23343);
            rule__Declarer__Group__3();

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
    // $ANTLR end "rule__Declarer__Group__2"


    // $ANTLR start "rule__Declarer__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1715:1: rule__Declarer__Group__2__Impl : ( '(' ) ;
    public final void rule__Declarer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1719:1: ( ( '(' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1720:1: ( '(' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1720:1: ( '(' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1721:1: '('
            {
             before(grammarAccess.getDeclarerAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Declarer__Group__2__Impl3371); 
             after(grammarAccess.getDeclarerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__2__Impl"


    // $ANTLR start "rule__Declarer__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1734:1: rule__Declarer__Group__3 : rule__Declarer__Group__3__Impl rule__Declarer__Group__4 ;
    public final void rule__Declarer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1738:1: ( rule__Declarer__Group__3__Impl rule__Declarer__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1739:2: rule__Declarer__Group__3__Impl rule__Declarer__Group__4
            {
            pushFollow(FOLLOW_rule__Declarer__Group__3__Impl_in_rule__Declarer__Group__33402);
            rule__Declarer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__4_in_rule__Declarer__Group__33405);
            rule__Declarer__Group__4();

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
    // $ANTLR end "rule__Declarer__Group__3"


    // $ANTLR start "rule__Declarer__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1746:1: rule__Declarer__Group__3__Impl : ( ( rule__Declarer__TypeAssignment_3 ) ) ;
    public final void rule__Declarer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1750:1: ( ( ( rule__Declarer__TypeAssignment_3 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1751:1: ( ( rule__Declarer__TypeAssignment_3 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1751:1: ( ( rule__Declarer__TypeAssignment_3 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1752:1: ( rule__Declarer__TypeAssignment_3 )
            {
             before(grammarAccess.getDeclarerAccess().getTypeAssignment_3()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1753:1: ( rule__Declarer__TypeAssignment_3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1753:2: rule__Declarer__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Declarer__TypeAssignment_3_in_rule__Declarer__Group__3__Impl3432);
            rule__Declarer__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarerAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__3__Impl"


    // $ANTLR start "rule__Declarer__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1763:1: rule__Declarer__Group__4 : rule__Declarer__Group__4__Impl rule__Declarer__Group__5 ;
    public final void rule__Declarer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1767:1: ( rule__Declarer__Group__4__Impl rule__Declarer__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1768:2: rule__Declarer__Group__4__Impl rule__Declarer__Group__5
            {
            pushFollow(FOLLOW_rule__Declarer__Group__4__Impl_in_rule__Declarer__Group__43462);
            rule__Declarer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__5_in_rule__Declarer__Group__43465);
            rule__Declarer__Group__5();

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
    // $ANTLR end "rule__Declarer__Group__4"


    // $ANTLR start "rule__Declarer__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1775:1: rule__Declarer__Group__4__Impl : ( ',' ) ;
    public final void rule__Declarer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1779:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1780:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1780:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1781:1: ','
            {
             before(grammarAccess.getDeclarerAccess().getCommaKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Declarer__Group__4__Impl3493); 
             after(grammarAccess.getDeclarerAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__4__Impl"


    // $ANTLR start "rule__Declarer__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1794:1: rule__Declarer__Group__5 : rule__Declarer__Group__5__Impl rule__Declarer__Group__6 ;
    public final void rule__Declarer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1798:1: ( rule__Declarer__Group__5__Impl rule__Declarer__Group__6 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1799:2: rule__Declarer__Group__5__Impl rule__Declarer__Group__6
            {
            pushFollow(FOLLOW_rule__Declarer__Group__5__Impl_in_rule__Declarer__Group__53524);
            rule__Declarer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarer__Group__6_in_rule__Declarer__Group__53527);
            rule__Declarer__Group__6();

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
    // $ANTLR end "rule__Declarer__Group__5"


    // $ANTLR start "rule__Declarer__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1806:1: rule__Declarer__Group__5__Impl : ( ( rule__Declarer__NameAssignment_5 ) ) ;
    public final void rule__Declarer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1810:1: ( ( ( rule__Declarer__NameAssignment_5 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1811:1: ( ( rule__Declarer__NameAssignment_5 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1811:1: ( ( rule__Declarer__NameAssignment_5 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1812:1: ( rule__Declarer__NameAssignment_5 )
            {
             before(grammarAccess.getDeclarerAccess().getNameAssignment_5()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1813:1: ( rule__Declarer__NameAssignment_5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1813:2: rule__Declarer__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__Declarer__NameAssignment_5_in_rule__Declarer__Group__5__Impl3554);
            rule__Declarer__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeclarerAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__5__Impl"


    // $ANTLR start "rule__Declarer__Group__6"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1823:1: rule__Declarer__Group__6 : rule__Declarer__Group__6__Impl ;
    public final void rule__Declarer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1827:1: ( rule__Declarer__Group__6__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1828:2: rule__Declarer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Declarer__Group__6__Impl_in_rule__Declarer__Group__63584);
            rule__Declarer__Group__6__Impl();

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
    // $ANTLR end "rule__Declarer__Group__6"


    // $ANTLR start "rule__Declarer__Group__6__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1834:1: rule__Declarer__Group__6__Impl : ( ')' ) ;
    public final void rule__Declarer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1838:1: ( ( ')' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1839:1: ( ')' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1839:1: ( ')' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1840:1: ')'
            {
             before(grammarAccess.getDeclarerAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Declarer__Group__6__Impl3612); 
             after(grammarAccess.getDeclarerAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__Group__6__Impl"


    // $ANTLR start "rule__Assigner__Group__0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1867:1: rule__Assigner__Group__0 : rule__Assigner__Group__0__Impl rule__Assigner__Group__1 ;
    public final void rule__Assigner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1871:1: ( rule__Assigner__Group__0__Impl rule__Assigner__Group__1 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1872:2: rule__Assigner__Group__0__Impl rule__Assigner__Group__1
            {
            pushFollow(FOLLOW_rule__Assigner__Group__0__Impl_in_rule__Assigner__Group__03657);
            rule__Assigner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__1_in_rule__Assigner__Group__03660);
            rule__Assigner__Group__1();

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
    // $ANTLR end "rule__Assigner__Group__0"


    // $ANTLR start "rule__Assigner__Group__0__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1879:1: rule__Assigner__Group__0__Impl : ( () ) ;
    public final void rule__Assigner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1883:1: ( ( () ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1884:1: ( () )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1884:1: ( () )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1885:1: ()
            {
             before(grammarAccess.getAssignerAccess().getAssignerAction_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1886:1: ()
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1888:1: 
            {
            }

             after(grammarAccess.getAssignerAccess().getAssignerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__0__Impl"


    // $ANTLR start "rule__Assigner__Group__1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1898:1: rule__Assigner__Group__1 : rule__Assigner__Group__1__Impl rule__Assigner__Group__2 ;
    public final void rule__Assigner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1902:1: ( rule__Assigner__Group__1__Impl rule__Assigner__Group__2 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1903:2: rule__Assigner__Group__1__Impl rule__Assigner__Group__2
            {
            pushFollow(FOLLOW_rule__Assigner__Group__1__Impl_in_rule__Assigner__Group__13718);
            rule__Assigner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__2_in_rule__Assigner__Group__13721);
            rule__Assigner__Group__2();

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
    // $ANTLR end "rule__Assigner__Group__1"


    // $ANTLR start "rule__Assigner__Group__1__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1910:1: rule__Assigner__Group__1__Impl : ( 'Assigner' ) ;
    public final void rule__Assigner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1914:1: ( ( 'Assigner' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1915:1: ( 'Assigner' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1915:1: ( 'Assigner' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1916:1: 'Assigner'
            {
             before(grammarAccess.getAssignerAccess().getAssignerKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Assigner__Group__1__Impl3749); 
             after(grammarAccess.getAssignerAccess().getAssignerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__1__Impl"


    // $ANTLR start "rule__Assigner__Group__2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1929:1: rule__Assigner__Group__2 : rule__Assigner__Group__2__Impl rule__Assigner__Group__3 ;
    public final void rule__Assigner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1933:1: ( rule__Assigner__Group__2__Impl rule__Assigner__Group__3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1934:2: rule__Assigner__Group__2__Impl rule__Assigner__Group__3
            {
            pushFollow(FOLLOW_rule__Assigner__Group__2__Impl_in_rule__Assigner__Group__23780);
            rule__Assigner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__3_in_rule__Assigner__Group__23783);
            rule__Assigner__Group__3();

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
    // $ANTLR end "rule__Assigner__Group__2"


    // $ANTLR start "rule__Assigner__Group__2__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1941:1: rule__Assigner__Group__2__Impl : ( '(' ) ;
    public final void rule__Assigner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1945:1: ( ( '(' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1946:1: ( '(' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1946:1: ( '(' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1947:1: '('
            {
             before(grammarAccess.getAssignerAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Assigner__Group__2__Impl3811); 
             after(grammarAccess.getAssignerAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__2__Impl"


    // $ANTLR start "rule__Assigner__Group__3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1960:1: rule__Assigner__Group__3 : rule__Assigner__Group__3__Impl rule__Assigner__Group__4 ;
    public final void rule__Assigner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1964:1: ( rule__Assigner__Group__3__Impl rule__Assigner__Group__4 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1965:2: rule__Assigner__Group__3__Impl rule__Assigner__Group__4
            {
            pushFollow(FOLLOW_rule__Assigner__Group__3__Impl_in_rule__Assigner__Group__33842);
            rule__Assigner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__4_in_rule__Assigner__Group__33845);
            rule__Assigner__Group__4();

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
    // $ANTLR end "rule__Assigner__Group__3"


    // $ANTLR start "rule__Assigner__Group__3__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1972:1: rule__Assigner__Group__3__Impl : ( ( rule__Assigner__VarAssignment_3 ) ) ;
    public final void rule__Assigner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1976:1: ( ( ( rule__Assigner__VarAssignment_3 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1977:1: ( ( rule__Assigner__VarAssignment_3 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1977:1: ( ( rule__Assigner__VarAssignment_3 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1978:1: ( rule__Assigner__VarAssignment_3 )
            {
             before(grammarAccess.getAssignerAccess().getVarAssignment_3()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1979:1: ( rule__Assigner__VarAssignment_3 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1979:2: rule__Assigner__VarAssignment_3
            {
            pushFollow(FOLLOW_rule__Assigner__VarAssignment_3_in_rule__Assigner__Group__3__Impl3872);
            rule__Assigner__VarAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignerAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__3__Impl"


    // $ANTLR start "rule__Assigner__Group__4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1989:1: rule__Assigner__Group__4 : rule__Assigner__Group__4__Impl rule__Assigner__Group__5 ;
    public final void rule__Assigner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1993:1: ( rule__Assigner__Group__4__Impl rule__Assigner__Group__5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:1994:2: rule__Assigner__Group__4__Impl rule__Assigner__Group__5
            {
            pushFollow(FOLLOW_rule__Assigner__Group__4__Impl_in_rule__Assigner__Group__43902);
            rule__Assigner__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__5_in_rule__Assigner__Group__43905);
            rule__Assigner__Group__5();

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
    // $ANTLR end "rule__Assigner__Group__4"


    // $ANTLR start "rule__Assigner__Group__4__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2001:1: rule__Assigner__Group__4__Impl : ( ',' ) ;
    public final void rule__Assigner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2005:1: ( ( ',' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2006:1: ( ',' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2006:1: ( ',' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2007:1: ','
            {
             before(grammarAccess.getAssignerAccess().getCommaKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Assigner__Group__4__Impl3933); 
             after(grammarAccess.getAssignerAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__4__Impl"


    // $ANTLR start "rule__Assigner__Group__5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2020:1: rule__Assigner__Group__5 : rule__Assigner__Group__5__Impl rule__Assigner__Group__6 ;
    public final void rule__Assigner__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2024:1: ( rule__Assigner__Group__5__Impl rule__Assigner__Group__6 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2025:2: rule__Assigner__Group__5__Impl rule__Assigner__Group__6
            {
            pushFollow(FOLLOW_rule__Assigner__Group__5__Impl_in_rule__Assigner__Group__53964);
            rule__Assigner__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assigner__Group__6_in_rule__Assigner__Group__53967);
            rule__Assigner__Group__6();

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
    // $ANTLR end "rule__Assigner__Group__5"


    // $ANTLR start "rule__Assigner__Group__5__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2032:1: rule__Assigner__Group__5__Impl : ( ( rule__Assigner__CreatorAssignment_5 ) ) ;
    public final void rule__Assigner__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2036:1: ( ( ( rule__Assigner__CreatorAssignment_5 ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2037:1: ( ( rule__Assigner__CreatorAssignment_5 ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2037:1: ( ( rule__Assigner__CreatorAssignment_5 ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2038:1: ( rule__Assigner__CreatorAssignment_5 )
            {
             before(grammarAccess.getAssignerAccess().getCreatorAssignment_5()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2039:1: ( rule__Assigner__CreatorAssignment_5 )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2039:2: rule__Assigner__CreatorAssignment_5
            {
            pushFollow(FOLLOW_rule__Assigner__CreatorAssignment_5_in_rule__Assigner__Group__5__Impl3994);
            rule__Assigner__CreatorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssignerAccess().getCreatorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__5__Impl"


    // $ANTLR start "rule__Assigner__Group__6"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2049:1: rule__Assigner__Group__6 : rule__Assigner__Group__6__Impl ;
    public final void rule__Assigner__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2053:1: ( rule__Assigner__Group__6__Impl )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2054:2: rule__Assigner__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Assigner__Group__6__Impl_in_rule__Assigner__Group__64024);
            rule__Assigner__Group__6__Impl();

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
    // $ANTLR end "rule__Assigner__Group__6"


    // $ANTLR start "rule__Assigner__Group__6__Impl"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2060:1: rule__Assigner__Group__6__Impl : ( ')' ) ;
    public final void rule__Assigner__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2064:1: ( ( ')' ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2065:1: ( ')' )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2065:1: ( ')' )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2066:1: ')'
            {
             before(grammarAccess.getAssignerAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Assigner__Group__6__Impl4052); 
             after(grammarAccess.getAssignerAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__Group__6__Impl"


    // $ANTLR start "rule__Composer__NameAssignment_1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2094:1: rule__Composer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Composer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2098:1: ( ( RULE_ID ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2099:1: ( RULE_ID )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2099:1: ( RULE_ID )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2100:1: RULE_ID
            {
             before(grammarAccess.getComposerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Composer__NameAssignment_14102); 
             after(grammarAccess.getComposerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__NameAssignment_1"


    // $ANTLR start "rule__Composer__PrimitivesAssignment_3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2109:1: rule__Composer__PrimitivesAssignment_3 : ( ruleMTLPrimitive ) ;
    public final void rule__Composer__PrimitivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2113:1: ( ( ruleMTLPrimitive ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2114:1: ( ruleMTLPrimitive )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2114:1: ( ruleMTLPrimitive )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2115:1: ruleMTLPrimitive
            {
             before(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMTLPrimitive_in_rule__Composer__PrimitivesAssignment_34133);
            ruleMTLPrimitive();

            state._fsp--;

             after(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__PrimitivesAssignment_3"


    // $ANTLR start "rule__Composer__PrimitivesAssignment_4_1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2124:1: rule__Composer__PrimitivesAssignment_4_1 : ( ruleMTLPrimitive ) ;
    public final void rule__Composer__PrimitivesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2128:1: ( ( ruleMTLPrimitive ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2129:1: ( ruleMTLPrimitive )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2129:1: ( ruleMTLPrimitive )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2130:1: ruleMTLPrimitive
            {
             before(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMTLPrimitive_in_rule__Composer__PrimitivesAssignment_4_14164);
            ruleMTLPrimitive();

            state._fsp--;

             after(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composer__PrimitivesAssignment_4_1"


    // $ANTLR start "rule__Creator__TypeAssignment_3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2139:1: rule__Creator__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Creator__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2143:1: ( ( RULE_STRING ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2144:1: ( RULE_STRING )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2144:1: ( RULE_STRING )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2145:1: RULE_STRING
            {
             before(grammarAccess.getCreatorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Creator__TypeAssignment_34195); 
             after(grammarAccess.getCreatorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__TypeAssignment_3"


    // $ANTLR start "rule__Creator__FeaturesAssignment_6_0"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2154:1: rule__Creator__FeaturesAssignment_6_0 : ( ruleFeatureAssigner ) ;
    public final void rule__Creator__FeaturesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2158:1: ( ( ruleFeatureAssigner ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2159:1: ( ruleFeatureAssigner )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2159:1: ( ruleFeatureAssigner )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2160:1: ruleFeatureAssigner
            {
             before(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_rule__Creator__FeaturesAssignment_6_04226);
            ruleFeatureAssigner();

            state._fsp--;

             after(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__FeaturesAssignment_6_0"


    // $ANTLR start "rule__Creator__FeaturesAssignment_6_1_1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2169:1: rule__Creator__FeaturesAssignment_6_1_1 : ( ruleFeatureAssigner ) ;
    public final void rule__Creator__FeaturesAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2173:1: ( ( ruleFeatureAssigner ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2174:1: ( ruleFeatureAssigner )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2174:1: ( ruleFeatureAssigner )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2175:1: ruleFeatureAssigner
            {
             before(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_rule__Creator__FeaturesAssignment_6_1_14257);
            ruleFeatureAssigner();

            state._fsp--;

             after(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__FeaturesAssignment_6_1_1"


    // $ANTLR start "rule__Creator__CreatorNameAssignment_9"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2184:1: rule__Creator__CreatorNameAssignment_9 : ( RULE_ID ) ;
    public final void rule__Creator__CreatorNameAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2188:1: ( ( RULE_ID ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2189:1: ( RULE_ID )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2189:1: ( RULE_ID )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2190:1: RULE_ID
            {
             before(grammarAccess.getCreatorAccess().getCreatorNameIDTerminalRuleCall_9_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Creator__CreatorNameAssignment_94288); 
             after(grammarAccess.getCreatorAccess().getCreatorNameIDTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__CreatorNameAssignment_9"


    // $ANTLR start "rule__Updater__TypeAssignment_3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2199:1: rule__Updater__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Updater__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2203:1: ( ( RULE_STRING ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2204:1: ( RULE_STRING )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2204:1: ( RULE_STRING )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2205:1: RULE_STRING
            {
             before(grammarAccess.getUpdaterAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Updater__TypeAssignment_34319); 
             after(grammarAccess.getUpdaterAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__TypeAssignment_3"


    // $ANTLR start "rule__Updater__FeaturesAssignment_5_1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2214:1: rule__Updater__FeaturesAssignment_5_1 : ( ruleFeatureAssigner ) ;
    public final void rule__Updater__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2218:1: ( ( ruleFeatureAssigner ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2219:1: ( ruleFeatureAssigner )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2219:1: ( ruleFeatureAssigner )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2220:1: ruleFeatureAssigner
            {
             before(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_rule__Updater__FeaturesAssignment_5_14350);
            ruleFeatureAssigner();

            state._fsp--;

             after(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__FeaturesAssignment_5_1"


    // $ANTLR start "rule__Updater__FeaturesAssignment_5_2_1"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2229:1: rule__Updater__FeaturesAssignment_5_2_1 : ( ruleFeatureAssigner ) ;
    public final void rule__Updater__FeaturesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2233:1: ( ( ruleFeatureAssigner ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2234:1: ( ruleFeatureAssigner )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2234:1: ( ruleFeatureAssigner )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2235:1: ruleFeatureAssigner
            {
             before(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_rule__Updater__FeaturesAssignment_5_2_14381);
            ruleFeatureAssigner();

            state._fsp--;

             after(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Updater__FeaturesAssignment_5_2_1"


    // $ANTLR start "rule__FeatureAssigner__FeatureAssignment_2"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2244:1: rule__FeatureAssigner__FeatureAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FeatureAssigner__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2248:1: ( ( RULE_STRING ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2249:1: ( RULE_STRING )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2249:1: ( RULE_STRING )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2250:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAssignerAccess().getFeatureSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureAssigner__FeatureAssignment_24412); 
             after(grammarAccess.getFeatureAssignerAccess().getFeatureSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__FeatureAssignment_2"


    // $ANTLR start "rule__FeatureAssigner__ValueAssignment_4"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2259:1: rule__FeatureAssigner__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FeatureAssigner__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2263:1: ( ( RULE_STRING ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2264:1: ( RULE_STRING )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2264:1: ( RULE_STRING )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2265:1: RULE_STRING
            {
             before(grammarAccess.getFeatureAssignerAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FeatureAssigner__ValueAssignment_44443); 
             after(grammarAccess.getFeatureAssignerAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureAssigner__ValueAssignment_4"


    // $ANTLR start "rule__Declarer__TypeAssignment_3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2274:1: rule__Declarer__TypeAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Declarer__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2278:1: ( ( RULE_STRING ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2279:1: ( RULE_STRING )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2279:1: ( RULE_STRING )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2280:1: RULE_STRING
            {
             before(grammarAccess.getDeclarerAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Declarer__TypeAssignment_34474); 
             after(grammarAccess.getDeclarerAccess().getTypeSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__TypeAssignment_3"


    // $ANTLR start "rule__Declarer__NameAssignment_5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2289:1: rule__Declarer__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Declarer__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2293:1: ( ( RULE_ID ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2294:1: ( RULE_ID )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2294:1: ( RULE_ID )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2295:1: RULE_ID
            {
             before(grammarAccess.getDeclarerAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declarer__NameAssignment_54505); 
             after(grammarAccess.getDeclarerAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarer__NameAssignment_5"


    // $ANTLR start "rule__Assigner__VarAssignment_3"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2304:1: rule__Assigner__VarAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Assigner__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2308:1: ( ( ( RULE_ID ) ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2309:1: ( ( RULE_ID ) )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2309:1: ( ( RULE_ID ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2310:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignerAccess().getVarDeclarerCrossReference_3_0()); 
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2311:1: ( RULE_ID )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2312:1: RULE_ID
            {
             before(grammarAccess.getAssignerAccess().getVarDeclarerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assigner__VarAssignment_34540); 
             after(grammarAccess.getAssignerAccess().getVarDeclarerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssignerAccess().getVarDeclarerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__VarAssignment_3"


    // $ANTLR start "rule__Assigner__CreatorAssignment_5"
    // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2323:1: rule__Assigner__CreatorAssignment_5 : ( ruleCreator ) ;
    public final void rule__Assigner__CreatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2327:1: ( ( ruleCreator ) )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2328:1: ( ruleCreator )
            {
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2328:1: ( ruleCreator )
            // ../example_language.ui/src-gen/example/ui/contentassist/antlr/internal/InternalLanguage.g:2329:1: ruleCreator
            {
             before(grammarAccess.getAssignerAccess().getCreatorCreatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCreator_in_rule__Assigner__CreatorAssignment_54575);
            ruleCreator();

            state._fsp--;

             after(grammarAccess.getAssignerAccess().getCreatorCreatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assigner__CreatorAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleComposer_in_entryRuleComposer61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposer68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__0_in_ruleComposer94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_entryRuleMTLPrimitive121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMTLPrimitive128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MTLPrimitive__Alternatives_in_ruleMTLPrimitive154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__0_in_ruleCreator214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdater_in_entryRuleUpdater241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdater248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__0_in_ruleUpdater274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_entryRuleFeatureAssigner301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureAssigner308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__0_in_ruleFeatureAssigner334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarer_in_entryRuleDeclarer361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarer368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__0_in_ruleDeclarer394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigner_in_entryRuleAssigner421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigner428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__0_in_ruleAssigner454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_rule__MTLPrimitive__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdater_in_rule__MTLPrimitive__Alternatives507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarer_in_rule__MTLPrimitive__Alternatives524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigner_in_rule__MTLPrimitive__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposer_in_rule__MTLPrimitive__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__0__Impl_in_rule__Composer__Group__0588 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Composer__Group__1_in_rule__Composer__Group__0591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Composer__Group__0__Impl619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__1__Impl_in_rule__Composer__Group__1650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Composer__Group__2_in_rule__Composer__Group__1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__NameAssignment_1_in_rule__Composer__Group__1__Impl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__2__Impl_in_rule__Composer__Group__2710 = new BitSet(new long[]{0x0000000000648800L});
    public static final BitSet FOLLOW_rule__Composer__Group__3_in_rule__Composer__Group__2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Composer__Group__2__Impl741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__3__Impl_in_rule__Composer__Group__3772 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Composer__Group__4_in_rule__Composer__Group__3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__PrimitivesAssignment_3_in_rule__Composer__Group__3__Impl802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group__4__Impl_in_rule__Composer__Group__4832 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Composer__Group__5_in_rule__Composer__Group__4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group_4__0_in_rule__Composer__Group__4__Impl862 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Composer__Group__5__Impl_in_rule__Composer__Group__5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Composer__Group__5__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group_4__0__Impl_in_rule__Composer__Group_4__0964 = new BitSet(new long[]{0x0000000000648800L});
    public static final BitSet FOLLOW_rule__Composer__Group_4__1_in_rule__Composer__Group_4__0967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Composer__Group_4__0__Impl995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__Group_4__1__Impl_in_rule__Composer__Group_4__11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Composer__PrimitivesAssignment_4_1_in_rule__Composer__Group_4__1__Impl1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__0__Impl_in_rule__Creator__Group__01087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Creator__Group__1_in_rule__Creator__Group__01090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__1__Impl_in_rule__Creator__Group__11148 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Creator__Group__2_in_rule__Creator__Group__11151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Creator__Group__1__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__2__Impl_in_rule__Creator__Group__21210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Creator__Group__3_in_rule__Creator__Group__21213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Creator__Group__2__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__3__Impl_in_rule__Creator__Group__31272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Creator__Group__4_in_rule__Creator__Group__31275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__TypeAssignment_3_in_rule__Creator__Group__3__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__4__Impl_in_rule__Creator__Group__41332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Creator__Group__5_in_rule__Creator__Group__41335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Creator__Group__4__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__5__Impl_in_rule__Creator__Group__51394 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__Creator__Group__6_in_rule__Creator__Group__51397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Creator__Group__5__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__6__Impl_in_rule__Creator__Group__61456 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_rule__Creator__Group__7_in_rule__Creator__Group__61459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6__0_in_rule__Creator__Group__6__Impl1486 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Creator__Group__7__Impl_in_rule__Creator__Group__71517 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Creator__Group__8_in_rule__Creator__Group__71520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Creator__Group__7__Impl1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__8__Impl_in_rule__Creator__Group__81579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Creator__Group__9_in_rule__Creator__Group__81582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Creator__Group__8__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__9__Impl_in_rule__Creator__Group__91641 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Creator__Group__10_in_rule__Creator__Group__91644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__CreatorNameAssignment_9_in_rule__Creator__Group__9__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group__10__Impl_in_rule__Creator__Group__101701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Creator__Group__10__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6__0__Impl_in_rule__Creator__Group_6__01782 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Creator__Group_6__1_in_rule__Creator__Group_6__01785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__FeaturesAssignment_6_0_in_rule__Creator__Group_6__0__Impl1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6__1__Impl_in_rule__Creator__Group_6__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6_1__0_in_rule__Creator__Group_6__1__Impl1869 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6_1__0__Impl_in_rule__Creator__Group_6_1__01904 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Creator__Group_6_1__1_in_rule__Creator__Group_6_1__01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Creator__Group_6_1__0__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Group_6_1__1__Impl_in_rule__Creator__Group_6_1__11966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__FeaturesAssignment_6_1_1_in_rule__Creator__Group_6_1__1__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__0__Impl_in_rule__Updater__Group__02027 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Updater__Group__1_in_rule__Updater__Group__02030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__1__Impl_in_rule__Updater__Group__12088 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Updater__Group__2_in_rule__Updater__Group__12091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Updater__Group__1__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__2__Impl_in_rule__Updater__Group__22150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Updater__Group__3_in_rule__Updater__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Updater__Group__2__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__3__Impl_in_rule__Updater__Group__32212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Updater__Group__4_in_rule__Updater__Group__32215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__TypeAssignment_3_in_rule__Updater__Group__3__Impl2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__4__Impl_in_rule__Updater__Group__42272 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Updater__Group__5_in_rule__Updater__Group__42275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Updater__Group__4__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__5__Impl_in_rule__Updater__Group__52334 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Updater__Group__6_in_rule__Updater__Group__52337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__0_in_rule__Updater__Group__5__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group__6__Impl_in_rule__Updater__Group__62395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Updater__Group__6__Impl2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__0__Impl_in_rule__Updater__Group_5__02468 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__1_in_rule__Updater__Group_5__02471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Updater__Group_5__0__Impl2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__1__Impl_in_rule__Updater__Group_5__12530 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__2_in_rule__Updater__Group_5__12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__FeaturesAssignment_5_1_in_rule__Updater__Group_5__1__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__2__Impl_in_rule__Updater__Group_5__22590 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__3_in_rule__Updater__Group_5__22593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5_2__0_in_rule__Updater__Group_5__2__Impl2620 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5__3__Impl_in_rule__Updater__Group_5__32651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Updater__Group_5__3__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5_2__0__Impl_in_rule__Updater__Group_5_2__02718 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Updater__Group_5_2__1_in_rule__Updater__Group_5_2__02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Updater__Group_5_2__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__Group_5_2__1__Impl_in_rule__Updater__Group_5_2__12780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Updater__FeaturesAssignment_5_2_1_in_rule__Updater__Group_5_2__1__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__0__Impl_in_rule__FeatureAssigner__Group__02841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__1_in_rule__FeatureAssigner__Group__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__1__Impl_in_rule__FeatureAssigner__Group__12902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__2_in_rule__FeatureAssigner__Group__12905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FeatureAssigner__Group__1__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__2__Impl_in_rule__FeatureAssigner__Group__22964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__3_in_rule__FeatureAssigner__Group__22967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__FeatureAssignment_2_in_rule__FeatureAssigner__Group__2__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__3__Impl_in_rule__FeatureAssigner__Group__33024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__4_in_rule__FeatureAssigner__Group__33027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FeatureAssigner__Group__3__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__4__Impl_in_rule__FeatureAssigner__Group__43086 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__5_in_rule__FeatureAssigner__Group__43089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__ValueAssignment_4_in_rule__FeatureAssigner__Group__4__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureAssigner__Group__5__Impl_in_rule__FeatureAssigner__Group__53146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FeatureAssigner__Group__5__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__0__Impl_in_rule__Declarer__Group__03217 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Declarer__Group__1_in_rule__Declarer__Group__03220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__1__Impl_in_rule__Declarer__Group__13278 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Declarer__Group__2_in_rule__Declarer__Group__13281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Declarer__Group__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__2__Impl_in_rule__Declarer__Group__23340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declarer__Group__3_in_rule__Declarer__Group__23343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Declarer__Group__2__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__3__Impl_in_rule__Declarer__Group__33402 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Declarer__Group__4_in_rule__Declarer__Group__33405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__TypeAssignment_3_in_rule__Declarer__Group__3__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__4__Impl_in_rule__Declarer__Group__43462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Declarer__Group__5_in_rule__Declarer__Group__43465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Declarer__Group__4__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__5__Impl_in_rule__Declarer__Group__53524 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Declarer__Group__6_in_rule__Declarer__Group__53527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__NameAssignment_5_in_rule__Declarer__Group__5__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarer__Group__6__Impl_in_rule__Declarer__Group__63584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Declarer__Group__6__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__0__Impl_in_rule__Assigner__Group__03657 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Assigner__Group__1_in_rule__Assigner__Group__03660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__1__Impl_in_rule__Assigner__Group__13718 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Assigner__Group__2_in_rule__Assigner__Group__13721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Assigner__Group__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__2__Impl_in_rule__Assigner__Group__23780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assigner__Group__3_in_rule__Assigner__Group__23783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Assigner__Group__2__Impl3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__3__Impl_in_rule__Assigner__Group__33842 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Assigner__Group__4_in_rule__Assigner__Group__33845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__VarAssignment_3_in_rule__Assigner__Group__3__Impl3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__4__Impl_in_rule__Assigner__Group__43902 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Assigner__Group__5_in_rule__Assigner__Group__43905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assigner__Group__4__Impl3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__5__Impl_in_rule__Assigner__Group__53964 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Assigner__Group__6_in_rule__Assigner__Group__53967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__CreatorAssignment_5_in_rule__Assigner__Group__5__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assigner__Group__6__Impl_in_rule__Assigner__Group__64024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Assigner__Group__6__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Composer__NameAssignment_14102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_rule__Composer__PrimitivesAssignment_34133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_rule__Composer__PrimitivesAssignment_4_14164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Creator__TypeAssignment_34195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_rule__Creator__FeaturesAssignment_6_04226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_rule__Creator__FeaturesAssignment_6_1_14257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Creator__CreatorNameAssignment_94288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Updater__TypeAssignment_34319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_rule__Updater__FeaturesAssignment_5_14350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_rule__Updater__FeaturesAssignment_5_2_14381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureAssigner__FeatureAssignment_24412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FeatureAssigner__ValueAssignment_44443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Declarer__TypeAssignment_34474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declarer__NameAssignment_54505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assigner__VarAssignment_34540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_rule__Assigner__CreatorAssignment_54575 = new BitSet(new long[]{0x0000000000000002L});

}