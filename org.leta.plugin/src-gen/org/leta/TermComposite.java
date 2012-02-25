/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.TermComposite#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.leta.TermComposite#getTerm <em>Term</em>}</li>
 *   <li>{@link org.leta.TermComposite#getTermInstance <em>Term Instance</em>}</li>
 *   <li>{@link org.leta.TermComposite#getTermWithAssociation <em>Term With Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getTermComposite()
 * @model
 * @generated
 */
public interface TermComposite extends EObject
{
  /**
   * Returns the value of the '<em><b>Quantifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quantifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quantifier</em>' containment reference.
   * @see #setQuantifier(Quantifier)
   * @see org.leta.LetaPackage#getTermComposite_Quantifier()
   * @model containment="true"
   * @generated
   */
  Quantifier getQuantifier();

  /**
   * Sets the value of the '{@link org.leta.TermComposite#getQuantifier <em>Quantifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Quantifier</em>' containment reference.
   * @see #getQuantifier()
   * @generated
   */
  void setQuantifier(Quantifier value);

  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference.
   * @see #setTerm(Term)
   * @see org.leta.LetaPackage#getTermComposite_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link org.leta.TermComposite#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

  /**
   * Returns the value of the '<em><b>Term Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term Instance</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term Instance</em>' containment reference.
   * @see #setTermInstance(TermInstance)
   * @see org.leta.LetaPackage#getTermComposite_TermInstance()
   * @model containment="true"
   * @generated
   */
  TermInstance getTermInstance();

  /**
   * Sets the value of the '{@link org.leta.TermComposite#getTermInstance <em>Term Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term Instance</em>' containment reference.
   * @see #getTermInstance()
   * @generated
   */
  void setTermInstance(TermInstance value);

  /**
   * Returns the value of the '<em><b>Term With Association</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term With Association</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term With Association</em>' containment reference.
   * @see #setTermWithAssociation(TermWithAssociation)
   * @see org.leta.LetaPackage#getTermComposite_TermWithAssociation()
   * @model containment="true"
   * @generated
   */
  TermWithAssociation getTermWithAssociation();

  /**
   * Sets the value of the '{@link org.leta.TermComposite#getTermWithAssociation <em>Term With Association</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term With Association</em>' containment reference.
   * @see #getTermWithAssociation()
   * @generated
   */
  void setTermWithAssociation(TermWithAssociation value);

} // TermComposite
