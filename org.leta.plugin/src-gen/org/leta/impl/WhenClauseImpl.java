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

import org.leta.FactComposite;
import org.leta.LetaPackage;
import org.leta.WhenClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.WhenClauseImpl#getFc <em>Fc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhenClauseImpl extends MinimalEObjectImpl.Container implements WhenClause
{
  /**
   * The cached value of the '{@link #getFc() <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc()
   * @generated
   * @ordered
   */
  protected FactComposite fc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhenClauseImpl()
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
    return LetaPackage.Literals.WHEN_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactComposite getFc()
  {
    return fc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc(FactComposite newFc, NotificationChain msgs)
  {
    FactComposite oldFc = fc;
    fc = newFc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.WHEN_CLAUSE__FC, oldFc, newFc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc(FactComposite newFc)
  {
    if (newFc != fc)
    {
      NotificationChain msgs = null;
      if (fc != null)
        msgs = ((InternalEObject)fc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.WHEN_CLAUSE__FC, null, msgs);
      if (newFc != null)
        msgs = ((InternalEObject)newFc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.WHEN_CLAUSE__FC, null, msgs);
      msgs = basicSetFc(newFc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.WHEN_CLAUSE__FC, newFc, newFc));
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
      case LetaPackage.WHEN_CLAUSE__FC:
        return basicSetFc(null, msgs);
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
      case LetaPackage.WHEN_CLAUSE__FC:
        return getFc();
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
      case LetaPackage.WHEN_CLAUSE__FC:
        setFc((FactComposite)newValue);
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
      case LetaPackage.WHEN_CLAUSE__FC:
        setFc((FactComposite)null);
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
      case LetaPackage.WHEN_CLAUSE__FC:
        return fc != null;
    }
    return super.eIsSet(featureID);
  }

} //WhenClauseImpl
