package Inner;

public class Feed {

    private String animal;
    private Food food;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    //class in method
    public void feed(){

        class Validate{

        }
    }
    
    //class in class
    public class Food{
        private String type;
        private double wieght;
    }
}
