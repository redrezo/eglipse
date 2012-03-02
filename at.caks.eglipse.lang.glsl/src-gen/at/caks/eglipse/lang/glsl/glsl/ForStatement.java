/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getA <em>A</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getB <em>B</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getC <em>C</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getForStatement()
 * @model
 * @generated
 */
public interface ForStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(EObject)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getForStatement_A()
   * @model containment="true"
   * @generated
   */
  EObject getA();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(EObject value);

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(Exp)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getForStatement_B()
   * @model containment="true"
   * @generated
   */
  Exp getB();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(Exp value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Exp)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getForStatement_C()
   * @model containment="true"
   * @generated
   */
  Exp getC();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Exp value);

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
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getForStatement_Do()
   * @model containment="true"
   * @generated
   */
  Statement getDo();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.ForStatement#getDo <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do</em>' containment reference.
   * @see #getDo()
   * @generated
   */
  void setDo(Statement value);

} // ForStatement
