package Main;
import java.util.Scanner;

public class CoffeeMachineSimulator {

    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int disCups = 9;
    int money = 550;
    String buy = "buy";
    String fill = "fill";
    String take = "take";
    String exit = "exit";
    String remaining = "remaining";
    String back = "back";
    int mode = 1;


    // method myMethod check coffee machine mode, and call appropriate method
    public void machineStateStaus(String inputString) {

        switch (mode) {
            case 1:
                action(inputString);
                break;
            case 2:
                buy();
                break;
        }
    }

    // action method which check input, change machine mode and call appropriate method
    public void action(String actionType) {

        switch (actionType) {
            case "buy":
                mode = 2;
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                exit();
                break;
        }
    }

    // method buy asks to input which coffee wants to make,or if change the mind type back
    public void buy() {
        mode = 1;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String coffeeType = CoffeeMachineSimulatorMain.getLineFromConsole();
        switch (coffeeType) {
            case "1":
                espresso();
                break;
            case "3":
                cappuccino();
                break;
            case "2":
                latte();
                break;
            case "back":
                System.out.println("Write action (buy, fill, take, remaining, exit):");
                action(CoffeeMachineSimulatorMain.getLineFromConsole());
                break;

        }


    }

    //method espresso which checks if available ingredients, makes a coffee,
    //if not asks user what part of ingredient is missing:
    public void espresso() {
        if (water >= 250 && coffeeBeans >= 16 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            coffeeBeans -= 16;
            money += 4;
            disCups -= 1;
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action(CoffeeMachineSimulatorMain.getLineFromConsole());
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough Coffee Beans!");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");

        }
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());

    }

    //method cappuccino which checks if available ingredients, makes a coffee,
    //if not asks user what part of ingredient is missing:
    public void cappuccino() {
        if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            money += 6;
            disCups -= 1;
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action(CoffeeMachineSimulatorMain.getLineFromConsole());
        } else if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");
        }
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());
    }

    //method latte which checks if available ingredients, makes a coffee,
    //if not asks user what part of ingredient is missing:
    public void latte() {
        if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && disCups != 0) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            money += 7;
            disCups -= 1;
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action(CoffeeMachineSimulatorMain.getLineFromConsole());
        } else if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk");
        } else if (coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans");
        } else if (disCups == 0) {
            System.out.println("Sorry, not enough disposable cups");
        }
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());
    }

    //method fill asks to user how much ingredients wants to add to coffee machine
    public void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        Scanner scanner = new Scanner(System.in);
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        Scanner scanner2 = new Scanner(System.in);
        milk += scanner2.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        Scanner scanner3 = new Scanner(System.in);
        coffeeBeans += scanner3.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        Scanner scanner4 = new Scanner(System.in);
        disCups += scanner4.nextInt();
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());
    }

    // method take gives money from coffee machine to owner
    public void take() {
        System.out.println("I gave you " + money + "$");
        money = 0;
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());
    }

    //method remaining gives user how much ingredients and money is available
    public void remaining() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                disCups + " of disposable cups\n" +
                money + " of money\n");
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        action(CoffeeMachineSimulatorMain.getLineFromConsole());

    }

    // method exit terminate the program
    public void exit() {
        {
            System.exit(0);
        }
    }
}