/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl.impl;

import at.caks.eglipse.lang.glsl.glsl.Exp;
import at.caks.eglipse.lang.glsl.glsl.GlslPackage;
import at.caks.eglipse.lang.glsl.glsl.SymbolRef;
import at.caks.eglipse.lang.glsl.glsl.SymbolRefInvocation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Ref Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl#getSymbolref <em>Symbolref</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl#getActuals <em>Actuals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolRefInvocationImpl extends ExpImpl implements SymbolRefInvocation
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
   * The cached value of the '{@link #getActuals() <em>Actuals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActuals()
   * @generated
   * @ordered
   */
  protected EList<Exp> actuals;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolRefInvocationImpl()
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
    return GlslPackage.Literals.SYMBOL_REF_INVOCATION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF, oldSymbolref, newSymbolref);
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
        msgs = ((InternalEObject)symbolref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF, null, msgs);
      if (newSymbolref != null)
        msgs = ((InternalEObject)newSymbolref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF, null, msgs);
      msgs = basicSetSymbolref(newSymbolref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF, newSymbolref, newSymbolref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Exp> getActuals()
  {
    if (actuals == null)
    {
      actuals = new EObjectContainmentEList<Exp>(Exp.class, this, GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS);
    }
    return actuals;
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
      case GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF:
        return basicSetSymbolref(null, msgs);
      case GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS:
        return ((InternalEList<?>)getActuals()).basicRemove(otherEnd, msgs);
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
      case GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF:
        return getSymbolref();
      case GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS:
        return getActuals();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF:
        setSymbolref((SymbolRef)newValue);
        return;
      case GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS:
        getActuals().clear();
        getActuals().addAll((Collection<? extends Exp>)newValue);
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
      case GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF:
        setSymbolref((SymbolRef)null);
        return;
      case GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS:
        getActuals().clear();
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
      case GlslPackage.SYMBOL_REF_INVOCATION__SYMBOLREF:
        return symbolref != null;
      case GlslPackage.SYMBOL_REF_INVOCATION__ACTUALS:
        return actuals != null && !actuals.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SymbolRefInvocationImpl
