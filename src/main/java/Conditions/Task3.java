package Conditions;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите текущий час: ");
        int currentHour = input.nextInt();

        if(currentHour > 23 || currentHour < 0) {
            System.out.println("Вы ввели некоректное число!");
        } else if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour <= 11) {
            System.out.println("Доброе утро!");
        } else if (currentHour <= 17){
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
