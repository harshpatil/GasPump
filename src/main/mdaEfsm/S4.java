package main.mdaEfsm;

import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the S4 state class
 * This is used to implement State Pattern
 */
public class S4 extends MDAEFSMStates {

    public S4(MDAEFSMMain mdaEfsmMain, OutputProcessor outputProcessor) {
        super(mdaEfsmMain, outputProcessor);
    }

    /**
     * This method gets executed when StartPump() MDA event is triggered.
     * Calls SetInitialValues, ReadyMsg MDA action and changes current state to S5
     */
    public void startPump(){
        outputProcessor.setInitialValues();
        outputProcessor.readyMsg();
        mdaefsmMain.changeState(6);
    }
}
