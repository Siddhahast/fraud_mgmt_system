package FraudMgmtSys.cards;

import FraudMgmtSys.FMS_Constants;
import FraudMgmtSys.fraud_exceptions.FraudCardException;
import FraudMgmtSys.p3Service.CSPService;
import FraudMgmtSys.p3Service.FraudDetectorService;
import FraudMgmtSys.p3Service.VisaService;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class CreditCard extends Card implements PaymentCard{

    FraudDetectorService service = FraudDetectorService.getService();

    public CreditCard(String name, int cardNumber, String serviceProvider, int cvv, String expiryDate){
        super(name, cardNumber, serviceProvider, cvv, expiryDate);
    }

    @Override
    public String submitPayment() {
        CSPService service = new VisaService();
        service.submitPayment();
        return FMS_Constants.CC_SERVICE_PROVIDER_SUCCESS;
    }
}
