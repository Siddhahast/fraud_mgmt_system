package FraudMgmtSys.cards;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class InvalidCard extends Card implements PaymentCard {

    public InvalidCard(String name, int cardNumber, String serviceProvider, int cvv, String expiryDate){
        super(name, cardNumber, serviceProvider, cvv, expiryDate);
    }

    @Override
    public String submitPayment() {
        return "This card is invalid. Dont proceed for payment.";
    }

}
