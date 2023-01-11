package KiberCW;

import java.util.Scanner;

public class Training1101 {
    public static void main(String[] args) {
        System.out.println(converterFromCelciusToFahrenheit(10));


        System.out.println("Введите градусы по цельсию: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(converterFromCelciusToKelvin(number));

        // 10 C = 50 F
        // 10 C = 283 K
    }

    public static int converterFromCelciusToFahrenheit(int celcius) {
        return celcius * 9 / 5 + 32;
    }

    public static float converterFromCelciusToKelvin(int number) {
        return number + 273;
    }
}
