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

        StringBuilder mal = new StringBuilder("Малые: ");
        StringBuilder mid = new StringBuilder("Средние: ");
        StringBuilder big = new StringBuilder("Большие: ");

        for (int choose : nums) {
            switch (choose) {
                case 1, 2, 3, 4, 5 -> mal.append(choose).append(" ");
                case 6, 7, 8, 9, 10 -> mid.append(choose).append(" ");
                case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> big.append(choose).append(" ");
                default -> System.out.print("Вне диапазона ");
            }
        }

        String res1 = mal.toString().trim();
        String res2 = mid.toString().trim();
        String res3 = big.toString().trim();
        System.out.print(res1 + "\n");
        System.out.print(res2 + "\n");
        System.out.print(res3 + "\n");

        System.out.println();
        input.close();
    }
}
