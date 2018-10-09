//Вариант 2

import java.util.Scanner;

public class ClassTestTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = n.charAt(0) - 48;
        for (int i = 1; i < n.length(); i = i + 2) {
            if (n.charAt(i) == '+') {
                sum += n.charAt(i + 1) - 48;
                }else{
                    if (n.charAt(i) == '-'){
                        sum -= n.charAt(i + 1) - 48;
                    }
                }
            }
        System.out.println(sum);
    }
}