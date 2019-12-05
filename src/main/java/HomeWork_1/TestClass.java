package HomeWork_1;

public class TestClass {

    public static void main(String[] args) {

        //Fist task
        //create object
        RandomData val = new RandomData();

        //show value
        System.out.println("a = " + val.a + "; "
                + "b = " + val.b + "; "
                + "c = " + val.c + "; "
                + "d = " + val.d + "; "
                + "e = " + val.e + "; ");

        //realize formuls
        double res1 = (val.a + val.b) / (val.b - val.d) * 2;
        double res2 = val.a + 2 * 2 - 12 / val.a * (val.b - val.c);
        double res3 = val.b-11*val.c-val.a;
        double res4 = val.a * (val.b + val.c + val.d) - val.e / val.c + val.a;
        double res5 = val.a + val.b * (val.a - val.b) / 12;

        //show results
        System.out.println("result of formula #1 = " + res1);
        System.out.println("result of formula #2 = " + res2);
        System.out.println("result of formula #3 = " + res3);
        System.out.println("result of formula #4 = " + res4);
        System.out.println("result of formula #5 = " + res5);

        //Second task
        //show date
        for(int i : RandomData.setArray(10)){
            if(i % 2 == 0){
                System.out.println("/2 = " + i);
            } else if (i % 3 ==0){
                System.out.println("/3 = " + i);
            } else if (i % 5 == 0) {
                System.out.println("/5 = " + i);
            } else if (i % 7 == 0) {
                System.out.println("/7 = " + i);
            }
        }

        //Threth task
        int[] arr = RandomData.setArray(10);

        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int i =0; i<arr.length; i++) {
            System.out.print("[ " + arr[i] + " ]");
        }
    }
}
