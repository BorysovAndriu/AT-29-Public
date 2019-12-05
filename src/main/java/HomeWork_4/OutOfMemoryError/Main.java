package HomeWork_4.OutOfMemoryError;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        while(true) list.add(new String("write to some"));
    }
}
