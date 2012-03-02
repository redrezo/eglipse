
package at.caks.eglipse.lang.program;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProgramStandaloneSetup extends ProgramStandaloneSetupGenerated{

	public static void doSetup() {
		new ProgramStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

