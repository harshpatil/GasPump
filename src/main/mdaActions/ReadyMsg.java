package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the readyMsg MDA action class for both pumps
 * Responsible for displaying gas pump being ready to fill message
 * This is used to implement Strategy Pattern
 */
public class ReadyMsg extends ReadyMsgAbstract {

    @Override
    public void readyMessage(){
        System.out.println("GAS PUMP HAS BEEN STARTED AND IS READY TO FILL");
    }
}
