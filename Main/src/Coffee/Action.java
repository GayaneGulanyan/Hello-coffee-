package Coffee;

import java.util.Scanner;

public class Action {
    public static int water=400;
    public static int milk=540;
    public static int coffeeBeans=120;
    public static int dcups=9;
    public static int money=550;

    public static void getAction() {
        System.out.println("Step 1: Waiting for the command");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter required action: 'buy', 'fill', 'pull', 'remaining' or 'exit'...");
        String actionType = in.nextLine();
        switch(actionType) {
            case "fill":
                Action.fillMachine();
                break;
            case "pull":
                Action.pull();
                break;
            case "buy":
                Action.orderCoffee(in);
                break;
            case "remaining":
                Action.machineStatus();
                break;
            case "exit":
                break;
        }
}

    public static void orderCoffee(Scanner in){
        System.out.println("Step 2: Waiting for the order");
        System.out.println("Please input coffee type ");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("or print 'back' to return... ");
        String coffeeType = in.nextLine();


        switch(coffeeType) {
            case "Espresso":
                System.out.println("Please input cups quantity ");
                int cup = in.nextInt();
                Action.espresso(cup);
                break;
            case "Latte":
                System.out.println("Please input cups quantity ");
                cup = in.nextInt();
                Action.latte(cup);
                break;
            case "Cappuccino":
                System.out.println("Please input cups quantity ");
                cup = in.nextInt();
                Action.cappuccino(cup);
                break;
            case "back":
                getAction();
                in.close();
                break;
        }

        in.close();
    }

        public static void fillMachine()
    {  stepOne: ;
        Scanner in = new Scanner(System.in);
        System.out.println("Please start to fill the water tank, input water volume... ");
        int water = in.nextInt();
        Action.water += water;
        System.out.println("Please start to fill the milk tank, input milk volume... ");
        int milk = in.nextInt();
        Action.milk += milk;
        System.out.println("Please start to fill the coffee beans tank, input coffee volume... ");
        int coffeeBeans = in.nextInt();
        Action.coffeeBeans += coffeeBeans;
        System.out.println("We starts to fill the cups tank, input cups quantity... ");
        int dcups = in.nextInt();
        Action.dcups += dcups;
        in.close();
    }

    public static void pull(){
        System.out.println("Collected " + Action.money + " dollars.");
        Action.money = 0;
        // break stepOne; //вернуться в степ1
    }

    public static void machineStatus(){
        System.out.println("In Coffee Machine we have: " + Action.water + " ml of water, " + Action.milk + " ml of milk, " + Action.coffeeBeans + " gr of beans, " + Action.dcups + " cups.");
    }

    public static void espresso(int cup){

        if (checkEspressoAvailability (cup) == true) {
            Action.water -= (250 * cup);
            Action.coffeeBeans -= (16 * cup);
            Action.money += (4 * cup);
            Action.dcups -= (1 * cup);
            System.out.println("Price is 4$ for cup. Thank you for your purchase, please take your espresso.");
        }
    }
    public static void latte(int cup) {
        if (checkLatteAvailability(cup) == true) {
            Action.water -= (350 * cup);
            Action.milk -= (75 * cup);
            Action.coffeeBeans -= (20 * cup);
            Action.money += (7 * cup);
            Action.dcups -= (1 * cup);
            System.out.println("Price is 7$ for cup. Thank you for your purchase, please take your latte.");
        }
    }
    public static void cappuccino(int cup) {
        if (checkCappuccinoAvailability(cup) == true) {
            Action.water -= (200 * cup);
            Action.milk -= (100 * cup);
            Action.coffeeBeans -= (12 * cup);
            Action.money += (6 * cup);
            Action.dcups -= cup;
            System.out.println("Price is 6$ for cup. Thank you for your purchase, please take your cappuccino.");
        }
    }
    public static boolean checkEspressoAvailability (int cup){
        float avOfWater=Action.water;
        float avOvCoffeeBeans = Action.coffeeBeans;
        float avOfdCups = Action.coffeeBeans;
        System.out.println("Checking for Espresso availability...");
        avOfWater = avOfWater/(250*cup);
        avOvCoffeeBeans = avOvCoffeeBeans/(16*cup);
        avOfdCups = avOfdCups/cup;
        if (avOfWater>=1 & avOvCoffeeBeans>=1 & avOfdCups>=1){                // нужно округление
            System.out.println("You can order Espresso!");
            System.out.println("Available cups " + FindMin.min(avOfWater, avOvCoffeeBeans, avOfdCups));
            return true;
        }
        else {System.out.println("No enough ingredients, Please fill Machine");
        return false;
        }
    }

    public static boolean checkLatteAvailability (int cup){
        float avOfWater=Action.water;
        float avOvCoffeeBeans = Action.coffeeBeans;
        float avmilk = Action.milk;
        int avOfdCups = Action.coffeeBeans;
        System.out.println("Checking for Latte availability...");
        avOfWater = avOfWater/(350*cup);
        avmilk = avmilk/(75*cup);
        avOvCoffeeBeans = avOvCoffeeBeans/(20*cup);
        avOfdCups = avOfdCups/cup;
        if (avOfWater>=1 & avmilk>=1 & avOvCoffeeBeans>=1 & avOfdCups>=1){
            System.out.println("You can order Latte!");
            System.out.println("Available cups " + FindMin.min(avOfWater, avmilk, avOvCoffeeBeans, avOfdCups));
            return true;
            }
        else {
            System.out.println("No enough ingredients, Please fill Machine");
            return false;
        }
    }
    public static boolean checkCappuccinoAvailability (int cup){
        float avOfWater=Action.water;
        float avOvCoffeeBeans = Action.coffeeBeans;
        float avmilk = Action.milk;
        int avOfdCups = Action.coffeeBeans;
        System.out.println("Checking for Cappuccino availability...");
        avOfWater = avOfWater/(200*cup);
        avmilk = avmilk/(100*cup);
        avOvCoffeeBeans = avOvCoffeeBeans/(12*cup);
        avOfdCups = avOfdCups/cup;
        if (avOfWater>=1 & avmilk>=1 & avOvCoffeeBeans>=1 & avOfdCups>=1){
            System.out.println("You can order Cappuccino!");
            System.out.println("Available cups " + FindMin.min(avOfWater, avmilk, avOvCoffeeBeans, avOfdCups));
            return true;
        }
        else {System.out.println("No enough ingredients, Please fill Machine");

            return false;
        }
    }
}
