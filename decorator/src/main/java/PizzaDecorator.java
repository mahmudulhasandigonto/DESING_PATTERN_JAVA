public abstract class PizzaDecorator implements Pizza{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDecoration() {
        return pizza.getDecoration();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
