package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the printReceipt MDA action class for GAS PUMP 2
 * Responsible for printing receipt
 * This is used to implement Strategy Pattern
 */
public class PrintReceiptGasPump2 extends PrintReceipt {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void printReceipt() {
        System.out.println("\t RECEIPT");
        System.out.println("TOTAL LITER = "+ dataStoreGasPump2.getLiter());
        System.out.println("TOTAL AMOUNT = $"+dataStoreGasPump2.getTotal());
    }
}
