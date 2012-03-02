package at.caks.eglipse.lang.glsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import at.caks.eglipse.lang.glsl.glsl.Constructor;
import at.caks.eglipse.lang.glsl.glsl.Exp;
import at.caks.eglipse.lang.glsl.glsl.GlslPackage;
import at.caks.eglipse.lang.glsl.validation.AbstractGlslJavaValidator;

import com.google.inject.Inject;

import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;

public class GlslJavaValidator extends AbstractGlslJavaValidator {

	// @Check
	// public void checkGreetingStartsWithCapital(Greeting greeting) {
	// if (!Character.isUpperCase(greeting.getName().charAt(0))) {
	// warning("Name should start with a capital",
	// MyDslPackage.Literals.GREETING__NAME);
	// }
	// }

	@Inject
	ITypesystem ts;

	@Check
	public void checkTypesystemRules(EObject x) {
		ts.checkTypesystemConstraints(x, this);
	}
	
	@Check
	public void checkConstructor(Constructor c) {
		System.err.println("testing " + c.getType().eClass() + " <-> " + GlslPackage.eINSTANCE.getVec4Type());
		if (c.getType().eClass().equals(GlslPackage.eINSTANCE.getVec4Type())) {
			System.err.println("woohoo size is " + c.getParams().size());
			if (c.getParams().size() == 4) {
				System.err.println(" -> check succeeded, size is still" + c.getParams().size() );
				for (int idx = 0; idx < c.getParams().size(); idx++) {
					Exp param = c.getParams().get(idx);
					System.err.println(" param is " + param);
					try {
						TypeCalculationTrace trace = new TypeCalculationTrace();
						EObject t = ts.typeof(param, trace);
						System.err.println(" -> testing " + t.eClass() + " <-> " +GlslPackage.eINSTANCE.getFloatType());
						
						if (! t.eClass().equals(GlslPackage.eINSTANCE.getFloatType())) {
							error("must be float", GlslPackage.eINSTANCE.getConstructor_Params(), idx);
						}
					}
					catch (Throwable t) {
						t.printStackTrace();
					}
				}
			}
			else {
				System.err.println(" -> check failed");
			}
			
			
		}
	}

}
