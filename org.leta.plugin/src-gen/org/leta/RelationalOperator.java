/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.RelationalOperator#getO <em>O</em>}</li>
 *   <li>{@link org.leta.RelationalOperator#getNeo <em>Neo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getRelationalOperator()
 * @model
 * @generated
 */
public interface RelationalOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>O</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>O</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>O</em>' attribute.
   * @see #setO(String)
   * @see org.leta.LetaPackage#getRelationalOperator_O()
   * @model
   * @generated
   */
  String getO();

  /**
   * Sets the value of the '{@link org.leta.RelationalOperator#getO <em>O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>O</em>' attribute.
   * @see #getO()
   * @generated
   */
  void setO(String value);

  /**
   * Returns the value of the '<em><b>Neo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neo</em>' attribute.
   * @see #setNeo(String)
   * @see org.leta.LetaPackage#getRelationalOperator_Neo()
   * @model
   * @generated
   */
  String getNeo();

  /**
   * Sets the value of the '{@link org.leta.RelationalOperator#getNeo <em>Neo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neo</em>' attribute.
   * @see #getNeo()
   * @generated
   */
  void setNeo(String value);

} // RelationalOperator
