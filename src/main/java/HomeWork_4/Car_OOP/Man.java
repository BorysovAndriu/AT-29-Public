package HomeWork_4.Car_OOP;

public class Man extends Trailer {

    public Man() {
        super();
        setNameCar("MAN ");
        setColor("Red ");
        setWeight(10);
    }

    @Override
    public void move() {
        System.out.println(getNameCar() + getWeight() + "t" + " Move");
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
