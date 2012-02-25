/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.leta.LetaFactory
 * @model kind="package"
 * @generated
 */
public interface LetaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "leta";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Leta.org";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "leta";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LetaPackage eINSTANCE = org.leta.impl.LetaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.leta.impl.LetaImpl <em>Leta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.LetaImpl
   * @see org.leta.impl.LetaPackageImpl#getLeta()
   * @generated
   */
  int LETA = 0;

  /**
   * The feature id for the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LETA__TP = 0;

  /**
   * The feature id for the '<em><b>Tc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LETA__TC = 1;

  /**
   * The number of structural features of the '<em>Leta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LETA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.leta.impl.TestCaseImpl <em>Test Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.TestCaseImpl
   * @see org.leta.impl.LetaPackageImpl#getTestCase()
   * @generated
   */
  int TEST_CASE = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__ID = 0;

  /**
   * The feature id for the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__V = 1;

  /**
   * The feature id for the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__W = 2;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE__S = 3;

  /**
   * The number of structural features of the '<em>Test Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.leta.impl.VerifyClauseImpl <em>Verify Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.VerifyClauseImpl
   * @see org.leta.impl.LetaPackageImpl#getVerifyClause()
   * @generated
   */
  int VERIFY_CLAUSE = 2;

  /**
   * The feature id for the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_CLAUSE__FC = 0;

  /**
   * The number of structural features of the '<em>Verify Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFY_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.leta.impl.WhenClauseImpl <em>When Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.WhenClauseImpl
   * @see org.leta.impl.LetaPackageImpl#getWhenClause()
   * @generated
   */
  int WHEN_CLAUSE = 3;

  /**
   * The feature id for the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSE__FC = 0;

  /**
   * The number of structural features of the '<em>When Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.leta.impl.SetClauseImpl <em>Set Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.SetClauseImpl
   * @see org.leta.impl.LetaPackageImpl#getSetClause()
   * @generated
   */
  int SET_CLAUSE = 4;

  /**
   * The number of structural features of the '<em>Set Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.leta.impl.factCompositeImpl <em>fact Composite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.factCompositeImpl
   * @see org.leta.impl.LetaPackageImpl#getfactComposite()
   * @generated
   */
  int FACT_COMPOSITE = 5;

  /**
   * The feature id for the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__F = 0;

  /**
   * The feature id for the '<em><b>Fo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__FO = 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__OP = 2;

  /**
   * The feature id for the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__FC = 3;

  /**
   * The feature id for the '<em><b>Fc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__FC1 = 4;

  /**
   * The feature id for the '<em><b>Fc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE__FC2 = 5;

  /**
   * The number of structural features of the '<em>fact Composite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_COMPOSITE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.leta.impl.FactImpl <em>Fact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.FactImpl
   * @see org.leta.impl.LetaPackageImpl#getFact()
   * @generated
   */
  int FACT = 6;

  /**
   * The feature id for the '<em><b>Term Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__TERM_COMPOSITE = 0;

  /**
   * The feature id for the '<em><b>Complement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__COMPLEMENT = 1;

  /**
   * The feature id for the '<em><b>Term Composite2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__TERM_COMPOSITE2 = 2;

  /**
   * The feature id for the '<em><b>Fact Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT__FACT_EXT = 3;

  /**
   * The number of structural features of the '<em>Fact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.leta.impl.FactExtImpl <em>Fact Ext</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.FactExtImpl
   * @see org.leta.impl.LetaPackageImpl#getFactExt()
   * @generated
   */
  int FACT_EXT = 7;

  /**
   * The feature id for the '<em><b>Complement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_EXT__COMPLEMENT = 0;

  /**
   * The feature id for the '<em><b>Term Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_EXT__TERM_COMPOSITE = 1;

  /**
   * The feature id for the '<em><b>Fact Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_EXT__FACT_EXT = 2;

  /**
   * The number of structural features of the '<em>Fact Ext</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACT_EXT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.leta.impl.TermCompositeImpl <em>Term Composite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.TermCompositeImpl
   * @see org.leta.impl.LetaPackageImpl#getTermComposite()
   * @generated
   */
  int TERM_COMPOSITE = 8;

  /**
   * The feature id for the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_COMPOSITE__QUANTIFIER = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_COMPOSITE__TERM = 1;

  /**
   * The feature id for the '<em><b>Term Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_COMPOSITE__TERM_INSTANCE = 2;

  /**
   * The feature id for the '<em><b>Term With Association</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_COMPOSITE__TERM_WITH_ASSOCIATION = 3;

  /**
   * The number of structural features of the '<em>Term Composite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_COMPOSITE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.leta.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.TermImpl
   * @see org.leta.impl.LetaPackageImpl#getTerm()
   * @generated
   */
  int TERM = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__ID = 0;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.leta.impl.TermInstanceImpl <em>Term Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.TermInstanceImpl
   * @see org.leta.impl.LetaPackageImpl#getTermInstance()
   * @generated
   */
  int TERM_INSTANCE = 10;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE__TERM = 0;

  /**
   * The feature id for the '<em><b>Not Equal Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE__NOT_EQUAL_OPERATOR = 1;

  /**
   * The feature id for the '<em><b>String Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE__STRING_LITERAL = 2;

  /**
   * The feature id for the '<em><b>Relational Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE__RELATIONAL_OPERATOR = 3;

  /**
   * The feature id for the '<em><b>Other Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE__OTHER_LITERAL = 4;

  /**
   * The number of structural features of the '<em>Term Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_INSTANCE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.leta.impl.TermWithAssociationImpl <em>Term With Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.TermWithAssociationImpl
   * @see org.leta.impl.LetaPackageImpl#getTermWithAssociation()
   * @generated
   */
  int TERM_WITH_ASSOCIATION = 11;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_WITH_ASSOCIATION__T = 0;

  /**
   * The feature id for the '<em><b>Ro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_WITH_ASSOCIATION__RO = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_WITH_ASSOCIATION__INDEX = 2;

  /**
   * The number of structural features of the '<em>Term With Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_WITH_ASSOCIATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.leta.impl.QuantifierImpl <em>Quantifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.QuantifierImpl
   * @see org.leta.impl.LetaPackageImpl#getQuantifier()
   * @generated
   */
  int QUANTIFIER = 12;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__V = 0;

  /**
   * The feature id for the '<em><b>V1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__V1 = 1;

  /**
   * The feature id for the '<em><b>V2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER__V2 = 2;

  /**
   * The number of structural features of the '<em>Quantifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUANTIFIER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.leta.impl.ComplementImpl <em>Complement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.ComplementImpl
   * @see org.leta.impl.LetaPackageImpl#getComplement()
   * @generated
   */
  int COMPLEMENT = 13;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEMENT__ID = 0;

  /**
   * The number of structural features of the '<em>Complement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.leta.impl.FormulaImpl <em>Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.FormulaImpl
   * @see org.leta.impl.LetaPackageImpl#getFormula()
   * @generated
   */
  int FORMULA = 14;

  /**
   * The feature id for the '<em><b>Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__FI = 0;

  /**
   * The feature id for the '<em><b>Fe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__FE = 1;

  /**
   * The number of structural features of the '<em>Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.leta.impl.FormulaExpressionImpl <em>Formula Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.FormulaExpressionImpl
   * @see org.leta.impl.LetaPackageImpl#getFormulaExpression()
   * @generated
   */
  int FORMULA_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION__FI = 0;

  /**
   * The feature id for the '<em><b>Mo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION__MO = 1;

  /**
   * The feature id for the '<em><b>Fe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION__FE = 2;

  /**
   * The feature id for the '<em><b>Fe1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION__FE1 = 3;

  /**
   * The feature id for the '<em><b>Fe2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION__FE2 = 4;

  /**
   * The number of structural features of the '<em>Formula Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.leta.impl.FormulaItemImpl <em>Formula Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.FormulaItemImpl
   * @see org.leta.impl.LetaPackageImpl#getFormulaItem()
   * @generated
   */
  int FORMULA_ITEM = 16;

  /**
   * The feature id for the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_ITEM__T = 0;

  /**
   * The feature id for the '<em><b>Ti</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_ITEM__TI = 1;

  /**
   * The feature id for the '<em><b>Twa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_ITEM__TWA = 2;

  /**
   * The number of structural features of the '<em>Formula Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.leta.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.RelationalOperatorImpl
   * @see org.leta.impl.LetaPackageImpl#getRelationalOperator()
   * @generated
   */
  int RELATIONAL_OPERATOR = 17;

  /**
   * The feature id for the '<em><b>O</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OPERATOR__O = 0;

  /**
   * The feature id for the '<em><b>Neo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OPERATOR__NEO = 1;

  /**
   * The number of structural features of the '<em>Relational Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.leta.impl.SetImpl <em>Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.SetImpl
   * @see org.leta.impl.LetaPackageImpl#getSet()
   * @generated
   */
  int SET = 18;

  /**
   * The feature id for the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__S = SET_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET__L = SET_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_FEATURE_COUNT = SET_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.leta.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.leta.impl.ListImpl
   * @see org.leta.impl.LetaPackageImpl#getList()
   * @generated
   */
  int LIST = 19;

  /**
   * The feature id for the '<em><b>Sl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__SL = 0;

  /**
   * The feature id for the '<em><b>Ol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__OL = 1;

  /**
   * The feature id for the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__L = 2;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.leta.Leta <em>Leta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leta</em>'.
   * @see org.leta.Leta
   * @generated
   */
  EClass getLeta();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Leta#getTp <em>Tp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tp</em>'.
   * @see org.leta.Leta#getTp()
   * @see #getLeta()
   * @generated
   */
  EAttribute getLeta_Tp();

  /**
   * Returns the meta object for the containment reference list '{@link org.leta.Leta#getTc <em>Tc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tc</em>'.
   * @see org.leta.Leta#getTc()
   * @see #getLeta()
   * @generated
   */
  EReference getLeta_Tc();

  /**
   * Returns the meta object for class '{@link org.leta.TestCase <em>Test Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Case</em>'.
   * @see org.leta.TestCase
   * @generated
   */
  EClass getTestCase();

  /**
   * Returns the meta object for the attribute '{@link org.leta.TestCase#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.leta.TestCase#getId()
   * @see #getTestCase()
   * @generated
   */
  EAttribute getTestCase_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TestCase#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V</em>'.
   * @see org.leta.TestCase#getV()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_V();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TestCase#getW <em>W</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>W</em>'.
   * @see org.leta.TestCase#getW()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_W();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TestCase#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.leta.TestCase#getS()
   * @see #getTestCase()
   * @generated
   */
  EReference getTestCase_S();

  /**
   * Returns the meta object for class '{@link org.leta.VerifyClause <em>Verify Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verify Clause</em>'.
   * @see org.leta.VerifyClause
   * @generated
   */
  EClass getVerifyClause();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.VerifyClause#getFc <em>Fc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc</em>'.
   * @see org.leta.VerifyClause#getFc()
   * @see #getVerifyClause()
   * @generated
   */
  EReference getVerifyClause_Fc();

  /**
   * Returns the meta object for class '{@link org.leta.WhenClause <em>When Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Clause</em>'.
   * @see org.leta.WhenClause
   * @generated
   */
  EClass getWhenClause();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.WhenClause#getFc <em>Fc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc</em>'.
   * @see org.leta.WhenClause#getFc()
   * @see #getWhenClause()
   * @generated
   */
  EReference getWhenClause_Fc();

  /**
   * Returns the meta object for class '{@link org.leta.SetClause <em>Set Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Clause</em>'.
   * @see org.leta.SetClause
   * @generated
   */
  EClass getSetClause();

  /**
   * Returns the meta object for class '{@link org.leta.factComposite <em>fact Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fact Composite</em>'.
   * @see org.leta.factComposite
   * @generated
   */
  EClass getfactComposite();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.factComposite#getF <em>F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>F</em>'.
   * @see org.leta.factComposite#getF()
   * @see #getfactComposite()
   * @generated
   */
  EReference getfactComposite_F();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.factComposite#getFo <em>Fo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fo</em>'.
   * @see org.leta.factComposite#getFo()
   * @see #getfactComposite()
   * @generated
   */
  EReference getfactComposite_Fo();

  /**
   * Returns the meta object for the attribute '{@link org.leta.factComposite#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.leta.factComposite#getOp()
   * @see #getfactComposite()
   * @generated
   */
  EAttribute getfactComposite_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.factComposite#getFc <em>Fc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc</em>'.
   * @see org.leta.factComposite#getFc()
   * @see #getfactComposite()
   * @generated
   */
  EReference getfactComposite_Fc();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.factComposite#getFc1 <em>Fc1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc1</em>'.
   * @see org.leta.factComposite#getFc1()
   * @see #getfactComposite()
   * @generated
   */
  EReference getfactComposite_Fc1();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.factComposite#getFc2 <em>Fc2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fc2</em>'.
   * @see org.leta.factComposite#getFc2()
   * @see #getfactComposite()
   * @generated
   */
  EReference getfactComposite_Fc2();

  /**
   * Returns the meta object for class '{@link org.leta.Fact <em>Fact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact</em>'.
   * @see org.leta.Fact
   * @generated
   */
  EClass getFact();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Fact#getTermComposite <em>Term Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term Composite</em>'.
   * @see org.leta.Fact#getTermComposite()
   * @see #getFact()
   * @generated
   */
  EReference getFact_TermComposite();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Fact#getComplement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complement</em>'.
   * @see org.leta.Fact#getComplement()
   * @see #getFact()
   * @generated
   */
  EReference getFact_Complement();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Fact#getTermComposite2 <em>Term Composite2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term Composite2</em>'.
   * @see org.leta.Fact#getTermComposite2()
   * @see #getFact()
   * @generated
   */
  EReference getFact_TermComposite2();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Fact#getFactExt <em>Fact Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fact Ext</em>'.
   * @see org.leta.Fact#getFactExt()
   * @see #getFact()
   * @generated
   */
  EReference getFact_FactExt();

  /**
   * Returns the meta object for class '{@link org.leta.FactExt <em>Fact Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fact Ext</em>'.
   * @see org.leta.FactExt
   * @generated
   */
  EClass getFactExt();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FactExt#getComplement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Complement</em>'.
   * @see org.leta.FactExt#getComplement()
   * @see #getFactExt()
   * @generated
   */
  EReference getFactExt_Complement();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FactExt#getTermComposite <em>Term Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term Composite</em>'.
   * @see org.leta.FactExt#getTermComposite()
   * @see #getFactExt()
   * @generated
   */
  EReference getFactExt_TermComposite();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FactExt#getFactExt <em>Fact Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fact Ext</em>'.
   * @see org.leta.FactExt#getFactExt()
   * @see #getFactExt()
   * @generated
   */
  EReference getFactExt_FactExt();

  /**
   * Returns the meta object for class '{@link org.leta.TermComposite <em>Term Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Composite</em>'.
   * @see org.leta.TermComposite
   * @generated
   */
  EClass getTermComposite();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermComposite#getQuantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Quantifier</em>'.
   * @see org.leta.TermComposite#getQuantifier()
   * @see #getTermComposite()
   * @generated
   */
  EReference getTermComposite_Quantifier();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermComposite#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.leta.TermComposite#getTerm()
   * @see #getTermComposite()
   * @generated
   */
  EReference getTermComposite_Term();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermComposite#getTermInstance <em>Term Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term Instance</em>'.
   * @see org.leta.TermComposite#getTermInstance()
   * @see #getTermComposite()
   * @generated
   */
  EReference getTermComposite_TermInstance();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermComposite#getTermWithAssociation <em>Term With Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term With Association</em>'.
   * @see org.leta.TermComposite#getTermWithAssociation()
   * @see #getTermComposite()
   * @generated
   */
  EReference getTermComposite_TermWithAssociation();

  /**
   * Returns the meta object for class '{@link org.leta.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.leta.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Term#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.leta.Term#getId()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Id();

  /**
   * Returns the meta object for class '{@link org.leta.TermInstance <em>Term Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Instance</em>'.
   * @see org.leta.TermInstance
   * @generated
   */
  EClass getTermInstance();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermInstance#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.leta.TermInstance#getTerm()
   * @see #getTermInstance()
   * @generated
   */
  EReference getTermInstance_Term();

  /**
   * Returns the meta object for the attribute '{@link org.leta.TermInstance#getNotEqualOperator <em>Not Equal Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not Equal Operator</em>'.
   * @see org.leta.TermInstance#getNotEqualOperator()
   * @see #getTermInstance()
   * @generated
   */
  EAttribute getTermInstance_NotEqualOperator();

  /**
   * Returns the meta object for the attribute '{@link org.leta.TermInstance#getStringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Literal</em>'.
   * @see org.leta.TermInstance#getStringLiteral()
   * @see #getTermInstance()
   * @generated
   */
  EAttribute getTermInstance_StringLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermInstance#getRelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relational Operator</em>'.
   * @see org.leta.TermInstance#getRelationalOperator()
   * @see #getTermInstance()
   * @generated
   */
  EReference getTermInstance_RelationalOperator();

  /**
   * Returns the meta object for the attribute '{@link org.leta.TermInstance#getOtherLiteral <em>Other Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Other Literal</em>'.
   * @see org.leta.TermInstance#getOtherLiteral()
   * @see #getTermInstance()
   * @generated
   */
  EAttribute getTermInstance_OtherLiteral();

  /**
   * Returns the meta object for class '{@link org.leta.TermWithAssociation <em>Term With Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term With Association</em>'.
   * @see org.leta.TermWithAssociation
   * @generated
   */
  EClass getTermWithAssociation();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermWithAssociation#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.leta.TermWithAssociation#getT()
   * @see #getTermWithAssociation()
   * @generated
   */
  EReference getTermWithAssociation_T();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.TermWithAssociation#getRo <em>Ro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ro</em>'.
   * @see org.leta.TermWithAssociation#getRo()
   * @see #getTermWithAssociation()
   * @generated
   */
  EReference getTermWithAssociation_Ro();

  /**
   * Returns the meta object for the attribute '{@link org.leta.TermWithAssociation#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see org.leta.TermWithAssociation#getIndex()
   * @see #getTermWithAssociation()
   * @generated
   */
  EAttribute getTermWithAssociation_Index();

  /**
   * Returns the meta object for class '{@link org.leta.Quantifier <em>Quantifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quantifier</em>'.
   * @see org.leta.Quantifier
   * @generated
   */
  EClass getQuantifier();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Quantifier#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see org.leta.Quantifier#getV()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_V();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Quantifier#getV1 <em>V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V1</em>'.
   * @see org.leta.Quantifier#getV1()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_V1();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Quantifier#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V2</em>'.
   * @see org.leta.Quantifier#getV2()
   * @see #getQuantifier()
   * @generated
   */
  EAttribute getQuantifier_V2();

  /**
   * Returns the meta object for class '{@link org.leta.Complement <em>Complement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complement</em>'.
   * @see org.leta.Complement
   * @generated
   */
  EClass getComplement();

  /**
   * Returns the meta object for the attribute '{@link org.leta.Complement#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.leta.Complement#getId()
   * @see #getComplement()
   * @generated
   */
  EAttribute getComplement_Id();

  /**
   * Returns the meta object for class '{@link org.leta.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula</em>'.
   * @see org.leta.Formula
   * @generated
   */
  EClass getFormula();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Formula#getFi <em>Fi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fi</em>'.
   * @see org.leta.Formula#getFi()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Fi();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Formula#getFe <em>Fe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fe</em>'.
   * @see org.leta.Formula#getFe()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Fe();

  /**
   * Returns the meta object for class '{@link org.leta.FormulaExpression <em>Formula Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula Expression</em>'.
   * @see org.leta.FormulaExpression
   * @generated
   */
  EClass getFormulaExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaExpression#getFi <em>Fi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fi</em>'.
   * @see org.leta.FormulaExpression#getFi()
   * @see #getFormulaExpression()
   * @generated
   */
  EReference getFormulaExpression_Fi();

  /**
   * Returns the meta object for the attribute '{@link org.leta.FormulaExpression#getMo <em>Mo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mo</em>'.
   * @see org.leta.FormulaExpression#getMo()
   * @see #getFormulaExpression()
   * @generated
   */
  EAttribute getFormulaExpression_Mo();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaExpression#getFe <em>Fe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fe</em>'.
   * @see org.leta.FormulaExpression#getFe()
   * @see #getFormulaExpression()
   * @generated
   */
  EReference getFormulaExpression_Fe();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaExpression#getFe1 <em>Fe1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fe1</em>'.
   * @see org.leta.FormulaExpression#getFe1()
   * @see #getFormulaExpression()
   * @generated
   */
  EReference getFormulaExpression_Fe1();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaExpression#getFe2 <em>Fe2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fe2</em>'.
   * @see org.leta.FormulaExpression#getFe2()
   * @see #getFormulaExpression()
   * @generated
   */
  EReference getFormulaExpression_Fe2();

  /**
   * Returns the meta object for class '{@link org.leta.FormulaItem <em>Formula Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula Item</em>'.
   * @see org.leta.FormulaItem
   * @generated
   */
  EClass getFormulaItem();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaItem#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>T</em>'.
   * @see org.leta.FormulaItem#getT()
   * @see #getFormulaItem()
   * @generated
   */
  EReference getFormulaItem_T();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaItem#getTi <em>Ti</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ti</em>'.
   * @see org.leta.FormulaItem#getTi()
   * @see #getFormulaItem()
   * @generated
   */
  EReference getFormulaItem_Ti();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.FormulaItem#getTwa <em>Twa</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Twa</em>'.
   * @see org.leta.FormulaItem#getTwa()
   * @see #getFormulaItem()
   * @generated
   */
  EReference getFormulaItem_Twa();

  /**
   * Returns the meta object for class '{@link org.leta.RelationalOperator <em>Relational Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Operator</em>'.
   * @see org.leta.RelationalOperator
   * @generated
   */
  EClass getRelationalOperator();

  /**
   * Returns the meta object for the attribute '{@link org.leta.RelationalOperator#getO <em>O</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>O</em>'.
   * @see org.leta.RelationalOperator#getO()
   * @see #getRelationalOperator()
   * @generated
   */
  EAttribute getRelationalOperator_O();

  /**
   * Returns the meta object for the attribute '{@link org.leta.RelationalOperator#getNeo <em>Neo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neo</em>'.
   * @see org.leta.RelationalOperator#getNeo()
   * @see #getRelationalOperator()
   * @generated
   */
  EAttribute getRelationalOperator_Neo();

  /**
   * Returns the meta object for class '{@link org.leta.Set <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set</em>'.
   * @see org.leta.Set
   * @generated
   */
  EClass getSet();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Set#getS <em>S</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>S</em>'.
   * @see org.leta.Set#getS()
   * @see #getSet()
   * @generated
   */
  EReference getSet_S();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.Set#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.leta.Set#getL()
   * @see #getSet()
   * @generated
   */
  EReference getSet_L();

  /**
   * Returns the meta object for class '{@link org.leta.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see org.leta.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the attribute '{@link org.leta.List#getSl <em>Sl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sl</em>'.
   * @see org.leta.List#getSl()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Sl();

  /**
   * Returns the meta object for the attribute '{@link org.leta.List#getOl <em>Ol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ol</em>'.
   * @see org.leta.List#getOl()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Ol();

  /**
   * Returns the meta object for the containment reference '{@link org.leta.List#getL <em>L</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>L</em>'.
   * @see org.leta.List#getL()
   * @see #getList()
   * @generated
   */
  EReference getList_L();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LetaFactory getLetaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.leta.impl.LetaImpl <em>Leta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.LetaImpl
     * @see org.leta.impl.LetaPackageImpl#getLeta()
     * @generated
     */
    EClass LETA = eINSTANCE.getLeta();

    /**
     * The meta object literal for the '<em><b>Tp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LETA__TP = eINSTANCE.getLeta_Tp();

    /**
     * The meta object literal for the '<em><b>Tc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LETA__TC = eINSTANCE.getLeta_Tc();

    /**
     * The meta object literal for the '{@link org.leta.impl.TestCaseImpl <em>Test Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.TestCaseImpl
     * @see org.leta.impl.LetaPackageImpl#getTestCase()
     * @generated
     */
    EClass TEST_CASE = eINSTANCE.getTestCase();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_CASE__ID = eINSTANCE.getTestCase_Id();

    /**
     * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__V = eINSTANCE.getTestCase_V();

    /**
     * The meta object literal for the '<em><b>W</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__W = eINSTANCE.getTestCase_W();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE__S = eINSTANCE.getTestCase_S();

    /**
     * The meta object literal for the '{@link org.leta.impl.VerifyClauseImpl <em>Verify Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.VerifyClauseImpl
     * @see org.leta.impl.LetaPackageImpl#getVerifyClause()
     * @generated
     */
    EClass VERIFY_CLAUSE = eINSTANCE.getVerifyClause();

    /**
     * The meta object literal for the '<em><b>Fc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFY_CLAUSE__FC = eINSTANCE.getVerifyClause_Fc();

    /**
     * The meta object literal for the '{@link org.leta.impl.WhenClauseImpl <em>When Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.WhenClauseImpl
     * @see org.leta.impl.LetaPackageImpl#getWhenClause()
     * @generated
     */
    EClass WHEN_CLAUSE = eINSTANCE.getWhenClause();

    /**
     * The meta object literal for the '<em><b>Fc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHEN_CLAUSE__FC = eINSTANCE.getWhenClause_Fc();

    /**
     * The meta object literal for the '{@link org.leta.impl.SetClauseImpl <em>Set Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.SetClauseImpl
     * @see org.leta.impl.LetaPackageImpl#getSetClause()
     * @generated
     */
    EClass SET_CLAUSE = eINSTANCE.getSetClause();

    /**
     * The meta object literal for the '{@link org.leta.impl.factCompositeImpl <em>fact Composite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.factCompositeImpl
     * @see org.leta.impl.LetaPackageImpl#getfactComposite()
     * @generated
     */
    EClass FACT_COMPOSITE = eINSTANCE.getfactComposite();

    /**
     * The meta object literal for the '<em><b>F</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_COMPOSITE__F = eINSTANCE.getfactComposite_F();

    /**
     * The meta object literal for the '<em><b>Fo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_COMPOSITE__FO = eINSTANCE.getfactComposite_Fo();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACT_COMPOSITE__OP = eINSTANCE.getfactComposite_Op();

    /**
     * The meta object literal for the '<em><b>Fc</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_COMPOSITE__FC = eINSTANCE.getfactComposite_Fc();

    /**
     * The meta object literal for the '<em><b>Fc1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_COMPOSITE__FC1 = eINSTANCE.getfactComposite_Fc1();

    /**
     * The meta object literal for the '<em><b>Fc2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_COMPOSITE__FC2 = eINSTANCE.getfactComposite_Fc2();

    /**
     * The meta object literal for the '{@link org.leta.impl.FactImpl <em>Fact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.FactImpl
     * @see org.leta.impl.LetaPackageImpl#getFact()
     * @generated
     */
    EClass FACT = eINSTANCE.getFact();

    /**
     * The meta object literal for the '<em><b>Term Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__TERM_COMPOSITE = eINSTANCE.getFact_TermComposite();

    /**
     * The meta object literal for the '<em><b>Complement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__COMPLEMENT = eINSTANCE.getFact_Complement();

    /**
     * The meta object literal for the '<em><b>Term Composite2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__TERM_COMPOSITE2 = eINSTANCE.getFact_TermComposite2();

    /**
     * The meta object literal for the '<em><b>Fact Ext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT__FACT_EXT = eINSTANCE.getFact_FactExt();

    /**
     * The meta object literal for the '{@link org.leta.impl.FactExtImpl <em>Fact Ext</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.FactExtImpl
     * @see org.leta.impl.LetaPackageImpl#getFactExt()
     * @generated
     */
    EClass FACT_EXT = eINSTANCE.getFactExt();

    /**
     * The meta object literal for the '<em><b>Complement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_EXT__COMPLEMENT = eINSTANCE.getFactExt_Complement();

    /**
     * The meta object literal for the '<em><b>Term Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_EXT__TERM_COMPOSITE = eINSTANCE.getFactExt_TermComposite();

    /**
     * The meta object literal for the '<em><b>Fact Ext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACT_EXT__FACT_EXT = eINSTANCE.getFactExt_FactExt();

    /**
     * The meta object literal for the '{@link org.leta.impl.TermCompositeImpl <em>Term Composite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.TermCompositeImpl
     * @see org.leta.impl.LetaPackageImpl#getTermComposite()
     * @generated
     */
    EClass TERM_COMPOSITE = eINSTANCE.getTermComposite();

    /**
     * The meta object literal for the '<em><b>Quantifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_COMPOSITE__QUANTIFIER = eINSTANCE.getTermComposite_Quantifier();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_COMPOSITE__TERM = eINSTANCE.getTermComposite_Term();

    /**
     * The meta object literal for the '<em><b>Term Instance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_COMPOSITE__TERM_INSTANCE = eINSTANCE.getTermComposite_TermInstance();

    /**
     * The meta object literal for the '<em><b>Term With Association</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_COMPOSITE__TERM_WITH_ASSOCIATION = eINSTANCE.getTermComposite_TermWithAssociation();

    /**
     * The meta object literal for the '{@link org.leta.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.TermImpl
     * @see org.leta.impl.LetaPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__ID = eINSTANCE.getTerm_Id();

    /**
     * The meta object literal for the '{@link org.leta.impl.TermInstanceImpl <em>Term Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.TermInstanceImpl
     * @see org.leta.impl.LetaPackageImpl#getTermInstance()
     * @generated
     */
    EClass TERM_INSTANCE = eINSTANCE.getTermInstance();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_INSTANCE__TERM = eINSTANCE.getTermInstance_Term();

    /**
     * The meta object literal for the '<em><b>Not Equal Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_INSTANCE__NOT_EQUAL_OPERATOR = eINSTANCE.getTermInstance_NotEqualOperator();

    /**
     * The meta object literal for the '<em><b>String Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_INSTANCE__STRING_LITERAL = eINSTANCE.getTermInstance_StringLiteral();

    /**
     * The meta object literal for the '<em><b>Relational Operator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_INSTANCE__RELATIONAL_OPERATOR = eINSTANCE.getTermInstance_RelationalOperator();

    /**
     * The meta object literal for the '<em><b>Other Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_INSTANCE__OTHER_LITERAL = eINSTANCE.getTermInstance_OtherLiteral();

    /**
     * The meta object literal for the '{@link org.leta.impl.TermWithAssociationImpl <em>Term With Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.TermWithAssociationImpl
     * @see org.leta.impl.LetaPackageImpl#getTermWithAssociation()
     * @generated
     */
    EClass TERM_WITH_ASSOCIATION = eINSTANCE.getTermWithAssociation();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_WITH_ASSOCIATION__T = eINSTANCE.getTermWithAssociation_T();

    /**
     * The meta object literal for the '<em><b>Ro</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_WITH_ASSOCIATION__RO = eINSTANCE.getTermWithAssociation_Ro();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_WITH_ASSOCIATION__INDEX = eINSTANCE.getTermWithAssociation_Index();

    /**
     * The meta object literal for the '{@link org.leta.impl.QuantifierImpl <em>Quantifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.QuantifierImpl
     * @see org.leta.impl.LetaPackageImpl#getQuantifier()
     * @generated
     */
    EClass QUANTIFIER = eINSTANCE.getQuantifier();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__V = eINSTANCE.getQuantifier_V();

    /**
     * The meta object literal for the '<em><b>V1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__V1 = eINSTANCE.getQuantifier_V1();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUANTIFIER__V2 = eINSTANCE.getQuantifier_V2();

    /**
     * The meta object literal for the '{@link org.leta.impl.ComplementImpl <em>Complement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.ComplementImpl
     * @see org.leta.impl.LetaPackageImpl#getComplement()
     * @generated
     */
    EClass COMPLEMENT = eINSTANCE.getComplement();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEMENT__ID = eINSTANCE.getComplement_Id();

    /**
     * The meta object literal for the '{@link org.leta.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.FormulaImpl
     * @see org.leta.impl.LetaPackageImpl#getFormula()
     * @generated
     */
    EClass FORMULA = eINSTANCE.getFormula();

    /**
     * The meta object literal for the '<em><b>Fi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA__FI = eINSTANCE.getFormula_Fi();

    /**
     * The meta object literal for the '<em><b>Fe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA__FE = eINSTANCE.getFormula_Fe();

    /**
     * The meta object literal for the '{@link org.leta.impl.FormulaExpressionImpl <em>Formula Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.FormulaExpressionImpl
     * @see org.leta.impl.LetaPackageImpl#getFormulaExpression()
     * @generated
     */
    EClass FORMULA_EXPRESSION = eINSTANCE.getFormulaExpression();

    /**
     * The meta object literal for the '<em><b>Fi</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EXPRESSION__FI = eINSTANCE.getFormulaExpression_Fi();

    /**
     * The meta object literal for the '<em><b>Mo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMULA_EXPRESSION__MO = eINSTANCE.getFormulaExpression_Mo();

    /**
     * The meta object literal for the '<em><b>Fe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EXPRESSION__FE = eINSTANCE.getFormulaExpression_Fe();

    /**
     * The meta object literal for the '<em><b>Fe1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EXPRESSION__FE1 = eINSTANCE.getFormulaExpression_Fe1();

    /**
     * The meta object literal for the '<em><b>Fe2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_EXPRESSION__FE2 = eINSTANCE.getFormulaExpression_Fe2();

    /**
     * The meta object literal for the '{@link org.leta.impl.FormulaItemImpl <em>Formula Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.FormulaItemImpl
     * @see org.leta.impl.LetaPackageImpl#getFormulaItem()
     * @generated
     */
    EClass FORMULA_ITEM = eINSTANCE.getFormulaItem();

    /**
     * The meta object literal for the '<em><b>T</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_ITEM__T = eINSTANCE.getFormulaItem_T();

    /**
     * The meta object literal for the '<em><b>Ti</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_ITEM__TI = eINSTANCE.getFormulaItem_Ti();

    /**
     * The meta object literal for the '<em><b>Twa</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA_ITEM__TWA = eINSTANCE.getFormulaItem_Twa();

    /**
     * The meta object literal for the '{@link org.leta.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.RelationalOperatorImpl
     * @see org.leta.impl.LetaPackageImpl#getRelationalOperator()
     * @generated
     */
    EClass RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

    /**
     * The meta object literal for the '<em><b>O</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_OPERATOR__O = eINSTANCE.getRelationalOperator_O();

    /**
     * The meta object literal for the '<em><b>Neo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONAL_OPERATOR__NEO = eINSTANCE.getRelationalOperator_Neo();

    /**
     * The meta object literal for the '{@link org.leta.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.SetImpl
     * @see org.leta.impl.LetaPackageImpl#getSet()
     * @generated
     */
    EClass SET = eINSTANCE.getSet();

    /**
     * The meta object literal for the '<em><b>S</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__S = eINSTANCE.getSet_S();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SET__L = eINSTANCE.getSet_L();

    /**
     * The meta object literal for the '{@link org.leta.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.leta.impl.ListImpl
     * @see org.leta.impl.LetaPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Sl</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__SL = eINSTANCE.getList_Sl();

    /**
     * The meta object literal for the '<em><b>Ol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__OL = eINSTANCE.getList_Ol();

    /**
     * The meta object literal for the '<em><b>L</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__L = eINSTANCE.getList_L();

  }

} //LetaPackage
