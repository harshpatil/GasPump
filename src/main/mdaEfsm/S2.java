package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the S2 state class
 * This is used to implement State Pattern
 */
public class S2 extends MDAEFSMStates {

    public S2(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Approved() MDA event is triggered.
     * Calls DisplayMenu MDA action and changes current state to S3
     */
    public void paymentApproved(){
        outputProcessor.displayMenu();
        mdaefsmMain.changeState(4);
    }

    /**
     * This method gets executed when Reject() MDA event is triggered.
     * Calls RejectMsg MDA action and changes current state to S0
     */
    public void paymentRejected(){
        outputProcessor.rejectMsg();
        mdaefsmMain.changeState(1);
    }
}
