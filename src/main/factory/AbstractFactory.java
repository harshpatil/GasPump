package main.factory;

import main.dataStore.DataStore;
import main.mdaActions.*;

/**
 * Created by HarshPatil on 4/19/17.
 * This class is the abstract factory class
 * Responsible for creating objects of data store and actions class for both pumps
 * This is used to implement Abstract Pattern
 */
public abstract class AbstractFactory {

    public abstract DataStore getDataStoreObject();
    public abstract SaveData getSaveDataObject();
    public abstract PayMsg getPayMsgObject();
    public abstract SaveCash getSaveCashObject();
    public abstract DisplayMenu getDisplayMenuObject();
    public abstract RejectMsgAbstract getRejectMsgAbstractObject();
    public abstract SetPrice getSetPriceObject();
    public abstract ReadyMsgAbstract getReadyMsgAbstractObject();
    public abstract SetInitialValues getSetInitialValuesObject();
    public abstract PumpGasUnit getPumpGasUnitObject();
    public abstract GasPumpedMsg getGasPumpedMsgObject();
    public abstract StopMsg getStopMsgObject();
    public abstract PrintReceipt getPrintReceiptObject();
    public abstract CancelMsgAbstract getCancelMsgAbstractObject();
    public abstract ReturnCash getReturnCashObject();
    public abstract PayByCreditMsg getPayByCreditMsgObject();
}
