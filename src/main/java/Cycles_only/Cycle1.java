package Cycles_only;

import java.util.Scanner;

public class Cycle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите N: ");
        int num = input.nextInt();

        int i = 1;

        for (; i <= num; i++) {
            if (i < num) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
        input.close();
    }
}
