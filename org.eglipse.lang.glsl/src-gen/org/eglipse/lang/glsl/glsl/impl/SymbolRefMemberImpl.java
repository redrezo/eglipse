/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eglipse.lang.glsl.glsl.GlslPackage;
import org.eglipse.lang.glsl.glsl.SymbolRef;
import org.eglipse.lang.glsl.glsl.SymbolRefMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Ref Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl#getSymbolref <em>Symbolref</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolRefMemberImpl extends ExpImpl implements SymbolRefMember
{
  /**
   * The cached value of the '{@link #getSymbolref() <em>Symbolref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbolref()
   * @generated
   * @ordered
   */
  protected SymbolRef symbolref;

  /**
   * The default value of the '{@link #getMember() <em>Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected static final String MEMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected String member = MEMBER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolRefMemberImpl()
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
    return GlslPackage.Literals.SYMBOL_REF_MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef getSymbolref()
  {
    return symbolref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSymbolref(SymbolRef newSymbolref, NotificationChain msgs)
  {
    SymbolRef oldSymbolref = symbolref;
    symbolref = newSymbolref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF, oldSymbolref, newSymbolref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbolref(SymbolRef newSymbolref)
  {
    if (newSymbolref != symbolref)
    {
      NotificationChain msgs = null;
      if (symbolref != null)
        msgs = ((InternalEObject)symbolref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF, null, msgs);
      if (newSymbolref != null)
        msgs = ((InternalEObject)newSymbolref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF, null, msgs);
      msgs = basicSetSymbolref(newSymbolref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF, newSymbolref, newSymbolref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(String newMember)
  {
    String oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SYMBOL_REF_MEMBER__MEMBER, oldMember, member));
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
      case GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF:
        return basicSetSymbolref(null, msgs);
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
      case GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF:
        return getSymbolref();
      case GlslPackage.SYMBOL_REF_MEMBER__MEMBER:
        return getMember();
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
      case GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF:
        setSymbolref((SymbolRef)newValue);
        return;
      case GlslPackage.SYMBOL_REF_MEMBER__MEMBER:
        setMember((String)newValue);
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
      case GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF:
        setSymbolref((SymbolRef)null);
        return;
      case GlslPackage.SYMBOL_REF_MEMBER__MEMBER:
        setMember(MEMBER_EDEFAULT);
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
      case GlslPackage.SYMBOL_REF_MEMBER__SYMBOLREF:
        return symbolref != null;
      case GlslPackage.SYMBOL_REF_MEMBER__MEMBER:
        return MEMBER_EDEFAULT == null ? member != null : !MEMBER_EDEFAULT.equals(member);
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
    result.append(" (member: ");
    result.append(member);
    result.append(')');
    return result.toString();
  }

} //SymbolRefMemberImpl
