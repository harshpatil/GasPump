package main.mdaActions;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the stopMsg MDA action class for GAS PUMP 2
 * Responsible for displaying gas pump stopped message
 * This is used to implement Strategy Pattern
 */
public class StopMsgGasPump2 extends StopMsg {

    @Override
    public void stopMessage() {
        System.out.println("GAS PUMP HAS BEEN STOPPED");
    }
}
