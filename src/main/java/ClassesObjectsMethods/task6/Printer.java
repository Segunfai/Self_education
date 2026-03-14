/*
Создайте класс `Printer` с перегруженными методами `print()`:

- `print(String text)` - выводит строку

- `print(String text, int times)` - выводит строку указанное количество раз

- `print(int number)` - выводит число

- `print(int[] array)` - выводит массив чисел
 */

package ClassesObjectsMethods.task6;

import java.util.Arrays;

class Program{
    public static void main(String[] args) {
        Printer prnt = new Printer();
        prnt.print("ok");
        prnt.print("Good" , 3);
        System.out.println(prnt.print(5));
        System.out.println(Arrays.toString(prnt.print(new int[]{1, 2, 3, 5})));
    }
}

public class Printer {

    void print(String text) {
        System.out.println(text);
    }

    void print (String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    int print (int number) {
        return number;
    }

    int[] print (int[] array) {
        return array;
    }

}
