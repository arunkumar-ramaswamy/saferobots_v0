package org.saferobots.functionalmodel.editor.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
import org.saferobots.ssml.model.ssmlbase.Dispatch_gate;

public class GateFilter extends AbstractPropertySectionFilter {

	@Override
	protected boolean accept(PictogramElement pictogramElement) {
		EObject eObject =Graphiti.getLinkService()
	            .getBusinessObjectForLinkedPictogramElement(pictogramElement);
	        if (eObject instanceof Dispatch_gate) {
	            return true;
	        }
		return false;
	}

}
