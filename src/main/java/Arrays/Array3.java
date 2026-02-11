/*
Задание 3: Сумма элементов массива
Создайте массив из 5 чисел и вычислите сумму всех его элементов.

Пример:

text
Массив: 1 2 3 4 5
Сумма: 15
 */

package Arrays;

import java.util.Scanner;

public class Array3 {
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


        int sum = 0;
        for (int j : summArray) {
            sum += j;
        }
        System.out.print("Сумма: " + sum);
    }
}
