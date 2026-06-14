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
        sec += seconds;
        if(seconds == 60) {
            minutes = minutes + 1;
            seconds = seconds / 60;
        }
        if (seconds > 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes == 60) {
            hours = hours + 1;
            minutes = 0;
        }
        if (minutes > 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
        if (hours == 24) {
            hours = 0;
        }
        if (hours > 24) {
            hours = hours % 24;
        }
        return sec;
    }

    public int addMinutes(int min) {
        min += minutes;
        if (minutes == 60) {
            hours = hours + 1;
            minutes = 0;
        }
        if (minutes > 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
        if (hours == 24) {
            hours = 0;
        }
        if (hours > 24) {
            hours = hours % 24;
        }
        return min;
    }

    public int addHours(int hour) {
        hour += hours;
        if (hours == 24) {
            hours = 0;
        }
        if (hours > 24) {
            hours = hours % 24;
        }
        return hour;
    }

    public void displayTime() {
        String timestring = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(timestring);
    }
}
