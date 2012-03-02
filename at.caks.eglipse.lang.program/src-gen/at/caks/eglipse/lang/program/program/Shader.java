/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.program.program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.program.program.Shader#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.program.program.ProgramPackage#getShader()
 * @model
 * @generated
 */
public interface Shader extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see at.caks.eglipse.lang.program.program.ProgramPackage#getShader_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.program.program.Shader#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

} // Shader
