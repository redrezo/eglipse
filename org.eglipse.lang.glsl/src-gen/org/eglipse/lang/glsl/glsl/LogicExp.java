/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.LogicExp#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.LogicExp#getOp <em>Op</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.LogicExp#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getLogicExp()
 * @model
 * @generated
 */
public interface LogicExp extends Exp
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Exp)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getLogicExp_Left()
   * @model containment="true"
   * @generated
   */
  Exp getLeft();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.LogicExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Exp value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link org.eglipse.lang.glsl.glsl.LogicOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see org.eglipse.lang.glsl.glsl.LogicOp
   * @see #setOp(LogicOp)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getLogicExp_Op()
   * @model
   * @generated
   */
  LogicOp getOp();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.LogicExp#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see org.eglipse.lang.glsl.glsl.LogicOp
   * @see #getOp()
   * @generated
   */
  void setOp(LogicOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Exp)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getLogicExp_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.LogicExp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // LogicExp
