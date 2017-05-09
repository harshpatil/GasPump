package main.mdaActions;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the payMsg MDA action class for GAS PUMP 2
 * Responsible for displaying available payment options
 * This is used to implement Strategy Pattern
 */
public class PayMsgGasPump2 extends PayMsg {

    @Override
    public void payMsg() {
        System.out.println("WELCOME !!");
        System.out.println("THIS PUMP ONLY ACCEPTS CASH");
    }
}
