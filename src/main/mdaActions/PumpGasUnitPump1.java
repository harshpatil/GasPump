package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the pumpGasUnit MDA action class for GAS PUMP 1
 * Responsible for displaying gas pumped messages
 * This is used to implement Strategy Pattern
 */
public class PumpGasUnitPump1 extends PumpGasUnit {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void pumpGasUnit(){
        System.out.println("PUMPING 1 GALLON GAS ... ");
        int gallon = dataStoreGasPump1.getGallon();
        gallon= gallon + 1;
        float total = (gallon * dataStoreGasPump1.getPrice());
        dataStoreGasPump1.setTotal(total);
        dataStoreGasPump1.setGallon(gallon);
    }
}
