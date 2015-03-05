/**
 */
package example.language;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.language.Assigner#getVar <em>Var</em>}</li>
 *   <li>{@link example.language.Assigner#getCreator <em>Creator</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.language.LanguagePackage#getAssigner()
 * @model
 * @generated
 */
public interface Assigner extends MTLPrimitive
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Declarer)
   * @see example.language.LanguagePackage#getAssigner_Var()
   * @model
   * @generated
   */
  Declarer getVar();

  /**
   * Sets the value of the '{@link example.language.Assigner#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Declarer value);

  /**
   * Returns the value of the '<em><b>Creator</b></em>' containment reference list.
   * The list contents are of type {@link example.language.Creator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creator</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creator</em>' containment reference list.
   * @see example.language.LanguagePackage#getAssigner_Creator()
   * @model containment="true"
   * @generated
   */
  EList<Creator> getCreator();

} // Assigner
