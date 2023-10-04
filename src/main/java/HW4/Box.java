package HW4;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    ArrayList<F> arrayList = new ArrayList<>();

    Box() {}
    public Box(ArrayList<F> arrayList) {
        if (!arrayList.isEmpty()) {
            arrayList.removeIf(el1 -> el1.getId() != arrayList.get(0).getId());
        }
        this.arrayList = arrayList;
    }
    public void addFruit(F fruit) {
        if (arrayList.isEmpty() || checkFruit(fruit))
            arrayList.add(fruit);
        else System.out.println("You can put only " + arrayList.get(0).getClass().getSimpleName());
    }
    public int size() {
        return arrayList.size();
    }
    float totalWeight() {
        float sum = 0;
        for (F f : arrayList) {
            sum += f.getWeight();
        }
        return  sum;
    }
    private F getFruit(int i) {
      return arrayList.get(i);
    }
    boolean compare(Box box){
        if (box.totalWeight() == totalWeight())
            return true;
        else return false;
    }
    void addAll(Box box) {
        if (box.arrayList.isEmpty() || checkFruit(box.getFruit(0))) {
            arrayList.forEach(el -> box.addFruit(el));
            arrayList.clear();
        }
        else System.out.println("Different types of fruits in boxes.");
    }

    private boolean checkFruit(Fruit fruit) {
        if (fruit.getId() == arrayList.get(0).getId()) return true;
        else return false;
    }

    @Override
    public String toString() {
        String res = getFruit(0).getClass().getSimpleName() +
                ": \n";
        for (F f : arrayList)
            res += f.toString() + "\n";
        return res;
    }
}
