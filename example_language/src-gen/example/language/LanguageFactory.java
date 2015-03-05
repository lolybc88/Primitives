/**
 */
package example.language;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see example.language.LanguagePackage
 * @generated
 */
public interface LanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguageFactory eINSTANCE = example.language.impl.LanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Composer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composer</em>'.
   * @generated
   */
  Composer createComposer();

  /**
   * Returns a new object of class '<em>MTL Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MTL Primitive</em>'.
   * @generated
   */
  MTLPrimitive createMTLPrimitive();

  /**
   * Returns a new object of class '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creator</em>'.
   * @generated
   */
  Creator createCreator();

  /**
   * Returns a new object of class '<em>Updater</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Updater</em>'.
   * @generated
   */
  Updater createUpdater();

  /**
   * Returns a new object of class '<em>Feature Assigner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Assigner</em>'.
   * @generated
   */
  FeatureAssigner createFeatureAssigner();

  /**
   * Returns a new object of class '<em>Declarer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarer</em>'.
   * @generated
   */
  Declarer createDeclarer();

  /**
   * Returns a new object of class '<em>Assigner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assigner</em>'.
   * @generated
   */
  Assigner createAssigner();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LanguagePackage getLanguagePackage();

} //LanguageFactory
