package org.saferobots.functionalmodel.editor.features;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.saferobots.functionalmodel.editor.utilities.Utilities;
import org.saferobots.ssml.model.ssmlbase.Connector;
import org.saferobots.ssml.model.ssmlbase.Port;
import org.saferobots.ssml.model.ssmlbase.SsmlbaseFactory;
import org.saferobots.ssml.model.ssmlbase.System;

public class CreateConnectorFeature extends AbstractCreateConnectionFeature {

	public CreateConnectorFeature(IFeatureProvider fp) {
		super(fp, "Connector", "Add a Connector");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
        Port source = getPort(context.getSourceAnchor());
        Port target = getPort(context.getTargetAnchor());
        if (source != null && target != null && source != target) {
            return true;
        }
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
        Connection newConnection = null;
        
        // get EClasses which should be connected
        Port source = getPort(context.getSourceAnchor());
        Port target = getPort(context.getTargetAnchor());
 
        if (source != null && target != null) {
            // create new business object 
            Connector connector = createConnector(source, target);
           
            // add connection for business object
            AddConnectionContext addContext =
                new AddConnectionContext(context.getSourceAnchor(), context
                    .getTargetAnchor());
            addContext.setNewObject(connector);
            newConnection =
               (Connection) getFeatureProvider().addIfPossible(addContext);
            ((System)Utilities.getRootDomainObject(getDiagram())).getHas_connectors().add(connector);            
        }
        
        return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
	    if (getPort(context.getSourceAnchor()) != null) {
	          return true;
	     }
		return false;
	}
	
    private Port getPort(Anchor anchor) {
        if (anchor != null) {
            Object object =
                getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof Port) {
                return (Port) object;
            }
        }
        return null;
    }
    
    private Connector createConnector(Port source, Port target) {
    	Connector connector = SsmlbaseFactory.eINSTANCE.createConnector();
    	connector.setName("new connector");
    	connector.setIn_port(target);
    	connector.setOut_port(source);;
        return connector;
   }

}
