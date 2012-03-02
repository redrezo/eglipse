/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Prototype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getType <em>Type</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getName <em>Name</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getParams <em>Params</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getFunctionPrototype()
 * @model
 * @generated
 */
public interface FunctionPrototype extends Symbol, FunctionDefinition
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getFunctionPrototype_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getFunctionPrototype_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.FunctionPrototype#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getFunctionPrototype_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link at.caks.eglipse.lang.glsl.glsl.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getFunctionPrototype_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // FunctionPrototype
