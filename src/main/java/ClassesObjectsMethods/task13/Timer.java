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
    public void addSeconds(int sec) {
        seconds += sec;
        while (seconds >= 60) {
            seconds -= 60;
            minutes ++;
        }
    }

    public void addMinutes(int min) {
        minutes += min;
        while(minutes >= 60) {
            minutes -= 60;
            hours ++;
        }
    }

    public void addHours(int hour) {
        hours += hour;
        while (hours >= 24) {
            hours -= 24;
        }
    }

    public void displayTime() {
        String timestring = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timestring);
    }
}
