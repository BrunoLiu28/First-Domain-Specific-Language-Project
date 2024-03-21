/**
 */
package scribble;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scribble.TextProcessor#getStopword <em>Stopword</em>}</li>
 *   <li>{@link scribble.TextProcessor#getStemwords <em>Stemwords</em>}</li>
 *   <li>{@link scribble.TextProcessor#getToken <em>Token</em>}</li>
 *   <li>{@link scribble.TextProcessor#getText <em>Text</em>}</li>
 *   <li>{@link scribble.TextProcessor#getStringtoint <em>Stringtoint</em>}</li>
 * </ul>
 *
 * @see scribble.ScribblePackage#getTextProcessor()
 * @model
 * @generated
 */
public interface TextProcessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Stopword</b></em>' reference list.
	 * The list contents are of type {@link scribble.StopWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopword</em>' reference list.
	 * @see scribble.ScribblePackage#getTextProcessor_Stopword()
	 * @model
	 * @generated
	 */
	EList<StopWord> getStopword();

	/**
	 * Returns the value of the '<em><b>Stemwords</b></em>' reference list.
	 * The list contents are of type {@link scribble.StemWords}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stemwords</em>' reference list.
	 * @see scribble.ScribblePackage#getTextProcessor_Stemwords()
	 * @model
	 * @generated
	 */
	EList<StemWords> getStemwords();

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference list.
	 * The list contents are of type {@link scribble.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference list.
	 * @see scribble.ScribblePackage#getTextProcessor_Token()
	 * @model
	 * @generated
	 */
	EList<Token> getToken();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(Text)
	 * @see scribble.ScribblePackage#getTextProcessor_Text()
	 * @model required="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link scribble.TextProcessor#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Stringtoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringtoint</em>' reference.
	 * @see #setStringtoint(StringToInt)
	 * @see scribble.ScribblePackage#getTextProcessor_Stringtoint()
	 * @model
	 * @generated
	 */
	StringToInt getStringtoint();

	/**
	 * Sets the value of the '{@link scribble.TextProcessor#getStringtoint <em>Stringtoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringtoint</em>' reference.
	 * @see #getStringtoint()
	 * @generated
	 */
	void setStringtoint(StringToInt value);

} // TextProcessor
