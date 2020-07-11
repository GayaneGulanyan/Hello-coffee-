package Main;
import java.util.Scanner;

public class Coffee_Machine {

    public static void main(String[] args) {
        setIngredients(getCups());
        }
    public static int getCups() {
            Scanner in = new Scanner(System.in);
            System.out.print("Write how many cups of coffee you will need...");
            int cups = Integer.parseInt(in.nextLine());
            System.out.println("For " + cups + " cups of coffee you will need:");
            in.close();
            return cups;
        }
    public static void setIngredients(int cups) {
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;
        water = cups * water;
        milk = cups * milk;
        coffeeBeans = cups * coffeeBeans;
        getIngredients(water, milk, coffeeBeans);
        }
    public static void getIngredients(int water, int milk, int coffeeBeans){
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " gr of coffee beans");
        }
}