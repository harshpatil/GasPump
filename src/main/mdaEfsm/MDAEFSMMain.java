package main.mdaEfsm;

import main.outputProcessor.OutputProcessor;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the main MDA_EFSM class
 * This is used to implement State Pattern
 */
public class MDAEFSMMain {

    public MDAEFSMStates[] mdaEfsmStatesList; // array variable to store objects of all states
    public MDAEFSMStates currentState; // variable to store current state

    /**
     * This constructor creates object of all the states and assigns first state to current state
     * @param outputProcessor
     */
    public MDAEFSMMain(OutputProcessor outputProcessor){
        mdaEfsmStatesList = new MDAEFSMStates[8];
        mdaEfsmStatesList[0] = new FirstState(this, outputProcessor);
        mdaEfsmStatesList[1] = new S0(this, outputProcessor);
        mdaEfsmStatesList[2] = new S1(this, outputProcessor);
        mdaEfsmStatesList[3] = new S2(this, outputProcessor);
        mdaEfsmStatesList[4] = new S3(this, outputProcessor);
        mdaEfsmStatesList[5] = new S4(this, outputProcessor);
        mdaEfsmStatesList[6] = new S5(this, outputProcessor);
        mdaEfsmStatesList[7] = new S6(this, outputProcessor);

        currentState = mdaEfsmStatesList[0];
    }

    /**
     * This method gets called when Activate() meta event is triggered
     */
    public void activate(){
        currentState.activate();
    }

    /**
     * This method gets called when Start() meta event is triggered
     */
    public void start(){
        currentState.start();
    }

    /**
     * This method gets called when PayType(int type) meta event is triggered
     * @param type
     */
    public void payType(int type){
        currentState.payType(type);
    }

    /**
     * This method gets called when Approved() meta event is triggered
     */
    public void paymentApproved(){
        currentState.paymentApproved();
    }

    /**
     * This method gets called when Reject() meta event is triggered
     */
    public void paymentRejected(){
        currentState.paymentRejected();
    }

    /**
     * This method gets called when Cancel() meta event is triggered
     */
    public void cancelTransaction(){
        currentState.cancelTransaction();
    }

    /**
     * This method gets called when SelectGas(int gasType) meta event is triggered
     * @param gasType
     */
    public void selectGas(int gasType){
        currentState.selectGas(gasType);
    }

    /**
     * This method gets called when StartPump() meta event is triggered
     */
    public void startPump(){
        currentState.startPump();
    }

    /**
     * This method gets called when Pump() meta event is triggered
     */
    public void pump(){
        currentState.pump();
    }

    /**
     * This method gets called when StopPump() meta event is triggered
     */
    public void stopPump(){
        currentState.stopPump();
    }

    /**
     * This method gets called when Receipt() meta event is triggered
     */
    public void receipt(){
        currentState.receipt();
    }

    /**
     * This method gets called when NoReceipt() meta event is triggered
     */
    public void noReceipt(){
        currentState.noReceipt();
    }

    /**
     * This method is responsible to change current state
     * @param i
     */
    public void changeState(int i) {
        currentState = mdaEfsmStatesList[i];
    }
}
