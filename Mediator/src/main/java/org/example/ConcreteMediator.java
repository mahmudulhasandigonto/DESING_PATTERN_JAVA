package org.example;

public class ConcreteMediator implements Mediator{
    private ConcreteColleagueOne concreteColleagueOne;
    private ConcreteColleagueTwo concreteColleagueTwo;

    public void setConcreteColleagueOne(ConcreteColleagueOne concreteColleagueOne) {
        this.concreteColleagueOne = concreteColleagueOne;
    }

    public void setConcreteColleagueTwo(ConcreteColleagueTwo concreteColleagueTwo) {
        this.concreteColleagueTwo = concreteColleagueTwo;
    }



    @Override
    public void sendMessage(String message, Colleague colleague) {
        if(colleague == concreteColleagueOne){
            concreteColleagueTwo.receiveMessage(message);
        }else {
            concreteColleagueOne.receiveMessage(message);
        }
    }
}
