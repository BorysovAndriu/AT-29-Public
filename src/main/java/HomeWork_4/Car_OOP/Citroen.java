package HomeWork_4.Car_OOP;

public class Citroen extends Van {


    public Citroen() {
        super();
        setNameCar("CITROEN ");
        setColor("Black ");
    }

    @Override
    public void move() {
        System.out.println(getNameCar() + " Move");
    }

    @Override
    public void stop() {
        System.out.println(getNameCar() + "Stop");
    }

    @Override
    public void turnLeft() {
        System.out.println(getColor() + getNameCar() + "turn left");
    }

    @Override
    public void turnRight() {
        System.out.println(getColor() + getNameCar() + "turn right");
    }
}
