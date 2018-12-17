package Homework5;

public class Hm2 {
    public static void main(String[] args) {
        String s = "a1 2b6";
        char[] chars = s.toCharArray();
        String sc = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i]<= 57){
                chars[i] = '*';
            }
            sc += chars[i];
        }
        System.out.println(sc);
    }
}
