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

    private double [][] data;

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
        double[][] result = new double[data.length][data[0].length];
        double[][] result1 = new double[data.length][data[0].length];
        double[][] result2 = new double[result.length][result1[0].length];
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            System.out.println("Матрицы разных размеров! Умножение невозможно.");
            return new Matrix(data); // или вернуть null
        } else {
            for (int i = 0; i < result2[0].length; i++) {
                for(int j = 0; j < result2.length; j++) {
                    for(int k = 0; k < result[0].length; k++) {
                        result[i][j] += result[i][k] * result1[k][j];
                        other = result[i][j];
                    }
                }
            }
        }
        return other;
    }

}
