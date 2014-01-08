/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.saferobots.ssml.model.nfp.Context;
import org.saferobots.ssml.model.nfp.QoS_Policy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qo S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.QoS#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.QoS#getElements <em>Elements</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.QoS#getHas_policy <em>Has policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.QoS#getFor_context <em>For context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getQoS()
 * @model
 * @generated
 */
public interface QoS extends EObject {
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
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getQoS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.QoS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.ssmlbase.NFP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getQoS_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NFP> getElements();

	/**
	 * Returns the value of the '<em><b>Has policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has policy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has policy</em>' containment reference.
	 * @see #setHas_policy(QoS_Policy)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getQoS_Has_policy()
	 * @model containment="true"
	 * @generated
	 */
	QoS_Policy getHas_policy();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.QoS#getHas_policy <em>Has policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has policy</em>' containment reference.
	 * @see #getHas_policy()
	 * @generated
	 */
	void setHas_policy(QoS_Policy value);

	/**
	 * Returns the value of the '<em><b>For context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For context</em>' reference.
	 * @see #setFor_context(Context)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getQoS_For_context()
	 * @model
	 * @generated
	 */
	Context getFor_context();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.QoS#getFor_context <em>For context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For context</em>' reference.
	 * @see #getFor_context()
	 * @generated
	 */
	void setFor_context(Context value);

} // QoS
