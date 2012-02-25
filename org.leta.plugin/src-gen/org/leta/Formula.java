/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.Formula#getFi <em>Fi</em>}</li>
 *   <li>{@link org.leta.Formula#getFe <em>Fe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends EObject
{
  /**
   * Returns the value of the '<em><b>Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fi</em>' containment reference.
   * @see #setFi(FormulaItem)
   * @see org.leta.LetaPackage#getFormula_Fi()
   * @model containment="true"
   * @generated
   */
  FormulaItem getFi();

  /**
   * Sets the value of the '{@link org.leta.Formula#getFi <em>Fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fi</em>' containment reference.
   * @see #getFi()
   * @generated
   */
  void setFi(FormulaItem value);

  /**
   * Returns the value of the '<em><b>Fe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fe</em>' containment reference.
   * @see #setFe(FormulaExpression)
   * @see org.leta.LetaPackage#getFormula_Fe()
   * @model containment="true"
   * @generated
   */
  FormulaExpression getFe();

  /**
   * Sets the value of the '{@link org.leta.Formula#getFe <em>Fe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fe</em>' containment reference.
   * @see #getFe()
   * @generated
   */
  void setFe(FormulaExpression value);

} // Formula
