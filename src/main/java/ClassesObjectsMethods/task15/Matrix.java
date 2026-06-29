/*
### **Задание 15: Класс "Матрица"**

Создайте класс `Matrix`, представляющий матрицу 3×3 с полями:

- `double[][] data`


Методы:

- `add(Matrix other)` - сложение матриц (возвращает новую матрицу)

- `multiply(Matrix other)` - умножение матриц

- `determinant()` - вычисление определителя

- `print()` - вывод матрицы


В main создайте две матрицы, выполните сложение и умножение.
 */

package ClassesObjectsMethods.task15;

import com.sun.source.tree.BreakTree;

public class Matrix {

    private double[][] data;

    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix add(Matrix other) {
        double[][] result = new double[data.length][data[0].length];
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            System.out.println("Матрицы разных размеров! Сложение невозможно.");
            return new Matrix(data); // или вернуть null
        } else {
            for (int i = 0; i < data.length; i++) {
                for (int k = 0; k < data[0].length; k++) {
                    result[i][k] = this.data[i][k] + other.data[i][k];
                }
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        double[][] result = new double[data.length][other.data[0].length];
        if (data[0].length != other.data.length) {
            System.out.println("Матрицы разных размеров! Умножение невозможно.");
            return new Matrix(data); // или вернуть null
        } else {
            for (int i = 0; i < data.length; i++) {
                for(int j = 0; j < other.data[0].length; j++) {
                    for(int k = 0; k < data[0].length; k++) {
                        result[i][j] += data[i][k] * other.data[k][j];
                    }
                }
            }
        }
        return new Matrix(result);
    }

    public double determinant(double[][] data) {
        int n = data.length;
        if(n == 1) {
            return data[0][0];
        }
        if (n == 2) {
            return data[0][0] * data[1][1] - data[0][1] * data[1][0];
        }
        double det = 0;
        for (int i = 0; i < n; i++) {
            double sign = (i % 2 == 0) ? 1.0 : -1.0;
            double[][] submatrix = new double[n-1][n-1];

            int subRow = 0;
            for (int r = 1; r < n; r++) {
                int subCol = 0;
                for (int c = 0; c < n; c++){
                    if(c == i) {
                        continue;
                    }
                    submatrix[subRow][subCol] = data[r][c];
                    subCol += 1;
                }
                subRow += 1;
            }

            double subDeterminant = determinant(submatrix);
            double term = sign * data[0][i] * subDeterminant;
            det = det + term;
        }
        return det;
    }

    public double determinant() {
        if (data.length != data[0].length) {
            System.out.println("Определитель можно вычислить только для квадратной матрицы!");
            return Double.NaN;  // Not a Number
        }
        return determinant(this.data);
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();  // переход на новую строку
        }
    }
}
