/**
 */
package example.language;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see example.language.LanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "language";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Language.example";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "language";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LanguagePackage eINSTANCE = example.language.impl.LanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link example.language.impl.MTLPrimitiveImpl <em>MTL Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.MTLPrimitiveImpl
   * @see example.language.impl.LanguagePackageImpl#getMTLPrimitive()
   * @generated
   */
  int MTL_PRIMITIVE = 1;

  /**
   * The number of structural features of the '<em>MTL Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MTL_PRIMITIVE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link example.language.impl.ComposerImpl <em>Composer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.ComposerImpl
   * @see example.language.impl.LanguagePackageImpl#getComposer()
   * @generated
   */
  int COMPOSER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSER__NAME = MTL_PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Primitives</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSER__PRIMITIVES = MTL_PRIMITIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSER_FEATURE_COUNT = MTL_PRIMITIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link example.language.impl.CreatorImpl <em>Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.CreatorImpl
   * @see example.language.impl.LanguagePackageImpl#getCreator()
   * @generated
   */
  int CREATOR = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__TYPE = MTL_PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__FEATURES = MTL_PRIMITIVE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Creator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__CREATOR_NAME = MTL_PRIMITIVE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR_FEATURE_COUNT = MTL_PRIMITIVE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link example.language.impl.UpdaterImpl <em>Updater</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.UpdaterImpl
   * @see example.language.impl.LanguagePackageImpl#getUpdater()
   * @generated
   */
  int UPDATER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATER__TYPE = MTL_PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATER__FEATURES = MTL_PRIMITIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Updater</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UPDATER_FEATURE_COUNT = MTL_PRIMITIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link example.language.impl.FeatureAssignerImpl <em>Feature Assigner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.FeatureAssignerImpl
   * @see example.language.impl.LanguagePackageImpl#getFeatureAssigner()
   * @generated
   */
  int FEATURE_ASSIGNER = 4;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNER__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Feature Assigner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_ASSIGNER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link example.language.impl.DeclarerImpl <em>Declarer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.DeclarerImpl
   * @see example.language.impl.LanguagePackageImpl#getDeclarer()
   * @generated
   */
  int DECLARER = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARER__TYPE = MTL_PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARER__NAME = MTL_PRIMITIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Declarer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARER_FEATURE_COUNT = MTL_PRIMITIVE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link example.language.impl.AssignerImpl <em>Assigner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see example.language.impl.AssignerImpl
   * @see example.language.impl.LanguagePackageImpl#getAssigner()
   * @generated
   */
  int ASSIGNER = 6;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNER__VAR = MTL_PRIMITIVE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Creator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNER__CREATOR = MTL_PRIMITIVE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assigner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNER_FEATURE_COUNT = MTL_PRIMITIVE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link example.language.Composer <em>Composer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composer</em>'.
   * @see example.language.Composer
   * @generated
   */
  EClass getComposer();

  /**
   * Returns the meta object for the attribute '{@link example.language.Composer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.language.Composer#getName()
   * @see #getComposer()
   * @generated
   */
  EAttribute getComposer_Name();

  /**
   * Returns the meta object for the containment reference list '{@link example.language.Composer#getPrimitives <em>Primitives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primitives</em>'.
   * @see example.language.Composer#getPrimitives()
   * @see #getComposer()
   * @generated
   */
  EReference getComposer_Primitives();

  /**
   * Returns the meta object for class '{@link example.language.MTLPrimitive <em>MTL Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MTL Primitive</em>'.
   * @see example.language.MTLPrimitive
   * @generated
   */
  EClass getMTLPrimitive();

  /**
   * Returns the meta object for class '{@link example.language.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creator</em>'.
   * @see example.language.Creator
   * @generated
   */
  EClass getCreator();

  /**
   * Returns the meta object for the attribute '{@link example.language.Creator#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see example.language.Creator#getType()
   * @see #getCreator()
   * @generated
   */
  EAttribute getCreator_Type();

  /**
   * Returns the meta object for the containment reference list '{@link example.language.Creator#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see example.language.Creator#getFeatures()
   * @see #getCreator()
   * @generated
   */
  EReference getCreator_Features();

  /**
   * Returns the meta object for the attribute '{@link example.language.Creator#getCreatorName <em>Creator Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Creator Name</em>'.
   * @see example.language.Creator#getCreatorName()
   * @see #getCreator()
   * @generated
   */
  EAttribute getCreator_CreatorName();

  /**
   * Returns the meta object for class '{@link example.language.Updater <em>Updater</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Updater</em>'.
   * @see example.language.Updater
   * @generated
   */
  EClass getUpdater();

  /**
   * Returns the meta object for the attribute '{@link example.language.Updater#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see example.language.Updater#getType()
   * @see #getUpdater()
   * @generated
   */
  EAttribute getUpdater_Type();

  /**
   * Returns the meta object for the containment reference list '{@link example.language.Updater#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see example.language.Updater#getFeatures()
   * @see #getUpdater()
   * @generated
   */
  EReference getUpdater_Features();

  /**
   * Returns the meta object for class '{@link example.language.FeatureAssigner <em>Feature Assigner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Assigner</em>'.
   * @see example.language.FeatureAssigner
   * @generated
   */
  EClass getFeatureAssigner();

  /**
   * Returns the meta object for the attribute '{@link example.language.FeatureAssigner#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see example.language.FeatureAssigner#getFeature()
   * @see #getFeatureAssigner()
   * @generated
   */
  EAttribute getFeatureAssigner_Feature();

  /**
   * Returns the meta object for the attribute '{@link example.language.FeatureAssigner#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see example.language.FeatureAssigner#getValue()
   * @see #getFeatureAssigner()
   * @generated
   */
  EAttribute getFeatureAssigner_Value();

  /**
   * Returns the meta object for class '{@link example.language.Declarer <em>Declarer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declarer</em>'.
   * @see example.language.Declarer
   * @generated
   */
  EClass getDeclarer();

  /**
   * Returns the meta object for the attribute '{@link example.language.Declarer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see example.language.Declarer#getType()
   * @see #getDeclarer()
   * @generated
   */
  EAttribute getDeclarer_Type();

  /**
   * Returns the meta object for the attribute '{@link example.language.Declarer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see example.language.Declarer#getName()
   * @see #getDeclarer()
   * @generated
   */
  EAttribute getDeclarer_Name();

  /**
   * Returns the meta object for class '{@link example.language.Assigner <em>Assigner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assigner</em>'.
   * @see example.language.Assigner
   * @generated
   */
  EClass getAssigner();

  /**
   * Returns the meta object for the reference '{@link example.language.Assigner#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see example.language.Assigner#getVar()
   * @see #getAssigner()
   * @generated
   */
  EReference getAssigner_Var();

  /**
   * Returns the meta object for the containment reference list '{@link example.language.Assigner#getCreator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Creator</em>'.
   * @see example.language.Assigner#getCreator()
   * @see #getAssigner()
   * @generated
   */
  EReference getAssigner_Creator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LanguageFactory getLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link example.language.impl.ComposerImpl <em>Composer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.ComposerImpl
     * @see example.language.impl.LanguagePackageImpl#getComposer()
     * @generated
     */
    EClass COMPOSER = eINSTANCE.getComposer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSER__NAME = eINSTANCE.getComposer_Name();

    /**
     * The meta object literal for the '<em><b>Primitives</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSER__PRIMITIVES = eINSTANCE.getComposer_Primitives();

    /**
     * The meta object literal for the '{@link example.language.impl.MTLPrimitiveImpl <em>MTL Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.MTLPrimitiveImpl
     * @see example.language.impl.LanguagePackageImpl#getMTLPrimitive()
     * @generated
     */
    EClass MTL_PRIMITIVE = eINSTANCE.getMTLPrimitive();

    /**
     * The meta object literal for the '{@link example.language.impl.CreatorImpl <em>Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.CreatorImpl
     * @see example.language.impl.LanguagePackageImpl#getCreator()
     * @generated
     */
    EClass CREATOR = eINSTANCE.getCreator();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATOR__TYPE = eINSTANCE.getCreator_Type();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATOR__FEATURES = eINSTANCE.getCreator_Features();

    /**
     * The meta object literal for the '<em><b>Creator Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATOR__CREATOR_NAME = eINSTANCE.getCreator_CreatorName();

    /**
     * The meta object literal for the '{@link example.language.impl.UpdaterImpl <em>Updater</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.UpdaterImpl
     * @see example.language.impl.LanguagePackageImpl#getUpdater()
     * @generated
     */
    EClass UPDATER = eINSTANCE.getUpdater();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UPDATER__TYPE = eINSTANCE.getUpdater_Type();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UPDATER__FEATURES = eINSTANCE.getUpdater_Features();

    /**
     * The meta object literal for the '{@link example.language.impl.FeatureAssignerImpl <em>Feature Assigner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.FeatureAssignerImpl
     * @see example.language.impl.LanguagePackageImpl#getFeatureAssigner()
     * @generated
     */
    EClass FEATURE_ASSIGNER = eINSTANCE.getFeatureAssigner();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_ASSIGNER__FEATURE = eINSTANCE.getFeatureAssigner_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_ASSIGNER__VALUE = eINSTANCE.getFeatureAssigner_Value();

    /**
     * The meta object literal for the '{@link example.language.impl.DeclarerImpl <em>Declarer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.DeclarerImpl
     * @see example.language.impl.LanguagePackageImpl#getDeclarer()
     * @generated
     */
    EClass DECLARER = eINSTANCE.getDeclarer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARER__TYPE = eINSTANCE.getDeclarer_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARER__NAME = eINSTANCE.getDeclarer_Name();

    /**
     * The meta object literal for the '{@link example.language.impl.AssignerImpl <em>Assigner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see example.language.impl.AssignerImpl
     * @see example.language.impl.LanguagePackageImpl#getAssigner()
     * @generated
     */
    EClass ASSIGNER = eINSTANCE.getAssigner();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNER__VAR = eINSTANCE.getAssigner_Var();

    /**
     * The meta object literal for the '<em><b>Creator</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNER__CREATOR = eINSTANCE.getAssigner_Creator();

  }

} //LanguagePackage
