public class MargheritaPizza implements Pizza{
    @Override
    public String getDecoration() {
        return "margherita pizza";
    }

    @Override
    public double cost() {
        return 8.99;
    }
}
