package at.caks.eglipse.lang.glsl.typesystem;

import org.eclipse.emf.ecore.EObject;

import at.caks.eglipse.lang.glsl.glsl.GlslPackage;
import at.caks.eglipse.lang.glsl.glsl.SymbolRefMember;
import at.caks.eglipse.lang.glsl.glsl.Type;
import at.caks.eglipse.lang.glsl.glsl.Vec2Type;
import at.caks.eglipse.lang.glsl.glsl.Vec3Type;
import at.caks.eglipse.lang.glsl.glsl.Vec4Type;
import at.caks.eglipse.lang.glsl.typesys.GlslTypeSystemGenerated;
import de.itemis.xtext.typesystem.exceptions.TypesystemConfigurationException;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;

public class GLSLTypeSystem extends GlslTypeSystemGenerated {

	
	@Override
	protected void initialize() {
		super.initialize();
		
//		GlslPackage lang = GlslPackage.eINSTANCE;
//		try {
//			useCloneAsType(lang.getIntType());
//			useCloneAsType(lang.getBoolType());
//			useCloneAsType(lang.getFloatType());
//			
//			useFixedType(lang.getIntegerLiteral(), lang.getIntType());
//			useFixedType(lang.getFloatLiteral(), lang.getFloatType());
//			useFixedType(lang.getBoolLiteral(), lang.getBoolType());
//			
//			useTypeOfFeature(lang.getConstructor(), lang.getConstructor_Type());
//			useTypeOfFeature(lang.getSymbol(), lang.getSymbol_Type());
//
//			
//			
//		} catch (TypesystemConfigurationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	protected EObject type(SymbolRefMember element, TypeCalculationTrace trace) {
//		Type complexType = element.getSymbolref().getSymbol().getType();
//		trace.add(element.getSymbolref(), "symbolref");
//		trace.add(element.getSymbolref().getSymbol(), "symbol");
//		trace.add(element.getSymbolref().getSymbol().getType(), "symbol.type");
//		if (complexType instanceof Vec2Type) {
//			return Utils.create(GlslPackage.eINSTANCE.getFloatType());
//		}
//		if (complexType instanceof Vec3Type) {
//			return Utils.create(GlslPackage.eINSTANCE.getFloatType());
//		}
//		if (complexType instanceof Vec4Type) {
//			return Utils.create(GlslPackage.eINSTANCE.getFloatType());
//		}
		return null;
	}

}
