/**
 */
package org.saferobots.ssml.model.ssmlbase.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.NFP;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.QoS;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl#getHas_QoS <em>Has Qo S</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl#getIn_port <em>In port</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl#getOut_port <em>Out port</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl#getHas_NFP <em>Has NFP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
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
	 * The cached value of the '{@link #getHas_QoS() <em>Has Qo S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_QoS()
	 * @generated
	 * @ordered
	 */
	protected QoS has_QoS;

	/**
	 * The cached value of the '{@link #getIn_port() <em>In port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn_port()
	 * @generated
	 * @ordered
	 */
	protected Port in_port;

	/**
	 * The cached value of the '{@link #getOut_port() <em>Out port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut_port()
	 * @generated
	 * @ordered
	 */
	protected Port out_port;

	/**
	 * The cached value of the '{@link #getHas_NFP() <em>Has NFP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_NFP()
	 * @generated
	 * @ordered
	 */
	protected NFP has_NFP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SsmlbasePackage.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoS getHas_QoS() {
		return has_QoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_QoS(QoS newHas_QoS, NotificationChain msgs) {
		QoS oldHas_QoS = has_QoS;
		has_QoS = newHas_QoS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__HAS_QO_S, oldHas_QoS, newHas_QoS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_QoS(QoS newHas_QoS) {
		if (newHas_QoS != has_QoS) {
			NotificationChain msgs = null;
			if (has_QoS != null)
				msgs = ((InternalEObject)has_QoS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.CONNECTOR__HAS_QO_S, null, msgs);
			if (newHas_QoS != null)
				msgs = ((InternalEObject)newHas_QoS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.CONNECTOR__HAS_QO_S, null, msgs);
			msgs = basicSetHas_QoS(newHas_QoS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__HAS_QO_S, newHas_QoS, newHas_QoS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getIn_port() {
		if (in_port != null && in_port.eIsProxy()) {
			InternalEObject oldIn_port = (InternalEObject)in_port;
			in_port = (Port)eResolveProxy(oldIn_port);
			if (in_port != oldIn_port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsmlbasePackage.CONNECTOR__IN_PORT, oldIn_port, in_port));
			}
		}
		return in_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetIn_port() {
		return in_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn_port(Port newIn_port) {
		Port oldIn_port = in_port;
		in_port = newIn_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__IN_PORT, oldIn_port, in_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getOut_port() {
		if (out_port != null && out_port.eIsProxy()) {
			InternalEObject oldOut_port = (InternalEObject)out_port;
			out_port = (Port)eResolveProxy(oldOut_port);
			if (out_port != oldOut_port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SsmlbasePackage.CONNECTOR__OUT_PORT, oldOut_port, out_port));
			}
		}
		return out_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOut_port() {
		return out_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut_port(Port newOut_port) {
		Port oldOut_port = out_port;
		out_port = newOut_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__OUT_PORT, oldOut_port, out_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP getHas_NFP() {
		return has_NFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHas_NFP(NFP newHas_NFP, NotificationChain msgs) {
		NFP oldHas_NFP = has_NFP;
		has_NFP = newHas_NFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__HAS_NFP, oldHas_NFP, newHas_NFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_NFP(NFP newHas_NFP) {
		if (newHas_NFP != has_NFP) {
			NotificationChain msgs = null;
			if (has_NFP != null)
				msgs = ((InternalEObject)has_NFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.CONNECTOR__HAS_NFP, null, msgs);
			if (newHas_NFP != null)
				msgs = ((InternalEObject)newHas_NFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SsmlbasePackage.CONNECTOR__HAS_NFP, null, msgs);
			msgs = basicSetHas_NFP(newHas_NFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SsmlbasePackage.CONNECTOR__HAS_NFP, newHas_NFP, newHas_NFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SsmlbasePackage.CONNECTOR__HAS_QO_S:
				return basicSetHas_QoS(null, msgs);
			case SsmlbasePackage.CONNECTOR__HAS_NFP:
				return basicSetHas_NFP(null, msgs);
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
			case SsmlbasePackage.CONNECTOR__NAME:
				return getName();
			case SsmlbasePackage.CONNECTOR__HAS_QO_S:
				return getHas_QoS();
			case SsmlbasePackage.CONNECTOR__IN_PORT:
				if (resolve) return getIn_port();
				return basicGetIn_port();
			case SsmlbasePackage.CONNECTOR__OUT_PORT:
				if (resolve) return getOut_port();
				return basicGetOut_port();
			case SsmlbasePackage.CONNECTOR__HAS_NFP:
				return getHas_NFP();
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
			case SsmlbasePackage.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case SsmlbasePackage.CONNECTOR__HAS_QO_S:
				setHas_QoS((QoS)newValue);
				return;
			case SsmlbasePackage.CONNECTOR__IN_PORT:
				setIn_port((Port)newValue);
				return;
			case SsmlbasePackage.CONNECTOR__OUT_PORT:
				setOut_port((Port)newValue);
				return;
			case SsmlbasePackage.CONNECTOR__HAS_NFP:
				setHas_NFP((NFP)newValue);
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
			case SsmlbasePackage.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SsmlbasePackage.CONNECTOR__HAS_QO_S:
				setHas_QoS((QoS)null);
				return;
			case SsmlbasePackage.CONNECTOR__IN_PORT:
				setIn_port((Port)null);
				return;
			case SsmlbasePackage.CONNECTOR__OUT_PORT:
				setOut_port((Port)null);
				return;
			case SsmlbasePackage.CONNECTOR__HAS_NFP:
				setHas_NFP((NFP)null);
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
			case SsmlbasePackage.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SsmlbasePackage.CONNECTOR__HAS_QO_S:
				return has_QoS != null;
			case SsmlbasePackage.CONNECTOR__IN_PORT:
				return in_port != null;
			case SsmlbasePackage.CONNECTOR__OUT_PORT:
				return out_port != null;
			case SsmlbasePackage.CONNECTOR__HAS_NFP:
				return has_NFP != null;
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

} //ConnectorImpl
