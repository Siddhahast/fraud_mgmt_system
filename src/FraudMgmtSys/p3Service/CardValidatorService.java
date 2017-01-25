package FraudMgmtSys.p3Service;

import FraudMgmtSys.cards.Card;
import FraudMgmtSys.cards.InvalidCard;
import FraudMgmtSys.fraud_exceptions.InvalidCardException;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class CardValidatorService {

    public void validateCardType(Card card) throws Exception{
        if(card instanceof InvalidCard){
            throw new InvalidCardException();
        }
    }


}
