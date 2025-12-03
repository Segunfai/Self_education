package Cycles_only;

import java.util.Scanner;

public class Cycle7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i <= num; ++i) {
            int s = a + b;
            a = b;
            b = s;
            System.out.print(s + " ");
        }
    }
}
