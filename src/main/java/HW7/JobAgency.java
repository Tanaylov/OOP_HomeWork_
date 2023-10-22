package HW7;

import java.util.ArrayList;

public class JobAgency implements Publisher {
    ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public Observer getObserver(int index) {
        return observers.get(index);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!getSelectedCompanyName(observer).equals(" ")) observer.setFindJob(true);
    }

    @Override
    public String getSelectedCompanyName(Observer observer) {
        return observer.getCompanyName();
    }

    @Override
    public void sendOffer(String companyName, int salary, VacancyType vacancyType) {
        observers.forEach(el -> el.receiveOffer(companyName, salary, vacancyType));
    }
    @Override
    public int observersNumber() {
        return observers.size();
    }
    public void printActiveObservers() {
        for (Observer observer : observers) {
            if (!observer.findJob()) System.out.println(observer);
        }
    }
}
