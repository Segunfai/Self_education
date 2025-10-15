package org.example;

import java.util.Random;

public class VariablesDemo {


    public static void main(String[] args) {

        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isActive = true;
        String res = isActive ? "Да" : "Нет";
        String name = "Алиса";

        Random random = new Random();
        int i = random.nextInt(10) + 1;


        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Класс: " + i + grade);
        System.out.println("Алиса - Девочка? Ответ: " + res);
        System.out.println("Стоимость батончика по акции: " + price);


    }
}
