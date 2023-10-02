package HW3;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Ivan", "Sergey", "Valentin", "Valeriy", "Juriy", "Vlad", "Michail", "Evgenij", "Vasilij", "Vladimir", "Aleksandr", "Andrej"};
        String[] surname = {"Simonov", "Berezov", "Chernov", "Popov", "Chajkovskij", "Hromov", "Spidermanov", "Serov", "Gudkov", "Gromov"};
        LinkedList<Employee> employees = Employee.generateEmployees(name, surname, 7);
//        for (Employee employee : employees) System.out.print(employee);
        employees.add(new Worker()); // Как прописать на уровне класса автоматическое добавление в данный список нового экземпляра?
        System.out.println(employees.getLast());
//        System.out.println(employees.stream().sorted(Comparator.comparingInt(el -> -el.getSalary())).toList()); // Взависимости от знака менятется порядок сортировки
//        System.out.println(employees.stream().sorted(Comparator.comparingInt(el -> el.getAge())).toList());
        Sort sort = new Sort();
        System.out.println(employees.stream().sorted(Comparator.reverseOrder()).toList());
        System.out.println(employees.stream().sorted(Comparator.naturalOrder()).toList());
    }
}
