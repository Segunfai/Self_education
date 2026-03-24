package ClassesObjectsMethods.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Введите название продукта: ");
            String name = input.nextLine();
            System.out.print("Введите цену продукта: ");
            double price = input.nextDouble();
            input.nextLine();
            System.out.print("Введите количество продукта на складе: ");
            int quantity = input.nextInt();
            input.nextLine();

            products[i] = new Product(name, price, quantity);
        }



        int amount;
        do {
            System.out.print("Введите количество товаров для покупки: ");
            amount = input.nextInt();
            if(amount <= 0) {
                System.out.println("Сумма пополнения должна быть положительной!");
            }
        } while (amount <= 0);

        products[0].sell(amount);

        products[0].getTotalValue();
    }
}
