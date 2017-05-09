package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the returnCash MDA action class for GAS PUMP 2
 * Responsible for returning remaining cash to user
 * This is used to implement Strategy Pattern
 */
public class ReturnCashGasPump2 extends ReturnCash {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void returnCash() {

        int total = dataStoreGasPump2.getTotal();
        int cash = dataStoreGasPump2.getCash();
        if(cash-total > 0){
            System.out.println("COLLECT $"+(cash-total));
        }else {
            System.out.println("THANKS FOR USING");
        }
        dataStoreGasPump2.setLiter(0);
        dataStoreGasPump2.setCash(0);
        dataStoreGasPump2.setTotal(0);

    }
}
