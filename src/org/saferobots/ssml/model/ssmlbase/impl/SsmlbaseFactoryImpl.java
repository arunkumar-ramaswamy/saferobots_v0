/**
 */
package org.saferobots.ssml.model.ssmlbase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Dispatch_policy;
import org.saferobots.ssml.model.ssmlbase.NFP;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.QoS;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;
import org.saferobots.ssml.model.ssmlbase.gate_type;
import org.saferobots.ssml.model.ssmlbase.port_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsmlbaseFactoryImpl extends EFactoryImpl implements SsmlbaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SsmlbaseFactory init() {
		try {
			SsmlbaseFactory theSsmlbaseFactory = (SsmlbaseFactory)EPackage.Registry.INSTANCE.getEFactory(SsmlbasePackage.eNS_URI);
			if (theSsmlbaseFactory != null) {
				return theSsmlbaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SsmlbaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlbaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SsmlbasePackage.SYSTEM: return createSystem();
			case SsmlbasePackage.DISPATCH_GATE: return createDispatch_gate();
			case SsmlbasePackage.DISPATCH_POLICY: return createDispatch_policy();
			case SsmlbasePackage.PORT: return createPort();
			case SsmlbasePackage.CONNECTOR: return createConnector();
			case SsmlbasePackage.NFP: return createNFP();
			case SsmlbasePackage.QO_S: return createQoS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SsmlbasePackage.PORT_TYPE:
				return createport_typeFromString(eDataType, initialValue);
			case SsmlbasePackage.GATE_TYPE:
				return creategate_typeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SsmlbasePackage.PORT_TYPE:
				return convertport_typeToString(eDataType, instanceValue);
			case SsmlbasePackage.GATE_TYPE:
				return convertgate_typeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.saferobots.ssml.model.ssmlbase.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_gate createDispatch_gate() {
		Dispatch_gateImpl dispatch_gate = new Dispatch_gateImpl();
		return dispatch_gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dispatch_policy createDispatch_policy() {
		Dispatch_policyImpl dispatch_policy = new Dispatch_policyImpl();
		return dispatch_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP createNFP() {
		NFPImpl nfp = new NFPImpl();
		return nfp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoS createQoS() {
		QoSImpl qoS = new QoSImpl();
		return qoS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public port_type createport_typeFromString(EDataType eDataType, String initialValue) {
		port_type result = port_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertport_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public gate_type creategate_typeFromString(EDataType eDataType, String initialValue) {
		gate_type result = gate_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertgate_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlbasePackage getSsmlbasePackage() {
		return (SsmlbasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SsmlbasePackage getPackage() {
		return SsmlbasePackage.eINSTANCE;
	}

} //SsmlbaseFactoryImpl
