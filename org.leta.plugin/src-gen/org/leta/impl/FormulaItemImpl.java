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

import org.leta.FormulaItem;
import org.leta.LetaPackage;
import org.leta.Term;
import org.leta.TermInstance;
import org.leta.TermWithAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.FormulaItemImpl#getT <em>T</em>}</li>
 *   <li>{@link org.leta.impl.FormulaItemImpl#getTi <em>Ti</em>}</li>
 *   <li>{@link org.leta.impl.FormulaItemImpl#getTwa <em>Twa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaItemImpl extends MinimalEObjectImpl.Container implements FormulaItem
{
  /**
   * The cached value of the '{@link #getT() <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected Term t;

  /**
   * The cached value of the '{@link #getTi() <em>Ti</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTi()
   * @generated
   * @ordered
   */
  protected TermInstance ti;

  /**
   * The cached value of the '{@link #getTwa() <em>Twa</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwa()
   * @generated
   * @ordered
   */
  protected TermWithAssociation twa;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaItemImpl()
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
    return LetaPackage.Literals.FORMULA_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetT(Term newT, NotificationChain msgs)
  {
    Term oldT = t;
    t = newT;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__T, oldT, newT);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(Term newT)
  {
    if (newT != t)
    {
      NotificationChain msgs = null;
      if (t != null)
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermInstance getTi()
  {
    return ti;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTi(TermInstance newTi, NotificationChain msgs)
  {
    TermInstance oldTi = ti;
    ti = newTi;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__TI, oldTi, newTi);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTi(TermInstance newTi)
  {
    if (newTi != ti)
    {
      NotificationChain msgs = null;
      if (ti != null)
        msgs = ((InternalEObject)ti).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__TI, null, msgs);
      if (newTi != null)
        msgs = ((InternalEObject)newTi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__TI, null, msgs);
      msgs = basicSetTi(newTi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__TI, newTi, newTi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermWithAssociation getTwa()
  {
    return twa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTwa(TermWithAssociation newTwa, NotificationChain msgs)
  {
    TermWithAssociation oldTwa = twa;
    twa = newTwa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__TWA, oldTwa, newTwa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwa(TermWithAssociation newTwa)
  {
    if (newTwa != twa)
    {
      NotificationChain msgs = null;
      if (twa != null)
        msgs = ((InternalEObject)twa).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__TWA, null, msgs);
      if (newTwa != null)
        msgs = ((InternalEObject)newTwa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_ITEM__TWA, null, msgs);
      msgs = basicSetTwa(newTwa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_ITEM__TWA, newTwa, newTwa));
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
      case LetaPackage.FORMULA_ITEM__T:
        return basicSetT(null, msgs);
      case LetaPackage.FORMULA_ITEM__TI:
        return basicSetTi(null, msgs);
      case LetaPackage.FORMULA_ITEM__TWA:
        return basicSetTwa(null, msgs);
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
      case LetaPackage.FORMULA_ITEM__T:
        return getT();
      case LetaPackage.FORMULA_ITEM__TI:
        return getTi();
      case LetaPackage.FORMULA_ITEM__TWA:
        return getTwa();
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
      case LetaPackage.FORMULA_ITEM__T:
        setT((Term)newValue);
        return;
      case LetaPackage.FORMULA_ITEM__TI:
        setTi((TermInstance)newValue);
        return;
      case LetaPackage.FORMULA_ITEM__TWA:
        setTwa((TermWithAssociation)newValue);
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
      case LetaPackage.FORMULA_ITEM__T:
        setT((Term)null);
        return;
      case LetaPackage.FORMULA_ITEM__TI:
        setTi((TermInstance)null);
        return;
      case LetaPackage.FORMULA_ITEM__TWA:
        setTwa((TermWithAssociation)null);
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
      case LetaPackage.FORMULA_ITEM__T:
        return t != null;
      case LetaPackage.FORMULA_ITEM__TI:
        return ti != null;
      case LetaPackage.FORMULA_ITEM__TWA:
        return twa != null;
    }
    return super.eIsSet(featureID);
  }

} //FormulaItemImpl
