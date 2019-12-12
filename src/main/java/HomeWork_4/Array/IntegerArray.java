package HomeWork_4.Array;

public class IntegerArray extends Array {

    public double averageArrayValue(){
        double averageValue = 0;
        for (int i : setArray()){
            averageValue += setArray()[i];
        }
        System.out.println("average value of array = " + averageValue/setArray().length);
        return averageValue/setArray().length;
    }

    public int sumPairNumberArray(){
        int sumArray=0;
        for(int i : setArray()) {
            if (setArray()[i] % 2 == 0){
                sumArray += setArray()[i];
            }
        }
        System.out.println("sum pair number array = " + sumArray);
        return sumArray;
    }
}
