package HomeWork_4.Zoo;

public class Zoo {

    WorkerZoo worker1 = new WorkerZoo("meal");
    WorkerZoo worker2 = new WorkerZoo("banana");
    WorkerZoo worker3 = new WorkerZoo("lemon");

    Animal lion = new Animal("Lion"){
        @Override
        public void eat(Eat eat){
            try {
                if(!worker1.getNameFood().equals(eat.lionEat)) {
                    throw new WrongTypeOfFood(worker1.getNameFood() + " it's Wrong type of food");
                }else {
                    System.out.println(worker1.getNameFood() + " it's correct food");
                }
            }catch (WrongTypeOfFood wrongTypeOfFood){
                System.out.println(wrongTypeOfFood.getMessage());
            }
        }
    };
    Animal monkey = new Animal("Monkey"){
        @Override
        public void eat(Eat eat){
            try {
                if(!worker2.getNameFood().equals(eat.monkeyEat)) {
                    throw new WrongTypeOfFood(worker2.getNameFood() + " it's Wrong type of food");
                }else {
                    System.out.println(worker2.getNameFood() + " it's correct food");
                }
            }catch (WrongTypeOfFood wrongTypeOfFood){
                System.out.println(wrongTypeOfFood.getMessage());
            }
        }
    };
    Animal zebra = new Animal("Zebra"){
        @Override
        public void eat(Eat eat){
            try {
                if(!worker3.getNameFood().equals(eat.zebraEat)) {
                    throw new WrongTypeOfFood(worker3.getNameFood() + " it's Wrong type of food");
                }else {
                    System.out.println(worker3.getNameFood() + " it's correct food");
                }
            }catch (WrongTypeOfFood wrongTypeOfFood){
                System.out.println(wrongTypeOfFood.getMessage());
            }
        }
    };

    public void openAnimalForWorker(){
        worker1.setNameAnimal(lion.nameAnimal);
        worker2.setNameAnimal(monkey.nameAnimal);
        worker3.setNameAnimal(zebra.nameAnimal);
    }

    public void timeForEat(){
        lion.setFood(worker1.getNameFood());
        System.out.println("Worker1 give " + lion.getFood() + " " + worker1.getNameAnimal());
        lion.eat(eatFood);
        monkey.setFood(worker2.getNameFood());
        System.out.println("Worker2 give " + monkey.getFood() + " " + worker2.getNameAnimal());
        monkey.eat(eatFood);
        zebra.setFood(worker3.getNameFood());
        System.out.println("Worker3 give " + zebra.getFood() + " " + worker3.getNameAnimal());
        zebra.eat(eatFood);
    }

    class WorkerZoo{
        String nameAnimal;
        String nameFood;

        public WorkerZoo(String nameFood) {
            this.nameFood = nameFood;
        }

        public String getNameFood() {
            return nameFood;
        }

        public String getNameAnimal() { return nameAnimal;}

        public void setNameAnimal(String nameAnimal) { this.nameAnimal = nameAnimal;}
    }

    class Animal{
        String nameAnimal;
        String food;

        public Animal(String nameAnimal) {
            this.nameAnimal = nameAnimal;
        }

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public void eat (Eat eat){}
    }

    interface Eat{
        String lionEat = "zebra";
        String monkeyEat = "banana";
        String zebraEat = "lemon";
    }

    static Eat eatFood = new Eat() {};

    class WrongTypeOfFood extends Exception {
        public WrongTypeOfFood(String message) {
            super(message);
        }
    }
}
