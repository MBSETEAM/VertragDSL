/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getVertragAccess().getGroup_0(), "rule__Vertrag__Group_0__0");
					put(grammarAccess.getVertragAccess().getGroup_0_3(), "rule__Vertrag__Group_0_3__0");
					put(grammarAccess.getVertragAccess().getGroup_1(), "rule__Vertrag__Group_1__0");
					put(grammarAccess.getVertragAccess().getGroup_2(), "rule__Vertrag__Group_2__0");
					put(grammarAccess.getVertragAccess().getGroup_3(), "rule__Vertrag__Group_3__0");
					put(grammarAccess.getVertragAccess().getGroup_4(), "rule__Vertrag__Group_4__0");
					put(grammarAccess.getHandyAccess().getGroup_0(), "rule__Handy__Group_0__0");
					put(grammarAccess.getHandyAccess().getGroup_0_3(), "rule__Handy__Group_0_3__0");
					put(grammarAccess.getHandyAccess().getGroup_1(), "rule__Handy__Group_1__0");
					put(grammarAccess.getHandyAccess().getGroup_2(), "rule__Handy__Group_2__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getVertragAccess().getNameAssignment_0_1(), "rule__Vertrag__NameAssignment_0_1");
					put(grammarAccess.getVertragAccess().getMindestvertragslaufzeitAssignment_0_3_1(), "rule__Vertrag__MindestvertragslaufzeitAssignment_0_3_1");
					put(grammarAccess.getVertragAccess().getDatenvolumenAssignment_1_1(), "rule__Vertrag__DatenvolumenAssignment_1_1");
					put(grammarAccess.getVertragAccess().getMonatl_kostenAssignment_2_1(), "rule__Vertrag__Monatl_kostenAssignment_2_1");
					put(grammarAccess.getVertragAccess().getNetzanbieterAssignment_3_1(), "rule__Vertrag__NetzanbieterAssignment_3_1");
					put(grammarAccess.getVertragAccess().getInternetseiteAssignment_4_1(), "rule__Vertrag__InternetseiteAssignment_4_1");
					put(grammarAccess.getHandyAccess().getNameAssignment_0_1(), "rule__Handy__NameAssignment_0_1");
					put(grammarAccess.getHandyAccess().getSystemAssignment_0_3_1(), "rule__Handy__SystemAssignment_0_3_1");
					put(grammarAccess.getHandyAccess().getMarkeAssignment_1_1(), "rule__Handy__MarkeAssignment_1_1");
					put(grammarAccess.getHandyAccess().getSpeicherAssignment_2_1(), "rule__Handy__SpeicherAssignment_2_1");
					put(grammarAccess.getVertragAccess().getUnorderedGroup(), "rule__Vertrag__UnorderedGroup");
					put(grammarAccess.getHandyAccess().getUnorderedGroup(), "rule__Handy__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
