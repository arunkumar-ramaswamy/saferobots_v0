/**
 */
package org.saferobots.ssml.model.nfp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.nfp.Quantitative#getType <em>Type</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_unit <em>Has unit</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_contraint <em>Has contraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.nfp.NfpPackage#getQuantitative()
 * @model
 * @generated
 */
public interface Quantitative extends NFP_Attribute {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.saferobots.ssml.model.nfp.Attribute_type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.nfp.Attribute_type
	 * @see #setType(Attribute_type)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getQuantitative_Type()
	 * @model
	 * @generated
	 */
	Attribute_type getType();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.Quantitative#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.nfp.Attribute_type
	 * @see #getType()
	 * @generated
	 */
	void setType(Attribute_type value);

	/**
	 * Returns the value of the '<em><b>Has unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has unit</em>' reference.
	 * @see #setHas_unit(Unit)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getQuantitative_Has_unit()
	 * @model
	 * @generated
	 */
	Unit getHas_unit();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_unit <em>Has unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has unit</em>' reference.
	 * @see #getHas_unit()
	 * @generated
	 */
	void setHas_unit(Unit value);

	/**
	 * Returns the value of the '<em><b>Has contraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has contraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has contraint</em>' reference.
	 * @see #setHas_contraint(Constraint)
	 * @see org.saferobots.ssml.model.nfp.NfpPackage#getQuantitative_Has_contraint()
	 * @model
	 * @generated
	 */
	Constraint getHas_contraint();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.nfp.Quantitative#getHas_contraint <em>Has contraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has contraint</em>' reference.
	 * @see #getHas_contraint()
	 * @generated
	 */
	void setHas_contraint(Constraint value);

} // Quantitative
