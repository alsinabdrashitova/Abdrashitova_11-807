package Homework7;

public class I {
    public static void main(String[] args) {
        recurs(132, 2);

    }

    public static void recurs(int n, int k) {
        if (k > n) {
            System.out.println(n);
            return;
        }
        while (k <= n) {
            if ((n % k) == 0) {
                System.out.println(k);
                recurs(n / k, k);
            } else {
                recurs(n, k + 1);
            }
            break;
        }
    }
}

