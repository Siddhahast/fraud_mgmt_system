package FraudMgmtSys.p3Service;

import FraudMgmtSys.Entity.FraudCards;
import FraudMgmtSys.fraud_exceptions.FraudCardException;
import FraudMgmtSys.cards.Card;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class FraudDetectorService {

    private static FraudDetectorService service = new FraudDetectorService();
    FraudCards fraudCards;

    public void setFraudCards(FraudCards cards){
        this.fraudCards = fraudCards;
    }

    private FraudDetectorService(){
        fraudCards.addACardToFraudList(null);
    }

    public static FraudDetectorService getService(){
        return service;
    }

    public void detectFraud(Card card) throws Exception {

        if(fraudCards.isCardFraud(card)){
                //stop payment .
            throw new FraudCardException();
        } else{
                //Check whether the card is good for payment or not using the external api.
            boolean result = false;
            if(result){
                fraudCards.addACardToFraudList(card);
                throw new FraudCardException();
                    //Stop payment
            } else{
                //Proceed to submit payment.

            }
        }
    }

    public void addACardtoFraudList(Card card){
        fraudCards.addACardToFraudList(card);
    }

    public void removeCardFromFraudList(Card card){
        fraudCards.removeACardFromFraudList(card);
    }

}
