package org.saferobots.functionalmodel.editor.features;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.saferobots.functionalmodel.editor.utilities.Utilities;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.System;

public class SystemCreateFeature extends AbstractCreateFeature {

	public SystemCreateFeature(IFeatureProvider fp) {
		super(fp, "System", "Add a System");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		System system = SsmlbaseFactory.eINSTANCE.createSystem();
		system.setName("Turtle Bot");

		try {
						try {
							Utilities.saveToModelFile(system, getDiagram());
							} catch (IOException e) {
							e.printStackTrace();
					}
					} catch (CoreException e) {
						e.printStackTrace();
					}

		addGraphicalRepresentation(context, system);
		return new Object[] {system};
	}

}
