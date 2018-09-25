import java.util.Scanner;

public class Hm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(num(arr));
    }

    public static boolean num(int[] arr) {
        boolean flag = false;
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
