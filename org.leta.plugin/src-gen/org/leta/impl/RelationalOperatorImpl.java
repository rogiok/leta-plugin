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
import org.leta.RelationalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relational Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.RelationalOperatorImpl#getO <em>O</em>}</li>
 *   <li>{@link org.leta.impl.RelationalOperatorImpl#getNeo <em>Neo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationalOperatorImpl extends MinimalEObjectImpl.Container implements RelationalOperator
{
  /**
   * The default value of the '{@link #getO() <em>O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected static final String O_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getO() <em>O</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getO()
   * @generated
   * @ordered
   */
  protected String o = O_EDEFAULT;

  /**
   * The default value of the '{@link #getNeo() <em>Neo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeo()
   * @generated
   * @ordered
   */
  protected static final String NEO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNeo() <em>Neo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeo()
   * @generated
   * @ordered
   */
  protected String neo = NEO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationalOperatorImpl()
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
    return LetaPackage.Literals.RELATIONAL_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getO()
  {
    return o;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setO(String newO)
  {
    String oldO = o;
    o = newO;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.RELATIONAL_OPERATOR__O, oldO, o));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNeo()
  {
    return neo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeo(String newNeo)
  {
    String oldNeo = neo;
    neo = newNeo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.RELATIONAL_OPERATOR__NEO, oldNeo, neo));
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
      case LetaPackage.RELATIONAL_OPERATOR__O:
        return getO();
      case LetaPackage.RELATIONAL_OPERATOR__NEO:
        return getNeo();
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
      case LetaPackage.RELATIONAL_OPERATOR__O:
        setO((String)newValue);
        return;
      case LetaPackage.RELATIONAL_OPERATOR__NEO:
        setNeo((String)newValue);
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
      case LetaPackage.RELATIONAL_OPERATOR__O:
        setO(O_EDEFAULT);
        return;
      case LetaPackage.RELATIONAL_OPERATOR__NEO:
        setNeo(NEO_EDEFAULT);
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
      case LetaPackage.RELATIONAL_OPERATOR__O:
        return O_EDEFAULT == null ? o != null : !O_EDEFAULT.equals(o);
      case LetaPackage.RELATIONAL_OPERATOR__NEO:
        return NEO_EDEFAULT == null ? neo != null : !NEO_EDEFAULT.equals(neo);
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
    result.append(" (o: ");
    result.append(o);
    result.append(", neo: ");
    result.append(neo);
    result.append(')');
    return result.toString();
  }

} //RelationalOperatorImpl
