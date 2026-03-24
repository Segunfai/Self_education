/*
### **Задание 9: Класс "Товар"**

Создайте класс`Product`с полями:

- `name`(название)

- `price`(цена)

- `quantity`(количество на складе)


Методы:

- `sell(int amount)`- продажа товара (уменьшает количество, проверяет наличие)

- `restock(int amount)`- пополнение склада

- `getTotalValue()`- возвращает общую стоимость товара на складе (цена × количество)


В main создайте массив из 3 товаров, продайте часть, выведите общую стоимость всех товаров.
 */

package ClassesObjectsMethods.task9;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    void sell (int amount) {
        if (quantity >= amount && quantity > 0) {
            quantity -= amount;
            System.out.println("Куплен товар " + name + " в количестве " + amount + " шт.");
        } else {
            System.out.println("Товара нет в наличии");
        }
    }

    void restock (int amount) {
        quantity += amount;
        System.out.println("Запас товара" + name + " пополнен на " + amount + " шт.");
    }

    void getTotalValue() {
        if (quantity > 0) {
            double total = price * quantity;
            System.out.println("На складе осталось " + quantity + " шт. товара \"" + name + "\", общая стоимость: " + total + "руб.");
        } else {
            System.out.println("Товара " + name + " не осталось на складе");
        }
    }
}
