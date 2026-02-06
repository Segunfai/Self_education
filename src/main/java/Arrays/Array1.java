
/*
Создайте массив из 5 чисел (1, 2, 3, 4, 5) и выведите все его элементы.

Пример вывода:

text
Массив: 1 2 3 4 5
 */
package Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] nums = new int [5];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

//        System.out.print("Массив: " + Arrays.toString(nums).replace("[", "").replace("]", "") + " ");

        //Более правильное решение

        System.out.print("Массив: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
