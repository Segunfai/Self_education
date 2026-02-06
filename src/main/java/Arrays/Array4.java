/*
Задание 4: Поиск максимального элемента
Заполните массив числами и найдите максимальный элемент.

Пример:

text
Массив: 3 7 2 9 5
Максимальный элемент: 9
 */

package Arrays;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int[] summArray = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Введите элемент " + (i+1) + ": ");
            summArray [i] = input.nextInt();
        }

        System.out.print("Массив: ");
        for (int i = 0; i < summArray.length; i++) {
            if (i < summArray.length - 1) {
                System.out.print(summArray[i] + ", ");
            } else {
                System.out.println(summArray[i]);
            }
        }

        int max = summArray[0];

//        for(int i = 0; i < summArray.length; i++) {
//            if (summArray[i] > max) {
//                max = summArray[i];
//            }
//        }

        for (int j : summArray) {
            if (j > max) {
                max = j;
            }
        }
        System.out.print("Максимальный элемент: " + max);

        input.close();
    }
}
