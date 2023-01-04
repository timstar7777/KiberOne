package KiberHW;

import java.util.Arrays;

public class Kiber0401HW {
    static int cube(int a){
        return a*a*a;
    }
    public static void main(String[] args) {
        int[]arrayOfNumbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arrayOfNumbers)); //вывод всех чисел


        System.out.println((cube(arrayOfNumbers[0])));
        System.out.println((cube(arrayOfNumbers[1])));
        System.out.println((cube(arrayOfNumbers[2])));       //квадрат каждого числа из массива
        System.out.println((cube(arrayOfNumbers[3])));
        System.out.println((cube(arrayOfNumbers[4])));

    }
}
