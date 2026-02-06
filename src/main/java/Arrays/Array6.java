package Arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        int[] summArray = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.print("Введите элемент " + (i + 1) + ": ");
            summArray[i] = input.nextInt();
        }

        System.out.print("Массив: ");
        for (int i = 0; i < summArray.length; i++) {
            if (i < summArray.length - 1) {
                System.out.print(summArray[i] + ", ");
            } else {
                System.out.println(summArray[i]);
            }
        }

        int sum = 0;
        for (int j : summArray) {
            sum += j;
        }

        int avg = sum / summArray.length;

        System.out.println("Среднее арифметическое: " + avg);

    }
}
