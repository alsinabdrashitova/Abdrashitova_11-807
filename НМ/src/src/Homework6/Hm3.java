import java.util.Scanner;

public class Hm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0, 5, 5, 8, 5, 7, 7, 7, 11};
        int count = 1;
        int max = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else
                if (max < count) {
                    max = count;
                    count = 1;
                }
            }
            System.out.println(max);
        }
    }
