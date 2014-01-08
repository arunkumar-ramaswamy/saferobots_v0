/**
 */
package org.saferobots.ssml.model.nfp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.saferobots.ssml.model.nfp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.saferobots.ssml.model.nfp.NfpPackage
 * @generated
 */
public class NfpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NfpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NfpPackage.eINSTANCE;
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
	protected NfpSwitch<Adapter> modelSwitch =
		new NfpSwitch<Adapter>() {
			@Override
			public Adapter caseQoS_Policy(QoS_Policy object) {
				return createQoS_PolicyAdapter();
			}
			@Override
			public Adapter caseNFP_Policy(NFP_Policy object) {
				return createNFP_PolicyAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseNFP_Attribute(NFP_Attribute object) {
				return createNFP_AttributeAdapter();
			}
			@Override
			public Adapter caseQuantitative(Quantitative object) {
				return createQuantitativeAdapter();
			}
			@Override
			public Adapter caseQualitative(Qualitative object) {
				return createQualitativeAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseEstimated(Estimated object) {
				return createEstimatedAdapter();
			}
			@Override
			public Adapter caseMeasured(Measured object) {
				return createMeasuredAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.QoS_Policy <em>Qo SPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.QoS_Policy
	 * @generated
	 */
	public Adapter createQoS_PolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.NFP_Policy <em>NFP Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.NFP_Policy
	 * @generated
	 */
	public Adapter createNFP_PolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.NFP_Attribute <em>NFP Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.NFP_Attribute
	 * @generated
	 */
	public Adapter createNFP_AttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Quantitative <em>Quantitative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Quantitative
	 * @generated
	 */
	public Adapter createQuantitativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Qualitative <em>Qualitative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Qualitative
	 * @generated
	 */
	public Adapter createQualitativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Estimated <em>Estimated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Estimated
	 * @generated
	 */
	public Adapter createEstimatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Measured <em>Measured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Measured
	 * @generated
	 */
	public Adapter createMeasuredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.saferobots.ssml.model.nfp.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.saferobots.ssml.model.nfp.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
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

} //NfpAdapterFactory
