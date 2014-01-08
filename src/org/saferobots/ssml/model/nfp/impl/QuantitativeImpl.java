/**
 */
package org.saferobots.ssml.model.nfp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.saferobots.ssml.model.nfp.Attribute_type;
import org.saferobots.ssml.model.nfp.Constraint;
import org.saferobots.ssml.model.nfp.NfpPackage;
import org.saferobots.ssml.model.nfp.Quantitative;
import org.saferobots.ssml.model.nfp.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.QuantitativeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.QuantitativeImpl#getHas_unit <em>Has unit</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.impl.QuantitativeImpl#getHas_contraint <em>Has contraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantitativeImpl extends NFP_AttributeImpl implements Quantitative {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Attribute_type TYPE_EDEFAULT = Attribute_type.STATIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Attribute_type type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHas_unit() <em>Has unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_unit()
	 * @generated
	 * @ordered
	 */
	protected Unit has_unit;

	/**
	 * The cached value of the '{@link #getHas_contraint() <em>Has contraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_contraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint has_contraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfpPackage.Literals.QUANTITATIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Attribute_type newType) {
		Attribute_type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.QUANTITATIVE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getHas_unit() {
		if (has_unit != null && has_unit.eIsProxy()) {
			InternalEObject oldHas_unit = (InternalEObject)has_unit;
			has_unit = (Unit)eResolveProxy(oldHas_unit);
			if (has_unit != oldHas_unit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.QUANTITATIVE__HAS_UNIT, oldHas_unit, has_unit));
			}
		}
		return has_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetHas_unit() {
		return has_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_unit(Unit newHas_unit) {
		Unit oldHas_unit = has_unit;
		has_unit = newHas_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.QUANTITATIVE__HAS_UNIT, oldHas_unit, has_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getHas_contraint() {
		if (has_contraint != null && has_contraint.eIsProxy()) {
			InternalEObject oldHas_contraint = (InternalEObject)has_contraint;
			has_contraint = (Constraint)eResolveProxy(oldHas_contraint);
			if (has_contraint != oldHas_contraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfpPackage.QUANTITATIVE__HAS_CONTRAINT, oldHas_contraint, has_contraint));
			}
		}
		return has_contraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetHas_contraint() {
		return has_contraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_contraint(Constraint newHas_contraint) {
		Constraint oldHas_contraint = has_contraint;
		has_contraint = newHas_contraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfpPackage.QUANTITATIVE__HAS_CONTRAINT, oldHas_contraint, has_contraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfpPackage.QUANTITATIVE__TYPE:
				return getType();
			case NfpPackage.QUANTITATIVE__HAS_UNIT:
				if (resolve) return getHas_unit();
				return basicGetHas_unit();
			case NfpPackage.QUANTITATIVE__HAS_CONTRAINT:
				if (resolve) return getHas_contraint();
				return basicGetHas_contraint();
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
			case NfpPackage.QUANTITATIVE__TYPE:
				setType((Attribute_type)newValue);
				return;
			case NfpPackage.QUANTITATIVE__HAS_UNIT:
				setHas_unit((Unit)newValue);
				return;
			case NfpPackage.QUANTITATIVE__HAS_CONTRAINT:
				setHas_contraint((Constraint)newValue);
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
			case NfpPackage.QUANTITATIVE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case NfpPackage.QUANTITATIVE__HAS_UNIT:
				setHas_unit((Unit)null);
				return;
			case NfpPackage.QUANTITATIVE__HAS_CONTRAINT:
				setHas_contraint((Constraint)null);
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
			case NfpPackage.QUANTITATIVE__TYPE:
				return type != TYPE_EDEFAULT;
			case NfpPackage.QUANTITATIVE__HAS_UNIT:
				return has_unit != null;
			case NfpPackage.QUANTITATIVE__HAS_CONTRAINT:
				return has_contraint != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QuantitativeImpl
