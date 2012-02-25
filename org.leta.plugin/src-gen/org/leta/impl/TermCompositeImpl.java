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

import org.leta.LetaPackage;
import org.leta.Quantifier;
import org.leta.Term;
import org.leta.TermComposite;
import org.leta.TermInstance;
import org.leta.TermWithAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.TermCompositeImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link org.leta.impl.TermCompositeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.leta.impl.TermCompositeImpl#getTermInstance <em>Term Instance</em>}</li>
 *   <li>{@link org.leta.impl.TermCompositeImpl#getTermWithAssociation <em>Term With Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermCompositeImpl extends MinimalEObjectImpl.Container implements TermComposite
{
  /**
   * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantifier()
   * @generated
   * @ordered
   */
  protected Quantifier quantifier;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Term term;

  /**
   * The cached value of the '{@link #getTermInstance() <em>Term Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermInstance()
   * @generated
   * @ordered
   */
  protected TermInstance termInstance;

  /**
   * The cached value of the '{@link #getTermWithAssociation() <em>Term With Association</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTermWithAssociation()
   * @generated
   * @ordered
   */
  protected TermWithAssociation termWithAssociation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermCompositeImpl()
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
    return LetaPackage.Literals.TERM_COMPOSITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Quantifier getQuantifier()
  {
    return quantifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuantifier(Quantifier newQuantifier, NotificationChain msgs)
  {
    Quantifier oldQuantifier = quantifier;
    quantifier = newQuantifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__QUANTIFIER, oldQuantifier, newQuantifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantifier(Quantifier newQuantifier)
  {
    if (newQuantifier != quantifier)
    {
      NotificationChain msgs = null;
      if (quantifier != null)
        msgs = ((InternalEObject)quantifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__QUANTIFIER, null, msgs);
      if (newQuantifier != null)
        msgs = ((InternalEObject)newQuantifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__QUANTIFIER, null, msgs);
      msgs = basicSetQuantifier(newQuantifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__QUANTIFIER, newQuantifier, newQuantifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs)
  {
    Term oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Term newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermInstance getTermInstance()
  {
    return termInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermInstance(TermInstance newTermInstance, NotificationChain msgs)
  {
    TermInstance oldTermInstance = termInstance;
    termInstance = newTermInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM_INSTANCE, oldTermInstance, newTermInstance);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermInstance(TermInstance newTermInstance)
  {
    if (newTermInstance != termInstance)
    {
      NotificationChain msgs = null;
      if (termInstance != null)
        msgs = ((InternalEObject)termInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM_INSTANCE, null, msgs);
      if (newTermInstance != null)
        msgs = ((InternalEObject)newTermInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM_INSTANCE, null, msgs);
      msgs = basicSetTermInstance(newTermInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM_INSTANCE, newTermInstance, newTermInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermWithAssociation getTermWithAssociation()
  {
    return termWithAssociation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTermWithAssociation(TermWithAssociation newTermWithAssociation, NotificationChain msgs)
  {
    TermWithAssociation oldTermWithAssociation = termWithAssociation;
    termWithAssociation = newTermWithAssociation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION, oldTermWithAssociation, newTermWithAssociation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTermWithAssociation(TermWithAssociation newTermWithAssociation)
  {
    if (newTermWithAssociation != termWithAssociation)
    {
      NotificationChain msgs = null;
      if (termWithAssociation != null)
        msgs = ((InternalEObject)termWithAssociation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION, null, msgs);
      if (newTermWithAssociation != null)
        msgs = ((InternalEObject)newTermWithAssociation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION, null, msgs);
      msgs = basicSetTermWithAssociation(newTermWithAssociation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION, newTermWithAssociation, newTermWithAssociation));
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
      case LetaPackage.TERM_COMPOSITE__QUANTIFIER:
        return basicSetQuantifier(null, msgs);
      case LetaPackage.TERM_COMPOSITE__TERM:
        return basicSetTerm(null, msgs);
      case LetaPackage.TERM_COMPOSITE__TERM_INSTANCE:
        return basicSetTermInstance(null, msgs);
      case LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION:
        return basicSetTermWithAssociation(null, msgs);
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
      case LetaPackage.TERM_COMPOSITE__QUANTIFIER:
        return getQuantifier();
      case LetaPackage.TERM_COMPOSITE__TERM:
        return getTerm();
      case LetaPackage.TERM_COMPOSITE__TERM_INSTANCE:
        return getTermInstance();
      case LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION:
        return getTermWithAssociation();
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
      case LetaPackage.TERM_COMPOSITE__QUANTIFIER:
        setQuantifier((Quantifier)newValue);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM:
        setTerm((Term)newValue);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM_INSTANCE:
        setTermInstance((TermInstance)newValue);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION:
        setTermWithAssociation((TermWithAssociation)newValue);
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
      case LetaPackage.TERM_COMPOSITE__QUANTIFIER:
        setQuantifier((Quantifier)null);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM:
        setTerm((Term)null);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM_INSTANCE:
        setTermInstance((TermInstance)null);
        return;
      case LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION:
        setTermWithAssociation((TermWithAssociation)null);
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
      case LetaPackage.TERM_COMPOSITE__QUANTIFIER:
        return quantifier != null;
      case LetaPackage.TERM_COMPOSITE__TERM:
        return term != null;
      case LetaPackage.TERM_COMPOSITE__TERM_INSTANCE:
        return termInstance != null;
      case LetaPackage.TERM_COMPOSITE__TERM_WITH_ASSOCIATION:
        return termWithAssociation != null;
    }
    return super.eIsSet(featureID);
  }

} //TermCompositeImpl
