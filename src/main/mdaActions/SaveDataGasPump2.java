package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the saveData MDA action class for GAS PUMP 2
 * Responsible for saving gas prices from temporary store to actual variable
 * This is used to implement Strategy Pattern
 */
public class SaveDataGasPump2 extends SaveData {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void saveData() {
        dataStoreGasPump2.setRegularGasPrice(dataStoreGasPump2.getTemp_a());
        dataStoreGasPump2.setPremiumGasPrice(dataStoreGasPump2.getTemp_b());
        dataStoreGasPump2.setSuperGasPrice(dataStoreGasPump2.getTemp_c());
        System.out.println("GAS PRICES HAVE BEEN SAVED");
    }
}
