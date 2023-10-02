package HW3;

import java.util.Random;

public class Manager extends Employee {
    private int workHour = 8;
    private int countDay = 20;
    private int reward = (new Random()).nextInt(10000, 20000);
    private int rate = 300;

    {
//        employees.add(new Manager());
    }
    public Manager() {}
    protected Manager(String name, String surname, int age) {
        super(name, surname, age);
        salary = (workHour * rate * countDay) + reward;
    }
}
