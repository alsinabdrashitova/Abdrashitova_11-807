import java.util.Scanner;

public class Hm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,2,3,4};
        int[] arr2 = {2,3,4};
        int index = -1;
        int k=0;
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] == arr2[0]) {
                index = i;
                for (int j = index; j < arr2.length-1+index; j++) {
                    if (arr1[j] != arr2[k]){
                        index = -1;
                        break;
                    }
                    k++;
                }
            }
            if (index != -1) {
                break;
            }
        }
        System.out.println(index);
    }
}