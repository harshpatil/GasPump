package main.pumps;

import main.dataStore.DataStore;
import main.dataStore.DataStoreGasPump1;
import main.factory.AbstractFactory;
import main.mdaEfsm.*;

/**
 * Created by HarshPatil on 4/19/17.
 * This class is the input processor for GAS PUMP 1
 */
public class GasPump1 {

    DataStoreGasPump1 gasPump1DataStore; // reference variable of gas pump 1 data store
    MDAEFSMMain mdaEfsmMain; // reference variable of MDAEFSMMain

    /**
     * Constructor to assign data store and mda efsm main
     * @param mdaefsmMain
     * @param abstractFactory
     */
    public GasPump1(MDAEFSMMain mdaefsmMain, AbstractFactory abstractFactory){
        this.mdaEfsmMain = mdaefsmMain;
        gasPump1DataStore = (DataStoreGasPump1) abstractFactory.getDataStoreObject();
    }

    /**
     * This method validates input values a, b. Stores it in temporary variables
     * and calls activate() event
     * @param a
     * @param b
     */
    public void Activate (float a, float b){
        if(a>0.0 && b>0.0) {
            gasPump1DataStore.setTemp_a(a);
            gasPump1DataStore.setTemp_b(b);
            mdaEfsmMain.activate();
        } else {
            System.out.println("PRICES NEED TO BE GREATER THAN 0");
        }
    }

    /**
     * This method calls MDA EFSM start event
     */
    public void Start() {
        mdaEfsmMain.start();
    }

    /**
     * This method calls MDA EFSM payType event
     */
    public void PayCredit(){
        mdaEfsmMain.payType(1);
    }

    /**
     * This method calls MDA EFSM reject event
     */
    public void Reject() {
        mdaEfsmMain.paymentRejected();
    }

    /**
     * This method calls MDA EFSM cancel event
     */
    public void Cancel() {
        mdaEfsmMain.cancelTransaction();
    }

    /**
     * This method calls MDA EFSM approved event
     */
    public void Approved() {
        mdaEfsmMain.paymentApproved();
    }

    /**
     * This method calls MDA EFSM selectGas(int gasType) event
     */
    public void Regular() {
        // Regular = 1, Super = 2
        mdaEfsmMain.selectGas(1);
    }

    /**
     * This method calls MDA EFSM selectGas(int gasType) event
     */
    public void Super() {
        // Regular = 1, Super = 2
        mdaEfsmMain.selectGas(2);
    }

    /**
     * This method calls MDA EFSM startPump event
     */
    public void StartPump() {
        mdaEfsmMain.startPump();
    }

    /**
     * This method calls MDA EFSM pump event
     */
    public void PumpGallon(){
        mdaEfsmMain.pump();
    }

    /**
     * This method calls MDA EFSM stopPump & receipt events
     */
    public void StopPump(){
        mdaEfsmMain.stopPump();
        mdaEfsmMain.receipt();
    }
}
