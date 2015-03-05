/**
 */
package example.language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.language.Updater#getType <em>Type</em>}</li>
 *   <li>{@link example.language.Updater#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.language.LanguagePackage#getUpdater()
 * @model
 * @generated
 */
public interface Updater extends MTLPrimitive
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
   * @see example.language.LanguagePackage#getUpdater_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link example.language.Updater#getType <em>Type</em>}' attribute.
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
   * @see example.language.LanguagePackage#getUpdater_Features()
   * @model containment="true"
   * @generated
   */
  EList<FeatureAssigner> getFeatures();

} // Updater
