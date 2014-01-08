/**
 */
package org.saferobots.ssml.model.nfp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.saferobots.ssml.model.nfp.Attribute_type;
import org.saferobots.ssml.model.nfp.Constraint;
import org.saferobots.ssml.model.nfp.Context;
import org.saferobots.ssml.model.nfp.Estimated;
import org.saferobots.ssml.model.nfp.Measured;
import org.saferobots.ssml.model.nfp.NFP_Attribute;
import org.saferobots.ssml.model.nfp.NFP_Policy;
import org.saferobots.ssml.model.nfp.NfpFactory;
import org.saferobots.ssml.model.nfp.NfpPackage;
import org.saferobots.ssml.model.nfp.QoS_Policy;
import org.saferobots.ssml.model.nfp.Qualitative;
import org.saferobots.ssml.model.nfp.Quantitative;
import org.saferobots.ssml.model.nfp.Unit;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;
import org.saferobots.ssml.model.ssmlbase.impl.SsmlbasePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfpPackageImpl extends EPackageImpl implements NfpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qoS_PolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_PolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfP_AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualitativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass estimatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attribute_typeEEnum = null;

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
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NfpPackageImpl() {
		super(eNS_URI, NfpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NfpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NfpPackage init() {
		if (isInited) return (NfpPackage)EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI);

		// Obtain or create and register package
		NfpPackageImpl theNfpPackage = (NfpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NfpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NfpPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SsmlbasePackageImpl theSsmlbasePackage = (SsmlbasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SsmlbasePackage.eNS_URI) instanceof SsmlbasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SsmlbasePackage.eNS_URI) : SsmlbasePackage.eINSTANCE);

		// Create package meta-data objects
		theNfpPackage.createPackageContents();
		theSsmlbasePackage.createPackageContents();

		// Initialize created meta-data
		theNfpPackage.initializePackageContents();
		theSsmlbasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNfpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NfpPackage.eNS_URI, theNfpPackage);
		return theNfpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQoS_Policy() {
		return qoS_PolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQoS_Policy_Name() {
		return (EAttribute)qoS_PolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Policy() {
		return nfP_PolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Policy_Name() {
		return (EAttribute)nfP_PolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContext_Name() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFP_Attribute() {
		return nfP_AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFP_Attribute_Name() {
		return (EAttribute)nfP_AttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Attribute_Is_qualitative() {
		return (EReference)nfP_AttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFP_Attribute_Is_quantitative() {
		return (EReference)nfP_AttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantitative() {
		return quantitativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantitative_Type() {
		return (EAttribute)quantitativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitative_Has_unit() {
		return (EReference)quantitativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantitative_Has_contraint() {
		return (EReference)quantitativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualitative() {
		return qualitativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnit_Name() {
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEstimated() {
		return estimatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasured() {
		return measuredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttribute_type() {
		return attribute_typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpFactory getNfpFactory() {
		return (NfpFactory)getEFactoryInstance();
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
		qoS_PolicyEClass = createEClass(QO_SPOLICY);
		createEAttribute(qoS_PolicyEClass, QO_SPOLICY__NAME);

		nfP_PolicyEClass = createEClass(NFP_POLICY);
		createEAttribute(nfP_PolicyEClass, NFP_POLICY__NAME);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__NAME);

		nfP_AttributeEClass = createEClass(NFP_ATTRIBUTE);
		createEAttribute(nfP_AttributeEClass, NFP_ATTRIBUTE__NAME);
		createEReference(nfP_AttributeEClass, NFP_ATTRIBUTE__IS_QUALITATIVE);
		createEReference(nfP_AttributeEClass, NFP_ATTRIBUTE__IS_QUANTITATIVE);

		quantitativeEClass = createEClass(QUANTITATIVE);
		createEAttribute(quantitativeEClass, QUANTITATIVE__TYPE);
		createEReference(quantitativeEClass, QUANTITATIVE__HAS_UNIT);
		createEReference(quantitativeEClass, QUANTITATIVE__HAS_CONTRAINT);

		qualitativeEClass = createEClass(QUALITATIVE);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__NAME);

		estimatedEClass = createEClass(ESTIMATED);

		measuredEClass = createEClass(MEASURED);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);

		// Create enums
		attribute_typeEEnum = createEEnum(ATTRIBUTE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantitativeEClass.getESuperTypes().add(this.getNFP_Attribute());
		qualitativeEClass.getESuperTypes().add(this.getNFP_Attribute());
		estimatedEClass.getESuperTypes().add(this.getQuantitative());
		measuredEClass.getESuperTypes().add(this.getQuantitative());

		// Initialize classes, features, and operations; add parameters
		initEClass(qoS_PolicyEClass, QoS_Policy.class, "QoS_Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQoS_Policy_Name(), ecorePackage.getEString(), "name", null, 0, 1, QoS_Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfP_PolicyEClass, NFP_Policy.class, "NFP_Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Policy_Name(), ecorePackage.getEString(), "name", null, 0, 1, NFP_Policy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfP_AttributeEClass, NFP_Attribute.class, "NFP_Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFP_Attribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, NFP_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Attribute_Is_qualitative(), this.getQuantitative(), null, "is_qualitative", null, 0, 1, NFP_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFP_Attribute_Is_quantitative(), this.getQualitative(), null, "is_quantitative", null, 0, 1, NFP_Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantitativeEClass, Quantitative.class, "Quantitative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantitative_Type(), this.getAttribute_type(), "type", null, 0, 1, Quantitative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitative_Has_unit(), this.getUnit(), null, "has_unit", null, 0, 1, Quantitative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantitative_Has_contraint(), this.getConstraint(), null, "has_contraint", null, 0, 1, Quantitative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualitativeEClass, Qualitative.class, "Qualitative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(estimatedEClass, Estimated.class, "Estimated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measuredEClass, Measured.class, "Measured", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(attribute_typeEEnum, Attribute_type.class, "Attribute_type");
		addEEnumLiteral(attribute_typeEEnum, Attribute_type.STATIC);
		addEEnumLiteral(attribute_typeEEnum, Attribute_type.DYNAMIC);
		addEEnumLiteral(attribute_typeEEnum, Attribute_type.DERIVED);

		// Create resource
		createResource(eNS_URI);
	}

} //NfpPackageImpl
