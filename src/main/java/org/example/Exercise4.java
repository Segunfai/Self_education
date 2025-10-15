package org.example;

public class Exercise4 {
    public static void main(String[] args) {
        int num = 100;
        double scnd = num;

        double bigNum = 123.456;
        int third = (int) bigNum;

        System.out.println(scnd);
        System.out.println(third);

        System.out.print("В первом случае мы приводим int к типу double, вследствие чего появляется значение после запятой. \n" +
                "Во втором случае мы делаем обратное приведение, поэтому числа после запятой убираются");
    }
}
