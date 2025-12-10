package Cycles_only;

/*
Вычислите факториал числа с проверкой на корректность ввода (не отрицательное)
 */

import java.util.Scanner;

public class Cycle8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int s = 1;

        do {
            System.out.print("Введите число: ");
            num = input.nextInt();

            if (num < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (num < 0);

            for (int i = 1; i <= num; i++) {
                s = s * i;
            }
        System.out.print("Факториал " + num + " = " + s);
    }
}

/*
Изначально было сделано без отработки отрицательных значений:
import java.util.Scanner;

public class Cycle8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = input.nextInt();

        int s = 1;

        for (int i = 1; i <= num; i++) {
            s = s*i;
        }
        System.out.print("Факториал " + num + " = " + s);
    }
}
 */
