package main.mdaEfsm;

import main.dataStore.DataStore;
import main.factory.AbstractFactory;
import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This class is the base class of all the state classes
 * This is used to implement State Pattern
 */
public class MDAEFSMStates {

    MDAEFSMMain mdaefsmMain; // reference variable to MDAEFSMMain
    OutputProcessor outputProcessor; // reference variable to OutputProcessor

    public MDAEFSMStates(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor){
        mdaefsmMain = mdaEfsmMain;
        this.outputProcessor = outputProcessor;
    }

    public void activate(){

    }

    public void start(){

    }

    public void payType(int type){

    }

    public void paymentApproved(){

    }

    public void paymentRejected(){

    }

    public void cancelTransaction(){

    }

    public void selectGas(int gasType){

    }

    public void startPump(){

    }

    public void pump(){

    }

    public void stopPump(){

    }

    public void receipt(){

    }

    public void noReceipt(){

    }

}
