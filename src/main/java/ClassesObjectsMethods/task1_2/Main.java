/*
Задание 1: Класс "Студент"

Создайте класс 'Student' с полями:

- `name` (имя)

- `age` (возраст)

- `grade` (средний балл)


Добавьте метод `displayInfo()`, который выводит информацию о студенте. В main создайте объект и вызовите метод.

**Пример:**

text

Имя: Анна
Возраст: 20
Средний балл: 4.8

 */

package ClassesObjectsMethods.task1_2;

public class Main {
    public static void main(String[] args) {

        Student ann = new Student("Анна", 28, 4.8);
        ann.displayInfo();

    }
}
