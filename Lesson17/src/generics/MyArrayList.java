package generics;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private static final double EXTENSION_COEF = 1.5;


    public MyArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    public void add(T e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        T[] newElements =(T[]) new Object[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    int size() {

        return count;
    }

    boolean contains(T value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return true;
            }
        }

        return false;
    }

    void remove (int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        index ++;
            for (int i = index; i <  count; i++) {
                elements[i -1] = elements[i];
            }
            count --;
        }

    T[] toArray() {
        T[] mas =(T[]) new Object[count];
        System.arraycopy(elements, 0, mas, 0, count);
        return mas;
    }

    void addAll(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }

    }

    void addAll(MyArrayList<T> list, int index) {
        for (int i = index; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    public Iterator<T> iterator() {
        return new MyIter();
    }

    public class MyIter implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            return elements[currentIndex++];
        }
    }
}
