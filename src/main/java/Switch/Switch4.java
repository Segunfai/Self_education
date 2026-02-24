/*
Задание 4: Анализатор чисел**

_Заполните массив случайными числами от 1 до 10. Для каждого числа используйте switch, чтобы определить его характеристику:_

- 1-3 → "Маленькое"

- 4-7 → "Среднее"

- 8-10 → "Большое"

- Остальное → "Вне диапазона"


**Пример:**

text

Массив: 2 5 9 12
Результат: Маленькое Среднее Большое Вне диапазона
 */

package Switch;

import java.util.Scanner;
import java.util.Random;

public class Switch4 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arrSize = input.nextInt();
        int[] nums = new int[arrSize];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(10) + 1;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length -1) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.println(nums[i]);
            }
        }


        System.out.print("Результат: ");
        for (int choose : nums) {
            switch (choose) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Маленькое ");
                case 4:
                case 5:
                case 6:
                case 7:
                    System.out.print("Среднее ");
                case 8:
                case 9:
                case 10:
                    System.out.print("Большое ");
                default:
                    System.out.print("Вне диапазона ");
            }
        }
        input.close();
    }
}
