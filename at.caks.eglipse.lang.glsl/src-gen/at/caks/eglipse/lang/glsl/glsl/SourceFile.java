/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getPre <em>Pre</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getUniforms <em>Uniforms</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getAttribs <em>Attribs</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getPrototypes <em>Prototypes</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getFunctions <em>Functions</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SourceFile#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile()
 * @model
 * @generated
 */
public interface SourceFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.PrecompilerStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Pre()
   * @model containment="true"
   * @generated
   */
  EList<PrecompilerStatement> getPre();

  /**
   * Returns the value of the '<em><b>Uniforms</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uniforms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uniforms</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Uniforms()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getUniforms();

  /**
   * Returns the value of the '<em><b>Attribs</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribs</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Attribs()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getAttribs();

  /**
   * Returns the value of the '<em><b>Prototypes</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prototypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prototypes</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Prototypes()
   * @model containment="true"
   * @generated
   */
  EList<FunctionPrototype> getPrototypes();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.FunctionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDefinition> getFunctions();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSourceFile_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariables();

} // SourceFile
