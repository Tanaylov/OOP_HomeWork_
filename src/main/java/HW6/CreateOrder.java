package HW6;

import java.util.Scanner;

public class CreateOrder {
    public Order create() {
        System.out.println("Create order using console, press - 1");
        System.out.println("Create order using file, press - 2");
        System.out.println("Create order using DB, press - 3");
        int choice = (new Scanner(System.in)).nextInt();
        switch (choice) {
            case 1:
                String clientName = getDateFromConsole("Enter name: ");
                String product = getDateFromConsole("Enter product: ");
                int qnt = Integer.parseInt(getDateFromConsole("Enter quantity: "));
                double price = Double.parseDouble(getDateFromConsole("Enter price: "));
                return new Order(clientName, product, qnt, price);
            case 2:
                System.out.println("Create order using file.");
                return new Order();
            case 3:
                System.out.println("Create order using DB.");
                return new Order();
            default:
                return new Order();
        }
    }
    private String getDateFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
    private String getDateFromFile() {
        return "0";
    }
    private void getDateFromDB() {}
}
