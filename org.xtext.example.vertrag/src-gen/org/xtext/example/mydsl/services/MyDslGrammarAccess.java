/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Model");
		private final Assignment cVertragsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVertragsVertragParserRuleCall_0 = (RuleCall)cVertragsAssignment.eContents().get(0);
		
		//Model:
		//	vertrags+=Vertrag*;
		@Override public ParserRule getRule() { return rule; }
		
		//vertrags+=Vertrag*
		public Assignment getVertragsAssignment() { return cVertragsAssignment; }
		
		//Vertrag
		public RuleCall getVertragsVertragParserRuleCall_0() { return cVertragsVertragParserRuleCall_0; }
	}
	public class VertragElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Vertrag");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cUnorderedGroup.eContents().get(0);
		private final Keyword cVertragKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Keyword cMindestvertragslaufzeitKeyword_0_3_0 = (Keyword)cGroup_0_3.eContents().get(0);
		private final Assignment cMindestvertragslaufzeitAssignment_0_3_1 = (Assignment)cGroup_0_3.eContents().get(1);
		private final RuleCall cMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0 = (RuleCall)cMindestvertragslaufzeitAssignment_0_3_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cUnorderedGroup.eContents().get(1);
		private final Keyword cDatenvolumenKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cDatenvolumenAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cDatenvolumenINTTerminalRuleCall_1_1_0 = (RuleCall)cDatenvolumenAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cUnorderedGroup.eContents().get(2);
		private final Keyword cMonatl_kostenKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMonatl_kostenAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMonatl_kostenFLOATTerminalRuleCall_2_1_0 = (RuleCall)cMonatl_kostenAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cUnorderedGroup.eContents().get(3);
		private final Keyword cNetzanbieterKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNetzanbieterAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNetzanbieterIDTerminalRuleCall_3_1_0 = (RuleCall)cNetzanbieterAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cUnorderedGroup.eContents().get(4);
		private final Keyword cInternetseiteKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cInternetseiteAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cInternetseiteIDTerminalRuleCall_4_1_0 = (RuleCall)cInternetseiteAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cUnorderedGroup.eContents().get(5);
		
		//// committtt
		////test
		//Vertrag:
		//	'Vertrag' name=ID '{' ('mindestvertragslaufzeit' mindestvertragslaufzeit=INT)* & ('datenvolumen' datenvolumen=INT)* &
		//	('monatl_kosten' monatl_kosten=FLOAT)* & ('netzanbieter' netzanbieter=ID)* & ('internetseite' internetseite=ID)* &
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Vertrag' name=ID '{' ('mindestvertragslaufzeit' mindestvertragslaufzeit=INT)* & ('datenvolumen' datenvolumen=INT)* &
		//('monatl_kosten' monatl_kosten=FLOAT)* & ('netzanbieter' netzanbieter=ID)* & ('internetseite' internetseite=ID)* & '}'
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }
		
		//'Vertrag' name=ID '{' ('mindestvertragslaufzeit' mindestvertragslaufzeit=INT)*
		public Group getGroup_0() { return cGroup_0; }
		
		//'Vertrag'
		public Keyword getVertragKeyword_0_0() { return cVertragKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_2() { return cLeftCurlyBracketKeyword_0_2; }
		
		//('mindestvertragslaufzeit' mindestvertragslaufzeit=INT)*
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//'mindestvertragslaufzeit'
		public Keyword getMindestvertragslaufzeitKeyword_0_3_0() { return cMindestvertragslaufzeitKeyword_0_3_0; }
		
		//mindestvertragslaufzeit=INT
		public Assignment getMindestvertragslaufzeitAssignment_0_3_1() { return cMindestvertragslaufzeitAssignment_0_3_1; }
		
		//INT
		public RuleCall getMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0() { return cMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0; }
		
		//('datenvolumen' datenvolumen=INT)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'datenvolumen'
		public Keyword getDatenvolumenKeyword_1_0() { return cDatenvolumenKeyword_1_0; }
		
		//datenvolumen=INT
		public Assignment getDatenvolumenAssignment_1_1() { return cDatenvolumenAssignment_1_1; }
		
		//INT
		public RuleCall getDatenvolumenINTTerminalRuleCall_1_1_0() { return cDatenvolumenINTTerminalRuleCall_1_1_0; }
		
		//('monatl_kosten' monatl_kosten=FLOAT)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'monatl_kosten'
		public Keyword getMonatl_kostenKeyword_2_0() { return cMonatl_kostenKeyword_2_0; }
		
		//monatl_kosten=FLOAT
		public Assignment getMonatl_kostenAssignment_2_1() { return cMonatl_kostenAssignment_2_1; }
		
		//FLOAT
		public RuleCall getMonatl_kostenFLOATTerminalRuleCall_2_1_0() { return cMonatl_kostenFLOATTerminalRuleCall_2_1_0; }
		
		//('netzanbieter' netzanbieter=ID)*
		public Group getGroup_3() { return cGroup_3; }
		
		//'netzanbieter'
		public Keyword getNetzanbieterKeyword_3_0() { return cNetzanbieterKeyword_3_0; }
		
		//netzanbieter=ID
		public Assignment getNetzanbieterAssignment_3_1() { return cNetzanbieterAssignment_3_1; }
		
		//ID
		public RuleCall getNetzanbieterIDTerminalRuleCall_3_1_0() { return cNetzanbieterIDTerminalRuleCall_3_1_0; }
		
		//('internetseite' internetseite=ID)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'internetseite'
		public Keyword getInternetseiteKeyword_4_0() { return cInternetseiteKeyword_4_0; }
		
		//internetseite=ID
		public Assignment getInternetseiteAssignment_4_1() { return cInternetseiteAssignment_4_1; }
		
		//ID
		public RuleCall getInternetseiteIDTerminalRuleCall_4_1_0() { return cInternetseiteIDTerminalRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class GearetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Gearet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGearetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSystemAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSystemIDTerminalRuleCall_3_0 = (RuleCall)cSystemAssignment_3.eContents().get(0);
		private final Assignment cMarkeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMarkeIDTerminalRuleCall_4_0 = (RuleCall)cMarkeAssignment_4.eContents().get(0);
		private final Assignment cSpeicherAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSpeicherIDTerminalRuleCall_5_0 = (RuleCall)cSpeicherAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//// Push
		//Gearet:
		//	'gearet' name=ID '{'
		//	system?=ID
		//	marke?=ID
		//	speicher?=ID
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'gearet' name=ID '{' system?=ID marke?=ID speicher?=ID '}'
		public Group getGroup() { return cGroup; }
		
		//'gearet'
		public Keyword getGearetKeyword_0() { return cGearetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//system?=ID
		public Assignment getSystemAssignment_3() { return cSystemAssignment_3; }
		
		//ID
		public RuleCall getSystemIDTerminalRuleCall_3_0() { return cSystemIDTerminalRuleCall_3_0; }
		
		//marke?=ID
		public Assignment getMarkeAssignment_4() { return cMarkeAssignment_4; }
		
		//ID
		public RuleCall getMarkeIDTerminalRuleCall_4_0() { return cMarkeIDTerminalRuleCall_4_0; }
		
		//speicher?=ID
		public Assignment getSpeicherAssignment_5() { return cSpeicherAssignment_5; }
		
		//ID
		public RuleCall getSpeicherIDTerminalRuleCall_5_0() { return cSpeicherIDTerminalRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tFLOAT;
	private final VertragElements pVertrag;
	private final GearetElements pGearet;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.INT");
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FLOAT");
		this.pVertrag = new VertragElements();
		this.pGearet = new GearetElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	vertrags+=Vertrag*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal FLOAT returns ecore::EFloat:
	//	INT '.' INT;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//// committtt
	////test
	//Vertrag:
	//	'Vertrag' name=ID '{' ('mindestvertragslaufzeit' mindestvertragslaufzeit=INT)* & ('datenvolumen' datenvolumen=INT)* &
	//	('monatl_kosten' monatl_kosten=FLOAT)* & ('netzanbieter' netzanbieter=ID)* & ('internetseite' internetseite=ID)* &
	//	'}';
	public VertragElements getVertragAccess() {
		return pVertrag;
	}
	
	public ParserRule getVertragRule() {
		return getVertragAccess().getRule();
	}
	
	//// Push
	//Gearet:
	//	'gearet' name=ID '{'
	//	system?=ID
	//	marke?=ID
	//	speicher?=ID
	//	'}';
	public GearetElements getGearetAccess() {
		return pGearet;
	}
	
	public ParserRule getGearetRule() {
		return getGearetAccess().getRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
