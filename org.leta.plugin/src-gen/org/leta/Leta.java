/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.Leta#getTp <em>Tp</em>}</li>
 *   <li>{@link org.leta.Leta#getTc <em>Tc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getLeta()
 * @model
 * @generated
 */
public interface Leta extends EObject
{
  /**
   * Returns the value of the '<em><b>Tp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tp</em>' attribute.
   * @see #setTp(String)
   * @see org.leta.LetaPackage#getLeta_Tp()
   * @model
   * @generated
   */
  String getTp();

  /**
   * Sets the value of the '{@link org.leta.Leta#getTp <em>Tp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tp</em>' attribute.
   * @see #getTp()
   * @generated
   */
  void setTp(String value);

  /**
   * Returns the value of the '<em><b>Tc</b></em>' containment reference list.
   * The list contents are of type {@link org.leta.TestCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tc</em>' containment reference list.
   * @see org.leta.LetaPackage#getLeta_Tc()
   * @model containment="true"
   * @generated
   */
  EList<TestCase> getTc();

} // Leta
