/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.Constructor#getType <em>Type</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.Constructor#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Exp
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ComplexType)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getConstructor_Type()
   * @model containment="true"
   * @generated
   */
  ComplexType getType();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.Constructor#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ComplexType value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.Exp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getConstructor_Params()
   * @model containment="true"
   * @generated
   */
  EList<Exp> getParams();

} // Constructor
