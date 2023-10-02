package HW3;

import java.util.Random;

public class Worker extends Employee {

    private int workHour = 8;
    private int countDay = 20;
    private int reward = (new Random()).nextInt(7000, 15000);
    private int rate = 200;
    {
//        employees.add(new Worker());
    }
    public Worker() {}
    public Worker(String name, String surname, int age) {
        super(name, surname, age);
        salary = (workHour * rate * countDay) + reward;
    }

}
