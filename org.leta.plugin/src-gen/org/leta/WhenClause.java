/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.WhenClause#getFc <em>Fc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getWhenClause()
 * @model
 * @generated
 */
public interface WhenClause extends EObject
{
  /**
   * Returns the value of the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc</em>' containment reference.
   * @see #setFc(FactComposite)
   * @see org.leta.LetaPackage#getWhenClause_Fc()
   * @model containment="true"
   * @generated
   */
  FactComposite getFc();

  /**
   * Sets the value of the '{@link org.leta.WhenClause#getFc <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc</em>' containment reference.
   * @see #getFc()
   * @generated
   */
  void setFc(FactComposite value);

} // WhenClause
