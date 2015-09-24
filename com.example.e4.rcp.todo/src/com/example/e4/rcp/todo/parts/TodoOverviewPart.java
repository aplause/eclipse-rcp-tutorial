package com.example.e4.rcp.todo.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class TodoOverviewPart {

	@PostConstruct
	public void createControls(Composite parent) {
		System.out.println(this.getClass().getSimpleName() + " @PostConstruct method called.");
	}

	@Inject
	@Optional
	public void receiveActivePart(@Named(IServiceConstants.ACTIVE_PART) MPart activePart) {
		if (null != activePart) {
			System.out.println("Active part changed " + activePart.getLabel());
		}
	}

	@Inject
	@Optional
	public void receiveActiveShell(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		if (null != shell) {
			System.out.println("Active shell (WIndow) changed");
		}
	}
}
