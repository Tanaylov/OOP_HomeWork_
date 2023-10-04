package HW4;

public class Apple extends Fruit {
    private int id = 1;

    {
        weight = 1.0f;
    }
    public Apple(String name) {
        super(name);
    }

    public int getId() {
        return id;
    }

    @Override
    void setWeight(float weight) {
        if (weight < 1.0f) this.weight = 1.0f;
        else this.weight = weight;
    }

    @Override
    float getWeight() {
        return weight;
    }
}
