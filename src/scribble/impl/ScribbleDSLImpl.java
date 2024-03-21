/**
 */
package scribble.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scribble.ScribbleDSL;
import scribble.ScribblePackage;
import scribble.TextProcessor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scribble.impl.ScribbleDSLImpl#getTextprocessor <em>Textprocessor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScribbleDSLImpl extends MinimalEObjectImpl.Container implements ScribbleDSL {
	/**
	 * The cached value of the '{@link #getTextprocessor() <em>Textprocessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextprocessor()
	 * @generated
	 * @ordered
	 */
	protected TextProcessor textprocessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScribbleDSLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribblePackage.Literals.SCRIBBLE_DSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextProcessor getTextprocessor() {
		return textprocessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextprocessor(TextProcessor newTextprocessor, NotificationChain msgs) {
		TextProcessor oldTextprocessor = textprocessor;
		textprocessor = newTextprocessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR, oldTextprocessor, newTextprocessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextprocessor(TextProcessor newTextprocessor) {
		if (newTextprocessor != textprocessor) {
			NotificationChain msgs = null;
			if (textprocessor != null)
				msgs = ((InternalEObject)textprocessor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR, null, msgs);
			if (newTextprocessor != null)
				msgs = ((InternalEObject)newTextprocessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR, null, msgs);
			msgs = basicSetTextprocessor(newTextprocessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR, newTextprocessor, newTextprocessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR:
				return basicSetTextprocessor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR:
				return getTextprocessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR:
				setTextprocessor((TextProcessor)newValue);
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
			case ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR:
				setTextprocessor((TextProcessor)null);
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
			case ScribblePackage.SCRIBBLE_DSL__TEXTPROCESSOR:
				return textprocessor != null;
		}
		return super.eIsSet(featureID);
	}

} //ScribbleDSLImpl
