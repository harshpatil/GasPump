package main.pumps;

import main.dataStore.DataStoreGasPump2;
import main.factory.AbstractFactory;
import main.mdaEfsm.MDAEFSMMain;

/**
 * Created by HarshPatil on 4/19/17.
 * This class is the input processor for GAS PUMP 2
 */
public class GasPump2 {

    private DataStoreGasPump2 dataStoreGasPump2; // reference variable of gas pump 1 data store
    MDAEFSMMain mdaEfsmMain; // reference variable of MDAEFSMMain

    /**
     * Constructor to assign data store and mda efsm main
     * @param mdaefsmMain
     * @param abstractFactory
     */
    public GasPump2(MDAEFSMMain mdaefsmMain, AbstractFactory abstractFactory){
        this.mdaEfsmMain = mdaefsmMain;
        dataStoreGasPump2 = (DataStoreGasPump2) abstractFactory.getDataStoreObject();
    }

    /**
     * This method validates input values a, b, c. Stores it in temporary variables
     * and calls activate() event
     * @param a
     * @param b
     * @param c
     */
    public void Activate (int a, int b, int c){
        if(a>0 && b>0 & c>0) {
            dataStoreGasPump2.setTemp_a(a);
            dataStoreGasPump2.setTemp_b(b);
            dataStoreGasPump2.setTemp_c(c);
            mdaEfsmMain.activate();
        }else {
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
     *
     * This method validates cash amount, stores it in temporary variable
     * and calls MDA EFSM payType(int type) event
     * @param cash
     */
    public void PayCash(int cash) {
        if (cash>0) {
            dataStoreGasPump2.setTemp_cash(cash);
            mdaEfsmMain.payType(2);
        }else {
            System.out.println("CASH NEEDS TO BE GREATER THAN 0");
        }
    }

    /**
     * This method calls MDA EFSM cancel event
     */
    public void Cancel() {
        mdaEfsmMain.cancelTransaction();
    }

    /**
     * This method calls MDA EFSM selectGas(int gasType) event
     */
    public void Regular() {
        // 1 → Regular, 2 → Premium, 3 → Super
        mdaEfsmMain.selectGas(1);
    }

    /**
     * This method calls MDA EFSM selectGas(int gasType) event
     */
    public void Premium() {
        // 1 → Regular, 2 → Premium, 3 → Super
        mdaEfsmMain.selectGas(2);
    }

    /**
     * This method calls MDA EFSM selectGas(int gasType) event
     */
    public void Super() {
        // 1 → Regular, 2 → Premium, 3 → Super
        mdaEfsmMain.selectGas(3);
    }

    /**
     * This method calls MDA EFSM startPump event
     */
    public void StartPump() {
        mdaEfsmMain.startPump();
    }

    /**
     * This method validates cash left and calls MDA EFSM pump or stopPump event
     */
    public void PumpLiter() {
        if(dataStoreGasPump2.getCash()>=(dataStoreGasPump2.getPrice()*(dataStoreGasPump2.getLiter()+1))){
            mdaEfsmMain.pump();
        } else{
            mdaEfsmMain.stopPump();
        }
    }

    /**
     * This method calls MDA EFSM stopPump event
     */
    public void Stop(){
        mdaEfsmMain.stopPump();
    }

    /**
     * This method calls MDA EFSM receipt event
     */
    public void Receipt() {
        mdaEfsmMain.receipt();
    }

    /**
     * This method calls MDA EFSM noReceipt events
     */
    public void NoReceipt() {
        mdaEfsmMain.noReceipt();
    }
}
