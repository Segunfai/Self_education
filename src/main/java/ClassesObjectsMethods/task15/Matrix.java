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
}
