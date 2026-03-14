package ClassesObjectsMethods.task4;


public class Main {
    public static void main(String[] args) {

        Student[] studArray = new Student[3];

        studArray[0] = new Student("Greg", 23, 4.3);
        studArray[1] = new Student("Ann", 19, 4.8);
        studArray[2] = new Student("Peter", 20, 3.9);

        System.out.println("Все студенты: ");
        for (Student s : studArray) {
            s.displayInfo();
        }

        System.out.println("Студенты с оценкой выше 4.0 балла: ");
        for (Student s : studArray) {
            if (s.getGrade() > 4.0) {
                s.displayInfo();
            }
        }
    }
}
