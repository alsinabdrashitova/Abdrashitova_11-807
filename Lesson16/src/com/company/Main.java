

public class Main {

    public static void main(String[] args) {
	    IntList list = new IntArrayList();
	    list.add(42);//{42}
        System.out.println(list.get(0));
        System.out.println(list.contains(42));
        IntList list2 = new IntArrayList();
        list2.add(43);
        list2.add(44);
        list2.add(45);//{43, 44, 45}
        list.addAll(list2);
        list.indexOf(42);

        System.out.println("Количество элементов:" + list.size());
        System.out.println("Количество элементов:" + list2.size());
        list.sort();
    }
}
