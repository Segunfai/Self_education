/*
### **Задание 5: Массив объектов**

Создайте массив из 3 объектов `Student`. Заполните данными (можно с клавиатуры). Выведите информацию о всех студентах, у которых средний балл выше 4.0.

 */

package ClassesObjectsMethods.task5;

import java.util.Scanner;

public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.print("Задан некорректный возраст!");
        }
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    void displayInfo(){
        System.out.print("Имя: " + name + "\n");
        System.out.print("Возраст: " + age + "\n");
        System.out.println("Средний балл: " + grade + "\n");
    }


}
