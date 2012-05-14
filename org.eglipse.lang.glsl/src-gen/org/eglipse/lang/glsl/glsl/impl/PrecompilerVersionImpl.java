/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eglipse.lang.glsl.glsl.GlslPackage;
import org.eglipse.lang.glsl.glsl.PrecompilerVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precompiler Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrecompilerVersionImpl extends PrecompilerStatementImpl implements PrecompilerVersion
{
  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final int VERSION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected int version = VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfile()
   * @generated
   * @ordered
   */
  protected static final String PROFILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfile()
   * @generated
   * @ordered
   */
  protected String profile = PROFILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrecompilerVersionImpl()
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
    return GlslPackage.Literals.PRECOMPILER_VERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(int newVersion)
  {
    int oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.PRECOMPILER_VERSION__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProfile()
  {
    return profile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfile(String newProfile)
  {
    String oldProfile = profile;
    profile = newProfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GlslPackage.PRECOMPILER_VERSION__PROFILE, oldProfile, profile));
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
      case GlslPackage.PRECOMPILER_VERSION__VERSION:
        return getVersion();
      case GlslPackage.PRECOMPILER_VERSION__PROFILE:
        return getProfile();
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
      case GlslPackage.PRECOMPILER_VERSION__VERSION:
        setVersion((Integer)newValue);
        return;
      case GlslPackage.PRECOMPILER_VERSION__PROFILE:
        setProfile((String)newValue);
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
      case GlslPackage.PRECOMPILER_VERSION__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case GlslPackage.PRECOMPILER_VERSION__PROFILE:
        setProfile(PROFILE_EDEFAULT);
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
      case GlslPackage.PRECOMPILER_VERSION__VERSION:
        return version != VERSION_EDEFAULT;
      case GlslPackage.PRECOMPILER_VERSION__PROFILE:
        return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
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
    result.append(" (version: ");
    result.append(version);
    result.append(", profile: ");
    result.append(profile);
    result.append(')');
    return result.toString();
  }

} //PrecompilerVersionImpl
