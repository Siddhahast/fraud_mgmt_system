package FraudMgmtSys.Entity;

import FraudMgmtSys.cards.Card;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public interface FraudCards {

    public boolean isCardFraud(Card card);

    public Iterable getFraudCardsList();

    public void addACardToFraudList(Card card);

    public void removeACardFromFraudList(Card card);

}
