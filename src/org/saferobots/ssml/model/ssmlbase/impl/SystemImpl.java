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

import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.SystemImpl#getHas_gates <em>Has gates</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.SystemImpl#getHas_connectors <em>Has connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements org.saferobots.ssml.model.ssmlbase.System {
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
	 * The cached value of the '{@link #getHas_gates() <em>Has gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_gates()
	 * @generated
	 * @ordered
	 */
	protected EList<Dispatch_gate> has_gates;

	/**
	 * The cached value of the '{@link #getHas_connectors() <em>Has connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_connectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> has_connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlbasePackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dispatch_gate> getHas_gates() {
		if (has_gates == null) {
			has_gates = new EObjectContainmentEList<Dispatch_gate>(Dispatch_gate.class, this, SsmlbasePackage.SYSTEM__HAS_GATES);
		}
		return has_gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getHas_connectors() {
		if (has_connectors == null) {
			has_connectors = new EObjectContainmentEList<Connector>(Connector.class, this, SsmlbasePackage.SYSTEM__HAS_CONNECTORS);
		}
		return has_connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlbasePackage.SYSTEM__HAS_GATES:
				return ((InternalEList<?>)getHas_gates()).basicRemove(otherEnd, msgs);
			case SsmlbasePackage.SYSTEM__HAS_CONNECTORS:
				return ((InternalEList<?>)getHas_connectors()).basicRemove(otherEnd, msgs);
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
			case SsmlbasePackage.SYSTEM__NAME:
				return getName();
			case SsmlbasePackage.SYSTEM__HAS_GATES:
				return getHas_gates();
			case SsmlbasePackage.SYSTEM__HAS_CONNECTORS:
				return getHas_connectors();
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
			case SsmlbasePackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case SsmlbasePackage.SYSTEM__HAS_GATES:
				getHas_gates().clear();
				getHas_gates().addAll((Collection<? extends Dispatch_gate>)newValue);
				return;
			case SsmlbasePackage.SYSTEM__HAS_CONNECTORS:
				getHas_connectors().clear();
				getHas_connectors().addAll((Collection<? extends Connector>)newValue);
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
			case SsmlbasePackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SsmlbasePackage.SYSTEM__HAS_GATES:
				getHas_gates().clear();
				return;
			case SsmlbasePackage.SYSTEM__HAS_CONNECTORS:
				getHas_connectors().clear();
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
			case SsmlbasePackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SsmlbasePackage.SYSTEM__HAS_GATES:
				return has_gates != null && !has_gates.isEmpty();
			case SsmlbasePackage.SYSTEM__HAS_CONNECTORS:
				return has_connectors != null && !has_connectors.isEmpty();
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

} //SystemImpl
