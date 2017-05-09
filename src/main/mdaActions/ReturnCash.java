package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the abstract class for returnCash MDA action
 * This is used to implement Strategy Pattern
 */
public abstract class ReturnCash {

    public abstract void returnCash();
    public abstract void initialize(DataStore dataStore);
}
