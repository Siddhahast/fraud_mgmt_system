package FraudMgmtSys.services;

import FraudMgmtSys.cards.Card;
import FraudMgmtSys.cards.CreditCard;
import FraudMgmtSys.cards.PaymentCard;
import FraudMgmtSys.fraud_exceptions.FraudCardException;
import FraudMgmtSys.fraud_exceptions.InvalidCardException;
import FraudMgmtSys.p3Service.CardValidatorService;
import FraudMgmtSys.p3Service.FraudDetectorService;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class OrderService {

    FraudDetectorService service = FraudDetectorService.getService();
    CardValidatorService cardValidatorService = new CardValidatorService();
    Payments payments;

    public OrderService(){
        payments = new Payments();
    }

    public String confirmOrder(Card card){
        String message = null;
        try {
            cardValidatorService.validateCardType(card);
            service.detectFraud(card);
            message = payments.pay((PaymentCard) card);
        } catch (FraudCardException e) {
            message = "Fraud detected";
        } catch (InvalidCardException e) {
            message = "Invalid Card";
        } catch (Exception e){
            message = "some exception";
        }
        return message;
    }

}
