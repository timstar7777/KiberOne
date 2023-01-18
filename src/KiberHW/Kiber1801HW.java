package KiberHW;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Kiber1801HW {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};


        int[] myArray = createArrayWithRandomNumbers(10);
        System.out.println(Arrays.toString(myArray));
    }


    public static int[] createArrayWithRandomNumbers(int lengthOfArray) {
        int[] arrayOfNumbers = new int[lengthOfArray];



        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Random random = new Random();
            arrayOfNumbers[i] = random.nextInt(random.nextInt(100));
        }
        return arrayOfNumbers;
    }
    public static int[] findOutAverageNumberFromArray()

}