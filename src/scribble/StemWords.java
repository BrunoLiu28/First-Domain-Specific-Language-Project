/**
 */
package scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stem Words</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribble.StemWords#getStemedWordName <em>Stemed Word Name</em>}</li>
 * </ul>
 *
 * @see scribble.ScribblePackage#getStemWords()
 * @model
 * @generated
 */
public interface StemWords extends EObject {
	/**
	 * Returns the value of the '<em><b>Stemed Word Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stemed Word Name</em>' attribute.
	 * @see #setStemedWordName(String)
	 * @see scribble.ScribblePackage#getStemWords_StemedWordName()
	 * @model
	 * @generated
	 */
	String getStemedWordName();

	/**
	 * Sets the value of the '{@link scribble.StemWords#getStemedWordName <em>Stemed Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stemed Word Name</em>' attribute.
	 * @see #getStemedWordName()
	 * @generated
	 */
	void setStemedWordName(String value);

} // StemWords
