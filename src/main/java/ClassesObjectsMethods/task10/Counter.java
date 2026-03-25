/*
**Задание 10: Класс "Счетчик"**

Создайте класс `Counter` с:

- Приватным полем `count`

- Методами: `increment()`, `decrement()`, `getValue()`, `reset()`

- Конструктором, который позволяет задать начальное значение


Добавьте статическое поле `totalCounters`, которое считает количество созданных объектов.

В main создайте несколько счетчиков, покажите работу методов и выведите общее количество созданных объектов.
 */

package ClassesObjectsMethods.task10;

public class Counter {

    private int count;

    private static int totalCounters;

    public Counter(int count) {
        this.count = count;
        totalCounters++;
    }

    void increment() {
        count++;
    }

    void decrement() {
        count--;
    }

    void getValue() {
        System.out.print("Текущее значение счетчика: " + count);;
    }

    void reset() {
        count = 0;
        System.out.print("Значение счетчика обнулено\n");
    }

    public static int getTotalCounters() {
        return totalCounters;
    }
}
