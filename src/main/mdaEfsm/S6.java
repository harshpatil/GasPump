package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the S6 state class
 * This is used to implement State Pattern
 */
public class S6 extends MDAEFSMStates {

    public S6(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Receipt() MDA event is triggered.
     * Calls PrintReceipt, ReturnCash MDA action and changes current state to S1
     */
    public void receipt(){
        outputProcessor.printReceipt();
        outputProcessor.returnCash();
        mdaefsmMain.changeState(1);
    }

    /**
     * This method gets executed when NoReceipt() MDA event is triggered.
     * Calls ReturnCash MDA action and changes current state to S1
     */
    public void noReceipt(){
        outputProcessor.returnCash();
        mdaefsmMain.changeState(1);
    }
}
