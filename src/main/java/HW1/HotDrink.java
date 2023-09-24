package HW1;

public class HotDrink extends Product{
    protected int temperature;
    protected boolean isHot;
    protected String type;
    public HotDrink() {
        super();
        this.temperature = 70;
        this.isHot = true;
        this.type = "<Drink>";
    }
    public HotDrink(String name, String brand, float value, float price, int temperature, String type) {
        super(name, brand, value, price);
        checkTemperature(temperature);
        checkType(type);
        setHot(temperature);
    }

    public int getTemperature() {return temperature;}

    public String getType() {return type;}

    public boolean isHot() {return isHot;}

    public void setTemperature(int temperature) {checkTemperature(temperature);}

    public void setType(String type) {checkType(type);}
    private void setHot(int temperature) {
        if (temperature >= 70) isHot = true;
        else isHot =false;
    }
    @Override
    public String toString() {
        return '[' + this.type + "] " + super.toString() + String.format(", Temperature: %d, Hot: %b", temperature, isHot);
    }

    private void checkTemperature (int temperature) {
        if (temperature < 10) this.temperature = 70;
        else this.temperature = temperature;
        setHot(this.temperature);
    }
    private void checkType (String type) {
        if (type == null || type.length() < 2) this.type = "<Drink>";
        else this.type = type;
    }
}
