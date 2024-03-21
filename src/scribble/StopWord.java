/**
 */
package scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stop Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribble.StopWord#getStopWordName <em>Stop Word Name</em>}</li>
 * </ul>
 *
 * @see scribble.ScribblePackage#getStopWord()
 * @model
 * @generated
 */
public interface StopWord extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Word Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Word Name</em>' attribute.
	 * @see #setStopWordName(String)
	 * @see scribble.ScribblePackage#getStopWord_StopWordName()
	 * @model
	 * @generated
	 */
	String getStopWordName();

	/**
	 * Sets the value of the '{@link scribble.StopWord#getStopWordName <em>Stop Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Word Name</em>' attribute.
	 * @see #getStopWordName()
	 * @generated
	 */
	void setStopWordName(String value);

} // StopWord
