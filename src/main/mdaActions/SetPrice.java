package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the abstract class for setInitialValues MDA action
 * This is used to implement Strategy Pattern
 */
public abstract class SetPrice {

    public abstract void initialize(DataStore dataStore);
    public abstract void setPrice(int gasType);
}
