package org.saferobots.functionalmodel.editor.features;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.SsmlbasePackage;
import org.saferobots.ssml.model.ssmlbase.System;
import org.saferobots.ssml.model.ssmlbase.gate_type;
import org.saferobots.ssml.model.ssmlbase.port_type;

public class DelayGateCreateFeature extends AbstractCreateFeature {

	public DelayGateCreateFeature(IFeatureProvider fp) {
		super(fp, "Delay Gate", "Create a delay gate");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Resource diagram_resource = context.getTargetContainer().eResource();
		
		
		SsmlbasePackage.eINSTANCE.eClass();
		SsmlbaseFactory factory = SsmlbaseFactory.eINSTANCE;
		
		Dispatch_gate newgate = factory.createDispatch_gate();
		newgate.setType(gate_type.DELAY);
		Port in_port = factory.createPort();
		in_port.setType(port_type.IN);;
		Port out_port = factory.createPort();
		out_port.setType(port_type.OUT);
		newgate.getHas_ports().add(in_port);
		newgate.getHas_ports().add(out_port);
		
	
		/////////////////.
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ssmlbase", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource res = resSet.getResource(URI.createURI("mymodel.ssmlbase"),true);
   	    System sys = (System) res.getContents().get(0);
	    sys.getHas_gates().add(newgate);
			
		try {
			res.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System system;
		boolean gateadded = false;
		for(EObject ob: diagram_resource.getContents())
		{ 
			if(ob instanceof System)
			{
				system = (System) ob;
				system.getHas_gates().add(newgate);
				gateadded = true;
			}	
		};
		if(!gateadded)
			java.lang.System.out.println("System Object not found: gate not added");
		
		java.lang.System.out.println(getDiagram().getDiagramTypeId());
		addGraphicalRepresentation(context, newgate);
		return new Object[] {newgate};
	}

}
