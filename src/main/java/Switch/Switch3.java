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

        for (int i = 0; i < nums.length; i++) {
            Random b = new Random();

            nums[i] = b.nextInt(6) + 1;
        }

        System.out.print("Числа: ");
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + " ");
            } else {
                System.out.println(nums[i]);
            }
        }

    }
}
