import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("result of formula #1 = " + formula1());
        System.out.println("result of formula #2 = " + formula2());
        System.out.println("result of formula #3 = " + formula3());
        System.out.println("result of formula #4 = " + formula4());
        System.out.println("result of formula #5 = " + formula5());

    }

    static double formula1(){
        RandomData val = new RandomData();
        System.out.println("a = " + val.a + "; "
                + "b = " + val.b + "; "
                + "d = " + val.d + "; ");

        return (val.a+val.b)/(val.b-val.d)*2;
    }

    static double formula2(){
        RandomData val = new RandomData();
        System.out.println("a = " + val.a + "; "
        + "b = " + val.b + "; "
        + "c = " + val.c + "; ");

        return val.a+2*2-12/val.a*(val.b-val.c);
    }

    static double formula3(){
        RandomData val = new RandomData();
        System.out.println("a = " + val.a + "; "
        + "b = " + val.b + "; "
        + "c = " + val.c + "; ");

        return val.b-11*val.c-val.a;
    }

    static double formula4() {
        RandomData val = new RandomData();
        System.out.println("a = " + val.a + "; "
                + "b = " + val.b + "; "
                + "c = " + val.c + "; "
                + "d = " + val.d + "; "
                + "e = " + val.e + "; ");

        return val.a * (val.b + val.c + val.d) - val.e / val.c + val.a;
    }

    static double formula5() {
        RandomData val = new RandomData();
        System.out.println("a = " + val.a + "; "
                + "b = " + val.b + "; ");

        return val.a + val.b * (val.a - val.b) / 12;
    }
}
