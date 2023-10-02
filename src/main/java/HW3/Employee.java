package HW3;

import java.util.LinkedList;
import java.util.Random;

public abstract class Employee implements Comparable<Employee> {
    static LinkedList<Employee> employees;
    private static int idCounter;
    protected int id;
    protected String name;
    protected String surname;
    protected int age;
    protected int salary;

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    {
        id = idCounter++;
        name = "Name" + String.valueOf(id);
        surname = "Surname" + String.valueOf(id);
        age = 30;
        salary = 50000;
    }
    protected Employee() {

    }
    protected Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    protected int getId() {
        return id;
    }

    public String toString() {
        return String.format("<%s>:\n %s, %s age: %d; salary: %d; id: %d.\n", employees.get(id).getClass().getSimpleName(), surname, name, age, salary, id);
    }

    @Override
    public int compareTo(Employee o) {
        return surname.compareTo(o.surname) == 0 ? name.compareTo(o.name) : surname.compareTo(o.surname);
    }

    private static Employee generateEmployee(String[] name, String[] surname) {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return new Manager(name[random.nextInt(name.length)], surname[random.nextInt(surname.length)], random.nextInt(20, 60));
            case 1:
                return new Worker(name[random.nextInt(name.length)], surname[random.nextInt(surname.length)], random.nextInt(20, 60));
            default:
                return new Freelancer(name[random.nextInt(name.length)], surname[random.nextInt(surname.length)], random.nextInt(20, 60));
        }
    }

    public static LinkedList<Employee> generateEmployees(String[] name, String[] surname, int number) {
        employees = new LinkedList<>();
        for (int i = 0; i < number; i++)
            employees.add(generateEmployee(name, surname));
        return employees;
    }
}
