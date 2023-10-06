package org.example;

public class Main {
    public static void main(String[] args) {

       ConcreteMediator mediator = new ConcreteMediator();
       ConcreteColleagueOne concreteColleagueOne = new ConcreteColleagueOne(mediator);
       ConcreteColleagueTwo concreteColleagueTwo = new ConcreteColleagueTwo(mediator);

       mediator.setConcreteColleagueOne(concreteColleagueOne);
       mediator.setConcreteColleagueTwo(concreteColleagueTwo);


       concreteColleagueOne.sendMessage("What the hell are you dong?");
       concreteColleagueTwo.sendMessage("Wait a second");



    }
}