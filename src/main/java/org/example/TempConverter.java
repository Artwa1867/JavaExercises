package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        double c,f;

        Scanner scanner = new Scanner(System.in);

        DecimalFormat format = new DecimalFormat("#0.0");

        System.out.println("Enter the value in Fahrenheit: ");
        f = scanner.nextDouble();

        c = (5 * (f - 32)) / 9;

        System.out.println("Temperature in Celcius: " + format.format(c));

    }
}