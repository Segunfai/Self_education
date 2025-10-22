package Console_input;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Выберите операцию (+, -, *, /): ");
        String operation = input.nextLine();

        System.out.print("Введите первое число: ");
        int numOne = input.nextInt();
        System.out.print("Введите второе число: ");
        int numTwo = input.nextInt();

        switch (operation) {
            case "+" -> System.out.println("Результат сложения: " + (numOne + numTwo));
            case "-" -> System.out.println("Результат вычитания: " + (numOne - numTwo));
            case "*" -> System.out.println("Результат умножения: " + (numOne * numTwo));
            default -> System.out.println("Результат деления: " + (numOne / numTwo));
        }
//      Изначальный вариант условий
//        if (operation.equals("+")) {
//            System.out.println("Результат сложения: " + (numOne + numTwo));
//        } else if (operation.equals("-")) {
//            System.out.println("Результат вычитания: " + (numOne - numTwo));
//        } else if (operation.equals("*")) {
//            System.out.println("Результат умножения: " + (numOne * numTwo));
//        } else {
//            System.out.println("Результат деления: " + (numOne / numTwo));
//        }
    }
}
