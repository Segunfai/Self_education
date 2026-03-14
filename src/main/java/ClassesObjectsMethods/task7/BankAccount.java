/*
### **Задание 7: Класс "Банковский счет"**

Создайте класс `BankAccount` с полями:

- `accountNumber` (номер счета)

- `ownerName` (владелец)

- `balance` (баланс)


Методы:

- `deposit(amount)` - пополнить счет

- `withdraw(amount)` - снять деньги (проверка на достаточность средств)

- `transfer(amount, targetAccount)` - перевести деньги на другой счет

- `displayBalance()` - показать баланс
 */

package ClassesObjectsMethods.task7;

public class BankAccount {

    private int accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.print("Имя: " + ownerName + "\n");
        System.out.print("Номер счета: " + accountNumber + "\n");
        System.out.println("Баланс: " + balance + "\n");
    }
}
