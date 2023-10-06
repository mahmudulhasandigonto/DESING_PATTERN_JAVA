package org.example;

public class ConcreteColleagueOne implements Colleague{

    private Mediator mediator;

    public ConcreteColleagueOne(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Concrete Colleague " + message);
    }
}
