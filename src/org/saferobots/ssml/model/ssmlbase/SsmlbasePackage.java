/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory
 * @model kind="package"
 * @generated
 */
public interface SsmlbasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ssmlbase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ssmlbase/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ssmlbase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SsmlbasePackage eINSTANCE = org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SystemImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_GATES = 1;

	/**
	 * The feature id for the '<em><b>Has connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__HAS_CONNECTORS = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl <em>Dispatch gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getDispatch_gate()
	 * @generated
	 */
	int DISPATCH_GATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__HAS_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Has ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__HAS_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Dispatch gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dispatch gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_policyImpl <em>Dispatch policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.Dispatch_policyImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getDispatch_policy()
	 * @generated
	 */
	int DISPATCH_POLICY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dispatch policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dispatch policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPATCH_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.PortImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Contain ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONTAIN_PORTS = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Qo S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_QO_S = 1;

	/**
	 * The feature id for the '<em><b>In port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IN_PORT = 2;

	/**
	 * The feature id for the '<em><b>Out port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Has NFP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__HAS_NFP = 4;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.NFPImpl <em>NFP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.NFPImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getNFP()
	 * @generated
	 */
	int NFP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__HAS_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NFP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl <em>Qo S</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.impl.QoSImpl
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getQoS()
	 * @generated
	 */
	int QO_S = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Has policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__HAS_POLICY = 2;

	/**
	 * The feature id for the '<em><b>For context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S__FOR_CONTEXT = 3;

	/**
	 * The number of structural features of the '<em>Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Qo S</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_S_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.port_type <em>port type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.port_type
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getport_type()
	 * @generated
	 */
	int PORT_TYPE = 7;


	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.ssmlbase.gate_type <em>gate type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.ssmlbase.gate_type
	 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getgate_type()
	 * @generated
	 */
	int GATE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.System#getHas_gates <em>Has gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has gates</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.System#getHas_gates()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Has_gates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.System#getHas_connectors <em>Has connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has connectors</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.System#getHas_connectors()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Has_connectors();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate <em>Dispatch gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatch gate</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate
	 * @generated
	 */
	EClass getDispatch_gate();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getName()
	 * @see #getDispatch_gate()
	 * @generated
	 */
	EAttribute getDispatch_gate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_policy <em>Has policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has policy</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_policy()
	 * @see #getDispatch_gate()
	 * @generated
	 */
	EReference getDispatch_gate_Has_policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_ports <em>Has ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has ports</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_ports()
	 * @see #getDispatch_gate()
	 * @generated
	 */
	EReference getDispatch_gate_Has_ports();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getType()
	 * @see #getDispatch_gate()
	 * @generated
	 */
	EAttribute getDispatch_gate_Type();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_policy <em>Dispatch policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dispatch policy</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_policy
	 * @generated
	 */
	EClass getDispatch_policy();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_policy#getName()
	 * @see #getDispatch_policy()
	 * @generated
	 */
	EAttribute getDispatch_policy_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.Port#getContain_ports <em>Contain ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contain ports</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Port#getContain_ports()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Contain_ports();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_QoS <em>Has Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Qo S</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector#getHas_QoS()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Has_QoS();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.ssmlbase.Connector#getIn_port <em>In port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In port</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector#getIn_port()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_In_port();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.ssmlbase.Connector#getOut_port <em>Out port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out port</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector#getOut_port()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Out_port();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_NFP <em>Has NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has NFP</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector#getHas_NFP()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Has_NFP();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.NFP
	 * @generated
	 */
	EClass getNFP();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.NFP#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.NFP#getName()
	 * @see #getNFP()
	 * @generated
	 */
	EAttribute getNFP_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.model.ssmlbase.NFP#getHas_policy <em>Has policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has policy</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.NFP#getHas_policy()
	 * @see #getNFP()
	 * @generated
	 */
	EReference getNFP_Has_policy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.NFP#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.NFP#getAttributes()
	 * @see #getNFP()
	 * @generated
	 */
	EReference getNFP_Attributes();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.ssmlbase.QoS <em>Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo S</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS
	 * @generated
	 */
	EClass getQoS();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.ssmlbase.QoS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS#getName()
	 * @see #getQoS()
	 * @generated
	 */
	EAttribute getQoS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.saferobots.ssml.model.ssmlbase.QoS#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS#getElements()
	 * @see #getQoS()
	 * @generated
	 */
	EReference getQoS_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link org.saferobots.ssml.model.ssmlbase.QoS#getHas_policy <em>Has policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has policy</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS#getHas_policy()
	 * @see #getQoS()
	 * @generated
	 */
	EReference getQoS_Has_policy();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.ssmlbase.QoS#getFor_context <em>For context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For context</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS#getFor_context()
	 * @see #getQoS()
	 * @generated
	 */
	EReference getQoS_For_context();

	/**
	 * Returns the meta object for enum '{@link org.saferobots.ssml.model.ssmlbase.port_type <em>port type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>port type</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.port_type
	 * @generated
	 */
	EEnum getport_type();

	/**
	 * Returns the meta object for enum '{@link org.saferobots.ssml.model.ssmlbase.gate_type <em>gate type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>gate type</em>'.
	 * @see org.saferobots.ssml.model.ssmlbase.gate_type
	 * @generated
	 */
	EEnum getgate_type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SsmlbaseFactory getSsmlbaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SystemImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Has gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_GATES = eINSTANCE.getSystem_Has_gates();

		/**
		 * The meta object literal for the '<em><b>Has connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__HAS_CONNECTORS = eINSTANCE.getSystem_Has_connectors();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl <em>Dispatch gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.Dispatch_gateImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getDispatch_gate()
		 * @generated
		 */
		EClass DISPATCH_GATE = eINSTANCE.getDispatch_gate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_GATE__NAME = eINSTANCE.getDispatch_gate_Name();

		/**
		 * The meta object literal for the '<em><b>Has policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_GATE__HAS_POLICY = eINSTANCE.getDispatch_gate_Has_policy();

		/**
		 * The meta object literal for the '<em><b>Has ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPATCH_GATE__HAS_PORTS = eINSTANCE.getDispatch_gate_Has_ports();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_GATE__TYPE = eINSTANCE.getDispatch_gate_Type();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.Dispatch_policyImpl <em>Dispatch policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.Dispatch_policyImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getDispatch_policy()
		 * @generated
		 */
		EClass DISPATCH_POLICY = eINSTANCE.getDispatch_policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPATCH_POLICY__NAME = eINSTANCE.getDispatch_policy_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.PortImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Contain ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONTAIN_PORTS = eINSTANCE.getPort_Contain_ports();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.ConnectorImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Has Qo S</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_QO_S = eINSTANCE.getConnector_Has_QoS();

		/**
		 * The meta object literal for the '<em><b>In port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__IN_PORT = eINSTANCE.getConnector_In_port();

		/**
		 * The meta object literal for the '<em><b>Out port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__OUT_PORT = eINSTANCE.getConnector_Out_port();

		/**
		 * The meta object literal for the '<em><b>Has NFP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__HAS_NFP = eINSTANCE.getConnector_Has_NFP();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.NFPImpl <em>NFP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.NFPImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getNFP()
		 * @generated
		 */
		EClass NFP = eINSTANCE.getNFP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP__NAME = eINSTANCE.getNFP_Name();

		/**
		 * The meta object literal for the '<em><b>Has policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP__HAS_POLICY = eINSTANCE.getNFP_Has_policy();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP__ATTRIBUTES = eINSTANCE.getNFP_Attributes();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.impl.QoSImpl <em>Qo S</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.impl.QoSImpl
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getQoS()
		 * @generated
		 */
		EClass QO_S = eINSTANCE.getQoS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_S__NAME = eINSTANCE.getQoS_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_S__ELEMENTS = eINSTANCE.getQoS_Elements();

		/**
		 * The meta object literal for the '<em><b>Has policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_S__HAS_POLICY = eINSTANCE.getQoS_Has_policy();

		/**
		 * The meta object literal for the '<em><b>For context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QO_S__FOR_CONTEXT = eINSTANCE.getQoS_For_context();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.port_type <em>port type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.port_type
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getport_type()
		 * @generated
		 */
		EEnum PORT_TYPE = eINSTANCE.getport_type();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.ssmlbase.gate_type <em>gate type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.ssmlbase.gate_type
		 * @see org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl#getgate_type()
		 * @generated
		 */
		EEnum GATE_TYPE = eINSTANCE.getgate_type();

	}

} //SsmlbasePackage
