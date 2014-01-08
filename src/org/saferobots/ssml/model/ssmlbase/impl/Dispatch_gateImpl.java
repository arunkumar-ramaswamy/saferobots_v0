/**
 */
package org.saferobots.ssml.model.ssmlbase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Dispatch_policy;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dispatch gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl#getHas_policy <em>Has policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl#getHas_ports <em>Has ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Dispatch_gateImpl extends MinimalEObjectImpl.Container implements Dispatch_gate {
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
	 * The cached value of the '{@link #getHas_policy() <em>Has policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_policy()
	 * @generated
	 * @ordered
	 */
	protected Dispatch_policy has_policy;

	/**
	 * The cached value of the '{@link #getHas_ports() <em>Has ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_ports()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> has_ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dispatch_gateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlbasePackage.Literals.DISPATCH_GATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.DISPATCH_GATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_policy getHas_policy() {
		return has_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_policy(Dispatch_policy newHas_policy, NotificationChain msgs) {
		Dispatch_policy oldHas_policy = has_policy;
		has_policy = newHas_policy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlbasePackage.DISPATCH_GATE__HAS_POLICY, oldHas_policy, newHas_policy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_policy(Dispatch_policy newHas_policy) {
		if (newHas_policy != has_policy) {
			NotificationChain msgs = null;
			if (has_policy != null)
				msgs = ((InternalEObject)has_policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.DISPATCH_GATE__HAS_POLICY, null, msgs);
			if (newHas_policy != null)
				msgs = ((InternalEObject)newHas_policy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.DISPATCH_GATE__HAS_POLICY, null, msgs);
			msgs = basicSetHas_policy(newHas_policy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.DISPATCH_GATE__HAS_POLICY, newHas_policy, newHas_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getHas_ports() {
		if (has_ports == null) {
			has_ports = new EObjectContainmentEList<Port>(Port.class, this, SsmlbasePackage.DISPATCH_GATE__HAS_PORTS);
		}
		return has_ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlbasePackage.DISPATCH_GATE__HAS_POLICY:
				return basicSetHas_policy(null, msgs);
			case SsmlbasePackage.DISPATCH_GATE__HAS_PORTS:
				return ((InternalEList<?>)getHas_ports()).basicRemove(otherEnd, msgs);
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
			case SsmlbasePackage.DISPATCH_GATE__NAME:
				return getName();
			case SsmlbasePackage.DISPATCH_GATE__HAS_POLICY:
				return getHas_policy();
			case SsmlbasePackage.DISPATCH_GATE__HAS_PORTS:
				return getHas_ports();
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
			case SsmlbasePackage.DISPATCH_GATE__NAME:
				setName((String)newValue);
				return;
			case SsmlbasePackage.DISPATCH_GATE__HAS_POLICY:
				setHas_policy((Dispatch_policy)newValue);
				return;
			case SsmlbasePackage.DISPATCH_GATE__HAS_PORTS:
				getHas_ports().clear();
				getHas_ports().addAll((Collection<? extends Port>)newValue);
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
			case SsmlbasePackage.DISPATCH_GATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SsmlbasePackage.DISPATCH_GATE__HAS_POLICY:
				setHas_policy((Dispatch_policy)null);
				return;
			case SsmlbasePackage.DISPATCH_GATE__HAS_PORTS:
				getHas_ports().clear();
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
			case SsmlbasePackage.DISPATCH_GATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SsmlbasePackage.DISPATCH_GATE__HAS_POLICY:
				return has_policy != null;
			case SsmlbasePackage.DISPATCH_GATE__HAS_PORTS:
				return has_ports != null && !has_ports.isEmpty();
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

} //Dispatch_gateImpl
