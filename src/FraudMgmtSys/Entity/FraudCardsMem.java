package FraudMgmtSys.Entity;

import FraudMgmtSys.cards.Card;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class FraudCardsMem implements FraudCards {

    private Set<Card> cards = new HashSet<Card>();

    @Override
    public boolean isCardFraud(Card card) {
        return cards.contains(card);
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
