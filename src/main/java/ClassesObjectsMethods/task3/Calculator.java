/*
### **Задание 3: Класс "Калькулятор"**

Создайте класс `Calculator` со статическими методами:

- `add(a, b)` - сложение

- `subtract(a, b)` - вычитание

- `multiply(a, b)` - умножение

- `divide(a, b)` - деление (с проверкой на 0)


В main продемонстрируйте работу всех методов.
 */

package ClassesObjectsMethods.task3;

public class Calculator {

    public static void add(int a, int b) {
        int sum = a + b;
        System.out.print("Сумма: " + sum + "\n");
    }

    public static void subtract (int a, int b) {
        int sbtrct = a - b;
        System.out.print("Разность: " + sbtrct + "\n");
    }

    public static void multiply (int a, int b) {
        int mlt = a * b;
        System.out.print("Произведение: " + mlt + "\n");
    }

    public static void divide (int a, int b) {
        if (b != 0) {
            int dvde = a / b;
            System.out.print("Частное: " + dvde + "\n");
        } else System.out.print("Деление на ноль!");
    }
}
