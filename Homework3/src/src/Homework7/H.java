package src.Homework7;

import java.util.Scanner;

public class H {
    public static int recurs(int n, int m) {
        if (n < 2) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n % m == 0) {
            return 0;
        } else if (m < n / 2) {
            return recurs(n, m + 1);
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        recurs(13, 2);
        if (recurs(13, 2) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}