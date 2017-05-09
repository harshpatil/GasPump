package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the setInitialValues MDA action class for GAS PUMP 1
 * Responsible for setting Total and Gallon to 0
 * This is used to implement Strategy Pattern
 */
public class SetInitialValuesGasPump1 extends SetInitialValues {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void setInitialValues() {
        dataStoreGasPump1.setTotal(0.0f);
        dataStoreGasPump1.setGallon(0);
        System.out.println("SETTING TOTAL AMOUNT = "+ dataStoreGasPump1.getTotal());
        System.out.println("SETTING TOTAL GALLONS = "+ dataStoreGasPump1.getGallon());
    }
}
