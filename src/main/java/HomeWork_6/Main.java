package HomeWork_6;

public class Main {

    public static void main(String[] args) {

        //HW 1
        new Guitar().play();
        new Violin().play();

        //HW2
        Function function =new Function(new String[]{"Andriu", "Mark", "Irin","Mark"});
        function.showSomeString();
        function = new Function(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        function.showSomeInt();


    }
}
