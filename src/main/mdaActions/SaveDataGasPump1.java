package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the saveData MDA action class for GAS PUMP 1
 * Responsible for saving gas prices from temporary store to actual variable
 * This is used to implement Strategy Pattern
 */
public class SaveDataGasPump1 extends SaveData {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void saveData(){
        dataStoreGasPump1.setRegularGasPrice(dataStoreGasPump1.getTemp_a());
        dataStoreGasPump1.setSuperGasPrice(dataStoreGasPump1.getTemp_b());
        System.out.println("GAS PRICES HAVE BEEN SAVED");
    }
}
