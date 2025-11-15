package Cycles;

/*
Задание: "Анализатор оценок студентов"
Цель: Написать программу для анализа успеваемости группы студентов.

Требования:
Консольный ввод:

Программа запрашивает количество студентов в группе

Для каждого студента вводится его имя и оценка (от 1 до 10)

Массивы:

Хранить имена студентов в одном массиве

Хранить оценки в другом массиве

Условные конструкции:

Проверять корректность введенных оценок

Определять категорию успеваемости для каждого студента

Циклы:

for для ввода данных

while или do-while для обработки некорректного ввода

for или for-each для вывода результатов

Функциональность:
java
// Пример работы программы:
Введите количество студентов: 3

Студент 1:
Введите имя: Анна
Введите оценку (1-10): 8

Студент 2:
Введите имя: Иван
Введите оценку (1-10): 12
Ошибка! Оценка должна быть от 1 до 10. Попробуйте снова: 5

Студент 3:
Введите имя: Мария
Введите оценку (1-10): 9

=== РЕЗУЛЬТАТЫ ===
Анна: 8 (Хорошо)
Иван: 5 (Удовлетворительно)
Мария: 9 (Отлично)

Средний балл группы: 7.33
Лучший студент: Мария (9)
Критерии оценок:
9-10: "Отлично"

7-8: "Хорошо"

5-6: "Удовлетворительно"

1-4: "Неудовлетворительно"
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Вводим количество студентов в группе и их ФИО
        int studNum;

        //Выполняй цикл до тех пор, пока не введут положительное число
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
        //Очистка буфера

        input.nextLine();

        //Инициализация массива ФИО
        String[] fio = new String[studNum];

        int i = 0;

        //Пока массив фио не заполнен вводи ФИО
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

        //Расчет высшего балла
        int max = rating[0];
        int bestStudIndex = 0; // Индекс студента с высшим баллом

        for (i = 1; i < rating.length; i++) {
            if (rating[i] > max) {
                max = rating[i];
                bestStudIndex = i;
            }
        }

        //Вводим расчет среднего арифметического для расчета среднего балла группы
        double sum = 0;
        for (int k : rating) {
            sum += k;
        }
        String avg = String.format("%.2f",(sum / rating.length));

        System.out.println("=== РЕЗУЛЬТАТЫ ===");
        for (i = 0; i < studNum; i++) {
            try {
                //Задаем критерии оценок
                String grade = getGrade(rating, i);
                System.out.println(fio[i] + ": " + rating[i] + " (" + grade + ")");
            } catch (IndexOutOfBoundsException er) {
                System.out.println(fio[i] + " Оценка не указана");
            }
        }
        System.out.println("\nСредний балл группы: " + avg + " балла");
        System.out.println("Лучший студент: " + fio[bestStudIndex] + " (" + rating[bestStudIndex] + ")");
    }

    //Отдельный метод для задания критериев оценки
    private static String getGrade(int[] rating, int i) {
        String a = "Отлично";
        String b = "Хорошо";
        String c = "Удовлетворительно";
        String d = "Неудовлетворительно";
        String grade;

        if (rating[i] >= 1 && rating[i] <= 4) {
            grade = d;
        } else if (rating[i] >= 5 && rating[i] <= 6 ) {
            grade = c;
        } else if (rating[i] >= 7 && rating[i] <= 8) {
            grade = b;
        } else {
            grade = a;
        }
        return grade;
    }
}
