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
import org.leta.RelationalOperator;
import org.leta.Term;
import org.leta.TermWithAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term With Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.TermWithAssociationImpl#getT <em>T</em>}</li>
 *   <li>{@link org.leta.impl.TermWithAssociationImpl#getRo <em>Ro</em>}</li>
 *   <li>{@link org.leta.impl.TermWithAssociationImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermWithAssociationImpl extends MinimalEObjectImpl.Container implements TermWithAssociation
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
   * The cached value of the '{@link #getRo() <em>Ro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRo()
   * @generated
   * @ordered
   */
  protected RelationalOperator ro;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermWithAssociationImpl()
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
    return LetaPackage.Literals.TERM_WITH_ASSOCIATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_WITH_ASSOCIATION__T, oldT, newT);
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
        msgs = ((InternalEObject)t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_WITH_ASSOCIATION__T, null, msgs);
      if (newT != null)
        msgs = ((InternalEObject)newT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_WITH_ASSOCIATION__T, null, msgs);
      msgs = basicSetT(newT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_WITH_ASSOCIATION__T, newT, newT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOperator getRo()
  {
    return ro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRo(RelationalOperator newRo, NotificationChain msgs)
  {
    RelationalOperator oldRo = ro;
    ro = newRo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_WITH_ASSOCIATION__RO, oldRo, newRo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRo(RelationalOperator newRo)
  {
    if (newRo != ro)
    {
      NotificationChain msgs = null;
      if (ro != null)
        msgs = ((InternalEObject)ro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_WITH_ASSOCIATION__RO, null, msgs);
      if (newRo != null)
        msgs = ((InternalEObject)newRo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_WITH_ASSOCIATION__RO, null, msgs);
      msgs = basicSetRo(newRo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_WITH_ASSOCIATION__RO, newRo, newRo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_WITH_ASSOCIATION__INDEX, oldIndex, index));
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
      case LetaPackage.TERM_WITH_ASSOCIATION__T:
        return basicSetT(null, msgs);
      case LetaPackage.TERM_WITH_ASSOCIATION__RO:
        return basicSetRo(null, msgs);
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
      case LetaPackage.TERM_WITH_ASSOCIATION__T:
        return getT();
      case LetaPackage.TERM_WITH_ASSOCIATION__RO:
        return getRo();
      case LetaPackage.TERM_WITH_ASSOCIATION__INDEX:
        return getIndex();
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
      case LetaPackage.TERM_WITH_ASSOCIATION__T:
        setT((Term)newValue);
        return;
      case LetaPackage.TERM_WITH_ASSOCIATION__RO:
        setRo((RelationalOperator)newValue);
        return;
      case LetaPackage.TERM_WITH_ASSOCIATION__INDEX:
        setIndex((Integer)newValue);
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
      case LetaPackage.TERM_WITH_ASSOCIATION__T:
        setT((Term)null);
        return;
      case LetaPackage.TERM_WITH_ASSOCIATION__RO:
        setRo((RelationalOperator)null);
        return;
      case LetaPackage.TERM_WITH_ASSOCIATION__INDEX:
        setIndex(INDEX_EDEFAULT);
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
      case LetaPackage.TERM_WITH_ASSOCIATION__T:
        return t != null;
      case LetaPackage.TERM_WITH_ASSOCIATION__RO:
        return ro != null;
      case LetaPackage.TERM_WITH_ASSOCIATION__INDEX:
        return index != INDEX_EDEFAULT;
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
    result.append(" (index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //TermWithAssociationImpl
