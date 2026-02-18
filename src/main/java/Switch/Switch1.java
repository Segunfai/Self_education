/*
### **Задание 1: Оценки студентов**

_Создайте массив оценок студентов. Используя switch, преобразуйте числовые оценки в буквенные:_

- 5 → "Отлично" (A)

- 4 → "Хорошо" (B)

- 3 → "Удовлетворительно" (C)

- 2 → "Неудовлетворительно" (D)

- 1 → "Плохо" (F)


**Пример:**

text

Массив оценок: 5 3 4 2 5
Результат: Отлично Удовлетворительно Хорошо Неудовлетворительно Отлично
 */

package Switch;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        int[] scores = new int[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите элемент " + (i+1) + ": ");
            scores [i] = input.nextInt();

            if(scores [i] > 5 || scores[i] < 1) {
                System.out.println("Введите число от 1 до 5!");
            }
        }


        System.out.print("Массив оценок: ");
        for (int i = 0; i < scores.length; i++) {
            if (i < scores.length - 1) {
                System.out.print(scores[i] + " ");
            } else {
                System.out.println(scores[i]);
            }
        }

    }
}
