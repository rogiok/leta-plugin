/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.FactComposite#getF <em>F</em>}</li>
 *   <li>{@link org.leta.FactComposite#getFo <em>Fo</em>}</li>
 *   <li>{@link org.leta.FactComposite#getOp <em>Op</em>}</li>
 *   <li>{@link org.leta.FactComposite#getFc <em>Fc</em>}</li>
 *   <li>{@link org.leta.FactComposite#getFc1 <em>Fc1</em>}</li>
 *   <li>{@link org.leta.FactComposite#getFc2 <em>Fc2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getFactComposite()
 * @model
 * @generated
 */
public interface FactComposite extends EObject
{
  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference.
   * @see #setF(Fact)
   * @see org.leta.LetaPackage#getFactComposite_F()
   * @model containment="true"
   * @generated
   */
  Fact getF();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getF <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>F</em>' containment reference.
   * @see #getF()
   * @generated
   */
  void setF(Fact value);

  /**
   * Returns the value of the '<em><b>Fo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fo</em>' containment reference.
   * @see #setFo(Formula)
   * @see org.leta.LetaPackage#getFactComposite_Fo()
   * @model containment="true"
   * @generated
   */
  Formula getFo();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getFo <em>Fo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fo</em>' containment reference.
   * @see #getFo()
   * @generated
   */
  void setFo(Formula value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.leta.LetaPackage#getFactComposite_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

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
   * @see org.leta.LetaPackage#getFactComposite_Fc()
   * @model containment="true"
   * @generated
   */
  FactComposite getFc();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getFc <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc</em>' containment reference.
   * @see #getFc()
   * @generated
   */
  void setFc(FactComposite value);

  /**
   * Returns the value of the '<em><b>Fc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc1</em>' containment reference.
   * @see #setFc1(FactComposite)
   * @see org.leta.LetaPackage#getFactComposite_Fc1()
   * @model containment="true"
   * @generated
   */
  FactComposite getFc1();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getFc1 <em>Fc1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc1</em>' containment reference.
   * @see #getFc1()
   * @generated
   */
  void setFc1(FactComposite value);

  /**
   * Returns the value of the '<em><b>Fc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc2</em>' containment reference.
   * @see #setFc2(FactComposite)
   * @see org.leta.LetaPackage#getFactComposite_Fc2()
   * @model containment="true"
   * @generated
   */
  FactComposite getFc2();

  /**
   * Sets the value of the '{@link org.leta.FactComposite#getFc2 <em>Fc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc2</em>' containment reference.
   * @see #getFc2()
   * @generated
   */
  void setFc2(FactComposite value);

} // FactComposite
