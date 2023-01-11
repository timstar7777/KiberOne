package KiberCW;

import java.util.Scanner;

public class Training1101 {
    public static void main(String[] args) {
        System.out.println(compareMagnitudeOfNumbers(5, -8));


        System.out.println("Введите градусы по цельсию: ");
        Scanner scan = new Scanner(System.in);
        int userTemperatureInCelcius = scan.nextInt();
        System.out.println(userTemperatureInCelcius + " C = " + converterFromCelciusToFahrenheit(userTemperatureInCelcius) + " F ");
        System.out.println(userTemperatureInCelcius + " C = " + converterFromCelciusToKelvin(userTemperatureInCelcius) + " K ");
        // 10 C = 50 F
        // 10 C = 283 K
        // 10 C = 50 F
        // 10 C = 283 K
    }
    public static int converterFromCelciusToFahrenheit(int celcius) {
            return celcius * 9 / 5 + 32;
    }
    public static float converterFromCelciusToKelvin(int celcius) {
        return celcius + 273;
    }
    public static int compareMagnitudeOfNumbers(int firstNumber, int secondNumber) {
        if (Math.abs(firstNumber) > Math.abs(secondNumber)){
            return firstNumber;
        }  else {
            return secondNumber;
        }

    }
}
