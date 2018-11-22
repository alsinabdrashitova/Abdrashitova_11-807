import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=-1;
        int max=0;
        for (int i = 0; i < n; i++)  {
            arr[i] = sc.nextInt();
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
                k = i;
            }
        }
        System.out.print(k);
    }
}