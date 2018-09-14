import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double srznach=0;
        int m=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            srznach += arr[i];
        }
        srznach = srznach / n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > srznach) {
                m++;
            }
        }
        System.out.print(srznach);
        System.out.print(m);
    }
}
