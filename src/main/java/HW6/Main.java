package HW6;

public class Main {
    public static void main(String[] args) {
        Order order = (new CreateOrder()).create();
        System.out.println(order);
        (new SaveTo()).saveToJson(order);
    }
}
