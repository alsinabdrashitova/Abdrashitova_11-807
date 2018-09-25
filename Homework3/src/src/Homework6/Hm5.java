import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(uniqueCount(arr,arr2) + uniqueCount(arr2,arr));
    }

    public static int uniqueCount(int[] arr, int[] arr2) {
        int k = 0;
        int j = 0;
        int m = arr.length;
        int m1 = arr2.length ;
        for (int i = 0; i < m; i++) {
            for (j = 0; j < m1; j++) {
                if (arr[i] == arr2[j]) break;
            }
            if (j == m1) k++;
        }
        return k;
    }
}