/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.WhileStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.WhileStatement#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends Statement
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
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getWhileStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Exp getCondition();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.WhileStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Exp value);

  /**
   * Returns the value of the '<em><b>Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do</em>' containment reference.
   * @see #setDo(Statement)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getWhileStatement_Do()
   * @model containment="true"
   * @generated
   */
  Statement getDo();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.WhileStatement#getDo <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do</em>' containment reference.
   * @see #getDo()
   * @generated
   */
  void setDo(Statement value);

} // WhileStatement
