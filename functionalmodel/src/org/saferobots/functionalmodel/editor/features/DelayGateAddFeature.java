package org.saferobots.functionalmodel.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;
import org.saferobots.ssml.model.ssmlbase.Port;

public class DelayGateAddFeature extends AbstractAddShapeFeature {
	
	private static final IColorConstant GATE_TEXT_FOREGROUND =
	        IColorConstant.BLACK;
	 
	private static final IColorConstant GATE_FOREGROUND =
	        new ColorConstant(98, 131, 167);

	private static final IColorConstant GATE_BACKGROUND =
	        new ColorConstant(187, 218, 247);
	
	private static final IColorConstant PORT_BACKGROUND =
	        IColorConstant.ORANGE;
	

	

	public DelayGateAddFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		 return context.getNewObject() instanceof Dispatch_gate
	                && context.getTargetContainer() instanceof Diagram;
	}
	

	@Override
	public PictogramElement add(IAddContext context) {
		Dispatch_gate addedgate = (Dispatch_gate) context.getNewObject();
		Port in_port = (Port) addedgate.getHas_ports().get(0);
		Port out_port = (Port) addedgate.getHas_ports().get(1);
		ContainerShape containerShape = Graphiti.getPeCreateService().createContainerShape(
                context.getTargetContainer(), true);

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
		
        int cont_width=75;
        int cont_height=130;
		int gate_width = 25;
	 	int gate_height = 100; 
	 	int port_width = 20;
	    IGaService gaService = Graphiti.getGaService();
	    Rectangle container_rectangle; 
	    {
            // create and set graphics algorithm
	    	container_rectangle = gaService.createRectangle(containerShape);
	    	container_rectangle.setFilled(false);
	    	container_rectangle.setLineVisible(false);
	      	gaService.setLocationAndSize(container_rectangle,
            context.getX(), context.getY(), cont_width, cont_height);  
          }
    
	    //gate
	    
	    {
	    	Shape shape = peCreateService.createShape(containerShape,true);
	    	Rectangle rectangle = gaService.createRectangle(shape);
	    	rectangle.setBackground(manageColor(GATE_BACKGROUND));
	    	rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(rectangle,
		    		port_width, 0, gate_width, gate_height);
		    link(shape, addedgate);
	    }
  
	    Rectangle out_rectangle;
        //out port
	    {
	    	Shape shape = peCreateService.createShape(containerShape,true);
	    	out_rectangle = gaService.createRectangle(shape);
	    	out_rectangle.setBackground(manageColor(PORT_BACKGROUND));
	    	out_rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(out_rectangle,
		    		gate_width+port_width, gate_height/2-port_width/2, port_width, port_width);
		    link(shape,out_port);
		    peCreateService.createChopboxAnchor(shape);

	    //create anchor
		 /*   BoxRelativeAnchor anchor = peCreateService.createBoxRelativeAnchor(shape);
		    anchor.setRelativeWidth(1);
		    anchor.setRelativeWidth(0.5);
		    anchor.setReferencedGraphicsAlgorithm(out_rectangle);
		    final Ellipse ellipse = gaService.createPlainEllipse(anchor);
		    gaService.setLocationAndSize(ellipse, 0, 0, 20, 20);	*/    
		    
	    }
	    
        //in port
	    {
	    	Shape shape = peCreateService.createShape(containerShape,true);
	    	Rectangle rectangle = gaService.createRectangle(shape);
	    	rectangle.setBackground(manageColor(PORT_BACKGROUND));
	    	rectangle.setForeground(manageColor(GATE_FOREGROUND));
		    gaService.setLocationAndSize(rectangle,
		    		0, gate_height/2-port_width/2, port_width, port_width);
		    link(shape,in_port);
		    peCreateService.createChopboxAnchor(shape);
	    }
	      //text
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
             // create and set text graphics algorithm
            Text text = gaService.createText(shape, "Delay");
            text.setForeground(manageColor(GATE_TEXT_FOREGROUND));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
            // vertical alignment has as default value "center"
            text.setFont(manageFont(getDiagram(),"Ariel", 10));
            gaService.setLocationAndSize(text,10,gate_height-10,50, 50);
 
        }        
         
        return containerShape;
	}

}
