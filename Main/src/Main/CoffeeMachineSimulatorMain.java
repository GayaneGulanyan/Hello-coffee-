package Main;
import java.util.Scanner;

public class CoffeeMachineSimulatorMain {


    public static String getCurrentLine;

    //printing actions, call myMethod
    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        getCurrentLine = getLineFromConsole();
        CoffeeMachineSimulator coffeeMachineSimulator = new CoffeeMachineSimulator();
        coffeeMachineSimulator.machineStateStaus(getCurrentLine);


    }

    //method getLineFromConsole read input from console
    public static String getLineFromConsole() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        return inputString;

    }
}