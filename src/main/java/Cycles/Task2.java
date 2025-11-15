package Cycles;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numSum = new ArrayList<>();

        System.out.println("Введите числа для сложения (0 для завершения): ");
        int num;
        int sum = 0;

        while (true) {
            try {
                num = input.nextInt();

                if (num == 0) {
                    break;
                } else if (num < 0) {
                    System.out.println("Вы ввели отрицательное число!");
                    continue;
                }
                numSum.add(num);
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число!");
                input.next();
            }
        }

        for (int i : numSum) sum += i;

        System.out.println("Массив введенных чисел: " + numSum);
        System.out.println("Сумма введенных чисел: " + sum);
    }
}
