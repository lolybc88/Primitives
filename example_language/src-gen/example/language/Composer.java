/**
 */
package example.language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.language.Composer#getName <em>Name</em>}</li>
 *   <li>{@link example.language.Composer#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.language.LanguagePackage#getComposer()
 * @model
 * @generated
 */
public interface Composer extends MTLPrimitive
{
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
   * @see example.language.LanguagePackage#getComposer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link example.language.Composer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
   * The list contents are of type {@link example.language.MTLPrimitive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference list.
   * @see example.language.LanguagePackage#getComposer_Primitives()
   * @model containment="true"
   * @generated
   */
  EList<MTLPrimitive> getPrimitives();

} // Composer
