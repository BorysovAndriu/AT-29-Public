package HomeWork_1;

import java.util.concurrent.ThreadLocalRandom;

public class RandomData {

    int a = ramdomInt();
    int b = ramdomInt();
    int d = ramdomInt();
    int c = ramdomInt();
    int e = ramdomInt();

    static int ramdomInt(){
        int randomNum = ThreadLocalRandom
                .current()
                .nextInt(0, 81 + 1);
        return randomNum;
    }

    public static int[] setArray(){
        int[] arrVal = new int[10];

        for(int i = 0; i<arrVal.length; i++){
            arrVal[i] = RandomData.ramdomInt();
            System.out.print("[ " + arrVal[i] + " ]");
        }
        System.out.println("size - " + arrVal.length);
        return arrVal;
    }
}
