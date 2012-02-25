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
import org.leta.TermInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.leta.impl.TermInstanceImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.leta.impl.TermInstanceImpl#getNotEqualOperator <em>Not Equal Operator</em>}</li>
 *   <li>{@link org.leta.impl.TermInstanceImpl#getStringLiteral <em>String Literal</em>}</li>
 *   <li>{@link org.leta.impl.TermInstanceImpl#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.leta.impl.TermInstanceImpl#getOtherLiteral <em>Other Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermInstanceImpl extends MinimalEObjectImpl.Container implements TermInstance
{
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
   * The default value of the '{@link #getNotEqualOperator() <em>Not Equal Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotEqualOperator()
   * @generated
   * @ordered
   */
  protected static final String NOT_EQUAL_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNotEqualOperator() <em>Not Equal Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotEqualOperator()
   * @generated
   * @ordered
   */
  protected String notEqualOperator = NOT_EQUAL_OPERATOR_EDEFAULT;

  /**
   * The default value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringLiteral()
   * @generated
   * @ordered
   */
  protected static final String STRING_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringLiteral() <em>String Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringLiteral()
   * @generated
   * @ordered
   */
  protected String stringLiteral = STRING_LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getRelationalOperator() <em>Relational Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationalOperator()
   * @generated
   * @ordered
   */
  protected RelationalOperator relationalOperator;

  /**
   * The default value of the '{@link #getOtherLiteral() <em>Other Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherLiteral()
   * @generated
   * @ordered
   */
  protected static final String OTHER_LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOtherLiteral() <em>Other Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOtherLiteral()
   * @generated
   * @ordered
   */
  protected String otherLiteral = OTHER_LITERAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TermInstanceImpl()
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
    return LetaPackage.Literals.TERM_INSTANCE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__TERM, oldTerm, newTerm);
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
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_INSTANCE__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_INSTANCE__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNotEqualOperator()
  {
    return notEqualOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotEqualOperator(String newNotEqualOperator)
  {
    String oldNotEqualOperator = notEqualOperator;
    notEqualOperator = newNotEqualOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__NOT_EQUAL_OPERATOR, oldNotEqualOperator, notEqualOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringLiteral()
  {
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringLiteral(String newStringLiteral)
  {
    String oldStringLiteral = stringLiteral;
    stringLiteral = newStringLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__STRING_LITERAL, oldStringLiteral, stringLiteral));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalOperator getRelationalOperator()
  {
    return relationalOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationalOperator(RelationalOperator newRelationalOperator, NotificationChain msgs)
  {
    RelationalOperator oldRelationalOperator = relationalOperator;
    relationalOperator = newRelationalOperator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR, oldRelationalOperator, newRelationalOperator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationalOperator(RelationalOperator newRelationalOperator)
  {
    if (newRelationalOperator != relationalOperator)
    {
      NotificationChain msgs = null;
      if (relationalOperator != null)
        msgs = ((InternalEObject)relationalOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR, null, msgs);
      if (newRelationalOperator != null)
        msgs = ((InternalEObject)newRelationalOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR, null, msgs);
      msgs = basicSetRelationalOperator(newRelationalOperator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR, newRelationalOperator, newRelationalOperator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOtherLiteral()
  {
    return otherLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOtherLiteral(String newOtherLiteral)
  {
    String oldOtherLiteral = otherLiteral;
    otherLiteral = newOtherLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LetaPackage.TERM_INSTANCE__OTHER_LITERAL, oldOtherLiteral, otherLiteral));
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
      case LetaPackage.TERM_INSTANCE__TERM:
        return basicSetTerm(null, msgs);
      case LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR:
        return basicSetRelationalOperator(null, msgs);
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
      case LetaPackage.TERM_INSTANCE__TERM:
        return getTerm();
      case LetaPackage.TERM_INSTANCE__NOT_EQUAL_OPERATOR:
        return getNotEqualOperator();
      case LetaPackage.TERM_INSTANCE__STRING_LITERAL:
        return getStringLiteral();
      case LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR:
        return getRelationalOperator();
      case LetaPackage.TERM_INSTANCE__OTHER_LITERAL:
        return getOtherLiteral();
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
      case LetaPackage.TERM_INSTANCE__TERM:
        setTerm((Term)newValue);
        return;
      case LetaPackage.TERM_INSTANCE__NOT_EQUAL_OPERATOR:
        setNotEqualOperator((String)newValue);
        return;
      case LetaPackage.TERM_INSTANCE__STRING_LITERAL:
        setStringLiteral((String)newValue);
        return;
      case LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR:
        setRelationalOperator((RelationalOperator)newValue);
        return;
      case LetaPackage.TERM_INSTANCE__OTHER_LITERAL:
        setOtherLiteral((String)newValue);
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
      case LetaPackage.TERM_INSTANCE__TERM:
        setTerm((Term)null);
        return;
      case LetaPackage.TERM_INSTANCE__NOT_EQUAL_OPERATOR:
        setNotEqualOperator(NOT_EQUAL_OPERATOR_EDEFAULT);
        return;
      case LetaPackage.TERM_INSTANCE__STRING_LITERAL:
        setStringLiteral(STRING_LITERAL_EDEFAULT);
        return;
      case LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR:
        setRelationalOperator((RelationalOperator)null);
        return;
      case LetaPackage.TERM_INSTANCE__OTHER_LITERAL:
        setOtherLiteral(OTHER_LITERAL_EDEFAULT);
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
      case LetaPackage.TERM_INSTANCE__TERM:
        return term != null;
      case LetaPackage.TERM_INSTANCE__NOT_EQUAL_OPERATOR:
        return NOT_EQUAL_OPERATOR_EDEFAULT == null ? notEqualOperator != null : !NOT_EQUAL_OPERATOR_EDEFAULT.equals(notEqualOperator);
      case LetaPackage.TERM_INSTANCE__STRING_LITERAL:
        return STRING_LITERAL_EDEFAULT == null ? stringLiteral != null : !STRING_LITERAL_EDEFAULT.equals(stringLiteral);
      case LetaPackage.TERM_INSTANCE__RELATIONAL_OPERATOR:
        return relationalOperator != null;
      case LetaPackage.TERM_INSTANCE__OTHER_LITERAL:
        return OTHER_LITERAL_EDEFAULT == null ? otherLiteral != null : !OTHER_LITERAL_EDEFAULT.equals(otherLiteral);
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
    result.append(" (notEqualOperator: ");
    result.append(notEqualOperator);
    result.append(", stringLiteral: ");
    result.append(stringLiteral);
    result.append(", otherLiteral: ");
    result.append(otherLiteral);
    result.append(')');
    return result.toString();
  }

} //TermInstanceImpl
