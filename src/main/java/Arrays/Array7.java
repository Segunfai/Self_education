/*
Задание 7: Поиск элемента
Проверьте, содержится ли число X в массиве.

Пример:

text
Массив: 1 2 3 4 5
Введите число для поиска: 3
Число 3 найдено в массиве!

Мини-задание: Модифицируй программу так, чтобы она выводила все индексы,
где встречается искомое число (если число встречается несколько раз)
 */

package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array7 {
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

        System.out.print("Введите число для поиска: ");
        int inputId = input.nextInt();

        boolean valExist = false;

//        for (int id : summArray) {
//            if (inputId == id) {
//                valExist = true;
//                break;
//            }
//        }
//
//        if (valExist) {
//            System.out.println("Число " + inputId + " найдено в массиве!");
//        } else System.out.println("Число " + inputId + " не найдено в массиве!");

        int foundIndex = -1; // -1 означает "не найдено"
        for (int i = 0; i < summArray.length; i++) {
            if (summArray[i] == inputId) {
                foundIndex = i;
//                break;
            }
        }

//        if (foundIndex != -1) {
//            System.out.println("Число " + inputId + " найдено на позиции " + foundIndex);
//        } else {
//            System.out.println("Число " + inputId + " не найдено в массиве!");
//        }

//        String inds = "";
//
//        for (int i =0; i < summArray.length; i++) {
//            if (summArray[i] == inputId) {
//                inds = inds + i + ", ";
//            }
//        }
//
//        if (inds.isEmpty()) {
//            System.out.println("Число " + inputId + " не найдено в массиве!");
//        } else {
//            inds = inds.substring(0, inds.length() - 2);
//            System.out.println("Число " + inputId + " найдено на позициях " + inds);
//        }
//
//        input.close();

//        StringBuilder inds = new StringBuilder();
//
//        for (int i =0; i < summArray.length; i++) {
//            if (summArray[i] == inputId) {
//                inds.append(i).append(", ");
//            }
//            inds.append(i);
//        }
//
//        if (inds.isEmpty()) {
//            System.out.println("Число " + inputId + " не найдено в массиве!");
//        } else System.out.println("Число " + inputId + " найдено на позициях " + inds);
//
//        input.close();

        StringBuilder inds = new StringBuilder();

        for (int i = 0; i < summArray.length; i++) {
            if (summArray[i] == inputId) {
                if (!inds.isEmpty()) {  // если уже что-то есть
                    inds.append(", ");       // добавляем запятую ПЕРЕД следующим индексом
                }
                inds.append(i);              // добавляем индекс
            }
        }

        if (inds.isEmpty()) {
            System.out.println("Число " + inputId + " не найдено в массиве!");
        } else System.out.println("Число " + inputId + " найдено на позициях " + inds);

        input.close();

    }
}
