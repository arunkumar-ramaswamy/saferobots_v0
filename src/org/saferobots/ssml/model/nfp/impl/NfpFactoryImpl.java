/**
 */
package org.saferobots.ssml.model.nfp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.saferobots.ssml.model.nfp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfpFactoryImpl extends EFactoryImpl implements NfpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NfpFactory init() {
		try {
			NfpFactory theNfpFactory = (NfpFactory)EPackage.Registry.INSTANCE.getEFactory(NfpPackage.eNS_URI);
			if (theNfpFactory != null) {
				return theNfpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NfpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpFactoryImpl() {
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
			case NfpPackage.QO_SPOLICY: return createQoS_Policy();
			case NfpPackage.NFP_POLICY: return createNFP_Policy();
			case NfpPackage.CONTEXT: return createContext();
			case NfpPackage.NFP_ATTRIBUTE: return createNFP_Attribute();
			case NfpPackage.QUANTITATIVE: return createQuantitative();
			case NfpPackage.QUALITATIVE: return createQualitative();
			case NfpPackage.UNIT: return createUnit();
			case NfpPackage.ESTIMATED: return createEstimated();
			case NfpPackage.MEASURED: return createMeasured();
			case NfpPackage.CONSTRAINT: return createConstraint();
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
			case NfpPackage.ATTRIBUTE_TYPE:
				return createAttribute_typeFromString(eDataType, initialValue);
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
			case NfpPackage.ATTRIBUTE_TYPE:
				return convertAttribute_typeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QoS_Policy createQoS_Policy() {
		QoS_PolicyImpl qoS_Policy = new QoS_PolicyImpl();
		return qoS_Policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Policy createNFP_Policy() {
		NFP_PolicyImpl nfP_Policy = new NFP_PolicyImpl();
		return nfP_Policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Attribute createNFP_Attribute() {
		NFP_AttributeImpl nfP_Attribute = new NFP_AttributeImpl();
		return nfP_Attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantitative createQuantitative() {
		QuantitativeImpl quantitative = new QuantitativeImpl();
		return quantitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualitative createQualitative() {
		QualitativeImpl qualitative = new QualitativeImpl();
		return qualitative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estimated createEstimated() {
		EstimatedImpl estimated = new EstimatedImpl();
		return estimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measured createMeasured() {
		MeasuredImpl measured = new MeasuredImpl();
		return measured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute_type createAttribute_typeFromString(EDataType eDataType, String initialValue) {
		Attribute_type result = Attribute_type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttribute_typeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpPackage getNfpPackage() {
		return (NfpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NfpPackage getPackage() {
		return NfpPackage.eINSTANCE;
	}

} //NfpFactoryImpl
