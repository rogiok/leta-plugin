/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.List#getSl <em>Sl</em>}</li>
 *   <li>{@link org.leta.List#getOl <em>Ol</em>}</li>
 *   <li>{@link org.leta.List#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject
{
  /**
   * Returns the value of the '<em><b>Sl</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sl</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sl</em>' attribute.
   * @see #setSl(String)
   * @see org.leta.LetaPackage#getList_Sl()
   * @model
   * @generated
   */
  String getSl();

  /**
   * Sets the value of the '{@link org.leta.List#getSl <em>Sl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sl</em>' attribute.
   * @see #getSl()
   * @generated
   */
  void setSl(String value);

  /**
   * Returns the value of the '<em><b>Ol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ol</em>' attribute.
   * @see #setOl(String)
   * @see org.leta.LetaPackage#getList_Ol()
   * @model
   * @generated
   */
  String getOl();

  /**
   * Sets the value of the '{@link org.leta.List#getOl <em>Ol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ol</em>' attribute.
   * @see #getOl()
   * @generated
   */
  void setOl(String value);

  /**
   * Returns the value of the '<em><b>L</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>L</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' containment reference.
   * @see #setL(List)
   * @see org.leta.LetaPackage#getList_L()
   * @model containment="true"
   * @generated
   */
  List getL();

  /**
   * Sets the value of the '{@link org.leta.List#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(List value);

} // List
