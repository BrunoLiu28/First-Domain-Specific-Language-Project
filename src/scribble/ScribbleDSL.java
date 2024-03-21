/**
 */
package scribble;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribble.ScribbleDSL#getTextprocessor <em>Textprocessor</em>}</li>
 * </ul>
 *
 * @see scribble.ScribblePackage#getScribbleDSL()
 * @model
 * @generated
 */
public interface ScribbleDSL extends EObject {
	/**
	 * Returns the value of the '<em><b>Textprocessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textprocessor</em>' containment reference.
	 * @see #setTextprocessor(TextProcessor)
	 * @see scribble.ScribblePackage#getScribbleDSL_Textprocessor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TextProcessor getTextprocessor();

	/**
	 * Sets the value of the '{@link scribble.ScribbleDSL#getTextprocessor <em>Textprocessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textprocessor</em>' containment reference.
	 * @see #getTextprocessor()
	 * @generated
	 */
	void setTextprocessor(TextProcessor value);

} // ScribbleDSL
