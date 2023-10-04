package HW4;

public abstract class Fruit {
    protected String name;
    protected float weight;

    protected Fruit(String name) {
        this.name = name;
    }
    abstract int getId();
    abstract void setWeight(float weight);
    abstract float getWeight();

    @Override
    public String toString() {
        return String.format("%s, %.2f", name, weight);
    }
}
