/**
 */
package example.language.util;

import example.language.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see example.language.LanguagePackage
 * @generated
 */
public class LanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LanguagePackage.COMPOSER:
      {
        Composer composer = (Composer)theEObject;
        T result = caseComposer(composer);
        if (result == null) result = caseMTLPrimitive(composer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.MTL_PRIMITIVE:
      {
        MTLPrimitive mtlPrimitive = (MTLPrimitive)theEObject;
        T result = caseMTLPrimitive(mtlPrimitive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.CREATOR:
      {
        Creator creator = (Creator)theEObject;
        T result = caseCreator(creator);
        if (result == null) result = caseMTLPrimitive(creator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.UPDATER:
      {
        Updater updater = (Updater)theEObject;
        T result = caseUpdater(updater);
        if (result == null) result = caseMTLPrimitive(updater);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.FEATURE_ASSIGNER:
      {
        FeatureAssigner featureAssigner = (FeatureAssigner)theEObject;
        T result = caseFeatureAssigner(featureAssigner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.DECLARER:
      {
        Declarer declarer = (Declarer)theEObject;
        T result = caseDeclarer(declarer);
        if (result == null) result = caseMTLPrimitive(declarer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LanguagePackage.ASSIGNER:
      {
        Assigner assigner = (Assigner)theEObject;
        T result = caseAssigner(assigner);
        if (result == null) result = caseMTLPrimitive(assigner);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComposer(Composer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MTL Primitive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MTL Primitive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMTLPrimitive(MTLPrimitive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Creator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreator(Creator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Updater</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Updater</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdater(Updater object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Assigner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Assigner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureAssigner(FeatureAssigner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declarer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declarer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclarer(Declarer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assigner</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assigner</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssigner(Assigner object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LanguageSwitch
