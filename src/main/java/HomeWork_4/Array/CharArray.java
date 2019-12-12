package HomeWork_4.Array;

import HomeWork_1.RandomData;

import java.util.Scanner;

public class CharArray extends Array {

    Scanner scanner;

    public void guestValueArray(){
        char[] charArray=RandomData.randomCharArray();
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
}
