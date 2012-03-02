/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.BoolLiteral#isValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getBoolLiteral()
 * @model
 * @generated
 */
public interface BoolLiteral extends Exp
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(boolean)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getBoolLiteral_Value()
   * @model
   * @generated
   */
  boolean isValue();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.BoolLiteral#isValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #isValue()
   * @generated
   */
  void setValue(boolean value);

} // BoolLiteral
