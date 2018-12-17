package Homework7;

public class J {
    public static void main(String[] args) {
        if (palindrome ("radar")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
    private static boolean palindrome(String s){
        if(s.length() == 1 || s.length()==0){
            return true;
        }else{
            if (s.charAt(0) == s.charAt(s.length()-1)){
                return palindrome (s.substring(1,s.length()-1));
            }else{
                return false;
            }
        }
    }
}