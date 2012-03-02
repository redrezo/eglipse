/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precompiler Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.PrecompilerVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.PrecompilerVersion#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getPrecompilerVersion()
 * @model
 * @generated
 */
public interface PrecompilerVersion extends PrecompilerStatement
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(int)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getPrecompilerVersion_Version()
   * @model
   * @generated
   */
  int getVersion();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.PrecompilerVersion#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(int value);

  /**
   * Returns the value of the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' attribute.
   * @see #setProfile(String)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getPrecompilerVersion_Profile()
   * @model
   * @generated
   */
  String getProfile();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.PrecompilerVersion#getProfile <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' attribute.
   * @see #getProfile()
   * @generated
   */
  void setProfile(String value);

} // PrecompilerVersion
