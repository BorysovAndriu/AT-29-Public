package HomeWork_4.Array;

import HomeWork_1.RandomData;

import java.util.Scanner;

public class CharArray extends Array {

    Scanner scanner;

    public void guestValueArray(){
        char[] charArray=RandomData.randomCartArray();
        scanner = new Scanner(System.in);
        System.out.println("Wrote int value: ");
        char number = scanner.next().charAt(0);
        boolean value =false;

        for(int i = 0; i< charArray.length; i++){
            if (charArray[i]==number){
                value = true;
                break;
            } else{
                value = false;
            }
        }

        if(value==true){
            System.out.println("You WIN!!!");
        } else {
            System.out.println("You lose (");
        }
    }

    /*Do Not work yet problem with char
    public char[] intValueFromCharArray(){
        char[] charArray = RandomData.randomCartArray();
        char[] intArray = {'1','2','3','4','5','6','7','8','9','0'};
        char[] intFromCharArray = new char[charArray.length/2];

        for(int i =0; i<charArray.length; i++){
            char number = charArray[i];
            if(number==(intArray[i])){
                intFromCharArray[i] = number;
            }
        }
        for(int i : intFromCharArray){
            System.out.println(intFromCharArray[i]);
        }
        return intFromCharArray;
    }*/
}
