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
import org.leta.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.QuantifierImpl#getV <em>V</em>}</li>
 *   <li>{@link org.leta.impl.QuantifierImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.leta.impl.QuantifierImpl#getV2 <em>V2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifierImpl extends MinimalEObjectImpl.Container implements Quantifier
{
  /**
   * The default value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected static final int V_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getV() <em>V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV()
   * @generated
   * @ordered
   */
  protected int v = V_EDEFAULT;

  /**
   * The default value of the '{@link #getV1() <em>V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected static final int V1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected int v1 = V1_EDEFAULT;

  /**
   * The default value of the '{@link #getV2() <em>V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected static final int V2_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected int v2 = V2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuantifierImpl()
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
    return LetaPackage.Literals.QUANTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getV()
  {
    return v;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV(int newV)
  {
    int oldV = v;
    v = newV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.QUANTIFIER__V, oldV, v));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(int newV1)
  {
    int oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.QUANTIFIER__V1, oldV1, v1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(int newV2)
  {
    int oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.QUANTIFIER__V2, oldV2, v2));
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
      case LetaPackage.QUANTIFIER__V:
        return getV();
      case LetaPackage.QUANTIFIER__V1:
        return getV1();
      case LetaPackage.QUANTIFIER__V2:
        return getV2();
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
      case LetaPackage.QUANTIFIER__V:
        setV((Integer)newValue);
        return;
      case LetaPackage.QUANTIFIER__V1:
        setV1((Integer)newValue);
        return;
      case LetaPackage.QUANTIFIER__V2:
        setV2((Integer)newValue);
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
      case LetaPackage.QUANTIFIER__V:
        setV(V_EDEFAULT);
        return;
      case LetaPackage.QUANTIFIER__V1:
        setV1(V1_EDEFAULT);
        return;
      case LetaPackage.QUANTIFIER__V2:
        setV2(V2_EDEFAULT);
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
      case LetaPackage.QUANTIFIER__V:
        return v != V_EDEFAULT;
      case LetaPackage.QUANTIFIER__V1:
        return v1 != V1_EDEFAULT;
      case LetaPackage.QUANTIFIER__V2:
        return v2 != V2_EDEFAULT;
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
    result.append(" (v: ");
    result.append(v);
    result.append(", v1: ");
    result.append(v1);
    result.append(", v2: ");
    result.append(v2);
    result.append(')');
    return result.toString();
  }

} //QuantifierImpl
