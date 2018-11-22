package src.Homework7;

import java.util.Scanner;

public class F{
        public static int recurs(int n) {
            if (n < 10) {
                return n;
            } else {
                System.out.print( n % 10 + "\n");
                return recurs(n/10)  ;
            }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = recurs(336);
            System.out.println(n);
        }
}
