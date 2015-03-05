package example.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import example.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Composer'", "'{'", "','", "'}'", "'Creator'", "'('", "')'", "'Updater'", "'['", "']'", "'Declarer'", "'Assigner'"
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
    public String getGrammarFileName() { return "../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g"; }



     	private LanguageGrammarAccess grammarAccess;
     	
        public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Composer";	
       	}
       	
       	@Override
       	protected LanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleComposer"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:67:1: entryRuleComposer returns [EObject current=null] : iv_ruleComposer= ruleComposer EOF ;
    public final EObject entryRuleComposer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposer = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:68:2: (iv_ruleComposer= ruleComposer EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:69:2: iv_ruleComposer= ruleComposer EOF
            {
             newCompositeNode(grammarAccess.getComposerRule()); 
            pushFollow(FOLLOW_ruleComposer_in_entryRuleComposer75);
            iv_ruleComposer=ruleComposer();

            state._fsp--;

             current =iv_ruleComposer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposer85); 

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
    // $ANTLR end "entryRuleComposer"


    // $ANTLR start "ruleComposer"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:76:1: ruleComposer returns [EObject current=null] : (otherlv_0= 'Composer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_primitives_3_0= ruleMTLPrimitive ) ) (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComposer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_primitives_3_0 = null;

        EObject lv_primitives_5_0 = null;


         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:79:28: ( (otherlv_0= 'Composer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_primitives_3_0= ruleMTLPrimitive ) ) (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )* otherlv_6= '}' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:80:1: (otherlv_0= 'Composer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_primitives_3_0= ruleMTLPrimitive ) ) (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )* otherlv_6= '}' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:80:1: (otherlv_0= 'Composer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_primitives_3_0= ruleMTLPrimitive ) ) (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )* otherlv_6= '}' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:80:3: otherlv_0= 'Composer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_primitives_3_0= ruleMTLPrimitive ) ) (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleComposer122); 

                	newLeafNode(otherlv_0, grammarAccess.getComposerAccess().getComposerKeyword_0());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComposer139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComposerAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComposerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComposer156); 

                	newLeafNode(otherlv_2, grammarAccess.getComposerAccess().getLeftCurlyBracketKeyword_2());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:106:1: ( (lv_primitives_3_0= ruleMTLPrimitive ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:107:1: (lv_primitives_3_0= ruleMTLPrimitive )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:107:1: (lv_primitives_3_0= ruleMTLPrimitive )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:108:3: lv_primitives_3_0= ruleMTLPrimitive
            {
             
            	        newCompositeNode(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMTLPrimitive_in_ruleComposer177);
            lv_primitives_3_0=ruleMTLPrimitive();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComposerRule());
            	        }
                   		add(
                   			current, 
                   			"primitives",
                    		lv_primitives_3_0, 
                    		"MTLPrimitive");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:124:2: (otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:124:4: otherlv_4= ',' ( (lv_primitives_5_0= ruleMTLPrimitive ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleComposer190); 

            	        	newLeafNode(otherlv_4, grammarAccess.getComposerAccess().getCommaKeyword_4_0());
            	        
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:128:1: ( (lv_primitives_5_0= ruleMTLPrimitive ) )
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:129:1: (lv_primitives_5_0= ruleMTLPrimitive )
            	    {
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:129:1: (lv_primitives_5_0= ruleMTLPrimitive )
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:130:3: lv_primitives_5_0= ruleMTLPrimitive
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMTLPrimitive_in_ruleComposer211);
            	    lv_primitives_5_0=ruleMTLPrimitive();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComposerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"primitives",
            	            		lv_primitives_5_0, 
            	            		"MTLPrimitive");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleComposer225); 

                	newLeafNode(otherlv_6, grammarAccess.getComposerAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleComposer"


    // $ANTLR start "entryRuleMTLPrimitive"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:158:1: entryRuleMTLPrimitive returns [EObject current=null] : iv_ruleMTLPrimitive= ruleMTLPrimitive EOF ;
    public final EObject entryRuleMTLPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMTLPrimitive = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:159:2: (iv_ruleMTLPrimitive= ruleMTLPrimitive EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:160:2: iv_ruleMTLPrimitive= ruleMTLPrimitive EOF
            {
             newCompositeNode(grammarAccess.getMTLPrimitiveRule()); 
            pushFollow(FOLLOW_ruleMTLPrimitive_in_entryRuleMTLPrimitive261);
            iv_ruleMTLPrimitive=ruleMTLPrimitive();

            state._fsp--;

             current =iv_ruleMTLPrimitive; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMTLPrimitive271); 

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
    // $ANTLR end "entryRuleMTLPrimitive"


    // $ANTLR start "ruleMTLPrimitive"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:167:1: ruleMTLPrimitive returns [EObject current=null] : (this_Creator_0= ruleCreator | this_Updater_1= ruleUpdater | this_Declarer_2= ruleDeclarer | this_Assigner_3= ruleAssigner | this_Composer_4= ruleComposer ) ;
    public final EObject ruleMTLPrimitive() throws RecognitionException {
        EObject current = null;

        EObject this_Creator_0 = null;

        EObject this_Updater_1 = null;

        EObject this_Declarer_2 = null;

        EObject this_Assigner_3 = null;

        EObject this_Composer_4 = null;


         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:170:28: ( (this_Creator_0= ruleCreator | this_Updater_1= ruleUpdater | this_Declarer_2= ruleDeclarer | this_Assigner_3= ruleAssigner | this_Composer_4= ruleComposer ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:171:1: (this_Creator_0= ruleCreator | this_Updater_1= ruleUpdater | this_Declarer_2= ruleDeclarer | this_Assigner_3= ruleAssigner | this_Composer_4= ruleComposer )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:171:1: (this_Creator_0= ruleCreator | this_Updater_1= ruleUpdater | this_Declarer_2= ruleDeclarer | this_Assigner_3= ruleAssigner | this_Composer_4= ruleComposer )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 11:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:172:5: this_Creator_0= ruleCreator
                    {
                     
                            newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getCreatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreator_in_ruleMTLPrimitive318);
                    this_Creator_0=ruleCreator();

                    state._fsp--;

                     
                            current = this_Creator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:182:5: this_Updater_1= ruleUpdater
                    {
                     
                            newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getUpdaterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUpdater_in_ruleMTLPrimitive345);
                    this_Updater_1=ruleUpdater();

                    state._fsp--;

                     
                            current = this_Updater_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:192:5: this_Declarer_2= ruleDeclarer
                    {
                     
                            newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getDeclarerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDeclarer_in_ruleMTLPrimitive372);
                    this_Declarer_2=ruleDeclarer();

                    state._fsp--;

                     
                            current = this_Declarer_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:202:5: this_Assigner_3= ruleAssigner
                    {
                     
                            newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getAssignerParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAssigner_in_ruleMTLPrimitive399);
                    this_Assigner_3=ruleAssigner();

                    state._fsp--;

                     
                            current = this_Assigner_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:212:5: this_Composer_4= ruleComposer
                    {
                     
                            newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getComposerParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleComposer_in_ruleMTLPrimitive426);
                    this_Composer_4=ruleComposer();

                    state._fsp--;

                     
                            current = this_Composer_4; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleMTLPrimitive"


    // $ANTLR start "entryRuleCreator"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:228:1: entryRuleCreator returns [EObject current=null] : iv_ruleCreator= ruleCreator EOF ;
    public final EObject entryRuleCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreator = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:229:2: (iv_ruleCreator= ruleCreator EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:230:2: iv_ruleCreator= ruleCreator EOF
            {
             newCompositeNode(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator461);
            iv_ruleCreator=ruleCreator();

            state._fsp--;

             current =iv_ruleCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator471); 

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
    // $ANTLR end "entryRuleCreator"


    // $ANTLR start "ruleCreator"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:237:1: ruleCreator returns [EObject current=null] : ( () otherlv_1= 'Creator' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '{' ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )* otherlv_9= '}' otherlv_10= ',' ( (lv_creatorName_11_0= RULE_ID ) ) otherlv_12= ')' ) ;
    public final EObject ruleCreator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_creatorName_11_0=null;
        Token otherlv_12=null;
        EObject lv_features_6_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:240:28: ( ( () otherlv_1= 'Creator' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '{' ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )* otherlv_9= '}' otherlv_10= ',' ( (lv_creatorName_11_0= RULE_ID ) ) otherlv_12= ')' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:241:1: ( () otherlv_1= 'Creator' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '{' ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )* otherlv_9= '}' otherlv_10= ',' ( (lv_creatorName_11_0= RULE_ID ) ) otherlv_12= ')' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:241:1: ( () otherlv_1= 'Creator' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '{' ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )* otherlv_9= '}' otherlv_10= ',' ( (lv_creatorName_11_0= RULE_ID ) ) otherlv_12= ')' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:241:2: () otherlv_1= 'Creator' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= '{' ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )* otherlv_9= '}' otherlv_10= ',' ( (lv_creatorName_11_0= RULE_ID ) ) otherlv_12= ')'
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:241:2: ()
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:242:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCreatorAccess().getCreatorAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleCreator517); 

                	newLeafNode(otherlv_1, grammarAccess.getCreatorAccess().getCreatorKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleCreator529); 

                	newLeafNode(otherlv_2, grammarAccess.getCreatorAccess().getLeftParenthesisKeyword_2());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:255:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:256:1: (lv_type_3_0= RULE_STRING )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:256:1: (lv_type_3_0= RULE_STRING )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:257:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCreator546); 

            			newLeafNode(lv_type_3_0, grammarAccess.getCreatorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCreator563); 

                	newLeafNode(otherlv_4, grammarAccess.getCreatorAccess().getCommaKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleCreator575); 

                	newLeafNode(otherlv_5, grammarAccess.getCreatorAccess().getLeftCurlyBracketKeyword_5());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:281:1: ( ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:281:2: ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )*
            	    {
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:281:2: ( (lv_features_6_0= ruleFeatureAssigner ) )
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:282:1: (lv_features_6_0= ruleFeatureAssigner )
            	    {
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:282:1: (lv_features_6_0= ruleFeatureAssigner )
            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:283:3: lv_features_6_0= ruleFeatureAssigner
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeatureAssigner_in_ruleCreator597);
            	    lv_features_6_0=ruleFeatureAssigner();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCreatorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_6_0, 
            	            		"FeatureAssigner");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:299:2: (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==13) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:299:4: otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleCreator610); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getCreatorAccess().getCommaKeyword_6_1_0());
            	    	        
            	    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:303:1: ( (lv_features_8_0= ruleFeatureAssigner ) )
            	    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:304:1: (lv_features_8_0= ruleFeatureAssigner )
            	    	    {
            	    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:304:1: (lv_features_8_0= ruleFeatureAssigner )
            	    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:305:3: lv_features_8_0= ruleFeatureAssigner
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleFeatureAssigner_in_ruleCreator631);
            	    	    lv_features_8_0=ruleFeatureAssigner();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getCreatorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"features",
            	    	            		lv_features_8_0, 
            	    	            		"FeatureAssigner");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleCreator647); 

                	newLeafNode(otherlv_9, grammarAccess.getCreatorAccess().getRightCurlyBracketKeyword_7());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleCreator659); 

                	newLeafNode(otherlv_10, grammarAccess.getCreatorAccess().getCommaKeyword_8());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:329:1: ( (lv_creatorName_11_0= RULE_ID ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:330:1: (lv_creatorName_11_0= RULE_ID )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:330:1: (lv_creatorName_11_0= RULE_ID )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:331:3: lv_creatorName_11_0= RULE_ID
            {
            lv_creatorName_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCreator676); 

            			newLeafNode(lv_creatorName_11_0, grammarAccess.getCreatorAccess().getCreatorNameIDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCreatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"creatorName",
                    		lv_creatorName_11_0, 
                    		"ID");
            	    

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleCreator693); 

                	newLeafNode(otherlv_12, grammarAccess.getCreatorAccess().getRightParenthesisKeyword_10());
                

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
    // $ANTLR end "ruleCreator"


    // $ANTLR start "entryRuleUpdater"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:359:1: entryRuleUpdater returns [EObject current=null] : iv_ruleUpdater= ruleUpdater EOF ;
    public final EObject entryRuleUpdater() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdater = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:360:2: (iv_ruleUpdater= ruleUpdater EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:361:2: iv_ruleUpdater= ruleUpdater EOF
            {
             newCompositeNode(grammarAccess.getUpdaterRule()); 
            pushFollow(FOLLOW_ruleUpdater_in_entryRuleUpdater729);
            iv_ruleUpdater=ruleUpdater();

            state._fsp--;

             current =iv_ruleUpdater; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpdater739); 

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
    // $ANTLR end "entryRuleUpdater"


    // $ANTLR start "ruleUpdater"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:368:1: ruleUpdater returns [EObject current=null] : ( () otherlv_1= 'Updater' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) ;
    public final EObject ruleUpdater() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_features_6_0 = null;

        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:371:28: ( ( () otherlv_1= 'Updater' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )? otherlv_10= ')' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:372:1: ( () otherlv_1= 'Updater' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:372:1: ( () otherlv_1= 'Updater' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )? otherlv_10= ')' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:372:2: () otherlv_1= 'Updater' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )? otherlv_10= ')'
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:372:2: ()
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:373:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUpdaterAccess().getUpdaterAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleUpdater785); 

                	newLeafNode(otherlv_1, grammarAccess.getUpdaterAccess().getUpdaterKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleUpdater797); 

                	newLeafNode(otherlv_2, grammarAccess.getUpdaterAccess().getLeftParenthesisKeyword_2());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:386:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:387:1: (lv_type_3_0= RULE_STRING )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:387:1: (lv_type_3_0= RULE_STRING )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:388:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUpdater814); 

            			newLeafNode(lv_type_3_0, grammarAccess.getUpdaterAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUpdaterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleUpdater831); 

                	newLeafNode(otherlv_4, grammarAccess.getUpdaterAccess().getCommaKeyword_4());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:408:1: (otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:408:3: otherlv_5= '{' ( (lv_features_6_0= ruleFeatureAssigner ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleUpdater844); 

                        	newLeafNode(otherlv_5, grammarAccess.getUpdaterAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:412:1: ( (lv_features_6_0= ruleFeatureAssigner ) )
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:413:1: (lv_features_6_0= ruleFeatureAssigner )
                    {
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:413:1: (lv_features_6_0= ruleFeatureAssigner )
                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:414:3: lv_features_6_0= ruleFeatureAssigner
                    {
                     
                    	        newCompositeNode(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFeatureAssigner_in_ruleUpdater865);
                    lv_features_6_0=ruleFeatureAssigner();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUpdaterRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_6_0, 
                            		"FeatureAssigner");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:430:2: (otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:430:4: otherlv_7= ',' ( (lv_features_8_0= ruleFeatureAssigner ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleUpdater878); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getUpdaterAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:434:1: ( (lv_features_8_0= ruleFeatureAssigner ) )
                    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:435:1: (lv_features_8_0= ruleFeatureAssigner )
                    	    {
                    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:435:1: (lv_features_8_0= ruleFeatureAssigner )
                    	    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:436:3: lv_features_8_0= ruleFeatureAssigner
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFeatureAssigner_in_ruleUpdater899);
                    	    lv_features_8_0=ruleFeatureAssigner();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getUpdaterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_8_0, 
                    	            		"FeatureAssigner");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleUpdater913); 

                        	newLeafNode(otherlv_9, grammarAccess.getUpdaterAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleUpdater927); 

                	newLeafNode(otherlv_10, grammarAccess.getUpdaterAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleUpdater"


    // $ANTLR start "entryRuleFeatureAssigner"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:468:1: entryRuleFeatureAssigner returns [EObject current=null] : iv_ruleFeatureAssigner= ruleFeatureAssigner EOF ;
    public final EObject entryRuleFeatureAssigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureAssigner = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:469:2: (iv_ruleFeatureAssigner= ruleFeatureAssigner EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:470:2: iv_ruleFeatureAssigner= ruleFeatureAssigner EOF
            {
             newCompositeNode(grammarAccess.getFeatureAssignerRule()); 
            pushFollow(FOLLOW_ruleFeatureAssigner_in_entryRuleFeatureAssigner963);
            iv_ruleFeatureAssigner=ruleFeatureAssigner();

            state._fsp--;

             current =iv_ruleFeatureAssigner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureAssigner973); 

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
    // $ANTLR end "entryRuleFeatureAssigner"


    // $ANTLR start "ruleFeatureAssigner"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:477:1: ruleFeatureAssigner returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_feature_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ']' ) ;
    public final EObject ruleFeatureAssigner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_feature_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:480:28: ( ( () otherlv_1= '[' ( (lv_feature_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ']' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:481:1: ( () otherlv_1= '[' ( (lv_feature_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ']' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:481:1: ( () otherlv_1= '[' ( (lv_feature_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ']' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:481:2: () otherlv_1= '[' ( (lv_feature_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ']'
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:481:2: ()
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:482:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFeatureAssignerAccess().getFeatureAssignerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFeatureAssigner1019); 

                	newLeafNode(otherlv_1, grammarAccess.getFeatureAssignerAccess().getLeftSquareBracketKeyword_1());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:491:1: ( (lv_feature_2_0= RULE_STRING ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:492:1: (lv_feature_2_0= RULE_STRING )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:492:1: (lv_feature_2_0= RULE_STRING )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:493:3: lv_feature_2_0= RULE_STRING
            {
            lv_feature_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureAssigner1036); 

            			newLeafNode(lv_feature_2_0, grammarAccess.getFeatureAssignerAccess().getFeatureSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureAssignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFeatureAssigner1053); 

                	newLeafNode(otherlv_3, grammarAccess.getFeatureAssignerAccess().getCommaKeyword_3());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:513:1: ( (lv_value_4_0= RULE_STRING ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:514:1: (lv_value_4_0= RULE_STRING )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:514:1: (lv_value_4_0= RULE_STRING )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:515:3: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFeatureAssigner1070); 

            			newLeafNode(lv_value_4_0, grammarAccess.getFeatureAssignerAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureAssignerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleFeatureAssigner1087); 

                	newLeafNode(otherlv_5, grammarAccess.getFeatureAssignerAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleFeatureAssigner"


    // $ANTLR start "entryRuleDeclarer"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:543:1: entryRuleDeclarer returns [EObject current=null] : iv_ruleDeclarer= ruleDeclarer EOF ;
    public final EObject entryRuleDeclarer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarer = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:544:2: (iv_ruleDeclarer= ruleDeclarer EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:545:2: iv_ruleDeclarer= ruleDeclarer EOF
            {
             newCompositeNode(grammarAccess.getDeclarerRule()); 
            pushFollow(FOLLOW_ruleDeclarer_in_entryRuleDeclarer1123);
            iv_ruleDeclarer=ruleDeclarer();

            state._fsp--;

             current =iv_ruleDeclarer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarer1133); 

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
    // $ANTLR end "entryRuleDeclarer"


    // $ANTLR start "ruleDeclarer"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:552:1: ruleDeclarer returns [EObject current=null] : ( () otherlv_1= 'Declarer' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleDeclarer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:555:28: ( ( () otherlv_1= 'Declarer' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:556:1: ( () otherlv_1= 'Declarer' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:556:1: ( () otherlv_1= 'Declarer' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:556:2: () otherlv_1= 'Declarer' otherlv_2= '(' ( (lv_type_3_0= RULE_STRING ) ) otherlv_4= ',' ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ')'
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:556:2: ()
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:557:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDeclarerAccess().getDeclarerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleDeclarer1179); 

                	newLeafNode(otherlv_1, grammarAccess.getDeclarerAccess().getDeclarerKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDeclarer1191); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarerAccess().getLeftParenthesisKeyword_2());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:570:1: ( (lv_type_3_0= RULE_STRING ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:571:1: (lv_type_3_0= RULE_STRING )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:571:1: (lv_type_3_0= RULE_STRING )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:572:3: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclarer1208); 

            			newLeafNode(lv_type_3_0, grammarAccess.getDeclarerAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDeclarer1225); 

                	newLeafNode(otherlv_4, grammarAccess.getDeclarerAccess().getCommaKeyword_4());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:592:1: ( (lv_name_5_0= RULE_ID ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:593:1: (lv_name_5_0= RULE_ID )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:593:1: (lv_name_5_0= RULE_ID )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:594:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDeclarer1242); 

            			newLeafNode(lv_name_5_0, grammarAccess.getDeclarerAccess().getNameIDTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDeclarerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_5_0, 
                    		"ID");
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleDeclarer1259); 

                	newLeafNode(otherlv_6, grammarAccess.getDeclarerAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleDeclarer"


    // $ANTLR start "entryRuleAssigner"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:622:1: entryRuleAssigner returns [EObject current=null] : iv_ruleAssigner= ruleAssigner EOF ;
    public final EObject entryRuleAssigner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssigner = null;


        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:623:2: (iv_ruleAssigner= ruleAssigner EOF )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:624:2: iv_ruleAssigner= ruleAssigner EOF
            {
             newCompositeNode(grammarAccess.getAssignerRule()); 
            pushFollow(FOLLOW_ruleAssigner_in_entryRuleAssigner1295);
            iv_ruleAssigner=ruleAssigner();

            state._fsp--;

             current =iv_ruleAssigner; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigner1305); 

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
    // $ANTLR end "entryRuleAssigner"


    // $ANTLR start "ruleAssigner"
    // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:631:1: ruleAssigner returns [EObject current=null] : ( () otherlv_1= 'Assigner' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_creator_5_0= ruleCreator ) ) otherlv_6= ')' ) ;
    public final EObject ruleAssigner() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_creator_5_0 = null;


         enterRule(); 
            
        try {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:634:28: ( ( () otherlv_1= 'Assigner' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_creator_5_0= ruleCreator ) ) otherlv_6= ')' ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:635:1: ( () otherlv_1= 'Assigner' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_creator_5_0= ruleCreator ) ) otherlv_6= ')' )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:635:1: ( () otherlv_1= 'Assigner' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_creator_5_0= ruleCreator ) ) otherlv_6= ')' )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:635:2: () otherlv_1= 'Assigner' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (lv_creator_5_0= ruleCreator ) ) otherlv_6= ')'
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:635:2: ()
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:636:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignerAccess().getAssignerAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAssigner1351); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignerAccess().getAssignerKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAssigner1363); 

                	newLeafNode(otherlv_2, grammarAccess.getAssignerAccess().getLeftParenthesisKeyword_2());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:649:1: ( (otherlv_3= RULE_ID ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:650:1: (otherlv_3= RULE_ID )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:650:1: (otherlv_3= RULE_ID )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:651:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignerRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssigner1383); 

            		newLeafNode(otherlv_3, grammarAccess.getAssignerAccess().getVarDeclarerCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAssigner1395); 

                	newLeafNode(otherlv_4, grammarAccess.getAssignerAccess().getCommaKeyword_4());
                
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:666:1: ( (lv_creator_5_0= ruleCreator ) )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:667:1: (lv_creator_5_0= ruleCreator )
            {
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:667:1: (lv_creator_5_0= ruleCreator )
            // ../example_language/src-gen/example/parser/antlr/internal/InternalLanguage.g:668:3: lv_creator_5_0= ruleCreator
            {
             
            	        newCompositeNode(grammarAccess.getAssignerAccess().getCreatorCreatorParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleCreator_in_ruleAssigner1416);
            lv_creator_5_0=ruleCreator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignerRule());
            	        }
                   		add(
                   			current, 
                   			"creator",
                    		lv_creator_5_0, 
                    		"Creator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAssigner1428); 

                	newLeafNode(otherlv_6, grammarAccess.getAssignerAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleAssigner"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleComposer_in_entryRuleComposer75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposer85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComposer122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComposer139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComposer156 = new BitSet(new long[]{0x0000000000648800L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_ruleComposer177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleComposer190 = new BitSet(new long[]{0x0000000000648800L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_ruleComposer211 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleComposer225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMTLPrimitive_in_entryRuleMTLPrimitive261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMTLPrimitive271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_ruleMTLPrimitive318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdater_in_ruleMTLPrimitive345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarer_in_ruleMTLPrimitive372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigner_in_ruleMTLPrimitive399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposer_in_ruleMTLPrimitive426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCreator517 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCreator529 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCreator546 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCreator563 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCreator575 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_ruleCreator597 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_13_in_ruleCreator610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_ruleCreator631 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_14_in_ruleCreator647 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleCreator659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCreator676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCreator693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpdater_in_entryRuleUpdater729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpdater739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUpdater785 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUpdater797 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUpdater814 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUpdater831 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleUpdater844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_ruleUpdater865 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleUpdater878 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_ruleUpdater899 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleUpdater913 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleUpdater927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureAssigner_in_entryRuleFeatureAssigner963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureAssigner973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFeatureAssigner1019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureAssigner1036 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFeatureAssigner1053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFeatureAssigner1070 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFeatureAssigner1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarer_in_entryRuleDeclarer1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarer1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDeclarer1179 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDeclarer1191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclarer1208 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDeclarer1225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDeclarer1242 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDeclarer1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigner_in_entryRuleAssigner1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigner1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAssigner1351 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssigner1363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssigner1383 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssigner1395 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleCreator_in_ruleAssigner1416 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAssigner1428 = new BitSet(new long[]{0x0000000000000002L});

}