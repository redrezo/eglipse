/**
 * <copyright>
 * </copyright>
 *

 */
package org.eglipse.lang.glsl.glsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eglipse.lang.glsl.glsl.GlslPackage
 * @generated
 */
public interface GlslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GlslFactory eINSTANCE = org.eglipse.lang.glsl.glsl.impl.GlslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Source File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source File</em>'.
   * @generated
   */
  SourceFile createSourceFile();

  /**
   * Returns a new object of class '<em>Precompiler Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precompiler Statement</em>'.
   * @generated
   */
  PrecompilerStatement createPrecompilerStatement();

  /**
   * Returns a new object of class '<em>Precompiler Version</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Precompiler Version</em>'.
   * @generated
   */
  PrecompilerVersion createPrecompilerVersion();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>Function Prototype</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Prototype</em>'.
   * @generated
   */
  FunctionPrototype createFunctionPrototype();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scalar Type</em>'.
   * @generated
   */
  ScalarType createScalarType();

  /**
   * Returns a new object of class '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Type</em>'.
   * @generated
   */
  ComplexType createComplexType();

  /**
   * Returns a new object of class '<em>Vec Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vec Type</em>'.
   * @generated
   */
  VecType createVecType();

  /**
   * Returns a new object of class '<em>Mat Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat Type</em>'.
   * @generated
   */
  MatType createMatType();

  /**
   * Returns a new object of class '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Definition</em>'.
   * @generated
   */
  FunctionDefinition createFunctionDefinition();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Switch Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Case</em>'.
   * @generated
   */
  SwitchCase createSwitchCase();

  /**
   * Returns a new object of class '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block Statement</em>'.
   * @generated
   */
  BlockStatement createBlockStatement();

  /**
   * Returns a new object of class '<em>Jump Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump Statement</em>'.
   * @generated
   */
  JumpStatement createJumpStatement();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Statement</em>'.
   * @generated
   */
  AssignmentStatement createAssignmentStatement();

  /**
   * Returns a new object of class '<em>Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp</em>'.
   * @generated
   */
  Exp createExp();

  /**
   * Returns a new object of class '<em>Abstract Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Definition</em>'.
   * @generated
   */
  AbstractDefinition createAbstractDefinition();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Declared Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declared Parameter</em>'.
   * @generated
   */
  DeclaredParameter createDeclaredParameter();

  /**
   * Returns a new object of class '<em>Evaluation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Evaluation</em>'.
   * @generated
   */
  Evaluation createEvaluation();

  /**
   * Returns a new object of class '<em>Uniform Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uniform Declaration</em>'.
   * @generated
   */
  UniformDeclaration createUniformDeclaration();

  /**
   * Returns a new object of class '<em>In Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Attribute Declaration</em>'.
   * @generated
   */
  InAttributeDeclaration createInAttributeDeclaration();

  /**
   * Returns a new object of class '<em>Out Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Out Attribute Declaration</em>'.
   * @generated
   */
  OutAttributeDeclaration createOutAttributeDeclaration();

  /**
   * Returns a new object of class '<em>In Out Attribute Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Out Attribute Declaration</em>'.
   * @generated
   */
  InOutAttributeDeclaration createInOutAttributeDeclaration();

  /**
   * Returns a new object of class '<em>Void Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Void Type</em>'.
   * @generated
   */
  VoidType createVoidType();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>UInt Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UInt Type</em>'.
   * @generated
   */
  UIntType createUIntType();

  /**
   * Returns a new object of class '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Type</em>'.
   * @generated
   */
  BoolType createBoolType();

  /**
   * Returns a new object of class '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Type</em>'.
   * @generated
   */
  FloatType createFloatType();

  /**
   * Returns a new object of class '<em>Vec2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vec2 Type</em>'.
   * @generated
   */
  Vec2Type createVec2Type();

  /**
   * Returns a new object of class '<em>Vec3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vec3 Type</em>'.
   * @generated
   */
  Vec3Type createVec3Type();

  /**
   * Returns a new object of class '<em>Vec4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vec4 Type</em>'.
   * @generated
   */
  Vec4Type createVec4Type();

  /**
   * Returns a new object of class '<em>IVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IVec2 Type</em>'.
   * @generated
   */
  IVec2Type createIVec2Type();

  /**
   * Returns a new object of class '<em>IVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IVec3 Type</em>'.
   * @generated
   */
  IVec3Type createIVec3Type();

  /**
   * Returns a new object of class '<em>IVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IVec4 Type</em>'.
   * @generated
   */
  IVec4Type createIVec4Type();

  /**
   * Returns a new object of class '<em>UVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UVec2 Type</em>'.
   * @generated
   */
  UVec2Type createUVec2Type();

  /**
   * Returns a new object of class '<em>UVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UVec3 Type</em>'.
   * @generated
   */
  UVec3Type createUVec3Type();

  /**
   * Returns a new object of class '<em>UVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UVec4 Type</em>'.
   * @generated
   */
  UVec4Type createUVec4Type();

  /**
   * Returns a new object of class '<em>BVec2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BVec2 Type</em>'.
   * @generated
   */
  BVec2Type createBVec2Type();

  /**
   * Returns a new object of class '<em>BVec3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BVec3 Type</em>'.
   * @generated
   */
  BVec3Type createBVec3Type();

  /**
   * Returns a new object of class '<em>BVec4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BVec4 Type</em>'.
   * @generated
   */
  BVec4Type createBVec4Type();

  /**
   * Returns a new object of class '<em>Mat2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat2 Type</em>'.
   * @generated
   */
  Mat2Type createMat2Type();

  /**
   * Returns a new object of class '<em>Mat3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat3 Type</em>'.
   * @generated
   */
  Mat3Type createMat3Type();

  /**
   * Returns a new object of class '<em>Mat4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat4 Type</em>'.
   * @generated
   */
  Mat4Type createMat4Type();

  /**
   * Returns a new object of class '<em>Mat2x2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat2x2 Type</em>'.
   * @generated
   */
  Mat2x2Type createMat2x2Type();

  /**
   * Returns a new object of class '<em>Mat2x3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat2x3 Type</em>'.
   * @generated
   */
  Mat2x3Type createMat2x3Type();

  /**
   * Returns a new object of class '<em>Mat2x4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat2x4 Type</em>'.
   * @generated
   */
  Mat2x4Type createMat2x4Type();

  /**
   * Returns a new object of class '<em>Mat3x2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat3x2 Type</em>'.
   * @generated
   */
  Mat3x2Type createMat3x2Type();

  /**
   * Returns a new object of class '<em>Mat3x3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat3x3 Type</em>'.
   * @generated
   */
  Mat3x3Type createMat3x3Type();

  /**
   * Returns a new object of class '<em>Mat3x4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat3x4 Type</em>'.
   * @generated
   */
  Mat3x4Type createMat3x4Type();

  /**
   * Returns a new object of class '<em>Mat4x2 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat4x2 Type</em>'.
   * @generated
   */
  Mat4x2Type createMat4x2Type();

  /**
   * Returns a new object of class '<em>Mat4x3 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat4x3 Type</em>'.
   * @generated
   */
  Mat4x3Type createMat4x3Type();

  /**
   * Returns a new object of class '<em>Mat4x4 Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mat4x4 Type</em>'.
   * @generated
   */
  Mat4x4Type createMat4x4Type();

  /**
   * Returns a new object of class '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Ref</em>'.
   * @generated
   */
  SymbolRef createSymbolRef();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  WhileStatement createWhileStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  ForStatement createForStatement();

  /**
   * Returns a new object of class '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Statement</em>'.
   * @generated
   */
  SwitchStatement createSwitchStatement();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Inline If Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inline If Exp</em>'.
   * @generated
   */
  InlineIfExp createInlineIfExp();

  /**
   * Returns a new object of class '<em>Logic Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logic Exp</em>'.
   * @generated
   */
  LogicExp createLogicExp();

  /**
   * Returns a new object of class '<em>Add Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Exp</em>'.
   * @generated
   */
  AddExp createAddExp();

  /**
   * Returns a new object of class '<em>Mul Exp</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Exp</em>'.
   * @generated
   */
  MulExp createMulExp();

  /**
   * Returns a new object of class '<em>Symbol Ref Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Ref Invocation</em>'.
   * @generated
   */
  SymbolRefInvocation createSymbolRefInvocation();

  /**
   * Returns a new object of class '<em>Symbol Ref Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Ref Member</em>'.
   * @generated
   */
  SymbolRefMember createSymbolRefMember();

  /**
   * Returns a new object of class '<em>Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor</em>'.
   * @generated
   */
  Constructor createConstructor();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>UInteger Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UInteger Literal</em>'.
   * @generated
   */
  UIntegerLiteral createUIntegerLiteral();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  FloatLiteral createFloatLiteral();

  /**
   * Returns a new object of class '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Literal</em>'.
   * @generated
   */
  BoolLiteral createBoolLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GlslPackage getGlslPackage();

} //GlslFactory
