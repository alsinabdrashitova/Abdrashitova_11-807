package Homework5;

public class Hm3 {
    public static void main(String[] args) {
        String sc = "2389";
        char[] s = sc.toCharArray();
        int n =0;
        for (int i = 0; i < s.length ; i++) {
            n = n*10 + s[i] - 48;
        }
        System.out.println(n);
    }
}
