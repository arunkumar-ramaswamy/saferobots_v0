/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.saferobots.ssml.model.nfp.NFP_Attribute;
import org.saferobots.ssml.model.nfp.NFP_Policy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.NFP#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.NFP#getHas_policy <em>Has policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.NFP#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getNFP()
 * @model
 * @generated
 */
public interface NFP extends EObject {
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
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getNFP_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.NFP#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has policy</em>' containment reference.
	 * @see #setHas_policy(NFP_Policy)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getNFP_Has_policy()
	 * @model containment="true"
	 * @generated
	 */
	NFP_Policy getHas_policy();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.NFP#getHas_policy <em>Has policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has policy</em>' containment reference.
	 * @see #getHas_policy()
	 * @generated
	 */
	void setHas_policy(NFP_Policy value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.nfp.NFP_Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getNFP_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NFP_Attribute> getAttributes();

} // NFP
