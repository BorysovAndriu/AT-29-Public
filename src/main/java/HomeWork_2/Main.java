package HomeWork_2;

import static HomeWork_1.RandomData.setArray;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(setArray());
        //setArray is method that random setting array

        //show average Value of Array
        System.out.println("average value = " + array.averageValue());

        //show min values of Array
        System.out.println("min value = " + array.minValue());

        //show max value of Array
        System.out.println("max value = " + array.maxValue());

        //show pair values fo Array
        for(int i = 0; i<array.pairValueArray().length; i++) {
            System.out.print("[ " + array.pairValueArray()[i] + " ] ");
        }
        System.out.println("pair values of Array");

        //show not pair of Array
        for(int i = 0; i<array.notPairValueArray().length; i++) {
            System.out.print("[ " + array.notPairValueArray()[i] + " ] ");
        }
        System.out.println("not pair values of Array");

        array.indexPAirValueArray();
    }
}
