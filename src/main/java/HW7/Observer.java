package HW7;

public interface Observer {
    void receiveOffer(String nameCompany, int salary, VacancyType vacancyType);
    boolean findJob();
    void setFindJob(boolean findJob);
    String getCompanyName();
    VacancyType getVacancyType();
}
