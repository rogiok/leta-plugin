/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.FormulaItem#getT <em>T</em>}</li>
 *   <li>{@link org.leta.FormulaItem#getTi <em>Ti</em>}</li>
 *   <li>{@link org.leta.FormulaItem#getTwa <em>Twa</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getFormulaItem()
 * @model
 * @generated
 */
public interface FormulaItem extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Term)
   * @see org.leta.LetaPackage#getFormulaItem_T()
   * @model containment="true"
   * @generated
   */
  Term getT();

  /**
   * Sets the value of the '{@link org.leta.FormulaItem#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Term value);

  /**
   * Returns the value of the '<em><b>Ti</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ti</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ti</em>' containment reference.
   * @see #setTi(TermInstance)
   * @see org.leta.LetaPackage#getFormulaItem_Ti()
   * @model containment="true"
   * @generated
   */
  TermInstance getTi();

  /**
   * Sets the value of the '{@link org.leta.FormulaItem#getTi <em>Ti</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ti</em>' containment reference.
   * @see #getTi()
   * @generated
   */
  void setTi(TermInstance value);

  /**
   * Returns the value of the '<em><b>Twa</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Twa</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Twa</em>' containment reference.
   * @see #setTwa(TermWithAssociation)
   * @see org.leta.LetaPackage#getFormulaItem_Twa()
   * @model containment="true"
   * @generated
   */
  TermWithAssociation getTwa();

  /**
   * Sets the value of the '{@link org.leta.FormulaItem#getTwa <em>Twa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Twa</em>' containment reference.
   * @see #getTwa()
   * @generated
   */
  void setTwa(TermWithAssociation value);

} // FormulaItem
