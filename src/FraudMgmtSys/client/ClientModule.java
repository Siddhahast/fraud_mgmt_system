package FraudMgmtSys.client;

import FraudMgmtSys.Entity.CardDetails;
import FraudMgmtSys.cards.Card;
import FraudMgmtSys.cards.CardType;
import FraudMgmtSys.factory.CardFactory;
import FraudMgmtSys.services.OrderService;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class ClientModule {

    public static void main(String[] args) {

        Card card = CardFactory.getFactory().getCard(CardType.INVALID_CARD, new CardDetails(
                "siddhahast", 123479, "visa", 311, "09/19"
        ));
        OrderService service = new OrderService();
        System.out.println(service.confirmOrder(card));

    }

}
