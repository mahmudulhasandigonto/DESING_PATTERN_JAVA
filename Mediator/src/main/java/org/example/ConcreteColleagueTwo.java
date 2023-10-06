package org.example;

public class ConcreteColleagueTwo implements Colleague{

    Mediator mediator;

    public ConcreteColleagueTwo(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Concrete ColleagueTow "+ message);
    }
}
