public class CarBuilder {

    private String name;
    private String model;
    private int year;
    private String color;


    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(name, model, year, color);
    }


}
