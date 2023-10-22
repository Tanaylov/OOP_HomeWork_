package HW7;

import java.util.ArrayList;
import java.util.Random;

public class Company {
    private Random random = new Random();
    private String name;
    protected int minSalary;
    protected int maxSalary;
    private Publisher jobAgency;
    private ArrayList<Vacancy> vacancies = new ArrayList<>();

    Company(){}

    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
        generateVacancy();
    }
    public void needEmployee() {
        for (Vacancy vacancy : vacancies) {
            int salary = random.nextInt(vacancy.minSalary, vacancy.maxSalary + 1);
            jobAgency.sendOffer(name, salary, VacancyType.valueOf(vacancy.vacancyName));
        }
    }
    public void closeVacancy(Observer observer) {
        if (jobAgency.getSelectedCompanyName(observer).equals(name)) {
            for (Vacancy vacancy : vacancies) {
                if (observer.findJob() && observer.getVacancyType().equals(vacancy.getVacancyType()))
                    vacancy.vacancyClose = true;
            }
        }
    }
    public String getName() {return name;}
    private void generateVacancy() {
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0 -> vacancies.add(new Vacancy(VacancyType.juniorDeveloper));
                case 1 -> vacancies.add(new Vacancy(VacancyType.middleDeveloper));
                case 2 -> vacancies.add(new Vacancy(VacancyType.seniorDeveloper));
                case 3 -> vacancies.add(new Vacancy(VacancyType.teamLead));
            }
        }
    }
    public void printFreeVacancy() {
        for (Vacancy vacancy : vacancies) {
            if (!vacancy.vacancyClose) System.out.println(name + " " + vacancy.getVacancyType());
        }
    }
}
