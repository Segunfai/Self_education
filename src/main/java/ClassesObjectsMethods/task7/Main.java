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
        System.out.print("\n");

        BankAccount one = new BankAccount(acc, owner, money);

        one.displayBalance();
        double dep;
        do {
            System.out.print("Введите сумму для пополнения баланса: ");
            dep = input.nextDouble();
            if(dep <= 0) {
                System.out.println("Сумма пополнения должна быть положительной!");
            }
        } while (dep <= 0);

        one.deposit(dep);
        System.out.println("\n");

        one.displayBalance();

        double minus;
        boolean vyvod = false;
        do {
            do {
                System.out.print("Введите сумму для вывода: ");
                minus = input.nextDouble();
                if (minus <= 0) {
                    System.out.println("Сумма сняти должна быть положительной!");
                }
            } while (minus <= 0);

            vyvod = one.withdraw(minus);
            System.out.println("\n");
        } while (!vyvod);

        one.displayBalance();
    }
}
