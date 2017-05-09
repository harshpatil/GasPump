package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the payMsg MDA action class for GAS PUMP 1
 * Responsible for displaying available payment options
 * This is used to implement Strategy Pattern
 */
public class PayMsgGasPump1 extends PayMsg {

    @Override
    public void payMsg(){
        System.out.println("WELCOME !!");
        System.out.println("THIS PUMP ONLY ACCEPTS CREDIT CARD PAYMENT");
    }
}
