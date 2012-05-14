
package org.eglipse.lang.glsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class GlslStandaloneSetup extends GlslStandaloneSetupGenerated{

	public static void doSetup() {
		new GlslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

