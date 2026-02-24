/*
### **Задание 3: Дни недели**

*Создайте массив с числами от 1 до 7. Для каждого числа используйте switch, чтобы вывести соответствующий день недели (1 - Понедельник, 2 - Вторник и т.д.).*

**Пример:**

text

Числа: 1 3 5 7
Дни: Понедельник Среда Пятница Воскресенье
 */

package Switch;

import java.util.Scanner;
import java.util.Random;

public class Switch3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int arrSize = input.nextInt();
        int[] nums = new int[arrSize];

        Random b = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = b.nextInt(7) + 1;
        }

        System.out.print("Числа: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.println(nums[i]);
            }
        }

        System.out.print("Дни: ");
        for (int days : nums) {
            switch (days) {
                case 1 -> System.out.print("Понедельник ");
                case 2 -> System.out.print("Вторник ");
                case 3 -> System.out.print("Среда ");
                case 4 -> System.out.print("Четверг ");
                case 5 -> System.out.print("Пятница ");
                case 6 -> System.out.print("Суббота ");
                case 7 -> System.out.print("Воскресенье ");
            }
        }
        input.close();
    }
}
