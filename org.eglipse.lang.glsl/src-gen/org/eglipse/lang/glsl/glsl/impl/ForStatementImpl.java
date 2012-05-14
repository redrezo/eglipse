/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eglipse.lang.glsl.glsl.Exp;
import org.eglipse.lang.glsl.glsl.ForStatement;
import org.eglipse.lang.glsl.glsl.GlslPackage;
import org.eglipse.lang.glsl.glsl.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl#getA <em>A</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl#getC <em>C</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForStatementImpl extends StatementImpl implements ForStatement
{
  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected EObject a;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected Exp b;

  /**
   * The cached value of the '{@link #getC() <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getC()
   * @generated
   * @ordered
   */
  protected Exp c;

  /**
   * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected Statement do_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForStatementImpl()
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
    return GlslPackage.Literals.FOR_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(EObject newA, NotificationChain msgs)
  {
    EObject oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(EObject newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetB(Exp newB, NotificationChain msgs)
  {
    Exp oldB = b;
    b = newB;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__B, oldB, newB);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(Exp newB)
  {
    if (newB != b)
    {
      NotificationChain msgs = null;
      if (b != null)
        msgs = ((InternalEObject)b).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__B, null, msgs);
      if (newB != null)
        msgs = ((InternalEObject)newB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__B, null, msgs);
      msgs = basicSetB(newB, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__B, newB, newB));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp getC()
  {
    return c;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetC(Exp newC, NotificationChain msgs)
  {
    Exp oldC = c;
    c = newC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__C, oldC, newC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setC(Exp newC)
  {
    if (newC != c)
    {
      NotificationChain msgs = null;
      if (c != null)
        msgs = ((InternalEObject)c).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__C, null, msgs);
      if (newC != null)
        msgs = ((InternalEObject)newC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__C, null, msgs);
      msgs = basicSetC(newC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__C, newC, newC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getDo()
  {
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDo(Statement newDo, NotificationChain msgs)
  {
    Statement oldDo = do_;
    do_ = newDo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__DO, oldDo, newDo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDo(Statement newDo)
  {
    if (newDo != do_)
    {
      NotificationChain msgs = null;
      if (do_ != null)
        msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__DO, null, msgs);
      if (newDo != null)
        msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlslPackage.FOR_STATEMENT__DO, null, msgs);
      msgs = basicSetDo(newDo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.FOR_STATEMENT__DO, newDo, newDo));
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
      case GlslPackage.FOR_STATEMENT__A:
        return basicSetA(null, msgs);
      case GlslPackage.FOR_STATEMENT__B:
        return basicSetB(null, msgs);
      case GlslPackage.FOR_STATEMENT__C:
        return basicSetC(null, msgs);
      case GlslPackage.FOR_STATEMENT__DO:
        return basicSetDo(null, msgs);
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
      case GlslPackage.FOR_STATEMENT__A:
        return getA();
      case GlslPackage.FOR_STATEMENT__B:
        return getB();
      case GlslPackage.FOR_STATEMENT__C:
        return getC();
      case GlslPackage.FOR_STATEMENT__DO:
        return getDo();
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
      case GlslPackage.FOR_STATEMENT__A:
        setA((EObject)newValue);
        return;
      case GlslPackage.FOR_STATEMENT__B:
        setB((Exp)newValue);
        return;
      case GlslPackage.FOR_STATEMENT__C:
        setC((Exp)newValue);
        return;
      case GlslPackage.FOR_STATEMENT__DO:
        setDo((Statement)newValue);
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
      case GlslPackage.FOR_STATEMENT__A:
        setA((EObject)null);
        return;
      case GlslPackage.FOR_STATEMENT__B:
        setB((Exp)null);
        return;
      case GlslPackage.FOR_STATEMENT__C:
        setC((Exp)null);
        return;
      case GlslPackage.FOR_STATEMENT__DO:
        setDo((Statement)null);
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
      case GlslPackage.FOR_STATEMENT__A:
        return a != null;
      case GlslPackage.FOR_STATEMENT__B:
        return b != null;
      case GlslPackage.FOR_STATEMENT__C:
        return c != null;
      case GlslPackage.FOR_STATEMENT__DO:
        return do_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ForStatementImpl
