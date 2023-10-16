package HW6;

public class Order {
    protected String clientName;
    protected String product;
    protected int qnt;
    protected double price;
    Order(){}
    public Order(String name, String product, int qnt, double price) {
        this.clientName = name;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s;\n%s;\n%d;\n%.2f", clientName, product, qnt, price);
    }
}
