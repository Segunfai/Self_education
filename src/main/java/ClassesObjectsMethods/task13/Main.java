package ClassesObjectsMethods.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите текущие часы: ");
        int hour = input.nextInt();
        System.out.print("Введите текушие минуты: ");
        int min = input.nextInt();
        System.out.print("Введите текущие секунды: ");
        int sec = input.nextInt();
        System.out.print("Введите добавленные часы: ");
        int hours = input.nextInt();
        System.out.print("Введите добавленные минуты: ");
        int minutes = input.nextInt();
        System.out.print("Введите добавленные секунды: ");
        int seconds = input.nextInt();

        Timer time = new Timer(hour, min, sec);

        time.addHours(hours);
        time.addMinutes(minutes);
        time.addSeconds(seconds);
        time.displayTime();

    }
}
