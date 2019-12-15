package HomeWork_4.Array;

public class Array {

    public static void showElementsArray(int[] array){
        for(int i =0; i< array.length; i++){
            System.out.print("[ " + array[i] + " ]");
        }
    }

    public int[] setArray(){
        int[] arrVal = new int[10];

        for(int i = 1; i<arrVal.length; i++){
            arrVal[i] = i;
        }
        return arrVal;
    }

    public int sumNotPairValue(){

        int sumNotPair = 0;

        for(int i : setArray()){
            if (setArray()[i]%2 != 0){
                sumNotPair+=setArray()[i];
            }
        }
        System.out.println("sum not pair value of array = " + sumNotPair);
        return sumNotPair;
    }
}
