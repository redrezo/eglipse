package at.caks.eglipse.lang.glsl.serializer;

import at.caks.eglipse.lang.glsl.glsl.AddExp;
import at.caks.eglipse.lang.glsl.glsl.AssignmentStatement;
import at.caks.eglipse.lang.glsl.glsl.BVec2Type;
import at.caks.eglipse.lang.glsl.glsl.BVec3Type;
import at.caks.eglipse.lang.glsl.glsl.BVec4Type;
import at.caks.eglipse.lang.glsl.glsl.BlockStatement;
import at.caks.eglipse.lang.glsl.glsl.BoolLiteral;
import at.caks.eglipse.lang.glsl.glsl.BoolType;
import at.caks.eglipse.lang.glsl.glsl.Constructor;
import at.caks.eglipse.lang.glsl.glsl.DeclaredParameter;
import at.caks.eglipse.lang.glsl.glsl.Definition;
import at.caks.eglipse.lang.glsl.glsl.Evaluation;
import at.caks.eglipse.lang.glsl.glsl.FloatLiteral;
import at.caks.eglipse.lang.glsl.glsl.FloatType;
import at.caks.eglipse.lang.glsl.glsl.ForStatement;
import at.caks.eglipse.lang.glsl.glsl.FunctionCall;
import at.caks.eglipse.lang.glsl.glsl.FunctionPrototype;
import at.caks.eglipse.lang.glsl.glsl.GlslPackage;
import at.caks.eglipse.lang.glsl.glsl.IVec2Type;
import at.caks.eglipse.lang.glsl.glsl.IVec3Type;
import at.caks.eglipse.lang.glsl.glsl.IVec4Type;
import at.caks.eglipse.lang.glsl.glsl.IfStatement;
import at.caks.eglipse.lang.glsl.glsl.InAttributeDeclaration;
import at.caks.eglipse.lang.glsl.glsl.InOutAttributeDeclaration;
import at.caks.eglipse.lang.glsl.glsl.InlineIfExp;
import at.caks.eglipse.lang.glsl.glsl.IntType;
import at.caks.eglipse.lang.glsl.glsl.IntegerLiteral;
import at.caks.eglipse.lang.glsl.glsl.LogicExp;
import at.caks.eglipse.lang.glsl.glsl.Mat2Type;
import at.caks.eglipse.lang.glsl.glsl.Mat2x2Type;
import at.caks.eglipse.lang.glsl.glsl.Mat2x3Type;
import at.caks.eglipse.lang.glsl.glsl.Mat2x4Type;
import at.caks.eglipse.lang.glsl.glsl.Mat3Type;
import at.caks.eglipse.lang.glsl.glsl.Mat3x2Type;
import at.caks.eglipse.lang.glsl.glsl.Mat3x3Type;
import at.caks.eglipse.lang.glsl.glsl.Mat3x4Type;
import at.caks.eglipse.lang.glsl.glsl.Mat4Type;
import at.caks.eglipse.lang.glsl.glsl.Mat4x2Type;
import at.caks.eglipse.lang.glsl.glsl.Mat4x3Type;
import at.caks.eglipse.lang.glsl.glsl.Mat4x4Type;
import at.caks.eglipse.lang.glsl.glsl.MulExp;
import at.caks.eglipse.lang.glsl.glsl.OutAttributeDeclaration;
import at.caks.eglipse.lang.glsl.glsl.Parameter;
import at.caks.eglipse.lang.glsl.glsl.PrecompilerVersion;
import at.caks.eglipse.lang.glsl.glsl.Return;
import at.caks.eglipse.lang.glsl.glsl.SourceFile;
import at.caks.eglipse.lang.glsl.glsl.SwitchCase;
import at.caks.eglipse.lang.glsl.glsl.SwitchStatement;
import at.caks.eglipse.lang.glsl.glsl.SymbolRef;
import at.caks.eglipse.lang.glsl.glsl.SymbolRefInvocation;
import at.caks.eglipse.lang.glsl.glsl.SymbolRefMember;
import at.caks.eglipse.lang.glsl.glsl.UIntType;
import at.caks.eglipse.lang.glsl.glsl.UIntegerLiteral;
import at.caks.eglipse.lang.glsl.glsl.UVec2Type;
import at.caks.eglipse.lang.glsl.glsl.UVec3Type;
import at.caks.eglipse.lang.glsl.glsl.UVec4Type;
import at.caks.eglipse.lang.glsl.glsl.UniformDeclaration;
import at.caks.eglipse.lang.glsl.glsl.VariableDeclaration;
import at.caks.eglipse.lang.glsl.glsl.Vec2Type;
import at.caks.eglipse.lang.glsl.glsl.Vec3Type;
import at.caks.eglipse.lang.glsl.glsl.Vec4Type;
import at.caks.eglipse.lang.glsl.glsl.VoidType;
import at.caks.eglipse.lang.glsl.glsl.WhileStatement;
import at.caks.eglipse.lang.glsl.services.GlslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractGlslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected GlslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GlslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GlslPackage.ADD_EXP:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_AddExp(context, (AddExp) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getAssignmentStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_AssignmentStatement(context, (AssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BVEC2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (BVec2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BVEC3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (BVec3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BVEC4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (BVec4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BLOCK_STATEMENT:
				if(context == grammarAccess.getBlockStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_BlockStatement(context, (BlockStatement) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BOOL_LITERAL:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Atomic(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.BOOL_TYPE:
				if(context == grammarAccess.getScalarTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ScalarType(context, (BoolType) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.CONSTRUCTOR:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Atomic(context, (Constructor) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.DECLARED_PARAMETER:
				if(context == grammarAccess.getAbstractDefinitionRule() ||
				   context == grammarAccess.getDeclaredParameterRule()) {
					sequence_DeclaredParameter(context, (DeclaredParameter) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.DEFINITION:
				if(context == grammarAccess.getAbstractDefinitionRule() ||
				   context == grammarAccess.getDefinitionRule()) {
					sequence_Definition(context, (Definition) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.EVALUATION:
				if(context == grammarAccess.getEvaluationRule()) {
					sequence_Evaluation(context, (Evaluation) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.FLOAT_LITERAL:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Atomic(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.FLOAT_TYPE:
				if(context == grammarAccess.getScalarTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ScalarType(context, (FloatType) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.FOR_STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (ForStatement) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.FUNCTION_CALL:
				if(context == grammarAccess.getFunctionCallRule()) {
					sequence_FunctionCall(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.FUNCTION_PROTOTYPE:
				if(context == grammarAccess.getFunctionDefinitionRule()) {
					sequence_FunctionDefinition(context, (FunctionPrototype) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getFunctionPrototypeRule() ||
				   context == grammarAccess.getGlobalDeclarationRule()) {
					sequence_FunctionPrototype(context, (FunctionPrototype) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IVEC2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (IVec2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IVEC3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (IVec3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IVEC4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (IVec4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IF_STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IN_ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getGlobalDeclarationRule()) {
					sequence_AttributeDeclaration(context, (InAttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.IN_OUT_ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getGlobalDeclarationRule()) {
					sequence_AttributeDeclaration(context, (InOutAttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.INLINE_IF_EXP:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Exp(context, (InlineIfExp) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.INT_TYPE:
				if(context == grammarAccess.getScalarTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ScalarType(context, (IntType) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.INTEGER_LITERAL:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Atomic(context, (IntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.LOGIC_EXP:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_LogicExp(context, (LogicExp) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT2X2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat2x2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT2X3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat2x3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT2X4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat2x4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT3X2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat3x2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT3X3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat3x3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT3X4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat3x4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT4X2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat4x2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT4X3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat4x3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MAT4X4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getMatTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MatType(context, (Mat4x4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.MUL_EXP:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_MulExp(context, (MulExp) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.OUT_ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getGlobalDeclarationRule()) {
					sequence_AttributeDeclaration(context, (OutAttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.PRECOMPILER_VERSION:
				if(context == grammarAccess.getPrecompilerStatementRule() ||
				   context == grammarAccess.getPrecompilerVersionRule()) {
					sequence_PrecompilerVersion(context, (PrecompilerVersion) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.RETURN:
				if(context == grammarAccess.getJumpStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_JumpStatement(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SOURCE_FILE:
				if(context == grammarAccess.getSourceFileRule()) {
					sequence_SourceFile(context, (SourceFile) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SWITCH_CASE:
				if(context == grammarAccess.getSwitchCaseRule()) {
					sequence_SwitchCase(context, (SwitchCase) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SWITCH_STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (SwitchStatement) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SYMBOL_REF:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule() ||
				   context == grammarAccess.getPostfixExpAccess().getSymbolRefInvocationSymbolrefAction_0_2_0_0() ||
				   context == grammarAccess.getPostfixExpAccess().getSymbolRefMemberSymbolrefAction_0_2_1_0()) {
					sequence_PostfixExp(context, (SymbolRef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (SymbolRef) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SYMBOL_REF_INVOCATION:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_PostfixExp(context, (SymbolRefInvocation) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.SYMBOL_REF_MEMBER:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_PostfixExp(context, (SymbolRefMember) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UINT_TYPE:
				if(context == grammarAccess.getScalarTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ScalarType(context, (UIntType) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UINTEGER_LITERAL:
				if(context == grammarAccess.getAddExpRule() ||
				   context == grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getExpRule() ||
				   context == grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0() ||
				   context == grammarAccess.getLogicExpRule() ||
				   context == grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0() ||
				   context == grammarAccess.getMulExpRule() ||
				   context == grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0() ||
				   context == grammarAccess.getPostfixExpRule()) {
					sequence_Atomic(context, (UIntegerLiteral) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UVEC2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (UVec2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UVEC3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (UVec3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UVEC4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (UVec4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.UNIFORM_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getGlobalDeclarationRule() ||
				   context == grammarAccess.getUniformDeclarationRule()) {
					sequence_UniformDeclaration(context, (UniformDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getGlobalDeclarationRule() ||
				   context == grammarAccess.getLocalDeclarationRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.VEC2_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (Vec2Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.VEC3_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (Vec3Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.VEC4_TYPE:
				if(context == grammarAccess.getComplexTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getVecTypeRule()) {
					sequence_VecType(context, (Vec4Type) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.VOID_TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (VoidType) semanticObject); 
					return; 
				}
				else break;
			case GlslPackage.WHILE_STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (WhileStatement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=AddExp_AddExp_1_0 op=AddOp right=MulExp)
	 */
	protected void sequence_AddExp(EObject context, AddExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ADD_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ADD_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ADD_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ADD_EXP__OP));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ADD_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ADD_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddExpAccess().getAddExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAddExpAccess().getOpAddOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAddExpAccess().getRightMulExpParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variable=[Symbol|IDENTIFIER] right=Exp)
	 */
	protected void sequence_AssignmentStatement(EObject context, AssignmentStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ASSIGNMENT_STATEMENT__VARIABLE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ASSIGNMENT_STATEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ASSIGNMENT_STATEMENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getVariableSymbolIDENTIFIERTerminalRuleCall_0_0_1(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getAssignmentStatementAccess().getRightExpParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLCONSTANT
	 */
	protected void sequence_Atomic(EObject context, BoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueBOOLCONSTANTTerminalRuleCall_4_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ComplexType (params+=Exp params+=Exp*)?)
	 */
	protected void sequence_Atomic(EObject context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOATCONSTANT
	 */
	protected void sequence_Atomic(EObject context, FloatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.FLOAT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.FLOAT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueFLOATCONSTANTTerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INTCONSTANT
	 */
	protected void sequence_Atomic(EObject context, IntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.INTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.INTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueINTCONSTANTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=UINTCONSTANT
	 */
	protected void sequence_Atomic(EObject context, UIntegerLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.UINTEGER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.UINTEGER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicAccess().getValueUINTCONSTANTTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=IN type=Type name=IDENTIFIER)
	 */
	protected void sequence_AttributeDeclaration(EObject context, InAttributeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_ATTRIBUTE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getQualifierINTerminalRuleCall_0_1_0(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_0_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_0_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=INOUT type=Type name=IDENTIFIER)
	 */
	protected void sequence_AttributeDeclaration(EObject context, InOutAttributeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.IN_OUT_ATTRIBUTE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getQualifierINOUTTerminalRuleCall_2_1_0(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_2_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_2_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=OUT type=Type name=IDENTIFIER)
	 */
	protected void sequence_AttributeDeclaration(EObject context, OutAttributeDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.OUT_ATTRIBUTE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getQualifierOUTTerminalRuleCall_1_1_0(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getTypeTypeParserRuleCall_1_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAttributeDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_1_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_BlockStatement(EObject context, BlockStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=IDENTIFIER
	 */
	protected void sequence_DeclaredParameter(EObject context, DeclaredParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.ABSTRACT_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.ABSTRACT_DEFINITION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclaredParameterAccess().getNameIDENTIFIERTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENTIFIER (args+=DeclaredParameter args+=DeclaredParameter*)?)
	 */
	protected void sequence_Definition(EObject context, Definition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Exp
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.EVALUATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.EVALUATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationAccess().getExpressionExpParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Exp_InlineIfExp_1_0 then=Exp else=Exp)
	 */
	protected void sequence_Exp(EObject context, InlineIfExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__CONDITION));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__THEN));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.INLINE_IF_EXP__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpAccess().getInlineIfExpConditionAction_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getExpAccess().getThenExpParserRuleCall_1_2_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getExpAccess().getElseExpParserRuleCall_1_4_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='function' func=[FunctionDefinition|IDENTIFIER] (args+=Exp args+=Exp*)?)
	 */
	protected void sequence_FunctionCall(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=IDENTIFIER (params+=Parameter params+=Parameter*)? statements+=Statement*)
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionPrototype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=IDENTIFIER (params+=Parameter params+=Parameter*)?)
	 */
	protected void sequence_FunctionPrototype(EObject context, FunctionPrototype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Exp
	 */
	protected void sequence_JumpStatement(EObject context, Return semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.RETURN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.RETURN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJumpStatementAccess().getValueExpParserRuleCall_3_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=LogicExp_LogicExp_1_0 op=LogicOp right=AddExp)
	 */
	protected void sequence_LogicExp(EObject context, LogicExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.LOGIC_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.LOGIC_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.LOGIC_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.LOGIC_EXP__OP));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.LOGIC_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.LOGIC_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicExpAccess().getLogicExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicExpAccess().getOpLogicOpEnumRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getLogicExpAccess().getRightAddExpParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT2
	 */
	protected void sequence_MatType(EObject context, Mat2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT2TerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT2X2
	 */
	protected void sequence_MatType(EObject context, Mat2x2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT2X2TerminalRuleCall_3_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT2X3
	 */
	protected void sequence_MatType(EObject context, Mat2x3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT2X3TerminalRuleCall_4_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT2X4
	 */
	protected void sequence_MatType(EObject context, Mat2x4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT2X4TerminalRuleCall_5_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT3
	 */
	protected void sequence_MatType(EObject context, Mat3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT3TerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT3X2
	 */
	protected void sequence_MatType(EObject context, Mat3x2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT3X2TerminalRuleCall_6_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT3X3
	 */
	protected void sequence_MatType(EObject context, Mat3x3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT3X3TerminalRuleCall_7_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT3X4
	 */
	protected void sequence_MatType(EObject context, Mat3x4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT3X4TerminalRuleCall_8_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT4
	 */
	protected void sequence_MatType(EObject context, Mat4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT4TerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT4X2
	 */
	protected void sequence_MatType(EObject context, Mat4x2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT4X2TerminalRuleCall_9_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT4X3
	 */
	protected void sequence_MatType(EObject context, Mat4x3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT4X3TerminalRuleCall_10_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=MAT4X4
	 */
	protected void sequence_MatType(EObject context, Mat4x4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMatTypeAccess().getNameMAT4X4TerminalRuleCall_11_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulExp_MulExp_1_0 op=MulOp right=PostfixExp)
	 */
	protected void sequence_MulExp(EObject context, MulExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.MUL_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.MUL_EXP__LEFT));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.MUL_EXP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.MUL_EXP__OP));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.MUL_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.MUL_EXP__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMulExpAccess().getMulExpLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulExpAccess().getOpMulOpParserRuleCall_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getMulExpAccess().getRightPostfixExpParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=IDENTIFIER)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDENTIFIERTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     symbol=[Symbol|IDENTIFIER]
	 */
	protected void sequence_PostfixExp(EObject context, SymbolRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (symbolref=PostfixExp_SymbolRefInvocation_0_2_0_0 actuals+=Exp? actuals+=Exp*) | 
	 *         (symbolref=PostfixExp_SymbolRefInvocation_0_2_0_0 actuals+=Exp*) | 
	 *         symbolref=PostfixExp_SymbolRefInvocation_0_2_0_0
	 *     )
	 */
	protected void sequence_PostfixExp(EObject context, SymbolRefInvocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbolref=PostfixExp_SymbolRefMember_0_2_1_0 (member='x' | member='y' | member='z' | member='w'))
	 */
	protected void sequence_PostfixExp(EObject context, SymbolRefMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (version=INTCONSTANT profile=IDENTIFIER?)
	 */
	protected void sequence_PrecompilerVersion(EObject context, PrecompilerVersion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=BOOL
	 */
	protected void sequence_ScalarType(EObject context, BoolType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeAccess().getNameBOOLTerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=FLOAT
	 */
	protected void sequence_ScalarType(EObject context, FloatType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeAccess().getNameFLOATTerminalRuleCall_3_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=INTX
	 */
	protected void sequence_ScalarType(EObject context, IntType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeAccess().getNameINTXTerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=UINT
	 */
	protected void sequence_ScalarType(EObject context, UIntType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScalarTypeAccess().getNameUINTTerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         pre+=PrecompilerStatement* 
	 *         (
	 *             uniforms+=UniformDeclaration | 
	 *             attribs+=AttributeDeclaration | 
	 *             prototypes+=FunctionPrototype | 
	 *             functions+=FunctionDefinition | 
	 *             variables+=VariableDeclaration
	 *         )*
	 *     )
	 */
	protected void sequence_SourceFile(EObject context, SourceFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((a=Exp | a=Declaration) b=Exp? c=Exp? do=Statement)
	 */
	protected void sequence_Statement(EObject context, ForStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Exp then=Statement else=Statement?)
	 */
	protected void sequence_Statement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=Exp cases+=SwitchCase)
	 */
	protected void sequence_Statement(EObject context, SwitchStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbol=[Symbol|IDENTIFIER] (actuals+=Exp? actuals+=Exp*)?)
	 */
	protected void sequence_Statement(EObject context, SymbolRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((condition=Exp do=Statement) | (do=BlockStatement condition=Exp))
	 */
	protected void sequence_Statement(EObject context, WhileStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((case=INTCONSTANT | case=UINTCONSTANT | fcase=FLOATCONSTANT) then=Statement) | then=Statement)
	 */
	protected void sequence_SwitchCase(EObject context, SwitchCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=VOID
	 */
	protected void sequence_Type(EObject context, VoidType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getNameVOIDTerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (qualifier=UNIFORM type=Type name=IDENTIFIER)
	 */
	protected void sequence_UniformDeclaration(EObject context, UniformDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__QUALIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__QUALIFIER));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.UNIFORM_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUniformDeclarationAccess().getQualifierUNIFORMTerminalRuleCall_1_0(), semanticObject.getQualifier());
		feeder.accept(grammarAccess.getUniformDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getUniformDeclarationAccess().getNameIDENTIFIERTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type name=IDENTIFIER init=Exp?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=BVEC2
	 */
	protected void sequence_VecType(EObject context, BVec2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameBVEC2TerminalRuleCall_9_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=BVEC3
	 */
	protected void sequence_VecType(EObject context, BVec3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameBVEC3TerminalRuleCall_10_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=BVEC4
	 */
	protected void sequence_VecType(EObject context, BVec4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameBVEC4TerminalRuleCall_11_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=IVEC2
	 */
	protected void sequence_VecType(EObject context, IVec2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameIVEC2TerminalRuleCall_3_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=IVEC3
	 */
	protected void sequence_VecType(EObject context, IVec3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameIVEC3TerminalRuleCall_4_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=IVEC4
	 */
	protected void sequence_VecType(EObject context, IVec4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameIVEC4TerminalRuleCall_5_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=UVEC2
	 */
	protected void sequence_VecType(EObject context, UVec2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameUVEC2TerminalRuleCall_6_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=UVEC3
	 */
	protected void sequence_VecType(EObject context, UVec3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameUVEC3TerminalRuleCall_7_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=UVEC4
	 */
	protected void sequence_VecType(EObject context, UVec4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameUVEC4TerminalRuleCall_8_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=VEC2
	 */
	protected void sequence_VecType(EObject context, Vec2Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameVEC2TerminalRuleCall_0_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=VEC3
	 */
	protected void sequence_VecType(EObject context, Vec3Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameVEC3TerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=VEC4
	 */
	protected void sequence_VecType(EObject context, Vec4Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GlslPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GlslPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVecTypeAccess().getNameVEC4TerminalRuleCall_2_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
