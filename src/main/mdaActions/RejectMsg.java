package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the rejectMsg MDA action class for GAS PUMP 1
 * Responsible for displaying card rejection message
 * This is used to implement Strategy Pattern
 */
public class RejectMsg extends RejectMsgAbstract {

    @Override
    public void rejectMsg(){
        System.out.println("CARD REJECTED, TRY AGAIN");
    }
}
