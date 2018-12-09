import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectArrayList oal = new ObjectArrayList();
        oal.add("abc");
        oal.add("ha-ha");
        oal.add("qwerty");
        oal.add("0987");
        String s = (String) oal.get(2);
        Iterator iterator = (Iterator) ObjectArrayList.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()                                                   );
        }

    }
}