package ClassesObjectsMethods.task14;

import ClassesObjectsMethods.task4.Book;

public class Main {
    public static void main(String[] args) {
        Library coollection = new Library(5);

        Book masterIMargo = new Book("Мастер и Маргарита", "Булгаков", 1940);
        Book women = new Book("Женщины", "Буковски", 1978);
        Book skazki = new Book("Сказки", "Народ", 1987);
        Book lotr = new Book("Lord of The Rings", "Tolkien", 1954);
        Book kolobok = new Book("Колобок", "Народ", 1873);
        Book testing = new Book("Тестировщик", "Тест", 2026);
        Book focus = new Book("Фокусы", "Тестер", 2015);

        coollection.adBook(masterIMargo);
        coollection.adBook(women);
        coollection.adBook(skazki);
        coollection.adBook(lotr);
        coollection.adBook(kolobok);
        coollection.adBook(testing);

        coollection.findByAuthor("Народ");
        coollection.findByAuthor("Абра");

        coollection.borrowBook("Женщины");
        coollection.borrowBook("Фокусы");

        coollection.findAvailableBooks();

    }
}
