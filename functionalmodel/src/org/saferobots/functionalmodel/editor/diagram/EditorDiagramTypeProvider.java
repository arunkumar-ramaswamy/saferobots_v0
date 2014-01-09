package org.saferobots.functionalmodel.editor.diagram;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.System;

public class EditorDiagramTypeProvider extends AbstractDiagramTypeProvider {
	
	public EditorDiagramTypeProvider() {
		super();
		setFeatureProvider(new EditorFeatureProvider(this));
		
		
		//Creating a Model XMI File
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ssmlbase", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // create a resource
	    Resource res = resSet.createResource(URI
	        .createURI("mymodel.ssmlbase"));
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    System system = SsmlbaseFactory.eINSTANCE.createSystem();
	    system.setName("Turtlebot Robot");
	    res.getContents().add(system);	    		
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/////////////////////////////////////////////////////////
		
	}
	
}
