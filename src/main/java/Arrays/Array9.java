/*
Задание 9: Подсчет четных и нечетных
Посчитайте количество четных и нечетных чисел в массиве.

Пример:

text
Массив: 1 2 3 4 5 6
Четных: 3
Нечетных: 3
 */

package Arrays;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int[] summArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            summArray[i] = input.nextInt();
        }

        System.out.print("Массив: ");
        for (int i = 0; i < summArray.length; i++) {
            if (i < summArray.length - 1) {
                System.out.print(summArray[i] + ", ");
            } else {
                System.out.println(summArray[i]);
            }
        }

        int countChet = 0;
        int countNechet = 0;

        for (int j : summArray) {
            if (j % 2 == 0) {
                countChet++;
            } else {
                countNechet++;
            }
        }

//        for (int i = 0; i < summArray.length; i++) {
//            if (summArray[i] % 2 == 0) {
//                countChet++;
//            } else {
//                countNechet++;
//            }
//        }

        System.out.println("Четных: " + countChet);
        System.out.println("Нечетных: " + countNechet);
    }
}
