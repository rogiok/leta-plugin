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

import org.leta.Complement;
import org.leta.FactExt;
import org.leta.LetaPackage;
import org.leta.TermComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.FactExtImpl#getComplement <em>Complement</em>}</li>
 *   <li>{@link org.leta.impl.FactExtImpl#getTermComposite <em>Term Composite</em>}</li>
 *   <li>{@link org.leta.impl.FactExtImpl#getFactExt <em>Fact Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FactExtImpl extends MinimalEObjectImpl.Container implements FactExt
{
  /**
   * The cached value of the '{@link #getComplement() <em>Complement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplement()
   * @generated
   * @ordered
   */
  protected Complement complement;

  /**
   * The cached value of the '{@link #getTermComposite() <em>Term Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermComposite()
   * @generated
   * @ordered
   */
  protected TermComposite termComposite;

  /**
   * The cached value of the '{@link #getFactExt() <em>Fact Ext</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactExt()
   * @generated
   * @ordered
   */
  protected FactExt factExt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FactExtImpl()
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
    return LetaPackage.Literals.FACT_EXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Complement getComplement()
  {
    return complement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComplement(Complement newComplement, NotificationChain msgs)
  {
    Complement oldComplement = complement;
    complement = newComplement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__COMPLEMENT, oldComplement, newComplement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComplement(Complement newComplement)
  {
    if (newComplement != complement)
    {
      NotificationChain msgs = null;
      if (complement != null)
        msgs = ((InternalEObject)complement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__COMPLEMENT, null, msgs);
      if (newComplement != null)
        msgs = ((InternalEObject)newComplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__COMPLEMENT, null, msgs);
      msgs = basicSetComplement(newComplement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__COMPLEMENT, newComplement, newComplement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermComposite getTermComposite()
  {
    return termComposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermComposite(TermComposite newTermComposite, NotificationChain msgs)
  {
    TermComposite oldTermComposite = termComposite;
    termComposite = newTermComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__TERM_COMPOSITE, oldTermComposite, newTermComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermComposite(TermComposite newTermComposite)
  {
    if (newTermComposite != termComposite)
    {
      NotificationChain msgs = null;
      if (termComposite != null)
        msgs = ((InternalEObject)termComposite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__TERM_COMPOSITE, null, msgs);
      if (newTermComposite != null)
        msgs = ((InternalEObject)newTermComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__TERM_COMPOSITE, null, msgs);
      msgs = basicSetTermComposite(newTermComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__TERM_COMPOSITE, newTermComposite, newTermComposite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FactExt getFactExt()
  {
    return factExt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactExt(FactExt newFactExt, NotificationChain msgs)
  {
    FactExt oldFactExt = factExt;
    factExt = newFactExt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__FACT_EXT, oldFactExt, newFactExt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactExt(FactExt newFactExt)
  {
    if (newFactExt != factExt)
    {
      NotificationChain msgs = null;
      if (factExt != null)
        msgs = ((InternalEObject)factExt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__FACT_EXT, null, msgs);
      if (newFactExt != null)
        msgs = ((InternalEObject)newFactExt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_EXT__FACT_EXT, null, msgs);
      msgs = basicSetFactExt(newFactExt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_EXT__FACT_EXT, newFactExt, newFactExt));
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
      case LetaPackage.FACT_EXT__COMPLEMENT:
        return basicSetComplement(null, msgs);
      case LetaPackage.FACT_EXT__TERM_COMPOSITE:
        return basicSetTermComposite(null, msgs);
      case LetaPackage.FACT_EXT__FACT_EXT:
        return basicSetFactExt(null, msgs);
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
      case LetaPackage.FACT_EXT__COMPLEMENT:
        return getComplement();
      case LetaPackage.FACT_EXT__TERM_COMPOSITE:
        return getTermComposite();
      case LetaPackage.FACT_EXT__FACT_EXT:
        return getFactExt();
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
      case LetaPackage.FACT_EXT__COMPLEMENT:
        setComplement((Complement)newValue);
        return;
      case LetaPackage.FACT_EXT__TERM_COMPOSITE:
        setTermComposite((TermComposite)newValue);
        return;
      case LetaPackage.FACT_EXT__FACT_EXT:
        setFactExt((FactExt)newValue);
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
      case LetaPackage.FACT_EXT__COMPLEMENT:
        setComplement((Complement)null);
        return;
      case LetaPackage.FACT_EXT__TERM_COMPOSITE:
        setTermComposite((TermComposite)null);
        return;
      case LetaPackage.FACT_EXT__FACT_EXT:
        setFactExt((FactExt)null);
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
      case LetaPackage.FACT_EXT__COMPLEMENT:
        return complement != null;
      case LetaPackage.FACT_EXT__TERM_COMPOSITE:
        return termComposite != null;
      case LetaPackage.FACT_EXT__FACT_EXT:
        return factExt != null;
    }
    return super.eIsSet(featureID);
  }

} //FactExtImpl
