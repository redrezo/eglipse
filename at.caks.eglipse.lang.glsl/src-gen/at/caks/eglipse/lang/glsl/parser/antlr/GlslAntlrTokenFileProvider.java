/*
* generated by Xtext
*/
package at.caks.eglipse.lang.glsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GlslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("at/caks/eglipse/lang/glsl/parser/antlr/internal/InternalGlsl.tokens");
	}
}
