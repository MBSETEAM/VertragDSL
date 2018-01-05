/*
 * generated by Xtext 2.12.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
		{ before(grammarAccess.getModelAccess().getVertragsAssignment()); }
		(rule__Model__VertragsAssignment)*
		{ after(grammarAccess.getModelAccess().getVertragsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVertrag
entryRuleVertrag
:
{ before(grammarAccess.getVertragRule()); }
	 ruleVertrag
{ after(grammarAccess.getVertragRule()); } 
	 EOF 
;

// Rule Vertrag
ruleVertrag 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVertragAccess().getUnorderedGroup()); }
		(rule__Vertrag__UnorderedGroup)
		{ after(grammarAccess.getVertragAccess().getUnorderedGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__0__Impl
	rule__Vertrag__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getVertragKeyword_0_0()); }
	'Vertrag'
	{ after(grammarAccess.getVertragAccess().getVertragKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__1__Impl
	rule__Vertrag__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNameAssignment_0_1()); }
	(rule__Vertrag__NameAssignment_0_1)
	{ after(grammarAccess.getVertragAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__2__Impl
	rule__Vertrag__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2()); }
	'{'
	{ after(grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getGroup_0_3()); }
	(rule__Vertrag__Group_0_3__0)*
	{ after(grammarAccess.getVertragAccess().getGroup_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0_3__0__Impl
	rule__Vertrag__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_0_3_0()); }
	'mindestvertragslaufzeit'
	{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitAssignment_0_3_1()); }
	(rule__Vertrag__MindestvertragslaufzeitAssignment_0_3_1)
	{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitAssignment_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_1__0__Impl
	rule__Vertrag__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getDatenvolumenKeyword_1_0()); }
	'datenvolumen'
	{ after(grammarAccess.getVertragAccess().getDatenvolumenKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getDatenvolumenAssignment_1_1()); }
	(rule__Vertrag__DatenvolumenAssignment_1_1)
	{ after(grammarAccess.getVertragAccess().getDatenvolumenAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_2__0__Impl
	rule__Vertrag__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0()); }
	'monatl_kosten'
	{ after(grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getMonatl_kostenAssignment_2_1()); }
	(rule__Vertrag__Monatl_kostenAssignment_2_1)
	{ after(grammarAccess.getVertragAccess().getMonatl_kostenAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_3__0__Impl
	rule__Vertrag__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0()); }
	'netzanbieter'
	{ after(grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getNetzanbieterAssignment_3_1()); }
	(rule__Vertrag__NetzanbieterAssignment_3_1)
	{ after(grammarAccess.getVertragAccess().getNetzanbieterAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_4__0__Impl
	rule__Vertrag__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getInternetseiteKeyword_4_0()); }
	'internetseite'
	{ after(grammarAccess.getVertragAccess().getInternetseiteKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVertragAccess().getInternetseiteAssignment_4_1()); }
	(rule__Vertrag__InternetseiteAssignment_4_1)
	{ after(grammarAccess.getVertragAccess().getInternetseiteAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Vertrag__UnorderedGroup
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
	}
:
	rule__Vertrag__UnorderedGroup__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getVertragAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getVertragAccess().getGroup_0()); }
					(rule__Vertrag__Group_0__0)
					{ after(grammarAccess.getVertragAccess().getGroup_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_1()); }
						(rule__Vertrag__Group_1__0)
						{ after(grammarAccess.getVertragAccess().getGroup_1()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_1()); }
						((rule__Vertrag__Group_1__0)=>rule__Vertrag__Group_1__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_1()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_2()); }
						(rule__Vertrag__Group_2__0)
						{ after(grammarAccess.getVertragAccess().getGroup_2()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_2()); }
						((rule__Vertrag__Group_2__0)=>rule__Vertrag__Group_2__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_2()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_3()); }
						(rule__Vertrag__Group_3__0)
						{ after(grammarAccess.getVertragAccess().getGroup_3()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_3()); }
						((rule__Vertrag__Group_3__0)=>rule__Vertrag__Group_3__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_3()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getVertragAccess().getGroup_4()); }
						(rule__Vertrag__Group_4__0)
						{ after(grammarAccess.getVertragAccess().getGroup_4()); }
					)
					(
						{ before(grammarAccess.getVertragAccess().getGroup_4()); }
						((rule__Vertrag__Group_4__0)=>rule__Vertrag__Group_4__0)*
						{ after(grammarAccess.getVertragAccess().getGroup_4()); }
					)
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 5);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_5()); }
					('}')
					{ after(grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_5()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
	rule__Vertrag__UnorderedGroup__5?
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__UnorderedGroup__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Vertrag__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__VertragsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVertragsVertragParserRuleCall_0()); }
		ruleVertrag
		{ after(grammarAccess.getModelAccess().getVertragsVertragParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVertragAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__MindestvertragslaufzeitAssignment_0_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVertragAccess().getMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__DatenvolumenAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getDatenvolumenINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getVertragAccess().getDatenvolumenINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__Monatl_kostenAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getMonatl_kostenFLOATTerminalRuleCall_2_1_0()); }
		RULE_FLOAT
		{ after(grammarAccess.getVertragAccess().getMonatl_kostenFLOATTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__NetzanbieterAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getNetzanbieterIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVertragAccess().getNetzanbieterIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Vertrag__InternetseiteAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVertragAccess().getInternetseiteIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVertragAccess().getInternetseiteIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_FLOAT : RULE_INT '.' RULE_INT;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
