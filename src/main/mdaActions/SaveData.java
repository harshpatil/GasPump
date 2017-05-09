package main.mdaActions;

import main.dataStore.DataStore;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the abstract class for saveData MDA action
 * This is used to implement Strategy Pattern
 */
public abstract class SaveData {

    public abstract void initialize(DataStore dataStore);
    public abstract void saveData();
}
