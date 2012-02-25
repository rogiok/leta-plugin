/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fact Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.factComposite#getF <em>F</em>}</li>
 *   <li>{@link org.leta.factComposite#getFo <em>Fo</em>}</li>
 *   <li>{@link org.leta.factComposite#getOp <em>Op</em>}</li>
 *   <li>{@link org.leta.factComposite#getFc <em>Fc</em>}</li>
 *   <li>{@link org.leta.factComposite#getFc1 <em>Fc1</em>}</li>
 *   <li>{@link org.leta.factComposite#getFc2 <em>Fc2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getfactComposite()
 * @model
 * @generated
 */
public interface factComposite extends EObject
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
   * @see org.leta.LetaPackage#getfactComposite_F()
   * @model containment="true"
   * @generated
   */
  Fact getF();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getF <em>F</em>}' containment reference.
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
   * @see org.leta.LetaPackage#getfactComposite_Fo()
   * @model containment="true"
   * @generated
   */
  Formula getFo();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getFo <em>Fo</em>}' containment reference.
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
   * @see org.leta.LetaPackage#getfactComposite_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getOp <em>Op</em>}' attribute.
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
   * @see #setFc(factComposite)
   * @see org.leta.LetaPackage#getfactComposite_Fc()
   * @model containment="true"
   * @generated
   */
  factComposite getFc();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getFc <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc</em>' containment reference.
   * @see #getFc()
   * @generated
   */
  void setFc(factComposite value);

  /**
   * Returns the value of the '<em><b>Fc1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc1</em>' containment reference.
   * @see #setFc1(factComposite)
   * @see org.leta.LetaPackage#getfactComposite_Fc1()
   * @model containment="true"
   * @generated
   */
  factComposite getFc1();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getFc1 <em>Fc1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc1</em>' containment reference.
   * @see #getFc1()
   * @generated
   */
  void setFc1(factComposite value);

  /**
   * Returns the value of the '<em><b>Fc2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc2</em>' containment reference.
   * @see #setFc2(factComposite)
   * @see org.leta.LetaPackage#getfactComposite_Fc2()
   * @model containment="true"
   * @generated
   */
  factComposite getFc2();

  /**
   * Sets the value of the '{@link org.leta.factComposite#getFc2 <em>Fc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc2</em>' containment reference.
   * @see #getFc2()
   * @generated
   */
  void setFc2(factComposite value);

} // factComposite
