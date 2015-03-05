/*
 * generated by Xtext
 */
package example.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import example.ui.internal.LanguageActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LanguageActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LanguageActivator.getInstance().getInjector(LanguageActivator.EXAMPLE_LANGUAGE);
	}
	
}
