import java.util.Observer;

public class Application{

    public static void main(String[] args) {
        ConcreteObserver concreteObserverOne = new ConcreteObserver("Concreate observerOne");
        ConcreteObserver concreteObserverTwo = new ConcreteObserver("Concreate ObserverTwo");

        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(concreteObserverOne);
        subject.addObserver(concreteObserverTwo);

        subject.setState(3);
    }
}
