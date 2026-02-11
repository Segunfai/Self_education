/*
Задание 10: Копирование массива
Создайте копию массива и выведите оба массива.

Пример:

text
Исходный массив: 1 2 3 4 5
Копия массива: 1 2 3 4 5
 */

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {
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
                System.out.print(summArray[i] + " ");
            } else {
                System.out.println(summArray[i]);
            }
        }

        int [] arrayCopy = Arrays.copyOf(summArray, summArray.length);

        System.out.print("Копия массива: ");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }

//        System.out.print("Копия массива: ");
//        for (int j : summArray) {
//            System.out.print(j + " ");
//        }

        input.close();
    }
}
