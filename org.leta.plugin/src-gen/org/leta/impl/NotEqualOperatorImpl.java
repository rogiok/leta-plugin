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
import org.leta.NotEqualOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Equal Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.NotEqualOperatorImpl#getNe <em>Ne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotEqualOperatorImpl extends MinimalEObjectImpl.Container implements NotEqualOperator
{
  /**
   * The default value of the '{@link #getNe() <em>Ne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNe()
   * @generated
   * @ordered
   */
  protected static final String NE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNe() <em>Ne</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNe()
   * @generated
   * @ordered
   */
  protected String ne = NE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotEqualOperatorImpl()
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
    return LetaPackage.Literals.NOT_EQUAL_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNe()
  {
    return ne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNe(String newNe)
  {
    String oldNe = ne;
    ne = newNe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.NOT_EQUAL_OPERATOR__NE, oldNe, ne));
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
      case LetaPackage.NOT_EQUAL_OPERATOR__NE:
        return getNe();
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
      case LetaPackage.NOT_EQUAL_OPERATOR__NE:
        setNe((String)newValue);
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
      case LetaPackage.NOT_EQUAL_OPERATOR__NE:
        setNe(NE_EDEFAULT);
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
      case LetaPackage.NOT_EQUAL_OPERATOR__NE:
        return NE_EDEFAULT == null ? ne != null : !NE_EDEFAULT.equals(ne);
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
    result.append(" (ne: ");
    result.append(ne);
    result.append(')');
    return result.toString();
  }

} //NotEqualOperatorImpl
