package org.saferobots.functionalmodel.editor.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.saferobots.functionalmodel.editor.features.AddConnectorFeature;
import org.saferobots.functionalmodel.editor.features.CreateConnectorFeature;
import org.saferobots.functionalmodel.editor.features.GateAddFeature;
import org.saferobots.functionalmodel.editor.features.DelayGateCreateFeature;
import org.saferobots.functionalmodel.editor.features.GateMoveFeature;
import org.saferobots.functionalmodel.editor.features.GateResizeFeature;
import org.saferobots.functionalmodel.editor.features.PortMoveFeature;
import org.saferobots.functionalmodel.editor.features.PortResizeFeature;
import org.saferobots.functionalmodel.editor.features.SelectorGateCreateFeature;
import org.saferobots.functionalmodel.editor.features.SinkCreateFeature;
import org.saferobots.functionalmodel.editor.features.SourceCreateFeature;
import org.saferobots.functionalmodel.editor.features.SystemAddFeature;
import org.saferobots.functionalmodel.editor.features.SystemCreateFeature;
import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.System;


public class EditorFeatureProvider extends DefaultFeatureProvider {

	public EditorFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new SystemCreateFeature(this), new DelayGateCreateFeature(this), new SelectorGateCreateFeature(this),
				new SourceCreateFeature(this), new SinkCreateFeature(this)};
		}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAddFeature getAddFeature(IAddContext context) {		
		Object bo = context.getNewObject();
	    if (bo instanceof Dispatch_gate) {
				return new GateAddFeature(this);
	    } else if (bo instanceof Connector) {
			return new AddConnectorFeature(this);
		} else if (bo instanceof System) {
			return new SystemAddFeature(this);
		}	    
	    return super.getAddFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if(bo instanceof Dispatch_gate) {
			return new GateResizeFeature(this);
		} else if (bo instanceof Port) {
			return new PortResizeFeature(this);
		}
		return super.getResizeShapeFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if(bo instanceof Dispatch_gate) {
			return new GateMoveFeature(this);
		} else if (bo instanceof Port) {
			return new PortMoveFeature(this);
		}
		return super.getMoveShapeFeature(context);
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[]{new CreateConnectorFeature(this)};
	}	
	
}