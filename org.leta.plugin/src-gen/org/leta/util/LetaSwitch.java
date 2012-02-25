/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.leta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.leta.LetaPackage
 * @generated
 */
public class LetaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LetaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LetaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LetaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LetaPackage.LETA:
      {
        Leta leta = (Leta)theEObject;
        T result = caseLeta(leta);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.TEST_CASE:
      {
        TestCase testCase = (TestCase)theEObject;
        T result = caseTestCase(testCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.VERIFY_CLAUSE:
      {
        VerifyClause verifyClause = (VerifyClause)theEObject;
        T result = caseVerifyClause(verifyClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.WHEN_CLAUSE:
      {
        WhenClause whenClause = (WhenClause)theEObject;
        T result = caseWhenClause(whenClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.SET_CLAUSE:
      {
        SetClause setClause = (SetClause)theEObject;
        T result = caseSetClause(setClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FACT_COMPOSITE:
      {
        factComposite factComposite = (factComposite)theEObject;
        T result = casefactComposite(factComposite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FACT:
      {
        Fact fact = (Fact)theEObject;
        T result = caseFact(fact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FACT_EXT:
      {
        FactExt factExt = (FactExt)theEObject;
        T result = caseFactExt(factExt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.TERM_COMPOSITE:
      {
        TermComposite termComposite = (TermComposite)theEObject;
        T result = caseTermComposite(termComposite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.TERM_INSTANCE:
      {
        TermInstance termInstance = (TermInstance)theEObject;
        T result = caseTermInstance(termInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.TERM_WITH_ASSOCIATION:
      {
        TermWithAssociation termWithAssociation = (TermWithAssociation)theEObject;
        T result = caseTermWithAssociation(termWithAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.QUANTIFIER:
      {
        Quantifier quantifier = (Quantifier)theEObject;
        T result = caseQuantifier(quantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.COMPLEMENT:
      {
        Complement complement = (Complement)theEObject;
        T result = caseComplement(complement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FORMULA:
      {
        Formula formula = (Formula)theEObject;
        T result = caseFormula(formula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FORMULA_EXPRESSION:
      {
        FormulaExpression formulaExpression = (FormulaExpression)theEObject;
        T result = caseFormulaExpression(formulaExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.FORMULA_ITEM:
      {
        FormulaItem formulaItem = (FormulaItem)theEObject;
        T result = caseFormulaItem(formulaItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.RELATIONAL_OPERATOR:
      {
        RelationalOperator relationalOperator = (RelationalOperator)theEObject;
        T result = caseRelationalOperator(relationalOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.SET:
      {
        Set set = (Set)theEObject;
        T result = caseSet(set);
        if (result == null) result = caseSetClause(set);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LetaPackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leta</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leta</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeta(Leta object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTestCase(TestCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verify Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verify Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerifyClause(VerifyClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenClause(WhenClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetClause(SetClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fact Composite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fact Composite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefactComposite(factComposite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFact(Fact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fact Ext</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fact Ext</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactExt(FactExt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Composite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Composite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermComposite(TermComposite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermInstance(TermInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term With Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term With Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermWithAssociation(TermWithAssociation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifier(Quantifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplement(Complement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormula(Formula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaExpression(FormulaExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormulaItem(FormulaItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalOperator(RelationalOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSet(Set object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LetaSwitch
