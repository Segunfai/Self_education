package Cycles_only;

/*
Выведите таблицу умножения для числа K (K вводится с клавиатуры).
 */

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = input.nextInt();

        for (int i =1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
        input.close();
    }
}
