/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dispatch gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_policy <em>Has policy</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_ports <em>Has ports</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getDispatch_gate()
 * @model
 * @generated
 */
public interface Dispatch_gate extends EObject {
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
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getDispatch_gate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getName <em>Name</em>}' attribute.
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
	 * @see #setHas_policy(Dispatch_policy)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getDispatch_gate_Has_policy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dispatch_policy getHas_policy();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getHas_policy <em>Has policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has policy</em>' containment reference.
	 * @see #getHas_policy()
	 * @generated
	 */
	void setHas_policy(Dispatch_policy value);

	/**
	 * Returns the value of the '<em><b>Has ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.ssmlbase.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has ports</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getDispatch_gate_Has_ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getHas_ports();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.saferobots.ssml.model.ssmlbase.gate_type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.ssmlbase.gate_type
	 * @see #setType(gate_type)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getDispatch_gate_Type()
	 * @model
	 * @generated
	 */
	gate_type getType();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.ssmlbase.gate_type
	 * @see #getType()
	 * @generated
	 */
	void setType(gate_type value);

} // Dispatch_gate
