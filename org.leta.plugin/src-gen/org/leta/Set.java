/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.Set#getS <em>S</em>}</li>
 *   <li>{@link org.leta.Set#getL <em>L</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends SetClause
{
  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(Set)
   * @see org.leta.LetaPackage#getSet_S()
   * @model containment="true"
   * @generated
   */
  Set getS();

  /**
   * Sets the value of the '{@link org.leta.Set#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(Set value);

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
   * @see org.leta.LetaPackage#getSet_L()
   * @model containment="true"
   * @generated
   */
  List getL();

  /**
   * Sets the value of the '{@link org.leta.Set#getL <em>L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' containment reference.
   * @see #getL()
   * @generated
   */
  void setL(List value);

} // Set
