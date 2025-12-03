package Cycles_only;

import java.util.Scanner;

public class Cycle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.print("Сумма: " + sum);
        input.close();
    }
}