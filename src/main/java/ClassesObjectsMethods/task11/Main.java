package ClassesObjectsMethods.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите значение ширины прямоугольника: ");
        int width = input.nextInt();
        System.out.print("Введите значение высоты прямоугольника: ");
        int height = input.nextInt();

        Rectangle prm = new Rectangle(width, height);

        System.out.println("Площадь прямоугольника составляет: " + prm.calculateArea());

        System.out.println("Периметр прямоугольника составляет: " + prm.calculatePerimeter());

        prm.isSquare();

        System.out.print("Введите значение ширины прямоугольника 1: ");
        int width1 = input.nextInt();
        System.out.print("Введите значение высоты прямоугольника 1: ");
        int height1 = input.nextInt();

        Rectangle r1 = new Rectangle(width1, height1);

        System.out.print("Введите значение ширины прямоугольника 2: ");
        int width2 = input.nextInt();
        System.out.print("Введите значение высоты прямоугольника 2: ");
        int height2 = input.nextInt();

        Rectangle r2 = new Rectangle(width2, height2);

        Rectangle.compareArea(r1, r2);
    }
}
