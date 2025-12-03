package org.example;

import java.util.Scanner;


public class CurrencyConverter {
    public void convert(Scanner scanner) {
        // menu
        System.out.println("\n--- Currency Converter ---");
        System.out.println("1. SEK to USD");
        System.out.println("2. USD to SEK");
        System.out.println("3. SEK to EUR");
        System.out.println("4. EUR to SEK");
        System.out.print("Choose conversion: ");
        int option = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        double result = 0;
        String from = "", to = "";
// converter
        switch (option) {
            case 1 -> { result = amount * 0.092; from = "SEK"; to = "USD"; }
            case 2 -> { result = amount / 0.092; from = "USD"; to = "SEK"; }
            case 3 -> { result = amount * 0.088; from = "SEK"; to = "EUR"; }
            case 4 -> { result = amount / 0.088; from = "EUR"; to = "SEK"; }
            default -> System.out.println("Invalid option.");
        }
// time and results
        if (option >= 1 && option <= 4) {

            System.out.printf("Result: %.2f %s = %.2f %s\n", amount, from, result, to);
            System.out.println("Converted at: " + DateTime.getTimestamp());
        }
    }
}

