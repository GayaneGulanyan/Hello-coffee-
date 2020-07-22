package Main;
import java.util.Scanner;

public class CoffeeMachineSimulatorMain {


    public static String getCurrentLine;

    //printing actions, call myMethod
    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        getCurrentLine = getString();
        CoffeeMachineSimulator coffeeMachineSimulator = new CoffeeMachineSimulator();
        coffeeMachineSimulator.myMethod(getCurrentLine);


    }

    //method getString read input from console
    public static String getString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        return inputString;

    }
}