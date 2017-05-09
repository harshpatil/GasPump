package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the class for First state
 * This is used to implement State Pattern
 */
public class FirstState extends MDAEFSMStates {

    public FirstState(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Activate() MDA event is triggered.
     * Calls SaveData MDA action and changes current state to S0
     */
    public void activate(){
        outputProcessor.saveData();
        mdaefsmMain.changeState(1);
    }
}
