package main.mdaActions;

import main.dataStore.DataStore;

import javax.xml.crypto.Data;

/**
 * Created by HarshPatil on 4/22/17.
 * This is the abstract class for payByCreditMsg MDA action
 * This is used to implement Strategy Pattern
 */
public abstract class PayByCreditMsg {

    public abstract void payByCreditMessage();
}
