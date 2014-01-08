/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.System#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.System#getHas_gates <em>Has gates</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.System#getHas_connectors <em>Has connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has gates</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has gates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has gates</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getSystem_Has_gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dispatch_gate> getHas_gates();

	/**
	 * Returns the value of the '<em><b>Has connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.ssmlbase.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has connectors</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getSystem_Has_connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getHas_connectors();

} // System
