public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in the start state");
        context.setState(this);

    }

    @Override
    public String toString() {
        return "Start State{}";
    }
}
