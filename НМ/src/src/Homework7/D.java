package Homework7;

import java.util.Scanner;

public class D {
    public static int recurs(double n) {
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        }else{
            return recurs(n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = recurs(16);
        {
            if (n == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}




