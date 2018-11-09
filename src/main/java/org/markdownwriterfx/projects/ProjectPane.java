/*
 * Copyright (c) 2018 Karl Tauber <karl at jformdesigner dot com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.markdownwriterfx.projects;

import javafx.scene.Node;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * The project pane.
 *
 * @author Karl Tauber
 */
public class ProjectPane
{
	private final VBox pane;
	private final ProjectsComboBox projectsComboBox;
	private final ProjectFileTreeView fileTreeView;

	public ProjectPane() {
		projectsComboBox = new ProjectsComboBox();
		fileTreeView = new ProjectFileTreeView();

		pane = new VBox(projectsComboBox, fileTreeView);
		pane.getStyleClass().add("project-pane");

		VBox.setVgrow(projectsComboBox, Priority.NEVER);
		VBox.setVgrow(fileTreeView, Priority.ALWAYS);
	}

	public Node getNode() {
		return pane;
	}
}
