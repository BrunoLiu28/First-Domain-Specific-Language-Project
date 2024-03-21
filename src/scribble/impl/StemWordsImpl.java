/**
 */
package scribble.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scribble.ScribblePackage;
import scribble.StemWords;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stem Words</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scribble.impl.StemWordsImpl#getStemedWordName <em>Stemed Word Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StemWordsImpl extends MinimalEObjectImpl.Container implements StemWords {
	/**
	 * The default value of the '{@link #getStemedWordName() <em>Stemed Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemedWordName()
	 * @generated
	 * @ordered
	 */
	protected static final String STEMED_WORD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStemedWordName() <em>Stemed Word Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStemedWordName()
	 * @generated
	 * @ordered
	 */
	protected String stemedWordName = STEMED_WORD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StemWordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScribblePackage.Literals.STEM_WORDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStemedWordName() {
		return stemedWordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStemedWordName(String newStemedWordName) {
		String oldStemedWordName = stemedWordName;
		stemedWordName = newStemedWordName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScribblePackage.STEM_WORDS__STEMED_WORD_NAME, oldStemedWordName, stemedWordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScribblePackage.STEM_WORDS__STEMED_WORD_NAME:
				return getStemedWordName();
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
			case ScribblePackage.STEM_WORDS__STEMED_WORD_NAME:
				setStemedWordName((String)newValue);
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
			case ScribblePackage.STEM_WORDS__STEMED_WORD_NAME:
				setStemedWordName(STEMED_WORD_NAME_EDEFAULT);
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
			case ScribblePackage.STEM_WORDS__STEMED_WORD_NAME:
				return STEMED_WORD_NAME_EDEFAULT == null ? stemedWordName != null : !STEMED_WORD_NAME_EDEFAULT.equals(stemedWordName);
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
		result.append(" (stemedWordName: ");
		result.append(stemedWordName);
		result.append(')');
		return result.toString();
	}

} //StemWordsImpl
