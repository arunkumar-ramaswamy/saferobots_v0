/**
 */
package org.saferobots.ssml.model.nfp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.saferobots.ssml.model.nfp.NFP_Attribute;
import org.saferobots.ssml.model.nfp.NfpPackage;
import org.saferobots.ssml.model.nfp.Qualitative;
import org.saferobots.ssml.model.nfp.Quantitative;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFP Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl#getIs_qualitative <em>Is qualitative</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl#getIs_quantitative <em>Is quantitative</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFP_AttributeImpl extends MinimalEObjectImpl.Container implements NFP_Attribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIs_qualitative() <em>Is qualitative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_qualitative()
	 * @generated
	 * @ordered
	 */
	protected Quantitative is_qualitative;

	/**
	 * The cached value of the '{@link #getIs_quantitative() <em>Is quantitative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs_quantitative()
	 * @generated
	 * @ordered
	 */
	protected Qualitative is_quantitative;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFP_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.NFP_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.NFP_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantitative getIs_qualitative() {
		if (is_qualitative != null && is_qualitative.eIsProxy()) {
			InternalEObject oldIs_qualitative = (InternalEObject)is_qualitative;
			is_qualitative = (Quantitative)eResolveProxy(oldIs_qualitative);
			if (is_qualitative != oldIs_qualitative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE, oldIs_qualitative, is_qualitative));
			}
		}
		return is_qualitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantitative basicGetIs_qualitative() {
		return is_qualitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_qualitative(Quantitative newIs_qualitative) {
		Quantitative oldIs_qualitative = is_qualitative;
		is_qualitative = newIs_qualitative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE, oldIs_qualitative, is_qualitative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualitative getIs_quantitative() {
		if (is_quantitative != null && is_quantitative.eIsProxy()) {
			InternalEObject oldIs_quantitative = (InternalEObject)is_quantitative;
			is_quantitative = (Qualitative)eResolveProxy(oldIs_quantitative);
			if (is_quantitative != oldIs_quantitative) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE, oldIs_quantitative, is_quantitative));
			}
		}
		return is_quantitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualitative basicGetIs_quantitative() {
		return is_quantitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_quantitative(Qualitative newIs_quantitative) {
		Qualitative oldIs_quantitative = is_quantitative;
		is_quantitative = newIs_quantitative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE, oldIs_quantitative, is_quantitative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.NFP_ATTRIBUTE__NAME:
				return getName();
			case NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE:
				if (resolve) return getIs_qualitative();
				return basicGetIs_qualitative();
			case NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE:
				if (resolve) return getIs_quantitative();
				return basicGetIs_quantitative();
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
			case NfpPackage.NFP_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE:
				setIs_qualitative((Quantitative)newValue);
				return;
			case NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE:
				setIs_quantitative((Qualitative)newValue);
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
			case NfpPackage.NFP_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE:
				setIs_qualitative((Quantitative)null);
				return;
			case NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE:
				setIs_quantitative((Qualitative)null);
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
			case NfpPackage.NFP_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NfpPackage.NFP_ATTRIBUTE__IS_QUALITATIVE:
				return is_qualitative != null;
			case NfpPackage.NFP_ATTRIBUTE__IS_QUANTITATIVE:
				return is_quantitative != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NFP_AttributeImpl
