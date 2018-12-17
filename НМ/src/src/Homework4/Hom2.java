package Homework4;

import java.util.Scanner;

public class Hom2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = "abcde";
        int n = 2;
        char[] chars = m.toCharArray();
        String[] m1 = new String[m.length()];
        for (int i = 0; i < chars.length; i++) {
            m1[(i + n) % chars.length] = String.valueOf(chars[i % chars.length]);

        }
        for (int i = 0; i < m1.length ; i++) {
            System.out.print(m1[i]);
        }


    }
}