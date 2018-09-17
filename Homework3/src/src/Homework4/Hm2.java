import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int k = sc.nextInt();
        int length = string.length();
        char[] char1 = string.toCharArray();
        char[] char2 = new char[k];
        for (int i = 0; i < k ; i++) {
            char2[i]=char1[length-k+i];
        }
        for (int i = 0; i < length - k; i++) {
            char1[length - 1 - i] = char1[length - 1 - i - k];
        }
        for (int i = 0; i < k; i++) {
            char1[i] = char2[i];
        }
        for (int i = 0; i < length; i++) {
            System.out.print(char1[i]);
        }
    }
}