public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDecoration() {
        return pizza.getDecoration() + " , Extra Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.50;
    }
}
