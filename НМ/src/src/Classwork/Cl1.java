import java.util.Scanner;

public class Cl1 {
    public static void main(String[] args) {
        int da = 1;
        int yes = 2;
        double otv = 0;
        double i = 0;
        Scanner sc = new Scanner(System.in);
        while (da == 1) {
            if (yes != 1) {
                System.out.println("Введите 1 число");
                i = sc.nextInt();
            } else {
                i = otv;
            }
            System.out.println("Введите номер операции");
            System.out.println("1 - Сложение \n , 2 - Разность \n , 3 - Деление \n , 4 - Умножение \n");
            int m = sc.nextInt();
            double c = 0;
            otv = 0;
            switch (m) {
                case 1:
                    System.out.println("Введите 2 число");
                    c = sc.nextInt();
                    otv = i + c;
                    break;
                case 2:
                    System.out.println("Введите 2 число");
                    c = sc.nextInt();
                    otv = i - c;
                    break;
                case 3:
                    System.out.println("Введите 2 число");
                    c = sc.nextInt();
                    otv = i / c;
                    break;
                case 4:
                    System.out.println("Введите 2 число");
                    c = sc.nextInt();
                    otv = i * c;
                    break;
            }
            System.out.println(otv);
            System.out.println("Завершить программу?");
            System.out.println("Введите 1 для продолжения программы, 2 - для завершения");
            da = sc.nextInt();
            if (da == 1) {
                System.out.println("Запомнить результат?");
                System.out.println("Ввведите 1 для запоминания, 2 - для удаления результата");
                yes = sc.nextInt();
            }


        }

    }
}
