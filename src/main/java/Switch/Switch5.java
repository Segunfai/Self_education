/*
**Задание 5: Меню программы**

_Создайте бесконечное меню с помощью цикла do-while и switch:_

1. Ввести новый массив

2. Найти сумму элементов

3. Найти среднее арифметическое

4. Найти максимальный элемент

5. Выход


**Пример работы:**

text

=== МЕНЮ ===
1. Ввести новый массив
2. Сумма элементов
3. Среднее арифметическое
4. Максимальный элемент
5. Выход
Выберите пункт: 2
Сумма: 150
 */

package Switch;

import java.util.Random;
import java.util.Scanner;

public class Switch5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        int arrSize = 5;
        int[] nums = new int[arrSize];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(100);
        }

        int choose = 0;

            do {
                System.out.println("===МЕНЮ===");
                System.out.println("1. Ввести новый массив");
                System.out.println("2. Сумма элементов");
                System.out.println("3. Среднее арифметическое");
                System.out.println("4. Максимальный элемент");
                System.out.println("5. Выход");

                System.out.print("Выберите пункт: ");

                if (input.hasNextInt()) {

                    choose = input.nextInt();

                    switch (choose) {

                        case 1: {
                            System.out.print("Введите размер массива: ");
                            arrSize = input.nextInt();
                            nums = new int[arrSize];

                            for (int i = 0; i < nums.length; i++) {
                                nums[i] = rand.nextInt(nums.length) + 1;
                            }

                            System.out.print("Массив: ");
                            for (int i = 0; i < nums.length; i++) {
                                if (i < nums.length - 1) {
                                    System.out.print(nums[i] + " ");
                                } else {
                                    System.out.println(nums[i]);
                                }
                            }
                            System.out.println("\n");
                        }
                        break;
                        case 2: {
                            int sum = 0;
                            for (int i : nums) {
                                sum += i;
                            }
                            System.out.print("Сумма: " + sum + "\n");
                        }
                        break;

                        case 3: {
                            int sum = 0;

                            for (int i : nums) {
                                sum += i;
                            }
                            int avg = sum / nums.length;

                            System.out.print("Среднее арифметическое: " + avg + "\n");
                        }
                        break;

                        case 4: {
                            int max = nums[0];
                            for (int i : nums) {
                                if (i > max) {
                                    max = i;
                                }
                            }
                            System.out.print("Максимальный элемент: " + max + "\n");
                        }
                        break;

                        case 5: {
                            System.out.println("Спасибо за использование меню!\nДо свидания!");
                        }

                        default: {
                            System.out.println("Введено число вне диапазона!\n");
                        }
                    }
                } else {
                    System.out.println("Введено не число!\n");
                    input.next();
                }
            } while (choose != 5);
        input.close();
    }
}
