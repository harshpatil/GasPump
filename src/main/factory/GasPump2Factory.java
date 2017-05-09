package main.factory;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump2;
import main.mdaActions.*;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the factory class for GAS PUMP 2
 * Responsible for creating objects of data store and actions class for GAS PUMP 2
 * This is used to implement Abstract Pattern
 */
public class GasPump2Factory extends AbstractFactory {

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
     * Constructor creating objects of all the actions and data store for gas pump 2
     */
    public GasPump2Factory(){
        this.dataStoreObject = new DataStoreGasPump2();
        this.saveDataObject = new SaveDataGasPump2();
        this.payMsgObject = new PayMsgGasPump2();
        this.displayMenuObject = new DisplayMenuGasPump2();
        this.rejectMsgAbstractObject = new RejectMsg();
        this.setPriceObject = new SetPriceGasPump2();
        this.readyMsgAbstractObject = new ReadyMsg();
        this.setInitialValuesObject = new SetInitialValuesGasPump2();
        this.pumpGasUnitObject = new PumpGasUnitPump2();
        this.gasPumpedMsgObject = new GasPumpedMsgPump2();
        this.stopMsgObject = new StopMsgGasPump2();
        this.printReceiptObject = new PrintReceiptGasPump2();
        this.cancelMsgAbstractObject = new CancelMsg();
        this.returnCashObject = new ReturnCashGasPump2();
        this.payByCreditMsgObject = new PayByCreditMsgPump2();
        this.saveCashObject = new SaveCashGasPump2();
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
