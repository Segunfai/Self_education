/*
Задание 2: Ввод массива с клавиатуры
Запросите у пользователя размер массива N, затем заполните массив числами с клавиатуры и выведите его.

Пример:

text
Введите размер массива: 3
Введите элемент 1: 10
Введите элемент 2: 20
Введите элемент 3: 30
Массив: 10 20 30
 */

package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arraySize = input.nextInt();

        int[] nums = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {

            System.out.print("Введите элемент " + (i+1) + ": ");
            nums [i] = input.nextInt();
        }

//        System.out.print("Массив: ");
//        for (int n : nums) {
//            System.out.print(n + " ");
//        }
        System.out.print("Массив: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.println(nums[i]);
            }
        }
        input.close();
    }
}
