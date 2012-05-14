/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.Evaluation#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getEvaluation()
 * @model
 * @generated
 */
public interface Evaluation extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Exp)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getEvaluation_Expression()
   * @model containment="true"
   * @generated
   */
  Exp getExpression();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.Evaluation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Exp value);

} // Evaluation
