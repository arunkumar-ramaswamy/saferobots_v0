/**
 */
package org.saferobots.ssml.model.ssmlbase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.saferobots.ssml.model.nfp.NfpPackage;

import org.saferobots.ssml.model.nfp.impl.NfpPackageImpl;

import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Dispatch_policy;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.QoS;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;
import org.saferobots.ssml.model.ssmlbase.gate_type;
import org.saferobots.ssml.model.ssmlbase.port_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SsmlbasePackageImpl extends EPackageImpl implements SsmlbasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatch_gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dispatch_policyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum port_typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gate_typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SsmlbasePackageImpl() {
		super(eNS_URI, SsmlbaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SsmlbasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SsmlbasePackage init() {
		if (isInited) return (SsmlbasePackage)EPackage.Registry.INSTANCE.getEPackage(SsmlbasePackage.eNS_URI);

		// Obtain or create and register package
		SsmlbasePackageImpl theSsmlbasePackage = (SsmlbasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SsmlbasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SsmlbasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NfpPackageImpl theNfpPackage = (NfpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI) instanceof NfpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI) : NfpPackage.eINSTANCE);

		// Create package meta-data objects
		theSsmlbasePackage.createPackageContents();
		theNfpPackage.createPackageContents();

		// Initialize created meta-data
		theSsmlbasePackage.initializePackageContents();
		theNfpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSsmlbasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SsmlbasePackage.eNS_URI, theSsmlbasePackage);
		return theSsmlbasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Has_gates() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Has_connectors() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatch_gate() {
		return dispatch_gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_gate_Name() {
		return (EAttribute)dispatch_gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatch_gate_Has_policy() {
		return (EReference)dispatch_gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDispatch_gate_Has_ports() {
		return (EReference)dispatch_gateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_gate_Type() {
		return (EAttribute)dispatch_gateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDispatch_policy() {
		return dispatch_policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDispatch_policy_Name() {
		return (EAttribute)dispatch_policyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Contain_ports() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Name() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Has_QoS() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_In_port() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Out_port() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Has_NFP() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP() {
		return nfpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Name() {
		return (EAttribute)nfpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Has_policy() {
		return (EReference)nfpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Attributes() {
		return (EReference)nfpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoS() {
		return qoSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoS_Name() {
		return (EAttribute)qoSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoS_Elements() {
		return (EReference)qoSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoS_Has_policy() {
		return (EReference)qoSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQoS_For_context() {
		return (EReference)qoSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getport_type() {
		return port_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getgate_type() {
		return gate_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlbaseFactory getSsmlbaseFactory() {
		return (SsmlbaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__HAS_GATES);
		createEReference(systemEClass, SYSTEM__HAS_CONNECTORS);

		dispatch_gateEClass = createEClass(DISPATCH_GATE);
		createEAttribute(dispatch_gateEClass, DISPATCH_GATE__NAME);
		createEReference(dispatch_gateEClass, DISPATCH_GATE__HAS_POLICY);
		createEReference(dispatch_gateEClass, DISPATCH_GATE__HAS_PORTS);
		createEAttribute(dispatch_gateEClass, DISPATCH_GATE__TYPE);

		dispatch_policyEClass = createEClass(DISPATCH_POLICY);
		createEAttribute(dispatch_policyEClass, DISPATCH_POLICY__NAME);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TYPE);
		createEReference(portEClass, PORT__CONTAIN_PORTS);

		connectorEClass = createEClass(CONNECTOR);
		createEAttribute(connectorEClass, CONNECTOR__NAME);
		createEReference(connectorEClass, CONNECTOR__HAS_QO_S);
		createEReference(connectorEClass, CONNECTOR__IN_PORT);
		createEReference(connectorEClass, CONNECTOR__OUT_PORT);
		createEReference(connectorEClass, CONNECTOR__HAS_NFP);

		nfpEClass = createEClass(NFP);
		createEAttribute(nfpEClass, NFP__NAME);
		createEReference(nfpEClass, NFP__HAS_POLICY);
		createEReference(nfpEClass, NFP__ATTRIBUTES);

		qoSEClass = createEClass(QO_S);
		createEAttribute(qoSEClass, QO_S__NAME);
		createEReference(qoSEClass, QO_S__ELEMENTS);
		createEReference(qoSEClass, QO_S__HAS_POLICY);
		createEReference(qoSEClass, QO_S__FOR_CONTEXT);

		// Create enums
		port_typeEEnum = createEEnum(PORT_TYPE);
		gate_typeEEnum = createEEnum(GATE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NfpPackage theNfpPackage = (NfpPackage)EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(systemEClass, org.saferobots.ssml.model.ssmlbase.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.saferobots.ssml.model.ssmlbase.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Has_gates(), this.getDispatch_gate(), null, "has_gates", null, 0, -1, org.saferobots.ssml.model.ssmlbase.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Has_connectors(), this.getConnector(), null, "has_connectors", null, 0, -1, org.saferobots.ssml.model.ssmlbase.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatch_gateEClass, Dispatch_gate.class, "Dispatch_gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDispatch_gate_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dispatch_gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDispatch_gate_Has_policy(), this.getDispatch_policy(), null, "has_policy", null, 1, 1, Dispatch_gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDispatch_gate_Has_ports(), this.getPort(), null, "has_ports", null, 0, -1, Dispatch_gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDispatch_gate_Type(), this.getgate_type(), "type", null, 0, 1, Dispatch_gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dispatch_policyEClass, Dispatch_policy.class, "Dispatch_policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDispatch_policy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Dispatch_policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Type(), this.getport_type(), "type", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_Contain_ports(), this.getPort(), null, "contain_ports", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Has_QoS(), this.getQoS(), null, "has_QoS", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_In_port(), this.getPort(), null, "in_port", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Out_port(), this.getPort(), null, "out_port", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Has_NFP(), this.getNFP(), null, "has_NFP", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfpEClass, org.saferobots.ssml.model.ssmlbase.NFP.class, "NFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.saferobots.ssml.model.ssmlbase.NFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Has_policy(), theNfpPackage.getNFP_Policy(), null, "has_policy", null, 0, 1, org.saferobots.ssml.model.ssmlbase.NFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Attributes(), theNfpPackage.getNFP_Attribute(), null, "attributes", null, 0, -1, org.saferobots.ssml.model.ssmlbase.NFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qoSEClass, QoS.class, "QoS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoS_Name(), ecorePackage.getEString(), "name", null, 0, 1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoS_Elements(), this.getNFP(), null, "elements", null, 0, -1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoS_Has_policy(), theNfpPackage.getQoS_Policy(), null, "has_policy", null, 0, 1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQoS_For_context(), theNfpPackage.getContext(), null, "for_context", null, 0, 1, QoS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(port_typeEEnum, port_type.class, "port_type");
		addEEnumLiteral(port_typeEEnum, port_type.IN);
		addEEnumLiteral(port_typeEEnum, port_type.OUT);

		initEEnum(gate_typeEEnum, gate_type.class, "gate_type");
		addEEnumLiteral(gate_typeEEnum, gate_type.SPLITTER);
		addEEnumLiteral(gate_typeEEnum, gate_type.SYNCHRONIZER);
		addEEnumLiteral(gate_typeEEnum, gate_type.DELAY);
		addEEnumLiteral(gate_typeEEnum, gate_type.MERGER);
		addEEnumLiteral(gate_typeEEnum, gate_type.SELECTOR);
		addEEnumLiteral(gate_typeEEnum, gate_type.USER_DEFINED);

		// Create resource
		createResource(eNS_URI);
	}

} //SsmlbasePackageImpl
