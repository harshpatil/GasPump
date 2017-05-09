package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the S5 state class
 * This is used to implement State Pattern
 */
public class S5 extends MDAEFSMStates {

    public S5(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Pump() MDA event is triggered.
     * Calls PumpGasUnit & GasPumpedMsg MDA actions
     */
    public void pump(){
        outputProcessor.pumpGasUnit();
        outputProcessor.gasPumpedMsg();
    }

    /**
     * This method gets executed when StopPump() MDA event is triggered.
     * Calls StopMsg MDA action and changes current state to S6
     */
    public void stopPump(){
        outputProcessor.stopMsg();
        mdaefsmMain.changeState(7);
    }
}
