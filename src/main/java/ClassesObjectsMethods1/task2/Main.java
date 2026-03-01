package ClassesObjectsMethods1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите значения чисел a и b: ");

        Calculator one = new Calculator(input.nextInt(), input.nextInt());

        one.add();

        one.subtract();

        one.multiply();

        one.divide();

    }
}
