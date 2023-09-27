package HW2;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    public Cat(String name, int appetite) {
        this.name = name;
        maxAppetite(appetite);
        isHungry = true;
    }
    public Cat() {this("cat", 10); isHungry = true;}

    public int getAppetite() {return appetite;}

    public void setAppetite(int appetite) {maxAppetite(appetite);}

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            isHungry = false;
        }
        else System.out.println("Need to refill the plate");
    }
    private void maxAppetite(int appetite) {
        if (appetite > 20) this.appetite = 20;
        else this.appetite = appetite;
    }

    @Override
    public String toString() {return String.format("%s, %d, hungry: %b", name, appetite, isHungry);}
}
