package org.example;
import java.util.Scanner;

public class TemperatureConverter {
    public void convert(Scanner scanner) {
        //menu
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");
        int option = scanner.nextInt();
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        double result = 0;
        String from = "", to = "";
// converter
        switch (option) {
            case 1 -> { result = (temp * 9/5) + 32; from = "°C"; to = "°F"; }
            case 2 -> { result = (temp - 32) * 5/9; from = "°F"; to = "°C"; }
            default -> System.out.println("Invalid option.");
        }
//results and time
        if (option == 1 || option == 2) {
            System.out.printf("Result: %.2f%s = %.2f%s\n", temp, from, result, to);
            System.out.println("Converted at: " + DateTime.getTimestamp());

        }
    }
}


