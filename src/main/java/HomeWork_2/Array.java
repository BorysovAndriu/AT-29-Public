package HomeWork_2;

public class Array {

    private int arr[];

    public Array(int[] arr) {
        this.arr = arr;
    }

    public Array() {
    }

    public double averageValue() {
        double sumArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArray += arr[i];
        }
        sumArray /= arr.length;
        return sumArray;
    }

    public int minValue() {
        int min = 0;
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int maxValue() {
        int max = 0;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int divisionOnTwo(int[] arr, boolean pair) {

        int sizeArrayPair = 0;
        int sizeArrayNotPair = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sizeArrayPair += 1;
            } else if (arr[i] % 2 == 1) {
                sizeArrayNotPair += 1;
            }
        }
        if (pair == true) {
            return sizeArrayPair;
        } else {
            return sizeArrayNotPair;
        }
    }

    public int[] pairValueArray() {

        int[] newArray = new int[divisionOnTwo(arr, true)];

        //set new array
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int pairValue = arr[i];
                newArray[j] = pairValue;
                j++;
            }
        }
        return newArray;
    }

    public int[] notPairValueArray() {

        int[] newArray = new int[divisionOnTwo(arr, false)];

        //set new array
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                int pairValue = arr[i];
                newArray[j] = pairValue;
                j++;
            }
        }
        return newArray;
    }

    public void indexPairValueArray() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " index(" + i + ") ");
            }
        }
    }


}
