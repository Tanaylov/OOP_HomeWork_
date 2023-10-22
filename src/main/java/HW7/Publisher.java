package HW7;

public interface Publisher {
    void registerObserver(Observer observer);
    Observer getObserver(int index);
    void removeObserver(Observer observer);
    String getSelectedCompanyName(Observer observer);
    void sendOffer(String companyName, int salary, VacancyType vacancyType);
    int observersNumber();
    void printActiveObservers();
}
