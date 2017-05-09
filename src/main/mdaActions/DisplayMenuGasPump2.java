package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the cancelMsg MDA action class for GAS PUMP 2
 * Responsible for displaying FUEL Menu
 * This is used to implement Strategy Pattern
 */
public class DisplayMenuGasPump2 extends DisplayMenu {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    /**
     * This method is the implementation of displayMenu action
     */
    @Override
    public void displayMenu() {
        System.out.println("CASH $"+ dataStoreGasPump2.getCash() +" HAS BEEN ACCEPTED");
        System.out.println("\t FUEL MENU");
        System.out.println("ENTER 4 for REGULAR");
        System.out.println("ENTER 5 for PREMIUM");
        System.out.println("ENTER 6 for SUPER");
        System.out.println("ENTER 3 for CANCELLING TRANSACTION");
    }
}
