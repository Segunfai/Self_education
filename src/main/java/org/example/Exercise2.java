package org.example;

public class Exercise2 {
    public static void main(String[] args) {
        int counter = 10;
        System.out.println("Исходное значение: " + counter);

        counter = counter + 5;
        System.out.println("Увеличиваем на 5: " + counter);

        int remainder = counter % 2;

        counter = counter / 2;
        System.out.println("Делим новое значение пополам: " + counter);
        System.out.println("Остаток от деления: " + remainder);

    }
}
