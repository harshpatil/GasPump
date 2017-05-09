package main.mdaActions;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the setPrice MDA action class for GAS PUMP 1
 * Responsible for setting price depending gas type chosen
 * This is used to implement Strategy Pattern
 */
public class SetPriceGasPump1 extends SetPrice {

    DataStoreGasPump1 dataStoreGasPump1;

    @Override
    public void initialize(DataStore dataStore) {
        this.dataStoreGasPump1 = (DataStoreGasPump1) dataStore;
    }

    @Override
    public void setPrice(int gasType){
        if(gasType == 1){
            dataStoreGasPump1.setPrice(dataStoreGasPump1.getRegularGasPrice());
            System.out.println("REGULAR GAS : $"+ dataStoreGasPump1.getPrice() +"/GALLON HAS BEEN SELECTED");
        }
        if(gasType == 2){
            dataStoreGasPump1.setPrice(dataStoreGasPump1.getSuperGasPrice());
            System.out.println("SUPER GAS : $"+ dataStoreGasPump1.getPrice() + "/GALLON HAS BEEN SELECTED");
        }
    }
}
