/*
* generated by Xtext
*/
grammar InternalLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleComposer
entryRuleComposer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComposerRule()); }
	 iv_ruleComposer=ruleComposer 
	 { $current=$iv_ruleComposer.current; } 
	 EOF 
;

// Rule Composer
ruleComposer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Composer' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getComposerAccess().getComposerKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getComposerAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComposerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getComposerAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_3_0()); 
	    }
		lv_primitives_3_0=ruleMTLPrimitive		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComposerRule());
	        }
       		add(
       			$current, 
       			"primitives",
        		lv_primitives_3_0, 
        		"MTLPrimitive");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getComposerAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComposerAccess().getPrimitivesMTLPrimitiveParserRuleCall_4_1_0()); 
	    }
		lv_primitives_5_0=ruleMTLPrimitive		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComposerRule());
	        }
       		add(
       			$current, 
       			"primitives",
        		lv_primitives_5_0, 
        		"MTLPrimitive");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getComposerAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleMTLPrimitive
entryRuleMTLPrimitive returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMTLPrimitiveRule()); }
	 iv_ruleMTLPrimitive=ruleMTLPrimitive 
	 { $current=$iv_ruleMTLPrimitive.current; } 
	 EOF 
;

// Rule MTLPrimitive
ruleMTLPrimitive returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getCreatorParserRuleCall_0()); 
    }
    this_Creator_0=ruleCreator
    { 
        $current = $this_Creator_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getUpdaterParserRuleCall_1()); 
    }
    this_Updater_1=ruleUpdater
    { 
        $current = $this_Updater_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getDeclarerParserRuleCall_2()); 
    }
    this_Declarer_2=ruleDeclarer
    { 
        $current = $this_Declarer_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getAssignerParserRuleCall_3()); 
    }
    this_Assigner_3=ruleAssigner
    { 
        $current = $this_Assigner_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMTLPrimitiveAccess().getComposerParserRuleCall_4()); 
    }
    this_Composer_4=ruleComposer
    { 
        $current = $this_Composer_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleCreator
entryRuleCreator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCreatorRule()); }
	 iv_ruleCreator=ruleCreator 
	 { $current=$iv_ruleCreator.current; } 
	 EOF 
;

// Rule Creator
ruleCreator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getCreatorAccess().getCreatorAction_0(),
            $current);
    }
)	otherlv_1='Creator' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCreatorAccess().getCreatorKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCreatorAccess().getLeftParenthesisKeyword_2());
    }
(
(
		lv_type_3_0=RULE_STRING
		{
			newLeafNode(lv_type_3_0, grammarAccess.getCreatorAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreatorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"STRING");
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCreatorAccess().getCommaKeyword_4());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getCreatorAccess().getLeftCurlyBracketKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_0_0()); 
	    }
		lv_features_6_0=ruleFeatureAssigner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCreatorRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_6_0, 
        		"FeatureAssigner");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCreatorAccess().getCommaKeyword_6_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCreatorAccess().getFeaturesFeatureAssignerParserRuleCall_6_1_1_0()); 
	    }
		lv_features_8_0=ruleFeatureAssigner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCreatorRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_8_0, 
        		"FeatureAssigner");
	        afterParserOrEnumRuleCall();
	    }

)
))*)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getCreatorAccess().getRightCurlyBracketKeyword_7());
    }
	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getCreatorAccess().getCommaKeyword_8());
    }
(
(
		lv_creatorName_11_0=RULE_ID
		{
			newLeafNode(lv_creatorName_11_0, grammarAccess.getCreatorAccess().getCreatorNameIDTerminalRuleCall_9_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCreatorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"creatorName",
        		lv_creatorName_11_0, 
        		"ID");
	    }

)
)	otherlv_12=')' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getCreatorAccess().getRightParenthesisKeyword_10());
    }
)
;





// Entry rule entryRuleUpdater
entryRuleUpdater returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUpdaterRule()); }
	 iv_ruleUpdater=ruleUpdater 
	 { $current=$iv_ruleUpdater.current; } 
	 EOF 
;

// Rule Updater
ruleUpdater returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getUpdaterAccess().getUpdaterAction_0(),
            $current);
    }
)	otherlv_1='Updater' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getUpdaterAccess().getUpdaterKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getUpdaterAccess().getLeftParenthesisKeyword_2());
    }
(
(
		lv_type_3_0=RULE_STRING
		{
			newLeafNode(lv_type_3_0, grammarAccess.getUpdaterAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUpdaterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"STRING");
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getUpdaterAccess().getCommaKeyword_4());
    }
(	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getUpdaterAccess().getLeftCurlyBracketKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_1_0()); 
	    }
		lv_features_6_0=ruleFeatureAssigner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUpdaterRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_6_0, 
        		"FeatureAssigner");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getUpdaterAccess().getCommaKeyword_5_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getUpdaterAccess().getFeaturesFeatureAssignerParserRuleCall_5_2_1_0()); 
	    }
		lv_features_8_0=ruleFeatureAssigner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUpdaterRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_8_0, 
        		"FeatureAssigner");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getUpdaterAccess().getRightCurlyBracketKeyword_5_3());
    }
)?	otherlv_10=')' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getUpdaterAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleFeatureAssigner
entryRuleFeatureAssigner returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureAssignerRule()); }
	 iv_ruleFeatureAssigner=ruleFeatureAssigner 
	 { $current=$iv_ruleFeatureAssigner.current; } 
	 EOF 
;

// Rule FeatureAssigner
ruleFeatureAssigner returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFeatureAssignerAccess().getFeatureAssignerAction_0(),
            $current);
    }
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFeatureAssignerAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		lv_feature_2_0=RULE_STRING
		{
			newLeafNode(lv_feature_2_0, grammarAccess.getFeatureAssignerAccess().getFeatureSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureAssignerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"feature",
        		lv_feature_2_0, 
        		"STRING");
	    }

)
)	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFeatureAssignerAccess().getCommaKeyword_3());
    }
(
(
		lv_value_4_0=RULE_STRING
		{
			newLeafNode(lv_value_4_0, grammarAccess.getFeatureAssignerAccess().getValueSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFeatureAssignerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"STRING");
	    }

)
)	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFeatureAssignerAccess().getRightSquareBracketKeyword_5());
    }
)
;





// Entry rule entryRuleDeclarer
entryRuleDeclarer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDeclarerRule()); }
	 iv_ruleDeclarer=ruleDeclarer 
	 { $current=$iv_ruleDeclarer.current; } 
	 EOF 
;

// Rule Declarer
ruleDeclarer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDeclarerAccess().getDeclarerAction_0(),
            $current);
    }
)	otherlv_1='Declarer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDeclarerAccess().getDeclarerKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDeclarerAccess().getLeftParenthesisKeyword_2());
    }
(
(
		lv_type_3_0=RULE_STRING
		{
			newLeafNode(lv_type_3_0, grammarAccess.getDeclarerAccess().getTypeSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"STRING");
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDeclarerAccess().getCommaKeyword_4());
    }
(
(
		lv_name_5_0=RULE_ID
		{
			newLeafNode(lv_name_5_0, grammarAccess.getDeclarerAccess().getNameIDTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDeclarerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"ID");
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDeclarerAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleAssigner
entryRuleAssigner returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssignerRule()); }
	 iv_ruleAssigner=ruleAssigner 
	 { $current=$iv_ruleAssigner.current; } 
	 EOF 
;

// Rule Assigner
ruleAssigner returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAssignerAccess().getAssignerAction_0(),
            $current);
    }
)	otherlv_1='Assigner' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAssignerAccess().getAssignerKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAssignerAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAssignerRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getAssignerAccess().getVarDeclarerCrossReference_3_0()); 
	}

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAssignerAccess().getCommaKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssignerAccess().getCreatorCreatorParserRuleCall_5_0()); 
	    }
		lv_creator_5_0=ruleCreator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssignerRule());
	        }
       		add(
       			$current, 
       			"creator",
        		lv_creator_5_0, 
        		"Creator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAssignerAccess().getRightParenthesisKeyword_6());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


