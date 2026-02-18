/*
### **Задание 2: Калькулятор операций**

*Создайте массив чисел. Пользователь выбирает операцию (1 - сумма, 2 - среднее, 3 - максимум, 4 - минимум). Используя switch, выполните выбранную операцию над массивом.*

**Пример:**

text

Массив: 10 20 30 40 50
Выберите операцию (1-сумма, 2-среднее, 3-макс, 4-мин): 3
Результат: Максимум = 50
 */

package Switch;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arrSize = input.nextInt();
        int[] nums = new int[arrSize];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Введите элемент " + (i+1) + ": ");
            nums[i] = input.nextInt();
        }
        System.out.println();

        System.out.print("Массив: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.println(nums[i]);
            }
        }

        System.out.print("Выберите операцию (1-сумма, 2-среднее, 3-макс, 4-мин): ");
        int oper = input.nextInt();
        System.out.println();
        switch (oper) {
            case 1 -> {
                int sum = 0;
                for (int j : nums) {
                    sum += j;
                }
                System.out.print("Сумма чисел в массиве: " + sum);
            }
            case 2 -> {
                int sum = 0;
                for (int j  : nums) {
                    sum += j;
                }
                double avg = (double) sum / nums.length;
                System.out.print("Среднее: " + avg);
            }
            case 3 -> {
                int max = nums[0];
                for (int j : nums) {
                    if (j > max) max = j;
                }
                System.out.print("Максимум: " + max);
            }
            case 4 -> {
                int min = nums[0];
                for (int j : nums) {
                    if (j < min) min = j;
                }
                System.out.print("Минимум: " + min);
            }
            default -> System.out.println("Неверный выбор операции!");
        }
        input.close();
    }
}
