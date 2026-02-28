/*
### **Задание 6: Сортировка по категориям**

_Создайте массив чисел от 1 до 20. Используя switch, распределите числа по трем категориям:_

- "Малые" (1-5)

- "Средние" (6-10)

- "Крупные" (11-20)


Выведите каждую категорию и список чисел в ней.

**Пример:**

text

Малые: 1 2 3 4 5
Средние: 6 7 8 9 10
Крупные: 11 12 13 14 15 16 17 18 19 20
 */

package Switch;

import java.util.Scanner;

public class Switch6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        String mal = "Малые: ";
        String mid = "Средние: ";
        String big = "Большие: ";

        for (int choose : nums) {
            switch (choose) {
                case 1, 2, 3, 4, 5 -> mal += choose + " ";
                case 6, 7, 8, 9, 10 -> mid += choose + " ";
                case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> big += choose + " ";
                default -> System.out.print("Вне диапазона ");
            }
        }

        System.out.print(mal + "\n");
        System.out.print(mid + "\n");
        System.out.print(big + "\n");

        System.out.println();
        input.close();
    }
}
