/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.leta.LetaPackage;
import org.leta.MathOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Math Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getSum <em>Sum</em>}</li>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getSubtract <em>Subtract</em>}</li>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getDivide <em>Divide</em>}</li>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getMultiply <em>Multiply</em>}</li>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getR <em>R</em>}</li>
 *   <li>{@link org.leta.impl.MathOperatorImpl#getP <em>P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MathOperatorImpl extends MinimalEObjectImpl.Container implements MathOperator
{
  /**
   * The default value of the '{@link #getSum() <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected static final String SUM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSum() <em>Sum</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSum()
   * @generated
   * @ordered
   */
  protected String sum = SUM_EDEFAULT;

  /**
   * The default value of the '{@link #getSubtract() <em>Subtract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtract()
   * @generated
   * @ordered
   */
  protected static final String SUBTRACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubtract() <em>Subtract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtract()
   * @generated
   * @ordered
   */
  protected String subtract = SUBTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #getDivide() <em>Divide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivide()
   * @generated
   * @ordered
   */
  protected static final String DIVIDE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDivide() <em>Divide</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivide()
   * @generated
   * @ordered
   */
  protected String divide = DIVIDE_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected static final String MULTIPLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMultiply() <em>Multiply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiply()
   * @generated
   * @ordered
   */
  protected String multiply = MULTIPLY_EDEFAULT;

  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final String R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected String r = R_EDEFAULT;

  /**
   * The default value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected static final String P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getP() <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getP()
   * @generated
   * @ordered
   */
  protected String p = P_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MathOperatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LetaPackage.Literals.MATH_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSum()
  {
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSum(String newSum)
  {
    String oldSum = sum;
    sum = newSum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__SUM, oldSum, sum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubtract()
  {
    return subtract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtract(String newSubtract)
  {
    String oldSubtract = subtract;
    subtract = newSubtract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__SUBTRACT, oldSubtract, subtract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDivide()
  {
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDivide(String newDivide)
  {
    String oldDivide = divide;
    divide = newDivide;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__DIVIDE, oldDivide, divide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMultiply()
  {
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiply(String newMultiply)
  {
    String oldMultiply = multiply;
    multiply = newMultiply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__MULTIPLY, oldMultiply, multiply));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR(String newR)
  {
    String oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getP()
  {
    return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setP(String newP)
  {
    String oldP = p;
    p = newP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.MATH_OPERATOR__P, oldP, p));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LetaPackage.MATH_OPERATOR__SUM:
        return getSum();
      case LetaPackage.MATH_OPERATOR__SUBTRACT:
        return getSubtract();
      case LetaPackage.MATH_OPERATOR__DIVIDE:
        return getDivide();
      case LetaPackage.MATH_OPERATOR__MULTIPLY:
        return getMultiply();
      case LetaPackage.MATH_OPERATOR__R:
        return getR();
      case LetaPackage.MATH_OPERATOR__P:
        return getP();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LetaPackage.MATH_OPERATOR__SUM:
        setSum((String)newValue);
        return;
      case LetaPackage.MATH_OPERATOR__SUBTRACT:
        setSubtract((String)newValue);
        return;
      case LetaPackage.MATH_OPERATOR__DIVIDE:
        setDivide((String)newValue);
        return;
      case LetaPackage.MATH_OPERATOR__MULTIPLY:
        setMultiply((String)newValue);
        return;
      case LetaPackage.MATH_OPERATOR__R:
        setR((String)newValue);
        return;
      case LetaPackage.MATH_OPERATOR__P:
        setP((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LetaPackage.MATH_OPERATOR__SUM:
        setSum(SUM_EDEFAULT);
        return;
      case LetaPackage.MATH_OPERATOR__SUBTRACT:
        setSubtract(SUBTRACT_EDEFAULT);
        return;
      case LetaPackage.MATH_OPERATOR__DIVIDE:
        setDivide(DIVIDE_EDEFAULT);
        return;
      case LetaPackage.MATH_OPERATOR__MULTIPLY:
        setMultiply(MULTIPLY_EDEFAULT);
        return;
      case LetaPackage.MATH_OPERATOR__R:
        setR(R_EDEFAULT);
        return;
      case LetaPackage.MATH_OPERATOR__P:
        setP(P_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LetaPackage.MATH_OPERATOR__SUM:
        return SUM_EDEFAULT == null ? sum != null : !SUM_EDEFAULT.equals(sum);
      case LetaPackage.MATH_OPERATOR__SUBTRACT:
        return SUBTRACT_EDEFAULT == null ? subtract != null : !SUBTRACT_EDEFAULT.equals(subtract);
      case LetaPackage.MATH_OPERATOR__DIVIDE:
        return DIVIDE_EDEFAULT == null ? divide != null : !DIVIDE_EDEFAULT.equals(divide);
      case LetaPackage.MATH_OPERATOR__MULTIPLY:
        return MULTIPLY_EDEFAULT == null ? multiply != null : !MULTIPLY_EDEFAULT.equals(multiply);
      case LetaPackage.MATH_OPERATOR__R:
        return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
      case LetaPackage.MATH_OPERATOR__P:
        return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (sum: ");
    result.append(sum);
    result.append(", subtract: ");
    result.append(subtract);
    result.append(", divide: ");
    result.append(divide);
    result.append(", multiply: ");
    result.append(multiply);
    result.append(", r: ");
    result.append(r);
    result.append(", p: ");
    result.append(p);
    result.append(')');
    return result.toString();
  }

} //MathOperatorImpl
