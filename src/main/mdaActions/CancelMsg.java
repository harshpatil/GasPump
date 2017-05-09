package main.mdaActions;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the common class for cancelMsg MDA action
 * Responsible for printing cancel message
 * This is used to implement Strategy Pattern
 */
public class CancelMsg extends CancelMsgAbstract {

    @Override
    public void cancelMsg(){
        System.out.println("TRANSACTION CANCELLED, START AGAIN");
    }
}
