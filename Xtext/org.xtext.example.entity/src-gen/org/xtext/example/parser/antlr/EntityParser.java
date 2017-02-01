/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.parser.antlr.internal.InternalEntityParser;
import org.xtext.example.services.EntityGrammarAccess;

public class EntityParser extends AbstractAntlrParser {

	@Inject
	private EntityGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEntityParser createParser(XtextTokenStream stream) {
		return new InternalEntityParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public EntityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}