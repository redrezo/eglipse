/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.AssignmentStatement#getVariable <em>Variable</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.AssignmentStatement#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getAssignmentStatement()
 * @model
 * @generated
 */
public interface AssignmentStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Symbol)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getAssignmentStatement_Variable()
   * @model
   * @generated
   */
  Symbol getVariable();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.AssignmentStatement#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Symbol value);

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
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getAssignmentStatement_Right()
   * @model containment="true"
   * @generated
   */
  Exp getRight();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.AssignmentStatement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Exp value);

} // AssignmentStatement
