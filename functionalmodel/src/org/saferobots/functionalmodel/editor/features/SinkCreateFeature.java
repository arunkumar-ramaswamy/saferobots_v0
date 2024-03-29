package org.saferobots.functionalmodel.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.functionalmodel.editor.utilities.Utilities;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.System;
import org.saferobots.ssml.model.ssmlbase.gate_type;
import org.saferobots.ssml.model.ssmlbase.port_type;

public class SinkCreateFeature extends AbstractCreateFeature {

	public SinkCreateFeature(IFeatureProvider fp) {
		super(fp, "Sink", "Create a sink");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		Diagram diagram = getDiagram();
		SsmlbaseFactory factory = SsmlbaseFactory.eINSTANCE;	
		Dispatch_gate newgate = factory.createDispatch_gate();
		newgate.setType(gate_type.SINK);
		Port out_port = factory.createPort();
		out_port.setType(port_type.IN);
		newgate.getHas_ports().add(out_port);
		newgate.setName("Sink");

		System system = (System) Utilities.getRootDomainObject(diagram);
		system.getHas_gates().add(newgate);
				
		addGraphicalRepresentation(context, newgate);
		return new Object[] {newgate};
	}

}
