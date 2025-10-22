package Console_input;

import java.util.Scanner;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Сделано для исключения ошибки Exception in thread "main" java.util.InputMismatchException
        input.useLocale(Locale.US);

        System.out.print("Введите первое число: ");
        int numOne = input.nextInt();
        System.out.print("Введите второе число: ");
        double numTwo = input.nextDouble();

        System.out.println("Сумма: " + (numOne + numTwo));
        System.out.println("Разность: " + (numOne - numTwo));
        System.out.println("Произведение: " + (numOne * numTwo));
        System.out.println("Частное: " + (numOne / numTwo));
    }
}
