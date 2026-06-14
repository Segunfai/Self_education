/*
### **Задание 13: Класс "Таймер"**

Создайте класс `Timer` с:

- Полями: `hours`, `minutes`, `seconds`

- Методами: `addSeconds(int sec)`, `addMinutes(int min)`, `addHours(int hour)`

- Методом `displayTime()` в формате "HH:MM:SS"


**Усложнение:** При добавлении секунд, минут, часов корректно обновляются все поля (например, 65 секунд = 1 минута 5 секунд).
 */

package ClassesObjectsMethods.task13;

public class Timer {

    private int hours;
    private int minutes;
    private int seconds;

    public Timer(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public int addSeconds(int sec) {
        seconds = sec;
        return sec;
    }

    public int addMinutes(int min) {
        minutes = min;
        return min;
    }

    public int addHours(int hour) {
        hours = hour;
        return hour;
    }

    public void displayTime() {
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
