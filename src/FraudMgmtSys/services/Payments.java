package FraudMgmtSys.services;

import FraudMgmtSys.cards.PaymentCard;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class Payments {

    public String pay(PaymentCard card){
        System.out.println(card.submitPayment());
        return card.submitPayment();
    }

}
