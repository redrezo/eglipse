/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getCase <em>Case</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getFcase <em>Fcase</em>}</li>
 *   <li>{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' attribute.
   * @see #setCase(int)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSwitchCase_Case()
   * @model
   * @generated
   */
  int getCase();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getCase <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' attribute.
   * @see #getCase()
   * @generated
   */
  void setCase(int value);

  /**
   * Returns the value of the '<em><b>Fcase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fcase</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fcase</em>' attribute.
   * @see #setFcase(BigDecimal)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSwitchCase_Fcase()
   * @model
   * @generated
   */
  BigDecimal getFcase();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getFcase <em>Fcase</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fcase</em>' attribute.
   * @see #getFcase()
   * @generated
   */
  void setFcase(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Statement)
   * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage#getSwitchCase_Then()
   * @model containment="true"
   * @generated
   */
  Statement getThen();

  /**
   * Sets the value of the '{@link at.caks.eglipse.lang.glsl.glsl.SwitchCase#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Statement value);

} // SwitchCase
