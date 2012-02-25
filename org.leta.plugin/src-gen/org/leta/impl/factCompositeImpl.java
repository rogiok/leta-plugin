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

import org.leta.Fact;
import org.leta.Formula;
import org.leta.LetaPackage;
import org.leta.factComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fact Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.factCompositeImpl#getF <em>F</em>}</li>
 *   <li>{@link org.leta.impl.factCompositeImpl#getFo <em>Fo</em>}</li>
 *   <li>{@link org.leta.impl.factCompositeImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.leta.impl.factCompositeImpl#getFc <em>Fc</em>}</li>
 *   <li>{@link org.leta.impl.factCompositeImpl#getFc1 <em>Fc1</em>}</li>
 *   <li>{@link org.leta.impl.factCompositeImpl#getFc2 <em>Fc2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class factCompositeImpl extends MinimalEObjectImpl.Container implements factComposite
{
  /**
   * The cached value of the '{@link #getF() <em>F</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected Fact f;

  /**
   * The cached value of the '{@link #getFo() <em>Fo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFo()
   * @generated
   * @ordered
   */
  protected Formula fo;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getFc() <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc()
   * @generated
   * @ordered
   */
  protected factComposite fc;

  /**
   * The cached value of the '{@link #getFc1() <em>Fc1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc1()
   * @generated
   * @ordered
   */
  protected factComposite fc1;

  /**
   * The cached value of the '{@link #getFc2() <em>Fc2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFc2()
   * @generated
   * @ordered
   */
  protected factComposite fc2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected factCompositeImpl()
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
    return LetaPackage.Literals.FACT_COMPOSITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fact getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetF(Fact newF, NotificationChain msgs)
  {
    Fact oldF = f;
    f = newF;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__F, oldF, newF);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(Fact newF)
  {
    if (newF != f)
    {
      NotificationChain msgs = null;
      if (f != null)
        msgs = ((InternalEObject)f).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__F, null, msgs);
      if (newF != null)
        msgs = ((InternalEObject)newF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__F, null, msgs);
      msgs = basicSetF(newF, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__F, newF, newF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formula getFo()
  {
    return fo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFo(Formula newFo, NotificationChain msgs)
  {
    Formula oldFo = fo;
    fo = newFo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FO, oldFo, newFo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFo(Formula newFo)
  {
    if (newFo != fo)
    {
      NotificationChain msgs = null;
      if (fo != null)
        msgs = ((InternalEObject)fo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FO, null, msgs);
      if (newFo != null)
        msgs = ((InternalEObject)newFo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FO, null, msgs);
      msgs = basicSetFo(newFo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FO, newFo, newFo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factComposite getFc()
  {
    return fc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc(factComposite newFc, NotificationChain msgs)
  {
    factComposite oldFc = fc;
    fc = newFc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC, oldFc, newFc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc(factComposite newFc)
  {
    if (newFc != fc)
    {
      NotificationChain msgs = null;
      if (fc != null)
        msgs = ((InternalEObject)fc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC, null, msgs);
      if (newFc != null)
        msgs = ((InternalEObject)newFc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC, null, msgs);
      msgs = basicSetFc(newFc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC, newFc, newFc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factComposite getFc1()
  {
    return fc1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc1(factComposite newFc1, NotificationChain msgs)
  {
    factComposite oldFc1 = fc1;
    fc1 = newFc1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC1, oldFc1, newFc1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc1(factComposite newFc1)
  {
    if (newFc1 != fc1)
    {
      NotificationChain msgs = null;
      if (fc1 != null)
        msgs = ((InternalEObject)fc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC1, null, msgs);
      if (newFc1 != null)
        msgs = ((InternalEObject)newFc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC1, null, msgs);
      msgs = basicSetFc1(newFc1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC1, newFc1, newFc1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factComposite getFc2()
  {
    return fc2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFc2(factComposite newFc2, NotificationChain msgs)
  {
    factComposite oldFc2 = fc2;
    fc2 = newFc2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC2, oldFc2, newFc2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFc2(factComposite newFc2)
  {
    if (newFc2 != fc2)
    {
      NotificationChain msgs = null;
      if (fc2 != null)
        msgs = ((InternalEObject)fc2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC2, null, msgs);
      if (newFc2 != null)
        msgs = ((InternalEObject)newFc2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.FACT_COMPOSITE__FC2, null, msgs);
      msgs = basicSetFc2(newFc2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.FACT_COMPOSITE__FC2, newFc2, newFc2));
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
      case LetaPackage.FACT_COMPOSITE__F:
        return basicSetF(null, msgs);
      case LetaPackage.FACT_COMPOSITE__FO:
        return basicSetFo(null, msgs);
      case LetaPackage.FACT_COMPOSITE__FC:
        return basicSetFc(null, msgs);
      case LetaPackage.FACT_COMPOSITE__FC1:
        return basicSetFc1(null, msgs);
      case LetaPackage.FACT_COMPOSITE__FC2:
        return basicSetFc2(null, msgs);
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
      case LetaPackage.FACT_COMPOSITE__F:
        return getF();
      case LetaPackage.FACT_COMPOSITE__FO:
        return getFo();
      case LetaPackage.FACT_COMPOSITE__OP:
        return getOp();
      case LetaPackage.FACT_COMPOSITE__FC:
        return getFc();
      case LetaPackage.FACT_COMPOSITE__FC1:
        return getFc1();
      case LetaPackage.FACT_COMPOSITE__FC2:
        return getFc2();
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
      case LetaPackage.FACT_COMPOSITE__F:
        setF((Fact)newValue);
        return;
      case LetaPackage.FACT_COMPOSITE__FO:
        setFo((Formula)newValue);
        return;
      case LetaPackage.FACT_COMPOSITE__OP:
        setOp((String)newValue);
        return;
      case LetaPackage.FACT_COMPOSITE__FC:
        setFc((factComposite)newValue);
        return;
      case LetaPackage.FACT_COMPOSITE__FC1:
        setFc1((factComposite)newValue);
        return;
      case LetaPackage.FACT_COMPOSITE__FC2:
        setFc2((factComposite)newValue);
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
      case LetaPackage.FACT_COMPOSITE__F:
        setF((Fact)null);
        return;
      case LetaPackage.FACT_COMPOSITE__FO:
        setFo((Formula)null);
        return;
      case LetaPackage.FACT_COMPOSITE__OP:
        setOp(OP_EDEFAULT);
        return;
      case LetaPackage.FACT_COMPOSITE__FC:
        setFc((factComposite)null);
        return;
      case LetaPackage.FACT_COMPOSITE__FC1:
        setFc1((factComposite)null);
        return;
      case LetaPackage.FACT_COMPOSITE__FC2:
        setFc2((factComposite)null);
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
      case LetaPackage.FACT_COMPOSITE__F:
        return f != null;
      case LetaPackage.FACT_COMPOSITE__FO:
        return fo != null;
      case LetaPackage.FACT_COMPOSITE__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case LetaPackage.FACT_COMPOSITE__FC:
        return fc != null;
      case LetaPackage.FACT_COMPOSITE__FC1:
        return fc1 != null;
      case LetaPackage.FACT_COMPOSITE__FC2:
        return fc2 != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //factCompositeImpl
