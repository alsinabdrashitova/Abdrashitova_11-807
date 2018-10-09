//Вариант 2

import java.util.Scanner;
import java.util.Arrays;

public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = getSideDiagonalAsVector(matrix);
        int[] arr1 = mult(matrix, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        sortArr(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            arr[i] = matrix[i][matrix.length - i - 1];
        }
        return arr;
    }

    public static int[] mult(int[][] matrix, int[] arr) {
        int[] arr1 = new int[matrix.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr1[i] += (matrix[i][j] * arr[j]);
            }
        }
        return arr1;
    }

    public static void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    int arr2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arr2;
                }
            }
        }
    }
}
