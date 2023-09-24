package HW1;

public class Product {
    protected String name;
    protected String brand;
    protected float value;
    protected float price;

    public Product(String name, String brand, float value, float price) {
        checkName(name);
        checkBrand(brand);
        checkValue(value);
        checkPrice(price);
    }
    public Product(String name, String brand) {this(name, brand, 0.1f, 100.0f);}

    public Product(String name) {this(name, "<Brand>", 0.1f, 100.0f);}
    public Product() {this("<Product>", "<Brand>", 0.1f, 100.0f);}


    @Override
    public String toString() {
        return String.format("Product name: %s, Brand: %s, Value: %.2f, Price: %.2f",
                this.name, this.brand, this.value, this.price);
    }
    public String getName() {return name;}
    public String getBrand() {return brand;}
    public float getValue() {return value;}
    public float getPrice() {return price;}
    public void setName(String name) {checkName(name);}
    public void setBrand(String brand) {checkBrand(brand);}
    public void setValue(float value) {checkValue(value);}
    public void setPrice(float price) {checkPrice(price);}

    private void checkName (String name) {
        if (name == null || name.length() < 3) this.name = "<Product>";
        else this.name = name;
    }
    private void checkBrand (String brand) {
        if (brand == null || brand.length() < 3) this.name = "<Brand>";
        else this.brand = brand;
    }
    private void checkValue (float value) {
        if (value < 0.1) this.value = 0.1f;
        else this.value = value;
    }
    private void checkPrice (float price) {
        if (price < 100) this.price = 100f;
        else this.price = price;
    }
}
