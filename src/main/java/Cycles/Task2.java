package Cycles;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numSum = new ArrayList<>();

        System.out.println("Введите числа для сложения (0 для завершения): ");
        int i = 0;
        int num = input.nextInt();

        try {
            while (num != 0) {
                num = input.nextInt();
                numSum.add(num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число!");
            input.next();
        }

        System.out.println(numSum);
    }
}
