/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.leta.LetaPackage
 * @generated
 */
public interface LetaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LetaFactory eINSTANCE = org.leta.impl.LetaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Leta</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leta</em>'.
   * @generated
   */
  Leta createLeta();

  /**
   * Returns a new object of class '<em>Test Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Case</em>'.
   * @generated
   */
  TestCase createTestCase();

  /**
   * Returns a new object of class '<em>Verify Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verify Clause</em>'.
   * @generated
   */
  VerifyClause createVerifyClause();

  /**
   * Returns a new object of class '<em>When Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Clause</em>'.
   * @generated
   */
  WhenClause createWhenClause();

  /**
   * Returns a new object of class '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Clause</em>'.
   * @generated
   */
  SetClause createSetClause();

  /**
   * Returns a new object of class '<em>fact Composite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>fact Composite</em>'.
   * @generated
   */
  factComposite createfactComposite();

  /**
   * Returns a new object of class '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact</em>'.
   * @generated
   */
  Fact createFact();

  /**
   * Returns a new object of class '<em>Fact Ext</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fact Ext</em>'.
   * @generated
   */
  FactExt createFactExt();

  /**
   * Returns a new object of class '<em>Term Composite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Composite</em>'.
   * @generated
   */
  TermComposite createTermComposite();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Term Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Instance</em>'.
   * @generated
   */
  TermInstance createTermInstance();

  /**
   * Returns a new object of class '<em>Term With Association</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term With Association</em>'.
   * @generated
   */
  TermWithAssociation createTermWithAssociation();

  /**
   * Returns a new object of class '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quantifier</em>'.
   * @generated
   */
  Quantifier createQuantifier();

  /**
   * Returns a new object of class '<em>Complement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complement</em>'.
   * @generated
   */
  Complement createComplement();

  /**
   * Returns a new object of class '<em>Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula</em>'.
   * @generated
   */
  Formula createFormula();

  /**
   * Returns a new object of class '<em>Formula Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula Expression</em>'.
   * @generated
   */
  FormulaExpression createFormulaExpression();

  /**
   * Returns a new object of class '<em>Formula Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula Item</em>'.
   * @generated
   */
  FormulaItem createFormulaItem();

  /**
   * Returns a new object of class '<em>Relational Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relational Operator</em>'.
   * @generated
   */
  RelationalOperator createRelationalOperator();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LetaPackage getLetaPackage();

} //LetaFactory
