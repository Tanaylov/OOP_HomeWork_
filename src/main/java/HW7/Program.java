package HW7;

public class Program {
    public static void main(String[] args) {
        Publisher hh = new JobAgency();
        Company google = new Company("Google", hh);
        Company yandex = new Company("Yandex", hh);
        Company geekBrains = new Company("Geek Brains", hh);

        Applicant student1 = new Student("Ivan");
        Applicant student2 = new Student("Sten");
        Applicant master1 = new Master("Sergey");
        Applicant master2 = new Master("Todd");
        Applicant manager1 = new Manager("Anatoliy");

        hh.registerObserver(student1);
        hh.registerObserver(student2);
        hh.registerObserver(master1);
        hh.registerObserver(master2);
        hh.registerObserver(manager1);

        System.out.println(google.getName());
        google.needEmployee();
        System.out.println(yandex.getName());
        yandex.needEmployee();
        System.out.println(geekBrains.getName());
        geekBrains.needEmployee();
        for (int i = 0; i < hh.observersNumber(); i++) {
            hh.removeObserver(hh.getObserver(i));
            google.closeVacancy(hh.getObserver(i));
            yandex.closeVacancy(hh.getObserver(i));
            geekBrains.closeVacancy(hh.getObserver(i));
        }

        hh.printActiveObservers();
        google.printFreeVacancy();
        yandex.printFreeVacancy();
        geekBrains.printFreeVacancy();
    }
}
