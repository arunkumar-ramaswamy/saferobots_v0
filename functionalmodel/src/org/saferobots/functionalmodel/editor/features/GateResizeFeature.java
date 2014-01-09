package org.saferobots.functionalmodel.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

public class GateResizeFeature extends DefaultResizeShapeFeature {

	public GateResizeFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
