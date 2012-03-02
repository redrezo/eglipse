/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.program.program;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.caks.eglipse.lang.program.program.ProgramFactory
 * @model kind="package"
 * @generated
 */
public interface ProgramPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "program";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.caks.at/eglipse/Program";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "program";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ProgramPackage eINSTANCE = at.caks.eglipse.lang.program.program.impl.ProgramPackageImpl.init();

  /**
   * The meta object id for the '{@link at.caks.eglipse.lang.program.program.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.caks.eglipse.lang.program.program.impl.ProgramImpl
   * @see at.caks.eglipse.lang.program.program.impl.ProgramPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Shader</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SHADER = 0;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.caks.eglipse.lang.program.program.impl.ShaderImpl <em>Shader</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.caks.eglipse.lang.program.program.impl.ShaderImpl
   * @see at.caks.eglipse.lang.program.program.impl.ProgramPackageImpl#getShader()
   * @generated
   */
  int SHADER = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADER__PATH = 0;

  /**
   * The number of structural features of the '<em>Shader</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADER_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.caks.eglipse.lang.program.program.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see at.caks.eglipse.lang.program.program.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the containment reference list '{@link at.caks.eglipse.lang.program.program.Program#getShader <em>Shader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shader</em>'.
   * @see at.caks.eglipse.lang.program.program.Program#getShader()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Shader();

  /**
   * Returns the meta object for class '{@link at.caks.eglipse.lang.program.program.Shader <em>Shader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shader</em>'.
   * @see at.caks.eglipse.lang.program.program.Shader
   * @generated
   */
  EClass getShader();

  /**
   * Returns the meta object for the attribute '{@link at.caks.eglipse.lang.program.program.Shader#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see at.caks.eglipse.lang.program.program.Shader#getPath()
   * @see #getShader()
   * @generated
   */
  EAttribute getShader_Path();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ProgramFactory getProgramFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.caks.eglipse.lang.program.program.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.caks.eglipse.lang.program.program.impl.ProgramImpl
     * @see at.caks.eglipse.lang.program.program.impl.ProgramPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Shader</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SHADER = eINSTANCE.getProgram_Shader();

    /**
     * The meta object literal for the '{@link at.caks.eglipse.lang.program.program.impl.ShaderImpl <em>Shader</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.caks.eglipse.lang.program.program.impl.ShaderImpl
     * @see at.caks.eglipse.lang.program.program.impl.ProgramPackageImpl#getShader()
     * @generated
     */
    EClass SHADER = eINSTANCE.getShader();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SHADER__PATH = eINSTANCE.getShader_Path();

  }

} //ProgramPackage
