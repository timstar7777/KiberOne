package KiberHW;

import java.util.Arrays;
import java.util.Random;

public class Kiber1101HW {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};


        int[] myArray = createArrayWithRandomNumbers(10);
        System.out.println(Arrays.toString(myArray));
        System.out.println(sortArrayToOddNumbers(myArray));
    }

    public static int[] createArrayWithRandomNumbers(int lengthOfArray) {
        int[] arrayOfNumbers = new int[lengthOfArray];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            Random random = new Random();
            arrayOfNumbers[i] = random.nextInt(random.nextInt(1000));
        }
        return arrayOfNumbers;
    }
    public static int[] sortArrayToOddNumbers(int [] arrayOfNumbers){
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }
}