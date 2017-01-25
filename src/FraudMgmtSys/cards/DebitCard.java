package FraudMgmtSys.cards;

import FraudMgmtSys.FMS_Constants;
import FraudMgmtSys.p3Service.CSPService;
import FraudMgmtSys.p3Service.VisaService;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class DebitCard extends Card implements PaymentCard{

    public DebitCard(String name, int cardNumber, String serviceProvider, int cvv, String expiryDate){
        super(name, cardNumber, serviceProvider, cvv, expiryDate);
    }

    @Override
    public String submitPayment() {
        CSPService service = new VisaService();
        service.submitPayment();
        return FMS_Constants.DC_SERVICE_PROVIDER_SUCCESS;
    }
}
