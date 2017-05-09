package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the class for S0 state
 * This is used to implement State Pattern
 */
public class S0 extends MDAEFSMStates {

    public S0(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Start() MDA event is triggered.
     * Calls PayMsg MDA action and changes current state to S1
     */
    public void start(){
        outputProcessor.payMsg();
        mdaefsmMain.changeState(2);
    }
}
