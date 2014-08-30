/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.leta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LetaFactoryImpl extends EFactoryImpl implements LetaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LetaFactory init()
  {
    try
    {
      LetaFactory theLetaFactory = (LetaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.Leta.org"); 
      if (theLetaFactory != null)
      {
        return theLetaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LetaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LetaPackage.LETA: return createLeta();
      case LetaPackage.TEST_CASE: return createTestCase();
      case LetaPackage.VERIFY_CLAUSE: return createVerifyClause();
      case LetaPackage.WHEN_CLAUSE: return createWhenClause();
      case LetaPackage.SET_CLAUSE: return createSetClause();
      case LetaPackage.FACT_COMPOSITE: return createFactComposite();
      case LetaPackage.FACT: return createFact();
      case LetaPackage.FACT_EXT: return createFactExt();
      case LetaPackage.TERM_COMPOSITE: return createTermComposite();
      case LetaPackage.TERM: return createTerm();
      case LetaPackage.TERM_INSTANCE: return createTermInstance();
      case LetaPackage.TERM_WITH_ASSOCIATION: return createTermWithAssociation();
      case LetaPackage.QUANTIFIER: return createQuantifier();
      case LetaPackage.COMPLEMENT: return createComplement();
      case LetaPackage.FORMULA: return createFormula();
      case LetaPackage.FORMULA_EXPRESSION: return createFormulaExpression();
      case LetaPackage.FORMULA_ITEM: return createFormulaItem();
      case LetaPackage.MATH_OPERATOR: return createMathOperator();
      case LetaPackage.RELATIONAL_OPERATOR: return createRelationalOperator();
      case LetaPackage.NOT_EQUAL_OPERATOR: return createNotEqualOperator();
      case LetaPackage.SET: return createSet();
      case LetaPackage.LIST: return createList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Leta createLeta()
  {
    LetaImpl leta = new LetaImpl();
    return leta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestCase createTestCase()
  {
    TestCaseImpl testCase = new TestCaseImpl();
    return testCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerifyClause createVerifyClause()
  {
    VerifyClauseImpl verifyClause = new VerifyClauseImpl();
    return verifyClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenClause createWhenClause()
  {
    WhenClauseImpl whenClause = new WhenClauseImpl();
    return whenClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetClause createSetClause()
  {
    SetClauseImpl setClause = new SetClauseImpl();
    return setClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactComposite createFactComposite()
  {
    FactCompositeImpl factComposite = new FactCompositeImpl();
    return factComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact createFact()
  {
    FactImpl fact = new FactImpl();
    return fact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactExt createFactExt()
  {
    FactExtImpl factExt = new FactExtImpl();
    return factExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermComposite createTermComposite()
  {
    TermCompositeImpl termComposite = new TermCompositeImpl();
    return termComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermInstance createTermInstance()
  {
    TermInstanceImpl termInstance = new TermInstanceImpl();
    return termInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermWithAssociation createTermWithAssociation()
  {
    TermWithAssociationImpl termWithAssociation = new TermWithAssociationImpl();
    return termWithAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier createQuantifier()
  {
    QuantifierImpl quantifier = new QuantifierImpl();
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Complement createComplement()
  {
    ComplementImpl complement = new ComplementImpl();
    return complement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formula createFormula()
  {
    FormulaImpl formula = new FormulaImpl();
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaExpression createFormulaExpression()
  {
    FormulaExpressionImpl formulaExpression = new FormulaExpressionImpl();
    return formulaExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaItem createFormulaItem()
  {
    FormulaItemImpl formulaItem = new FormulaItemImpl();
    return formulaItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathOperator createMathOperator()
  {
    MathOperatorImpl mathOperator = new MathOperatorImpl();
    return mathOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOperator createRelationalOperator()
  {
    RelationalOperatorImpl relationalOperator = new RelationalOperatorImpl();
    return relationalOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotEqualOperator createNotEqualOperator()
  {
    NotEqualOperatorImpl notEqualOperator = new NotEqualOperatorImpl();
    return notEqualOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set createSet()
  {
    SetImpl set = new SetImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetaPackage getLetaPackage()
  {
    return (LetaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LetaPackage getPackage()
  {
    return LetaPackage.eINSTANCE;
  }

} //LetaFactoryImpl
