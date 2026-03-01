/*
### **Задание 4: Класс "Книга"**

Создайте класс `Book` с полями:

- `title` (название)

- `author` (автор)

- `year` (год издания)

- `isAvailable` (доступна ли)


Добавьте методы:

- `borrow()` - взять книгу (меняет доступность на false)

- `returnBook()` - вернуть книгу (меняет доступность на true)

- `displayInfo()` - показать информацию о книге

 */

package ClassesObjectsMethods.task3;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook () {
        if (!isAvailable) {
            isAvailable = true;
        }
    }

    public void displayInfo () {
        System.out.print("Информация о книге: \n" + "Название: " + title + "\n");
        System.out.print("Автор: " + author + "\n" + "Год выпуска: " + year + "\n");
    }

}
