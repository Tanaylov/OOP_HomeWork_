package HW4;

public class Orange extends Fruit {
    private int id = 2;

    {
        weight = 1.5f;
    }
    public Orange(String name) {
        super(name);
    }

    public int getId() {
        return id;
    }

    @Override
    void setWeight(float weight) {
        if (weight < 1.5f) this.weight = 1.5f;
        else this.weight = weight;
    }
    @Override
    float getWeight() {
        return weight;
    }

}
