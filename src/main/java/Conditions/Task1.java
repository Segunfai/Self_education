package Conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите число: ");
        int frst = num.nextInt();

        if(frst % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
