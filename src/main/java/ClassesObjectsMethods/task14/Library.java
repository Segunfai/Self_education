/*
### **Задание 14: Класс "Библиотека"**

Создайте класс `Library` с:

- Массивом объектов `Book` (используйте класс из задания 4)

- Методами:

    - `addBook(Book book)` - добавить книгу

    - `findByAuthor(String author)` - найти книги автора

    - `findAvailableBooks()` - вывести доступные книги

    - `borrowBook(String title)` - взять книгу по названию


В main создайте библиотеку, добавьте книги, найдите книги автора и выдайте книгу читателю
 */

package ClassesObjectsMethods.task14;

import ClassesObjectsMethods.task4.Book;

import java.util.Objects;

public class Library {

    private Book[] books;
    private int count;
    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void adBook(Book book) {
        if(count < books.length) {
           books[count] = book;
           count++;
            System.out.println("В библиотеку добавлена книга " + book.getTitle());
        } else {
            System.out.println("В библиотеке больше нет места");
        }
    }

    public void findByAuthor(String author) {
        boolean found = false;
        for(Book book : books) {
            if (book != null && Objects.equals(book.getAuthor(), author)) {
                System.out.println("Найдена книга \"" + book.getTitle() + "\" автора \"" + book.getAuthor() + "\"");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг автора \"" + author + "\" не найдено");
        }

    }

    public void findAvailableBooks() {
        System.out.println("Список доступных книг: ");
        for(Book book : books) {
            if (book != null && book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void borrowBook(String title) {
        boolean found = false;
        for (Book book : books){
            if(book != null && book.getTitle().equals(title)) {
                found = true;
                if (book.isAvailable()) {
                    book.borrow();
                } else {
                    System.out.println("Книга \"" + title + "\" находится у читателя");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Книга \"" + title + "\" отсутствует в библиотеке");
        }
    }
}
