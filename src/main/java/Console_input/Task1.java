package Console_input;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String name = input.nextLine();

        System.out.println("Привет, " + name + "!");
        input.close();
    }
}
