		package at.caks.eglipse.lang.glsl.typesys;

		import org.eclipse.emf.ecore.EObject;
		import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;
		import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

		public  abstract class GlslTypeSystemGenerated extends de.itemis.xtext.typesystem.DefaultTypesystem {

			protected at.caks.eglipse.lang.glsl.glsl.GlslPackage p = at.caks.eglipse.lang.glsl.glsl.GlslPackage.eINSTANCE;

			protected void initialize() {

				try {

						// ----------------------------------------------------------------
						// Section: Basics

						declareSubtype( p.getIntType(), p.getFloatType());
						declareSubtype( p.getUIntType(), p.getIntType());
						// include subtypes!
						useCloneAsType( p.getType() );
						useCloneAsType( p.getScalarType() );
						useCloneAsType( p.getComplexType() );
						useCloneAsType( p.getVecType() );
						useCloneAsType( p.getMatType() );
						useCloneAsType( p.getIntType() );
						useCloneAsType( p.getUIntType() );
						useCloneAsType( p.getBoolType() );
						useCloneAsType( p.getFloatType() );
						useCloneAsType( p.getVec2Type() );
						useCloneAsType( p.getVec3Type() );
						useCloneAsType( p.getVec4Type() );
						useCloneAsType( p.getIVec2Type() );
						useCloneAsType( p.getIVec3Type() );
						useCloneAsType( p.getIVec4Type() );
						useCloneAsType( p.getUVec2Type() );
						useCloneAsType( p.getUVec3Type() );
						useCloneAsType( p.getUVec4Type() );
						useCloneAsType( p.getBVec2Type() );
						useCloneAsType( p.getBVec3Type() );
						useCloneAsType( p.getBVec4Type() );
						useCloneAsType( p.getMat2Type() );
						useCloneAsType( p.getMat3Type() );
						useCloneAsType( p.getMat4Type() );
						useCloneAsType( p.getMat2x2Type() );
						useCloneAsType( p.getMat2x3Type() );
						useCloneAsType( p.getMat2x4Type() );
						useCloneAsType( p.getMat3x2Type() );
						useCloneAsType( p.getMat3x3Type() );
						useCloneAsType( p.getMat3x4Type() );
						useCloneAsType( p.getMat4x2Type() );
						useCloneAsType( p.getMat4x3Type() );
						useCloneAsType( p.getMat4x4Type() );
						// ------
						useCloneAsType( p.getVoidType() );

						// ----------------------------------------------------------------
						// Section: Literals

						useFixedType( p.getFloatLiteral(), p.getFloatType() );
						useFixedType( p.getIntegerLiteral(), p.getIntType() );
						useFixedType( p.getUIntegerLiteral(), p.getUIntType() );
						useFixedType( p.getBoolLiteral(), p.getBoolType() );

						// ----------------------------------------------------------------
						// Section: Symbol

						useTypeOfFeature( p.getVariableDeclaration(), p.getVariableDeclaration_Type() );
						ensureOrderedCompatibility( p.getVariableDeclaration(), p.getVariableDeclaration_Type(), p.getVariableDeclaration_Init() );
						useTypeOfFeature( p.getFunctionPrototype(), p.getFunctionPrototype_Type() );
						useTypeOfFeature( p.getConstructor(), p.getConstructor_Type() );
						useTypeOfFeature( p.getInAttributeDeclaration(), p.getInAttributeDeclaration_Type() );
						useTypeOfFeature( p.getOutAttributeDeclaration(), p.getOutAttributeDeclaration_Type() );
						useTypeOfFeature( p.getInOutAttributeDeclaration(), p.getInOutAttributeDeclaration_Type() );
						useTypeOfFeature( p.getUniformDeclaration(), p.getUniformDeclaration_Type() );
						useTypeOfFeature( p.getSymbolRef(), p.getSymbolRef_Symbol() );
						useTypeOfFeature( p.getSymbolRefInvocation(), p.getSymbolRefInvocation_Symbolref() );
						useTypeOfFeature( p.getAssignmentStatement(), p.getAssignmentStatement_Variable() );

						// ----------------------------------------------------------------
						// Section: Expressions

						computeCommonType( p.getInlineIfExp(), p.getInlineIfExp_Then(), p.getInlineIfExp_Else());
						ensureUnorderedCompatibility( p.getInlineIfExp(), p.getInlineIfExp_Then(), p.getInlineIfExp_Else() );
						useFixedType( p.getLogicExp(), p.getBoolType() );
						ensureFeatureType( p.getLogicExp(), p.getLogicExp_Left(), p.getIntType(), p.getFloatType(), p.getBoolType() );
						ensureFeatureType( p.getLogicExp(), p.getLogicExp_Right(), p.getIntType(), p.getFloatType(), p.getBoolType() );
						ensureUnorderedCompatibility( p.getLogicExp(), p.getLogicExp_Left(), p.getLogicExp_Right() );
						computeCommonType( p.getAddExp(), p.getAddExp_Left(), p.getAddExp_Right());
						ensureFeatureType( p.getAddExp(), p.getAddExp_Left(), p.getIntType(), p.getFloatType(), p.getVec2Type(), p.getVec3Type(), p.getVec4Type(), p.getMat2Type(), p.getMat3Type(), p.getMat4Type() );
						ensureFeatureType( p.getAddExp(), p.getAddExp_Right(), p.getIntType(), p.getFloatType(), p.getVec2Type(), p.getVec3Type(), p.getVec4Type(), p.getMat2Type(), p.getMat3Type(), p.getMat4Type() );
						ensureUnorderedCompatibility( p.getAddExp(), p.getAddExp_Left(), p.getAddExp_Right() );
						computeCommonType( p.getMulExp(), p.getMulExp_Left(), p.getMulExp_Right());
						ensureFeatureType( p.getMulExp(), p.getMulExp_Left(), p.getIntType(), p.getFloatType(), p.getVec2Type(), p.getVec3Type(), p.getVec4Type(), p.getMat2Type(), p.getMat3Type(), p.getMat4Type() );
						ensureFeatureType( p.getMulExp(), p.getMulExp_Right(), p.getIntType(), p.getFloatType(), p.getVec2Type(), p.getVec3Type(), p.getVec4Type(), p.getMat2Type(), p.getMat3Type(), p.getMat4Type() );
						ensureUnorderedCompatibility( p.getMulExp(), p.getMulExp_Left(), p.getMulExp_Right() );

						// ----------------------------------------------------------------
						// Section: Statements

						useFixedType( p.getIfStatement(), p.getVoidType() );
						ensureFeatureType( p.getIfStatement(), p.getIfStatement_Condition(), p.getBoolType() );

				} catch ( TypesystemConfigurationException ex ) {
				}
			}

			protected abstract EObject type( at.caks.eglipse.lang.glsl.glsl.SymbolRefMember element, TypeCalculationTrace trace );

		}
