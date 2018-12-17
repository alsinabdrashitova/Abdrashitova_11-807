package Homework7;


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
            int n = recurs(336);
            System.out.println(n);
        }
}
