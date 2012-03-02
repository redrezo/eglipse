/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Ref Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SymbolRefMember#getSymbolref <em>Symbolref</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SymbolRefMember#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefMember()
 * @model
 * @generated
 */
public interface SymbolRefMember extends Exp
{
  /**
   * Returns the value of the '<em><b>Symbolref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolref</em>' containment reference.
   * @see #setSymbolref(SymbolRef)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefMember_Symbolref()
   * @model containment="true"
   * @generated
   */
  SymbolRef getSymbolref();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.SymbolRefMember#getSymbolref <em>Symbolref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolref</em>' containment reference.
   * @see #getSymbolref()
   * @generated
   */
  void setSymbolref(SymbolRef value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' attribute.
   * @see #setMember(String)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefMember_Member()
   * @model
   * @generated
   */
  String getMember();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.SymbolRefMember#getMember <em>Member</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' attribute.
   * @see #getMember()
   * @generated
   */
  void setMember(String value);

} // SymbolRefMember
