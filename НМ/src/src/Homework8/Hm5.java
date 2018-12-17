package Homework8;

public class Hm5 {
    public static void main(String[] args) {
        int[][] arr = {{2, 33, 17}, {3, 2, 0}, {5, 7, 10}};
        int[][] arr1 = {{3, 5, 10}, {0, 0, 2}, {3, 10, 15}};
        int m = 3;
        int n = 3;
        int e = 3;
        int[][] arr2 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < e; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.format("%4d", arr2[i][j]);
            }
            System.out.println();
        }

    }
}
