import java.util.concurrent.ThreadLocalRandom;

public class RandomData {

    int a = ramdomInt();
    int b = ramdomInt();
    int d = ramdomInt();
    int c = ramdomInt();
    int e = ramdomInt();

    static int ramdomInt(){
        int randomNum = ThreadLocalRandom
                .current()
                .nextInt(0, 50 + 1);
        return randomNum;
    }
}
