package HomeWork_4.Array;

import HomeWork_1.RandomData;

public class Main {

    public static void main(String[] args) {
        Array array= new Array();
        array.showElementsArray(RandomData.setArray(10));
        array.sumNotPairValue();
        IntegerArray integerArray = new IntegerArray();
        integerArray.averageArrayValue();
        integerArray.sumPairNumberArray();
        CharArray charArray = new CharArray();
        charArray.guestValueArray();
    }
}
