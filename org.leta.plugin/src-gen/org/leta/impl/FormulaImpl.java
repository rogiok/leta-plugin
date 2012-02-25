/**
 * <copyright>
 * </copyright>
 *
 */
package org.leta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.leta.Formula;
import org.leta.FormulaExpression;
import org.leta.FormulaItem;
import org.leta.LetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.FormulaImpl#getFi <em>Fi</em>}</li>
 *   <li>{@link org.leta.impl.FormulaImpl#getFe <em>Fe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaImpl extends MinimalEObjectImpl.Container implements Formula
{
  /**
   * The cached value of the '{@link #getFi() <em>Fi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFi()
   * @generated
   * @ordered
   */
  protected FormulaItem fi;

  /**
   * The cached value of the '{@link #getFe() <em>Fe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFe()
   * @generated
   * @ordered
   */
  protected FormulaExpression fe;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaImpl()
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
    return LetaPackage.Literals.FORMULA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaItem getFi()
  {
    return fi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFi(FormulaItem newFi, NotificationChain msgs)
  {
    FormulaItem oldFi = fi;
    fi = newFi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA__FI, oldFi, newFi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFi(FormulaItem newFi)
  {
    if (newFi != fi)
    {
      NotificationChain msgs = null;
      if (fi != null)
        msgs = ((InternalEObject)fi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA__FI, null, msgs);
      if (newFi != null)
        msgs = ((InternalEObject)newFi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA__FI, null, msgs);
      msgs = basicSetFi(newFi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA__FI, newFi, newFi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaExpression getFe()
  {
    return fe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFe(FormulaExpression newFe, NotificationChain msgs)
  {
    FormulaExpression oldFe = fe;
    fe = newFe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA__FE, oldFe, newFe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFe(FormulaExpression newFe)
  {
    if (newFe != fe)
    {
      NotificationChain msgs = null;
      if (fe != null)
        msgs = ((InternalEObject)fe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA__FE, null, msgs);
      if (newFe != null)
        msgs = ((InternalEObject)newFe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA__FE, null, msgs);
      msgs = basicSetFe(newFe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA__FE, newFe, newFe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LetaPackage.FORMULA__FI:
        return basicSetFi(null, msgs);
      case LetaPackage.FORMULA__FE:
        return basicSetFe(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LetaPackage.FORMULA__FI:
        return getFi();
      case LetaPackage.FORMULA__FE:
        return getFe();
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
      case LetaPackage.FORMULA__FI:
        setFi((FormulaItem)newValue);
        return;
      case LetaPackage.FORMULA__FE:
        setFe((FormulaExpression)newValue);
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
      case LetaPackage.FORMULA__FI:
        setFi((FormulaItem)null);
        return;
      case LetaPackage.FORMULA__FE:
        setFe((FormulaExpression)null);
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
      case LetaPackage.FORMULA__FI:
        return fi != null;
      case LetaPackage.FORMULA__FE:
        return fe != null;
    }
    return super.eIsSet(featureID);
  }

} //FormulaImpl
