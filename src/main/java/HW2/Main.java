package HW2;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Kitty", 20),
                new Cat("Tom", 15),
                new Cat(),
                new Cat("Soul", 9),
                new Cat("Wisper", 13),
                new Cat("Ash", 30),
                new Cat("Murrick", 19),
        };
        Plate plate = new Plate();
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            plate.info();
        }
    }
}
