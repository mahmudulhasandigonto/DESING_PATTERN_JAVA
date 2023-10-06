public class Application{

    public static void main(String[] args) {
        Image imageOne = new ImageProxy("image One");
        Image imageTwo = new ImageProxy("image two");

        imageOne.display();
        imageTwo.display();

    }
}
