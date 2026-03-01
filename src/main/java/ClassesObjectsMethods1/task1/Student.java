package ClassesObjectsMethods1.task1;

class Student {

    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void displayInfo(){
        System.out.print("Имя: " + name + "\n");
        System.out.print("Возраст: " + age + "\n");
        System.out.println("Средний балл: " + grade + "\n");
    }
}
