package Console_input;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите текущий год: ");
        int thisYear = input.nextInt();

        System.out.print("Введите ваш возраст: ");
        int age = input.nextInt();

        int birthYear = thisYear - age;
        System.out.println("Вы родились в " + birthYear + " году");
    }
}
