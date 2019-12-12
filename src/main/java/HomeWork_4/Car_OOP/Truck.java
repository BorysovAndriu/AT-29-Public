package HomeWork_4.Car_OOP;

public class Truck implements Vehicle{

    private String nameCar;
    private int weight;
    private String color;

    public Truck() {}

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {}

    @Override
    public void stop() {}

    @Override
    public void turnLeft() {}

    @Override
    public void turnRight() {}
}
