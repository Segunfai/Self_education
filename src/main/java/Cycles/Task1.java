package Cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Вводим количество студентов в группе и их ФИО
        int studNum = 0;

        do {
            try {
                System.out.print("Введите количество студентов в группе: ");
                studNum = input.nextInt();

                if (studNum <= 0) {
                    System.out.println("Ошибка! Введено не положительное число!");
                    continue;
                }
                break;

            } catch (InputMismatchException err) {
                System.out.println("Вы ввели не число!");
                input.next();
            }
        } while (true);

        input.nextLine();

        String[] fio = new String[studNum];

        int i = 0;


        while (i < studNum) {
            System.out.print("Введите Фамилию и имя студента: ");
            fio[i] = input.nextLine();
            i++;
        }

        //Выводим ФИО студентов
        System.out.println("Студентов в группе: " + studNum);
        System.out.println("Список студентов: ");
        for (String student : fio) {
            System.out.println(student);
        }

        //Создаем массив с оценками

        int[] rating = new int[studNum];

        //Вводим оценки каждого студента
        for(i = 0; i < studNum; i++) {
            while (true) {
                try {
                    System.out.println("Введите оценку для студента " + fio[i] + ":");
                    rating[i] = input.nextInt();

                    if (rating[i] >= 1 && rating[i] <= 10) {
                        break;
                    } else {
                        System.out.println("Оценка должна быть от 1 до 10!");
                    }
                } catch (InputMismatchException error) {
                    System.out.println("Ошибка! Необходимо ввести число от 1 до 10!");
                    input.next();
                }
            }
        }

        System.out.println("Список оценок студентов: ");
        for (i = 0; i < studNum; i++) {
            try {
                System.out.println(fio[i] + ": " + rating[i]);
            } catch (IndexOutOfBoundsException er) {
                System.out.println(fio[i] + " Оценка не указана");
            }
//            if (i < rating.length) {
//
//            } else {
//                System.out.println(fio[i] + " Оценка не указана");
//            }
        }


//        for (j = 0; j < studNum; j++) {
//            System.out.println("Введите оценку для студента " + );
//        }
    }
}
