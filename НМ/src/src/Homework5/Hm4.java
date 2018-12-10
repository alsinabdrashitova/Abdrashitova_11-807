package Homework5;

import java.util.Scanner;

public class Hm4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String s1 = sc.next();
            System.out.print("Введите ключ (l - нижний регистр/u - верхний регистр): ");
            String a = sc.next();
            if (a.equals("u")) {
                System.out.println(s1.toUpperCase());
            }
            else {
                System.out.println(s1.toLowerCase());
            }
        }
    }
