package OOP;

public class Main {

    public static void main(String[] args) {

        /*Person person = new Person("Johm", 12);
        Person person1 = person.getPerson();

        System.out.println(person1.age);
        *//*person.name = "John";

        System.out.println(person.name);
        System.out.println(person.age);

        person.whoAmI();
        System.out.println(person.getAge());*//*

        Person.foo();*/

        /*int i = 0;
        while(i<10){
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        Person develop = new Develop("Jon, ", 100);

        develop = new PM("free", 4, "UA");
        develop.whoAmI();

        develop.setName("dsdsdsdsd");
        develop.whoAmI();

        develop = new Develop("DELOP", 999999);
        develop.whoAmI();
    }
}
