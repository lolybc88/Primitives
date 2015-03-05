/**
 */
package example.language.impl;

import example.language.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguageFactoryImpl extends EFactoryImpl implements LanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LanguageFactory init()
  {
    try
    {
      LanguageFactory theLanguageFactory = (LanguageFactory)EPackage.Registry.INSTANCE.getEFactory(LanguagePackage.eNS_URI);
      if (theLanguageFactory != null)
      {
        return theLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LanguagePackage.COMPOSER: return createComposer();
      case LanguagePackage.MTL_PRIMITIVE: return createMTLPrimitive();
      case LanguagePackage.CREATOR: return createCreator();
      case LanguagePackage.UPDATER: return createUpdater();
      case LanguagePackage.FEATURE_ASSIGNER: return createFeatureAssigner();
      case LanguagePackage.DECLARER: return createDeclarer();
      case LanguagePackage.ASSIGNER: return createAssigner();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Composer createComposer()
  {
    ComposerImpl composer = new ComposerImpl();
    return composer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLPrimitive createMTLPrimitive()
  {
    MTLPrimitiveImpl mtlPrimitive = new MTLPrimitiveImpl();
    return mtlPrimitive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creator createCreator()
  {
    CreatorImpl creator = new CreatorImpl();
    return creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Updater createUpdater()
  {
    UpdaterImpl updater = new UpdaterImpl();
    return updater;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureAssigner createFeatureAssigner()
  {
    FeatureAssignerImpl featureAssigner = new FeatureAssignerImpl();
    return featureAssigner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarer createDeclarer()
  {
    DeclarerImpl declarer = new DeclarerImpl();
    return declarer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assigner createAssigner()
  {
    AssignerImpl assigner = new AssignerImpl();
    return assigner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguagePackage getLanguagePackage()
  {
    return (LanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LanguagePackage getPackage()
  {
    return LanguagePackage.eINSTANCE;
  }

} //LanguageFactoryImpl
