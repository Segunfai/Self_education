package ClassesObjectsMethods.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int hour;
        do {
            System.out.print("Введите текущие часы: ");
            hour = input.nextInt();
            if (hour < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (hour < 0);

        int min;
        do {
            System.out.print("Введите текушие минуты: ");
            min = input.nextInt();
            if (min < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (min < 0);

        int sec;
        do {
            System.out.print("Введите текущие секунды: ");
            sec = input.nextInt();
            if (sec < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (sec < 0);

        int hours;
        do {
            System.out.print("Введите добавленные часы: ");
            hours = input.nextInt();
            if (hours < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (hours < 0);

        int minutes;
        do {
            System.out.print("Введите добавленные минуты: ");
            minutes = input.nextInt();
            if (minutes < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (minutes < 0);

        int seconds;
        do {
            System.out.print("Введите добавленные секунды: ");
            seconds = input.nextInt();
            if (seconds < 0) {
                System.out.println("Вы ввели отрицательное число!");
            }
        } while (seconds < 0);

        Timer time = new Timer(hour, min, sec);

        time.addHours(hours);
        time.addMinutes(minutes);
        time.addSeconds(seconds);
        time.displayTime();

    }
}
