/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalEntityParser;
import org.xtext.example.services.EntityGrammarAccess;

public class EntityParser extends AbstractContentAssistParser {

	@Inject
	private EntityGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEntityParser createParser() {
		InternalEntityParser result = new InternalEntityParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExpression_unityAccess().getAlternatives(), "rule__Expression_unity__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
					put(grammarAccess.getExpression_unityAccess().getGroup_0(), "rule__Expression_unity__Group_0__0");
					put(grammarAccess.getExpression_unityAccess().getGroup_1(), "rule__Expression_unity__Group_1__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getExpressionAccess().getExpressao_unAssignment_0(), "rule__Expression__Expressao_unAssignment_0");
					put(grammarAccess.getExpressionAccess().getOperadorAssignment_1_0(), "rule__Expression__OperadorAssignment_1_0");
					put(grammarAccess.getExpressionAccess().getExpressaoAssignment_1_1(), "rule__Expression__ExpressaoAssignment_1_1");
					put(grammarAccess.getExpression_unityAccess().getMenosAssignment_0_0(), "rule__Expression_unity__MenosAssignment_0_0");
					put(grammarAccess.getExpression_unityAccess().getExpressao_unAssignment_0_1(), "rule__Expression_unity__Expressao_unAssignment_0_1");
					put(grammarAccess.getExpression_unityAccess().getAbre_parenAssignment_1_0(), "rule__Expression_unity__Abre_parenAssignment_1_0");
					put(grammarAccess.getExpression_unityAccess().getExpressaoAssignment_1_1(), "rule__Expression_unity__ExpressaoAssignment_1_1");
					put(grammarAccess.getExpression_unityAccess().getFecha_parenAssignment_1_2(), "rule__Expression_unity__Fecha_parenAssignment_1_2");
					put(grammarAccess.getExpression_unityAccess().getValorAssignment_2(), "rule__Expression_unity__ValorAssignment_2");
					put(grammarAccess.getOperatorAccess().getMaisAssignment_0(), "rule__Operator__MaisAssignment_0");
					put(grammarAccess.getOperatorAccess().getMenosAssignment_1(), "rule__Operator__MenosAssignment_1");
					put(grammarAccess.getOperatorAccess().getMultAssignment_2(), "rule__Operator__MultAssignment_2");
					put(grammarAccess.getOperatorAccess().getDivAssignment_3(), "rule__Operator__DivAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEntityParser typedParser = (InternalEntityParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EntityGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
