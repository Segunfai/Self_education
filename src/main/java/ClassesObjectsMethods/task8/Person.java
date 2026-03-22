package ClassesObjectsMethods.task8;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayInfo() {
        System.out.print("Имя: " + name + "\n");
        System.out.print("Возраст: " + age + "\n");
        System.out.print("Адрес: " + address);
    }

    public void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = input.nextLine();
        System.out.print("Введите возраст");
        age = input.nextInt();
        System.out.print("Введите адрес в формате \"Название города, название улицы, номер дома\": ");
        address = new Address(input.nextLine(), input.nextLine(), input.nextInt()).toString();

        Person first = new Person(name, age, address);

        first.displayInfo();
    }
}
