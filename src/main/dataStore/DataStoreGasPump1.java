package main.dataStore;

/**
 * Created by HarshPatil on 4/19/17.
 * This is the data store class for GAS PUMP 1
 * Responsible to store gas pump 1 related data
 */
public class DataStoreGasPump1 extends DataStore {

    public float temp_a; // Temporary variable to store REGULAR gas price
    public float temp_b; // Temporary variable to store SUPER gas price
    public float regularGasPrice; // Variable to store REGULAR gas price
    public float superGasPrice; // Variable to store SUPER gas price
    public float total; // Variable to store TOTAL amount
    public float price; // Variable to store selected GAS TYPE price
    public int gallon; // Variable to store total gallons pumped

    /**
     * Below are the GETTERS and SETTERS
     * @return
     */

    public int getGallon() {
        return gallon;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRegularGasPrice() {
        return regularGasPrice;
    }

    public void setRegularGasPrice(float regularGasPrice) {
        this.regularGasPrice = regularGasPrice;
    }

    public float getSuperGasPrice() {
        return superGasPrice;
    }

    public void setSuperGasPrice(float superGasPrice) {
        this.superGasPrice = superGasPrice;
    }

    public float getTemp_a() {
        return temp_a;
    }

    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }

    public float getTemp_b() {
        return temp_b;
    }

    public void setTemp_b(float temp_b) {
        this.temp_b = temp_b;
    }

}
