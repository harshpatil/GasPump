package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the setInitialValues MDA action class for GAS PUMP 2
 * Responsible for setting Total and Liters to 0
 * This is used to implement Strategy Pattern
 */
public class SetInitialValuesGasPump2 extends SetInitialValues {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void setInitialValues() {
        dataStoreGasPump2.setTotal(0);
        dataStoreGasPump2.setLiter(0);
        System.out.println("SETTING TOTAL AMOUNT = "+ dataStoreGasPump2.getTotal());
        System.out.println("SETTING TOTAL LITERS = "+ dataStoreGasPump2.getLiter());
    }
}
