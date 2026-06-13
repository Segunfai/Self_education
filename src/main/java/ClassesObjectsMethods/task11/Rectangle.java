/*
**Задание 11: Класс "Прямоугольник"**

Создайте класс `Rectangle` с полями:

- `width` (ширина)

- `height` (высота)


Методы:

- `calculateArea()` - площадь

- `calculatePerimeter()` - периметр

- `isSquare()` - возвращает true, если ширина равна высоте


Добавьте **статический метод** `compareArea(Rectangle r1, Rectangle r2)`, который возвращает больший по площади прямоугольник.
 */

package ClassesObjectsMethods.task11;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){

        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return (width + height) * 2;
    }

    public boolean isSquare() {
        boolean square = false;
        if (width == height) {
            square = true;
            System.out.println("Прямоугольник является квадратом");
        } else {
            System.out.println("Прямоугольник - не квадрат");
        }
        return square;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public static void compareArea(Rectangle r1, Rectangle r2) {
        if (r1.calculateArea() > r2.calculateArea()) {
            System.out.println("Первый прямоугольник со сторонами " + r1.getWidth() + " и " + r1.getHeight() + " больше");
        } else if (r1.calculateArea() < r2.calculateArea()) {
            System.out.println("Второй прямоугольник со сторонами " + r2.getWidth() + " и " + r2.getHeight() + " больше");
        } else System.out.println("Прямоугольники равны");
    }
}
