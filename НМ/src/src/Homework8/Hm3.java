package Homework8;

import java.util.Scanner;

public class Hm3 {
    public  static void main  (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int count = 1;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1; j++) {
                mat[i][j] = count++;
            }
            for (int j = 0; j < n - 1 - i; j++) {
                mat[j][n-1-i] = count++;
            }
            for (int j = n - 1 - i; j > i; j--) {
                mat[n - 1 - i][j] = count++;

            }
            for (int j = n - 1 - i; j > i; j--) {
                mat[j][i] = count++;

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");

            }
            System.out.println();

        }
    }
}
