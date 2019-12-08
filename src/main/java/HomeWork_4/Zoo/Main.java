package HomeWork_4.Zoo;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        //Open animal
        zoo.openAnimalForWorker();
        System.out.println("Worcker1 has - " + zoo.worker1.getNameAnimal());
        System.out.println("Worcker2 has - " + zoo.worker2.getNameAnimal());
        System.out.println("Worcker3 has - " + zoo.worker3.getNameAnimal());

        //Eating animal
        zoo.timeForEat();
    }
}
