package HW1;

import java.util.ArrayList;

public class VendingMachine {
    private int capacity;
    private ArrayList<Product> productArrayList = new ArrayList<>(capacity);
    public VendingMachine(int capacity) {
        if (capacity < 10) this.capacity = 10;
        else this.capacity  = capacity;
    }
    public VendingMachine(ArrayList<Product> products) {
        capacity = products.size() + 2;
        productArrayList = products;
    }
    public VendingMachine() {capacity = 10;}
    private void increaseCapacity() {if (capacity - productArrayList.size() == 1) capacity *= 1.5;}
    public void addItem(Product product) {
        productArrayList.add(product);
        increaseCapacity();
    }
    public StringBuilder showProducts() {
        StringBuilder result = new StringBuilder("Vending Machine\n" +
                "Capacity: " + capacity +
                "\nProduct list:\n");
        productArrayList.forEach(el -> result.append(el + "\n"));
        return result;
    }
    public Product getDrink(String name, float value, int temperature) {
        for (Product product : productArrayList) {
            if (product.getClass().getSimpleName().equals("HotDrink")) {
                HotDrink hotDrink = (HotDrink) product;
                if (hotDrink.getName().toLowerCase().equals(name) && hotDrink.getValue() == value && hotDrink.getTemperature() == temperature)
                    return hotDrink;
            }
        }
        return null;
    }
}
