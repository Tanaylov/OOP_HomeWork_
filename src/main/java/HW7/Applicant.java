package HW7;

abstract class Applicant implements Observer{
    protected String name;
    protected int salary;
    protected VacancyType vacancyType;
    protected boolean findJob = false;
    protected String companyName = " ";
    private int getSalary() {
        return salary;
    }
    public VacancyType getVacancyType() {return vacancyType;}
    public void setFindJob(boolean findJob) {
        this.findJob = findJob;
    }
    public String getCompanyName() {
        return companyName;
    }
    @Override
    public boolean findJob() {
        return findJob;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, VacancyType vacancyType) {
        if (vacancyType.equals(getVacancyType())) {
            if (salary < getSalary()) { System.out.println("I'll searching something else ("
                    + nameCompany
                    + ", "
                    + vacancyType.name()
                    + ", "
                    + salary
                    + ", "
                    + name
                    + ")");
            } else {
                this.salary = salary;
                System.out.println("I take it ("
                        + nameCompany
                        + ", "
                        + vacancyType.name()
                        + ", "
                        + salary
                        + ", "
                        + name
                        + ")");
                findJob = true;
                companyName = nameCompany;
            }
        } else System.out.println("Nothing interesting for me yet. (" + name + ")" );
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
