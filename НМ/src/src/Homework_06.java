import java.util.Scanner;

public class Homework_06 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Write quantity");
        int size = num.nextInt();
        int[] mas = new int[size];
        System.out.print("Write numbers");

        for(int i = 0; i < size; i++){
            mas[i] = num.nextInt();
        }
        System.out.print("Expanded array");
        for(int j = size - 1 ; j >= 0 ; j--){
            System.out.print(mas[j] + " ");
        }
    }
}
