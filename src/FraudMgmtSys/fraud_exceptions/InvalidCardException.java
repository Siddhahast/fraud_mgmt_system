package FraudMgmtSys.fraud_exceptions;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class InvalidCardException extends Exception{
    private String message = "This card is listed in the frauds list";

    public String getMessage(){
        return message;
    }
}
