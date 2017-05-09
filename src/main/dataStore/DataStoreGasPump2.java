package main.dataStore;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the data store class for GAS PUMP 2
 * * Responsible to store gas pump 2 related data
 */
public class DataStoreGasPump2 extends DataStore {

    private int temp_a; // Temporary variable to store REGULAR gas price
    private int temp_b; // Temporary variable to store PREMIUM gas price
    private int temp_c; // Temporary variable to store SUPER gas price
    private int temp_cash; // Temporary variable to store cash gas price
    private int cash; // Variable to store REGULAR gas price
    private int regularGasPrice; // Variable to store REGULAR gas price
    private int premiumGasPrice; // Variable to store PREMIUM gas price
    private int superGasPrice; // Variable to store SUPER gas price
    private int total; // Variable to store TOTAL amount
    private int price; // Variable to store PRICE
    private int liter; // Variable to store total liters pumped

    /**
     * Below are the GETTERS and SETTERS
     * @return
     */
    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public int getTemp_a() {
        return temp_a;
    }

    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }

    public int getTemp_b() {
        return temp_b;
    }

    public void setTemp_b(int temp_b) {
        this.temp_b = temp_b;
    }

    public int getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(int temp_c) {
        this.temp_c = temp_c;
    }

    public int getTemp_cash() {
        return temp_cash;
    }

    public void setTemp_cash(int temp_cash) {
        this.temp_cash = temp_cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getRegularGasPrice() {
        return regularGasPrice;
    }

    public void setRegularGasPrice(int regularGasPrice) {
        this.regularGasPrice = regularGasPrice;
    }

    public int getSuperGasPrice() {
        return superGasPrice;
    }

    public void setSuperGasPrice(int superGasPrice) {
        this.superGasPrice = superGasPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPremiumGasPrice() {
        return premiumGasPrice;
    }

    public void setPremiumGasPrice(int premiumGasPrice) {
        this.premiumGasPrice = premiumGasPrice;
    }
}
