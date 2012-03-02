/**
 * <copyright>
 * </copyright>
 *
 */
package at.caks.eglipse.lang.glsl.glsl.util;

import at.caks.eglipse.lang.glsl.glsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.caks.eglipse.lang.glsl.glsl.GlslPackage
 * @generated
 */
public class GlslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GlslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GlslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GlslPackage.SOURCE_FILE:
      {
        SourceFile sourceFile = (SourceFile)theEObject;
        T result = caseSourceFile(sourceFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.PRECOMPILER_STATEMENT:
      {
        PrecompilerStatement precompilerStatement = (PrecompilerStatement)theEObject;
        T result = casePrecompilerStatement(precompilerStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.PRECOMPILER_VERSION:
      {
        PrecompilerVersion precompilerVersion = (PrecompilerVersion)theEObject;
        T result = casePrecompilerVersion(precompilerVersion);
        if (result == null) result = casePrecompilerStatement(precompilerVersion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FUNCTION_PROTOTYPE:
      {
        FunctionPrototype functionPrototype = (FunctionPrototype)theEObject;
        T result = caseFunctionPrototype(functionPrototype);
        if (result == null) result = caseFunctionDefinition(functionPrototype);
        if (result == null) result = caseSymbol(functionPrototype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SCALAR_TYPE:
      {
        ScalarType scalarType = (ScalarType)theEObject;
        T result = caseScalarType(scalarType);
        if (result == null) result = caseType(scalarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.COMPLEX_TYPE:
      {
        ComplexType complexType = (ComplexType)theEObject;
        T result = caseComplexType(complexType);
        if (result == null) result = caseType(complexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VEC_TYPE:
      {
        VecType vecType = (VecType)theEObject;
        T result = caseVecType(vecType);
        if (result == null) result = caseComplexType(vecType);
        if (result == null) result = caseType(vecType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT_TYPE:
      {
        MatType matType = (MatType)theEObject;
        T result = caseMatType(matType);
        if (result == null) result = caseComplexType(matType);
        if (result == null) result = caseType(matType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = caseSymbol(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SWITCH_CASE:
      {
        SwitchCase switchCase = (SwitchCase)theEObject;
        T result = caseSwitchCase(switchCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BLOCK_STATEMENT:
      {
        BlockStatement blockStatement = (BlockStatement)theEObject;
        T result = caseBlockStatement(blockStatement);
        if (result == null) result = caseStatement(blockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.JUMP_STATEMENT:
      {
        JumpStatement jumpStatement = (JumpStatement)theEObject;
        T result = caseJumpStatement(jumpStatement);
        if (result == null) result = caseStatement(jumpStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseSymbol(variableDeclaration);
        if (result == null) result = caseStatement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.ASSIGNMENT_STATEMENT:
      {
        AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
        T result = caseAssignmentStatement(assignmentStatement);
        if (result == null) result = caseStatement(assignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.EXP:
      {
        Exp exp = (Exp)theEObject;
        T result = caseExp(exp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.ABSTRACT_DEFINITION:
      {
        AbstractDefinition abstractDefinition = (AbstractDefinition)theEObject;
        T result = caseAbstractDefinition(abstractDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = caseAbstractDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.DECLARED_PARAMETER:
      {
        DeclaredParameter declaredParameter = (DeclaredParameter)theEObject;
        T result = caseDeclaredParameter(declaredParameter);
        if (result == null) result = caseAbstractDefinition(declaredParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.EVALUATION:
      {
        Evaluation evaluation = (Evaluation)theEObject;
        T result = caseEvaluation(evaluation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UNIFORM_DECLARATION:
      {
        UniformDeclaration uniformDeclaration = (UniformDeclaration)theEObject;
        T result = caseUniformDeclaration(uniformDeclaration);
        if (result == null) result = caseSymbol(uniformDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IN_ATTRIBUTE_DECLARATION:
      {
        InAttributeDeclaration inAttributeDeclaration = (InAttributeDeclaration)theEObject;
        T result = caseInAttributeDeclaration(inAttributeDeclaration);
        if (result == null) result = caseSymbol(inAttributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.OUT_ATTRIBUTE_DECLARATION:
      {
        OutAttributeDeclaration outAttributeDeclaration = (OutAttributeDeclaration)theEObject;
        T result = caseOutAttributeDeclaration(outAttributeDeclaration);
        if (result == null) result = caseSymbol(outAttributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IN_OUT_ATTRIBUTE_DECLARATION:
      {
        InOutAttributeDeclaration inOutAttributeDeclaration = (InOutAttributeDeclaration)theEObject;
        T result = caseInOutAttributeDeclaration(inOutAttributeDeclaration);
        if (result == null) result = caseSymbol(inOutAttributeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VOID_TYPE:
      {
        VoidType voidType = (VoidType)theEObject;
        T result = caseVoidType(voidType);
        if (result == null) result = caseType(voidType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = caseScalarType(intType);
        if (result == null) result = caseType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UINT_TYPE:
      {
        UIntType uIntType = (UIntType)theEObject;
        T result = caseUIntType(uIntType);
        if (result == null) result = caseScalarType(uIntType);
        if (result == null) result = caseType(uIntType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BOOL_TYPE:
      {
        BoolType boolType = (BoolType)theEObject;
        T result = caseBoolType(boolType);
        if (result == null) result = caseScalarType(boolType);
        if (result == null) result = caseType(boolType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = caseScalarType(floatType);
        if (result == null) result = caseType(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VEC2_TYPE:
      {
        Vec2Type vec2Type = (Vec2Type)theEObject;
        T result = caseVec2Type(vec2Type);
        if (result == null) result = caseVecType(vec2Type);
        if (result == null) result = caseComplexType(vec2Type);
        if (result == null) result = caseType(vec2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VEC3_TYPE:
      {
        Vec3Type vec3Type = (Vec3Type)theEObject;
        T result = caseVec3Type(vec3Type);
        if (result == null) result = caseVecType(vec3Type);
        if (result == null) result = caseComplexType(vec3Type);
        if (result == null) result = caseType(vec3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.VEC4_TYPE:
      {
        Vec4Type vec4Type = (Vec4Type)theEObject;
        T result = caseVec4Type(vec4Type);
        if (result == null) result = caseVecType(vec4Type);
        if (result == null) result = caseComplexType(vec4Type);
        if (result == null) result = caseType(vec4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IVEC2_TYPE:
      {
        IVec2Type iVec2Type = (IVec2Type)theEObject;
        T result = caseIVec2Type(iVec2Type);
        if (result == null) result = caseVecType(iVec2Type);
        if (result == null) result = caseComplexType(iVec2Type);
        if (result == null) result = caseType(iVec2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IVEC3_TYPE:
      {
        IVec3Type iVec3Type = (IVec3Type)theEObject;
        T result = caseIVec3Type(iVec3Type);
        if (result == null) result = caseVecType(iVec3Type);
        if (result == null) result = caseComplexType(iVec3Type);
        if (result == null) result = caseType(iVec3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IVEC4_TYPE:
      {
        IVec4Type iVec4Type = (IVec4Type)theEObject;
        T result = caseIVec4Type(iVec4Type);
        if (result == null) result = caseVecType(iVec4Type);
        if (result == null) result = caseComplexType(iVec4Type);
        if (result == null) result = caseType(iVec4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UVEC2_TYPE:
      {
        UVec2Type uVec2Type = (UVec2Type)theEObject;
        T result = caseUVec2Type(uVec2Type);
        if (result == null) result = caseVecType(uVec2Type);
        if (result == null) result = caseComplexType(uVec2Type);
        if (result == null) result = caseType(uVec2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UVEC3_TYPE:
      {
        UVec3Type uVec3Type = (UVec3Type)theEObject;
        T result = caseUVec3Type(uVec3Type);
        if (result == null) result = caseVecType(uVec3Type);
        if (result == null) result = caseComplexType(uVec3Type);
        if (result == null) result = caseType(uVec3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UVEC4_TYPE:
      {
        UVec4Type uVec4Type = (UVec4Type)theEObject;
        T result = caseUVec4Type(uVec4Type);
        if (result == null) result = caseVecType(uVec4Type);
        if (result == null) result = caseComplexType(uVec4Type);
        if (result == null) result = caseType(uVec4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BVEC2_TYPE:
      {
        BVec2Type bVec2Type = (BVec2Type)theEObject;
        T result = caseBVec2Type(bVec2Type);
        if (result == null) result = caseVecType(bVec2Type);
        if (result == null) result = caseComplexType(bVec2Type);
        if (result == null) result = caseType(bVec2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BVEC3_TYPE:
      {
        BVec3Type bVec3Type = (BVec3Type)theEObject;
        T result = caseBVec3Type(bVec3Type);
        if (result == null) result = caseVecType(bVec3Type);
        if (result == null) result = caseComplexType(bVec3Type);
        if (result == null) result = caseType(bVec3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BVEC4_TYPE:
      {
        BVec4Type bVec4Type = (BVec4Type)theEObject;
        T result = caseBVec4Type(bVec4Type);
        if (result == null) result = caseVecType(bVec4Type);
        if (result == null) result = caseComplexType(bVec4Type);
        if (result == null) result = caseType(bVec4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT2_TYPE:
      {
        Mat2Type mat2Type = (Mat2Type)theEObject;
        T result = caseMat2Type(mat2Type);
        if (result == null) result = caseMatType(mat2Type);
        if (result == null) result = caseComplexType(mat2Type);
        if (result == null) result = caseType(mat2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT3_TYPE:
      {
        Mat3Type mat3Type = (Mat3Type)theEObject;
        T result = caseMat3Type(mat3Type);
        if (result == null) result = caseMatType(mat3Type);
        if (result == null) result = caseComplexType(mat3Type);
        if (result == null) result = caseType(mat3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT4_TYPE:
      {
        Mat4Type mat4Type = (Mat4Type)theEObject;
        T result = caseMat4Type(mat4Type);
        if (result == null) result = caseMatType(mat4Type);
        if (result == null) result = caseComplexType(mat4Type);
        if (result == null) result = caseType(mat4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT2X2_TYPE:
      {
        Mat2x2Type mat2x2Type = (Mat2x2Type)theEObject;
        T result = caseMat2x2Type(mat2x2Type);
        if (result == null) result = caseMatType(mat2x2Type);
        if (result == null) result = caseComplexType(mat2x2Type);
        if (result == null) result = caseType(mat2x2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT2X3_TYPE:
      {
        Mat2x3Type mat2x3Type = (Mat2x3Type)theEObject;
        T result = caseMat2x3Type(mat2x3Type);
        if (result == null) result = caseMatType(mat2x3Type);
        if (result == null) result = caseComplexType(mat2x3Type);
        if (result == null) result = caseType(mat2x3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT2X4_TYPE:
      {
        Mat2x4Type mat2x4Type = (Mat2x4Type)theEObject;
        T result = caseMat2x4Type(mat2x4Type);
        if (result == null) result = caseMatType(mat2x4Type);
        if (result == null) result = caseComplexType(mat2x4Type);
        if (result == null) result = caseType(mat2x4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT3X2_TYPE:
      {
        Mat3x2Type mat3x2Type = (Mat3x2Type)theEObject;
        T result = caseMat3x2Type(mat3x2Type);
        if (result == null) result = caseMatType(mat3x2Type);
        if (result == null) result = caseComplexType(mat3x2Type);
        if (result == null) result = caseType(mat3x2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT3X3_TYPE:
      {
        Mat3x3Type mat3x3Type = (Mat3x3Type)theEObject;
        T result = caseMat3x3Type(mat3x3Type);
        if (result == null) result = caseMatType(mat3x3Type);
        if (result == null) result = caseComplexType(mat3x3Type);
        if (result == null) result = caseType(mat3x3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT3X4_TYPE:
      {
        Mat3x4Type mat3x4Type = (Mat3x4Type)theEObject;
        T result = caseMat3x4Type(mat3x4Type);
        if (result == null) result = caseMatType(mat3x4Type);
        if (result == null) result = caseComplexType(mat3x4Type);
        if (result == null) result = caseType(mat3x4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT4X2_TYPE:
      {
        Mat4x2Type mat4x2Type = (Mat4x2Type)theEObject;
        T result = caseMat4x2Type(mat4x2Type);
        if (result == null) result = caseMatType(mat4x2Type);
        if (result == null) result = caseComplexType(mat4x2Type);
        if (result == null) result = caseType(mat4x2Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT4X3_TYPE:
      {
        Mat4x3Type mat4x3Type = (Mat4x3Type)theEObject;
        T result = caseMat4x3Type(mat4x3Type);
        if (result == null) result = caseMatType(mat4x3Type);
        if (result == null) result = caseComplexType(mat4x3Type);
        if (result == null) result = caseType(mat4x3Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MAT4X4_TYPE:
      {
        Mat4x4Type mat4x4Type = (Mat4x4Type)theEObject;
        T result = caseMat4x4Type(mat4x4Type);
        if (result == null) result = caseMatType(mat4x4Type);
        if (result == null) result = caseComplexType(mat4x4Type);
        if (result == null) result = caseType(mat4x4Type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SYMBOL_REF:
      {
        SymbolRef symbolRef = (SymbolRef)theEObject;
        T result = caseSymbolRef(symbolRef);
        if (result == null) result = caseStatement(symbolRef);
        if (result == null) result = caseExp(symbolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = caseStatement(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = caseStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = caseStatement(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseJumpStatement(return_);
        if (result == null) result = caseStatement(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.INLINE_IF_EXP:
      {
        InlineIfExp inlineIfExp = (InlineIfExp)theEObject;
        T result = caseInlineIfExp(inlineIfExp);
        if (result == null) result = caseExp(inlineIfExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.LOGIC_EXP:
      {
        LogicExp logicExp = (LogicExp)theEObject;
        T result = caseLogicExp(logicExp);
        if (result == null) result = caseExp(logicExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.ADD_EXP:
      {
        AddExp addExp = (AddExp)theEObject;
        T result = caseAddExp(addExp);
        if (result == null) result = caseExp(addExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.MUL_EXP:
      {
        MulExp mulExp = (MulExp)theEObject;
        T result = caseMulExp(mulExp);
        if (result == null) result = caseExp(mulExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SYMBOL_REF_INVOCATION:
      {
        SymbolRefInvocation symbolRefInvocation = (SymbolRefInvocation)theEObject;
        T result = caseSymbolRefInvocation(symbolRefInvocation);
        if (result == null) result = caseExp(symbolRefInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.SYMBOL_REF_MEMBER:
      {
        SymbolRefMember symbolRefMember = (SymbolRefMember)theEObject;
        T result = caseSymbolRefMember(symbolRefMember);
        if (result == null) result = caseExp(symbolRefMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.CONSTRUCTOR:
      {
        Constructor constructor = (Constructor)theEObject;
        T result = caseConstructor(constructor);
        if (result == null) result = caseExp(constructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseExp(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.UINTEGER_LITERAL:
      {
        UIntegerLiteral uIntegerLiteral = (UIntegerLiteral)theEObject;
        T result = caseUIntegerLiteral(uIntegerLiteral);
        if (result == null) result = caseExp(uIntegerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.FLOAT_LITERAL:
      {
        FloatLiteral floatLiteral = (FloatLiteral)theEObject;
        T result = caseFloatLiteral(floatLiteral);
        if (result == null) result = caseExp(floatLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GlslPackage.BOOL_LITERAL:
      {
        BoolLiteral boolLiteral = (BoolLiteral)theEObject;
        T result = caseBoolLiteral(boolLiteral);
        if (result == null) result = caseExp(boolLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSourceFile(SourceFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precompiler Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precompiler Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecompilerStatement(PrecompilerStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precompiler Version</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precompiler Version</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrecompilerVersion(PrecompilerVersion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Prototype</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Prototype</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionPrototype(FunctionPrototype object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarType(ScalarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexType(ComplexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vec Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vec Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVecType(VecType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatType(MatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchCase(SwitchCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockStatement(BlockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jump Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJumpStatement(JumpStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentStatement(AssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExp(Exp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDefinition(AbstractDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaredParameter(DeclaredParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluation(Evaluation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uniform Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uniform Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniformDeclaration(UniformDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInAttributeDeclaration(InAttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Out Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Out Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutAttributeDeclaration(OutAttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Out Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Out Attribute Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInOutAttributeDeclaration(InOutAttributeDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Void Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVoidType(VoidType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UInt Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UInt Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIntType(UIntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolType(BoolType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatType(FloatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVec2Type(Vec2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vec3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vec3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVec3Type(Vec3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vec4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vec4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVec4Type(Vec4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVec2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVec2Type(IVec2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVec3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVec3Type(IVec3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IVec4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIVec4Type(IVec4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UVec2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUVec2Type(UVec2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UVec3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUVec3Type(UVec3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UVec4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUVec4Type(UVec4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BVec2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVec2Type(BVec2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BVec3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVec3Type(BVec3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BVec4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBVec4Type(BVec4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat2Type(Mat2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat3Type(Mat3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat4Type(Mat4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat2x2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat2x2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat2x2Type(Mat2x2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat2x3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat2x3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat2x3Type(Mat2x3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat2x4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat2x4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat2x4Type(Mat2x4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat3x2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat3x2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat3x2Type(Mat3x2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat3x3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat3x3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat3x3Type(Mat3x3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat3x4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat3x4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat3x4Type(Mat3x4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat4x2 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat4x2 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat4x2Type(Mat4x2Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat4x3 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat4x3 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat4x3Type(Mat4x3Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mat4x4 Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mat4x4 Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMat4x4Type(Mat4x4Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRef(SymbolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileStatement(WhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStatement(SwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inline If Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inline If Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInlineIfExp(InlineIfExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logic Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logic Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicExp(LogicExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddExp(AddExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulExp(MulExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Ref Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Ref Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRefInvocation(SymbolRefInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Ref Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Ref Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRefMember(SymbolRefMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor(Constructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UInteger Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UInteger Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIntegerLiteral(UIntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatLiteral(FloatLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLiteral(BoolLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GlslSwitch
