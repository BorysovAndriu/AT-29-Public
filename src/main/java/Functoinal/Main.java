package Functoinal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("a","a","bb","d");

        //Function
        Function<String,String> function = (String s) ->{return "";
        };
        //predicate
        Predicate<String> predicate = (String s) ->{return s.length() ==0;
        };
        //Supplier нічого не поветає

        //Consumer нічого не повертає

        /*stringStream.
                map(s->s.toUpperCase())
                .filter(s->s.length() ==1)
                .distinct()
                .limit(1)
                .forEach(System.out::println);*/

       /*List<Integer> intenger = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> collect = intenger.stream()
                .map(s -> {
                    s += 2;
                    return s.toString();
                })
                .filter(s -> s % 2 == 0)
                .filter(s -> s % 5 == 0)
                .collect(Collectors.toList());*/

       Person person = null;

       Optional<Object> optional = Optional.ofNullable(person);
       System.out.println(optional);
       optional.orElse(new Person());

        Optional<Object> optionals = Optional.ofNullable(person);
    }
}
