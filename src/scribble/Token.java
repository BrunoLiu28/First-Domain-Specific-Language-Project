/**
 */
package scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribble.Token#getTokenName <em>Token Name</em>}</li>
 * </ul>
 *
 * @see scribble.ScribblePackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Token Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Name</em>' attribute.
	 * @see #setTokenName(String)
	 * @see scribble.ScribblePackage#getToken_TokenName()
	 * @model
	 * @generated
	 */
	String getTokenName();

	/**
	 * Sets the value of the '{@link scribble.Token#getTokenName <em>Token Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Name</em>' attribute.
	 * @see #getTokenName()
	 * @generated
	 */
	void setTokenName(String value);

} // Token
