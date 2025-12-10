package Cycles_only;

/*
Выведите первые N чисел последовательности Фибоначчи
 */

import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int s = a + b;
            a = b;
            b = s;
        }
        /*
        Альтернатива от нейронки
        {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Введите число больше 0!");
            return;
        }

        int a = 0;
        int b = 1;

        // Выводим первые два числа
        System.out.print(a + " ");
        if (num > 1) {
            System.out.print(b + " ");
        }

        // Выводим остальные (N-2) чисел
        for (int i = 2; i < num; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        input.close();
         */
    }
}
