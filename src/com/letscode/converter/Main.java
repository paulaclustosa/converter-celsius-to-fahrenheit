package com.letscode.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner temperatureScan = new Scanner(System.in);

        final String ENTER_CELSIUS_MESSAGE = "Hello! \n" +
                "Please enter a temperature in Celsius so " +
                "the program can convert it to Fahrenheit: ";

        System.out.print(ENTER_CELSIUS_MESSAGE);

        float celsius = temperatureScan.nextFloat();

        System.out.printf("%.2f ºC = %.2f ºF",
                celsius,
                convertToFahrenheit(celsius));
    }

    public static float convertToFahrenheit(float celsius) {
        final float CONVERSION_FACTOR_FAHRENHEIT = 1.8f;
        final float INCREMENT_FAHRENHEIT = 32f;
        return (celsius * CONVERSION_FACTOR_FAHRENHEIT) + INCREMENT_FAHRENHEIT;
    }

}
