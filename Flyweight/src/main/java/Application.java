public class Application {

    private static final String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};

    private static String getRandomColor(){
        return colors[ (int) (Math.random() * colors.length)];
    }

    private static int getRandomX(){
        return (int) (Math.random() * 100);
    }
    private static int getRandomY(){
        return (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRedius(10);
            circle.draw();
        }
    }
}
