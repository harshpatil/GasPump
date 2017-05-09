package main.mdaActions;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the payByCreditMsg MDA action class for GAS PUMP 1
 * Responsible for displaying credit card payment invocation
 * This is used to implement Strategy Pattern
 */
public class PayByCreditMsgPump1 extends PayByCreditMsg {

    public void payByCreditMessage(){
        System.out.print("PAY BY CREDIT OPERATION SELECTED \n");
    }
}
