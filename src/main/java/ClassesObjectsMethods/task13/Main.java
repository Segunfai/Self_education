package ClassesObjectsMethods.task13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите часы: ");
        int hours = input.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = input.nextInt();
        System.out.print("Введите секунды: ");
        int seconds = input.nextInt();

        Timer time = new Timer(hours, minutes, seconds);

        time.addHours(hours);
        time.addMinutes(minutes);
        time.addSeconds(seconds);
        time.displayTime();

    }
}
