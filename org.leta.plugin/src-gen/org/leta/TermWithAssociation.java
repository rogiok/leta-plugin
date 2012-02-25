/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term With Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.TermWithAssociation#getT <em>T</em>}</li>
 *   <li>{@link org.leta.TermWithAssociation#getRo <em>Ro</em>}</li>
 *   <li>{@link org.leta.TermWithAssociation#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getTermWithAssociation()
 * @model
 * @generated
 */
public interface TermWithAssociation extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Term)
   * @see org.leta.LetaPackage#getTermWithAssociation_T()
   * @model containment="true"
   * @generated
   */
  Term getT();

  /**
   * Sets the value of the '{@link org.leta.TermWithAssociation#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Term value);

  /**
   * Returns the value of the '<em><b>Ro</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ro</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ro</em>' containment reference.
   * @see #setRo(RelationalOperator)
   * @see org.leta.LetaPackage#getTermWithAssociation_Ro()
   * @model containment="true"
   * @generated
   */
  RelationalOperator getRo();

  /**
   * Sets the value of the '{@link org.leta.TermWithAssociation#getRo <em>Ro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ro</em>' containment reference.
   * @see #getRo()
   * @generated
   */
  void setRo(RelationalOperator value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see org.leta.LetaPackage#getTermWithAssociation_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link org.leta.TermWithAssociation#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // TermWithAssociation
