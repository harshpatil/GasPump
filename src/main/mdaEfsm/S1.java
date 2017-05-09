package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the class for S1 state
 * This is used to implement State Pattern
 */
public class S1 extends MDAEFSMStates {

    public S1(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when PayType(int type) MDA event is triggered.
     * Calls PayByCreditMsg or SaveCash, DisplayMenu MDA action depending on value of type
     * and changes current state to S2, S3 respectively
     * @param type
     */
    public void payType(int type){
        if(type == 1){
            outputProcessor.payByCreditMsg();
            mdaefsmMain.changeState(3);
        } else if(type == 2){
            outputProcessor.saveCash();
            outputProcessor.displayMenu();
            mdaefsmMain.changeState(4);
        }

    }
}
