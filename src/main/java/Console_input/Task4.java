package Console_input;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваши имя и фамилию: ");
        String fio = input.nextLine();
        String[] parts = fio.split(" ");

        System.out.println(parts[1] + " " + parts[0]);
    }
}
