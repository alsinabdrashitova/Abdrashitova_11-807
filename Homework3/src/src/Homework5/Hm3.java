import java.util.Scanner ;

public class Hm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        char[] arr = m.toCharArray();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            n = n * 10 + arr[1]-46;
        }
        System.out.println(n);
    }
}
