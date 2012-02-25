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

import org.leta.FormulaExpression;
import org.leta.FormulaItem;
import org.leta.LetaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.FormulaExpressionImpl#getFi <em>Fi</em>}</li>
 *   <li>{@link org.leta.impl.FormulaExpressionImpl#getMo <em>Mo</em>}</li>
 *   <li>{@link org.leta.impl.FormulaExpressionImpl#getFe <em>Fe</em>}</li>
 *   <li>{@link org.leta.impl.FormulaExpressionImpl#getFe1 <em>Fe1</em>}</li>
 *   <li>{@link org.leta.impl.FormulaExpressionImpl#getFe2 <em>Fe2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormulaExpressionImpl extends MinimalEObjectImpl.Container implements FormulaExpression
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
   * The default value of the '{@link #getMo() <em>Mo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMo()
   * @generated
   * @ordered
   */
  protected static final String MO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMo() <em>Mo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMo()
   * @generated
   * @ordered
   */
  protected String mo = MO_EDEFAULT;

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
   * The cached value of the '{@link #getFe1() <em>Fe1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFe1()
   * @generated
   * @ordered
   */
  protected FormulaExpression fe1;

  /**
   * The cached value of the '{@link #getFe2() <em>Fe2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFe2()
   * @generated
   * @ordered
   */
  protected FormulaExpression fe2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormulaExpressionImpl()
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
    return LetaPackage.Literals.FORMULA_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FI, oldFi, newFi);
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
        msgs = ((InternalEObject)fi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FI, null, msgs);
      if (newFi != null)
        msgs = ((InternalEObject)newFi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FI, null, msgs);
      msgs = basicSetFi(newFi, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FI, newFi, newFi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMo()
  {
    return mo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMo(String newMo)
  {
    String oldMo = mo;
    mo = newMo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__MO, oldMo, mo));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE, oldFe, newFe);
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
        msgs = ((InternalEObject)fe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE, null, msgs);
      if (newFe != null)
        msgs = ((InternalEObject)newFe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE, null, msgs);
      msgs = basicSetFe(newFe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE, newFe, newFe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaExpression getFe1()
  {
    return fe1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFe1(FormulaExpression newFe1, NotificationChain msgs)
  {
    FormulaExpression oldFe1 = fe1;
    fe1 = newFe1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE1, oldFe1, newFe1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFe1(FormulaExpression newFe1)
  {
    if (newFe1 != fe1)
    {
      NotificationChain msgs = null;
      if (fe1 != null)
        msgs = ((InternalEObject)fe1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE1, null, msgs);
      if (newFe1 != null)
        msgs = ((InternalEObject)newFe1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE1, null, msgs);
      msgs = basicSetFe1(newFe1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE1, newFe1, newFe1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormulaExpression getFe2()
  {
    return fe2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFe2(FormulaExpression newFe2, NotificationChain msgs)
  {
    FormulaExpression oldFe2 = fe2;
    fe2 = newFe2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE2, oldFe2, newFe2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFe2(FormulaExpression newFe2)
  {
    if (newFe2 != fe2)
    {
      NotificationChain msgs = null;
      if (fe2 != null)
        msgs = ((InternalEObject)fe2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE2, null, msgs);
      if (newFe2 != null)
        msgs = ((InternalEObject)newFe2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FORMULA_EXPRESSION__FE2, null, msgs);
      msgs = basicSetFe2(newFe2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FORMULA_EXPRESSION__FE2, newFe2, newFe2));
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
      case LetaPackage.FORMULA_EXPRESSION__FI:
        return basicSetFi(null, msgs);
      case LetaPackage.FORMULA_EXPRESSION__FE:
        return basicSetFe(null, msgs);
      case LetaPackage.FORMULA_EXPRESSION__FE1:
        return basicSetFe1(null, msgs);
      case LetaPackage.FORMULA_EXPRESSION__FE2:
        return basicSetFe2(null, msgs);
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
      case LetaPackage.FORMULA_EXPRESSION__FI:
        return getFi();
      case LetaPackage.FORMULA_EXPRESSION__MO:
        return getMo();
      case LetaPackage.FORMULA_EXPRESSION__FE:
        return getFe();
      case LetaPackage.FORMULA_EXPRESSION__FE1:
        return getFe1();
      case LetaPackage.FORMULA_EXPRESSION__FE2:
        return getFe2();
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
      case LetaPackage.FORMULA_EXPRESSION__FI:
        setFi((FormulaItem)newValue);
        return;
      case LetaPackage.FORMULA_EXPRESSION__MO:
        setMo((String)newValue);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE:
        setFe((FormulaExpression)newValue);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE1:
        setFe1((FormulaExpression)newValue);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE2:
        setFe2((FormulaExpression)newValue);
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
      case LetaPackage.FORMULA_EXPRESSION__FI:
        setFi((FormulaItem)null);
        return;
      case LetaPackage.FORMULA_EXPRESSION__MO:
        setMo(MO_EDEFAULT);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE:
        setFe((FormulaExpression)null);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE1:
        setFe1((FormulaExpression)null);
        return;
      case LetaPackage.FORMULA_EXPRESSION__FE2:
        setFe2((FormulaExpression)null);
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
      case LetaPackage.FORMULA_EXPRESSION__FI:
        return fi != null;
      case LetaPackage.FORMULA_EXPRESSION__MO:
        return MO_EDEFAULT == null ? mo != null : !MO_EDEFAULT.equals(mo);
      case LetaPackage.FORMULA_EXPRESSION__FE:
        return fe != null;
      case LetaPackage.FORMULA_EXPRESSION__FE1:
        return fe1 != null;
      case LetaPackage.FORMULA_EXPRESSION__FE2:
        return fe2 != null;
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
    result.append(" (mo: ");
    result.append(mo);
    result.append(')');
    return result.toString();
  }

} //FormulaExpressionImpl
