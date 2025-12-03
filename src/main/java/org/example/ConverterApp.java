package org.example;

import java.util.Scanner;

public class ConverterApp {
     static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("--- Converter Menu ---");
            System.out.println("1. Currency Converter");
            System.out.println("2. Temperature Converter");
            System.out.println("3. Length Converter");
            System.out.println("0. Exit");
            System.out.print("Choose converter type: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> new CurrencyConverter().convert(scanner);
                case 2 -> new TemperatureConverter().convert(scanner);

                case 0 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}








