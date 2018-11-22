import java.util.Scanner;

public class Homework_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,2,11,133};
        String str = "";
        System.out.println("Output");
        for (int i = 0; i < 5; i++) {
            str += arr[i];
        }
        int x = Integer.parseInt(str);
        System.out.print(x);
    }
}
