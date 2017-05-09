package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the gasPumpedMsg MDA action class for GAS PUMP 2
 * Responsible for displaying gas pumped message
 * This is used to implement Strategy Pattern
 */
public class GasPumpedMsgPump2 extends GasPumpedMsg {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void gasPumpedMsg() {
        System.out.println("1 LITER GAS HAS BEEN PUMPED");
        System.out.println("TOTAL LITERS = " + dataStoreGasPump2.getLiter());
        System.out.println("ENTER 8 TO PUMP ANOTHER LITER");
        System.out.println("ENTER 9 TO STOP");
    }
}
