import java.util.Scanner;

public class Hm2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] arr = n.toCharArray();
        n = "" ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > '0' && arr[i] < '9') {
                arr[i] = '*' ;
            }
            n += arr[i] ;
        }
        System.out.println(n);
    }
}
