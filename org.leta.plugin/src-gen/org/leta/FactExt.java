/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.FactExt#getComplement <em>Complement</em>}</li>
 *   <li>{@link org.leta.FactExt#getTermComposite <em>Term Composite</em>}</li>
 *   <li>{@link org.leta.FactExt#getFactExt <em>Fact Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getFactExt()
 * @model
 * @generated
 */
public interface FactExt extends EObject
{
  /**
   * Returns the value of the '<em><b>Complement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complement</em>' containment reference.
   * @see #setComplement(Complement)
   * @see org.leta.LetaPackage#getFactExt_Complement()
   * @model containment="true"
   * @generated
   */
  Complement getComplement();

  /**
   * Sets the value of the '{@link org.leta.FactExt#getComplement <em>Complement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complement</em>' containment reference.
   * @see #getComplement()
   * @generated
   */
  void setComplement(Complement value);

  /**
   * Returns the value of the '<em><b>Term Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Composite</em>' containment reference.
   * @see #setTermComposite(TermComposite)
   * @see org.leta.LetaPackage#getFactExt_TermComposite()
   * @model containment="true"
   * @generated
   */
  TermComposite getTermComposite();

  /**
   * Sets the value of the '{@link org.leta.FactExt#getTermComposite <em>Term Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term Composite</em>' containment reference.
   * @see #getTermComposite()
   * @generated
   */
  void setTermComposite(TermComposite value);

  /**
   * Returns the value of the '<em><b>Fact Ext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact Ext</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact Ext</em>' containment reference.
   * @see #setFactExt(FactExt)
   * @see org.leta.LetaPackage#getFactExt_FactExt()
   * @model containment="true"
   * @generated
   */
  FactExt getFactExt();

  /**
   * Sets the value of the '{@link org.leta.FactExt#getFactExt <em>Fact Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact Ext</em>' containment reference.
   * @see #getFactExt()
   * @generated
   */
  void setFactExt(FactExt value);

} // FactExt
