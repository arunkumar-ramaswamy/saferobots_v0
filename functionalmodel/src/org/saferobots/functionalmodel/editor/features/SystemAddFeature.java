package org.saferobots.functionalmodel.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.System;

public class SystemAddFeature extends AbstractAddShapeFeature {
	

	private static final IColorConstant TEXT_COLOR = IColorConstant.BLACK;
	
	private static final IColorConstant SYSTEM_BACKGROUND = IColorConstant.LIGHT_GREEN;

	private static final IColorConstant SYSTEM_FOREGROUND= IColorConstant.DARK_GREEN;

	public SystemAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		 return context.getNewObject() instanceof System
	                && context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
org.saferobots.ssml.model.ssmlbase.System added_system = (org.saferobots.ssml.model.ssmlbase.System) context.getNewObject();
		
		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(
                context.getTargetContainer(), true);

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        int rect_width = 100;
        int rect_height = 100;
        IGaService gaService = Graphiti.getGaService();
	    RoundedRectangle roundedrectangle; 
	    {
            // create and set graphics algorithm
	    	roundedrectangle = gaService.createPlainRoundedRectangle(containerShape, 5, 5);	    	
	    	roundedrectangle.setBackground(manageColor(SYSTEM_BACKGROUND));
	    	roundedrectangle.setForeground(manageColor(SYSTEM_FOREGROUND));
	      	gaService.setLocationAndSize(roundedrectangle,
            context.getX(), context.getY(), rect_width, rect_height);  
	      	link(containerShape,added_system);
          }
	    // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 0, 20, rect_width, 20 });
            polyline.setForeground(manageColor(SYSTEM_FOREGROUND));
            polyline.setLineWidth(2);
        }
 
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, added_system.getName());
            text.setForeground(manageColor(TEXT_COLOR));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 0, 0, rect_width, 20);
 
            // create link and wire it
            link(shape, added_system);
        }
	    
	    
		return containerShape;
	}

}
