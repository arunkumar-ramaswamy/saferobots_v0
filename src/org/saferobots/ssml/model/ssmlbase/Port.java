/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Port#getType <em>Type</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Port#getContain_ports <em>Contain ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.saferobots.ssml.model.ssmlbase.port_type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.ssmlbase.port_type
	 * @see #setType(port_type)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getPort_Type()
	 * @model
	 * @generated
	 */
	port_type getType();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.saferobots.ssml.model.ssmlbase.port_type
	 * @see #getType()
	 * @generated
	 */
	void setType(port_type value);

	/**
	 * Returns the value of the '<em><b>Contain ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.saferobots.ssml.model.ssmlbase.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contain ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contain ports</em>' containment reference list.
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getPort_Contain_ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getContain_ports();

} // Port
