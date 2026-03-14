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

    public Book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Вы взяли книгу");
        } else System.out.println("Книга недоступна");
    }

    public void returnBook () {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Вы вернули книгу");
        } else System.out.println("Книга уже на полке");
    }

    public void displayInfo () {
        System.out.print("Информация о книге: \n" + "Название: " + title + "\n");
        System.out.print("Автор: " + author + "\n" + "Год выпуска: " + year + "\n");
        if (isAvailable) {
            System.out.println("Книга доступна");
        } else System.out.println("Книга недоступна");
    }

}
