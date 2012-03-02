/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl.impl;

import at.caks.eglipse.lang.glsl.glsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlslFactoryImpl extends EFactoryImpl implements GlslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GlslFactory init()
  {
    try
    {
      GlslFactory theGlslFactory = (GlslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.caks.at/eglipse/Glsl"); 
      if (theGlslFactory != null)
      {
        return theGlslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GlslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GlslPackage.SOURCE_FILE: return createSourceFile();
      case GlslPackage.PRECOMPILER_STATEMENT: return createPrecompilerStatement();
      case GlslPackage.PRECOMPILER_VERSION: return createPrecompilerVersion();
      case GlslPackage.SYMBOL: return createSymbol();
      case GlslPackage.FUNCTION_PROTOTYPE: return createFunctionPrototype();
      case GlslPackage.PARAMETER: return createParameter();
      case GlslPackage.TYPE: return createType();
      case GlslPackage.SCALAR_TYPE: return createScalarType();
      case GlslPackage.COMPLEX_TYPE: return createComplexType();
      case GlslPackage.VEC_TYPE: return createVecType();
      case GlslPackage.MAT_TYPE: return createMatType();
      case GlslPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case GlslPackage.FUNCTION_CALL: return createFunctionCall();
      case GlslPackage.STATEMENT: return createStatement();
      case GlslPackage.SWITCH_CASE: return createSwitchCase();
      case GlslPackage.BLOCK_STATEMENT: return createBlockStatement();
      case GlslPackage.JUMP_STATEMENT: return createJumpStatement();
      case GlslPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case GlslPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case GlslPackage.EXP: return createExp();
      case GlslPackage.ABSTRACT_DEFINITION: return createAbstractDefinition();
      case GlslPackage.DEFINITION: return createDefinition();
      case GlslPackage.DECLARED_PARAMETER: return createDeclaredParameter();
      case GlslPackage.EVALUATION: return createEvaluation();
      case GlslPackage.UNIFORM_DECLARATION: return createUniformDeclaration();
      case GlslPackage.IN_ATTRIBUTE_DECLARATION: return createInAttributeDeclaration();
      case GlslPackage.OUT_ATTRIBUTE_DECLARATION: return createOutAttributeDeclaration();
      case GlslPackage.IN_OUT_ATTRIBUTE_DECLARATION: return createInOutAttributeDeclaration();
      case GlslPackage.VOID_TYPE: return createVoidType();
      case GlslPackage.INT_TYPE: return createIntType();
      case GlslPackage.UINT_TYPE: return createUIntType();
      case GlslPackage.BOOL_TYPE: return createBoolType();
      case GlslPackage.FLOAT_TYPE: return createFloatType();
      case GlslPackage.VEC2_TYPE: return createVec2Type();
      case GlslPackage.VEC3_TYPE: return createVec3Type();
      case GlslPackage.VEC4_TYPE: return createVec4Type();
      case GlslPackage.IVEC2_TYPE: return createIVec2Type();
      case GlslPackage.IVEC3_TYPE: return createIVec3Type();
      case GlslPackage.IVEC4_TYPE: return createIVec4Type();
      case GlslPackage.UVEC2_TYPE: return createUVec2Type();
      case GlslPackage.UVEC3_TYPE: return createUVec3Type();
      case GlslPackage.UVEC4_TYPE: return createUVec4Type();
      case GlslPackage.BVEC2_TYPE: return createBVec2Type();
      case GlslPackage.BVEC3_TYPE: return createBVec3Type();
      case GlslPackage.BVEC4_TYPE: return createBVec4Type();
      case GlslPackage.MAT2_TYPE: return createMat2Type();
      case GlslPackage.MAT3_TYPE: return createMat3Type();
      case GlslPackage.MAT4_TYPE: return createMat4Type();
      case GlslPackage.MAT2X2_TYPE: return createMat2x2Type();
      case GlslPackage.MAT2X3_TYPE: return createMat2x3Type();
      case GlslPackage.MAT2X4_TYPE: return createMat2x4Type();
      case GlslPackage.MAT3X2_TYPE: return createMat3x2Type();
      case GlslPackage.MAT3X3_TYPE: return createMat3x3Type();
      case GlslPackage.MAT3X4_TYPE: return createMat3x4Type();
      case GlslPackage.MAT4X2_TYPE: return createMat4x2Type();
      case GlslPackage.MAT4X3_TYPE: return createMat4x3Type();
      case GlslPackage.MAT4X4_TYPE: return createMat4x4Type();
      case GlslPackage.SYMBOL_REF: return createSymbolRef();
      case GlslPackage.IF_STATEMENT: return createIfStatement();
      case GlslPackage.WHILE_STATEMENT: return createWhileStatement();
      case GlslPackage.FOR_STATEMENT: return createForStatement();
      case GlslPackage.SWITCH_STATEMENT: return createSwitchStatement();
      case GlslPackage.RETURN: return createReturn();
      case GlslPackage.INLINE_IF_EXP: return createInlineIfExp();
      case GlslPackage.LOGIC_EXP: return createLogicExp();
      case GlslPackage.ADD_EXP: return createAddExp();
      case GlslPackage.MUL_EXP: return createMulExp();
      case GlslPackage.SYMBOL_REF_INVOCATION: return createSymbolRefInvocation();
      case GlslPackage.SYMBOL_REF_MEMBER: return createSymbolRefMember();
      case GlslPackage.CONSTRUCTOR: return createConstructor();
      case GlslPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case GlslPackage.UINTEGER_LITERAL: return createUIntegerLiteral();
      case GlslPackage.FLOAT_LITERAL: return createFloatLiteral();
      case GlslPackage.BOOL_LITERAL: return createBoolLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GlslPackage.LOGIC_OP:
        return createLogicOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GlslPackage.LOGIC_OP:
        return convertLogicOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SourceFile createSourceFile()
  {
    SourceFileImpl sourceFile = new SourceFileImpl();
    return sourceFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecompilerStatement createPrecompilerStatement()
  {
    PrecompilerStatementImpl precompilerStatement = new PrecompilerStatementImpl();
    return precompilerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrecompilerVersion createPrecompilerVersion()
  {
    PrecompilerVersionImpl precompilerVersion = new PrecompilerVersionImpl();
    return precompilerVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionPrototype createFunctionPrototype()
  {
    FunctionPrototypeImpl functionPrototype = new FunctionPrototypeImpl();
    return functionPrototype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalarType createScalarType()
  {
    ScalarTypeImpl scalarType = new ScalarTypeImpl();
    return scalarType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexType createComplexType()
  {
    ComplexTypeImpl complexType = new ComplexTypeImpl();
    return complexType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VecType createVecType()
  {
    VecTypeImpl vecType = new VecTypeImpl();
    return vecType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatType createMatType()
  {
    MatTypeImpl matType = new MatTypeImpl();
    return matType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchCase createSwitchCase()
  {
    SwitchCaseImpl switchCase = new SwitchCaseImpl();
    return switchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockStatement createBlockStatement()
  {
    BlockStatementImpl blockStatement = new BlockStatementImpl();
    return blockStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JumpStatement createJumpStatement()
  {
    JumpStatementImpl jumpStatement = new JumpStatementImpl();
    return jumpStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exp createExp()
  {
    ExpImpl exp = new ExpImpl();
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDefinition createAbstractDefinition()
  {
    AbstractDefinitionImpl abstractDefinition = new AbstractDefinitionImpl();
    return abstractDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaredParameter createDeclaredParameter()
  {
    DeclaredParameterImpl declaredParameter = new DeclaredParameterImpl();
    return declaredParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluation createEvaluation()
  {
    EvaluationImpl evaluation = new EvaluationImpl();
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniformDeclaration createUniformDeclaration()
  {
    UniformDeclarationImpl uniformDeclaration = new UniformDeclarationImpl();
    return uniformDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InAttributeDeclaration createInAttributeDeclaration()
  {
    InAttributeDeclarationImpl inAttributeDeclaration = new InAttributeDeclarationImpl();
    return inAttributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutAttributeDeclaration createOutAttributeDeclaration()
  {
    OutAttributeDeclarationImpl outAttributeDeclaration = new OutAttributeDeclarationImpl();
    return outAttributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InOutAttributeDeclaration createInOutAttributeDeclaration()
  {
    InOutAttributeDeclarationImpl inOutAttributeDeclaration = new InOutAttributeDeclarationImpl();
    return inOutAttributeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VoidType createVoidType()
  {
    VoidTypeImpl voidType = new VoidTypeImpl();
    return voidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIntType createUIntType()
  {
    UIntTypeImpl uIntType = new UIntTypeImpl();
    return uIntType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vec2Type createVec2Type()
  {
    Vec2TypeImpl vec2Type = new Vec2TypeImpl();
    return vec2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vec3Type createVec3Type()
  {
    Vec3TypeImpl vec3Type = new Vec3TypeImpl();
    return vec3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vec4Type createVec4Type()
  {
    Vec4TypeImpl vec4Type = new Vec4TypeImpl();
    return vec4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IVec2Type createIVec2Type()
  {
    IVec2TypeImpl iVec2Type = new IVec2TypeImpl();
    return iVec2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IVec3Type createIVec3Type()
  {
    IVec3TypeImpl iVec3Type = new IVec3TypeImpl();
    return iVec3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IVec4Type createIVec4Type()
  {
    IVec4TypeImpl iVec4Type = new IVec4TypeImpl();
    return iVec4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UVec2Type createUVec2Type()
  {
    UVec2TypeImpl uVec2Type = new UVec2TypeImpl();
    return uVec2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UVec3Type createUVec3Type()
  {
    UVec3TypeImpl uVec3Type = new UVec3TypeImpl();
    return uVec3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UVec4Type createUVec4Type()
  {
    UVec4TypeImpl uVec4Type = new UVec4TypeImpl();
    return uVec4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVec2Type createBVec2Type()
  {
    BVec2TypeImpl bVec2Type = new BVec2TypeImpl();
    return bVec2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVec3Type createBVec3Type()
  {
    BVec3TypeImpl bVec3Type = new BVec3TypeImpl();
    return bVec3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BVec4Type createBVec4Type()
  {
    BVec4TypeImpl bVec4Type = new BVec4TypeImpl();
    return bVec4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat2Type createMat2Type()
  {
    Mat2TypeImpl mat2Type = new Mat2TypeImpl();
    return mat2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat3Type createMat3Type()
  {
    Mat3TypeImpl mat3Type = new Mat3TypeImpl();
    return mat3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat4Type createMat4Type()
  {
    Mat4TypeImpl mat4Type = new Mat4TypeImpl();
    return mat4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat2x2Type createMat2x2Type()
  {
    Mat2x2TypeImpl mat2x2Type = new Mat2x2TypeImpl();
    return mat2x2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat2x3Type createMat2x3Type()
  {
    Mat2x3TypeImpl mat2x3Type = new Mat2x3TypeImpl();
    return mat2x3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat2x4Type createMat2x4Type()
  {
    Mat2x4TypeImpl mat2x4Type = new Mat2x4TypeImpl();
    return mat2x4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat3x2Type createMat3x2Type()
  {
    Mat3x2TypeImpl mat3x2Type = new Mat3x2TypeImpl();
    return mat3x2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat3x3Type createMat3x3Type()
  {
    Mat3x3TypeImpl mat3x3Type = new Mat3x3TypeImpl();
    return mat3x3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat3x4Type createMat3x4Type()
  {
    Mat3x4TypeImpl mat3x4Type = new Mat3x4TypeImpl();
    return mat3x4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat4x2Type createMat4x2Type()
  {
    Mat4x2TypeImpl mat4x2Type = new Mat4x2TypeImpl();
    return mat4x2Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat4x3Type createMat4x3Type()
  {
    Mat4x3TypeImpl mat4x3Type = new Mat4x3TypeImpl();
    return mat4x3Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mat4x4Type createMat4x4Type()
  {
    Mat4x4TypeImpl mat4x4Type = new Mat4x4TypeImpl();
    return mat4x4Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForStatement createForStatement()
  {
    ForStatementImpl forStatement = new ForStatementImpl();
    return forStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchStatement createSwitchStatement()
  {
    SwitchStatementImpl switchStatement = new SwitchStatementImpl();
    return switchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineIfExp createInlineIfExp()
  {
    InlineIfExpImpl inlineIfExp = new InlineIfExpImpl();
    return inlineIfExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddExp createAddExp()
  {
    AddExpImpl addExp = new AddExpImpl();
    return addExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulExp createMulExp()
  {
    MulExpImpl mulExp = new MulExpImpl();
    return mulExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRefInvocation createSymbolRefInvocation()
  {
    SymbolRefInvocationImpl symbolRefInvocation = new SymbolRefInvocationImpl();
    return symbolRefInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRefMember createSymbolRefMember()
  {
    SymbolRefMemberImpl symbolRefMember = new SymbolRefMemberImpl();
    return symbolRefMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIntegerLiteral createUIntegerLiteral()
  {
    UIntegerLiteralImpl uIntegerLiteral = new UIntegerLiteralImpl();
    return uIntegerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatLiteral createFloatLiteral()
  {
    FloatLiteralImpl floatLiteral = new FloatLiteralImpl();
    return floatLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOp createLogicOpFromString(EDataType eDataType, String initialValue)
  {
    LogicOp result = LogicOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogicOpToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlslPackage getGlslPackage()
  {
    return (GlslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GlslPackage getPackage()
  {
    return GlslPackage.eINSTANCE;
  }

} //GlslFactoryImpl
