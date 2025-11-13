package Conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int numOne = input.nextInt();
        System.out.print("Введите второе число: ");
        int numTwo = input.nextInt();

        if (numOne - numTwo > 0) {
            System.out.println("Первое число больше второго");
        } else if (numOne - numTwo < 0) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
    }
}
