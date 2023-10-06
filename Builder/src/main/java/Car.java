public class Car {

    private String name;
    private String model;
    private int year;
    private String color;


    public Car(String name, String model, int year, String color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
