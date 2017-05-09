package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/20/17.
 * This is the abstract class for displayMenu MDA action
 * This is used to implement Strategy Pattern
 */
public abstract class DisplayMenu {

    public abstract void displayMenu();
    public abstract void initialize(DataStore dataStore);
}
