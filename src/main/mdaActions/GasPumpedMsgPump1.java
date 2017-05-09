package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the gasPumpedMsg MDA action class for GAS PUMP 1
 * Responsible for displaying gas pumped message
 * This is used to implement Strategy Pattern
 */
public class GasPumpedMsgPump1 extends GasPumpedMsg {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    public void gasPumpedMsg(){
        System.out.println("1 GALLON GAS HAS BEEN PUMPED");
        System.out.println("TOTAL GALLONS = " + dataStoreGasPump1.getGallon());
        System.out.println("ENTER 9 TO PUMP ANOTHER GALLON");
        System.out.println("ENTER 10 TO STOP");
    }
}
