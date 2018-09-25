import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();
        System.out.println(spaceDel(m));
    }

    public static String spaceDel(String m) {
        char[] arr = m.toCharArray();
        int i = 0;
        while (arr[i] == ' ') {
            i++;
        }
        return m.substring(i);
    }
}
