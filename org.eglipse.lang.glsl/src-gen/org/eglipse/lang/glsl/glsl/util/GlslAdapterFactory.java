/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eglipse.lang.glsl.glsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eglipse.lang.glsl.glsl.GlslPackage
 * @generated
 */
public class GlslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GlslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GlslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GlslSwitch<Adapter> modelSwitch =
    new GlslSwitch<Adapter>()
    {
      @Override
      public Adapter caseSourceFile(SourceFile object)
      {
        return createSourceFileAdapter();
      }
      @Override
      public Adapter casePrecompilerStatement(PrecompilerStatement object)
      {
        return createPrecompilerStatementAdapter();
      }
      @Override
      public Adapter casePrecompilerVersion(PrecompilerVersion object)
      {
        return createPrecompilerVersionAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseFunctionPrototype(FunctionPrototype object)
      {
        return createFunctionPrototypeAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseScalarType(ScalarType object)
      {
        return createScalarTypeAdapter();
      }
      @Override
      public Adapter caseComplexType(ComplexType object)
      {
        return createComplexTypeAdapter();
      }
      @Override
      public Adapter caseVecType(VecType object)
      {
        return createVecTypeAdapter();
      }
      @Override
      public Adapter caseMatType(MatType object)
      {
        return createMatTypeAdapter();
      }
      @Override
      public Adapter caseFunctionDefinition(FunctionDefinition object)
      {
        return createFunctionDefinitionAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseSwitchCase(SwitchCase object)
      {
        return createSwitchCaseAdapter();
      }
      @Override
      public Adapter caseBlockStatement(BlockStatement object)
      {
        return createBlockStatementAdapter();
      }
      @Override
      public Adapter caseJumpStatement(JumpStatement object)
      {
        return createJumpStatementAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseAssignmentStatement(AssignmentStatement object)
      {
        return createAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseExp(Exp object)
      {
        return createExpAdapter();
      }
      @Override
      public Adapter caseAbstractDefinition(AbstractDefinition object)
      {
        return createAbstractDefinitionAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseDeclaredParameter(DeclaredParameter object)
      {
        return createDeclaredParameterAdapter();
      }
      @Override
      public Adapter caseEvaluation(Evaluation object)
      {
        return createEvaluationAdapter();
      }
      @Override
      public Adapter caseUniformDeclaration(UniformDeclaration object)
      {
        return createUniformDeclarationAdapter();
      }
      @Override
      public Adapter caseInAttributeDeclaration(InAttributeDeclaration object)
      {
        return createInAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseOutAttributeDeclaration(OutAttributeDeclaration object)
      {
        return createOutAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseInOutAttributeDeclaration(InOutAttributeDeclaration object)
      {
        return createInOutAttributeDeclarationAdapter();
      }
      @Override
      public Adapter caseVoidType(VoidType object)
      {
        return createVoidTypeAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseUIntType(UIntType object)
      {
        return createUIntTypeAdapter();
      }
      @Override
      public Adapter caseBoolType(BoolType object)
      {
        return createBoolTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseVec2Type(Vec2Type object)
      {
        return createVec2TypeAdapter();
      }
      @Override
      public Adapter caseVec3Type(Vec3Type object)
      {
        return createVec3TypeAdapter();
      }
      @Override
      public Adapter caseVec4Type(Vec4Type object)
      {
        return createVec4TypeAdapter();
      }
      @Override
      public Adapter caseIVec2Type(IVec2Type object)
      {
        return createIVec2TypeAdapter();
      }
      @Override
      public Adapter caseIVec3Type(IVec3Type object)
      {
        return createIVec3TypeAdapter();
      }
      @Override
      public Adapter caseIVec4Type(IVec4Type object)
      {
        return createIVec4TypeAdapter();
      }
      @Override
      public Adapter caseUVec2Type(UVec2Type object)
      {
        return createUVec2TypeAdapter();
      }
      @Override
      public Adapter caseUVec3Type(UVec3Type object)
      {
        return createUVec3TypeAdapter();
      }
      @Override
      public Adapter caseUVec4Type(UVec4Type object)
      {
        return createUVec4TypeAdapter();
      }
      @Override
      public Adapter caseBVec2Type(BVec2Type object)
      {
        return createBVec2TypeAdapter();
      }
      @Override
      public Adapter caseBVec3Type(BVec3Type object)
      {
        return createBVec3TypeAdapter();
      }
      @Override
      public Adapter caseBVec4Type(BVec4Type object)
      {
        return createBVec4TypeAdapter();
      }
      @Override
      public Adapter caseMat2Type(Mat2Type object)
      {
        return createMat2TypeAdapter();
      }
      @Override
      public Adapter caseMat3Type(Mat3Type object)
      {
        return createMat3TypeAdapter();
      }
      @Override
      public Adapter caseMat4Type(Mat4Type object)
      {
        return createMat4TypeAdapter();
      }
      @Override
      public Adapter caseMat2x2Type(Mat2x2Type object)
      {
        return createMat2x2TypeAdapter();
      }
      @Override
      public Adapter caseMat2x3Type(Mat2x3Type object)
      {
        return createMat2x3TypeAdapter();
      }
      @Override
      public Adapter caseMat2x4Type(Mat2x4Type object)
      {
        return createMat2x4TypeAdapter();
      }
      @Override
      public Adapter caseMat3x2Type(Mat3x2Type object)
      {
        return createMat3x2TypeAdapter();
      }
      @Override
      public Adapter caseMat3x3Type(Mat3x3Type object)
      {
        return createMat3x3TypeAdapter();
      }
      @Override
      public Adapter caseMat3x4Type(Mat3x4Type object)
      {
        return createMat3x4TypeAdapter();
      }
      @Override
      public Adapter caseMat4x2Type(Mat4x2Type object)
      {
        return createMat4x2TypeAdapter();
      }
      @Override
      public Adapter caseMat4x3Type(Mat4x3Type object)
      {
        return createMat4x3TypeAdapter();
      }
      @Override
      public Adapter caseMat4x4Type(Mat4x4Type object)
      {
        return createMat4x4TypeAdapter();
      }
      @Override
      public Adapter caseSymbolRef(SymbolRef object)
      {
        return createSymbolRefAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseWhileStatement(WhileStatement object)
      {
        return createWhileStatementAdapter();
      }
      @Override
      public Adapter caseForStatement(ForStatement object)
      {
        return createForStatementAdapter();
      }
      @Override
      public Adapter caseSwitchStatement(SwitchStatement object)
      {
        return createSwitchStatementAdapter();
      }
      @Override
      public Adapter caseReturn(Return object)
      {
        return createReturnAdapter();
      }
      @Override
      public Adapter caseInlineIfExp(InlineIfExp object)
      {
        return createInlineIfExpAdapter();
      }
      @Override
      public Adapter caseLogicExp(LogicExp object)
      {
        return createLogicExpAdapter();
      }
      @Override
      public Adapter caseAddExp(AddExp object)
      {
        return createAddExpAdapter();
      }
      @Override
      public Adapter caseMulExp(MulExp object)
      {
        return createMulExpAdapter();
      }
      @Override
      public Adapter caseSymbolRefInvocation(SymbolRefInvocation object)
      {
        return createSymbolRefInvocationAdapter();
      }
      @Override
      public Adapter caseSymbolRefMember(SymbolRefMember object)
      {
        return createSymbolRefMemberAdapter();
      }
      @Override
      public Adapter caseConstructor(Constructor object)
      {
        return createConstructorAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseUIntegerLiteral(UIntegerLiteral object)
      {
        return createUIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseFloatLiteral(FloatLiteral object)
      {
        return createFloatLiteralAdapter();
      }
      @Override
      public Adapter caseBoolLiteral(BoolLiteral object)
      {
        return createBoolLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SourceFile <em>Source File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SourceFile
   * @generated
   */
  public Adapter createSourceFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.PrecompilerStatement <em>Precompiler Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerStatement
   * @generated
   */
  public Adapter createPrecompilerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.PrecompilerVersion <em>Precompiler Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.PrecompilerVersion
   * @generated
   */
  public Adapter createPrecompilerVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.FunctionPrototype <em>Function Prototype</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.FunctionPrototype
   * @generated
   */
  public Adapter createFunctionPrototypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.ScalarType <em>Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.ScalarType
   * @generated
   */
  public Adapter createScalarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.ComplexType
   * @generated
   */
  public Adapter createComplexTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.VecType <em>Vec Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.VecType
   * @generated
   */
  public Adapter createVecTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.MatType <em>Mat Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.MatType
   * @generated
   */
  public Adapter createMatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.FunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.FunctionDefinition
   * @generated
   */
  public Adapter createFunctionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SwitchCase
   * @generated
   */
  public Adapter createSwitchCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BlockStatement <em>Block Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BlockStatement
   * @generated
   */
  public Adapter createBlockStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.JumpStatement <em>Jump Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.JumpStatement
   * @generated
   */
  public Adapter createJumpStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.AssignmentStatement
   * @generated
   */
  public Adapter createAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Exp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Exp
   * @generated
   */
  public Adapter createExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.AbstractDefinition <em>Abstract Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.AbstractDefinition
   * @generated
   */
  public Adapter createAbstractDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.DeclaredParameter <em>Declared Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.DeclaredParameter
   * @generated
   */
  public Adapter createDeclaredParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Evaluation
   * @generated
   */
  public Adapter createEvaluationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UniformDeclaration <em>Uniform Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UniformDeclaration
   * @generated
   */
  public Adapter createUniformDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.InAttributeDeclaration <em>In Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.InAttributeDeclaration
   * @generated
   */
  public Adapter createInAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.OutAttributeDeclaration <em>Out Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.OutAttributeDeclaration
   * @generated
   */
  public Adapter createOutAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration <em>In Out Attribute Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.InOutAttributeDeclaration
   * @generated
   */
  public Adapter createInOutAttributeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.VoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.VoidType
   * @generated
   */
  public Adapter createVoidTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UIntType <em>UInt Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UIntType
   * @generated
   */
  public Adapter createUIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BoolType
   * @generated
   */
  public Adapter createBoolTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.FloatType
   * @generated
   */
  public Adapter createFloatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Vec2Type <em>Vec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Vec2Type
   * @generated
   */
  public Adapter createVec2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Vec3Type <em>Vec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Vec3Type
   * @generated
   */
  public Adapter createVec3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Vec4Type <em>Vec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Vec4Type
   * @generated
   */
  public Adapter createVec4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IVec2Type <em>IVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IVec2Type
   * @generated
   */
  public Adapter createIVec2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IVec3Type <em>IVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IVec3Type
   * @generated
   */
  public Adapter createIVec3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IVec4Type <em>IVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IVec4Type
   * @generated
   */
  public Adapter createIVec4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UVec2Type <em>UVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UVec2Type
   * @generated
   */
  public Adapter createUVec2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UVec3Type <em>UVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UVec3Type
   * @generated
   */
  public Adapter createUVec3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UVec4Type <em>UVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UVec4Type
   * @generated
   */
  public Adapter createUVec4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BVec2Type <em>BVec2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BVec2Type
   * @generated
   */
  public Adapter createBVec2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BVec3Type <em>BVec3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BVec3Type
   * @generated
   */
  public Adapter createBVec3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BVec4Type <em>BVec4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BVec4Type
   * @generated
   */
  public Adapter createBVec4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat2Type <em>Mat2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat2Type
   * @generated
   */
  public Adapter createMat2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat3Type <em>Mat3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat3Type
   * @generated
   */
  public Adapter createMat3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat4Type <em>Mat4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat4Type
   * @generated
   */
  public Adapter createMat4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat2x2Type <em>Mat2x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat2x2Type
   * @generated
   */
  public Adapter createMat2x2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat2x3Type <em>Mat2x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat2x3Type
   * @generated
   */
  public Adapter createMat2x3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat2x4Type <em>Mat2x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat2x4Type
   * @generated
   */
  public Adapter createMat2x4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat3x2Type <em>Mat3x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat3x2Type
   * @generated
   */
  public Adapter createMat3x2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat3x3Type <em>Mat3x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat3x3Type
   * @generated
   */
  public Adapter createMat3x3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat3x4Type <em>Mat3x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat3x4Type
   * @generated
   */
  public Adapter createMat3x4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat4x2Type <em>Mat4x2 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat4x2Type
   * @generated
   */
  public Adapter createMat4x2TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat4x3Type <em>Mat4x3 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat4x3Type
   * @generated
   */
  public Adapter createMat4x3TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Mat4x4Type <em>Mat4x4 Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Mat4x4Type
   * @generated
   */
  public Adapter createMat4x4TypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SymbolRef
   * @generated
   */
  public Adapter createSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.WhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.WhileStatement
   * @generated
   */
  public Adapter createWhileStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.ForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.ForStatement
   * @generated
   */
  public Adapter createForStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SwitchStatement
   * @generated
   */
  public Adapter createSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Return
   * @generated
   */
  public Adapter createReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.InlineIfExp <em>Inline If Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.InlineIfExp
   * @generated
   */
  public Adapter createInlineIfExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.LogicExp <em>Logic Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.LogicExp
   * @generated
   */
  public Adapter createLogicExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.AddExp <em>Add Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.AddExp
   * @generated
   */
  public Adapter createAddExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.MulExp <em>Mul Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.MulExp
   * @generated
   */
  public Adapter createMulExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SymbolRefInvocation <em>Symbol Ref Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefInvocation
   * @generated
   */
  public Adapter createSymbolRefInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.SymbolRefMember <em>Symbol Ref Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.SymbolRefMember
   * @generated
   */
  public Adapter createSymbolRefMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.Constructor
   * @generated
   */
  public Adapter createConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.UIntegerLiteral <em>UInteger Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.UIntegerLiteral
   * @generated
   */
  public Adapter createUIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.FloatLiteral <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.FloatLiteral
   * @generated
   */
  public Adapter createFloatLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eglipse.lang.glsl.glsl.BoolLiteral <em>Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eglipse.lang.glsl.glsl.BoolLiteral
   * @generated
   */
  public Adapter createBoolLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GlslAdapterFactory
