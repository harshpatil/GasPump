package main.driver;

import main.factory.AbstractFactory;
import main.factory.GasPump1Factory;
import main.factory.GasPump2Factory;
import main.mdaEfsm.*;
import main.outputProcessor.OutputProcessor;
import main.pumps.GasPump1;
import main.pumps.GasPump2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HarshPatil on 4/18/17.
 */
/**
 * This class is responsible for running both the pumps and user interaction
 */
public class Driver {

    private GasPump1 gasPump1 = null;
    private GasPump2 gasPump2 = null;

    /**
     * This method is the starting point of GAS PUMP application
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {

        Driver driver = new Driver();

        while (true){
            System.out.println("\t Welcome to GAS PUMP Application");
            System.out.println("\t Enter 1 for \"GAS PUMP 1\"");
            System.out.println("\t Enter 2 for \"GAS PUMP 2\"");
            System.out.println("\t Enter q to EXIT application");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String choice = bufferedReader.readLine();
            if(choice.equals("1")){
                driver.runGasPump1(bufferedReader);
            }
            else if(choice.equals("2")){
                driver.runGasPump2(bufferedReader);
            }else if(choice.equals("q")){
                System.out.println("THANKS FOR USING GAS PUMP APPLICATION");
                System.exit(0);
            }
        }
    }

    /**
     * This method is responsible for user interaction and execution of GAS PUMP 1
     * @param bufferedReader
     * @throws IOException
     */
    public void runGasPump1(BufferedReader bufferedReader) throws IOException {

        AbstractFactory abstractFactory = new GasPump1Factory();
        OutputProcessor outputProcessor = new OutputProcessor(abstractFactory);
        MDAEFSMMain mdaEfsmMain = new MDAEFSMMain(outputProcessor);
        gasPump1 = new GasPump1(mdaEfsmMain, abstractFactory);

        System.out.println("\n \t GAS PUMP 1 Selected");
        System.out.println("\t MENU of Operations");
        System.out.println("\t\t 0. Activate(float, float)");
        System.out.println("\t\t 1. Start()");
        System.out.println("\t\t 2. PayCredit()");
        System.out.println("\t\t 3. Approved()");
        System.out.println("\t\t 4. Reject()");
        System.out.println("\t\t 5. Cancel()");
        System.out.println("\t\t 6. Super()");
        System.out.println("\t\t 7. Regular()");
        System.out.println("\t\t 8. StartPump()");
        System.out.println("\t\t 9. PumpGallon()");
        System.out.println("\t\t 10. StopPump()");
        System.out.println("\t\t q. QUIT GAS PUMP 1");
        while (true){
            System.out.println("\nSelect Operation: \n\t 0-Activate \t 1-Start \t 2-PayCredit"+
                    "\t 3-Approved \t 4-Reject \t 5-Cancel \t 6-Super \n " +
                    "\t 7-Regular\t 8-StartPump \t 9-PumpGallon \t 10-StopPump \n");
            String operation = bufferedReader.readLine();
            if(operation.equals("0")){
                System.out.println("Operation: Activate(float a, float b)");
                System.out.println("Enter value of REGULAR Gas");
                float regularGasPrice = Float.parseFloat(bufferedReader.readLine());
                System.out.println("Enter value of SUPER Gas");
                float superGasPrice = Float.parseFloat(bufferedReader.readLine());
                gasPump1.Activate(regularGasPrice, superGasPrice);
            } else if(operation.equals("1")){
                gasPump1.Start();
            } else if(operation.equals("2")){
                gasPump1.PayCredit();
            } else if(operation.equals("3")){
                gasPump1.Approved();
            } else if(operation.equals("4")){
                gasPump1.Reject();
            } else if(operation.equals("5")){
                gasPump1.Cancel();
            } else if(operation.equals("6")){
                gasPump1.Super();
            } else if(operation.equals("7")){
                gasPump1.Regular();
            } else if(operation.equals("8")){
                gasPump1.StartPump();
            } else if(operation.equals("9")){
                gasPump1.PumpGallon();
            } else if(operation.equals("10")){
                gasPump1.StopPump();
            } else if(operation.equals("q")){
                System.out.println("EXITING GAS PUMP 1, START AGAIN \n");
                break;
            }
        }
    }

    /**
     * This method is responsible for user interaction and execution of GAS PUMP 2
     * @param bufferedReader
     * @throws IOException
     */
    public void runGasPump2(BufferedReader bufferedReader) throws IOException {

        AbstractFactory abstractFactory = new GasPump2Factory();
        OutputProcessor outputProcessor = new OutputProcessor(abstractFactory);
        MDAEFSMMain mdaEfsmMain = new MDAEFSMMain(outputProcessor);
        gasPump2 = new GasPump2(mdaEfsmMain, abstractFactory);

        System.out.println("\n \t GAS PUMP 2 Selected");
        System.out.println("\t MENU of Operations");
        System.out.println("\t\t 0. Activate(int, int, int)");
        System.out.println("\t\t 1. Start()");
        System.out.println("\t\t 2. PayCash(int c)");
        System.out.println("\t\t 3. Cancel()");
        System.out.println("\t\t 4. Regular()");
        System.out.println("\t\t 5. Premium()");
        System.out.println("\t\t 6. Super()");
        System.out.println("\t\t 7. StartPump()");
        System.out.println("\t\t 8. PumpLiter()");
        System.out.println("\t\t 9. Stop()");
        System.out.println("\t\t 10. Receipt()");
        System.out.println("\t\t 11. NoReceipt()");
        System.out.println("\t\t q. QUIT GAS PUMP 2");
        while (true){
            System.out.println("\nSelect Operation: \n \t 0-Activate \t 1-Start \t 2-PayCash \t 3-Cancel"+
                    "\t 4-Regular \t 5-Premium \t 6-Super \n \t 7-StartPump \t 8-PumpLiter" +
                    "\t 9-Stop \t 10-Receipt \t 11-NoReceipt \n");
            String operation = bufferedReader.readLine();
            if(operation.equals("0")){
                System.out.println("Operation: Activate(int a, int b, int c)");
                System.out.println("Enter value of REGULAR Gas");
                int regularGasPrice = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter value of PREMIUM Gas");
                int premiumGasPrice = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter value of SUPER Gas");
                int superGasPrice = Integer.parseInt(bufferedReader.readLine());
                gasPump2.Activate(regularGasPrice, premiumGasPrice, superGasPrice);
            } else if(operation.equals("1")){
                gasPump2.Start();
            } else if(operation.equals("2")){
                System.out.println("Operation:  PayCash(int c)");
                System.out.println("Enter CASH");
                int cash = Integer.parseInt(bufferedReader.readLine());
                gasPump2.PayCash(cash);
            } else if(operation.equals("3")){
                gasPump2.Cancel();
            } else if(operation.equals("4")){
                gasPump2.Regular();
            } else if(operation.equals("5")){
                gasPump2.Premium();
            } else if(operation.equals("6")){
                gasPump2.Super();
            } else if(operation.equals("7")){
                gasPump2.StartPump();
            } else if(operation.equals("8")){
                gasPump2.PumpLiter();
            } else if(operation.equals("9")){
                gasPump2.Stop();
            } else if(operation.equals("10")){
                gasPump2.Receipt();
            } else if(operation.equals("11")){
                gasPump2.NoReceipt();
            } else if(operation.equals("q")){
                System.out.println("EXITING GAS PUMP 2, START AGAIN \n");
                break;
            }
        }
    }
}
