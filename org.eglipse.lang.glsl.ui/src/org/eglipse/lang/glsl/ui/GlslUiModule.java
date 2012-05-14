/*
 * generated by Xtext
 */
package org.eglipse.lang.glsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eglipse.lang.glsl.highlight.GLSLAntlrTokenToAttributeIdMapper;
import org.eglipse.lang.glsl.highlight.GLSLHighlightingConfiguration;


import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GlslUiModule extends org.eglipse.lang.glsl.ui.AbstractGlslUiModule {
	public GlslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		
		binder.bind(IHighlightingConfiguration.class).to(GLSLHighlightingConfiguration.class);
		binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(GLSLAntlrTokenToAttributeIdMapper.class);
		
		super.configure(binder);
	}
}
