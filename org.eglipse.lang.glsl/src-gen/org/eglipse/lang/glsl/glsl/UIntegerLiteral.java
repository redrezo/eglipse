/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UInteger Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.UIntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getUIntegerLiteral()
 * @model
 * @generated
 */
public interface UIntegerLiteral extends Exp
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
   * @see #setValue(int)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getUIntegerLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.UIntegerLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // UIntegerLiteral
