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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_FLOAT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vertrag'", "'{'", "'mindestvertragslaufzeit'", "'datenvolumen'", "'monatl_kosten'", "'netzanbieter'", "'internetseite'", "'}'", "'handy'", "'system'", "'marke'", "'speicher'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_FLOAT=6;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleElement ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=15 && LA1_0<=20)||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleElement )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Element");
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


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:100:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:101:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:107:1: ruleElement returns [EObject current=null] : (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Vertrag_0 = null;

        EObject this_Handy_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy ) )
            // InternalMyDsl.g:114:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            {
            // InternalMyDsl.g:114:2: (this_Vertrag_0= ruleVertrag | this_Handy_1= ruleHandy )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=1;
                }
                break;
            case 20:
            case 22:
            case 23:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Vertrag_0= ruleVertrag
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVertragParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Vertrag_0=ruleVertrag();

                    state._fsp--;


                    			current = this_Vertrag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Handy_1= ruleHandy
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getHandyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Handy_1=ruleHandy();

                    state._fsp--;


                    			current = this_Handy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleVertrag"
    // InternalMyDsl.g:136:1: entryRuleVertrag returns [EObject current=null] : iv_ruleVertrag= ruleVertrag EOF ;
    public final EObject entryRuleVertrag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVertrag = null;


        try {
            // InternalMyDsl.g:136:48: (iv_ruleVertrag= ruleVertrag EOF )
            // InternalMyDsl.g:137:2: iv_ruleVertrag= ruleVertrag EOF
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
    // InternalMyDsl.g:143:1: ruleVertrag returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalMyDsl.g:149:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:150:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:150:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:151:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:151:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:152:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVertragAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:155:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=7;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:157:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    {
            	    // InternalMyDsl.g:157:3: ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) )
            	    // InternalMyDsl.g:158:4: {...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:158:101: ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) )
            	    // InternalMyDsl.g:159:5: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:162:8: ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) )
            	    // InternalMyDsl.g:162:9: {...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalMyDsl.g:162:18: (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* )
            	    // InternalMyDsl.g:162:19: otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getVertragAccess().getVertragKeyword_0_0());
            	    							
            	    // InternalMyDsl.g:166:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:167:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:167:9: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:168:10: lv_name_2_0= RULE_ID
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
            	    							
            	    // InternalMyDsl.g:188:8: (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:189:9: otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,14,FOLLOW_7); 

            	    	    									newLeafNode(otherlv_4, grammarAccess.getVertragAccess().getMindestvertragslaufzeitKeyword_0_3_0());
            	    	    								
            	    	    // InternalMyDsl.g:193:9: ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) )
            	    	    // InternalMyDsl.g:194:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    {
            	    	    // InternalMyDsl.g:194:10: (lv_mindestvertragslaufzeit_5_0= RULE_INT )
            	    	    // InternalMyDsl.g:195:11: lv_mindestvertragslaufzeit_5_0= RULE_INT
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
            	    	    break loop3;
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
            	    // InternalMyDsl.g:218:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:218:3: ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) )
            	    // InternalMyDsl.g:219:4: {...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:219:101: ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ )
            	    // InternalMyDsl.g:220:5: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:223:8: ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==15) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:223:9: {...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:223:18: (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) )
            	    	    // InternalMyDsl.g:223:19: otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    {
            	    	    otherlv_6=(Token)match(input,15,FOLLOW_7); 

            	    	    								newLeafNode(otherlv_6, grammarAccess.getVertragAccess().getDatenvolumenKeyword_1_0());
            	    	    							
            	    	    // InternalMyDsl.g:227:8: ( (lv_datenvolumen_7_0= RULE_INT ) )
            	    	    // InternalMyDsl.g:228:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    {
            	    	    // InternalMyDsl.g:228:9: (lv_datenvolumen_7_0= RULE_INT )
            	    	    // InternalMyDsl.g:229:10: lv_datenvolumen_7_0= RULE_INT
            	    	    {
            	    	    lv_datenvolumen_7_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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
            	case 3 :
            	    // InternalMyDsl.g:251:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:251:3: ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) )
            	    // InternalMyDsl.g:252:4: {...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:252:101: ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ )
            	    // InternalMyDsl.g:253:5: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:256:8: ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==16) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:256:9: {...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:256:18: (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) )
            	    	    // InternalMyDsl.g:256:19: otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,16,FOLLOW_9); 

            	    	    								newLeafNode(otherlv_8, grammarAccess.getVertragAccess().getMonatl_kostenKeyword_2_0());
            	    	    							
            	    	    // InternalMyDsl.g:260:8: ( (lv_monatl_kosten_9_0= RULE_FLOAT ) )
            	    	    // InternalMyDsl.g:261:9: (lv_monatl_kosten_9_0= RULE_FLOAT )
            	    	    {
            	    	    // InternalMyDsl.g:261:9: (lv_monatl_kosten_9_0= RULE_FLOAT )
            	    	    // InternalMyDsl.g:262:10: lv_monatl_kosten_9_0= RULE_FLOAT
            	    	    {
            	    	    lv_monatl_kosten_9_0=(Token)match(input,RULE_FLOAT,FOLLOW_8); 

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
            	case 4 :
            	    // InternalMyDsl.g:284:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:284:3: ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) )
            	    // InternalMyDsl.g:285:4: {...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:285:101: ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ )
            	    // InternalMyDsl.g:286:5: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:289:8: ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==17) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:289:9: {...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:289:18: (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) )
            	    	    // InternalMyDsl.g:289:19: otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_10, grammarAccess.getVertragAccess().getNetzanbieterKeyword_3_0());
            	    	    							
            	    	    // InternalMyDsl.g:293:8: ( (lv_netzanbieter_11_0= RULE_ID ) )
            	    	    // InternalMyDsl.g:294:9: (lv_netzanbieter_11_0= RULE_ID )
            	    	    {
            	    	    // InternalMyDsl.g:294:9: (lv_netzanbieter_11_0= RULE_ID )
            	    	    // InternalMyDsl.g:295:10: lv_netzanbieter_11_0= RULE_ID
            	    	    {
            	    	    lv_netzanbieter_11_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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
            	case 5 :
            	    // InternalMyDsl.g:317:3: ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalMyDsl.g:317:3: ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) )
            	    // InternalMyDsl.g:318:4: {...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:318:101: ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ )
            	    // InternalMyDsl.g:319:5: ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:322:8: ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==18) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:322:9: {...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    	    }
            	    	    // InternalMyDsl.g:322:18: (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) )
            	    	    // InternalMyDsl.g:322:19: otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_12=(Token)match(input,18,FOLLOW_4); 

            	    	    								newLeafNode(otherlv_12, grammarAccess.getVertragAccess().getInternetseiteKeyword_4_0());
            	    	    							
            	    	    // InternalMyDsl.g:326:8: ( (lv_internetseite_13_0= RULE_ID ) )
            	    	    // InternalMyDsl.g:327:9: (lv_internetseite_13_0= RULE_ID )
            	    	    {
            	    	    // InternalMyDsl.g:327:9: (lv_internetseite_13_0= RULE_ID )
            	    	    // InternalMyDsl.g:328:10: lv_internetseite_13_0= RULE_ID
            	    	    {
            	    	    lv_internetseite_13_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:350:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:350:3: ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) )
            	    // InternalMyDsl.g:351:4: {...}? => ( ({...}? => (otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalMyDsl.g:351:101: ( ({...}? => (otherlv_14= '}' ) ) )
            	    // InternalMyDsl.g:352:5: ({...}? => (otherlv_14= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVertragAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalMyDsl.g:355:8: ({...}? => (otherlv_14= '}' ) )
            	    // InternalMyDsl.g:355:9: {...}? => (otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVertrag", "true");
            	    }
            	    // InternalMyDsl.g:355:18: (otherlv_14= '}' )
            	    // InternalMyDsl.g:355:19: otherlv_14= '}'
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_8); 

            	    								newLeafNode(otherlv_14, grammarAccess.getVertragAccess().getRightCurlyBracketKeyword_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVertragAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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


    // $ANTLR start "entryRuleHandy"
    // InternalMyDsl.g:376:1: entryRuleHandy returns [EObject current=null] : iv_ruleHandy= ruleHandy EOF ;
    public final EObject entryRuleHandy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandy = null;


        try {
            // InternalMyDsl.g:376:46: (iv_ruleHandy= ruleHandy EOF )
            // InternalMyDsl.g:377:2: iv_ruleHandy= ruleHandy EOF
            {
             newCompositeNode(grammarAccess.getHandyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHandy=ruleHandy();

            state._fsp--;

             current =iv_ruleHandy; 
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
    // $ANTLR end "entryRuleHandy"


    // $ANTLR start "ruleHandy"
    // InternalMyDsl.g:383:1: ruleHandy returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleHandy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_system_5_0=null;
        Token otherlv_6=null;
        Token lv_marke_7_0=null;
        Token otherlv_8=null;
        Token lv_speicher_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:389:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:390:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:390:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:391:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:391:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:392:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getHandyAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:395:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:396:5: ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:396:5: ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=5;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:397:3: ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:397:3: ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) )
            	    // InternalMyDsl.g:398:4: {...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:398:99: ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) )
            	    // InternalMyDsl.g:399:5: ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getHandyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:402:8: ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) )
            	    // InternalMyDsl.g:402:9: {...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "true");
            	    }
            	    // InternalMyDsl.g:402:18: (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? )
            	    // InternalMyDsl.g:402:19: otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getHandyAccess().getHandyKeyword_0_0());
            	    							
            	    // InternalMyDsl.g:406:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMyDsl.g:407:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:407:9: (lv_name_2_0= RULE_ID )
            	    // InternalMyDsl.g:408:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getHandyAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getHandyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.xtext.example.mydsl.MyDsl.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,13,FOLLOW_10); 

            	    								newLeafNode(otherlv_3, grammarAccess.getHandyAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalMyDsl.g:428:8: (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==21) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMyDsl.g:429:9: otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) )
            	            {
            	            otherlv_4=(Token)match(input,21,FOLLOW_4); 

            	            									newLeafNode(otherlv_4, grammarAccess.getHandyAccess().getSystemKeyword_0_3_0());
            	            								
            	            // InternalMyDsl.g:433:9: ( (lv_system_5_0= RULE_ID ) )
            	            // InternalMyDsl.g:434:10: (lv_system_5_0= RULE_ID )
            	            {
            	            // InternalMyDsl.g:434:10: (lv_system_5_0= RULE_ID )
            	            // InternalMyDsl.g:435:11: lv_system_5_0= RULE_ID
            	            {
            	            lv_system_5_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	            											newLeafNode(lv_system_5_0, grammarAccess.getHandyAccess().getSystemIDTerminalRuleCall_0_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getHandyRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"system",
            	            												lv_system_5_0,
            	            												"org.xtext.example.mydsl.MyDsl.ID");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHandyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:458:3: ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:458:3: ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) )
            	    // InternalMyDsl.g:459:4: {...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:459:99: ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) )
            	    // InternalMyDsl.g:460:5: ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getHandyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:463:8: ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) )
            	    // InternalMyDsl.g:463:9: {...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "true");
            	    }
            	    // InternalMyDsl.g:463:18: (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) )
            	    // InternalMyDsl.g:463:19: otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_4); 

            	    								newLeafNode(otherlv_6, grammarAccess.getHandyAccess().getMarkeKeyword_1_0());
            	    							
            	    // InternalMyDsl.g:467:8: ( (lv_marke_7_0= RULE_ID ) )
            	    // InternalMyDsl.g:468:9: (lv_marke_7_0= RULE_ID )
            	    {
            	    // InternalMyDsl.g:468:9: (lv_marke_7_0= RULE_ID )
            	    // InternalMyDsl.g:469:10: lv_marke_7_0= RULE_ID
            	    {
            	    lv_marke_7_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    										newLeafNode(lv_marke_7_0, grammarAccess.getHandyAccess().getMarkeIDTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getHandyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"marke",
            	    											lv_marke_7_0,
            	    											"org.xtext.example.mydsl.MyDsl.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHandyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:491:3: ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:491:3: ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalMyDsl.g:492:4: {...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:492:99: ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) )
            	    // InternalMyDsl.g:493:5: ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getHandyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:496:8: ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) )
            	    // InternalMyDsl.g:496:9: {...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "true");
            	    }
            	    // InternalMyDsl.g:496:18: (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) )
            	    // InternalMyDsl.g:496:19: otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_7); 

            	    								newLeafNode(otherlv_8, grammarAccess.getHandyAccess().getSpeicherKeyword_2_0());
            	    							
            	    // InternalMyDsl.g:500:8: ( (lv_speicher_9_0= RULE_INT ) )
            	    // InternalMyDsl.g:501:9: (lv_speicher_9_0= RULE_INT )
            	    {
            	    // InternalMyDsl.g:501:9: (lv_speicher_9_0= RULE_INT )
            	    // InternalMyDsl.g:502:10: lv_speicher_9_0= RULE_INT
            	    {
            	    lv_speicher_9_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            	    										newLeafNode(lv_speicher_9_0, grammarAccess.getHandyAccess().getSpeicherINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getHandyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"speicher",
            	    											lv_speicher_9_0,
            	    											"org.xtext.example.mydsl.MyDsl.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHandyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:524:3: ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) )
            	    {
            	    // InternalMyDsl.g:524:3: ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) )
            	    // InternalMyDsl.g:525:4: {...}? => ( ({...}? => (otherlv_10= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:525:99: ( ({...}? => (otherlv_10= '}' ) ) )
            	    // InternalMyDsl.g:526:5: ({...}? => (otherlv_10= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getHandyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:529:8: ({...}? => (otherlv_10= '}' ) )
            	    // InternalMyDsl.g:529:9: {...}? => (otherlv_10= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleHandy", "true");
            	    }
            	    // InternalMyDsl.g:529:18: (otherlv_10= '}' )
            	    // InternalMyDsl.g:529:19: otherlv_10= '}'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_11); 

            	    								newLeafNode(otherlv_10, grammarAccess.getHandyAccess().getRightCurlyBracketKeyword_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHandyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleHandy", "getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getHandyAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleHandy"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\1\15\uffff";
    static final String dfa_3s = "\1\14\1\uffff\6\0\6\uffff";
    static final String dfa_4s = "\1\27\1\uffff\6\0\6\uffff";
    static final String dfa_5s = "\1\uffff\1\7\6\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_6s = "\2\uffff\1\5\1\3\1\4\1\0\1\2\1\1\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\1\1\uffff\2\1",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 156:5: ( ({...}? => ( ({...}? => (otherlv_1= 'Vertrag' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'mindestvertragslaufzeit' ( (lv_mindestvertragslaufzeit_5_0= RULE_INT ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'datenvolumen' ( (lv_datenvolumen_7_0= RULE_INT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_8= 'monatl_kosten' ( (lv_monatl_kosten_9_0= RULE_FLOAT ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'netzanbieter' ( (lv_netzanbieter_11_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_12= 'internetseite' ( (lv_internetseite_13_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_14= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 3) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 5) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 4) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 2) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVertragAccess().getUnorderedGroup(), 0) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getVertragAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\14\1\uffff\4\0\4\uffff";
    static final String dfa_11s = "\1\27\1\uffff\4\0\4\uffff";
    static final String dfa_12s = "\1\uffff\1\5\4\uffff\1\4\1\1\1\2\1\3";
    static final String dfa_13s = "\2\uffff\1\3\1\1\1\0\1\2\4\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\2\uffff\4\1\1\2\1\3\1\uffff\1\4\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 396:5: ( ({...}? => ( ({...}? => (otherlv_1= 'handy' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'system' ( (lv_system_5_0= RULE_ID ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'marke' ( (lv_marke_7_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'speicher' ( (lv_speicher_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHandyAccess().getUnorderedGroup(), 3) ) {s = 6;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getHandyAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000DF9002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FD002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F9002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000D80002L});

}
