/**
 */
package org.saferobots.ssml.model.ssmlbase;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_QoS <em>Has Qo S</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Connector#getIn_port <em>In port</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Connector#getOut_port <em>Out port</em>}</li>
 *   <li>{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_NFP <em>Has NFP</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject {
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
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Connector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Qo S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Qo S</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Qo S</em>' containment reference.
	 * @see #setHas_QoS(QoS)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector_Has_QoS()
	 * @model containment="true"
	 * @generated
	 */
	QoS getHas_QoS();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_QoS <em>Has Qo S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Qo S</em>' containment reference.
	 * @see #getHas_QoS()
	 * @generated
	 */
	void setHas_QoS(QoS value);

	/**
	 * Returns the value of the '<em><b>In port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In port</em>' reference.
	 * @see #setIn_port(Port)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector_In_port()
	 * @model required="true"
	 * @generated
	 */
	Port getIn_port();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Connector#getIn_port <em>In port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In port</em>' reference.
	 * @see #getIn_port()
	 * @generated
	 */
	void setIn_port(Port value);

	/**
	 * Returns the value of the '<em><b>Out port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out port</em>' reference.
	 * @see #setOut_port(Port)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector_Out_port()
	 * @model required="true"
	 * @generated
	 */
	Port getOut_port();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Connector#getOut_port <em>Out port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out port</em>' reference.
	 * @see #getOut_port()
	 * @generated
	 */
	void setOut_port(Port value);

	/**
	 * Returns the value of the '<em><b>Has NFP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has NFP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has NFP</em>' containment reference.
	 * @see #setHas_NFP(NFP)
	 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage#getConnector_Has_NFP()
	 * @model containment="true"
	 * @generated
	 */
	NFP getHas_NFP();

	/**
	 * Sets the value of the '{@link org.saferobots.ssml.model.ssmlbase.Connector#getHas_NFP <em>Has NFP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has NFP</em>' containment reference.
	 * @see #getHas_NFP()
	 * @generated
	 */
	void setHas_NFP(NFP value);

} // Connector
