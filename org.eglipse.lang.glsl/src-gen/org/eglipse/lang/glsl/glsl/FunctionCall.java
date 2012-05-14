/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.FunctionCall#getName <em>Name</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.FunctionCall#getFunc <em>Func</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.FunctionCall#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getFunctionCall_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.FunctionCall#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Func</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Func</em>' reference.
   * @see #setFunc(FunctionDefinition)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getFunctionCall_Func()
   * @model
   * @generated
   */
  FunctionDefinition getFunc();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.FunctionCall#getFunc <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Func</em>' reference.
   * @see #getFunc()
   * @generated
   */
  void setFunc(FunctionDefinition value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.eglipse.lang.glsl.glsl.Exp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getFunctionCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Exp> getArgs();

} // FunctionCall
