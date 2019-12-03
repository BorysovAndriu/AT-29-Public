package HomeWork_1;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomData {

    int a = ramdomInt();
    int b = ramdomInt();
    int d = ramdomInt();
    int c = ramdomInt();
    int e = ramdomInt();

    static int ramdomInt() {
        int randomNum = ThreadLocalRandom
                .current()
                .nextInt(0, 81 + 1);
        return randomNum;
    }

    public static int[] setArray() {
        int[] arrVal = new int[10];

        for (int i = 0; i < arrVal.length; i++) {
            arrVal[i] = RandomData.ramdomInt();
            System.out.print("[ " + arrVal[i] + " ]");
        }
        System.out.println("size - " + arrVal.length);
        return arrVal;
    }

    public static char[] randomCartArray(){
        char[] randomCharArray = new char[10];
        String randomChar = "12345abcde";
        Random r = new Random();
        for(int i = 0; i< randomCharArray.length; i++) {
            randomCharArray[i] = randomChar.charAt(r.nextInt(randomCharArray.length));
        }
        System.out.println(randomCharArray);
        return randomCharArray;
    }
}
