/*
* generated by Xtext
*/
package example;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
