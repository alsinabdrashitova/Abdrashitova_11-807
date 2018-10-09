import java.util.Scanner;

public class Hm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
    //    int sum = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if ( i < j){
         //           sum += arr[i][j];
                }
            }
        }
        System.out.println(mSum(arr));
    }
    public static int mSum( int arr[][]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
