package ClassesObjectsMethods.task6;

class Program{
    public static void main(String[] args) {
        Printer print = new Printer();
    }
}

public class Printer {

    String print(String text) {
        System.out.println(text);

        return text;
    }

    String print (String text, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println(text);
        }
        return text;
    }

    int print (int number) {
        System.out.println(number);
        return number;
    }

    int[] print (int[] array) {
        System.out.println(array);
        return array;
    }

}
