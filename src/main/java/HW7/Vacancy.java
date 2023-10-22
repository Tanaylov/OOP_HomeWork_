package HW7;

public class Vacancy extends Company {
    protected String vacancyName;
    private VacancyType vacancyType;
    protected boolean vacancyClose = false;
    protected Vacancy(VacancyType vacancyType) {
        this.vacancyName = vacancyType.name();
        switch (vacancyType) {
            case juniorDeveloper -> {minSalary = 30000; maxSalary = 50000;}
            case middleDeveloper -> {minSalary = 50000; maxSalary = 90000;}
            case seniorDeveloper -> {minSalary = 90000; maxSalary = 150000;}
            case teamLead -> {minSalary = 150000; maxSalary = 200000;}
        }
        this.vacancyType = vacancyType;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }
}
