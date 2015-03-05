/**
 */
package example.language.impl;

import example.language.Creator;
import example.language.FeatureAssigner;
import example.language.LanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.language.impl.CreatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link example.language.impl.CreatorImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link example.language.impl.CreatorImpl#getCreatorName <em>Creator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatorImpl extends MTLPrimitiveImpl implements Creator
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatures()
   * @generated
   * @ordered
   */
  protected EList<FeatureAssigner> features;

  /**
   * The default value of the '{@link #getCreatorName() <em>Creator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatorName()
   * @generated
   * @ordered
   */
  protected static final String CREATOR_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreatorName() <em>Creator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreatorName()
   * @generated
   * @ordered
   */
  protected String creatorName = CREATOR_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreatorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LanguagePackage.Literals.CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureAssigner> getFeatures()
  {
    if (features == null)
    {
      features = new EObjectContainmentEList<FeatureAssigner>(FeatureAssigner.class, this, LanguagePackage.CREATOR__FEATURES);
    }
    return features;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCreatorName()
  {
    return creatorName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreatorName(String newCreatorName)
  {
    String oldCreatorName = creatorName;
    creatorName = newCreatorName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LanguagePackage.CREATOR__CREATOR_NAME, oldCreatorName, creatorName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LanguagePackage.CREATOR__FEATURES:
        return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LanguagePackage.CREATOR__TYPE:
        return getType();
      case LanguagePackage.CREATOR__FEATURES:
        return getFeatures();
      case LanguagePackage.CREATOR__CREATOR_NAME:
        return getCreatorName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LanguagePackage.CREATOR__TYPE:
        setType((String)newValue);
        return;
      case LanguagePackage.CREATOR__FEATURES:
        getFeatures().clear();
        getFeatures().addAll((Collection<? extends FeatureAssigner>)newValue);
        return;
      case LanguagePackage.CREATOR__CREATOR_NAME:
        setCreatorName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.CREATOR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LanguagePackage.CREATOR__FEATURES:
        getFeatures().clear();
        return;
      case LanguagePackage.CREATOR__CREATOR_NAME:
        setCreatorName(CREATOR_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LanguagePackage.CREATOR__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LanguagePackage.CREATOR__FEATURES:
        return features != null && !features.isEmpty();
      case LanguagePackage.CREATOR__CREATOR_NAME:
        return CREATOR_NAME_EDEFAULT == null ? creatorName != null : !CREATOR_NAME_EDEFAULT.equals(creatorName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", creatorName: ");
    result.append(creatorName);
    result.append(')');
    return result.toString();
  }

} //CreatorImpl
