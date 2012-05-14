/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Ref Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getSymbolref <em>Symbolref</em>}</li>
 *   <li>{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getActuals <em>Actuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefInvocation()
 * @model
 * @generated
 */
public interface SymbolRefInvocation extends Exp
{
  /**
   * Returns the value of the '<em><b>Symbolref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbolref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbolref</em>' containment reference.
   * @see #setSymbolref(SymbolRef)
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefInvocation_Symbolref()
   * @model containment="true"
   * @generated
   */
  SymbolRef getSymbolref();

  /**
   * Sets the value of the '{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getSymbolref <em>Symbolref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbolref</em>' containment reference.
   * @see #getSymbolref()
   * @generated
   */
  void setSymbolref(SymbolRef value);

  /**
   * Returns the value of the '<em><b>Actuals</b></em>' containment reference list.
   * The list contents are of type {@link org.eglipse.lang.glsl.glsl.Exp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actuals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actuals</em>' containment reference list.
   * @see org.eglipse.lang.glsl.glsl.GlslPackage#getSymbolRefInvocation_Actuals()
   * @model containment="true"
   * @generated
   */
  EList<Exp> getActuals();

} // SymbolRefInvocation
