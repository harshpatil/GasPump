package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the saveCash MDA action class for GAS PUMP 2
 * Responsible for saving cash from temporary store to actual variable
 * This is used to implement Strategy Pattern
 */
public class SaveCashGasPump2 extends SaveCash {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void saveCash() {
        dataStoreGasPump2.setCash(dataStoreGasPump2.getTemp_cash());
    }
}
