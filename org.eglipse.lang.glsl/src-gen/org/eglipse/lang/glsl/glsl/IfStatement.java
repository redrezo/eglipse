/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.IfStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.IfStatement#getThen <em>Then</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.IfStatement#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Exp)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getIfStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Exp getCondition();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.IfStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Exp value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Statement)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getIfStatement_Then()
   * @model containment="true"
   * @generated
   */
  Statement getThen();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.IfStatement#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Statement value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(Statement)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getIfStatement_Else()
   * @model containment="true"
   * @generated
   */
  Statement getElse();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.IfStatement#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(Statement value);

} // IfStatement
