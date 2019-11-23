package OOP;

public class Person {

    private String name;
    int age;
    char nameVal;
    String primarySkill;

    /*public Person(){

    }*/

    public Person(String name){
        this.name=name;
    }

    public Person(String name, int age){
        this.name = name ;
        this.age = age;
    }

    public Person(){
        this.name = name ;
        this.age = age;
        this.primarySkill=primarySkill;
    }


    public void whoAmI() {
        System.out.println("My name is " + name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* public static void foo() {
        System.out.println("test test ");
    }*/


}
