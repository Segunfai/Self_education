package Cycles_only;

/*
Статистика чисел
Пользователь вводит числа до тех пор, пока не введет 0. Посчитайте:Количество чисел

Сумму чисел

Среднее значение

Максимальное и минимальное число

 */

import java.util.Scanner;

public class Cycle9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        int s = 0;
        int avg = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        do {
            System.out.print("Введите число: ");
            num = input.nextInt();

            if (num !=0) {
                count++;
            }

            s += num;


            if (num != 0 && count == 1) {
                min = num;
                max = num;
            }

            if (num != 0) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

        } while (num != 0) ;

        if (count > 0) {
            avg = s / count;
        }

        System.out.println("Количество чисел: " + count);
        System.out.println("Сумма чисел: " + s);
        System.out.println("Среднее значение: " + avg);
        if (count == 0) {
            System.out.println("Минимального и максимального значений нет");
        }
        else {
            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }

        input.close();

    }
}
