package HomeWork_4.Car_OOP;

public class Main {

    public static void main(String[] args) {

        Truck citroen = new Citroen();
        citroen.move();
        citroen.turnLeft();
        citroen.turnRight();
        citroen.stop();

        Truck man = new Man();
        man.move();
        man.stop();

    }
}
