public class TestClass {

    public static void main(String[] args) {
        RandomData val = new RandomData();

        System.out.println("a = " + val.a + "; "
                + "b = " + val.b + "; "
                + "c = " + val.c + "; "
                + "d = " + val.d + "; "
                + "e = " + val.e + "; ");

        double res1 = (val.a+val.b)/(val.b-val.d)*2;
        double res2 = val.a+2*2-12/val.a*(val.b-val.c);
        double res3 = val.b-11*val.c-val.a;
        double res4 = val.a * (val.b + val.c + val.d) - val.e / val.c + val.a;
        double res5 = val.a + val.b * (val.a - val.b) / 12;

        System.out.println("result of formula #1 = " + res1);
        System.out.println("result of formula #2 = " + res2);
        System.out.println("result of formula #3 = " + res3);
        System.out.println("result of formula #4 = " + res4);
        System.out.println("result of formula #5 = " + res5);
    }
}
