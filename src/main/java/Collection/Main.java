package Collection;

import HomeWork_1.RandomData;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*LinkedList<String> linkedList = new LinkedList();
        List<String> arrayList = new ArrayList();
        LinkedList<String> listName = new LinkedList();

        for(int i = 0; i<5; i++){
            linkedList.add(i+1);
            System.out.println(linkedList.get(i));
        }

        String[] names = {"Jon","Gitler","Lven"};
        for(int i = 0; i<names.length; i++){
            arrayList.add(names[i]);
            System.out.println(arrayList.get(i));
        }*/

        /*for(int i = arrayList.size()-1; i>=0; i--) {
            System.out.println(arrayList.get(i));
        }*/

        /*for(int i = 0; i<names.length; i++){
            linkedList.add(names[i]);
            System.out.println(linkedList.get(i));
        }*/

        /*Random random = new Random();

        List<Integer> number = new ArrayList<>();

        for(int i = 0 ; i<10; i++){
            number.add(random.nextInt(100));
        }
        System.out.println(number);

        Iterator<Integer> integer = number.iterator();

        while(integer.hasNext()){
            System.out.println(integer.next());
            integer.remove();
        }

        System.out.println(number);
*/

        /*Person p1 = new Person("xon", 1);
        Person p2 = new Person("Max", 11);
        Person p3 = new Person("Max", 11);

        TreeSet<Person> treeSet = new TreeSet();

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        System.out.println(treeSet);*/

        HashMap<String,String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("ASDF","qwe");

        TreeMap<String, String> stringStringTreeMap = new TreeMap<>();
        stringStringTreeMap.put("asdf","qwer");

        LinkedHashMap<String, String> stringStringLinkedHashMap =new LinkedHashMap<>();
        stringStringLinkedHashMap.put("key", "sdasdasd");

        /*char[] charArray= RandomData.randomCharArray();
        for(int c : charArray){
            System.out.println(charArray[c]);
        }*/

        char[] arrayCH = {'3', '8', '3', '$','^'};

        for (int i=0; i<arrayCH.length;i++) {
                System.out.println((int)(arrayCH[i]));
            }

    }
}
