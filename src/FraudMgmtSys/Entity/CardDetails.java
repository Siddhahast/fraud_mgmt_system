package FraudMgmtSys.Entity;

import java.util.Date;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class CardDetails {

    private int cardNumber;
    private String name;
    private String serviceProvider;
    private int cvv;
    private String expiryDate;

    public String getName() {
        return name;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public int getCvv() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCardNumber() {
        return cardNumber;

    }

    public CardDetails(String name, int cardNumber, String serviceProvider, int cvv, String expiryDate){
        this.cardNumber = cardNumber;
        this.name = name;
        this.serviceProvider = serviceProvider;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }



}
