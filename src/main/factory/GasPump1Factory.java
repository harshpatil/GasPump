package main.factory;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;
import main.mdaActions.*;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the factory class for GAS PUMP 1
 * Responsible for creating objects of data store and actions class for GAS PUMP 1
 * This is used to implement Abstract Pattern
 */
public class GasPump1Factory extends AbstractFactory {

    public DataStore dataStoreObject;
    public SaveData saveDataObject;
    public PayMsg payMsgObject;
    public DisplayMenu displayMenuObject;
    public RejectMsgAbstract rejectMsgAbstractObject;
    public SetPrice setPriceObject;
    public ReadyMsgAbstract readyMsgAbstractObject;
    public SetInitialValues setInitialValuesObject;
    public PumpGasUnit pumpGasUnitObject;
    public GasPumpedMsg gasPumpedMsgObject;
    public StopMsg stopMsgObject;
    public PrintReceipt printReceiptObject;
    public CancelMsgAbstract cancelMsgAbstractObject;
    public ReturnCash returnCashObject;
    public PayByCreditMsg payByCreditMsgObject;
    public SaveCash saveCashObject;

    /**
     * Constructor creating objects of all the actions and data store for gas pump 1
     */
    public GasPump1Factory(){
        this.dataStoreObject = new DataStoreGasPump1();
        this.saveDataObject = new SaveDataGasPump1();
        this.payMsgObject = new PayMsgGasPump1();
        this.displayMenuObject = new DisplayMenuGasPump1();
        this.rejectMsgAbstractObject = new RejectMsg();
        this.setPriceObject = new SetPriceGasPump1();
        this.readyMsgAbstractObject = new ReadyMsg();
        this.setInitialValuesObject = new SetInitialValuesGasPump1();
        this.pumpGasUnitObject = new PumpGasUnitPump1();
        this.gasPumpedMsgObject = new GasPumpedMsgPump1();
        this.stopMsgObject = new StopMsgGasPump1();
        this.printReceiptObject = new PrintReceiptGasPump1();
        this.cancelMsgAbstractObject = new CancelMsg();
        this.returnCashObject = new ReturnCashGasPump1();
        this.payByCreditMsgObject = new PayByCreditMsgPump1();
        this.saveCashObject = new SaveCashGasPump1();
    }

    /**
     * Below are the methods to create objects of each MDA action class
     * @return
     */

    @Override
    public DataStore getDataStoreObject() {
        return dataStoreObject;
    }

    @Override
    public SaveData getSaveDataObject() {
        return saveDataObject;
    }

    @Override
    public PayMsg getPayMsgObject() {
        return payMsgObject;
    }

    @Override
    public SaveCash getSaveCashObject() {
        return saveCashObject;
    }

    @Override
    public DisplayMenu getDisplayMenuObject() {
        return displayMenuObject;
    }

    @Override
    public RejectMsgAbstract getRejectMsgAbstractObject() {
        return rejectMsgAbstractObject;
    }

    @Override
    public SetPrice getSetPriceObject() {
        return setPriceObject;
    }

    @Override
    public ReadyMsgAbstract getReadyMsgAbstractObject() {
        return readyMsgAbstractObject;
    }

    @Override
    public SetInitialValues getSetInitialValuesObject() {
        return setInitialValuesObject;
    }

    @Override
    public PumpGasUnit getPumpGasUnitObject() {
        return pumpGasUnitObject;
    }

    @Override
    public GasPumpedMsg getGasPumpedMsgObject() {
        return gasPumpedMsgObject;
    }

    @Override
    public StopMsg getStopMsgObject() {
        return stopMsgObject;
    }

    @Override
    public PrintReceipt getPrintReceiptObject() {
        return printReceiptObject;
    }

    public CancelMsgAbstract getCancelMsgAbstractObject() {
        return cancelMsgAbstractObject;
    }

    @Override
    public ReturnCash getReturnCashObject() {
        return returnCashObject;
    }

    @Override
    public PayByCreditMsg getPayByCreditMsgObject() {
        return payByCreditMsgObject;
    }
}
