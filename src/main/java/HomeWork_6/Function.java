package HomeWork_6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Function {

    String[] someString;
    Integer[] someInt;

    public Function(Integer[] someInt) {
        this.someInt = someInt;
    }

    public Function(String[] someString) {
        this.someString = someString;
    }

    public void showSomeString(){
        Arrays.stream(someString)
                .filter(s -> s.contains("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void showSomeInt(){
        Arrays.stream(someInt)
               .filter(i -> i % 2 == 0)
               .limit(2)
               .collect(Collectors.toSet())
               .forEach(System.out::println);
    }
}
