/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eglipse.lang.glsl.glsl.GlslFactory
 * @model kind="package"
 * @generated
 */
public interface GlslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "glsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eglipse.org/lang/Glsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "glsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GlslPackage eINSTANCE = org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl <em>Source File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SourceFileImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSourceFile()
   * @generated
   */
  int SOURCE_FILE = 0;

  /**
   * The feature id for the '<em><b>Pre</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__PRE = 0;

  /**
   * The feature id for the '<em><b>Uniforms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__UNIFORMS = 1;

  /**
   * The feature id for the '<em><b>Attribs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__ATTRIBS = 2;

  /**
   * The feature id for the '<em><b>Prototypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__PROTOTYPES = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__FUNCTIONS = 4;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE__VARIABLES = 5;

  /**
   * The number of structural features of the '<em>Source File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FILE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerStatementImpl <em>Precompiler Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.PrecompilerStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getPrecompilerStatement()
   * @generated
   */
  int PRECOMPILER_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Precompiler Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECOMPILER_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl <em>Precompiler Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getPrecompilerVersion()
   * @generated
   */
  int PRECOMPILER_VERSION = 2;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECOMPILER_VERSION__VERSION = PRECOMPILER_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECOMPILER_VERSION__PROFILE = PRECOMPILER_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Precompiler Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRECOMPILER_VERSION_FEATURE_COUNT = PRECOMPILER_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SymbolImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 3;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionPrototypeImpl <em>Function Prototype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.FunctionPrototypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionPrototype()
   * @generated
   */
  int FUNCTION_PROTOTYPE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__NAME = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__PARAMS = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE__STATEMENTS = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Function Prototype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PROTOTYPE_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ParameterImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getType()
   * @generated
   */
  int TYPE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ScalarTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getScalarType()
   * @generated
   */
  int SCALAR_TYPE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Scalar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCALAR_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ComplexTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.VecTypeImpl <em>Vec Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.VecTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVecType()
   * @generated
   */
  int VEC_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Vec Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.MatTypeImpl <em>Mat Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.MatTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMatType()
   * @generated
   */
  int MAT_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT_TYPE__NAME = COMPLEX_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT_TYPE_FEATURE_COUNT = COMPLEX_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.FunctionDefinitionImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 11;

  /**
   * The number of structural features of the '<em>Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.FunctionCallImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__NAME = 0;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNC = 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = 2;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.StatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 13;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 14;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__CASE = 0;

  /**
   * The feature id for the '<em><b>Fcase</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__FCASE = 1;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__THEN = 2;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BlockStatementImpl <em>Block Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BlockStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBlockStatement()
   * @generated
   */
  int BLOCK_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.JumpStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getJumpStatement()
   * @generated
   */
  int JUMP_STATEMENT = 16;

  /**
   * The number of structural features of the '<em>Jump Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JUMP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.VariableDeclarationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__INIT = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.AssignmentStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__RIGHT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ExpImpl <em>Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ExpImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getExp()
   * @generated
   */
  int EXP = 19;

  /**
   * The number of structural features of the '<em>Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.AbstractDefinitionImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAbstractDefinition()
   * @generated
   */
  int ABSTRACT_DEFINITION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.DefinitionImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = ABSTRACT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__ARGS = ABSTRACT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = ABSTRACT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.DeclaredParameterImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getDeclaredParameter()
   * @generated
   */
  int DECLARED_PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_PARAMETER__NAME = ABSTRACT_DEFINITION__NAME;

  /**
   * The number of structural features of the '<em>Declared Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARED_PARAMETER_FEATURE_COUNT = ABSTRACT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.EvaluationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UniformDeclarationImpl <em>Uniform Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UniformDeclarationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUniformDeclaration()
   * @generated
   */
  int UNIFORM_DECLARATION = 24;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_DECLARATION__QUALIFIER = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_DECLARATION__NAME = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Uniform Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIFORM_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.InAttributeDeclarationImpl <em>In Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.InAttributeDeclarationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInAttributeDeclaration()
   * @generated
   */
  int IN_ATTRIBUTE_DECLARATION = 25;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ATTRIBUTE_DECLARATION__QUALIFIER = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ATTRIBUTE_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ATTRIBUTE_DECLARATION__NAME = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>In Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_ATTRIBUTE_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.OutAttributeDeclarationImpl <em>Out Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.OutAttributeDeclarationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getOutAttributeDeclaration()
   * @generated
   */
  int OUT_ATTRIBUTE_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_ATTRIBUTE_DECLARATION__QUALIFIER = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_ATTRIBUTE_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_ATTRIBUTE_DECLARATION__NAME = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Out Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUT_ATTRIBUTE_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.InOutAttributeDeclarationImpl <em>In Out Attribute Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.InOutAttributeDeclarationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInOutAttributeDeclaration()
   * @generated
   */
  int IN_OUT_ATTRIBUTE_DECLARATION = 27;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_ATTRIBUTE_DECLARATION__QUALIFIER = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_ATTRIBUTE_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_ATTRIBUTE_DECLARATION__NAME = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>In Out Attribute Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_OUT_ATTRIBUTE_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.VoidTypeImpl <em>Void Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.VoidTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVoidType()
   * @generated
   */
  int VOID_TYPE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Void Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOID_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IntTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE__NAME = SCALAR_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UIntTypeImpl <em>UInt Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UIntTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUIntType()
   * @generated
   */
  int UINT_TYPE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINT_TYPE__NAME = SCALAR_TYPE__NAME;

  /**
   * The number of structural features of the '<em>UInt Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINT_TYPE_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BoolTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE__NAME = SCALAR_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.FloatTypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE__NAME = SCALAR_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = SCALAR_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Vec2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec2Type()
   * @generated
   */
  int VEC2_TYPE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC2_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Vec2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC2_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec3TypeImpl <em>Vec3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Vec3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec3Type()
   * @generated
   */
  int VEC3_TYPE = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC3_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Vec3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC3_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec4TypeImpl <em>Vec4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Vec4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec4Type()
   * @generated
   */
  int VEC4_TYPE = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC4_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Vec4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VEC4_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec2TypeImpl <em>IVec2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IVec2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec2Type()
   * @generated
   */
  int IVEC2_TYPE = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC2_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>IVec2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC2_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec3TypeImpl <em>IVec3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IVec3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec3Type()
   * @generated
   */
  int IVEC3_TYPE = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC3_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>IVec3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC3_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec4TypeImpl <em>IVec4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IVec4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec4Type()
   * @generated
   */
  int IVEC4_TYPE = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC4_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>IVec4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IVEC4_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec2TypeImpl <em>UVec2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UVec2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec2Type()
   * @generated
   */
  int UVEC2_TYPE = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC2_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>UVec2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC2_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec3TypeImpl <em>UVec3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UVec3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec3Type()
   * @generated
   */
  int UVEC3_TYPE = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC3_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>UVec3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC3_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec4TypeImpl <em>UVec4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UVec4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec4Type()
   * @generated
   */
  int UVEC4_TYPE = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC4_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>UVec4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UVEC4_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec2TypeImpl <em>BVec2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BVec2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec2Type()
   * @generated
   */
  int BVEC2_TYPE = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC2_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>BVec2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC2_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec3TypeImpl <em>BVec3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BVec3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec3Type()
   * @generated
   */
  int BVEC3_TYPE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC3_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>BVec3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC3_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec4TypeImpl <em>BVec4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BVec4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec4Type()
   * @generated
   */
  int BVEC4_TYPE = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC4_TYPE__NAME = VEC_TYPE__NAME;

  /**
   * The number of structural features of the '<em>BVec4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BVEC4_TYPE_FEATURE_COUNT = VEC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2TypeImpl <em>Mat2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2Type()
   * @generated
   */
  int MAT2_TYPE = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3TypeImpl <em>Mat3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3Type()
   * @generated
   */
  int MAT3_TYPE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4TypeImpl <em>Mat4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4Type()
   * @generated
   */
  int MAT4_TYPE = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x2TypeImpl <em>Mat2x2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat2x2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x2Type()
   * @generated
   */
  int MAT2X2_TYPE = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X2_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat2x2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X2_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x3TypeImpl <em>Mat2x3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat2x3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x3Type()
   * @generated
   */
  int MAT2X3_TYPE = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X3_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat2x3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X3_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x4TypeImpl <em>Mat2x4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat2x4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x4Type()
   * @generated
   */
  int MAT2X4_TYPE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X4_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat2x4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT2X4_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x2TypeImpl <em>Mat3x2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat3x2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x2Type()
   * @generated
   */
  int MAT3X2_TYPE = 51;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X2_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat3x2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X2_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x3TypeImpl <em>Mat3x3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat3x3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x3Type()
   * @generated
   */
  int MAT3X3_TYPE = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X3_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat3x3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X3_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x4TypeImpl <em>Mat3x4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat3x4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x4Type()
   * @generated
   */
  int MAT3X4_TYPE = 53;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X4_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat3x4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT3X4_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x2TypeImpl <em>Mat4x2 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat4x2TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x2Type()
   * @generated
   */
  int MAT4X2_TYPE = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X2_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat4x2 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X2_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x3TypeImpl <em>Mat4x3 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat4x3TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x3Type()
   * @generated
   */
  int MAT4X3_TYPE = 55;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X3_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat4x3 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X3_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x4TypeImpl <em>Mat4x4 Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.Mat4x4TypeImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x4Type()
   * @generated
   */
  int MAT4X4_TYPE = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X4_TYPE__NAME = MAT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Mat4x4 Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAT4X4_TYPE_FEATURE_COUNT = MAT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 57;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__SYMBOL = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__ACTUALS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IfStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 58;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__THEN = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.WhileStatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.WhileStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getWhileStatement()
   * @generated
   */
  int WHILE_STATEMENT = 59;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__DO = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ForStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getForStatement()
   * @generated
   */
  int FOR_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__A = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__B = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__C = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__DO = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SwitchStatementImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSwitchStatement()
   * @generated
   */
  int SWITCH_STATEMENT = 61;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__A = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ReturnImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 62;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__VALUE = JUMP_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = JUMP_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.InlineIfExpImpl <em>Inline If Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.InlineIfExpImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInlineIfExp()
   * @generated
   */
  int INLINE_IF_EXP = 63;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_IF_EXP__CONDITION = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_IF_EXP__THEN = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_IF_EXP__ELSE = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Inline If Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INLINE_IF_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.LogicExpImpl <em>Logic Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.LogicExpImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getLogicExp()
   * @generated
   */
  int LOGIC_EXP = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXP__LEFT = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXP__OP = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXP__RIGHT = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Logic Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.AddExpImpl <em>Add Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.AddExpImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAddExp()
   * @generated
   */
  int ADD_EXP = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__LEFT = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__OP = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP__RIGHT = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Add Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.MulExpImpl <em>Mul Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.MulExpImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMulExp()
   * @generated
   */
  int MUL_EXP = 66;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXP__LEFT = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXP__OP = EXP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXP__RIGHT = EXP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mul Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXP_FEATURE_COUNT = EXP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl <em>Symbol Ref Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRefInvocation()
   * @generated
   */
  int SYMBOL_REF_INVOCATION = 67;

  /**
   * The feature id for the '<em><b>Symbolref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_INVOCATION__SYMBOLREF = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_INVOCATION__ACTUALS = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Symbol Ref Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_INVOCATION_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl <em>Symbol Ref Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRefMember()
   * @generated
   */
  int SYMBOL_REF_MEMBER = 68;

  /**
   * The feature id for the '<em><b>Symbolref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_MEMBER__SYMBOLREF = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_MEMBER__MEMBER = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Symbol Ref Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_MEMBER_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.ConstructorImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 69;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__TYPE = EXP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMS = EXP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.IntegerLiteralImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.UIntegerLiteralImpl <em>UInteger Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.UIntegerLiteralImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUIntegerLiteral()
   * @generated
   */
  int UINTEGER_LITERAL = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINTEGER_LITERAL__VALUE = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>UInteger Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UINTEGER_LITERAL_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.FloatLiteralImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFloatLiteral()
   * @generated
   */
  int FLOAT_LITERAL = 72;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__VALUE = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.impl.BoolLiteralImpl
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBoolLiteral()
   * @generated
   */
  int BOOL_LITERAL = 73;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL__VALUE = EXP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_LITERAL_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eglipse.lang.glsl.glsl.LogicOp <em>Logic Op</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eglipse.lang.glsl.glsl.LogicOp
   * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getLogicOp()
   * @generated
   */
  int LOGIC_OP = 74;


  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SourceFile <em>Source File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source File</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile
   * @generated
   */
  EClass getSourceFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pre</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getPre()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Pre();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getUniforms <em>Uniforms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uniforms</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getUniforms()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Uniforms();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getAttribs <em>Attribs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribs</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getAttribs()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Attribs();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getPrototypes <em>Prototypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prototypes</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getPrototypes()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Prototypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getFunctions()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SourceFile#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.eglipse.lang.glsl.glsl.SourceFile#getVariables()
   * @see #getSourceFile()
   * @generated
   */
  EReference getSourceFile_Variables();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.PrecompilerStatement <em>Precompiler Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precompiler Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerStatement
   * @generated
   */
  EClass getPrecompilerStatement();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.PrecompilerVersion <em>Precompiler Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Precompiler Version</em>'.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerVersion
   * @generated
   */
  EClass getPrecompilerVersion();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.PrecompilerVersion#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerVersion#getVersion()
   * @see #getPrecompilerVersion()
   * @generated
   */
  EAttribute getPrecompilerVersion_Version();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.PrecompilerVersion#getProfile <em>Profile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Profile</em>'.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerVersion#getProfile()
   * @see #getPrecompilerVersion()
   * @generated
   */
  EAttribute getPrecompilerVersion_Profile();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see org.eglipse.lang.glsl.glsl.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype <em>Function Prototype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Prototype</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype
   * @generated
   */
  EClass getFunctionPrototype();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype#getType()
   * @see #getFunctionPrototype()
   * @generated
   */
  EReference getFunctionPrototype_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype#getName()
   * @see #getFunctionPrototype()
   * @generated
   */
  EAttribute getFunctionPrototype_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype#getParams()
   * @see #getFunctionPrototype()
   * @generated
   */
  EReference getFunctionPrototype_Params();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype#getStatements()
   * @see #getFunctionPrototype()
   * @generated
   */
  EReference getFunctionPrototype_Statements();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.eglipse.lang.glsl.glsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.ScalarType <em>Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scalar Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.ScalarType
   * @generated
   */
  EClass getScalarType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.VecType <em>Vec Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vec Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.VecType
   * @generated
   */
  EClass getVecType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.MatType <em>Mat Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.MatType
   * @generated
   */
  EClass getMatType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Definition</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionDefinition
   * @generated
   */
  EClass getFunctionDefinition();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.FunctionCall#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionCall#getName()
   * @see #getFunctionCall()
   * @generated
   */
  EAttribute getFunctionCall_Name();

  /**
   * Returns the meta object for the reference '{@link org.eglipse.lang.glsl.glsl.FunctionCall#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Func</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionCall#getFunc()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Func();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.eglipse.lang.glsl.glsl.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.SwitchCase#getCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchCase#getCase()
   * @see #getSwitchCase()
   * @generated
   */
  EAttribute getSwitchCase_Case();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.SwitchCase#getFcase <em>Fcase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fcase</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchCase#getFcase()
   * @see #getSwitchCase()
   * @generated
   */
  EAttribute getSwitchCase_Fcase();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.SwitchCase#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchCase#getThen()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_Then();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.BlockStatement
   * @generated
   */
  EClass getBlockStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.BlockStatement#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eglipse.lang.glsl.glsl.BlockStatement#getStatements()
   * @see #getBlockStatement()
   * @generated
   */
  EReference getBlockStatement_Statements();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.JumpStatement <em>Jump Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.JumpStatement
   * @generated
   */
  EClass getJumpStatement();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.eglipse.lang.glsl.glsl.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.VariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.VariableDeclaration#getType()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.VariableDeclaration#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.eglipse.lang.glsl.glsl.VariableDeclaration#getInit()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Init();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for the reference '{@link org.eglipse.lang.glsl.glsl.AssignmentStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.eglipse.lang.glsl.glsl.AssignmentStatement#getVariable()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.AssignmentStatement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eglipse.lang.glsl.glsl.AssignmentStatement#getRight()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Right();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp</em>'.
   * @see org.eglipse.lang.glsl.glsl.Exp
   * @generated
   */
  EClass getExp();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.AbstractDefinition <em>Abstract Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definition</em>'.
   * @see org.eglipse.lang.glsl.glsl.AbstractDefinition
   * @generated
   */
  EClass getAbstractDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.AbstractDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.AbstractDefinition#getName()
   * @see #getAbstractDefinition()
   * @generated
   */
  EAttribute getAbstractDefinition_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.eglipse.lang.glsl.glsl.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.Definition#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.eglipse.lang.glsl.glsl.Definition#getArgs()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Args();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.DeclaredParameter <em>Declared Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declared Parameter</em>'.
   * @see org.eglipse.lang.glsl.glsl.DeclaredParameter
   * @generated
   */
  EClass getDeclaredParameter();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see org.eglipse.lang.glsl.glsl.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.Evaluation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eglipse.lang.glsl.glsl.Evaluation#getExpression()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Expression();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UniformDeclaration <em>Uniform Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uniform Declaration</em>'.
   * @see org.eglipse.lang.glsl.glsl.UniformDeclaration
   * @generated
   */
  EClass getUniformDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.UniformDeclaration#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see org.eglipse.lang.glsl.glsl.UniformDeclaration#getQualifier()
   * @see #getUniformDeclaration()
   * @generated
   */
  EAttribute getUniformDeclaration_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.UniformDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.UniformDeclaration#getType()
   * @see #getUniformDeclaration()
   * @generated
   */
  EReference getUniformDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.UniformDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.UniformDeclaration#getName()
   * @see #getUniformDeclaration()
   * @generated
   */
  EAttribute getUniformDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.InAttributeDeclaration <em>In Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Attribute Declaration</em>'.
   * @see org.eglipse.lang.glsl.glsl.InAttributeDeclaration
   * @generated
   */
  EClass getInAttributeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getQualifier()
   * @see #getInAttributeDeclaration()
   * @generated
   */
  EAttribute getInAttributeDeclaration_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getType()
   * @see #getInAttributeDeclaration()
   * @generated
   */
  EReference getInAttributeDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.InAttributeDeclaration#getName()
   * @see #getInAttributeDeclaration()
   * @generated
   */
  EAttribute getInAttributeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.OutAttributeDeclaration <em>Out Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Out Attribute Declaration</em>'.
   * @see org.eglipse.lang.glsl.glsl.OutAttributeDeclaration
   * @generated
   */
  EClass getOutAttributeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getQualifier()
   * @see #getOutAttributeDeclaration()
   * @generated
   */
  EAttribute getOutAttributeDeclaration_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getType()
   * @see #getOutAttributeDeclaration()
   * @generated
   */
  EReference getOutAttributeDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.OutAttributeDeclaration#getName()
   * @see #getOutAttributeDeclaration()
   * @generated
   */
  EAttribute getOutAttributeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration <em>In Out Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Out Attribute Declaration</em>'.
   * @see org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration
   * @generated
   */
  EClass getInOutAttributeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualifier</em>'.
   * @see org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getQualifier()
   * @see #getInOutAttributeDeclaration()
   * @generated
   */
  EAttribute getInOutAttributeDeclaration_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getType()
   * @see #getInOutAttributeDeclaration()
   * @generated
   */
  EReference getInOutAttributeDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration#getName()
   * @see #getInOutAttributeDeclaration()
   * @generated
   */
  EAttribute getInOutAttributeDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Void Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.VoidType
   * @generated
   */
  EClass getVoidType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UIntType <em>UInt Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UInt Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.UIntType
   * @generated
   */
  EClass getUIntType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Vec2Type <em>Vec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vec2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Vec2Type
   * @generated
   */
  EClass getVec2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Vec3Type <em>Vec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vec3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Vec3Type
   * @generated
   */
  EClass getVec3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Vec4Type <em>Vec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vec4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Vec4Type
   * @generated
   */
  EClass getVec4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IVec2Type <em>IVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVec2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.IVec2Type
   * @generated
   */
  EClass getIVec2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IVec3Type <em>IVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVec3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.IVec3Type
   * @generated
   */
  EClass getIVec3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IVec4Type <em>IVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IVec4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.IVec4Type
   * @generated
   */
  EClass getIVec4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UVec2Type <em>UVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UVec2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.UVec2Type
   * @generated
   */
  EClass getUVec2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UVec3Type <em>UVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UVec3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.UVec3Type
   * @generated
   */
  EClass getUVec3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UVec4Type <em>UVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UVec4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.UVec4Type
   * @generated
   */
  EClass getUVec4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BVec2Type <em>BVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BVec2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.BVec2Type
   * @generated
   */
  EClass getBVec2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BVec3Type <em>BVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BVec3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.BVec3Type
   * @generated
   */
  EClass getBVec3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BVec4Type <em>BVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BVec4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.BVec4Type
   * @generated
   */
  EClass getBVec4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat2Type <em>Mat2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat2Type
   * @generated
   */
  EClass getMat2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat3Type <em>Mat3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat3Type
   * @generated
   */
  EClass getMat3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat4Type <em>Mat4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat4Type
   * @generated
   */
  EClass getMat4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat2x2Type <em>Mat2x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat2x2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat2x2Type
   * @generated
   */
  EClass getMat2x2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat2x3Type <em>Mat2x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat2x3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat2x3Type
   * @generated
   */
  EClass getMat2x3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat2x4Type <em>Mat2x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat2x4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat2x4Type
   * @generated
   */
  EClass getMat2x4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat3x2Type <em>Mat3x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat3x2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat3x2Type
   * @generated
   */
  EClass getMat3x2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat3x3Type <em>Mat3x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat3x3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat3x3Type
   * @generated
   */
  EClass getMat3x3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat3x4Type <em>Mat3x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat3x4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat3x4Type
   * @generated
   */
  EClass getMat3x4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat4x2Type <em>Mat4x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat4x2 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat4x2Type
   * @generated
   */
  EClass getMat4x2Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat4x3Type <em>Mat4x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat4x3 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat4x3Type
   * @generated
   */
  EClass getMat4x3Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Mat4x4Type <em>Mat4x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mat4x4 Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Mat4x4Type
   * @generated
   */
  EClass getMat4x4Type();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.eglipse.lang.glsl.glsl.SymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRef#getSymbol()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Symbol();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SymbolRef#getActuals <em>Actuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actuals</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRef#getActuals()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Actuals();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eglipse.lang.glsl.glsl.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.IfStatement#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.eglipse.lang.glsl.glsl.IfStatement#getThen()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.IfStatement#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.eglipse.lang.glsl.glsl.IfStatement#getElse()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Else();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.WhileStatement
   * @generated
   */
  EClass getWhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.WhileStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eglipse.lang.glsl.glsl.WhileStatement#getCondition()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.WhileStatement#getDo <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do</em>'.
   * @see org.eglipse.lang.glsl.glsl.WhileStatement#getDo()
   * @see #getWhileStatement()
   * @generated
   */
  EReference getWhileStatement_Do();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.ForStatement
   * @generated
   */
  EClass getForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.ForStatement#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.eglipse.lang.glsl.glsl.ForStatement#getA()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_A();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.ForStatement#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.eglipse.lang.glsl.glsl.ForStatement#getB()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_B();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.ForStatement#getC <em>C</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C</em>'.
   * @see org.eglipse.lang.glsl.glsl.ForStatement#getC()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_C();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.ForStatement#getDo <em>Do</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do</em>'.
   * @see org.eglipse.lang.glsl.glsl.ForStatement#getDo()
   * @see #getForStatement()
   * @generated
   */
  EReference getForStatement_Do();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Statement</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchStatement
   * @generated
   */
  EClass getSwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.SwitchStatement#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchStatement#getA()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_A();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SwitchStatement#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.eglipse.lang.glsl.glsl.SwitchStatement#getCases()
   * @see #getSwitchStatement()
   * @generated
   */
  EReference getSwitchStatement_Cases();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see org.eglipse.lang.glsl.glsl.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.Return#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eglipse.lang.glsl.glsl.Return#getValue()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Value();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.InlineIfExp <em>Inline If Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inline If Exp</em>'.
   * @see org.eglipse.lang.glsl.glsl.InlineIfExp
   * @generated
   */
  EClass getInlineIfExp();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.InlineIfExp#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.eglipse.lang.glsl.glsl.InlineIfExp#getCondition()
   * @see #getInlineIfExp()
   * @generated
   */
  EReference getInlineIfExp_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.InlineIfExp#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.eglipse.lang.glsl.glsl.InlineIfExp#getThen()
   * @see #getInlineIfExp()
   * @generated
   */
  EReference getInlineIfExp_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.InlineIfExp#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.eglipse.lang.glsl.glsl.InlineIfExp#getElse()
   * @see #getInlineIfExp()
   * @generated
   */
  EReference getInlineIfExp_Else();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.LogicExp <em>Logic Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Exp</em>'.
   * @see org.eglipse.lang.glsl.glsl.LogicExp
   * @generated
   */
  EClass getLogicExp();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.LogicExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eglipse.lang.glsl.glsl.LogicExp#getLeft()
   * @see #getLogicExp()
   * @generated
   */
  EReference getLogicExp_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.LogicExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eglipse.lang.glsl.glsl.LogicExp#getOp()
   * @see #getLogicExp()
   * @generated
   */
  EAttribute getLogicExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.LogicExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eglipse.lang.glsl.glsl.LogicExp#getRight()
   * @see #getLogicExp()
   * @generated
   */
  EReference getLogicExp_Right();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.AddExp <em>Add Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Exp</em>'.
   * @see org.eglipse.lang.glsl.glsl.AddExp
   * @generated
   */
  EClass getAddExp();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.AddExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eglipse.lang.glsl.glsl.AddExp#getLeft()
   * @see #getAddExp()
   * @generated
   */
  EReference getAddExp_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.AddExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eglipse.lang.glsl.glsl.AddExp#getOp()
   * @see #getAddExp()
   * @generated
   */
  EAttribute getAddExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.AddExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eglipse.lang.glsl.glsl.AddExp#getRight()
   * @see #getAddExp()
   * @generated
   */
  EReference getAddExp_Right();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.MulExp <em>Mul Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Exp</em>'.
   * @see org.eglipse.lang.glsl.glsl.MulExp
   * @generated
   */
  EClass getMulExp();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.MulExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eglipse.lang.glsl.glsl.MulExp#getLeft()
   * @see #getMulExp()
   * @generated
   */
  EReference getMulExp_Left();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.MulExp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.eglipse.lang.glsl.glsl.MulExp#getOp()
   * @see #getMulExp()
   * @generated
   */
  EAttribute getMulExp_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.MulExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eglipse.lang.glsl.glsl.MulExp#getRight()
   * @see #getMulExp()
   * @generated
   */
  EReference getMulExp_Right();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation <em>Symbol Ref Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref Invocation</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefInvocation
   * @generated
   */
  EClass getSymbolRefInvocation();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getSymbolref <em>Symbolref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbolref</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getSymbolref()
   * @see #getSymbolRefInvocation()
   * @generated
   */
  EReference getSymbolRefInvocation_Symbolref();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getActuals <em>Actuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actuals</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefInvocation#getActuals()
   * @see #getSymbolRefInvocation()
   * @generated
   */
  EReference getSymbolRefInvocation_Actuals();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.SymbolRefMember <em>Symbol Ref Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref Member</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefMember
   * @generated
   */
  EClass getSymbolRefMember();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.SymbolRefMember#getSymbolref <em>Symbolref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Symbolref</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefMember#getSymbolref()
   * @see #getSymbolRefMember()
   * @generated
   */
  EReference getSymbolRefMember_Symbolref();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.SymbolRefMember#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Member</em>'.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefMember#getMember()
   * @see #getSymbolRefMember()
   * @generated
   */
  EAttribute getSymbolRefMember_Member();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.eglipse.lang.glsl.glsl.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the containment reference '{@link org.eglipse.lang.glsl.glsl.Constructor#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eglipse.lang.glsl.glsl.Constructor#getType()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.eglipse.lang.glsl.glsl.Constructor#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eglipse.lang.glsl.glsl.Constructor#getParams()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Params();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.eglipse.lang.glsl.glsl.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eglipse.lang.glsl.glsl.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.UIntegerLiteral <em>UInteger Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UInteger Literal</em>'.
   * @see org.eglipse.lang.glsl.glsl.UIntegerLiteral
   * @generated
   */
  EClass getUIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.UIntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eglipse.lang.glsl.glsl.UIntegerLiteral#getValue()
   * @see #getUIntegerLiteral()
   * @generated
   */
  EAttribute getUIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.eglipse.lang.glsl.glsl.FloatLiteral
   * @generated
   */
  EClass getFloatLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.FloatLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eglipse.lang.glsl.glsl.FloatLiteral#getValue()
   * @see #getFloatLiteral()
   * @generated
   */
  EAttribute getFloatLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eglipse.lang.glsl.glsl.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Literal</em>'.
   * @see org.eglipse.lang.glsl.glsl.BoolLiteral
   * @generated
   */
  EClass getBoolLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eglipse.lang.glsl.glsl.BoolLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eglipse.lang.glsl.glsl.BoolLiteral#isValue()
   * @see #getBoolLiteral()
   * @generated
   */
  EAttribute getBoolLiteral_Value();

  /**
   * Returns the meta object for enum '{@link org.eglipse.lang.glsl.glsl.LogicOp <em>Logic Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Logic Op</em>'.
   * @see org.eglipse.lang.glsl.glsl.LogicOp
   * @generated
   */
  EEnum getLogicOp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GlslFactory getGlslFactory();

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
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SourceFileImpl <em>Source File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SourceFileImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSourceFile()
     * @generated
     */
    EClass SOURCE_FILE = eINSTANCE.getSourceFile();

    /**
     * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__PRE = eINSTANCE.getSourceFile_Pre();

    /**
     * The meta object literal for the '<em><b>Uniforms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__UNIFORMS = eINSTANCE.getSourceFile_Uniforms();

    /**
     * The meta object literal for the '<em><b>Attribs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__ATTRIBS = eINSTANCE.getSourceFile_Attribs();

    /**
     * The meta object literal for the '<em><b>Prototypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__PROTOTYPES = eINSTANCE.getSourceFile_Prototypes();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__FUNCTIONS = eINSTANCE.getSourceFile_Functions();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOURCE_FILE__VARIABLES = eINSTANCE.getSourceFile_Variables();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerStatementImpl <em>Precompiler Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.PrecompilerStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getPrecompilerStatement()
     * @generated
     */
    EClass PRECOMPILER_STATEMENT = eINSTANCE.getPrecompilerStatement();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl <em>Precompiler Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.PrecompilerVersionImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getPrecompilerVersion()
     * @generated
     */
    EClass PRECOMPILER_VERSION = eINSTANCE.getPrecompilerVersion();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECOMPILER_VERSION__VERSION = eINSTANCE.getPrecompilerVersion_Version();

    /**
     * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRECOMPILER_VERSION__PROFILE = eINSTANCE.getPrecompilerVersion_Profile();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SymbolImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionPrototypeImpl <em>Function Prototype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.FunctionPrototypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionPrototype()
     * @generated
     */
    EClass FUNCTION_PROTOTYPE = eINSTANCE.getFunctionPrototype();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PROTOTYPE__TYPE = eINSTANCE.getFunctionPrototype_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_PROTOTYPE__NAME = eINSTANCE.getFunctionPrototype_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PROTOTYPE__PARAMS = eINSTANCE.getFunctionPrototype_Params();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PROTOTYPE__STATEMENTS = eINSTANCE.getFunctionPrototype_Statements();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ParameterImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ScalarTypeImpl <em>Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ScalarTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getScalarType()
     * @generated
     */
    EClass SCALAR_TYPE = eINSTANCE.getScalarType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ComplexTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.VecTypeImpl <em>Vec Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.VecTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVecType()
     * @generated
     */
    EClass VEC_TYPE = eINSTANCE.getVecType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.MatTypeImpl <em>Mat Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.MatTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMatType()
     * @generated
     */
    EClass MAT_TYPE = eINSTANCE.getMatType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.FunctionDefinitionImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.FunctionCallImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_CALL__NAME = eINSTANCE.getFunctionCall_Name();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNC = eINSTANCE.getFunctionCall_Func();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.StatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SwitchCaseImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_CASE__CASE = eINSTANCE.getSwitchCase_Case();

    /**
     * The meta object literal for the '<em><b>Fcase</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_CASE__FCASE = eINSTANCE.getSwitchCase_Fcase();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__THEN = eINSTANCE.getSwitchCase_Then();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BlockStatementImpl <em>Block Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BlockStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBlockStatement()
     * @generated
     */
    EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK_STATEMENT__STATEMENTS = eINSTANCE.getBlockStatement_Statements();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.JumpStatementImpl <em>Jump Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.JumpStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getJumpStatement()
     * @generated
     */
    EClass JUMP_STATEMENT = eINSTANCE.getJumpStatement();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.VariableDeclarationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__INIT = eINSTANCE.getVariableDeclaration_Init();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.AssignmentStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAssignmentStatement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getAssignmentStatement_Variable();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__RIGHT = eINSTANCE.getAssignmentStatement_Right();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ExpImpl <em>Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ExpImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getExp()
     * @generated
     */
    EClass EXP = eINSTANCE.getExp();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.AbstractDefinitionImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAbstractDefinition()
     * @generated
     */
    EClass ABSTRACT_DEFINITION = eINSTANCE.getAbstractDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_DEFINITION__NAME = eINSTANCE.getAbstractDefinition_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.DefinitionImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__ARGS = eINSTANCE.getDefinition_Args();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.DeclaredParameterImpl <em>Declared Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.DeclaredParameterImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getDeclaredParameter()
     * @generated
     */
    EClass DECLARED_PARAMETER = eINSTANCE.getDeclaredParameter();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.EvaluationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__EXPRESSION = eINSTANCE.getEvaluation_Expression();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UniformDeclarationImpl <em>Uniform Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UniformDeclarationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUniformDeclaration()
     * @generated
     */
    EClass UNIFORM_DECLARATION = eINSTANCE.getUniformDeclaration();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIFORM_DECLARATION__QUALIFIER = eINSTANCE.getUniformDeclaration_Qualifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIFORM_DECLARATION__TYPE = eINSTANCE.getUniformDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIFORM_DECLARATION__NAME = eINSTANCE.getUniformDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.InAttributeDeclarationImpl <em>In Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.InAttributeDeclarationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInAttributeDeclaration()
     * @generated
     */
    EClass IN_ATTRIBUTE_DECLARATION = eINSTANCE.getInAttributeDeclaration();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_ATTRIBUTE_DECLARATION__QUALIFIER = eINSTANCE.getInAttributeDeclaration_Qualifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_ATTRIBUTE_DECLARATION__TYPE = eINSTANCE.getInAttributeDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_ATTRIBUTE_DECLARATION__NAME = eINSTANCE.getInAttributeDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.OutAttributeDeclarationImpl <em>Out Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.OutAttributeDeclarationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getOutAttributeDeclaration()
     * @generated
     */
    EClass OUT_ATTRIBUTE_DECLARATION = eINSTANCE.getOutAttributeDeclaration();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_ATTRIBUTE_DECLARATION__QUALIFIER = eINSTANCE.getOutAttributeDeclaration_Qualifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUT_ATTRIBUTE_DECLARATION__TYPE = eINSTANCE.getOutAttributeDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUT_ATTRIBUTE_DECLARATION__NAME = eINSTANCE.getOutAttributeDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.InOutAttributeDeclarationImpl <em>In Out Attribute Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.InOutAttributeDeclarationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInOutAttributeDeclaration()
     * @generated
     */
    EClass IN_OUT_ATTRIBUTE_DECLARATION = eINSTANCE.getInOutAttributeDeclaration();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_OUT_ATTRIBUTE_DECLARATION__QUALIFIER = eINSTANCE.getInOutAttributeDeclaration_Qualifier();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IN_OUT_ATTRIBUTE_DECLARATION__TYPE = eINSTANCE.getInOutAttributeDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_OUT_ATTRIBUTE_DECLARATION__NAME = eINSTANCE.getInOutAttributeDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.VoidTypeImpl <em>Void Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.VoidTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVoidType()
     * @generated
     */
    EClass VOID_TYPE = eINSTANCE.getVoidType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IntTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UIntTypeImpl <em>UInt Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UIntTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUIntType()
     * @generated
     */
    EClass UINT_TYPE = eINSTANCE.getUIntType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BoolTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.FloatTypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Vec2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec2Type()
     * @generated
     */
    EClass VEC2_TYPE = eINSTANCE.getVec2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec3TypeImpl <em>Vec3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Vec3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec3Type()
     * @generated
     */
    EClass VEC3_TYPE = eINSTANCE.getVec3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Vec4TypeImpl <em>Vec4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Vec4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getVec4Type()
     * @generated
     */
    EClass VEC4_TYPE = eINSTANCE.getVec4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec2TypeImpl <em>IVec2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IVec2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec2Type()
     * @generated
     */
    EClass IVEC2_TYPE = eINSTANCE.getIVec2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec3TypeImpl <em>IVec3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IVec3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec3Type()
     * @generated
     */
    EClass IVEC3_TYPE = eINSTANCE.getIVec3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IVec4TypeImpl <em>IVec4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IVec4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIVec4Type()
     * @generated
     */
    EClass IVEC4_TYPE = eINSTANCE.getIVec4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec2TypeImpl <em>UVec2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UVec2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec2Type()
     * @generated
     */
    EClass UVEC2_TYPE = eINSTANCE.getUVec2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec3TypeImpl <em>UVec3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UVec3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec3Type()
     * @generated
     */
    EClass UVEC3_TYPE = eINSTANCE.getUVec3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UVec4TypeImpl <em>UVec4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UVec4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUVec4Type()
     * @generated
     */
    EClass UVEC4_TYPE = eINSTANCE.getUVec4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec2TypeImpl <em>BVec2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BVec2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec2Type()
     * @generated
     */
    EClass BVEC2_TYPE = eINSTANCE.getBVec2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec3TypeImpl <em>BVec3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BVec3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec3Type()
     * @generated
     */
    EClass BVEC3_TYPE = eINSTANCE.getBVec3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BVec4TypeImpl <em>BVec4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BVec4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBVec4Type()
     * @generated
     */
    EClass BVEC4_TYPE = eINSTANCE.getBVec4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2TypeImpl <em>Mat2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2Type()
     * @generated
     */
    EClass MAT2_TYPE = eINSTANCE.getMat2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3TypeImpl <em>Mat3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3Type()
     * @generated
     */
    EClass MAT3_TYPE = eINSTANCE.getMat3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4TypeImpl <em>Mat4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4Type()
     * @generated
     */
    EClass MAT4_TYPE = eINSTANCE.getMat4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x2TypeImpl <em>Mat2x2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat2x2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x2Type()
     * @generated
     */
    EClass MAT2X2_TYPE = eINSTANCE.getMat2x2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x3TypeImpl <em>Mat2x3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat2x3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x3Type()
     * @generated
     */
    EClass MAT2X3_TYPE = eINSTANCE.getMat2x3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat2x4TypeImpl <em>Mat2x4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat2x4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat2x4Type()
     * @generated
     */
    EClass MAT2X4_TYPE = eINSTANCE.getMat2x4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x2TypeImpl <em>Mat3x2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat3x2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x2Type()
     * @generated
     */
    EClass MAT3X2_TYPE = eINSTANCE.getMat3x2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x3TypeImpl <em>Mat3x3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat3x3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x3Type()
     * @generated
     */
    EClass MAT3X3_TYPE = eINSTANCE.getMat3x3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat3x4TypeImpl <em>Mat3x4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat3x4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat3x4Type()
     * @generated
     */
    EClass MAT3X4_TYPE = eINSTANCE.getMat3x4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x2TypeImpl <em>Mat4x2 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat4x2TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x2Type()
     * @generated
     */
    EClass MAT4X2_TYPE = eINSTANCE.getMat4x2Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x3TypeImpl <em>Mat4x3 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat4x3TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x3Type()
     * @generated
     */
    EClass MAT4X3_TYPE = eINSTANCE.getMat4x3Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.Mat4x4TypeImpl <em>Mat4x4 Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.Mat4x4TypeImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMat4x4Type()
     * @generated
     */
    EClass MAT4X4_TYPE = eINSTANCE.getMat4x4Type();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRef()
     * @generated
     */
    EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__SYMBOL = eINSTANCE.getSymbolRef_Symbol();

    /**
     * The meta object literal for the '<em><b>Actuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__ACTUALS = eINSTANCE.getSymbolRef_Actuals();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IfStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__THEN = eINSTANCE.getIfStatement_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE = eINSTANCE.getIfStatement_Else();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.WhileStatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.WhileStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getWhileStatement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__CONDITION = eINSTANCE.getWhileStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__DO = eINSTANCE.getWhileStatement_Do();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ForStatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ForStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getForStatement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getForStatement();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__A = eINSTANCE.getForStatement_A();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__B = eINSTANCE.getForStatement_B();

    /**
     * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__C = eINSTANCE.getForStatement_C();

    /**
     * The meta object literal for the '<em><b>Do</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__DO = eINSTANCE.getForStatement_Do();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SwitchStatementImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSwitchStatement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__A = eINSTANCE.getSwitchStatement_A();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__CASES = eINSTANCE.getSwitchStatement_Cases();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ReturnImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__VALUE = eINSTANCE.getReturn_Value();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.InlineIfExpImpl <em>Inline If Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.InlineIfExpImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getInlineIfExp()
     * @generated
     */
    EClass INLINE_IF_EXP = eINSTANCE.getInlineIfExp();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INLINE_IF_EXP__CONDITION = eINSTANCE.getInlineIfExp_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INLINE_IF_EXP__THEN = eINSTANCE.getInlineIfExp_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INLINE_IF_EXP__ELSE = eINSTANCE.getInlineIfExp_Else();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.LogicExpImpl <em>Logic Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.LogicExpImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getLogicExp()
     * @generated
     */
    EClass LOGIC_EXP = eINSTANCE.getLogicExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXP__LEFT = eINSTANCE.getLogicExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXP__OP = eINSTANCE.getLogicExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXP__RIGHT = eINSTANCE.getLogicExp_Right();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.AddExpImpl <em>Add Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.AddExpImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getAddExp()
     * @generated
     */
    EClass ADD_EXP = eINSTANCE.getAddExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_EXP__LEFT = eINSTANCE.getAddExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_EXP__OP = eINSTANCE.getAddExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_EXP__RIGHT = eINSTANCE.getAddExp_Right();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.MulExpImpl <em>Mul Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.MulExpImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getMulExp()
     * @generated
     */
    EClass MUL_EXP = eINSTANCE.getMulExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXP__LEFT = eINSTANCE.getMulExp_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_EXP__OP = eINSTANCE.getMulExp_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXP__RIGHT = eINSTANCE.getMulExp_Right();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl <em>Symbol Ref Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefInvocationImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRefInvocation()
     * @generated
     */
    EClass SYMBOL_REF_INVOCATION = eINSTANCE.getSymbolRefInvocation();

    /**
     * The meta object literal for the '<em><b>Symbolref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF_INVOCATION__SYMBOLREF = eINSTANCE.getSymbolRefInvocation_Symbolref();

    /**
     * The meta object literal for the '<em><b>Actuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF_INVOCATION__ACTUALS = eINSTANCE.getSymbolRefInvocation_Actuals();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl <em>Symbol Ref Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.SymbolRefMemberImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getSymbolRefMember()
     * @generated
     */
    EClass SYMBOL_REF_MEMBER = eINSTANCE.getSymbolRefMember();

    /**
     * The meta object literal for the '<em><b>Symbolref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF_MEMBER__SYMBOLREF = eINSTANCE.getSymbolRefMember_Symbolref();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL_REF_MEMBER__MEMBER = eINSTANCE.getSymbolRefMember_Member();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.ConstructorImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__TYPE = eINSTANCE.getConstructor_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMS = eINSTANCE.getConstructor_Params();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.IntegerLiteralImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.UIntegerLiteralImpl <em>UInteger Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.UIntegerLiteralImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getUIntegerLiteral()
     * @generated
     */
    EClass UINTEGER_LITERAL = eINSTANCE.getUIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UINTEGER_LITERAL__VALUE = eINSTANCE.getUIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.FloatLiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.FloatLiteralImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getFloatLiteral()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloatLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__VALUE = eINSTANCE.getFloatLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.impl.BoolLiteralImpl
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getBoolLiteral()
     * @generated
     */
    EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_LITERAL__VALUE = eINSTANCE.getBoolLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eglipse.lang.glsl.glsl.LogicOp <em>Logic Op</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eglipse.lang.glsl.glsl.LogicOp
     * @see org.eglipse.lang.glsl.glsl.impl.GlslPackageImpl#getLogicOp()
     * @generated
     */
    EEnum LOGIC_OP = eINSTANCE.getLogicOp();

  }

} //GlslPackage
