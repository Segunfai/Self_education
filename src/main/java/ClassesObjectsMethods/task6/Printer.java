package ClassesObjectsMethods.task6;

import java.util.Arrays;

class Program{
    public static void main(String[] args) {
        Printer prnt = new Printer();
        System.out.println(prnt.print("ok"));
        System.out.println(prnt.print("Good", 3));
        System.out.println(prnt.print(5));
        System.out.println(Arrays.toString(prnt.print(new int[]{1, 2, 3, 5})));
    }
}

public class Printer {

    String print(String text) {
        return text;
    }

    String print (String text, int times) {
        for (int i = 1; i < times; i++) {
            System.out.println(text);
        }
        return text;
    }

    int print (int number) {
        return number;
    }

    int[] print (int[] array) {
        return array;
    }

}
