/*
### **Задание 3: Класс "Калькулятор"**

Создайте класс `Calculator` со статическими методами:

- `add(a, b)` - сложение

- `subtract(a, b)` - вычитание

- `multiply(a, b)` - умножение

- `divide(a, b)` - деление (с проверкой на 0)


В main продемонстрируйте работу всех методов.
 */

package ClassesObjectsMethods1.task2;

public class Calculator {

   private static int a;
   private static int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    static void add() {
        int sum = a + b;
        System.out.print("Сумма: " + sum + "\n");
    }

     static void subtract () {
        int sbtrct = a - b;
        System.out.print("Разность: " + sbtrct + "\n");
    }

    static void multiply () {
        int mlt = a * b;
        System.out.print("Произведение: " + mlt + "\n");
    }

    static void divide () {
        int dvde = a / b;
        System.out.print("Частное: " + dvde + "\n");
    }

}
