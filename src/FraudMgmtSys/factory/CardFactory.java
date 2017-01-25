package FraudMgmtSys.factory;

import FraudMgmtSys.Entity.CardDetails;
import FraudMgmtSys.cards.*;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class CardFactory {

    private CardFactory(){

    }

    private static CardFactory factory = new CardFactory();

    public static CardFactory getFactory(){
        return factory;
    }

    public Card getCard(CardType cardType, CardDetails details){
        if(cardType==CardType.CREDIT_CARD){
            return new CreditCard(details.getName(), details.getCardNumber(), details.getServiceProvider(),
                    details.getCvv(), details.getExpiryDate());
        } else if(cardType == CardType.DEBIT_CARD){
            return new DebitCard(details.getName(), details.getCardNumber(), details.getServiceProvider(),
                    details.getCvv(), details.getExpiryDate());
        } else{
            return new InvalidCard(details.getName(), details.getCardNumber(), details.getServiceProvider(),
                    details.getCvv(), details.getExpiryDate());
        }
    }

}
