package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vertrag'", "'{'", "'mindestvertragslaufzeit'", "'datenvolumen'", "'monatl_kosten'", "'netzanbieter'", "'internetseite'", "'}'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_FLOAT=6;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_vertrags_0_0= ruleVertrag ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_vertrags_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_vertrags_0_0= ruleVertrag ) )* )
            // InternalMyDsl.g:78:2: ( (lv_vertrags_0_0= ruleVertrag ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_vertrags_0_0= ruleVertrag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_vertrags_0_0= ruleVertrag )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_vertrags_0_0= ruleVertrag )
            	    // InternalMyDsl.g:80:4: lv_vertrags_0_0= ruleVertrag
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVertragsVertragParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_vertrags_0_0=ruleVertrag();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"vertrags",
            	    					lv_vertrags_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Vertrag");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVertrag"
    // InternalMyDsl.g:100:1: entryRuleVertrag returns [EObject current=null] : iv_ruleVertrag= ruleVertrag EOF ;
    public final EObject entryRuleVertrag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertrag = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleVertrag= ruleVertrag EOF )
            // InternalMyDsl.g:101:2: iv_ruleVertrag= ruleVertrag EOF
            {
             newCompositeNode(grammarAccess.getVertragRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVertrag=ruleVertrag();

            state._fsp--;

             current =iv_ruleVertrag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVertrag"


    // $ANTLR start "ruleVertrag"
    // InternalMyDsl.g:107:1: ruleVertrag returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleVertrag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_mindestvertragslaufzeit_5_0=null;
        Token otherlv_6=null;
        Token lv_datenvolumen_7_0=null;
        Token otherlv_8=null;
        Token lv_monatl_kosten_9_0=null;
        Token otherlv_10=null;
        Token lv_netzanbieter_11_0=null;
        Token otherlv_12=null;
        Token lv_internetseite_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:114:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:114:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:115:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:115:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:116:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:119:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:120:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:120:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=7;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:121:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:121:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    // InternalMyDsl.g:122:4: {...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:122:101: ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    // InternalMyDsl.g:123:5: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:126:8: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    // InternalMyDsl.g:126:9: {...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalMyDsl.g:126:18: (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    // InternalMyDsl.g:126:19: otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getVertragAccess().getVertragKeyword_0_0());
            	    							
            	    // InternalMyDsl.g:130:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:131:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:131:9: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:132:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getVertragAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getVertragRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.xtext.example.mydsl.MyDsl.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getVertragAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalMyDsl.g:152:8: (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==14) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:153:9: otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_4, grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_0_3_0());
            	    	    								
            	    	    // InternalMyDsl.g:157:9: ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    // InternalMyDsl.g:158:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    {
            	    	    // InternalMyDsl.g:158:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    // InternalMyDsl.g:159:11: lv_mindestvertragslaufzeit_5_0= RULE_INT
            	    	    {
            	    	    lv_mindestvertragslaufzeit_5_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            	    	    											newLeafNode(lv_mindestvertragslaufzeit_5_0, grammarAccess.getVertragAccess().getMindestvertragslaufzeitINTTerminalRuleCall_0_3_1_0());
            	    	    										

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getVertragRule());
            	    	    											}
            	    	    											setWithLastConsumed(
            	    	    												current,
            	    	    												"mindestvertragslaufzeit",
            	    	    												lv_mindestvertragslaufzeit_5_0,
            	    	    												"org.xtext.example.mydsl.MyDsl.INT");
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:182:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:182:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    // InternalMyDsl.g:183:4: {...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:183:101: ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    // InternalMyDsl.g:184:5: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:187:8: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:187:9: {...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:187:18: (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    // InternalMyDsl.g:187:19: otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	    	    								newLeafNode(otherlv_6, grammarAccess.getVertragAccess().getDatenvolumenKeyword_1_0());
            	    	    							
            	    	    // InternalMyDsl.g:191:8: ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    // InternalMyDsl.g:192:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    {
            	    	    // InternalMyDsl.g:192:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    // InternalMyDsl.g:193:10: lv_datenvolumen_7_0= RULE_INT
            	    	    {
            	    	    lv_datenvolumen_7_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            	    	    										newLeafNode(lv_datenvolumen_7_0, grammarAccess.getVertragAccess().getDatenvolumenINTTerminalRuleCall_1_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"datenvolumen",
            	    	    											lv_datenvolumen_7_0,
            	    	    											"org.xtext.example.mydsl.MyDsl.INT");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:215:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:215:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) )
            	    // InternalMyDsl.g:216:4: {...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:216:101: ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ )
            	    // InternalMyDsl.g:217:5: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:220:8: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==16) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:220:9: {...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:220:18: (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) )
            	    	    // InternalMyDsl.g:220:19: otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,16,FOLLOW_8); 

            	    	    								newLeafNode(otherlv_8, grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0());
            	    	    							
            	    	    // InternalMyDsl.g:224:8: ( (lv_monatl_kosten_9_0= RULE_FLOAT ) )
            	    	    // InternalMyDsl.g:225:9: (lv_monatl_kosten_9_0= RULE_FLOAT )
            	    	    {
            	    	    // InternalMyDsl.g:225:9: (lv_monatl_kosten_9_0= RULE_FLOAT )
            	    	    // InternalMyDsl.g:226:10: lv_monatl_kosten_9_0= RULE_FLOAT
            	    	    {
            	    	    lv_monatl_kosten_9_0=(Token)match(input,RULE_FLOAT,FOLLOW_3); 

            	    	    										newLeafNode(lv_monatl_kosten_9_0, grammarAccess.getVertragAccess().getMonatl_kostenFLOATTerminalRuleCall_2_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"monatl_kosten",
            	    	    											lv_monatl_kosten_9_0,
            	    	    											"org.xtext.example.mydsl.MyDsl.FLOAT");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:248:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:248:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) )
            	    // InternalMyDsl.g:249:4: {...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:249:101: ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ )
            	    // InternalMyDsl.g:250:5: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:253:8: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==17) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:253:9: {...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:253:18: (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) )
            	    	    // InternalMyDsl.g:253:19: otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_10, grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0());
            	    	    							
            	    	    // InternalMyDsl.g:257:8: ( (lv_netzanbieter_11_0= RULE_ID ) )
            	    	    // InternalMyDsl.g:258:9: (lv_netzanbieter_11_0= RULE_ID )
            	    	    {
            	    	    // InternalMyDsl.g:258:9: (lv_netzanbieter_11_0= RULE_ID )
            	    	    // InternalMyDsl.g:259:10: lv_netzanbieter_11_0= RULE_ID
            	    	    {
            	    	    lv_netzanbieter_11_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    	    										newLeafNode(lv_netzanbieter_11_0, grammarAccess.getVertragAccess().getNetzanbieterIDTerminalRuleCall_3_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"netzanbieter",
            	    	    											lv_netzanbieter_11_0,
            	    	    											"org.xtext.example.mydsl.MyDsl.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:281:3: ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:281:3: ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) )
            	    // InternalMyDsl.g:282:4: {...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:282:101: ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ )
            	    // InternalMyDsl.g:283:5: ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:286:8: ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==18) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:286:9: {...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:286:18: (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) )
            	    	    // InternalMyDsl.g:286:19: otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,18,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_12, grammarAccess.getVertragAccess().getInternetseiteKeyword_4_0());
            	    	    							
            	    	    // InternalMyDsl.g:290:8: ( (lv_internetseite_13_0= RULE_ID ) )
            	    	    // InternalMyDsl.g:291:9: (lv_internetseite_13_0= RULE_ID )
            	    	    {
            	    	    // InternalMyDsl.g:291:9: (lv_internetseite_13_0= RULE_ID )
            	    	    // InternalMyDsl.g:292:10: lv_internetseite_13_0= RULE_ID
            	    	    {
            	    	    lv_internetseite_13_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            	    	    										newLeafNode(lv_internetseite_13_0, grammarAccess.getVertragAccess().getInternetseiteIDTerminalRuleCall_4_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getVertragRule());
            	    	    										}
            	    	    										setWithLastConsumed(
            	    	    											current,
            	    	    											"internetseite",
            	    	    											lv_internetseite_13_0,
            	    	    											"org.xtext.example.mydsl.MyDsl.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:314:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:314:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    // InternalMyDsl.g:315:4: {...}? => ( ({...}? => (otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalMyDsl.g:315:101: ( ({...}? => (otherlv_14= '}' ) ) )
            	    // InternalMyDsl.g:316:5: ({...}? => (otherlv_14= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalMyDsl.g:319:8: ({...}? => (otherlv_14= '}' ) )
            	    // InternalMyDsl.g:319:9: {...}? => (otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalMyDsl.g:319:18: (otherlv_14= '}' )
            	    // InternalMyDsl.g:319:19: otherlv_14= '}'
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_14, grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getVertragAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVertrag"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\14\1\uffff\6\0\6\uffff";
    static final String dfa_4s = "\1\23\1\uffff\6\0\6\uffff";
    static final String dfa_5s = "\1\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_6s = "\2\uffff\1\4\1\1\1\3\1\5\1\0\1\2\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 120:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000F9002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FD002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});

}
