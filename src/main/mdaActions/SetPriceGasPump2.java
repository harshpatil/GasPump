package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the setPrice MDA action class for GAS PUMP 2
 * Responsible for setting price depending gas type chosen
 * This is used to implement Strategy Pattern
 */
public class SetPriceGasPump2 extends SetPrice {

    DataStoreGasPump2 dataStoreGasPump2;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump2 = (DataStoreGasPump2) dataStore;
    }

    @Override
    public void setPrice(int gasType) {
        if(gasType == 1){
            dataStoreGasPump2.setPrice(dataStoreGasPump2.getRegularGasPrice());
            System.out.println("REGULAR GAS : $"+ dataStoreGasPump2.getPrice() +"/LITER HAS BEEN SELECTED");
        }
        if(gasType == 2){
            dataStoreGasPump2.setPrice(dataStoreGasPump2.getPremiumGasPrice());
            System.out.println("PREMIUM GAS : $"+ dataStoreGasPump2.getPrice() + "/LITER HAS BEEN SELECTED");
        }
        if(gasType == 3){
            dataStoreGasPump2.setPrice(dataStoreGasPump2.getSuperGasPrice());
            System.out.println("SUPER GAS : $"+ dataStoreGasPump2.getPrice() + "/LITER HAS BEEN SELECTED");
        }
    }
}
