package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the printReceipt MDA action class for GAS PUMP 1
 * Responsible for printing receipt
 * This is used to implement Strategy Pattern
 */
public class PrintReceiptGasPump1 extends PrintReceipt {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void printReceipt(){
        System.out.println("\t RECEIPT");
        System.out.println("TOTAL AMOUNT = $"+dataStoreGasPump1.getTotal());
    }
}
