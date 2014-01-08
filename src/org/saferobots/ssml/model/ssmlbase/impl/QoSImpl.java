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

import org.saferobots.ssml.model.nfp.Context;
import org.saferobots.ssml.model.nfp.QoS_Policy;

import org.saferobots.ssml.model.ssmlbase.NFP;
import org.saferobots.ssml.model.ssmlbase.QoS;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qo S</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl#getHas_policy <em>Has policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl#getFor_context <em>For context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QoSImpl extends MinimalEObjectImpl.Container implements QoS {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<NFP> elements;

	/**
	 * The cached value of the '{@link #getHas_policy() <em>Has policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_policy()
	 * @generated
	 * @ordered
	 */
	protected QoS_Policy has_policy;

	/**
	 * The cached value of the '{@link #getFor_context() <em>For context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFor_context()
	 * @generated
	 * @ordered
	 */
	protected Context for_context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QoSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlbasePackage.Literals.QO_S;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.QO_S__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NFP> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<NFP>(NFP.class, this, SsmlbasePackage.QO_S__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoS_Policy getHas_policy() {
		return has_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_policy(QoS_Policy newHas_policy, NotificationChain msgs) {
		QoS_Policy oldHas_policy = has_policy;
		has_policy = newHas_policy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlbasePackage.QO_S__HAS_POLICY, oldHas_policy, newHas_policy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_policy(QoS_Policy newHas_policy) {
		if (newHas_policy != has_policy) {
			NotificationChain msgs = null;
			if (has_policy != null)
				msgs = ((InternalEObject)has_policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.QO_S__HAS_POLICY, null, msgs);
			if (newHas_policy != null)
				msgs = ((InternalEObject)newHas_policy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.QO_S__HAS_POLICY, null, msgs);
			msgs = basicSetHas_policy(newHas_policy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.QO_S__HAS_POLICY, newHas_policy, newHas_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context getFor_context() {
		if (for_context != null && for_context.eIsProxy()) {
			InternalEObject oldFor_context = (InternalEObject)for_context;
			for_context = (Context)eResolveProxy(oldFor_context);
			if (for_context != oldFor_context) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsmlbasePackage.QO_S__FOR_CONTEXT, oldFor_context, for_context));
			}
		}
		return for_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context basicGetFor_context() {
		return for_context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor_context(Context newFor_context) {
		Context oldFor_context = for_context;
		for_context = newFor_context;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.QO_S__FOR_CONTEXT, oldFor_context, for_context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlbasePackage.QO_S__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case SsmlbasePackage.QO_S__HAS_POLICY:
				return basicSetHas_policy(null, msgs);
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
			case SsmlbasePackage.QO_S__NAME:
				return getName();
			case SsmlbasePackage.QO_S__ELEMENTS:
				return getElements();
			case SsmlbasePackage.QO_S__HAS_POLICY:
				return getHas_policy();
			case SsmlbasePackage.QO_S__FOR_CONTEXT:
				if (resolve) return getFor_context();
				return basicGetFor_context();
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
			case SsmlbasePackage.QO_S__NAME:
				setName((String)newValue);
				return;
			case SsmlbasePackage.QO_S__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends NFP>)newValue);
				return;
			case SsmlbasePackage.QO_S__HAS_POLICY:
				setHas_policy((QoS_Policy)newValue);
				return;
			case SsmlbasePackage.QO_S__FOR_CONTEXT:
				setFor_context((Context)newValue);
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
			case SsmlbasePackage.QO_S__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SsmlbasePackage.QO_S__ELEMENTS:
				getElements().clear();
				return;
			case SsmlbasePackage.QO_S__HAS_POLICY:
				setHas_policy((QoS_Policy)null);
				return;
			case SsmlbasePackage.QO_S__FOR_CONTEXT:
				setFor_context((Context)null);
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
			case SsmlbasePackage.QO_S__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SsmlbasePackage.QO_S__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SsmlbasePackage.QO_S__HAS_POLICY:
				return has_policy != null;
			case SsmlbasePackage.QO_S__FOR_CONTEXT:
				return for_context != null;
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

} //QoSImpl
