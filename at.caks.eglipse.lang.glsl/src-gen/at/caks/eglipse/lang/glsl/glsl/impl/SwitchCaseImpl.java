/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl.impl;

import at.caks.eglipse.lang.glsl.glsl.GlslPackage;
import at.caks.eglipse.lang.glsl.glsl.Statement;
import at.caks.eglipse.lang.glsl.glsl.SwitchCase;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl#getCase <em>Case</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl#getFcase <em>Fcase</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchCaseImpl extends MinimalEObjectImpl.Container implements SwitchCase
{
  /**
   * The default value of the '{@link #getCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected static final int CASE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected int case_ = CASE_EDEFAULT;

  /**
   * The default value of the '{@link #getFcase() <em>Fcase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFcase()
   * @generated
   * @ordered
   */
  protected static final BigDecimal FCASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFcase() <em>Fcase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFcase()
   * @generated
   * @ordered
   */
  protected BigDecimal fcase = FCASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Statement then;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchCaseImpl()
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
    return GlslPackage.Literals.SWITCH_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(int newCase)
  {
    int oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SWITCH_CASE__CASE, oldCase, case_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getFcase()
  {
    return fcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFcase(BigDecimal newFcase)
  {
    BigDecimal oldFcase = fcase;
    fcase = newFcase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SWITCH_CASE__FCASE, oldFcase, fcase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Statement newThen, NotificationChain msgs)
  {
    Statement oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.SWITCH_CASE__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(Statement newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SWITCH_CASE__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SWITCH_CASE__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SWITCH_CASE__THEN, newThen, newThen));
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
      case GlslPackage.SWITCH_CASE__THEN:
        return basicSetThen(null, msgs);
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
      case GlslPackage.SWITCH_CASE__CASE:
        return getCase();
      case GlslPackage.SWITCH_CASE__FCASE:
        return getFcase();
      case GlslPackage.SWITCH_CASE__THEN:
        return getThen();
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
      case GlslPackage.SWITCH_CASE__CASE:
        setCase((Integer)newValue);
        return;
      case GlslPackage.SWITCH_CASE__FCASE:
        setFcase((BigDecimal)newValue);
        return;
      case GlslPackage.SWITCH_CASE__THEN:
        setThen((Statement)newValue);
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
      case GlslPackage.SWITCH_CASE__CASE:
        setCase(CASE_EDEFAULT);
        return;
      case GlslPackage.SWITCH_CASE__FCASE:
        setFcase(FCASE_EDEFAULT);
        return;
      case GlslPackage.SWITCH_CASE__THEN:
        setThen((Statement)null);
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
      case GlslPackage.SWITCH_CASE__CASE:
        return case_ != CASE_EDEFAULT;
      case GlslPackage.SWITCH_CASE__FCASE:
        return FCASE_EDEFAULT == null ? fcase != null : !FCASE_EDEFAULT.equals(fcase);
      case GlslPackage.SWITCH_CASE__THEN:
        return then != null;
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
    result.append(" (case: ");
    result.append(case_);
    result.append(", fcase: ");
    result.append(fcase);
    result.append(')');
    return result.toString();
  }

} //SwitchCaseImpl
