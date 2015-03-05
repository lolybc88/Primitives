package example.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import example.language.Assigner;
import example.language.Composer;
import example.language.Creator;
import example.language.Declarer;
import example.language.FeatureAssigner;
import example.language.LanguagePackage;
import example.language.Updater;
import example.services.LanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LanguagePackage.ASSIGNER:
				if(context == grammarAccess.getAssignerRule() ||
				   context == grammarAccess.getMTLPrimitiveRule()) {
					sequence_Assigner(context, (Assigner) semanticObject); 
					return; 
				}
				else break;
			case LanguagePackage.COMPOSER:
				if(context == grammarAccess.getComposerRule() ||
				   context == grammarAccess.getMTLPrimitiveRule()) {
					sequence_Composer(context, (Composer) semanticObject); 
					return; 
				}
				else break;
			case LanguagePackage.CREATOR:
				if(context == grammarAccess.getCreatorRule() ||
				   context == grammarAccess.getMTLPrimitiveRule()) {
					sequence_Creator(context, (Creator) semanticObject); 
					return; 
				}
				else break;
			case LanguagePackage.DECLARER:
				if(context == grammarAccess.getDeclarerRule() ||
				   context == grammarAccess.getMTLPrimitiveRule()) {
					sequence_Declarer(context, (Declarer) semanticObject); 
					return; 
				}
				else break;
			case LanguagePackage.FEATURE_ASSIGNER:
				if(context == grammarAccess.getFeatureAssignerRule()) {
					sequence_FeatureAssigner(context, (FeatureAssigner) semanticObject); 
					return; 
				}
				else break;
			case LanguagePackage.UPDATER:
				if(context == grammarAccess.getMTLPrimitiveRule() ||
				   context == grammarAccess.getUpdaterRule()) {
					sequence_Updater(context, (Updater) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (var=[Declarer|ID] creator+=Creator)
	 */
	protected void sequence_Assigner(EObject context, Assigner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID primitives+=MTLPrimitive primitives+=MTLPrimitive*)
	 */
	protected void sequence_Composer(EObject context, Composer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING (features+=FeatureAssigner features+=FeatureAssigner*)* creatorName=ID)
	 */
	protected void sequence_Creator(EObject context, Creator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING name=ID)
	 */
	protected void sequence_Declarer(EObject context, Declarer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.DECLARER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.DECLARER__TYPE));
			if(transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.DECLARER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.DECLARER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclarerAccess().getTypeSTRINGTerminalRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDeclarerAccess().getNameIDTerminalRuleCall_5_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=STRING value=STRING)
	 */
	protected void sequence_FeatureAssigner(EObject context, FeatureAssigner semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.FEATURE_ASSIGNER__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.FEATURE_ASSIGNER__FEATURE));
			if(transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.FEATURE_ASSIGNER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.FEATURE_ASSIGNER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAssignerAccess().getFeatureSTRINGTerminalRuleCall_2_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getFeatureAssignerAccess().getValueSTRINGTerminalRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=STRING (features+=FeatureAssigner features+=FeatureAssigner*)?)
	 */
	protected void sequence_Updater(EObject context, Updater semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
