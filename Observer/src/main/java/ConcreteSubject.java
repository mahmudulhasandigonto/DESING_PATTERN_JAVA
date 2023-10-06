import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class ConcreteSubject implements Subject {
    private List<Observer> observers;
    private int state;


    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer: observers) {
            observer.update(null, state);
        }

    }

    public void setState(int state) {
        this.state = state;
        notifyObserver();
    }
}
