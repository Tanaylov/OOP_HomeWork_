package HW3;

import java.util.Random;

public class Freelancer extends Employee{
    private int workHour = 8;
    private int countDay;
    private int reward;
    private boolean isReward;
    private int rate = 250;

    {
        isReward = (new Random()).nextBoolean();
        if (isReward) reward = 10000;
        countDay = (new Random()).nextInt(1, 20);
        salary = (workHour * countDay * rate) + reward;
//        employees.add(new Freelancer());
    }
    public Freelancer() {}
    public Freelancer(String name, String surname, int age) {
        super(name, surname, age);
    }
}
