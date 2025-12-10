package Cycles_only;

/*
Выведите числа от N до 1 в обратном порядке, пропуская четные числа.
 */

import java.util.Scanner;

public class Cycle4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
