/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.TestCase#getId <em>Id</em>}</li>
 *   <li>{@link org.leta.TestCase#getV <em>V</em>}</li>
 *   <li>{@link org.leta.TestCase#getW <em>W</em>}</li>
 *   <li>{@link org.leta.TestCase#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.leta.LetaPackage#getTestCase_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.leta.TestCase#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VerifyClause)
   * @see org.leta.LetaPackage#getTestCase_V()
   * @model containment="true"
   * @generated
   */
  VerifyClause getV();

  /**
   * Sets the value of the '{@link org.leta.TestCase#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VerifyClause value);

  /**
   * Returns the value of the '<em><b>W</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>W</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>W</em>' containment reference.
   * @see #setW(WhenClause)
   * @see org.leta.LetaPackage#getTestCase_W()
   * @model containment="true"
   * @generated
   */
  WhenClause getW();

  /**
   * Sets the value of the '{@link org.leta.TestCase#getW <em>W</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>W</em>' containment reference.
   * @see #getW()
   * @generated
   */
  void setW(WhenClause value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(SetClause)
   * @see org.leta.LetaPackage#getTestCase_S()
   * @model containment="true"
   * @generated
   */
  SetClause getS();

  /**
   * Sets the value of the '{@link org.leta.TestCase#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(SetClause value);

} // TestCase
