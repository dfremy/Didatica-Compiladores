/*
 * generated by Xtext 2.10.0
 */
grammar InternalEntity;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.EntityGrammarAccess;

}
@parser::members {
	private EntityGrammarAccess grammarAccess;

	public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleexpression
entryRuleexpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleexpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule expression
ruleexpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup()); }
		(rule__Expression__Group__0)
		{ after(grammarAccess.getExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleexpression_unity
entryRuleexpression_unity
:
{ before(grammarAccess.getExpression_unityRule()); }
	 ruleexpression_unity
{ after(grammarAccess.getExpression_unityRule()); } 
	 EOF 
;

// Rule expression_unity
ruleexpression_unity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpression_unityAccess().getAlternatives()); }
		(rule__Expression_unity__Alternatives)
		{ after(grammarAccess.getExpression_unityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleoperator
entryRuleoperator
:
{ before(grammarAccess.getOperatorRule()); }
	 ruleoperator
{ after(grammarAccess.getOperatorRule()); } 
	 EOF 
;

// Rule operator
ruleoperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getGroup_0()); }
		(rule__Expression_unity__Group_0__0)
		{ after(grammarAccess.getExpression_unityAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_unityAccess().getGroup_1()); }
		(rule__Expression_unity__Group_1__0)
		{ after(grammarAccess.getExpression_unityAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getExpression_unityAccess().getValorAssignment_2()); }
		(rule__Expression_unity__ValorAssignment_2)
		{ after(grammarAccess.getExpression_unityAccess().getValorAssignment_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getMaisAssignment_0()); }
		(rule__Operator__MaisAssignment_0)
		{ after(grammarAccess.getOperatorAccess().getMaisAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getMenosAssignment_1()); }
		(rule__Operator__MenosAssignment_1)
		{ after(grammarAccess.getOperatorAccess().getMenosAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getMultAssignment_2()); }
		(rule__Operator__MultAssignment_2)
		{ after(grammarAccess.getOperatorAccess().getMultAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getDivAssignment_3()); }
		(rule__Operator__DivAssignment_3)
		{ after(grammarAccess.getOperatorAccess().getDivAssignment_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressao_unAssignment_0()); }
	(rule__Expression__Expressao_unAssignment_0)
	{ after(grammarAccess.getExpressionAccess().getExpressao_unAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getGroup_1()); }
	(rule__Expression__Group_1__0)?
	{ after(grammarAccess.getExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__0__Impl
	rule__Expression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getOperadorAssignment_1_0()); }
	(rule__Expression__OperadorAssignment_1_0)
	{ after(grammarAccess.getExpressionAccess().getOperadorAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressaoAssignment_1_1()); }
	(rule__Expression__ExpressaoAssignment_1_1)
	{ after(grammarAccess.getExpressionAccess().getExpressaoAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression_unity__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression_unity__Group_0__0__Impl
	rule__Expression_unity__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpression_unityAccess().getMenosAssignment_0_0()); }
	(rule__Expression_unity__MenosAssignment_0_0)
	{ after(grammarAccess.getExpression_unityAccess().getMenosAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression_unity__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpression_unityAccess().getExpressao_unAssignment_0_1()); }
	(rule__Expression_unity__Expressao_unAssignment_0_1)
	{ after(grammarAccess.getExpression_unityAccess().getExpressao_unAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression_unity__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression_unity__Group_1__0__Impl
	rule__Expression_unity__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpression_unityAccess().getAbre_parenAssignment_1_0()); }
	(rule__Expression_unity__Abre_parenAssignment_1_0)
	{ after(grammarAccess.getExpression_unityAccess().getAbre_parenAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression_unity__Group_1__1__Impl
	rule__Expression_unity__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpression_unityAccess().getExpressaoAssignment_1_1()); }
	(rule__Expression_unity__ExpressaoAssignment_1_1)
	{ after(grammarAccess.getExpression_unityAccess().getExpressaoAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression_unity__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpression_unityAccess().getFecha_parenAssignment_1_2()); }
	(rule__Expression_unity__Fecha_parenAssignment_1_2)
	{ after(grammarAccess.getExpression_unityAccess().getFecha_parenAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsExpressionParserRuleCall_0()); }
		ruleexpression
		{ after(grammarAccess.getModelAccess().getElementsExpressionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Expressao_unAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpressao_unExpression_unityParserRuleCall_0_0()); }
		ruleexpression_unity
		{ after(grammarAccess.getExpressionAccess().getExpressao_unExpression_unityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__OperadorAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getOperadorOperatorParserRuleCall_1_0_0()); }
		ruleoperator
		{ after(grammarAccess.getExpressionAccess().getOperadorOperatorParserRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ExpressaoAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getExpressaoExpressionParserRuleCall_1_1_0()); }
		ruleexpression
		{ after(grammarAccess.getExpressionAccess().getExpressaoExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__MenosAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getMenosMINUSTerminalRuleCall_0_0_0()); }
		RULE_MINUS
		{ after(grammarAccess.getExpression_unityAccess().getMenosMINUSTerminalRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Expressao_unAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getExpressao_unExpression_unityParserRuleCall_0_1_0()); }
		ruleexpression_unity
		{ after(grammarAccess.getExpression_unityAccess().getExpressao_unExpression_unityParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Abre_parenAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getAbre_parenLPARENTerminalRuleCall_1_0_0()); }
		RULE_LPAREN
		{ after(grammarAccess.getExpression_unityAccess().getAbre_parenLPARENTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__ExpressaoAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getExpressaoExpressionParserRuleCall_1_1_0()); }
		ruleexpression
		{ after(grammarAccess.getExpression_unityAccess().getExpressaoExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__Fecha_parenAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getFecha_parenRPARENTerminalRuleCall_1_2_0()); }
		RULE_RPAREN
		{ after(grammarAccess.getExpression_unityAccess().getFecha_parenRPARENTerminalRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression_unity__ValorAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpression_unityAccess().getValorINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getExpression_unityAccess().getValorINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__MaisAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getMaisPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getOperatorAccess().getMaisPLUSTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__MenosAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getMenosMINUSTerminalRuleCall_1_0()); }
		RULE_MINUS
		{ after(grammarAccess.getOperatorAccess().getMenosMINUSTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__MultAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getMultMULTTerminalRuleCall_2_0()); }
		RULE_MULT
		{ after(grammarAccess.getOperatorAccess().getMultMULTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__DivAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getDivDIVTerminalRuleCall_3_0()); }
		RULE_DIV
		{ after(grammarAccess.getOperatorAccess().getDivDIVTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_MINUS : '-';

RULE_PLUS : '+';

RULE_DIV : '/';

RULE_MULT : '*';

RULE_LPAREN : '(';

RULE_RPAREN : ')';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;