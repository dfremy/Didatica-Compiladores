package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MINUS", "RULE_LPAREN", "RULE_RPAREN", "RULE_INT", "RULE_PLUS", "RULE_MULT", "RULE_DIV", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=11;
    public static final int RULE_WS=15;
    public static final int RULE_STRING=12;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_LPAREN=5;
    public static final int RULE_MINUS=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_RPAREN=6;
    public static final int RULE_DIV=10;
    public static final int RULE_MULT=9;
    public static final int RULE_INT=7;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_PLUS=8;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntity.g"; }



     	private EntityGrammarAccess grammarAccess;

        public InternalEntityParser(TokenStream input, EntityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EntityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEntity.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEntity.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEntity.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalEntity.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleexpression ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:77:2: ( ( (lv_elements_0_0= ruleexpression ) ) )
            // InternalEntity.g:78:2: ( (lv_elements_0_0= ruleexpression ) )
            {
            // InternalEntity.g:78:2: ( (lv_elements_0_0= ruleexpression ) )
            // InternalEntity.g:79:3: (lv_elements_0_0= ruleexpression )
            {
            // InternalEntity.g:79:3: (lv_elements_0_0= ruleexpression )
            // InternalEntity.g:80:4: lv_elements_0_0= ruleexpression
            {

            				newCompositeNode(grammarAccess.getModelAccess().getElementsExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_elements_0_0=ruleexpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"elements",
            					lv_elements_0_0,
            					"org.xtext.example.Entity.expression");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleexpression"
    // InternalEntity.g:100:1: entryRuleexpression returns [EObject current=null] : iv_ruleexpression= ruleexpression EOF ;
    public final EObject entryRuleexpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression = null;


        try {
            // InternalEntity.g:100:51: (iv_ruleexpression= ruleexpression EOF )
            // InternalEntity.g:101:2: iv_ruleexpression= ruleexpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression=ruleexpression();

            state._fsp--;

             current =iv_ruleexpression; 
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
    // $ANTLR end "entryRuleexpression"


    // $ANTLR start "ruleexpression"
    // InternalEntity.g:107:1: ruleexpression returns [EObject current=null] : ( ( (lv_expressao_un_0_0= ruleexpression_unity ) ) ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )? ) ;
    public final EObject ruleexpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expressao_un_0_0 = null;

        EObject lv_operador_1_0 = null;

        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:113:2: ( ( ( (lv_expressao_un_0_0= ruleexpression_unity ) ) ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )? ) )
            // InternalEntity.g:114:2: ( ( (lv_expressao_un_0_0= ruleexpression_unity ) ) ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )? )
            {
            // InternalEntity.g:114:2: ( ( (lv_expressao_un_0_0= ruleexpression_unity ) ) ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )? )
            // InternalEntity.g:115:3: ( (lv_expressao_un_0_0= ruleexpression_unity ) ) ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )?
            {
            // InternalEntity.g:115:3: ( (lv_expressao_un_0_0= ruleexpression_unity ) )
            // InternalEntity.g:116:4: (lv_expressao_un_0_0= ruleexpression_unity )
            {
            // InternalEntity.g:116:4: (lv_expressao_un_0_0= ruleexpression_unity )
            // InternalEntity.g:117:5: lv_expressao_un_0_0= ruleexpression_unity
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getExpressao_unExpression_unityParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_expressao_un_0_0=ruleexpression_unity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"expressao_un",
            						lv_expressao_un_0_0,
            						"org.xtext.example.Entity.expression_unity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEntity.g:134:3: ( ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_MINUS||(LA1_0>=RULE_PLUS && LA1_0<=RULE_DIV)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEntity.g:135:4: ( (lv_operador_1_0= ruleoperator ) ) ( (lv_expressao_2_0= ruleexpression ) )
                    {
                    // InternalEntity.g:135:4: ( (lv_operador_1_0= ruleoperator ) )
                    // InternalEntity.g:136:5: (lv_operador_1_0= ruleoperator )
                    {
                    // InternalEntity.g:136:5: (lv_operador_1_0= ruleoperator )
                    // InternalEntity.g:137:6: lv_operador_1_0= ruleoperator
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOperadorOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operador_1_0=ruleoperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"operador",
                    							lv_operador_1_0,
                    							"org.xtext.example.Entity.operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEntity.g:154:4: ( (lv_expressao_2_0= ruleexpression ) )
                    // InternalEntity.g:155:5: (lv_expressao_2_0= ruleexpression )
                    {
                    // InternalEntity.g:155:5: (lv_expressao_2_0= ruleexpression )
                    // InternalEntity.g:156:6: lv_expressao_2_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getExpressaoExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressao_2_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expressao",
                    							lv_expressao_2_0,
                    							"org.xtext.example.Entity.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleexpression"


    // $ANTLR start "entryRuleexpression_unity"
    // InternalEntity.g:178:1: entryRuleexpression_unity returns [EObject current=null] : iv_ruleexpression_unity= ruleexpression_unity EOF ;
    public final EObject entryRuleexpression_unity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpression_unity = null;


        try {
            // InternalEntity.g:178:57: (iv_ruleexpression_unity= ruleexpression_unity EOF )
            // InternalEntity.g:179:2: iv_ruleexpression_unity= ruleexpression_unity EOF
            {
             newCompositeNode(grammarAccess.getExpression_unityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpression_unity=ruleexpression_unity();

            state._fsp--;

             current =iv_ruleexpression_unity; 
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
    // $ANTLR end "entryRuleexpression_unity"


    // $ANTLR start "ruleexpression_unity"
    // InternalEntity.g:185:1: ruleexpression_unity returns [EObject current=null] : ( ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) ) | ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) ) | ( (lv_valor_5_0= RULE_INT ) ) ) ;
    public final EObject ruleexpression_unity() throws RecognitionException {
        EObject current = null;

        Token lv_menos_0_0=null;
        Token lv_abre_paren_2_0=null;
        Token lv_fecha_paren_4_0=null;
        Token lv_valor_5_0=null;
        EObject lv_expressao_un_1_0 = null;

        EObject lv_expressao_3_0 = null;



        	enterRule();

        try {
            // InternalEntity.g:191:2: ( ( ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) ) | ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) ) | ( (lv_valor_5_0= RULE_INT ) ) ) )
            // InternalEntity.g:192:2: ( ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) ) | ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) ) | ( (lv_valor_5_0= RULE_INT ) ) )
            {
            // InternalEntity.g:192:2: ( ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) ) | ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) ) | ( (lv_valor_5_0= RULE_INT ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_MINUS:
                {
                alt2=1;
                }
                break;
            case RULE_LPAREN:
                {
                alt2=2;
                }
                break;
            case RULE_INT:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntity.g:193:3: ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) )
                    {
                    // InternalEntity.g:193:3: ( ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) ) )
                    // InternalEntity.g:194:4: ( (lv_menos_0_0= RULE_MINUS ) ) ( (lv_expressao_un_1_0= ruleexpression_unity ) )
                    {
                    // InternalEntity.g:194:4: ( (lv_menos_0_0= RULE_MINUS ) )
                    // InternalEntity.g:195:5: (lv_menos_0_0= RULE_MINUS )
                    {
                    // InternalEntity.g:195:5: (lv_menos_0_0= RULE_MINUS )
                    // InternalEntity.g:196:6: lv_menos_0_0= RULE_MINUS
                    {
                    lv_menos_0_0=(Token)match(input,RULE_MINUS,FOLLOW_4); 

                    						newLeafNode(lv_menos_0_0, grammarAccess.getExpression_unityAccess().getMenosMINUSTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpression_unityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"menos",
                    							lv_menos_0_0,
                    							"org.xtext.example.Entity.MINUS");
                    					

                    }


                    }

                    // InternalEntity.g:212:4: ( (lv_expressao_un_1_0= ruleexpression_unity ) )
                    // InternalEntity.g:213:5: (lv_expressao_un_1_0= ruleexpression_unity )
                    {
                    // InternalEntity.g:213:5: (lv_expressao_un_1_0= ruleexpression_unity )
                    // InternalEntity.g:214:6: lv_expressao_un_1_0= ruleexpression_unity
                    {

                    						newCompositeNode(grammarAccess.getExpression_unityAccess().getExpressao_unExpression_unityParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressao_un_1_0=ruleexpression_unity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression_unityRule());
                    						}
                    						set(
                    							current,
                    							"expressao_un",
                    							lv_expressao_un_1_0,
                    							"org.xtext.example.Entity.expression_unity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEntity.g:233:3: ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) )
                    {
                    // InternalEntity.g:233:3: ( ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) ) )
                    // InternalEntity.g:234:4: ( (lv_abre_paren_2_0= RULE_LPAREN ) ) ( (lv_expressao_3_0= ruleexpression ) ) ( (lv_fecha_paren_4_0= RULE_RPAREN ) )
                    {
                    // InternalEntity.g:234:4: ( (lv_abre_paren_2_0= RULE_LPAREN ) )
                    // InternalEntity.g:235:5: (lv_abre_paren_2_0= RULE_LPAREN )
                    {
                    // InternalEntity.g:235:5: (lv_abre_paren_2_0= RULE_LPAREN )
                    // InternalEntity.g:236:6: lv_abre_paren_2_0= RULE_LPAREN
                    {
                    lv_abre_paren_2_0=(Token)match(input,RULE_LPAREN,FOLLOW_4); 

                    						newLeafNode(lv_abre_paren_2_0, grammarAccess.getExpression_unityAccess().getAbre_parenLPARENTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpression_unityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"abre_paren",
                    							lv_abre_paren_2_0,
                    							"org.xtext.example.Entity.LPAREN");
                    					

                    }


                    }

                    // InternalEntity.g:252:4: ( (lv_expressao_3_0= ruleexpression ) )
                    // InternalEntity.g:253:5: (lv_expressao_3_0= ruleexpression )
                    {
                    // InternalEntity.g:253:5: (lv_expressao_3_0= ruleexpression )
                    // InternalEntity.g:254:6: lv_expressao_3_0= ruleexpression
                    {

                    						newCompositeNode(grammarAccess.getExpression_unityAccess().getExpressaoExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_expressao_3_0=ruleexpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression_unityRule());
                    						}
                    						set(
                    							current,
                    							"expressao",
                    							lv_expressao_3_0,
                    							"org.xtext.example.Entity.expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEntity.g:271:4: ( (lv_fecha_paren_4_0= RULE_RPAREN ) )
                    // InternalEntity.g:272:5: (lv_fecha_paren_4_0= RULE_RPAREN )
                    {
                    // InternalEntity.g:272:5: (lv_fecha_paren_4_0= RULE_RPAREN )
                    // InternalEntity.g:273:6: lv_fecha_paren_4_0= RULE_RPAREN
                    {
                    lv_fecha_paren_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_2); 

                    						newLeafNode(lv_fecha_paren_4_0, grammarAccess.getExpression_unityAccess().getFecha_parenRPARENTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpression_unityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fecha_paren",
                    							lv_fecha_paren_4_0,
                    							"org.xtext.example.Entity.RPAREN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEntity.g:291:3: ( (lv_valor_5_0= RULE_INT ) )
                    {
                    // InternalEntity.g:291:3: ( (lv_valor_5_0= RULE_INT ) )
                    // InternalEntity.g:292:4: (lv_valor_5_0= RULE_INT )
                    {
                    // InternalEntity.g:292:4: (lv_valor_5_0= RULE_INT )
                    // InternalEntity.g:293:5: lv_valor_5_0= RULE_INT
                    {
                    lv_valor_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_valor_5_0, grammarAccess.getExpression_unityAccess().getValorINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpression_unityRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"valor",
                    						lv_valor_5_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


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
    // $ANTLR end "ruleexpression_unity"


    // $ANTLR start "entryRuleoperator"
    // InternalEntity.g:313:1: entryRuleoperator returns [EObject current=null] : iv_ruleoperator= ruleoperator EOF ;
    public final EObject entryRuleoperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoperator = null;


        try {
            // InternalEntity.g:313:49: (iv_ruleoperator= ruleoperator EOF )
            // InternalEntity.g:314:2: iv_ruleoperator= ruleoperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperator=ruleoperator();

            state._fsp--;

             current =iv_ruleoperator; 
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
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // InternalEntity.g:320:1: ruleoperator returns [EObject current=null] : ( ( (lv_mais_0_0= RULE_PLUS ) ) | ( (lv_menos_1_0= RULE_MINUS ) ) | ( (lv_mult_2_0= RULE_MULT ) ) | ( (lv_div_3_0= RULE_DIV ) ) ) ;
    public final EObject ruleoperator() throws RecognitionException {
        EObject current = null;

        Token lv_mais_0_0=null;
        Token lv_menos_1_0=null;
        Token lv_mult_2_0=null;
        Token lv_div_3_0=null;


        	enterRule();

        try {
            // InternalEntity.g:326:2: ( ( ( (lv_mais_0_0= RULE_PLUS ) ) | ( (lv_menos_1_0= RULE_MINUS ) ) | ( (lv_mult_2_0= RULE_MULT ) ) | ( (lv_div_3_0= RULE_DIV ) ) ) )
            // InternalEntity.g:327:2: ( ( (lv_mais_0_0= RULE_PLUS ) ) | ( (lv_menos_1_0= RULE_MINUS ) ) | ( (lv_mult_2_0= RULE_MULT ) ) | ( (lv_div_3_0= RULE_DIV ) ) )
            {
            // InternalEntity.g:327:2: ( ( (lv_mais_0_0= RULE_PLUS ) ) | ( (lv_menos_1_0= RULE_MINUS ) ) | ( (lv_mult_2_0= RULE_MULT ) ) | ( (lv_div_3_0= RULE_DIV ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt3=1;
                }
                break;
            case RULE_MINUS:
                {
                alt3=2;
                }
                break;
            case RULE_MULT:
                {
                alt3=3;
                }
                break;
            case RULE_DIV:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEntity.g:328:3: ( (lv_mais_0_0= RULE_PLUS ) )
                    {
                    // InternalEntity.g:328:3: ( (lv_mais_0_0= RULE_PLUS ) )
                    // InternalEntity.g:329:4: (lv_mais_0_0= RULE_PLUS )
                    {
                    // InternalEntity.g:329:4: (lv_mais_0_0= RULE_PLUS )
                    // InternalEntity.g:330:5: lv_mais_0_0= RULE_PLUS
                    {
                    lv_mais_0_0=(Token)match(input,RULE_PLUS,FOLLOW_2); 

                    					newLeafNode(lv_mais_0_0, grammarAccess.getOperatorAccess().getMaisPLUSTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"mais",
                    						lv_mais_0_0,
                    						"org.xtext.example.Entity.PLUS");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEntity.g:347:3: ( (lv_menos_1_0= RULE_MINUS ) )
                    {
                    // InternalEntity.g:347:3: ( (lv_menos_1_0= RULE_MINUS ) )
                    // InternalEntity.g:348:4: (lv_menos_1_0= RULE_MINUS )
                    {
                    // InternalEntity.g:348:4: (lv_menos_1_0= RULE_MINUS )
                    // InternalEntity.g:349:5: lv_menos_1_0= RULE_MINUS
                    {
                    lv_menos_1_0=(Token)match(input,RULE_MINUS,FOLLOW_2); 

                    					newLeafNode(lv_menos_1_0, grammarAccess.getOperatorAccess().getMenosMINUSTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"menos",
                    						lv_menos_1_0,
                    						"org.xtext.example.Entity.MINUS");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEntity.g:366:3: ( (lv_mult_2_0= RULE_MULT ) )
                    {
                    // InternalEntity.g:366:3: ( (lv_mult_2_0= RULE_MULT ) )
                    // InternalEntity.g:367:4: (lv_mult_2_0= RULE_MULT )
                    {
                    // InternalEntity.g:367:4: (lv_mult_2_0= RULE_MULT )
                    // InternalEntity.g:368:5: lv_mult_2_0= RULE_MULT
                    {
                    lv_mult_2_0=(Token)match(input,RULE_MULT,FOLLOW_2); 

                    					newLeafNode(lv_mult_2_0, grammarAccess.getOperatorAccess().getMultMULTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"mult",
                    						lv_mult_2_0,
                    						"org.xtext.example.Entity.MULT");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEntity.g:385:3: ( (lv_div_3_0= RULE_DIV ) )
                    {
                    // InternalEntity.g:385:3: ( (lv_div_3_0= RULE_DIV ) )
                    // InternalEntity.g:386:4: (lv_div_3_0= RULE_DIV )
                    {
                    // InternalEntity.g:386:4: (lv_div_3_0= RULE_DIV )
                    // InternalEntity.g:387:5: lv_div_3_0= RULE_DIV
                    {
                    lv_div_3_0=(Token)match(input,RULE_DIV,FOLLOW_2); 

                    					newLeafNode(lv_div_3_0, grammarAccess.getOperatorAccess().getDivDIVTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperatorRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"div",
                    						lv_div_3_0,
                    						"org.xtext.example.Entity.DIV");
                    				

                    }


                    }


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
    // $ANTLR end "ruleoperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000712L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});

}