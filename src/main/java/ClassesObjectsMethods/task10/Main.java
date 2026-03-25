package ClassesObjectsMethods.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vvod;
        System.out.print("Введите начальное значение счетчика: ");
        vvod = input.nextInt();

        Counter first = new Counter(vvod);

        Counter second = new Counter(vvod);

        Counter third = new Counter(vvod);

        System.out.println("Демонстрация метода increment");
        first.increment();
        System.out.println("Демонстрация метода decrement");
        second.decrement();
        System.out.println("Демонстрация метода getValue");
        third.getValue();
        System.out.println("Сбрасываем значение счетчика до нуля");
        first.reset();
        second.reset();
        third.reset();

    }
}
