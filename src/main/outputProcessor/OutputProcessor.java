package main.outputProcessor;

import main.mdaActions.*;
import main.dataStore.DataStore;
import main.factory.AbstractFactory;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the Output Processor class.
 * Holds reference objects of all the MDA action classes, DataStore and Abstract Factory
 * This is used to implement Strategy Pattern
 */
public class OutputProcessor {

    SetInitialValues setInitialValues;
    ReadyMsgAbstract readyMsgAbstract;
    PumpGasUnit pumpGasUnit;
    GasPumpedMsg gasPumpedMsg;
    StopMsg stopMsg;
    PrintReceipt printReceipt;
    PayByCreditMsg payByCreditMsg;
    SaveCash saveCash;
    DataStore dataStore;
    SaveData saveData;
    PayMsg payMsg;
    DisplayMenu displayMenu;
    RejectMsgAbstract rejectMsgAbstract;
    CancelMsgAbstract cancelMsgAbstract;
    ReturnCash returnCash;
    SetPrice setPrice;

    /**
     * Constructor which takes AbstractFactory object as a parameter and initializes all the
     * reference objects using it.
     * @param abstractFactory
     */
    public OutputProcessor(AbstractFactory abstractFactory){
        this.dataStore = abstractFactory.getDataStoreObject();
        pumpGasUnit = abstractFactory.getPumpGasUnitObject();
        gasPumpedMsg = abstractFactory.getGasPumpedMsgObject();
        stopMsg = abstractFactory.getStopMsgObject();
        printReceipt = abstractFactory.getPrintReceiptObject();
        payByCreditMsg = abstractFactory.getPayByCreditMsgObject();
        saveCash = abstractFactory.getSaveCashObject();
        saveData = abstractFactory.getSaveDataObject();
        payMsg = abstractFactory.getPayMsgObject();
        displayMenu = abstractFactory.getDisplayMenuObject();
        rejectMsgAbstract = abstractFactory.getRejectMsgAbstractObject();
        cancelMsgAbstract = abstractFactory.getCancelMsgAbstractObject();
        returnCash = abstractFactory.getReturnCashObject();
        setPrice = abstractFactory.getSetPriceObject();
        setInitialValues = abstractFactory.getSetInitialValuesObject();
        readyMsgAbstract = abstractFactory.getReadyMsgAbstractObject();

        gasPumpedMsg.initialize(dataStore);
        printReceipt.initialize(dataStore);
        saveCash.initialize(dataStore);
        displayMenu.initialize(dataStore);
        returnCash.initialize(dataStore);
        saveData.initialize(dataStore);
        setPrice.initialize(dataStore);
        setInitialValues.initialize(dataStore);
        pumpGasUnit.initialize(dataStore);

    }

    /**
     * This method calls saveData MDA action
     */
    public void saveData(){
        saveData.saveData();
    }

    /**
     * This method calls payMsg MDA action
     */
    public void payMsg(){
        payMsg.payMsg();
    }

    /**
     * This method calls displayMenu MDA action
     */
    public void displayMenu(){
        displayMenu.displayMenu();
    }

    /**
     * This method calls rejectMsg MDA action
     */
    public void rejectMsg(){
        rejectMsgAbstract.rejectMsg();
    }

    /**
     * This method calls cancelMsg MDA action
     */
    public void cancelMsg(){
        cancelMsgAbstract.cancelMsg();
    }

    /**
     * This method calls returnCash MDA action
     */
    public void returnCash(){
        returnCash.returnCash();
    }

    /**
     * This method calls setPrice MDA action
     * @param gasType
     */
    public void setPrice(int gasType){
        setPrice.setPrice(gasType);
    }

    /**
     * This method calls setInitialValues MDA action
     */
    public void setInitialValues(){
        setInitialValues.setInitialValues();
    }

    /**
     * This method calls readyMsg MDA action
     */
    public void readyMsg(){
        readyMsgAbstract.readyMessage();
    }

    /**
     * This method calls pumpGasUnit MDA action
     */
    public void pumpGasUnit(){
        pumpGasUnit.pumpGasUnit();
    }

    /**
     * This method calls gasPumpedMsg MDA action
     */
    public void gasPumpedMsg(){
        gasPumpedMsg.gasPumpedMsg();
    }

    /**
     * This method calls stopMsg MDA action
     */
    public void stopMsg(){
        stopMsg.stopMessage();
    }

    /**
     * This method calls printReceipt MDA action
     */
    public void printReceipt(){
        printReceipt.printReceipt();
    }

    /**
     * This method calls payByCreditMsg MDA action
     */
    public void payByCreditMsg(){
        payByCreditMsg.payByCreditMessage();
    }

    /**
     * This method calls saveCash MDA action
     */
    public void saveCash(){
        saveCash.saveCash();
    }
}
