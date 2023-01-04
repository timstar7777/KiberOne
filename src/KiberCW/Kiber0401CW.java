package KiberCW;

import java.util.Arrays;
import java.util.Random;

public class Kiber0401CW {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5};

/*        arrayOfNumbers[0] = (int) Math.pow(arrayOfNumbers[0], 2);
        arrayOfNumbers[1] = (int) Math.pow(arrayOfNumbers[1], 2);
        arrayOfNumbers[2] = (int) Math.pow(arrayOfNumbers[2], 2);
        arrayOfNumbers[3]= (int) Math.pow(arrayOfNumbers[3], 2);
        arrayOfNumbers[4] = (int) Math.pow(arrayOfNumbers[4], 2);

        System.out.println(Arrays.toString(arrayOfNumbers));
                                                            */

/*        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = (int) Math.pow(arrayOfNumbers[i], 2);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
                                                            */

/*        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0)                  // вывод четных чисел
                System.out.println(arrayOfNumbers[i]);
        }
        */
/*        int sumOfNumbers = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sumOfNumbers += arrayOfNumbers[i];               // сумма чисел
        }
        System.out.println(sumOfNumbers);                    */

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
