package HomeWork_2;

import static HomeWork_1.RandomData.setArray;

public class Main {

    public static void main(String[] args) {

        Array1 array1 = new Array1(setArray(10));
        //setArray is method that random setting array

        //show average Value of Array
        System.out.println("average value = " + array1.averageValue());

        //show min values of Array
        System.out.println("min value = " + array1.minValue());

        //show max value of Array
        System.out.println("max value = " + array1.maxValue());

        //show pair values fo Array
        for(int i = 0; i< array1.pairValueArray().length; i++) {
            System.out.print("[ " + array1.pairValueArray()[i] + " ] ");
        }
        System.out.println("pair values of Array");

        //show not pair of Array
        for(int i = 0; i< array1.notPairValueArray().length; i++) {
            System.out.print("[ " + array1.notPairValueArray()[i] + " ] ");
        }
        System.out.println("not pair values of Array");

        array1.indexPairValueArray();
    }
}
