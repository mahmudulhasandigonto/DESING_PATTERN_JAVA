public class Application {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.err.println(context.getState().toString());


        StopState stopState = new StopState();
        stopState.doAction(context);
        System.err.println(context.getState().toString());

    }
}