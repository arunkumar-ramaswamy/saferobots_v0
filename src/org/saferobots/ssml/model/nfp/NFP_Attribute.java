/**
 */
package org.saferobots.ssml.model.nfp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_qualitative <em>Is qualitative</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_quantitative <em>Is quantitative</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.nfp.NfpPackage#getNFP_Attribute()
 * @model
 * @generated
 */
public interface NFP_Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getNFP_Attribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is qualitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is qualitative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is qualitative</em>' reference.
	 * @see #setIs_qualitative(Quantitative)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getNFP_Attribute_Is_qualitative()
	 * @model
	 * @generated
	 */
	Quantitative getIs_qualitative();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_qualitative <em>Is qualitative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is qualitative</em>' reference.
	 * @see #getIs_qualitative()
	 * @generated
	 */
	void setIs_qualitative(Quantitative value);

	/**
	 * Returns the value of the '<em><b>Is quantitative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is quantitative</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is quantitative</em>' reference.
	 * @see #setIs_quantitative(Qualitative)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getNFP_Attribute_Is_quantitative()
	 * @model
	 * @generated
	 */
	Qualitative getIs_quantitative();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.NFP_Attribute#getIs_quantitative <em>Is quantitative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is quantitative</em>' reference.
	 * @see #getIs_quantitative()
	 * @generated
	 */
	void setIs_quantitative(Qualitative value);

} // NFP_Attribute
