/*
**Задание 2: Геттеры и сеттеры**

Добавьте в класс `Student`:

- Приватные поля

- Конструктор с параметрами

- Геттеры и сеттеры для всех полей

- В сеттере для возраста добавьте проверку (возраст > 0)
 */

package ClassesObjectsMethods.task1_2;

class Student {

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
