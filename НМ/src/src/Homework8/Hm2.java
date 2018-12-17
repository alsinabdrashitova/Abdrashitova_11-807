package Homework8;

import java.util.Scanner;

public class Hm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк(столбцов):");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int sum2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            for (int j = 0; j < m; j++) {
                sum1 += matrix[i][j];
            }
            if (sum1 > sum2) {
                sum2 = sum1;
                sum = i;
            }
        }
        int sum3 = 0;
        int sum5 = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            int sum4=0;
            for (int i = 0; i < n; i++) {
                sum4 += matrix[i][j];
            }
            if (sum4 > sum5) {
                sum5 = sum4;
                sum3 = j;
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(matrix[sum][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][sum3] + " ");
        }
    }
}
