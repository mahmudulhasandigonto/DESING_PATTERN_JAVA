public class Circle implements Shape{
    private final String color;
    private int x;
    private int y;
    private int redius;


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public Circle(String color) {
        this.color = color;
    }



    @Override
    public void draw() {
        System.out.println("Drawing Circle "+ color + " x "+ x + " y "+ y + " redius "+ redius);
    }
}
