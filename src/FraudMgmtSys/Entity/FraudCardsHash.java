package FraudMgmtSys.Entity;

import FraudMgmtSys.cards.Card;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class FraudCardsHash implements FraudCards {

    private Map<Integer, Card> map = new HashMap<Integer, Card>();

    @Override
    public boolean isCardFraud(Card card) {
        return false;
    }

    @Override
    public Iterable getFraudCardsList() {
        return null;
    }

    @Override
    public void addACardToFraudList(Card card) {

    }

    @Override
    public void removeACardFromFraudList(Card card) {

    }
}
