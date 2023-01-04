package KiberHW;

import java.util.Arrays;

public class Kiber0401HW {
    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};
        System.out.println(arrayOfNumbers.length);

        System.out.println(Arrays.toString(arrayOfNumbers)); //вывод всех чисел


        System.out.println((square(arrayOfNumbers[0])));
        System.out.println((square(arrayOfNumbers[1])));
        System.out.println((square(arrayOfNumbers[2])));       //квадрат каждого числа из массива
        System.out.println((square(arrayOfNumbers[3])));
        System.out.println((square(arrayOfNumbers[4])));

    }
}
