package ClassesObjectsMethods.task8;

import java.util.Scanner;

public class Person {

    private static String name;
    private static int age;
    private static Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayInfo() {
        System.out.print("Имя: " + name + "\n");
        System.out.print("Возраст: " + age + "\n");
        System.out.print("Адрес: " + address);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = input.nextLine();
        System.out.print("Введите возраст: ");
        age = input.nextInt();
        System.out.print("Введите адрес в формате \"Название города, название улицы, номер дома\": ");
        address =(input.nextLine(), input.nextLine(), input.nextInt()).toString();

        Person first = new Person(name, age, address);

        first.displayInfo();
    }
}
