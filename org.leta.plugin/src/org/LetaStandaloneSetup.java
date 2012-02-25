
package org;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LetaStandaloneSetup extends LetaStandaloneSetupGenerated{

	public static void doSetup() {
		new LetaStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

