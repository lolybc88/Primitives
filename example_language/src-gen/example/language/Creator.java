/**
 */
package example.language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.language.Creator#getType <em>Type</em>}</li>
 *   <li>{@link example.language.Creator#getFeatures <em>Features</em>}</li>
 *   <li>{@link example.language.Creator#getCreatorName <em>Creator Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.language.LanguagePackage#getCreator()
 * @model
 * @generated
 */
public interface Creator extends MTLPrimitive
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see example.language.LanguagePackage#getCreator_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link example.language.Creator#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link example.language.FeatureAssigner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see example.language.LanguagePackage#getCreator_Features()
   * @model containment="true"
   * @generated
   */
  EList<FeatureAssigner> getFeatures();

  /**
   * Returns the value of the '<em><b>Creator Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creator Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creator Name</em>' attribute.
   * @see #setCreatorName(String)
   * @see example.language.LanguagePackage#getCreator_CreatorName()
   * @model
   * @generated
   */
  String getCreatorName();

  /**
   * Sets the value of the '{@link example.language.Creator#getCreatorName <em>Creator Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Creator Name</em>' attribute.
   * @see #getCreatorName()
   * @generated
   */
  void setCreatorName(String value);

} // Creator
