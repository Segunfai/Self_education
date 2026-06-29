package ClassesObjectsMethods.task15;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        Matrix m1 = new Matrix(new double[][]{{1, 2, 3}, {2,3,4}, {3, 5, 7}});
        Matrix m2 = new Matrix(new double[][]{{randomNumber, randomNumber, randomNumber}, {randomNumber, randomNumber, randomNumber},
                {randomNumber, randomNumber, randomNumber}});
        Matrix m3 = new Matrix(new double[][]{{1, 0, 3, 1}, {2, 5, 8, 9}, {2, 2, 3, 4}});

        Matrix m4 = m1.add(m2);
        Matrix m5 = m1.multiply(m3);
        Matrix m6 = m1.multiply(m2);

        m4.print();
        System.out.println();
        m5.print();
        System.out.println();
        m6.print();
    }
}
