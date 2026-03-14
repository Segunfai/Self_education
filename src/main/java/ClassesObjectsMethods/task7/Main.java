package ClassesObjectsMethods.task7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Введите номер счета: ");
        int acc = input.nextInt();
        input.nextLine();
        System.out.print("Введите имя владельца счета: ");
        String owner = input.nextLine();
        System.out.print("Введите баланс по счету: ");
        double money = input.nextDouble();

        BankAccount one = new BankAccount(acc, owner, money);

        one.displayBalance();

    }
}
