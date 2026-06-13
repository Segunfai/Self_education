/*
**Задание 12: Класс "Билет"**

Создайте класс `Ticket` с полями:

- `eventName` (название мероприятия)

- `seatNumber` (номер места)

- `price` (цена)

- `isSold` (продано или нет)


Методы:

- `sell()` - продает билет (меняет статус)

- `cancel()` - отменяет продажу

- `getInfo()` - возвращает строку с информацией


Добавьте **статическое поле** `totalSold`, которое считает количество проданных билетов.
 */

package ClassesObjectsMethods.task12;

public class Ticket {

    private String eventName;
    private int seatNumber;
    private double price;
    private boolean isSold;
    private static int totalSold;

    public Ticket(String eventName, int seatNumber, double price) {
        this.eventName = eventName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }
    public void sell() {
        if (!isSold) {
            isSold = true;
            System.out.println("Билет продан");
            totalSold++;
        } else {
            System.out.println("Билет недоступен");
        }
    }

    public void cancel() {
        if (isSold) {
            isSold = false;
            System.out.println("Билет возвращен");
            totalSold--;
        } else {
            System.out.println("Билет не куплен");
        }
    }

    void getInfo() {
        System.out.print("Мероприятие: " + eventName + "\n");
        System.out.print("Место № " + seatNumber + "\n");
        System.out.println("Цена за билет: " + price + "\n");
    }

    public static int getTotalSold() {return totalSold;}
}
