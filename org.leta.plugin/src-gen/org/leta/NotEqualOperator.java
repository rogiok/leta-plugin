/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Equal Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.NotEqualOperator#getNe <em>Ne</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getNotEqualOperator()
 * @model
 * @generated
 */
public interface NotEqualOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Ne</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ne</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ne</em>' attribute.
   * @see #setNe(String)
   * @see org.leta.LetaPackage#getNotEqualOperator_Ne()
   * @model
   * @generated
   */
  String getNe();

  /**
   * Sets the value of the '{@link org.leta.NotEqualOperator#getNe <em>Ne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ne</em>' attribute.
   * @see #getNe()
   * @generated
   */
  void setNe(String value);

} // NotEqualOperator
