package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the pumpGasUnit MDA action class for GAS PUMP 2
 * Responsible for displaying gas pumped messages
 * This is used to implement Strategy Pattern
 */
public class PumpGasUnitPump2 extends PumpGasUnit {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void pumpGasUnit() {
        System.out.println("PUMPING 1 LITER GAS ... ");
        int liter = dataStoreGasPump2.getLiter();
        liter = liter+1;
        int total = (liter*dataStoreGasPump2.getPrice());
        dataStoreGasPump2.setTotal(total);
        dataStoreGasPump2.setLiter(liter);
    }
}
