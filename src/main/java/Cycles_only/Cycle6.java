package Cycles_only;

/*
Выведите все простые числа в диапазоне от A до B.
 */

import java.util.Scanner;

public class Cycle6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите А: ");
        int a = input.nextInt();
        System.out.print("Введите B: ");
        int b = input.nextInt();

        System.out.print("Простые числа: ");
        for(int i = a; i <= b; i++) {
            //Подсчет делителей
            int k=0;
            for (int j = 2; j <= i; j++) {
                if ((i%j) == 0)
                    k++;
            }

            if (k<2)
                System.out.print(i + " ");
        }
        input.close();
        /*
        Альтернативная версия от нейронки
        if(i <= 1) {
            continue;
        }

        boolean isPrime = true;

        //Проверка делителей до квадратного корня
        for(int j =2; j*j <= i; j++) {
            if(i % j == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.print(i + " ");
        }
        input.close();
         */
    }
}
