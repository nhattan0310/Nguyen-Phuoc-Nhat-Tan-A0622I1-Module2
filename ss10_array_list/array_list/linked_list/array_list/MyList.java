package ss10_array_list.array_list.linked_list;

import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
    }
    public MyList(int capacity){
        elements = new Object [capacity];
    }
    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void addIndex(int index,E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size-1] = element;
    }
    public E remove(int index){
        if (index > 0 || index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            --size;
        }
        return (E) elements;
    }
    public boolean contain(E index) {
        for (int i = 0; i < elements.length; i++) {
            if (index == elements[i]) {
                return true;
            }
        }
        return false;
    }
}