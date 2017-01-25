package FraudMgmtSys.cards;

import java.util.Date;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public abstract class Card {

    protected int cardNumber;
    protected String name;
    protected String serviceProvider;
    protected int cvv;
    protected String expiryDate;

    public Card(String name, int cardNumber, String serviceProvider, int cvv, String expiryDate){
        this.cardNumber = cardNumber;
        this.name = name;
        this.serviceProvider = serviceProvider;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public int getCardNumber(){
        return cardNumber;
    }

}
