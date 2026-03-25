package ClassesObjectsMethods.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите начальное значение счетчика: ");
        int vvod = input.nextInt();

        Counter first = new Counter(vvod);

        Counter second = new Counter(vvod);

        Counter third = new Counter(vvod);

        System.out.print("Общее количество созданных объектов: " + Counter.getTotalCounters() + "\n");

        System.out.println("Демонстрация работы методов для первого счетчика");
        first.increment();
        first.increment();
        first.increment();
        first.increment();
        first.increment();
        first.increment();
        first.increment();
        first.decrement();
        first.decrement();
        first.decrement();
        first.getValue();
        System.out.println("\n");
        System.out.println("Демонстрация работы методов для второго счетчика");
        second.increment();
        second.increment();
        second.decrement();
        second.getValue();
        System.out.println("\n");
        System.out.println("Демонстрация работы методов для третьего счетчика");
        third.increment();
        third.increment();
        third.increment();
        third.increment();
        third.decrement();
        third.decrement();
        third.decrement();
        third.decrement();
        third.decrement();
        third.getValue();
        System.out.println("\n");
        System.out.println("Сбрасываем значения счетчиков до нуля");
        first.reset();
        first.getValue();
        System.out.println("\n");
        second.reset();
        second.getValue();
        System.out.println("\n");
        third.reset();
        third.getValue();

    }
}
