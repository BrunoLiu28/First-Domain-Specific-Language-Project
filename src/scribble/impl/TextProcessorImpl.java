/**
 */
package scribble.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import scribble.ScribblePackage;
import scribble.StemWords;
import scribble.StopWord;
import scribble.StringToInt;
import scribble.Text;
import scribble.TextProcessor;
import scribble.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Processor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scribble.impl.TextProcessorImpl#getStopword <em>Stopword</em>}</li>
 *   <li>{@link scribble.impl.TextProcessorImpl#getStemwords <em>Stemwords</em>}</li>
 *   <li>{@link scribble.impl.TextProcessorImpl#getToken <em>Token</em>}</li>
 *   <li>{@link scribble.impl.TextProcessorImpl#getText <em>Text</em>}</li>
 *   <li>{@link scribble.impl.TextProcessorImpl#getStringtoint <em>Stringtoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextProcessorImpl extends MinimalEObjectImpl.Container implements TextProcessor {
	/**
	 * The cached value of the '{@link #getStopword() <em>Stopword</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopword()
	 * @generated
	 * @ordered
	 */
	protected EList<StopWord> stopword;

	/**
	 * The cached value of the '{@link #getStemwords() <em>Stemwords</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemwords()
	 * @generated
	 * @ordered
	 */
	protected EList<StemWords> stemwords;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> token;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Text text;

	/**
	 * The cached value of the '{@link #getStringtoint() <em>Stringtoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringtoint()
	 * @generated
	 * @ordered
	 */
	protected StringToInt stringtoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribblePackage.Literals.TEXT_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StopWord> getStopword() {
		if (stopword == null) {
			stopword = new EObjectResolvingEList<StopWord>(StopWord.class, this, ScribblePackage.TEXT_PROCESSOR__STOPWORD);
		}
		return stopword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StemWords> getStemwords() {
		if (stemwords == null) {
			stemwords = new EObjectResolvingEList<StemWords>(StemWords.class, this, ScribblePackage.TEXT_PROCESSOR__STEMWORDS);
		}
		return stemwords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getToken() {
		if (token == null) {
			token = new EObjectResolvingEList<Token>(Token.class, this, ScribblePackage.TEXT_PROCESSOR__TOKEN);
		}
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Text)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScribblePackage.TEXT_PROCESSOR__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Text newText) {
		Text oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TEXT_PROCESSOR__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToInt getStringtoint() {
		if (stringtoint != null && stringtoint.eIsProxy()) {
			InternalEObject oldStringtoint = (InternalEObject)stringtoint;
			stringtoint = (StringToInt)eResolveProxy(oldStringtoint);
			if (stringtoint != oldStringtoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScribblePackage.TEXT_PROCESSOR__STRINGTOINT, oldStringtoint, stringtoint));
			}
		}
		return stringtoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToInt basicGetStringtoint() {
		return stringtoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringtoint(StringToInt newStringtoint) {
		StringToInt oldStringtoint = stringtoint;
		stringtoint = newStringtoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.TEXT_PROCESSOR__STRINGTOINT, oldStringtoint, stringtoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScribblePackage.TEXT_PROCESSOR__STOPWORD:
				return getStopword();
			case ScribblePackage.TEXT_PROCESSOR__STEMWORDS:
				return getStemwords();
			case ScribblePackage.TEXT_PROCESSOR__TOKEN:
				return getToken();
			case ScribblePackage.TEXT_PROCESSOR__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case ScribblePackage.TEXT_PROCESSOR__STRINGTOINT:
				if (resolve) return getStringtoint();
				return basicGetStringtoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScribblePackage.TEXT_PROCESSOR__STOPWORD:
				getStopword().clear();
				getStopword().addAll((Collection<? extends StopWord>)newValue);
				return;
			case ScribblePackage.TEXT_PROCESSOR__STEMWORDS:
				getStemwords().clear();
				getStemwords().addAll((Collection<? extends StemWords>)newValue);
				return;
			case ScribblePackage.TEXT_PROCESSOR__TOKEN:
				getToken().clear();
				getToken().addAll((Collection<? extends Token>)newValue);
				return;
			case ScribblePackage.TEXT_PROCESSOR__TEXT:
				setText((Text)newValue);
				return;
			case ScribblePackage.TEXT_PROCESSOR__STRINGTOINT:
				setStringtoint((StringToInt)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScribblePackage.TEXT_PROCESSOR__STOPWORD:
				getStopword().clear();
				return;
			case ScribblePackage.TEXT_PROCESSOR__STEMWORDS:
				getStemwords().clear();
				return;
			case ScribblePackage.TEXT_PROCESSOR__TOKEN:
				getToken().clear();
				return;
			case ScribblePackage.TEXT_PROCESSOR__TEXT:
				setText((Text)null);
				return;
			case ScribblePackage.TEXT_PROCESSOR__STRINGTOINT:
				setStringtoint((StringToInt)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScribblePackage.TEXT_PROCESSOR__STOPWORD:
				return stopword != null && !stopword.isEmpty();
			case ScribblePackage.TEXT_PROCESSOR__STEMWORDS:
				return stemwords != null && !stemwords.isEmpty();
			case ScribblePackage.TEXT_PROCESSOR__TOKEN:
				return token != null && !token.isEmpty();
			case ScribblePackage.TEXT_PROCESSOR__TEXT:
				return text != null;
			case ScribblePackage.TEXT_PROCESSOR__STRINGTOINT:
				return stringtoint != null;
		}
		return super.eIsSet(featureID);
	}

} //TextProcessorImpl
