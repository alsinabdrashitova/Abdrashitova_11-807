public class IntArrayList implements IntList {
    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int e) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (elements[i] == e) {
                found = true;
                break;
            }
        }

        return found;
    }

    @Override
    public void add(int e) {
        if (capacity == count) {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int newCapacity = (int) (capacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < capacity; i++) {
            newElements[i] = elements[i];
        }
        capacity = newCapacity;
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        return elements[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("No such index");
        }
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                int[] NewArray = new int[elements.length - 1];
                System.arraycopy(elements, 0, NewArray, 0, i);
                System.arraycopy(elements, i + 1, NewArray, i, elements.length - 1 - index);
                elements = NewArray;
            }
        }

    }

    @Override
    public void sort() {
        int k = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i + 1]) {
                k = elements[i];
                elements[i] = elements[i + 1];
                elements[i + 1] = k;
            }
        }

    }

    @Override
    public void addAll(IntList intList) {
        for (int i = 0; i < intList.size(); i++) {
            add(intList.get(i));
        }

    }

    @Override
    public void addAll(IntList intList, int startPosition) {
        for (int i = startPosition; i < intList.size(); i++) {
            add(intList.get(i));
        }

    }

    @Override
    public int[] toArray() {
        int[] mas = new int[count];
        System.arraycopy(elements, 0, mas, 0, count);
        return mas;
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return 0;
    }
}
