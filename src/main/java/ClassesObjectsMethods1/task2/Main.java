package ClassesObjectsMethods1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите значения чисел a и b: ");
        int a = input.nextInt();
        int b = input.nextInt();

        Calculator.add(a, b);

        Calculator.subtract(a, b);

        Calculator.multiply(a, b);

        Calculator.divide(a, b);
    }
}
