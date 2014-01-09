package org.saferobots.functionalmodel.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

public class PortMoveFeature extends DefaultMoveShapeFeature {

	public PortMoveFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
