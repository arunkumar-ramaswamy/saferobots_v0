/**
 */
package org.saferobots.ssml.model.nfp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.model.nfp.NfpPackage
 * @generated
 */
public interface NfpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfpFactory eINSTANCE = org.saferobots.ssml.model.nfp.impl.NfpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Qo SPolicy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qo SPolicy</em>'.
	 * @generated
	 */
	QoS_Policy createQoS_Policy();

	/**
	 * Returns a new object of class '<em>NFP Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Policy</em>'.
	 * @generated
	 */
	NFP_Policy createNFP_Policy();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>NFP Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFP Attribute</em>'.
	 * @generated
	 */
	NFP_Attribute createNFP_Attribute();

	/**
	 * Returns a new object of class '<em>Quantitative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative</em>'.
	 * @generated
	 */
	Quantitative createQuantitative();

	/**
	 * Returns a new object of class '<em>Qualitative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative</em>'.
	 * @generated
	 */
	Qualitative createQualitative();

	/**
	 * Returns a new object of class '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit</em>'.
	 * @generated
	 */
	Unit createUnit();

	/**
	 * Returns a new object of class '<em>Estimated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Estimated</em>'.
	 * @generated
	 */
	Estimated createEstimated();

	/**
	 * Returns a new object of class '<em>Measured</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measured</em>'.
	 * @generated
	 */
	Measured createMeasured();

	/**
	 * Returns a new object of class '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint</em>'.
	 * @generated
	 */
	Constraint createConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NfpPackage getNfpPackage();

} //NfpFactory
