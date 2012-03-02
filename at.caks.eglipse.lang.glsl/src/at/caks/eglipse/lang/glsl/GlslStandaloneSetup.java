
package at.caks.eglipse.lang.glsl;

import at.caks.eglipse.lang.glsl.GlslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GlslStandaloneSetup extends GlslStandaloneSetupGenerated{

	public static void doSetup() {
		new GlslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

