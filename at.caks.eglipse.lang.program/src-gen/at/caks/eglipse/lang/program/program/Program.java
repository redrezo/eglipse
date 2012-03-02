/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.program.program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.program.program.Program#getShader <em>Shader</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.program.program.ProgramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Shader</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.program.program.Shader}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shader</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shader</em>' containment reference list.
   * @see at.caks.eglipse.lang.program.program.ProgramPackage#getProgram_Shader()
   * @model containment="true"
   * @generated
   */
  EList<Shader> getShader();

} // Program
