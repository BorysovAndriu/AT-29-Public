package Generics;

public class ArrayLits<E> {

    Object[] objects = new Object[10];

    public E getE(int i) {
        return (E) objects[i];
    }

    /*public E setE(E item, int i) {
         objects[i] = item;
    }*/
}
