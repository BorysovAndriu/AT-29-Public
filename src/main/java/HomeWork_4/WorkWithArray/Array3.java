package HomeWork_4.WorkWithArray;

import HomeWork_2.Array1;

import static HomeWork_1.RandomData.setArray;
import static HomeWork_4.Array.Array.showElementsArray;

public class Array3 {

    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    Array1 array = new Array1(arr);

    public void showSumPairValueViaArray(){
        showElementsArray(array.pairValueArray());
    }

    public void showAverageValueViaArray(){
        System.out.println(array.averageValue());
    }

    public void showRandomValue(){
        int someValue = setArray(1)[0];
        if(someValue % 3 == 0){
            System.out.println("division on 3 = " + someValue);
        }else if(someValue % 5 == 0){
            System.out.println("division on 5 = " + someValue);
        }else if(someValue % 7 == 0){
            System.out.println("division on 7 = " + someValue);
        }else{
            System.out.println("Not division =  " + someValue);
        }
    }

    public void fiftyRandomValues(){
        int [] arr50 = setArray(50);
        int sumValueDivisionOnSeven = 0;
        for(int i = 0; i<arr50.length; i++ ){
            if(arr50[i]%7 == 0 ){
                sumValueDivisionOnSeven += arr50[i];
                System.out.print(arr50[i] + ", ");
            }
        }
        System.out.println("sum = " + sumValueDivisionOnSeven);
    }
}
