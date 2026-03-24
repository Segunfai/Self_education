package ClassesObjectsMethods.task9;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        Product[] products = new Product[3];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Введите название продукта: ");
            String name = input.nextLine();
            System.out.print("Введите цену продукта: ");
            double price = input.nextDouble();
            System.out.print("Введите количество продукта на складе: ");
            int quantity = input.nextInt();
            input.nextLine();

            products[i] = new Product(name, price, quantity);
        }



        int amount;

        for (Product product : products) {
            do {
                System.out.print("Введите количество товара \"" + product.getName() + "\" для покупки: ");
                amount = input.nextInt();
                input.nextLine();
                if (amount <= 0) {
                    System.out.println("Количество товаров должно быть положительным!");
                } else if (amount > product.getQuantity()) {
                    System.out.println("Нельзя купить более " + product.getQuantity() + " шт.");
                }
            } while (amount <= 0 || amount > product.getQuantity());

            product.sell(amount);

            product.getTotalValue();
        }
    }
}
