/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.statesml.serializer;

import at.ac.tuwien.big.statesml.StateSystem;
import at.ac.tuwien.big.statesml.StatesMLPackage;
import at.ac.tuwien.big.statesml.services.StateSystemGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class StateSystemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private StateSystemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == StatesMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case StatesMLPackage.STATE_SYSTEM:
				sequence_StateSystem(context, (StateSystem) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     StateSystem returns StateSystem
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StateSystem(ISerializationContext context, StateSystem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, StatesMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatesMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateSystemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}