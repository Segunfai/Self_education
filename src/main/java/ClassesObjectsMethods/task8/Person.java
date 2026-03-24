package ClassesObjectsMethods.task8;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private Address address;

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
        System.out.print("Введите название города: ");
        String city = input.nextLine();
        System.out.print("Введите название улицы: ");
        String street = input.nextLine();
        System.out.print("Введите номер дома: ");
        int houseNumber = input.nextInt();
        address = (city + ", " + street + ", д." + houseNumber).toString();
        Person first = new Person(name, age, address);

        first.displayInfo();
    }
}
