package Homework8;

public class Hm4 {
    public static void main(String[] args){
        int n = 3;
        int m = n;
        int max = 0;
        int min = 0;
        int[][] arr = {{2, 3, 5}, {7, 10, 8}, {0, 4, 15}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < arr[i][min]){
                    min = j;
                }
                for (int k = 0; k < n ; k++) {
                    if (arr[k][min] > arr[max][min]){
                        max = k;
                    }
                }
            }
            System.out.println(arr[max][min]);
        }
    }
}
