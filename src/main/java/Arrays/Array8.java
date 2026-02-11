/*
Задание 8: Обратный вывод
Выведите элементы массива в обратном порядке.

Пример:

text
Массив: 1 2 3 4 5
В обратном порядке: 5 4 3 2 1
 */

package Arrays;

import java.util.Scanner;

public class Array8 {
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
        System.out.print("В обратном порядке: ");
        for (int i = summArray.length - 1; i >= 0; i--) {
            System.out.print(summArray[i] + " ");
        }

//        Альтернатива от нейронки
//        int i = summArray.length - 1;
//        while (i >= 0) {
//            System.out.print(summArray[i] + " ");
//            i--;
//        }

        input.close();
    }
}
