/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.statesml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StateSystemAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("at/ac/tuwien/big/statesml/parser/antlr/internal/InternalStateSystem.tokens");
	}
}
