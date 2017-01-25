package FraudMgmtSys.Entity;

import FraudMgmtSys.cards.Card;

/**
 * Created by siddhahastmohapatra on 20/01/17.
 */
public class FraudCardsDB implements FraudCards {

    //Define the database driver manager class
    /*
    DB manager class will maintain a lit of connections to the database.
     */

    @Override
    public boolean isCardFraud(Card card) {
        //Make a database query to check whether it exits in the fraud list or not.
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
