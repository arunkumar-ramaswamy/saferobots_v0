/**
 */
package org.saferobots.ssml.model.nfp;

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
 * @see org.saferobots.ssml.model.nfp.NfpFactory
 * @model kind="package"
 * @generated
 */
public interface NfpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nfp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nfp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nfp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfpPackage eINSTANCE = org.saferobots.ssml.model.nfp.impl.NfpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.QoS_PolicyImpl <em>Qo SPolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.QoS_PolicyImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQoS_Policy()
	 * @generated
	 */
	int QO_SPOLICY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SPOLICY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Qo SPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SPOLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qo SPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QO_SPOLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.NFP_PolicyImpl <em>NFP Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.NFP_PolicyImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getNFP_Policy()
	 * @generated
	 */
	int NFP_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POLICY__NAME = 0;

	/**
	 * The number of structural features of the '<em>NFP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>NFP Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.ContextImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl <em>NFP Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getNFP_Attribute()
	 * @generated
	 */
	int NFP_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ATTRIBUTE__IS_QUALITATIVE = 1;

	/**
	 * The feature id for the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ATTRIBUTE__IS_QUANTITATIVE = 2;

	/**
	 * The number of structural features of the '<em>NFP Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NFP Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.QuantitativeImpl <em>Quantitative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.QuantitativeImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQuantitative()
	 * @generated
	 */
	int QUANTITATIVE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__NAME = NFP_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__IS_QUALITATIVE = NFP_ATTRIBUTE__IS_QUALITATIVE;

	/**
	 * The feature id for the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__IS_QUANTITATIVE = NFP_ATTRIBUTE__IS_QUANTITATIVE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__TYPE = NFP_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__HAS_UNIT = NFP_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has contraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE__HAS_CONTRAINT = NFP_ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_FEATURE_COUNT = NFP_ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_OPERATION_COUNT = NFP_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.QualitativeImpl <em>Qualitative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.QualitativeImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQualitative()
	 * @generated
	 */
	int QUALITATIVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__NAME = NFP_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__IS_QUALITATIVE = NFP_ATTRIBUTE__IS_QUALITATIVE;

	/**
	 * The feature id for the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE__IS_QUANTITATIVE = NFP_ATTRIBUTE__IS_QUANTITATIVE;

	/**
	 * The number of structural features of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_FEATURE_COUNT = NFP_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qualitative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_OPERATION_COUNT = NFP_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.UnitImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.EstimatedImpl <em>Estimated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.EstimatedImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getEstimated()
	 * @generated
	 */
	int ESTIMATED = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__NAME = QUANTITATIVE__NAME;

	/**
	 * The feature id for the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__IS_QUALITATIVE = QUANTITATIVE__IS_QUALITATIVE;

	/**
	 * The feature id for the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__IS_QUANTITATIVE = QUANTITATIVE__IS_QUANTITATIVE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__TYPE = QUANTITATIVE__TYPE;

	/**
	 * The feature id for the '<em><b>Has unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__HAS_UNIT = QUANTITATIVE__HAS_UNIT;

	/**
	 * The feature id for the '<em><b>Has contraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED__HAS_CONTRAINT = QUANTITATIVE__HAS_CONTRAINT;

	/**
	 * The number of structural features of the '<em>Estimated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Estimated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTIMATED_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.MeasuredImpl <em>Measured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.MeasuredImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getMeasured()
	 * @generated
	 */
	int MEASURED = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__NAME = QUANTITATIVE__NAME;

	/**
	 * The feature id for the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__IS_QUALITATIVE = QUANTITATIVE__IS_QUALITATIVE;

	/**
	 * The feature id for the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__IS_QUANTITATIVE = QUANTITATIVE__IS_QUANTITATIVE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__TYPE = QUANTITATIVE__TYPE;

	/**
	 * The feature id for the '<em><b>Has unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__HAS_UNIT = QUANTITATIVE__HAS_UNIT;

	/**
	 * The feature id for the '<em><b>Has contraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED__HAS_CONTRAINT = QUANTITATIVE__HAS_CONTRAINT;

	/**
	 * The number of structural features of the '<em>Measured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_FEATURE_COUNT = QUANTITATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_OPERATION_COUNT = QUANTITATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.impl.ConstraintImpl
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.saferobots.ssml.model.nfp.Attribute_type <em>Attribute type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.saferobots.ssml.model.nfp.Attribute_type
	 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getAttribute_type()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.QoS_Policy <em>Qo SPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qo SPolicy</em>'.
	 * @see org.saferobots.ssml.model.nfp.QoS_Policy
	 * @generated
	 */
	EClass getQoS_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.QoS_Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.QoS_Policy#getName()
	 * @see #getQoS_Policy()
	 * @generated
	 */
	EAttribute getQoS_Policy_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.NFP_Policy <em>NFP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Policy</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Policy
	 * @generated
	 */
	EClass getNFP_Policy();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.NFP_Policy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Policy#getName()
	 * @see #getNFP_Policy()
	 * @generated
	 */
	EAttribute getNFP_Policy_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see org.saferobots.ssml.model.nfp.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.NFP_Attribute <em>NFP Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Attribute</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Attribute
	 * @generated
	 */
	EClass getNFP_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Attribute#getName()
	 * @see #getNFP_Attribute()
	 * @generated
	 */
	EAttribute getNFP_Attribute_Name();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_qualitative <em>Is qualitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is qualitative</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_qualitative()
	 * @see #getNFP_Attribute()
	 * @generated
	 */
	EReference getNFP_Attribute_Is_qualitative();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_quantitative <em>Is quantitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is quantitative</em>'.
	 * @see org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_quantitative()
	 * @see #getNFP_Attribute()
	 * @generated
	 */
	EReference getNFP_Attribute_Is_quantitative();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Quantitative <em>Quantitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative</em>'.
	 * @see org.saferobots.ssml.model.nfp.Quantitative
	 * @generated
	 */
	EClass getQuantitative();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.Quantitative#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.saferobots.ssml.model.nfp.Quantitative#getType()
	 * @see #getQuantitative()
	 * @generated
	 */
	EAttribute getQuantitative_Type();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_unit <em>Has unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has unit</em>'.
	 * @see org.saferobots.ssml.model.nfp.Quantitative#getHas_unit()
	 * @see #getQuantitative()
	 * @generated
	 */
	EReference getQuantitative_Has_unit();

	/**
	 * Returns the meta object for the reference '{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_contraint <em>Has contraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has contraint</em>'.
	 * @see org.saferobots.ssml.model.nfp.Quantitative#getHas_contraint()
	 * @see #getQuantitative()
	 * @generated
	 */
	EReference getQuantitative_Has_contraint();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Qualitative <em>Qualitative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative</em>'.
	 * @see org.saferobots.ssml.model.nfp.Qualitative
	 * @generated
	 */
	EClass getQualitative();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.saferobots.ssml.model.nfp.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Estimated <em>Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Estimated</em>'.
	 * @see org.saferobots.ssml.model.nfp.Estimated
	 * @generated
	 */
	EClass getEstimated();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Measured <em>Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured</em>'.
	 * @see org.saferobots.ssml.model.nfp.Measured
	 * @generated
	 */
	EClass getMeasured();

	/**
	 * Returns the meta object for class '{@link org.saferobots.ssml.model.nfp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.saferobots.ssml.model.nfp.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.saferobots.ssml.model.nfp.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.saferobots.ssml.model.nfp.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for enum '{@link org.saferobots.ssml.model.nfp.Attribute_type <em>Attribute type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute type</em>'.
	 * @see org.saferobots.ssml.model.nfp.Attribute_type
	 * @generated
	 */
	EEnum getAttribute_type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NfpFactory getNfpFactory();

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
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.QoS_PolicyImpl <em>Qo SPolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.QoS_PolicyImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQoS_Policy()
		 * @generated
		 */
		EClass QO_SPOLICY = eINSTANCE.getQoS_Policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QO_SPOLICY__NAME = eINSTANCE.getQoS_Policy_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.NFP_PolicyImpl <em>NFP Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.NFP_PolicyImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getNFP_Policy()
		 * @generated
		 */
		EClass NFP_POLICY = eINSTANCE.getNFP_Policy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_POLICY__NAME = eINSTANCE.getNFP_Policy_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.ContextImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl <em>NFP Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.NFP_AttributeImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getNFP_Attribute()
		 * @generated
		 */
		EClass NFP_ATTRIBUTE = eINSTANCE.getNFP_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_ATTRIBUTE__NAME = eINSTANCE.getNFP_Attribute_Name();

		/**
		 * The meta object literal for the '<em><b>Is qualitative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_ATTRIBUTE__IS_QUALITATIVE = eINSTANCE.getNFP_Attribute_Is_qualitative();

		/**
		 * The meta object literal for the '<em><b>Is quantitative</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFP_ATTRIBUTE__IS_QUANTITATIVE = eINSTANCE.getNFP_Attribute_Is_quantitative();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.QuantitativeImpl <em>Quantitative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.QuantitativeImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQuantitative()
		 * @generated
		 */
		EClass QUANTITATIVE = eINSTANCE.getQuantitative();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE__TYPE = eINSTANCE.getQuantitative_Type();

		/**
		 * The meta object literal for the '<em><b>Has unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITATIVE__HAS_UNIT = eINSTANCE.getQuantitative_Has_unit();

		/**
		 * The meta object literal for the '<em><b>Has contraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITATIVE__HAS_CONTRAINT = eINSTANCE.getQuantitative_Has_contraint();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.QualitativeImpl <em>Qualitative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.QualitativeImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getQualitative()
		 * @generated
		 */
		EClass QUALITATIVE = eINSTANCE.getQualitative();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.UnitImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.EstimatedImpl <em>Estimated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.EstimatedImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getEstimated()
		 * @generated
		 */
		EClass ESTIMATED = eINSTANCE.getEstimated();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.MeasuredImpl <em>Measured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.MeasuredImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getMeasured()
		 * @generated
		 */
		EClass MEASURED = eINSTANCE.getMeasured();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.impl.ConstraintImpl
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '{@link org.saferobots.ssml.model.nfp.Attribute_type <em>Attribute type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.saferobots.ssml.model.nfp.Attribute_type
		 * @see org.saferobots.ssml.model.nfp.impl.NfpPackageImpl#getAttribute_type()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttribute_type();

	}

} //NfpPackage
