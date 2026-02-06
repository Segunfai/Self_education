/*
Задание 5: Поиск минимального элемента
Заполните массив числами и найдите минимальный элемент.

Пример:

text
Массив: 3 7 2 9 5
Минимальный элемент: 2

Мини-задание: поиск максимального и минимального элемента за один проход

 */

package Arrays;

import java.util.Scanner;

public class Array5 {
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

        int min = summArray[0];
        int max = summArray[0];

//        for(int i = 0; i < summArray.length; i++) {
//            if (summArray[i] < min) {
//                min = summArray[i];
//            }
//        }

        for (int j : summArray) {
            if (j < min) {
                min = j;
            }

            if (j > max) {
                max = j;
            }

        }

        System.out.println("Минимальный элемент: " + min);
        System.out.print("Максимальный элемент: " + max);

        input.close();
    }
}
