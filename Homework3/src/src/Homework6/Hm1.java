import java.util.Arrays;
import java.util.Scanner;

public class Hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = {"jgdfgh", "hfsaws", "adcvgh"};
        liner(arr);
        System.out.println(Arrays.asList(arr));
    }

    static void liner(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }
}