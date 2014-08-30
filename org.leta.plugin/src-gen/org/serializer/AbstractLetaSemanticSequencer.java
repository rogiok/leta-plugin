package org.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.leta.Complement;
import org.leta.Fact;
import org.leta.FactComposite;
import org.leta.FactExt;
import org.leta.Formula;
import org.leta.FormulaExpression;
import org.leta.FormulaItem;
import org.leta.Leta;
import org.leta.LetaPackage;
import org.leta.List;
import org.leta.MathOperator;
import org.leta.NotEqualOperator;
import org.leta.Quantifier;
import org.leta.RelationalOperator;
import org.leta.Set;
import org.leta.Term;
import org.leta.TermComposite;
import org.leta.TermInstance;
import org.leta.TermWithAssociation;
import org.leta.TestCase;
import org.leta.VerifyClause;
import org.leta.WhenClause;
import org.services.LetaGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractLetaSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected LetaGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LetaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LetaPackage.COMPLEMENT:
				if(context == grammarAccess.getComplementRule()) {
					sequence_Complement(context, (Complement) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FACT:
				if(context == grammarAccess.getFactRule()) {
					sequence_Fact(context, (Fact) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FACT_COMPOSITE:
				if(context == grammarAccess.getFactCompositeRule()) {
					sequence_FactComposite(context, (FactComposite) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FACT_EXT:
				if(context == grammarAccess.getFactExtRule()) {
					sequence_FactExt(context, (FactExt) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FORMULA:
				if(context == grammarAccess.getFormulaRule()) {
					sequence_Formula(context, (Formula) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FORMULA_EXPRESSION:
				if(context == grammarAccess.getFormulaExpressionRule()) {
					sequence_FormulaExpression(context, (FormulaExpression) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.FORMULA_ITEM:
				if(context == grammarAccess.getFormulaItemRule()) {
					sequence_FormulaItem(context, (FormulaItem) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.LETA:
				if(context == grammarAccess.getLetaRule()) {
					sequence_Leta(context, (Leta) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.MATH_OPERATOR:
				if(context == grammarAccess.getMathOperatorRule()) {
					sequence_MathOperator(context, (MathOperator) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.NOT_EQUAL_OPERATOR:
				if(context == grammarAccess.getNotEqualOperatorRule()) {
					sequence_NotEqualOperator(context, (NotEqualOperator) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.QUANTIFIER:
				if(context == grammarAccess.getQuantifierRule()) {
					sequence_Quantifier(context, (Quantifier) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.RELATIONAL_OPERATOR:
				if(context == grammarAccess.getRelationalOperatorRule()) {
					sequence_RelationalOperator(context, (RelationalOperator) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.SET:
				if(context == grammarAccess.getSetClauseRule()) {
					sequence_SetClause(context, (Set) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSetRule()) {
					sequence_Set(context, (Set) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.TERM_COMPOSITE:
				if(context == grammarAccess.getTermCompositeRule()) {
					sequence_TermComposite(context, (TermComposite) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.TERM_INSTANCE:
				if(context == grammarAccess.getTermInstanceRule()) {
					sequence_TermInstance(context, (TermInstance) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.TERM_WITH_ASSOCIATION:
				if(context == grammarAccess.getTermWithAssociationRule()) {
					sequence_TermWithAssociation(context, (TermWithAssociation) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.TEST_CASE:
				if(context == grammarAccess.getTestCaseRule()) {
					sequence_TestCase(context, (TestCase) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.VERIFY_CLAUSE:
				if(context == grammarAccess.getVerifyClauseRule()) {
					sequence_VerifyClause(context, (VerifyClause) semanticObject); 
					return; 
				}
				else break;
			case LetaPackage.WHEN_CLAUSE:
				if(context == grammarAccess.getWhenClauseRule()) {
					sequence_WhenClause(context, (WhenClause) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Complement(EObject context, Complement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.COMPLEMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.COMPLEMENT__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((f=Fact | fo=Formula) (op=LogicalOperator fc=FactComposite)?) | (fc1=FactComposite (op=LogicalOperator fc2=FactComposite)?))
	 */
	protected void sequence_FactComposite(EObject context, FactComposite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (complement=Complement (termComposite=TermComposite factExt=FactExt?)?)
	 */
	protected void sequence_FactExt(EObject context, FactExt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (termComposite=TermComposite complement=Complement (termComposite2=TermComposite factExt=FactExt?)?)
	 */
	protected void sequence_Fact(EObject context, Fact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((fi=FormulaItem (mo=MathOperator fe=FormulaExpression)?) | (fe1=FormulaExpression (mo=MathOperator fe2=FormulaExpression)?))
	 */
	protected void sequence_FormulaExpression(EObject context, FormulaExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t=Term | ti=TermInstance | twa=TermWithAssociation)
	 */
	protected void sequence_FormulaItem(EObject context, FormulaItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fi=FormulaItem fe=FormulaExpression)
	 */
	protected void sequence_Formula(EObject context, Formula semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.FORMULA__FI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.FORMULA__FI));
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.FORMULA__FE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.FORMULA__FE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormulaAccess().getFiFormulaItemParserRuleCall_0_0(), semanticObject.getFi());
		feeder.accept(grammarAccess.getFormulaAccess().getFeFormulaExpressionParserRuleCall_2_0(), semanticObject.getFe());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (tp=TestPackage? tc+=TestCase+)
	 */
	protected void sequence_Leta(EObject context, Leta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sl=StringLiteral | ol=OtherLiteral) l=List?)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         sum='+' | 
	 *         subtract='-' | 
	 *         divide='/' | 
	 *         multiply='*' | 
	 *         r='%' | 
	 *         p='**'
	 *     )
	 */
	protected void sequence_MathOperator(EObject context, MathOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ne='!='
	 */
	protected void sequence_NotEqualOperator(EObject context, NotEqualOperator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.NOT_EQUAL_OPERATOR__NE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.NOT_EQUAL_OPERATOR__NE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNotEqualOperatorAccess().getNeExclamationMarkEqualsSignKeyword_0(), semanticObject.getNe());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (v=INT | v=INT | v=INT | (v1=INT v2=INT))
	 */
	protected void sequence_Quantifier(EObject context, Quantifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (o='>' | o='<' | o='>=' | o='<=' | neo=NotEqualOperator)
	 */
	protected void sequence_RelationalOperator(EObject context, RelationalOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (s=Set?)
	 */
	protected void sequence_SetClause(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (l=List s=Set?)
	 */
	protected void sequence_Set(EObject context, Set semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (quantifier=Quantifier? (term=Term | termInstance=TermInstance | termWithAssociation=TermWithAssociation))
	 */
	protected void sequence_TermComposite(EObject context, TermComposite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (term=Term notEqualOperator=NotEqualOperator? stringLiteral=StringLiteral) | 
	 *         (term=Term relationalOperator=RelationalOperator? otherLiteral=OtherLiteral)
	 *     )
	 */
	protected void sequence_TermInstance(EObject context, TermInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (t=Term ro=RelationalOperator? index=INT)
	 */
	protected void sequence_TermWithAssociation(EObject context, TermWithAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.TERM__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.TERM__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getIdIDTerminalRuleCall_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID v=VerifyClause w=WhenClause s=SetClause?)
	 */
	protected void sequence_TestCase(EObject context, TestCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fc=FactComposite
	 */
	protected void sequence_VerifyClause(EObject context, VerifyClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.VERIFY_CLAUSE__FC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.VERIFY_CLAUSE__FC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVerifyClauseAccess().getFcFactCompositeParserRuleCall_1_0(), semanticObject.getFc());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fc=FactComposite
	 */
	protected void sequence_WhenClause(EObject context, WhenClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LetaPackage.Literals.WHEN_CLAUSE__FC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LetaPackage.Literals.WHEN_CLAUSE__FC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhenClauseAccess().getFcFactCompositeParserRuleCall_1_0(), semanticObject.getFc());
		feeder.finish();
	}
}
