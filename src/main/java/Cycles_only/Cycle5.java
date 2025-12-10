package Cycles_only;

/*
Найдите все делители числа M и выведите их.
 */

import java.util.Scanner;

public class Cycle5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = input.nextInt();

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
            System.out.print(i + " ");
            }
        }
        if (num == 0) {
            System.out.println("У числа 0 бесконечно много делителей!");
            return;
        }
        for(int i = Math.abs(num); i >= -Math.abs(num); i--) {
            if(i != 0 && num % i == 0) {
                System.out.print(i + " ");
            }
        }
        input.close();

    }
}
