typesystem at.caks.eglipse.lang.glsl.typesys.GlslTypeSystem
	ecore file "platform:/resource/at.caks.eglipse.lang.glsl/src-gen/at/caks/eglipse/lang/glsl/Glsl.ecore"
	language package at.caks.eglipse.lang.glsl.glsl.GlslPackage
	
section "Basics"
 
	subtype IntType base FloatType
	subtype UIntType base IntType
	
	typeof Type + -> clone
	
	typeof VoidType -> clone

section "Literals"  

	typeof FloatLiteral -> FloatType 
	typeof IntegerLiteral	-> IntType
	typeof UIntegerLiteral	-> UIntType
	typeof BoolLiteral	-> BoolType
	
section "Symbol"

	typeof VariableDeclaration -> feature type {
		ensureCompatibility type :<=: init
	}
	
	typeof FunctionPrototype -> feature type
	
	//typeof FunctionDefinition -> feature type
	
	//typeof ReturnType -> feature type
	
	typeof Constructor -> feature type
	
	typeof InAttributeDeclaration -> feature type
	typeof OutAttributeDeclaration -> feature type
	typeof InOutAttributeDeclaration -> feature type
	typeof UniformDeclaration -> feature type
	
	typeof Symbol -> abstract
	typeof SymbolRef -> feature symbol
	typeof SymbolRefMember -> javacode
	typeof SymbolRefInvocation -> feature symbolref 
 
	typeof AssignmentStatement -> feature variable 

section "Expressions"

	typeof InlineIfExp -> common then else {
		ensureCompatibility then :<=>: else
	}

	typeof LogicExp -> BoolType {
		ensureType left :<=: 
			IntType, FloatType, BoolType
		ensureType right :<=: 
			IntType, FloatType, BoolType
		ensureCompatibility left :<=>: right
	}

	typeof AddExp -> common left right {
		ensureType left :<=: 
			IntType, FloatType,
			Vec2Type, Vec3Type, Vec4Type,
			Mat2Type, Mat3Type, Mat4Type
		ensureType right :<=: 
			IntType, FloatType,
			Vec2Type, Vec3Type, Vec4Type,
			Mat2Type, Mat3Type, Mat4Type
		ensureCompatibility left :<=>: right
	}
	
	typeof MulExp -> common left right { 
		ensureType left :<=: 
			IntType, FloatType,
			Vec2Type, Vec3Type, Vec4Type,
			Mat2Type, Mat3Type, Mat4Type
		ensureType right :<=: 
			IntType, FloatType,
			Vec2Type, Vec3Type, Vec4Type,
			Mat2Type, Mat3Type, Mat4Type
		ensureCompatibility left :<=>: right 
	}
	
	
	typeof Exp -> abstract
	
section "Statements"
	
	typeof IfStatement -> VoidType {
		ensureType condition :<=: BoolType
	}