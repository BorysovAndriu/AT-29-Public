package Collection;

public class Person implements Comparable<Person>{

    private String name;

    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.age.compareTo(this.age) - o.name.compareTo(this.name);
    }
}
