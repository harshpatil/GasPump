package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the cancelMsg MDA action class for GAS PUMP 1
 * Responsible for displaying FUEL Menu
 * This is used to implement Strategy Pattern
 */
public class DisplayMenuGasPump1 extends DisplayMenu {

    DataStoreGasPump1 dataStoreGasPump1;

    /**
     * This method is the implementation of displayMenu action
     */
    @Override
    public void displayMenu(){
        System.out.println("CREDIT CARD PAYMENT HAS BEEN APPROVED");
        System.out.println("\t FUEL MENU");
        System.out.println("ENTER 6 for SUPER");
        System.out.println("ENTER 7 for REGULAR");
        System.out.println("ENTER 5 for CANCELLING TRANSACTION");
    }

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }
}
