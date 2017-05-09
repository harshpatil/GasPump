package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the S3 state class
 * This is used to implement State Pattern
 */
public class S3 extends MDAEFSMStates {

    public S3(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when Cancel() MDA event is triggered.
     * Calls CancelMsg, ReturnCash MDA actions and changes current state to S0
     */
    public void cancelTransaction(){
        outputProcessor.cancelMsg();
        outputProcessor.returnCash();
        mdaefsmMain.changeState(1);
    }

    /**
     * This method gets executed when SelectGas(int gasType) MDA event is triggered.
     * Calls SetPrice MDA action and changes current state to S4
     * @param gasType
     */
    public void selectGas(int gasType){
        outputProcessor.setPrice(gasType);
        mdaefsmMain.changeState(5);
    }
}
