/**
 */
package org.saferobots.ssml.model.ssmlbase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Dispatch_policy;
import org.saferobots.ssml.model.ssmlbase.NFP;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.QoS;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.model.ssmlbase.SsmlbasePackage
 * @generated
 */
public class SsmlbaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SsmlbasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SsmlbaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SsmlbasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SsmlbaseSwitch<Adapter> modelSwitch =
		new SsmlbaseSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(org.saferobots.ssml.model.ssmlbase.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseDispatch_gate(Dispatch_gate object) {
				return createDispatch_gateAdapter();
			}
			@Override
			public Adapter caseDispatch_policy(Dispatch_policy object) {
				return createDispatch_policyAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseNFP(NFP object) {
				return createNFPAdapter();
			}
			@Override
			public Adapter caseQoS(QoS object) {
				return createQoSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_gate <em>Dispatch gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_gate
	 * @generated
	 */
	public Adapter createDispatch_gateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.Dispatch_policy <em>Dispatch policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.Dispatch_policy
	 * @generated
	 */
	public Adapter createDispatch_policyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.NFP <em>NFP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.NFP
	 * @generated
	 */
	public Adapter createNFPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.ssmlbase.QoS <em>Qo S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.ssmlbase.QoS
	 * @generated
	 */
	public Adapter createQoSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SsmlbaseAdapterFactory
