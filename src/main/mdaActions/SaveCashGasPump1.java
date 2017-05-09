package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the saveCash MDA action class for GAS PUMP 1
 * This is empty as Gas pump 1 does not work with cash
 * This is used to implement Strategy Pattern
 */
public class SaveCashGasPump1 extends SaveCash {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void saveCash() {

    }
}
