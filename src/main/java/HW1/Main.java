package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink hotDrink1 = new HotDrink("Latte", "Sweet Drinks", 0.3f, 110, 70, "Coffee");
        HotDrink hotDrink2 = new HotDrink("Latte", "Sweet Drinks", 0.5f, 170, 60, "Coffee");
        HotDrink hotDrink3 = new HotDrink("Matte", "Sweet Drinks", 0.3f, 150, 70, "Tea");
        HotDrink hotDrink4 = new HotDrink("Cappuccino", "Sweet Drinks", 0.3f, 110, 70, "Coffee");
        HotDrink hotDrink5 = new HotDrink("Cappuccino", "Sweet Drinks", 0.5f, 170, 70, "Coffee");
//        HotDrink[] hotDrinks = {hotDrink1, hotDrink2, hotDrink3, hotDrink4, hotDrink5};
        VendingMachine VM1 = new VendingMachine();
        VM1.addItem(hotDrink1);
        VM1.addItem(hotDrink2);
        VM1.addItem(hotDrink3);
        VM1.addItem(hotDrink4);
        VM1.addItem(hotDrink5);
        if (VM1.getDrink("matte", 0.3f, 72) == null) {
            System.out.println("Drink not found");
            System.out.println(VM1.showProducts());
        } else System.out.println(VM1.getDrink("matte", 0.3f, 70));
    }
}