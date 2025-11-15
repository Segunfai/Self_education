package Cycles;

/*
2. Сумма положительных чисел
Условие:
Пользователь вводит числа по одному с клавиатуры.
Программа суммирует только положительные числа.
Ввод прекращается, когда пользователь вводит 0.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Создание пустого массива из чисел
        ArrayList<Integer> numSum = new ArrayList<>();

        System.out.println("Введите числа для сложения (0 для завершения): ");
        int num;
        int sum = 0;

        //Пока num != 0 выполняй цикл
        while (true) {
            try {
                num = input.nextInt();

                if (num == 0) {
                    break;
                }

                //Добавление введенного значения в массив
                numSum.add(num);

            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число!");
                input.next();
            }
        }

        //Суммирование только положительных чисел
        for (int i : numSum) {
            if (i > 0) {
                sum += i;
            }
        }

        System.out.println("Массив введенных чисел: " + numSum);
        System.out.println("Сумма положительных чисел: " + sum);
    }
}
