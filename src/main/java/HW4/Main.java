package HW4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>(10);
        fruits.add(new Orange("apple"));
        fruits.add(new Apple("apple"));
        fruits.add(new Apple("apple"));
        fruits.add(new Orange("apple"));
        fruits.add(new Orange("apple"));
        fruits.add(new Orange("apple"));
        fruits.add(new Apple("apple"));

        Box<Fruit> fruitBox = new Box<>(fruits);
        System.out.println(fruitBox.size());
        fruitBox.addFruit(new Apple("aaa"));
        System.out.println(fruitBox.size());
        System.out.println(fruitBox.totalWeight());

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));

        Box<Apple> appleBox1 = new Box<>();
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));
        appleBox.addFruit(new Apple("AAA"));


        System.out.println(appleBox.compare(fruitBox));
        appleBox.addAll(appleBox1);
        System.out.println(appleBox.size());
        System.out.println(appleBox1.size());

        System.out.println(appleBox1);
    }
}
