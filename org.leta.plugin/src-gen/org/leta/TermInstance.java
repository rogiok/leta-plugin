/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.TermInstance#getTerm <em>Term</em>}</li>
 *   <li>{@link org.leta.TermInstance#getNotEqualOperator <em>Not Equal Operator</em>}</li>
 *   <li>{@link org.leta.TermInstance#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link org.leta.TermInstance#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.leta.TermInstance#getOtherLiteral <em>Other Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getTermInstance()
 * @model
 * @generated
 */
public interface TermInstance extends EObject
{
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
   * @see org.leta.LetaPackage#getTermInstance_Term()
   * @model containment="true"
   * @generated
   */
  Term getTerm();

  /**
   * Sets the value of the '{@link org.leta.TermInstance#getTerm <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Term</em>' containment reference.
   * @see #getTerm()
   * @generated
   */
  void setTerm(Term value);

  /**
   * Returns the value of the '<em><b>Not Equal Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Equal Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Equal Operator</em>' attribute.
   * @see #setNotEqualOperator(String)
   * @see org.leta.LetaPackage#getTermInstance_NotEqualOperator()
   * @model
   * @generated
   */
  String getNotEqualOperator();

  /**
   * Sets the value of the '{@link org.leta.TermInstance#getNotEqualOperator <em>Not Equal Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Equal Operator</em>' attribute.
   * @see #getNotEqualOperator()
   * @generated
   */
  void setNotEqualOperator(String value);

  /**
   * Returns the value of the '<em><b>String Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Literal</em>' attribute.
   * @see #setStringLiteral(String)
   * @see org.leta.LetaPackage#getTermInstance_StringLiteral()
   * @model
   * @generated
   */
  String getStringLiteral();

  /**
   * Sets the value of the '{@link org.leta.TermInstance#getStringLiteral <em>String Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Literal</em>' attribute.
   * @see #getStringLiteral()
   * @generated
   */
  void setStringLiteral(String value);

  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relational Operator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' containment reference.
   * @see #setRelationalOperator(RelationalOperator)
   * @see org.leta.LetaPackage#getTermInstance_RelationalOperator()
   * @model containment="true"
   * @generated
   */
  RelationalOperator getRelationalOperator();

  /**
   * Sets the value of the '{@link org.leta.TermInstance#getRelationalOperator <em>Relational Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational Operator</em>' containment reference.
   * @see #getRelationalOperator()
   * @generated
   */
  void setRelationalOperator(RelationalOperator value);

  /**
   * Returns the value of the '<em><b>Other Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other Literal</em>' attribute.
   * @see #setOtherLiteral(String)
   * @see org.leta.LetaPackage#getTermInstance_OtherLiteral()
   * @model
   * @generated
   */
  String getOtherLiteral();

  /**
   * Sets the value of the '{@link org.leta.TermInstance#getOtherLiteral <em>Other Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Other Literal</em>' attribute.
   * @see #getOtherLiteral()
   * @generated
   */
  void setOtherLiteral(String value);

} // TermInstance
