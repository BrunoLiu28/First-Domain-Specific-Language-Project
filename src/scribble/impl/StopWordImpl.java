/**
 */
package scribble.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scribble.ScribblePackage;
import scribble.StopWord;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Word</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scribble.impl.StopWordImpl#getStopWordName <em>Stop Word Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopWordImpl extends MinimalEObjectImpl.Container implements StopWord {
	/**
	 * The default value of the '{@link #getStopWordName() <em>Stop Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopWordName()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_WORD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopWordName() <em>Stop Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopWordName()
	 * @generated
	 * @ordered
	 */
	protected String stopWordName = STOP_WORD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopWordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribblePackage.Literals.STOP_WORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStopWordName() {
		return stopWordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopWordName(String newStopWordName) {
		String oldStopWordName = stopWordName;
		stopWordName = newStopWordName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.STOP_WORD__STOP_WORD_NAME, oldStopWordName, stopWordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScribblePackage.STOP_WORD__STOP_WORD_NAME:
				return getStopWordName();
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
			case ScribblePackage.STOP_WORD__STOP_WORD_NAME:
				setStopWordName((String)newValue);
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
			case ScribblePackage.STOP_WORD__STOP_WORD_NAME:
				setStopWordName(STOP_WORD_NAME_EDEFAULT);
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
			case ScribblePackage.STOP_WORD__STOP_WORD_NAME:
				return STOP_WORD_NAME_EDEFAULT == null ? stopWordName != null : !STOP_WORD_NAME_EDEFAULT.equals(stopWordName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stopWordName: ");
		result.append(stopWordName);
		result.append(')');
		return result.toString();
	}

} //StopWordImpl
