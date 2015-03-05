/**
 */
package example.language;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.language.Declarer#getType <em>Type</em>}</li>
 *   <li>{@link example.language.Declarer#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.language.LanguagePackage#getDeclarer()
 * @model
 * @generated
 */
public interface Declarer extends MTLPrimitive
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
   * @see example.language.LanguagePackage#getDeclarer_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link example.language.Declarer#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see example.language.LanguagePackage#getDeclarer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link example.language.Declarer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Declarer
