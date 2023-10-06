import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        int newState = (int) arg;
        System.out.println("Observer 1 " +name+" received update. "+ "New state" + newState);
    }
}
