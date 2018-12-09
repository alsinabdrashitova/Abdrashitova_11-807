public class ObjectArrayList implements ObjectIt {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int count = 0;

    public ObjectArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void add(Object e) {
        elements[count++] = e;
    }

    Object get(int index) {
        return elements[index];
    }
        @Override
        public Iterator getIterator() {
            return new MyIter();
        }

        class MyIter implements Iterator {
            private int currentIndex;

            public MyIter() {
                currentIndex = 0;
            }

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public Object next() {
                return elements[currentIndex++];
            }
    }
}