/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.leta.FormulaExpression#getFi <em>Fi</em>}</li>
 *   <li>{@link org.leta.FormulaExpression#getMo <em>Mo</em>}</li>
 *   <li>{@link org.leta.FormulaExpression#getFe <em>Fe</em>}</li>
 *   <li>{@link org.leta.FormulaExpression#getFe1 <em>Fe1</em>}</li>
 *   <li>{@link org.leta.FormulaExpression#getFe2 <em>Fe2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.leta.LetaPackage#getFormulaExpression()
 * @model
 * @generated
 */
public interface FormulaExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Fi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fi</em>' containment reference.
   * @see #setFi(FormulaItem)
   * @see org.leta.LetaPackage#getFormulaExpression_Fi()
   * @model containment="true"
   * @generated
   */
  FormulaItem getFi();

  /**
   * Sets the value of the '{@link org.leta.FormulaExpression#getFi <em>Fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fi</em>' containment reference.
   * @see #getFi()
   * @generated
   */
  void setFi(FormulaItem value);

  /**
   * Returns the value of the '<em><b>Mo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mo</em>' containment reference.
   * @see #setMo(MathOperator)
   * @see org.leta.LetaPackage#getFormulaExpression_Mo()
   * @model containment="true"
   * @generated
   */
  MathOperator getMo();

  /**
   * Sets the value of the '{@link org.leta.FormulaExpression#getMo <em>Mo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mo</em>' containment reference.
   * @see #getMo()
   * @generated
   */
  void setMo(MathOperator value);

  /**
   * Returns the value of the '<em><b>Fe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fe</em>' containment reference.
   * @see #setFe(FormulaExpression)
   * @see org.leta.LetaPackage#getFormulaExpression_Fe()
   * @model containment="true"
   * @generated
   */
  FormulaExpression getFe();

  /**
   * Sets the value of the '{@link org.leta.FormulaExpression#getFe <em>Fe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fe</em>' containment reference.
   * @see #getFe()
   * @generated
   */
  void setFe(FormulaExpression value);

  /**
   * Returns the value of the '<em><b>Fe1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fe1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fe1</em>' containment reference.
   * @see #setFe1(FormulaExpression)
   * @see org.leta.LetaPackage#getFormulaExpression_Fe1()
   * @model containment="true"
   * @generated
   */
  FormulaExpression getFe1();

  /**
   * Sets the value of the '{@link org.leta.FormulaExpression#getFe1 <em>Fe1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fe1</em>' containment reference.
   * @see #getFe1()
   * @generated
   */
  void setFe1(FormulaExpression value);

  /**
   * Returns the value of the '<em><b>Fe2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fe2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fe2</em>' containment reference.
   * @see #setFe2(FormulaExpression)
   * @see org.leta.LetaPackage#getFormulaExpression_Fe2()
   * @model containment="true"
   * @generated
   */
  FormulaExpression getFe2();

  /**
   * Sets the value of the '{@link org.leta.FormulaExpression#getFe2 <em>Fe2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fe2</em>' containment reference.
   * @see #getFe2()
   * @generated
   */
  void setFe2(FormulaExpression value);

} // FormulaExpression
