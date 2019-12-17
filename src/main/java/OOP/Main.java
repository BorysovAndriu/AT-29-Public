package OOP;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        try{
            main.throwException("exception");

        }catch (Issue | IssueTwo e){
            System.out.println("some run catch");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("some run fa");
        }

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

        /*Person develop = new Develop("Jon, ", 100);

        develop = new PM("free", 4, "UA");
        develop.whoAmI();

        develop.setName("dsdsdsdsd");
        develop.whoAmI();

        develop = new Develop("DELOP", 999999);
        develop.whoAmI();*/
    }

    public void throwException(String s) throws Issue, Exception{
        System.out.println("run some code before exception");
        if("exception".equals(s)) {
            throw new Issue("Exception works fine");
        }
        System.out.println("run some code after exception");
    }
}
