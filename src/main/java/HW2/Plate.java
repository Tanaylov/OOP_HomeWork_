package HW2;

public class Plate {
    private int food;
    public Plate(int food) {this.food = food;}
    public Plate() {this(100);}
    public void info() {System.out.println("Plate: " + food);}
    public void setFood(int food) {
        this.food = food;
        minFood();
    }
    public int getFood() {return food;}
    private void minFood() {if (food < 20) food += 50;}
}
