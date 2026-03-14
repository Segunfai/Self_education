package ClassesObjectsMethods.task6;

import java.util.Arrays;

class Program{
    public static void main(String[] args) {
        Printer print = new Printer();
    }
}

public class Printer {

    void print(String text) {
        System.out.println(text);
    }

    void print (String text, int times) {
        for (int i = 0; i == times; i++) {
            System.out.println(text);
        }
    }

    void print (int number) {
        System.out.println(number);
    }

    void print (int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
