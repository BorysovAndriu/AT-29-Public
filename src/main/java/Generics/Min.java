package Generics;


import java.util.Arrays;
import java.util.List;

public class Min {

    public static void main(String[] args) {
       /* List<String> string = Arrays.asList("1","2","3");

        sum(string);*/
        //sum1(string); - error

        String[] s = new String[]{"a","b"};
        Object[] o = s;
        //o[1] = 12; // error

        List<Integer> ints = Arrays.asList(1,1,2,3);
        //List<Number> number = ints; error

        List<Integer> ints2 = Arrays.asList(1,1,2,3);
        //List<? extends  Number> nmbr = ints;
        //List<? super  Number> nmbr1 = ints;

        ArrayLits <String> lits = new ArrayLits<>();
    }

    public static double sum (List accounts) {
        double sum = 0;
        for(Object o : accounts){
            if(o instanceof Account){
                System.out.println("=====");
                Account account = (Account) o;
                sum += ((Account) o).getAmount();
            }
        }
        return  sum;
    }

    public static double sum1 (List <Account> accounts) {
        double sum = 0;
        for(Account account : accounts){
            sum += account.getAmount();
        }
        return sum;
    }

}
