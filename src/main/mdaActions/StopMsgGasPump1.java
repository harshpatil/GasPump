package main.mdaActions;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the stopMsg MDA action class for GAS PUMP 1
 * Responsible for displaying gas pump stopped message
 * This is used to implement Strategy Pattern
 */
public class StopMsgGasPump1 extends StopMsg {

    public void stopMessage(){
        System.out.println("GAS PUMP HAS BEEN STOPPED");
        System.out.println("PLEASE COLLECT YOUR RECEIPT \n");
    }
}
