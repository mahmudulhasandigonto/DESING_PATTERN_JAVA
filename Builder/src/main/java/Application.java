public class Application {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setName("toyota")
                .setColor("red")
                .build();

        System.out.println(car.getColor());
    }
}
