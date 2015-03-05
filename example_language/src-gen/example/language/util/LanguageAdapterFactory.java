/**
 */
package example.language.util;

import example.language.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see example.language.LanguagePackage
 * @generated
 */
public class LanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LanguageSwitch<Adapter> modelSwitch =
    new LanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseComposer(Composer object)
      {
        return createComposerAdapter();
      }
      @Override
      public Adapter caseMTLPrimitive(MTLPrimitive object)
      {
        return createMTLPrimitiveAdapter();
      }
      @Override
      public Adapter caseCreator(Creator object)
      {
        return createCreatorAdapter();
      }
      @Override
      public Adapter caseUpdater(Updater object)
      {
        return createUpdaterAdapter();
      }
      @Override
      public Adapter caseFeatureAssigner(FeatureAssigner object)
      {
        return createFeatureAssignerAdapter();
      }
      @Override
      public Adapter caseDeclarer(Declarer object)
      {
        return createDeclarerAdapter();
      }
      @Override
      public Adapter caseAssigner(Assigner object)
      {
        return createAssignerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link example.language.Composer <em>Composer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.Composer
   * @generated
   */
  public Adapter createComposerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.MTLPrimitive <em>MTL Primitive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.MTLPrimitive
   * @generated
   */
  public Adapter createMTLPrimitiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.Creator
   * @generated
   */
  public Adapter createCreatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.Updater <em>Updater</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.Updater
   * @generated
   */
  public Adapter createUpdaterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.FeatureAssigner <em>Feature Assigner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.FeatureAssigner
   * @generated
   */
  public Adapter createFeatureAssignerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.Declarer <em>Declarer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.Declarer
   * @generated
   */
  public Adapter createDeclarerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link example.language.Assigner <em>Assigner</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see example.language.Assigner
   * @generated
   */
  public Adapter createAssignerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LanguageAdapterFactory
